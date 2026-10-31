package p;

import android.net.Uri;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mts {
    public final g341 a;
    public final dms0 b;

    public mts(g341 g341Var, dms0 dms0Var) {
        this.a = g341Var;
        this.b = dms0Var;
    }

    public final Disposable a(String str) {
        return this.a.b(Uri.parse(str)).subscribe(new cfs(this, (byte) 6));
    }
}
