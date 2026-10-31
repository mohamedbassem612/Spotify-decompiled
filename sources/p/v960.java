package p;

import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class v960 {
    public static final FontWeight a = new FontWeight(1000);

    public static final void a(long j, long j2, long j3, String str, qim0 qim0Var, b0k b0kVar, int i) {
        String strC1;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1093235797);
        int i3 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.f(j2) ? 32 : 16) | (x340Var.f(j3) ? 256 : 128) | (x340Var.g(str) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            if (str.length() == 0) {
                strC1 = "";
            } else {
                strC1 = (str.length() != 1 || Character.isLetterOrDigit(str.charAt(0))) ? ihc1.c1(7, nhc1.V((7 / str.length()) + 1, str)) : ihc1.f1(nhc1.V(7, str.concat(" "))).toString();
            }
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).a;
            qim0 qim0VarR = i1p1.r(qim0Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = z860.c;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarR, (iu30) objT);
            boolean zI = ((i3 & 14) == 4) | x340Var.i(watVar) | x340Var.i(lee1Var) | x340Var.i(yae1VarQ) | x340Var.g(strC1) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                i2 = 0;
                t960 t960Var = new t960(j, watVar, lee1Var, yae1VarQ, strC1, j2, j3);
                x340Var.s0(t960Var);
                objT2 = t960Var;
            } else {
                i2 = 0;
            }
            j0o1.b(i2, x340Var, (iu30) objT2, qim0VarA);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u960(j, j2, j3, str, qim0Var, i);
        }
    }
}
