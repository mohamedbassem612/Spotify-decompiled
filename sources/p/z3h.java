package p;

import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z3h implements xq91 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z3h(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(yq91 yq91Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                aod aodVar = (aod) obj;
                ((p811) aodVar.b).a = smo1.e(((a4h) aodVar.c).c);
                break;
            case 1:
                break;
            default:
                try {
                    tzx tzxVar = (tzx) obj;
                    ((Handler) tzxVar.f).postDelayed(new xfz0(tzxVar, (byte) 15), 1000L);
                } catch (Exception e) {
                    Logger.d(l1d.m("Error while displaying permissions dialog: ", e.getMessage()), new Object[0]);
                }
                break;
        }
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                c9n c9nVar = (c9n) ((p811) ((aod) obj).b).a;
                if (c9nVar != null) {
                    smo1.p(c9nVar, (CancellationException) null);
                }
                break;
            case 1:
                ((sj21) obj).b.accept(li21.a);
                break;
            default:
                ((kt91) ((tzx) obj).b).i(this);
                break;
        }
    }

    private final void c(yq91 yq91Var) {
    }
}
