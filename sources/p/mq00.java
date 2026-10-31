package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mq00 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq00(String str, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, int i) {
        super(2);
        this.b = str;
        this.c = qim0Var;
        this.d = iu30Var;
        this.e = iu30Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int iC;
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                Object obj3 = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                qim0 qim0VarN = anm1.N("playlist_description_text_test_tag", this.c);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
                hzj.A.getClass();
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                yae1 yae1VarQ = d5p1.q(0, x340Var2, 1);
                flb0 flb0Var = (flb0) x340Var2.k(t4k.n);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var2).k;
                lee1 lee1Var2 = cbx.d(x340Var2).j;
                Object objT = x340Var2.T();
                if (objT == obj3) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                Object objT2 = x340Var2.T();
                if (objT2 == obj3) {
                    objT2 = bb00.h(0, x340Var2);
                }
                err0 err0Var = (hdn0) objT2;
                String strM = l1d.m("...", cwl1.o0(x340Var2, 2131962902));
                String strO0 = cwl1.o0(x340Var2, 2131962901);
                String str = this.b;
                boolean zG = x340Var2.g(str);
                Object objT3 = x340Var2.T();
                if (zG || objT3 == obj3) {
                    int i = af5.e;
                    objT3 = ob51.i(str, new pae1(new zma1(((vex) zex.a.b).j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438), (zma1) null, 14), new lq00(this.d, (byte) 0));
                    x340Var2.s0(objT3);
                }
                af5 af5Var = (af5) objT3;
                err0 err0Var2 = err0Var;
                boolean zE = x340Var2.e(err0Var2.s()) | x340Var2.g(str);
                Object objT4 = x340Var2.T();
                if (zE || objT4 == obj3) {
                    int iS = err0Var2.s();
                    if (iS < 0) {
                        sf80.a("width must be >= 0");
                    }
                    objT4 = yae1.b(yae1VarQ, af5Var, lee1Var2, 0, false, 0, jjl.h(iS, iS, 0, Integer.MAX_VALUE), flb0Var, (wat) null, (f930) null, 1852);
                    x340Var2.s0(objT4);
                }
                y9e1 y9e1Var = (y9e1) objT4;
                Object objT5 = x340Var2.T();
                if (objT5 == obj3) {
                    objT5 = Integer.valueOf((int) (yae1.a(yae1VarQ, strM.concat(" "), lee1Var, 0, false, 0, 0L, flb0Var, (xat) null, 956).c >> 32));
                    x340Var2.s0(objT5);
                }
                int iIntValue2 = ((Number) objT5).intValue();
                boolean zG2 = x340Var2.g(str) | x340Var2.e(err0Var2.s());
                Object objT6 = x340Var2.T();
                if (zG2 || objT6 == obj3) {
                    zrm0 zrm0Var = y9e1Var.b;
                    if (zrm0Var.f > 2) {
                        int i2 = (int) (y9e1Var.c >> 32);
                        iC = zrm0Var.c(1, true) - 1;
                        while (iC > 0 && i2 - y9e1Var.c(iC).c <= iIntValue2) {
                            iC--;
                        }
                    } else {
                        iC = 0;
                    }
                    objT6 = Integer.valueOf(iC);
                    x340Var2.s0(objT6);
                }
                int iIntValue3 = ((Number) objT6).intValue();
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var3 = cbx.d(x340Var2).j;
                long j = ((yex) zex.a.d).g;
                qim0 qim0VarZ = u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3);
                boolean zI = x340Var2.i(err0Var);
                Object objT7 = x340Var2.T();
                if (zI || objT7 == obj3) {
                    objT7 = new tu9(err0Var, (byte) 17);
                    x340Var2.s0(objT7);
                }
                qim0 qim0VarX = ern1.x(qim0VarZ, (iu30) objT7);
                cjc0 cjc0Var = new cjc0(((Boolean) ven0Var.getValue()).booleanValue() ? 99 : 2);
                ye5 ye5VarO = kk0.o(-555146186, x340Var2);
                boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                iu30 iu30Var = this.e;
                if (zBooleanValue || iIntValue3 <= 0 || iIntValue3 >= af5Var.b.length() || y9e1Var.b.f <= 2) {
                    z = false;
                    x340Var2.i0(292636901);
                    x340Var2.r(false);
                    ye5VarO.h(af5Var);
                } else {
                    x340Var2.i0(292243852);
                    ye5VarO.h(af5Var.f(0, iIntValue3));
                    boolean zI2 = x340Var2.i(ven0Var) | x340Var2.g(iu30Var);
                    Object objT8 = x340Var2.T();
                    if (zI2 || objT8 == obj3) {
                        objT8 = new gp0(iu30Var, ven0Var, (byte) 12);
                        x340Var2.s0(objT8);
                    }
                    iho1.e(ye5VarO, strM, (iu30) objT8, x340Var2, 56);
                    z = false;
                    x340Var2.r(false);
                }
                af5 af5VarP = ye5VarO.p();
                x340Var2.r(z);
                uwo1.d(af5VarP, j, qim0VarX, lee1Var3, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, (cqs0) null, x340Var2, 0, 0, 3760);
                if (y9e1Var.b.f <= 2 || !((Boolean) ven0Var.getValue()).booleanValue()) {
                    x340Var2.i0(-28336059);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-28779328);
                    tq60 tq60Var = new tq60(een.R0);
                    boolean zG3 = x340Var2.g(strO0);
                    Object objT9 = x340Var2.T();
                    if (zG3 || objT9 == obj3) {
                        objT9 = new kq00(strO0, (byte) 0);
                        x340Var2.s0(objT9);
                    }
                    qim0 qim0VarA = s161.a(tq60Var, (iu30) objT9);
                    ye5 ye5VarO2 = kk0.o(-555110792, x340Var2);
                    boolean zI3 = x340Var2.i(ven0Var) | x340Var2.g(iu30Var);
                    Object objT10 = x340Var2.T();
                    if (zI3 || objT10 == obj3) {
                        objT10 = new gp0(iu30Var, ven0Var, (byte) 13);
                        x340Var2.s0(objT10);
                    }
                    iho1.e(ye5VarO2, strO0, (iu30) objT10, x340Var2, 56);
                    af5 af5VarP2 = ye5VarO2.p();
                    x340Var2.r(false);
                    uwo1.f(af5VarP2, qim0VarA, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var2, 0, 0, 4092);
                    x340Var2.r(false);
                }
                x340Var2.r(true);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                iho1.f(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq00(qim0 qim0Var, String str, iu30 iu30Var, iu30 iu30Var2) {
        super(2);
        this.c = qim0Var;
        this.b = str;
        this.d = iu30Var;
        this.e = iu30Var2;
    }
}
