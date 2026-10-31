package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jrd implements w310 {
    public final Context a;
    public final rhh0 b;

    public jrd(Context context, uw0 uw0Var) {
        this.a = context;
        this.b = uw0Var.n(1);
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        return this.b.b(r9cVar).flatMap(new uk4(this, r9cVar, (byte) 6));
    }
}
