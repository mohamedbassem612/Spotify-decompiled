package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y211 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z211 b;

    public /* synthetic */ y211(z211 z211Var, byte b) {
        this.a = b;
        this.b = z211Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        z211 z211Var = this.b;
        switch (b) {
            case 0:
                z211Var.f.getClass();
                break;
            default:
                Throwable th = (Throwable) obj;
                Logger.e(th, i3a.j("Error while requesting Recommended Queries Section: ", th), new Object[0]);
                z211Var.f.getClass();
                break;
        }
    }
}
