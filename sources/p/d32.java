package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class d32 {
    public static final se11 a = new se11("\\{speed(?:Up|Down)Indicator\\}");

    public static final void a(vta1 vta1Var, qim0 qim0Var, fua1 fua1Var, b0k b0kVar, int i) {
        vta1 vta1Var2;
        qim0 qim0Var2;
        int i2;
        Object obj;
        String str;
        String str2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1845187589);
        int i3 = i | (b0kVar2.i(vta1Var) ? 4 : 2) | 48 | (b0kVar2.e(fua1Var == null ? -1 : fua1Var.ordinal()) ? 256 : 128);
        if (b0kVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            int iOrdinal = fua1Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    i2 = 2131962851;
                } else if (iOrdinal == 2) {
                    i2 = 2131962856;
                } else if (iOrdinal != 3) {
                    eg.o();
                    return;
                }
                String strN0 = cwl1.n0(i2, new Object[]{"{speedUpIndicator}", "{speedDownIndicator}"}, b0kVar2);
                String strO0 = cwl1.o0(b0kVar2, 2131962854);
                String strO1 = cwl1.o0(b0kVar2, 2131962853);
                String strN1 = cwl1.n0(i2, new Object[]{strO0, strO1}, b0kVar2);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar2).g;
                long jS = ((wat) b0kVar2.k(t4k.h)).s(12.0f);
                cqs0 cqs0VarT = mqo1.t(new mmr0[]{new mmr0("speedUpIndicator", new gh80(new d6t0(7, jS, jS), z4i.a)), new mmr0("speedDownIndicator", new gh80(new d6t0(7, jS, jS), z4i.b))});
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarZ = uyn1.z(24.0f, 0.0f, 2, voo1.y(u291.f(qim0Var3, 1.0f), voo1.g));
                mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
                hzj.A.getClass();
                if (((x340) b0kVar2).a == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(hmb0.t1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(mbhVarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                qim0Var2 = qim0Var3;
                Object obj2 = "{speedDownIndicator}";
                String str3 = strO1;
                String str4 = "speedDownIndicator";
                uwo1.e(cwl1.o0(b0kVar2, 2131962855), uyn1.B(qim0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), cbx.d(b0kVar2).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2024);
                ye5 ye5Var = new ye5();
                nh40 nh40Var = new nh40(se11.b(a, strN0));
                int i4 = 0;
                while (nh40Var.hasNext()) {
                    mbh0 mbh0Var = (mbh0) nh40Var.next();
                    ye5Var.g(strN0.substring(i4, ((rr80) mbh0Var.b()).a));
                    String strGroup = mbh0Var.a.group();
                    if (strGroup.equals("{speedUpIndicator}")) {
                        z6p1.r(ye5Var, "speedUpIndicator", strO0);
                        obj = obj2;
                    } else {
                        obj = obj2;
                        if (strGroup.equals(obj)) {
                            str = str3;
                            str2 = str4;
                            z6p1.r(ye5Var, str2, str);
                        }
                        i4 = ((rr80) mbh0Var.b()).b + 1;
                        str3 = str;
                        obj2 = obj;
                        str4 = str2;
                    }
                    str = str3;
                    str2 = str4;
                    i4 = ((rr80) mbh0Var.b()).b + 1;
                    str3 = str;
                    obj2 = obj;
                    str4 = str2;
                }
                ye5Var.g(strN0.substring(i4));
                af5 af5VarP = ye5Var.p();
                uwr uwrVar2 = cbx.a;
                lee1 lee1VarA = lee1.a(cbx.d(b0kVar2).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
                long j = cbx.a(b0kVar2).b.b;
                qim0 qim0VarB = uyn1.B(qim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                boolean zG = b0kVar2.g(strN1);
                Object objT = b0kVar2.T();
                if (zG || objT == fkj0.X) {
                    objT = new v1(strN1, (byte) 17);
                    b0kVar2.s0(objT);
                }
                uwo1.d(af5VarP, j, s161.a(qim0VarB, (iu30) objT), lee1VarA, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, cqs0VarT, b0kVar2, 0, 0, 2016);
                b0kVar2 = b0kVar2;
                vta1Var2 = vta1Var;
                foo1.c(new gbx(z50.c, vta1Var2), new idx(4), uyn1.B(qim0Var2, 0.0f, 24.0f, 0.0f, 8.0f, 5), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, z4i.c, b0kVar2, 0, 48, 2040);
                b0kVar2.r(true);
            }
            hhg1.o(fua1Var, "Unsupported disclosure variant: ");
            return;
        }
        vta1Var2 = vta1Var;
        b0kVar2.b0();
        qim0Var2 = qim0Var;
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new q1(vta1Var2, qim0Var2, fua1Var, i, (byte) 24);
        }
    }
}
