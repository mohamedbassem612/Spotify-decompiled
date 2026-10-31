package p;

import android.content.Context;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.crashreporting.anrwatchdog.anrwatchdogruntime.a;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Optional;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iyo0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iyo0(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                if (((kyo0) obj3).B) {
                    ((MobiusLoop) obj2).a(new mwz(((owo0) obj).e()));
                }
                return rih1Var;
            case 1:
                e6p0 e6p0Var = (e6p0) obj2;
                w7h1 w7h1Var = (w7h1) obj;
                ou80 ou80Var = e6p0Var.Y.m(w7h1Var, (xj61) null).a;
                e6p0Var.Z.a(w7h1Var, ou80Var);
                fn31.T(cto1.q(e6p0Var), (o8n) null, 0, new wkk0(e6p0Var, (wqn0) obj3, ou80Var, null, (byte) 21), 3);
                return rih1Var;
            case 2:
                return new km0((be91) ((ibp0) obj3).invoke(), (crd) ((ibp0) obj2).invoke(), (q8n) ((ibp0) obj).invoke());
            case 3:
                return new km0((trd1) ((pbp0) obj3).invoke(), (qr20) ((pbp0) obj2).invoke(), (q8n) ((pbp0) obj).invoke());
            case 4:
                return new mg5((lw21) ((vcp0) obj3).invoke(), (kly0) ((zap0) obj2).invoke(), (q8n) ((vcp0) obj).invoke());
            case 5:
                return new a((q8n) ((mdp0) obj2).invoke(), (kly0) ((zap0) obj3).invoke(), ((zap0) obj).b.c());
            case 6:
                oab1 oab1VarC = ((zap0) obj3).b.c();
                q8n q8nVar = (q8n) ((tap0) obj2).invoke();
                return new mg5(oab1VarC, q8nVar, new dt0(new pg5(q8nVar, ((ry9) obj).b.c, oab1VarC), (lnm) null, (byte) 9));
            case 7:
                return new km0((cn5) ((vcp0) obj3).invoke(), (bfs) ((vcp0) obj2).invoke(), (Scheduler) ((vcp0) obj).invoke());
            case 8:
                return new yo5((xo5) ((qbp0) obj3).invoke(), (odb0) ((qbp0) obj2).invoke(), (Observable) ((qbp0) obj).invoke());
            case 9:
                return new i48((g48) ((edp0) obj3).invoke(), (Observable) ((ycp0) obj2).invoke(), (Scheduler) ((edp0) obj).invoke());
            case 10:
                return new km0((wbh) ((sbp0) obj3).invoke(), (Flowable) ((sbp0) obj2).invoke(), (Scheduler) ((sbp0) obj).invoke());
            case 11:
                return new x0r((np60) ((y52) obj3).invoke(), (w25) ((fdp0) obj2).invoke(), (xvo) ((fdp0) obj).invoke());
            case 12:
                return new g9r((j9r) ((xcp0) obj3).invoke(), (CallbackRouter) ((ycp0) obj2).invoke(), (oc4) ((xcp0) obj).invoke());
            case 13:
                return new km0((wpu) ((sbp0) obj3).invoke(), (Scheduler) ((sbp0) obj2).invoke(), (Observable) ((sbp0) obj).invoke());
            case 14:
                return new twu((gw70) ((fdp0) obj3).invoke(), (kly0) ((hbp0) obj2).invoke(), (q8n) ((fdp0) obj).invoke());
            case 15:
                return new r2v((kly0) ((hbp0) obj3).invoke(), (kly0) ((hbp0) obj2).invoke(), (q8n) ((fdp0) obj).invoke());
            case 16:
                return new av40((Context) ((bbp0) obj3).invoke(), ((uv40) ((nap0) obj2).b).a, (q8n) ((bbp0) obj).invoke());
            case 17:
                return new km0((lmy0) ((ubp0) obj3).invoke(), ((obp0) obj2).b.u2, (q8n) ((ubp0) obj).invoke());
            case 18:
                ((bbp0) obj3).invoke();
                ((bbp0) obj2).invoke();
                ((Boolean) ((bbp0) obj).invoke()).getClass();
                return new xo70();
            case 19:
                return new mtt(new d2k((c9c0) ((ubp0) obj3).invoke(), (xx91) ((ubp0) obj2).invoke(), (wy90) ((ubp0) obj).invoke()));
            case 20:
                return new vld0((zip0) ((fdp0) obj3).invoke(), (q3s0) ((fdp0) obj2).invoke(), (q8n) ((fdp0) obj).invoke());
            case 21:
                ov20 ov20Var = (ov20) ((fdp0) obj3).invoke();
                return new lre0(new nzf(ov20Var), (ybg) ((gdp0) obj2).invoke(), new zud0(new jg4((luk) ((gdp0) obj).invoke()), (byte) 3));
            case 22:
                return new km0(((sap0) obj3).b.d(), (lmy0) ((zcp0) obj2).invoke(), (t2j0) ((zcp0) obj).invoke());
            case 23:
                return new k0i0((dma1) ((wbp0) obj3).invoke(), ((obp0) obj2).b.n3, (q8n) ((wbp0) obj).invoke());
            case 24:
                return new c2n0((o241) ((wbp0) obj3).invoke(), (Scheduler) ((wbp0) obj2).invoke(), (u3c) ((wbp0) obj).invoke());
            case 25:
                jlg jlgVar = (jlg) ((bbp0) obj3).invoke();
                ((xap0) obj2).invoke();
                return new h2n0(jlgVar, (Optional) ((bbp0) obj).invoke());
            case 26:
                luk lukVar = (luk) ((xbp0) obj3).invoke();
                k4q0 k4q0Var = (k4q0) ((xbp0) obj2).invoke();
                q8n q8nVar2 = (q8n) ((xbp0) obj).invoke();
                c8o.l(k4q0Var);
                c8o.l(lukVar);
                xn4 xn4Var = new xn4(false, lukVar);
                c8o.l(q8nVar2);
                return new mg5(k4q0Var, xn4Var, q8nVar2);
            case 27:
                return new g9r((Flowable) ((xbp0) obj3).invoke(), ((ybp0) obj2).b.C2, (q8n) ((xbp0) obj).invoke());
            case 28:
                return new g9r((Flowable) ((gcp0) obj3).invoke(), (g0l) ((gcp0) obj2).invoke(), (kt91) ((gcp0) obj).invoke());
            default:
                return new w6u0(((ybp0) obj3).b.h2, ((ybp0) obj2).b.V2, (q8n) ((dcp0) obj).invoke());
        }
    }
}
