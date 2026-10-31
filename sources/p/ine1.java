package p;

import com.spotify.wrapped.v1.proto.AudioPreview;
import com.spotify.wrapped.v1.proto.Paragraph;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class ine1 {
    public static final void a(wj31 wj31Var, ArrayList arrayList, jfe jfeVar, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        h311 h311VarV;
        bne1 bne1Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-264998057);
        int i2 = (b0kVar3.i(wj31Var) ? 4 : 2) | i | (b0kVar3.i(arrayList) ? 32 : 16) | (b0kVar3.i(jfeVar) ? 256 : 128) | (b0kVar3.h(z) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            if (wj31Var == null) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    bne1Var = new bne1(wj31Var, arrayList, jfeVar, z, qim0Var, i, (byte) 0);
                }
            } else {
                b0kVar2 = b0kVar3;
                w2g0.c(qim0Var, een.h, apo.r(1933599809, new tf(wj31Var, z, jfeVar, arrayList, (byte) 29), b0kVar3), b0kVar2, 3126, 4);
            }
            h311VarV.d = bne1Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            bne1Var = new bne1(wj31Var, arrayList, jfeVar, z, qim0Var, i, (byte) 1);
            h311VarV.d = bne1Var;
        }
    }

    public static final void b(int i, xgm1 xgm1Var, b0k b0kVar, int i2) {
        int i3;
        xgm1 xgm1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-734859654);
        int i4 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(xgm1Var) ? 32 : 16);
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            egm1 egm1Var = ((wgm1) rwq.h(xgm1Var.getState(), x340Var, 0).getValue()).c;
            Integer numValueOf = Integer.valueOf(i);
            boolean zI = x340Var.i(egm1Var) | ((i4 & 14) == 4) | x340Var.i(xgm1Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                i3 = i;
                xgm1Var2 = xgm1Var;
                nf6 nf6Var = new nf6(egm1Var, i3, xgm1Var2, null, (byte) 1);
                x340Var.s0(nf6Var);
                objT = nf6Var;
            } else {
                i3 = i;
                xgm1Var2 = xgm1Var;
            }
            qxd0.s(numValueOf, egm1Var, (vu30) objT, x340Var);
        } else {
            i3 = i;
            xgm1Var2 = xgm1Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new of6(i3, xgm1Var2, i2, (byte) 1);
        }
    }

    public static final void c(h290 h290Var, int i, String str, String str2, Paragraph paragraph, String str3, xtb0 xtb0Var, float f, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var;
        Object gne1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2068903486);
        int i3 = i2 | (x340Var2.g(h290Var) ? 4 : 2) | (x340Var2.e(i) ? 32 : 16) | (x340Var2.g(str) ? 256 : 128) | (x340Var2.g(str2) ? 2048 : 1024) | (x340Var2.g(paragraph) ? 16384 : 8192) | (x340Var2.g(str3) ? 131072 : 65536) | (x340Var2.g(xtb0Var) ? 1048576 : 524288) | (x340Var2.d(f) ? 8388608 : 4194304) | (x340Var2.i(iu30Var) ? 67108864 : 33554432) | (x340Var2.g(qim0Var) ? 536870912 : 268435456);
        if (x340Var2.Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            long j = u7h.j;
            long jE = ror0.e(j, str);
            long jE2 = ror0.e(j, str2);
            vnr0 vnr0VarA = shy0.a(paragraph, x340Var2);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var2).d;
            float f2 = zjy.p(0.0f, new p3v((f / 2.0f) - 32.0f)).a;
            int i4 = i3 & 14;
            int i5 = i3 & 112;
            int i6 = i3 & 234881024;
            boolean z = ((i3 & 458752) == 131072) | (i4 == 4) | (i5 == 32) | (i6 == 67108864);
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new cne1(str3, h290Var, i, iu30Var);
                x340Var2.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0Var, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            zzq0 zzq0VarH = uyn1.h(2, f2, 0.0f);
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            fra fraVar = een.N0;
            boolean zF = (i4 == 4) | (i5 == 32) | (i6 == 67108864) | x340Var2.f(jE) | x340Var2.f(jE2) | x340Var2.i(vnr0VarA);
            Object objT2 = x340Var2.T();
            if (zF || objT2 == m4cVar) {
                gne1Var = new gne1(h290Var, i, iu30Var, jE, jE2, vnr0VarA);
                x340Var2.s0(gne1Var);
            } else {
                gne1Var = objT2;
            }
            ujo1.e(qim0VarF, xtb0Var, zzq0VarH, d36Var, fraVar, (iq20) null, false, (hxq0) null, (iu30) gne1Var, x340Var2, ((i3 >> 15) & 112) | 196614, 456);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hne1(h290Var, i, str, str2, paragraph, str3, xtb0Var, f, iu30Var, qim0Var, i2);
        }
    }

    public static final ven0 d(String str, int i, rk41 rk41Var, boolean z, b0k b0kVar, int i2) {
        ilv.a.getClass();
        return zod.S(new hsi1(str, Float.valueOf(0.0f), Float.valueOf(1.0f), new pxg1(700, i, flv.g), rno1.a), rk41Var.a, z, (Function0) null, b0kVar, 8 | ((i2 >> 3) & 896), 8);
    }

    public static final void e(SceneTemplate.TimeMachineContent.Card2.YearEntry yearEntry, xgm1 xgm1Var) {
        if (!yearEntry.w() || yearEntry.n().getUrl().length() <= 0) {
            return;
        }
        AudioPreview audioPreviewN = yearEntry.n();
        xgm1Var.a(new lgm1(audioPreviewN.getUrl(), u3k.m(audioPreviewN), u3k.j(audioPreviewN)));
    }
}
