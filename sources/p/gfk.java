package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gfk extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ffk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gfk(ffk ffkVar, byte b) {
        super(3);
        this.a = b;
        this.b = ffkVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var;
        b0k b0kVar;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        ffk ffkVar = this.b;
        switch (b) {
            case 0:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarR = u291.r(nim0Var, 48.0f);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar2).f;
                qim0 qim0VarQ = i1p1.q(qim0VarR, er31.b(4.0f));
                String str = ffkVar.d;
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
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
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                if (str.length() > 0) {
                    x340Var3.i0(1433365597);
                    qim0 qim0VarR2 = u291.r(nim0Var, 48.0f);
                    Uri uri = Uri.parse(str);
                    nkx nkxVar = nkx.c;
                    nux nuxVar = new nux(nkxVar, nkxVar);
                    b0kVar = b0kVar2;
                    x340Var = x340Var3;
                    eso1.e(uri, isl.a, qim0VarR2, (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar, 1073741872, 0, 3512);
                    x340Var.r(false);
                } else {
                    x340Var = x340Var3;
                    b0kVar = b0kVar2;
                    x340Var.i0(1433660934);
                    x340Var.r(false);
                }
                ton1.f(2, 2131102457, 3072, 0, ffkVar.e, ffkVar.f, b0kVar, u291.r(h2c.a.a(nim0Var, graVar), 48.0f));
                x340Var.r(true);
                return rih1Var;
            case 1:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = ffkVar.c;
                if (str2 == null) {
                    str2 = "";
                }
                uwo1.e(str2, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return rih1Var;
            default:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(gfh0VarC2, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                uwo1.e(ffkVar.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                x340Var6.r(true);
                return rih1Var;
        }
    }
}
