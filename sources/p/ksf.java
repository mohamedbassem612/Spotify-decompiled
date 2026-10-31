package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ksf extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ u7h b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksf(String str, u7h u7hVar) {
        super(2);
        this.c = str;
        this.b = u7hVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        nim0 nim0Var = nim0.a;
        u7h u7hVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = x340Var2.g(str);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new irf(str, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarA = s161.a(nim0Var, (iu30) objT);
                    if (u7hVar != null) {
                        x340Var2.i0(-865997253);
                        String strO0 = cwl1.o0(x340Var2, 2131956898);
                        uwr uwrVar = cbx.a;
                        uwo1.e(strO0, qim0VarA, cbx.d(x340Var2).k, u7hVar.a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-865783880);
                        String strO1 = cwl1.o0(x340Var2, 2131956898);
                        uwr uwrVar2 = cbx.a;
                        uwo1.e(strO1, qim0VarA, cbx.d(x340Var2).k, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarS = u291.s(nim0Var, u7hVar == null ? 84.5f : 96.5f, 97.5f);
                    gfh0 gfh0VarC = t1c.c(een.t, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarS);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(hmb0.t1);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    boolean zG2 = x340Var4.g(str);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = Uri.parse(str);
                        x340Var4.s0(objT2);
                    }
                    objT2.getClass();
                    Uri uri = (Uri) objT2;
                    qim0 qim0VarN = anm1.N("fan_event_redemption_image", u291.s(nim0Var, 84.5f, 97.5f));
                    h6m h6mVar = mif1.Q0;
                    isl islVar = isl.a;
                    eso1.e(uri, islVar, qim0VarN, (p3v) null, (zvx) null, (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var4, 224304, 0, 3456);
                    if (u7hVar == null) {
                        x340Var4.i0(-1481532028);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-1481532027);
                        long j = u7hVar.a;
                        klx klxVar = klx.c;
                        qim0 qim0VarA2 = h2c.a.a(nim0Var, een.Y);
                        uwr uwrVar3 = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var4).g;
                        w0h1.a(klxVar, islVar, anm1.N("fan_event_redemption_badge", u291.r(qim0VarA2, 48.0f)), j, 0L, false, x340Var4, klx.d | 48, 48);
                        x340Var4.r(false);
                    }
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksf(u7h u7hVar, String str) {
        super(2);
        this.b = u7hVar;
        this.c = str;
    }
}
