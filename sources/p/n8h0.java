package p;

import androidx.compose.ui.text.font.FontWeight;
import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class n8h0 {
    public static final FontWeight a = new FontWeight(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER);

    public static final void a(long j, long j2, long j3, String str, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1733324839);
        if ((i & 3072) == 0) {
            i2 = (x340Var.g(str) ? 2048 : 1024) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (x340Var.g(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            String strC1 = str.length() == 0 ? "" : ihc1.c1(7, nhc1.V((7 / str.length()) + 1, str));
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).a;
            qim0 qim0VarF = dug.f(i1p1.r(qim0Var), j, d4o1.a);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = s4h0.X0;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarB = h2c.a.b(nim0.a);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = s4h0.Y0;
                x340Var.s0(objT2);
            }
            qim0 qim0VarC = i541.C(qim0VarB, (iu30) objT2);
            boolean zG = x340Var.g(watVar) | x340Var.g(lee1Var) | x340Var.g(yae1VarQ) | x340Var.g(strC1);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                m3f0 m3f0Var = new m3f0(watVar, lee1Var, yae1VarQ, strC1, j2, j3);
                x340Var.s0(m3f0Var);
                objT3 = m3f0Var;
            }
            j0o1.b(0, x340Var, (iu30) objT3, qim0VarC);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m8h0(j, j2, j3, str, qim0Var, i);
        }
    }
}
