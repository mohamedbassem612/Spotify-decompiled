package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c7w0 {
    public final Context a;
    public final Single b = Single.fromCallable(new sra(this, (byte) 16));

    public c7w0(Context context) {
        this.a = context;
    }

    public final Single a() {
        return this.b;
    }
}
