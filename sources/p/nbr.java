package p;

import android.content.Intent;
import android.net.Uri;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nbr {
    public final Single a;
    public final CompositeDisposable b = new CompositeDisposable();

    public nbr(Single single) {
        this.a = single;
    }

    public final void a(Intent intent, Uri uri) {
        if (intent == null || !(intent.getBooleanExtra("is_internal_navigation", false) || intent.getBooleanExtra("forwarded_by_login_flow", false))) {
            this.b.b(this.a.subscribe(new a21(intent, uri, (byte) 28)));
        }
    }
}
