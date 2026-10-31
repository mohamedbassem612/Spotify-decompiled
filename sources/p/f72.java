package p;

import android.view.View;
import android.webkit.CookieManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Connection;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f72 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f72(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                g72 g72Var = (g72) obj;
                g72Var.g.d(g72Var.X);
                break;
            case 1:
                ((yh2) obj).f.g();
                break;
            case 2:
                pi3 pi3Var = (pi3) obj;
                pi3Var.c2 = ki3.c;
                pi3Var.l1();
                break;
            case 3:
                try {
                    ((zwe0) obj).b.e.invoke();
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 4:
                ((a1r0) ((em0) obj).b).g();
                break;
            case 5:
                ((ram0) obj).dispose();
                break;
            case 6:
                noa noaVar = (noa) obj;
                noaVar.I1 = true;
                noaVar.A1 = null;
                noaVar.G1.dispose();
                smo1.p(noaVar.E1, (CancellationException) null);
                break;
            case 7:
                ((lzn0) ((o9h) obj).a.c).e();
                break;
            case 8:
                ((inm) obj).g.onNext(Boolean.TRUE);
                break;
            case 9:
                ((CookieManager) obj).removeExpiredCookie();
                break;
            case 10:
                cfr cfrVar = (cfr) obj;
                dg30 dg30Var = cfrVar.a;
                dg30 dg30Var2 = dg30Var instanceof dg30 ? dg30Var : null;
                if (dg30Var2 != null) {
                    fn31.T(cto1.q(dg30Var2), (o8n) null, 0, new p1r(cfrVar, dg30Var2, (lnm) null, (byte) 1), 3);
                    break;
                }
                break;
            case 11:
                ((mnr) obj).c.set(false);
                break;
            case 12:
                ((k0s) obj).a.B0();
                break;
            case 13:
                ((Connection) obj).dispose();
                break;
            case 14:
                ((ayh) obj).m0((Object) null);
                break;
            case 15:
                ((Runnable) obj).run();
                break;
            case 16:
                ((m0w) obj).c.set(false);
                break;
            case 17:
                azw azwVar = ((yww) obj).b;
                if (azwVar != null) {
                    ryn1.z(azwVar.e);
                }
                break;
            case 18:
                kt91 kt91Var = ((s9x) obj).d;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959442});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", 2131959442, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                if (!kt91Var.g()) {
                    kt91Var.o(er91Var);
                } else {
                    kt91Var.k(er91Var);
                }
                break;
            case 19:
                ((s700) obj).dismiss();
                break;
            case 20:
                ((p900) obj).c.set(false);
                break;
            case 21:
                fc00 fc00Var = (fc00) obj;
                fc00Var.f.accept(Boolean.TRUE);
                fc00Var.c.a();
                break;
            case 22:
                ((yc40) obj).a.V0.onNext(new vp81(f0r0.c));
                break;
            case 23:
                ((o9n1) ((l7m0) obj).b).h();
                break;
            case 24:
                ((fn60) obj).b = "";
                break;
            case 25:
                ((c580) obj).a.q0(false);
                break;
            case 26:
                ((aia0) obj).d();
                break;
            case 27:
                hma1 hma1VarEdit = ((m1c0) obj).d.edit();
                xxy0.a.getClass();
                hma1VarEdit.f(wxy0.b);
                hma1VarEdit.g();
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                hma1 hma1VarEdit2 = ((q3c0) obj).h.a.edit();
                hma1VarEdit2.a(o5y.c, true);
                hma1VarEdit2.h();
                break;
            default:
                Logger.b("[LiveSharing] Pausing playback.", new Object[0]);
                xqd0 xqd0Var = (xqd0) ((w2h) obj).d;
                xqd0Var.h.a(xqd0Var.i).a().a(new d9u0("googlemeet", false)).subscribeOn(xqd0Var.c).subscribe();
                break;
        }
    }
}
