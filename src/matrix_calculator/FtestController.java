/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FtestController implements Initializable {

    @FXML
    private Button Add, sub, mult, inv, rref, up, low, free, xs, bs, vsum, vsub, vmult;
    @FXML
    private TextField a00, a01, a02, a03, a04, a05, a10, a11, a12, a13, a14, a15, a20, a21, a22, a23, a24, a25;
    @FXML
    private TextField a30, a31, a32, a33, a34, a35, a40, a41, a42, a43, a44, a45, a50, a51, a52, a53, a54, a55;
    @FXML
    private TextField b00, b01, b02, b03, b04, b05, b10, b11, b12, b13, b14, b15, b20, b21, b22, b23, b24, b25;
    @FXML
    private TextField b30, b31, b32, b33, b34, b35, b40, b41, b42, b43, b44, b45, b50, b51, b52, b53, b54, b55;
    @FXML
    private TextField c00, c01, c02, c03, c04, c05, c10, c11, c12, c13, c14, c15, c20, c21, c22, c23, c24, c25;
    @FXML
    private TextField c30, c31, c32, c33, c34, c35, c40, c41, c42, c43, c44, c45, c50, c51, c52, c53, c54, c55;
    @FXML
    private TextField d00, d01, d02, d03, d04, d05, d10, d11, d12, d13, d14, d15, d20, d21, d22, d23, d24, d25;
    @FXML
    private TextField d30, d31, d32, d33, d34, d35, d40, d41, d42, d43, d44, d45, d50, d51, d52, d53, d54, d55;
    @FXML
    private TextField e00, e01, e02, e03, e04, e05;
    @FXML
    private TextField f00, f01, f02, f03, f04, f05;
    @FXML
    private TextField g00, g01, g02, g03, g04, g05;
    @FXML
    private TextArea out1, out2, out3, out4;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void VSUM(ActionEvent event) {
        Vectors i = new Vectors();
        out4.setText(i.output(i.add(MF(), MG())));
    }

    @FXML
    private void VSUB(ActionEvent event) {
        Vectors i = new Vectors();
        out4.setText(i.output(i.sub(MF(), MG())));
    }

    @FXML
    private void VMULT(ActionEvent event) {
        Vectors i = new Vectors();
        out4.setText(i.product(MF(), MG()) + "");
    }

    @FXML
    private void BS(ActionEvent event) {
        solutions i = new solutions();
        out3.setText(i.Voutput(i.BSolution(MD(), ME())));
    }

    @FXML
    private void XS(ActionEvent event) {
        solutions i = new solutions();
        out3.setText(i.Voutput(i.XSolution(MD(), ME())));
    }

    @FXML
    private void Inversion(ActionEvent event) {
        Adv_Mopp i = new Adv_Mopp();
        out2.setText(i.output(i.invers(MC())));
    }

    @FXML
    private void Rref(ActionEvent event) {
        Adv_Mopp i = new Adv_Mopp();
        out2.setText(i.output(i.Rref(MC())));
    }

    @FXML
    private void U(ActionEvent event) {
        Adv_Mopp i = new Adv_Mopp();
        out2.setText(i.output(i.Edown(MC())));
    }

    @FXML
    private void L(ActionEvent event) {
        Adv_Mopp i = new Adv_Mopp();
        out2.setText(i.output(i.Eup(MC())));
    }

    @FXML
    private void FreeCol(ActionEvent event) {
        Adv_Mopp i = new Adv_Mopp();
        out2.setText(i.output(i.freeColumns(MC())));
    }

    @FXML
    private void Multiplication(ActionEvent event) {
        basic_Mopp i = new basic_Mopp();
        out1.setText(i.output(i.mult(MA(), MB())));
    }

    @FXML
    private void MatrixAddition(ActionEvent event) {
        basic_Mopp i = new basic_Mopp();
        out1.setText(i.output(i.add(MA(), MB())));
    }

    @FXML
    private void subtract(ActionEvent event) {
        basic_Mopp i = new basic_Mopp();
        out1.setText(i.output(i.sub(MA(), MB())));
    }

    private double[][] MA() {
        double[][] a = new double[6][6];
        if (a00.getText() == null || a00.getText().trim().isEmpty()) {
            a[0][0] = 0;
        } else {
            a[0][0] = Double.parseDouble(a00.getText());
        }
        if (a01.getText() == null || a01.getText().trim().isEmpty()) {
            a[0][1] = 0;
        } else {
            a[0][1] = Double.parseDouble(a01.getText());
        }
        if (a02.getText() == null || a02.getText().trim().isEmpty()) {
            a[0][2] = 0;
        } else {
            a[0][2] = Double.parseDouble(a02.getText());
        }
        if (a03.getText() == null || a03.getText().trim().isEmpty()) {
            a[0][3] = 0;
        } else {
            a[0][3] = Double.parseDouble(a03.getText());
        }
        if (a04.getText() == null || a04.getText().trim().isEmpty()) {
            a[0][4] = 0;
        } else {
            a[0][4] = Double.parseDouble(a04.getText());
        }
        if (a05.getText() == null || a05.getText().trim().isEmpty()) {
            a[0][5] = 0;
        } else {
            a[0][5] = Double.parseDouble(a05.getText());
        }
        if (a10.getText() == null || a10.getText().trim().isEmpty()) {
            a[1][0] = 0;
        } else {
            a[1][0] = Double.parseDouble(a10.getText());
        }
        if (a11.getText() == null || a11.getText().trim().isEmpty()) {
            a[1][1] = 0;
        } else {
            a[1][1] = Double.parseDouble(a11.getText());
        }
        if (a12.getText() == null || a12.getText().trim().isEmpty()) {
            a[1][2] = 0;
        } else {
            a[1][2] = Double.parseDouble(a12.getText());
        }
        if (a13.getText() == null || a13.getText().trim().isEmpty()) {
            a[1][3] = 0;
        } else {
            a[1][3] = Double.parseDouble(a13.getText());
        }
        if (a14.getText() == null || a14.getText().trim().isEmpty()) {
            a[1][4] = 0;
        } else {
            a[1][4] = Double.parseDouble(a14.getText());
        }
        if (a15.getText() == null || a15.getText().trim().isEmpty()) {
            a[1][5] = 0;
        } else {
            a[1][5] = Double.parseDouble(a15.getText());
        }
        if (a20.getText() == null || a20.getText().trim().isEmpty()) {
            a[2][0] = 0;
        } else {
            a[2][0] = Double.parseDouble(a20.getText());
        }
        if (a21.getText() == null || a21.getText().trim().isEmpty()) {
            a[2][1] = 0;
        } else {
            a[2][1] = Double.parseDouble(a21.getText());
        }
        if (a22.getText() == null || a22.getText().trim().isEmpty()) {
            a[2][2] = 0;
        } else {
            a[2][2] = Double.parseDouble(a22.getText());
        }
        if (a23.getText() == null || a23.getText().trim().isEmpty()) {
            a[2][3] = 0;
        } else {
            a[2][3] = Double.parseDouble(a23.getText());
        }
        if (a24.getText() == null || a24.getText().trim().isEmpty()) {
            a[2][4] = 0;
        } else {
            a[2][4] = Double.parseDouble(a24.getText());
        }
        if (a25.getText() == null || a25.getText().trim().isEmpty()) {
            a[2][5] = 0;
        } else {
            a[2][5] = Double.parseDouble(a25.getText());
        }
        if (a30.getText() == null || a30.getText().trim().isEmpty()) {
            a[3][0] = 0;
        } else {
            a[3][0] = Double.parseDouble(a30.getText());
        }
        if (a31.getText() == null || a31.getText().trim().isEmpty()) {
            a[3][1] = 0;
        } else {
            a[3][1] = Double.parseDouble(a31.getText());
        }
        if (a32.getText() == null || a32.getText().trim().isEmpty()) {
            a[3][2] = 0;
        } else {
            a[3][2] = Double.parseDouble(a32.getText());
        }
        if (a33.getText() == null || a33.getText().trim().isEmpty()) {
            a[3][3] = 0;
        } else {
            a[3][3] = Double.parseDouble(a33.getText());
        }
        if (a34.getText() == null || a34.getText().trim().isEmpty()) {
            a[3][4] = 0;
        } else {
            a[3][4] = Double.parseDouble(a34.getText());
        }
        if (a35.getText() == null || a35.getText().trim().isEmpty()) {
            a[3][5] = 0;
        } else {
            a[3][5] = Double.parseDouble(a35.getText());
        }
        if (a40.getText() == null || a40.getText().trim().isEmpty()) {
            a[4][0] = 0;
        } else {
            a[4][0] = Double.parseDouble(a40.getText());
        }
        if (a41.getText() == null || a41.getText().trim().isEmpty()) {
            a[4][1] = 0;
        } else {
            a[4][1] = Double.parseDouble(a41.getText());
        }
        if (a42.getText() == null || a42.getText().trim().isEmpty()) {
            a[4][2] = 0;
        } else {
            a[4][2] = Double.parseDouble(a42.getText());
        }
        if (a43.getText() == null || a43.getText().trim().isEmpty()) {
            a[4][3] = 0;
        } else {
            a[4][3] = Double.parseDouble(a43.getText());
        }
        if (a44.getText() == null || a44.getText().trim().isEmpty()) {
            a[4][4] = 0;
        } else {
            a[4][4] = Double.parseDouble(a44.getText());
        }
        if (a45.getText() == null || a45.getText().trim().isEmpty()) {
            a[4][5] = 0;
        } else {
            a[4][5] = Double.parseDouble(a45.getText());
        }
        if (a50.getText() == null || a50.getText().trim().isEmpty()) {
            a[5][0] = 0;
        } else {
            a[5][0] = Double.parseDouble(a50.getText());
        }
        if (a51.getText() == null || a51.getText().trim().isEmpty()) {
            a[5][1] = 0;
        } else {
            a[5][1] = Double.parseDouble(a51.getText());
        }
        if (a52.getText() == null || a52.getText().trim().isEmpty()) {
            a[5][2] = 0;
        } else {
            a[5][2] = Double.parseDouble(a52.getText());
        }
        if (a53.getText() == null || a53.getText().trim().isEmpty()) {
            a[5][3] = 0;
        } else {
            a[5][3] = Double.parseDouble(a53.getText());
        }
        if (a54.getText() == null || a54.getText().trim().isEmpty()) {
            a[5][4] = 0;
        } else {
            a[5][4] = Double.parseDouble(a54.getText());
        }
        if (a55.getText() == null || a55.getText().trim().isEmpty()) {
            a[5][5] = 0;
        } else {
            a[5][5] = Double.parseDouble(a55.getText());
        }
        return a;
    }

    private double[][] MB() {
        double[][] b = new double[6][6];
        if (b00.getText() == null || b00.getText().trim().isEmpty()) {
            b[0][0] = 0;
        } else {
            b[0][0] = Double.parseDouble(b00.getText());
        }
        if (b01.getText() == null || b01.getText().trim().isEmpty()) {
            b[0][1] = 0;
        } else {
            b[0][1] = Double.parseDouble(b01.getText());
        }
        if (b02.getText() == null || b02.getText().trim().isEmpty()) {
            b[0][2] = 0;
        } else {
            b[0][2] = Double.parseDouble(b02.getText());
        }
        if (b03.getText() == null || b03.getText().trim().isEmpty()) {
            b[0][3] = 0;
        } else {
            b[0][3] = Double.parseDouble(b03.getText());
        }
        if (b04.getText() == null || b04.getText().trim().isEmpty()) {
            b[0][4] = 0;
        } else {
            b[0][4] = Double.parseDouble(b04.getText());
        }
        if (b05.getText() == null || b05.getText().trim().isEmpty()) {
            b[0][5] = 0;
        } else {
            b[0][5] = Double.parseDouble(b05.getText());
        }
        if (b10.getText() == null || b10.getText().trim().isEmpty()) {
            b[1][0] = 0;
        } else {
            b[1][0] = Double.parseDouble(b10.getText());
        }
        if (b11.getText() == null || b11.getText().trim().isEmpty()) {
            b[1][1] = 0;
        } else {
            b[1][1] = Double.parseDouble(b11.getText());
        }
        if (b12.getText() == null || b12.getText().trim().isEmpty()) {
            b[1][2] = 0;
        } else {
            b[1][2] = Double.parseDouble(b12.getText());
        }
        if (b13.getText() == null || b13.getText().trim().isEmpty()) {
            b[1][3] = 0;
        } else {
            b[1][3] = Double.parseDouble(b13.getText());
        }
        if (b14.getText() == null || b14.getText().trim().isEmpty()) {
            b[1][4] = 0;
        } else {
            b[1][4] = Double.parseDouble(b14.getText());
        }
        if (b15.getText() == null || b15.getText().trim().isEmpty()) {
            b[1][5] = 0;
        } else {
            b[1][5] = Double.parseDouble(b15.getText());
        }
        if (b20.getText() == null || b20.getText().trim().isEmpty()) {
            b[2][0] = 0;
        } else {
            b[2][0] = Double.parseDouble(b20.getText());
        }
        if (b21.getText() == null || b21.getText().trim().isEmpty()) {
            b[2][1] = 0;
        } else {
            b[2][1] = Double.parseDouble(b21.getText());
        }
        if (b22.getText() == null || b22.getText().trim().isEmpty()) {
            b[2][2] = 0;
        } else {
            b[2][2] = Double.parseDouble(b22.getText());
        }
        if (b23.getText() == null || b23.getText().trim().isEmpty()) {
            b[2][3] = 0;
        } else {
            b[2][3] = Double.parseDouble(b23.getText());
        }
        if (b24.getText() == null || b24.getText().trim().isEmpty()) {
            b[2][4] = 0;
        } else {
            b[2][4] = Double.parseDouble(b24.getText());
        }
        if (b25.getText() == null || b25.getText().trim().isEmpty()) {
            b[2][5] = 0;
        } else {
            b[2][5] = Double.parseDouble(b25.getText());
        }
        if (b30.getText() == null || b30.getText().trim().isEmpty()) {
            b[3][0] = 0;
        } else {
            b[3][0] = Double.parseDouble(b30.getText());
        }
        if (b31.getText() == null || b31.getText().trim().isEmpty()) {
            b[3][1] = 0;
        } else {
            b[3][1] = Double.parseDouble(b31.getText());
        }
        if (b32.getText() == null || b32.getText().trim().isEmpty()) {
            b[3][2] = 0;
        } else {
            b[3][2] = Double.parseDouble(b32.getText());
        }
        if (b33.getText() == null || b33.getText().trim().isEmpty()) {
            b[3][3] = 0;
        } else {
            b[3][3] = Double.parseDouble(b33.getText());
        }
        if (b34.getText() == null || b34.getText().trim().isEmpty()) {
            b[3][4] = 0;
        } else {
            b[3][4] = Double.parseDouble(b34.getText());
        }
        if (b35.getText() == null || b35.getText().trim().isEmpty()) {
            b[3][5] = 0;
        } else {
            b[3][5] = Double.parseDouble(b35.getText());
        }
        if (b40.getText() == null || b40.getText().trim().isEmpty()) {
            b[4][0] = 0;
        } else {
            b[4][0] = Double.parseDouble(b40.getText());
        }
        if (b41.getText() == null || b41.getText().trim().isEmpty()) {
            b[4][1] = 0;
        } else {
            b[4][1] = Double.parseDouble(b41.getText());
        }
        if (b42.getText() == null || b42.getText().trim().isEmpty()) {
            b[4][2] = 0;
        } else {
            b[4][2] = Double.parseDouble(b42.getText());
        }
        if (b43.getText() == null || b43.getText().trim().isEmpty()) {
            b[4][3] = 0;
        } else {
            b[4][3] = Double.parseDouble(b43.getText());
        }
        if (b44.getText() == null || b44.getText().trim().isEmpty()) {
            b[4][4] = 0;
        } else {
            b[4][4] = Double.parseDouble(b44.getText());
        }
        if (b45.getText() == null || b45.getText().trim().isEmpty()) {
            b[4][5] = 0;
        } else {
            b[4][5] = Double.parseDouble(b45.getText());
        }
        if (b50.getText() == null || b50.getText().trim().isEmpty()) {
            b[5][0] = 0;
        } else {
            b[5][0] = Double.parseDouble(b50.getText());
        }
        if (b51.getText() == null || b51.getText().trim().isEmpty()) {
            b[5][1] = 0;
        } else {
            b[5][1] = Double.parseDouble(b51.getText());
        }
        if (b52.getText() == null || b52.getText().trim().isEmpty()) {
            b[5][2] = 0;
        } else {
            b[5][2] = Double.parseDouble(b52.getText());
        }
        if (b53.getText() == null || b53.getText().trim().isEmpty()) {
            b[5][3] = 0;
        } else {
            b[5][3] = Double.parseDouble(b53.getText());
        }
        if (b54.getText() == null || b54.getText().trim().isEmpty()) {
            b[5][4] = 0;
        } else {
            b[5][4] = Double.parseDouble(b54.getText());
        }
        if (b55.getText() == null || b55.getText().trim().isEmpty()) {
            b[5][5] = 0;
        } else {
            b[5][5] = Double.parseDouble(b55.getText());
        }
        return b;
    }

    private double[][] MC() {
        double[][] c = new double[6][6];
        if (c00.getText() == null || c00.getText().trim().isEmpty()) {
            c[0][0] = 0;
        } else {
            c[0][0] = Double.parseDouble(c00.getText());
        }
        if (c01.getText() == null || c01.getText().trim().isEmpty()) {
            c[0][1] = 0;
        } else {
            c[0][1] = Double.parseDouble(c01.getText());
        }
        if (c02.getText() == null || c02.getText().trim().isEmpty()) {
            c[0][2] = 0;
        } else {
            c[0][2] = Double.parseDouble(c02.getText());
        }
        if (c03.getText() == null || c03.getText().trim().isEmpty()) {
            c[0][3] = 0;
        } else {
            c[0][3] = Double.parseDouble(c03.getText());
        }
        if (c04.getText() == null || c04.getText().trim().isEmpty()) {
            c[0][4] = 0;
        } else {
            c[0][4] = Double.parseDouble(c04.getText());
        }
        if (c05.getText() == null || c05.getText().trim().isEmpty()) {
            c[0][5] = 0;
        } else {
            c[0][5] = Double.parseDouble(c05.getText());
        }
        if (c10.getText() == null || c10.getText().trim().isEmpty()) {
            c[1][0] = 0;
        } else {
            c[1][0] = Double.parseDouble(c10.getText());
        }
        if (c11.getText() == null || c11.getText().trim().isEmpty()) {
            c[1][1] = 0;
        } else {
            c[1][1] = Double.parseDouble(c11.getText());
        }
        if (c12.getText() == null || c12.getText().trim().isEmpty()) {
            c[1][2] = 0;
        } else {
            c[1][2] = Double.parseDouble(c12.getText());
        }
        if (c13.getText() == null || c13.getText().trim().isEmpty()) {
            c[1][3] = 0;
        } else {
            c[1][3] = Double.parseDouble(c13.getText());
        }
        if (c14.getText() == null || c14.getText().trim().isEmpty()) {
            c[1][4] = 0;
        } else {
            c[1][4] = Double.parseDouble(c14.getText());
        }
        if (c15.getText() == null || c15.getText().trim().isEmpty()) {
            c[1][5] = 0;
        } else {
            c[1][5] = Double.parseDouble(c15.getText());
        }
        if (c20.getText() == null || c20.getText().trim().isEmpty()) {
            c[2][0] = 0;
        } else {
            c[2][0] = Double.parseDouble(c20.getText());
        }
        if (c21.getText() == null || c21.getText().trim().isEmpty()) {
            c[2][1] = 0;
        } else {
            c[2][1] = Double.parseDouble(c21.getText());
        }
        if (c22.getText() == null || c22.getText().trim().isEmpty()) {
            c[2][2] = 0;
        } else {
            c[2][2] = Double.parseDouble(c22.getText());
        }
        if (c23.getText() == null || c23.getText().trim().isEmpty()) {
            c[2][3] = 0;
        } else {
            c[2][3] = Double.parseDouble(c23.getText());
        }
        if (c24.getText() == null || c24.getText().trim().isEmpty()) {
            c[2][4] = 0;
        } else {
            c[2][4] = Double.parseDouble(c24.getText());
        }
        if (c25.getText() == null || c25.getText().trim().isEmpty()) {
            c[2][5] = 0;
        } else {
            c[2][5] = Double.parseDouble(c25.getText());
        }
        if (c30.getText() == null || c30.getText().trim().isEmpty()) {
            c[3][0] = 0;
        } else {
            c[3][0] = Double.parseDouble(c30.getText());
        }
        if (c31.getText() == null || c31.getText().trim().isEmpty()) {
            c[3][1] = 0;
        } else {
            c[3][1] = Double.parseDouble(c31.getText());
        }
        if (c32.getText() == null || c32.getText().trim().isEmpty()) {
            c[3][2] = 0;
        } else {
            c[3][2] = Double.parseDouble(c32.getText());
        }
        if (c33.getText() == null || c33.getText().trim().isEmpty()) {
            c[3][3] = 0;
        } else {
            c[3][3] = Double.parseDouble(c33.getText());
        }
        if (c34.getText() == null || c34.getText().trim().isEmpty()) {
            c[3][4] = 0;
        } else {
            c[3][4] = Double.parseDouble(c34.getText());
        }
        if (c35.getText() == null || c35.getText().trim().isEmpty()) {
            c[3][5] = 0;
        } else {
            c[3][5] = Double.parseDouble(c35.getText());
        }
        if (c40.getText() == null || c40.getText().trim().isEmpty()) {
            c[4][0] = 0;
        } else {
            c[4][0] = Double.parseDouble(c40.getText());
        }
        if (c41.getText() == null || c41.getText().trim().isEmpty()) {
            c[4][1] = 0;
        } else {
            c[4][1] = Double.parseDouble(c41.getText());
        }
        if (c42.getText() == null || c42.getText().trim().isEmpty()) {
            c[4][2] = 0;
        } else {
            c[4][2] = Double.parseDouble(c42.getText());
        }
        if (c43.getText() == null || c43.getText().trim().isEmpty()) {
            c[4][3] = 0;
        } else {
            c[4][3] = Double.parseDouble(c43.getText());
        }
        if (c44.getText() == null || c44.getText().trim().isEmpty()) {
            c[4][4] = 0;
        } else {
            c[4][4] = Double.parseDouble(c44.getText());
        }
        if (c45.getText() == null || c45.getText().trim().isEmpty()) {
            c[4][5] = 0;
        } else {
            c[4][5] = Double.parseDouble(c45.getText());
        }
        if (c50.getText() == null || c50.getText().trim().isEmpty()) {
            c[5][0] = 0;
        } else {
            c[5][0] = Double.parseDouble(c50.getText());
        }
        if (c51.getText() == null || c51.getText().trim().isEmpty()) {
            c[5][1] = 0;
        } else {
            c[5][1] = Double.parseDouble(c51.getText());
        }
        if (c52.getText() == null || c52.getText().trim().isEmpty()) {
            c[5][2] = 0;
        } else {
            c[5][2] = Double.parseDouble(c52.getText());
        }
        if (c53.getText() == null || c53.getText().trim().isEmpty()) {
            c[5][3] = 0;
        } else {
            c[5][3] = Double.parseDouble(c53.getText());
        }
        if (c54.getText() == null || c54.getText().trim().isEmpty()) {
            c[5][4] = 0;
        } else {
            c[5][4] = Double.parseDouble(c54.getText());
        }
        if (c55.getText() == null || c55.getText().trim().isEmpty()) {
            c[5][5] = 0;
        } else {
            c[5][5] = Double.parseDouble(c55.getText());
        }
        return c;
    }

    private double[][] MD() {
        double[][] d = new double[6][6];
        if (d00.getText() == null || d00.getText().trim().isEmpty()) {
            d[0][0] = 0;
        } else {
            d[0][0] = Double.parseDouble(d00.getText());
        }
        if (d01.getText() == null || d01.getText().trim().isEmpty()) {
            d[0][1] = 0;
        } else {
            d[0][1] = Double.parseDouble(d01.getText());
        }
        if (d02.getText() == null || d02.getText().trim().isEmpty()) {
            d[0][2] = 0;
        } else {
            d[0][2] = Double.parseDouble(d02.getText());
        }
        if (d03.getText() == null || d03.getText().trim().isEmpty()) {
            d[0][3] = 0;
        } else {
            d[0][3] = Double.parseDouble(d03.getText());
        }
        if (d04.getText() == null || d04.getText().trim().isEmpty()) {
            d[0][4] = 0;
        } else {
            d[0][4] = Double.parseDouble(d04.getText());
        }
        if (d05.getText() == null || d05.getText().trim().isEmpty()) {
            d[0][5] = 0;
        } else {
            d[0][5] = Double.parseDouble(d05.getText());
        }
        if (d10.getText() == null || d10.getText().trim().isEmpty()) {
            d[1][0] = 0;
        } else {
            d[1][0] = Double.parseDouble(d10.getText());
        }
        if (d11.getText() == null || d11.getText().trim().isEmpty()) {
            d[1][1] = 0;
        } else {
            d[1][1] = Double.parseDouble(d11.getText());
        }
        if (d12.getText() == null || d12.getText().trim().isEmpty()) {
            d[1][2] = 0;
        } else {
            d[1][2] = Double.parseDouble(d12.getText());
        }
        if (d13.getText() == null || d13.getText().trim().isEmpty()) {
            d[1][3] = 0;
        } else {
            d[1][3] = Double.parseDouble(d13.getText());
        }
        if (d14.getText() == null || d14.getText().trim().isEmpty()) {
            d[1][4] = 0;
        } else {
            d[1][4] = Double.parseDouble(d14.getText());
        }
        if (d15.getText() == null || d15.getText().trim().isEmpty()) {
            d[1][5] = 0;
        } else {
            d[1][5] = Double.parseDouble(d15.getText());
        }
        if (d20.getText() == null || d20.getText().trim().isEmpty()) {
            d[2][0] = 0;
        } else {
            d[2][0] = Double.parseDouble(d20.getText());
        }
        if (d21.getText() == null || d21.getText().trim().isEmpty()) {
            d[2][1] = 0;
        } else {
            d[2][1] = Double.parseDouble(d21.getText());
        }
        if (d22.getText() == null || d22.getText().trim().isEmpty()) {
            d[2][2] = 0;
        } else {
            d[2][2] = Double.parseDouble(d22.getText());
        }
        if (d23.getText() == null || d23.getText().trim().isEmpty()) {
            d[2][3] = 0;
        } else {
            d[2][3] = Double.parseDouble(d23.getText());
        }
        if (d24.getText() == null || d24.getText().trim().isEmpty()) {
            d[2][4] = 0;
        } else {
            d[2][4] = Double.parseDouble(d24.getText());
        }
        if (d25.getText() == null || d25.getText().trim().isEmpty()) {
            d[2][5] = 0;
        } else {
            d[2][5] = Double.parseDouble(d25.getText());
        }
        if (d30.getText() == null || d30.getText().trim().isEmpty()) {
            d[3][0] = 0;
        } else {
            d[3][0] = Double.parseDouble(d30.getText());
        }
        if (d31.getText() == null || d31.getText().trim().isEmpty()) {
            d[3][1] = 0;
        } else {
            d[3][1] = Double.parseDouble(d31.getText());
        }
        if (d32.getText() == null || d32.getText().trim().isEmpty()) {
            d[3][2] = 0;
        } else {
            d[3][2] = Double.parseDouble(d32.getText());
        }
        if (d33.getText() == null || d33.getText().trim().isEmpty()) {
            d[3][3] = 0;
        } else {
            d[3][3] = Double.parseDouble(d33.getText());
        }
        if (d34.getText() == null || d34.getText().trim().isEmpty()) {
            d[3][4] = 0;
        } else {
            d[3][4] = Double.parseDouble(d34.getText());
        }
        if (d35.getText() == null || d35.getText().trim().isEmpty()) {
            d[3][5] = 0;
        } else {
            d[3][5] = Double.parseDouble(d35.getText());
        }
        if (d40.getText() == null || d40.getText().trim().isEmpty()) {
            d[4][0] = 0;
        } else {
            d[4][0] = Double.parseDouble(d40.getText());
        }
        if (d41.getText() == null || d41.getText().trim().isEmpty()) {
            d[4][1] = 0;
        } else {
            d[4][1] = Double.parseDouble(d41.getText());
        }
        if (d42.getText() == null || d42.getText().trim().isEmpty()) {
            d[4][2] = 0;
        } else {
            d[4][2] = Double.parseDouble(d42.getText());
        }
        if (d43.getText() == null || d43.getText().trim().isEmpty()) {
            d[4][3] = 0;
        } else {
            d[4][3] = Double.parseDouble(d43.getText());
        }
        if (d44.getText() == null || d44.getText().trim().isEmpty()) {
            d[4][4] = 0;
        } else {
            d[4][4] = Double.parseDouble(d44.getText());
        }
        if (d45.getText() == null || d45.getText().trim().isEmpty()) {
            d[4][5] = 0;
        } else {
            d[4][5] = Double.parseDouble(d45.getText());
        }
        if (d50.getText() == null || d50.getText().trim().isEmpty()) {
            d[5][0] = 0;
        } else {
            d[5][0] = Double.parseDouble(d50.getText());
        }
        if (d51.getText() == null || d51.getText().trim().isEmpty()) {
            d[5][1] = 0;
        } else {
            d[5][1] = Double.parseDouble(d51.getText());
        }
        if (d52.getText() == null || d52.getText().trim().isEmpty()) {
            d[5][2] = 0;
        } else {
            d[5][2] = Double.parseDouble(d52.getText());
        }
        if (d53.getText() == null || d53.getText().trim().isEmpty()) {
            d[5][3] = 0;
        } else {
            d[5][3] = Double.parseDouble(d53.getText());
        }
        if (d54.getText() == null || d54.getText().trim().isEmpty()) {
            d[5][4] = 0;
        } else {
            d[5][4] = Double.parseDouble(d54.getText());
        }
        if (d55.getText() == null || d55.getText().trim().isEmpty()) {
            d[5][5] = 0;
        } else {
            d[5][5] = Double.parseDouble(d55.getText());
        }
        return d;
    }

    private double[] ME() {
        double[] e = new double[6];
        if (e00.getText() == null || e00.getText().trim().isEmpty()) {
            e[0] = 0;
        } else {
            e[0] = Double.parseDouble(e00.getText());
        }
        if (e01.getText() == null || e01.getText().trim().isEmpty()) {
            e[1] = 0;
        } else {
            e[1] = Double.parseDouble(e01.getText());
        }
        if (e02.getText() == null || e02.getText().trim().isEmpty()) {
            e[2] = 0;
        } else {
            e[2] = Double.parseDouble(e02.getText());
        }
        if (e03.getText() == null || e03.getText().trim().isEmpty()) {
            e[3] = 0;
        } else {
            e[3] = Double.parseDouble(e03.getText());
        }
        if (e04.getText() == null || e04.getText().trim().isEmpty()) {
            e[4] = 0;
        } else {
            e[4] = Double.parseDouble(e04.getText());
        }
        if (e05.getText() == null || e05.getText().trim().isEmpty()) {
            e[5] = 0;
        } else {
            e[5] = Double.parseDouble(e05.getText());
        }
        return e;
    }

    private double[] MF() {
        double[] f = new double[6];
        if (f00.getText() == null || f00.getText().trim().isEmpty()) {
            f[0] = 0;
        } else {
            f[0] = Double.parseDouble(f00.getText());
        }
        if (f01.getText() == null || f01.getText().trim().isEmpty()) {
            f[1] = 0;
        } else {
            f[1] = Double.parseDouble(f01.getText());
        }
        if (f02.getText() == null || f02.getText().trim().isEmpty()) {
            f[2] = 0;
        } else {
            f[2] = Double.parseDouble(f02.getText());
        }
        if (f03.getText() == null || f03.getText().trim().isEmpty()) {
            f[3] = 0;
        } else {
            f[3] = Double.parseDouble(f03.getText());
        }
        if (f04.getText() == null || f04.getText().trim().isEmpty()) {
            f[4] = 0;
        } else {
            f[4] = Double.parseDouble(f04.getText());
        }
        if (f05.getText() == null || f05.getText().trim().isEmpty()) {
            f[5] = 0;
        } else {
            f[5] = Double.parseDouble(f05.getText());
        }
        return f;
    }

    private double[] MG() {
        double[] g = new double[6];
        if (g00.getText() == null || g00.getText().trim().isEmpty()) {
            g[0] = 0;
        } else {
            g[0] = Double.parseDouble(g00.getText());
        }
        if (g01.getText() == null || g01.getText().trim().isEmpty()) {
            g[1] = 0;
        } else {
            g[1] = Double.parseDouble(g01.getText());
        }
        if (g02.getText() == null || g02.getText().trim().isEmpty()) {
            g[2] = 0;
        } else {
            g[2] = Double.parseDouble(g02.getText());
        }
        if (g03.getText() == null || g03.getText().trim().isEmpty()) {
            g[3] = 0;
        } else {
            g[3] = Double.parseDouble(g03.getText());
        }
        if (g04.getText() == null || g04.getText().trim().isEmpty()) {
            g[4] = 0;
        } else {
            g[4] = Double.parseDouble(g04.getText());
        }
        if (g05.getText() == null || g05.getText().trim().isEmpty()) {
            g[5] = 0;
        } else {
            g[5] = Double.parseDouble(g05.getText());
        }
        return g;
    }

}
