package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zm5 implements Action {
    public static final zm5 b = new zm5(0);
    public static final zm5 c = new zm5(1);
    public static final zm5 d = new zm5(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ zm5(byte b2) {
        this.a = b2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                an5.a().set(2);
                break;
            case 1:
                Logger.g("Resolver Async fetch attempt succeeded", new Object[0]);
                break;
        }
    }

    private final void a() {
    }
}
