package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kqk extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kqk(pqk pqkVar, byte b) {
        super(3);
        this.a = b;
        this.b = pqkVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        tl3 tl3Var;
        b0k b0kVar;
        x340 x340Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pqk pqkVar = this.b;
        switch (b) {
            case 0:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarQ = i1p1.q(u291.r(nim0Var, 48.0f), er31.b(4.0f));
                tl3 tl3Var2 = een.d;
                gfh0 gfh0VarC = t1c.c(tl3Var2, false);
                x340 x340Var2 = (x340) b0kVar2;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarQ);
                hzj.A.getClass();
                x340 x340Var3 = (x340) b0kVar2;
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
                nko1.H(gfh0VarC, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                String str2 = pqkVar.i;
                if (str2 != null) {
                    x340Var3.i0(251602511);
                    qim0 qim0VarR = u291.r(nim0Var, 48.0f);
                    Uri uri = Uri.parse(str2);
                    nkx nkxVar = nkx.c;
                    b0kVar = b0kVar2;
                    x340Var = x340Var3;
                    str = str2;
                    tl3Var = tl3Var2;
                    eso1.e(uri, isl.a, qim0VarR, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, b0kVar, 1073766448, 0, 3560);
                    x340Var.r(false);
                } else {
                    str = str2;
                    tl3Var = tl3Var2;
                    b0kVar = b0kVar2;
                    x340Var = x340Var3;
                    x340Var.i0(251883433);
                    x340Var.r(false);
                }
                qim0 qim0VarR2 = u291.r(h2c.a.a(nim0Var, tl3Var), 48.0f);
                ton1.f(2, str != null ? 2131102457 : 2131101167, 3072, 0, pqkVar.f, pqkVar.g, b0kVar, qim0VarR2);
                x340Var.r(true);
                return rih1Var;
            case 1:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str3 = pqkVar.e;
                cjc0 cjc0Var = new cjc0(1);
                uwr uwrVar = cbx.a;
                uwo1.e(str3, (qim0) null, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, b0kVar3, 0, 0, 1714);
                return rih1Var;
            default:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str4 = pqkVar.d;
                cjc0 cjc0Var2 = new cjc0(1);
                uwr uwrVar2 = cbx.a;
                uwo1.e(str4, (qim0) null, cbx.d(b0kVar4).g, cbx.a(b0kVar4).b.a, (a0e1) null, (iu30) null, 2, false, cjc0Var2, 0, (qx8) null, b0kVar4, 0, 0, 1714);
                return rih1Var;
        }
    }
}
