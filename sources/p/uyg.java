package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uyg extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyg(long j, boolean z) {
        super(3);
        this.a = (byte) 3;
        this.c = j;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mmr0 mmr0Var;
        qim0 qim0VarD;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        long j = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV = u291.v(nim0Var, 52.0f);
                uwr uwrVar = cbx.a;
                mta mtaVar = cbx.b(b0kVar).d;
                t1c.a(i3p1.E(i1p1.q(u291.h(qim0VarV, 32.0f), er31.a), z, j), b0kVar, 0);
                return rih1Var;
            case 1:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV2 = u291.v(nim0Var, 120.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                qim0 qim0VarH = u291.h(qim0VarV2, 16.0f);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                t1c.a(i3p1.E(i1p1.q(qim0VarH, er31.b(8.0f)), z, j), b0kVar2, 0);
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarB = uyn1.B(nim0.a, 16.0f, 12.0f, 0.0f, 0.0f, 12);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (z) {
                    x340Var3.i0(-1166702831);
                    uwr uwrVar3 = cbx.a;
                    mmr0Var = new mmr0(cbx.d(x340Var).m, new p3v(2.0f));
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-1166641296);
                    uwr uwrVar4 = cbx.a;
                    mmr0Var = new mmr0(cbx.d(x340Var).j, new p3v(4.0f));
                    x340Var3.r(false);
                }
                lee1 lee1Var = (lee1) mmr0Var.a;
                w6d1.d(sap1.r(j), (qim0) null, (u7h) null, lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, "tnum", 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777151), 0L, bth.d, ((p3v) mmr0Var.b).a, bth.c, (djc0) null, 0, x340Var, 12779520, 790);
                x340Var3.r(true);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                x340 x340Var4 = (b0k) obj2;
                x340Var4.i0(-10071386);
                qim0 qim0VarN = anm1.N("MediumPreviewAudioUI", (qim0) obj);
                uwr uwrVar5 = cbx.a;
                cua cuaVar = cbx.b(x340Var4).f;
                qim0 qim0VarQ = i1p1.q(qim0VarN, er31.b(8.0f));
                if (z) {
                    cbx.a.getClass();
                    qim0VarD = u291.f(d7e.r(uwr.d().a, qim0VarQ, true), 1.0f);
                } else {
                    qim0VarD = u291.d(qim0VarQ, 1.0f);
                }
                qim0 qim0VarF = dug.f(qim0VarD, j, d4o1.a);
                x340Var4.r(false);
                return qim0VarF;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyg(boolean z, long j) {
        super(3);
        this.a = (byte) 2;
        this.b = z;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uyg(boolean z, long j, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = j;
    }
}
