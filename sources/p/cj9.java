package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cj9 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cj9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void accept(Object obj) throws NoWhenBranchMatchedException {
        Object value;
        pir pirVar;
        r0i0 r0i0Var = null;
        switch (this.a) {
            case 0:
                pi9 pi9Var = (pi9) obj;
                sir sirVar = (sir) this.b;
                if (sirVar.b.isEnabled()) {
                    bpb1 bpb1Var = sirVar.c;
                    do {
                        value = bpb1Var.getValue();
                        pirVar = (pir) value;
                    } while (!bpb1Var.k(value, pir.a(pirVar, 0, pirVar.c + 1, 0, 0, 0, 0, NativeMediaProcessor.PROCESS_SAMPLE_RESULT_NEGATIVE_SEGMENT_COUNT)));
                }
                ((xir) this.c).e.onNext(new he9(pi9Var.a, pi9Var.b, pi9Var.c));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                Logger.e(th, "[CMP] - Error loading webtoken for One Trust", new Object[0]);
                fta.o((fta) this.b).n(((Uri) this.c).toString(), "Error loading webtoken: " + th.getLocalizedMessage());
                break;
            case 2:
                r981 r981Var = (s981) obj;
                lou louVar = (lou) this.c;
                mou mouVar = (mou) this.b;
                if (r981Var instanceof r981) {
                    louVar.b().s();
                    r0i0Var = r981Var.a;
                    ((ivr) louVar.a().b.getValue()).b.c.q(r0i0Var);
                } else if (!(r981Var instanceof q981)) {
                    eg.o();
                }
                mouVar.f(r0i0Var);
                break;
            case 3:
                r0i0 r0i0Var2 = (r0i0) obj;
                h1i0 h1i0Var = (h1i0) this.b;
                y490 y490Var = (y490) this.c;
                h1i0Var.getClass();
                h1i0Var.g = r0i0Var2.e == mgz.c ? r0i0Var2 : null;
                y490Var.l(r0i0Var2);
                break;
            case 4:
                jn41 jn41Var = (ln41) obj;
                if (jn41Var instanceof jn41) {
                    ((iu30) this.b).invoke(jn41Var.a);
                } else if (!(jn41Var instanceof kn41)) {
                    eg.o();
                } else {
                    ((Function0) this.c).invoke();
                }
                break;
            case 5:
                aa80 aa80Var = (aa80) obj;
                int i = aa80Var.a;
                hvq0 hvq0Var = (hvq0) aa80Var.b;
                pvq0 pvq0Var = (pvq0) this.b;
                pvq0Var.b(hvq0Var.b());
                pvq0Var.setOverlayDisplayMode(hvq0Var.a());
                if (i == 0 && g2z.s((g2z) this.c).a() && hvq0Var.a() == ivq0.a) {
                    pvq0Var.a(false);
                } else {
                    pvq0Var.c(true);
                }
                break;
            case 6:
                String str = (String) obj;
                Logger.g("Go: Playback action handled successfully", new Object[0]);
                tvt0 tvt0Var = (tvt0) this.b;
                t8r0 t8r0VarC = tvt0.c(tvt0Var);
                hkt0 hkt0Var = (hkt0) this.c;
                String str2 = v1p1.g(hkt0Var).c;
                long jB = ((yqg) t8r0VarC.b).b();
                hma1 hma1VarEdit = ((dma1) t8r0VarC.a).edit();
                String strConcat = "last_tap_usage_timestamp_".concat(nhc1.W(str2, " ", "_").toLowerCase(Locale.ROOT));
                nbc nbcVar = bma1.b;
                hma1VarEdit.c(nbcVar.n(strConcat), jB);
                hma1VarEdit.c(nbcVar.n("last_tap_usage_timestamp_global"), jB);
                hma1VarEdit.g();
                yfu yfuVarA = tvt0.a(tvt0Var);
                String strD = hkt0Var.d();
                if (strD == null) {
                    strD = "";
                }
                yfu.p(yfuVarA, strD, hkt0Var.c(), hkt0Var.b(), hkt0Var.e(), hkt0Var.a(), "COMPLETED", (String) null, str, 64);
                break;
            default:
                kz50 kz50Var = (kz50) this.b;
                ((rm5) kz50Var.g).D(((mta) kz50Var.c).w() - ((AtomicLong) kz50Var.f).get(), (x020) this.c, (sy21) obj);
                break;
        }
    }
}
