package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zfu0 implements Consumer {
    public static final zfu0 a = new zfu0();

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to update list items", new Object[0]);
    }
}
