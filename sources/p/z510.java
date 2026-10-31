package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z510 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r9c b;

    public /* synthetic */ z510(r9c r9cVar, byte b) {
        this.a = b;
        this.b = r9cVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        r9c r9cVar = this.b;
        switch (b) {
            case 0:
                Logger.e((Throwable) obj, "Error loading data for browser params, " + r9cVar, new Object[0]);
                break;
            default:
                Logger.e((Throwable) obj, "Error loading data for browser params, " + r9cVar, new Object[0]);
                break;
        }
    }
}
