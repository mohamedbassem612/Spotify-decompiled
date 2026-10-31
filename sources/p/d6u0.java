package p;

import android.net.Uri;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d6u0 implements lxh0 {
    public final /* synthetic */ e6u0 a;

    public d6u0(e6u0 e6u0Var) {
        this.a = e6u0Var;
    }

    @Override // p.lxh0
    public final Completable a(long j, String str) {
        return this.a.a(new z5u0(j));
    }

    @Override // p.lxh0
    public final Completable b(String str, Uri uri, Bundle bundle) {
        return CompletableEmpty.a;
    }

    @Override // p.lxh0
    public final Completable c(String str) {
        return CompletableEmpty.a;
    }

    @Override // p.lxh0
    public final Completable d(long j, String str) {
        return CompletableEmpty.a;
    }

    @Override // p.lxh0
    public final Completable e(String str) {
        return this.a.a(w5u0.a);
    }

    @Override // p.lxh0
    public final boolean f(String str) {
        return false;
    }

    @Override // p.lxh0
    public final Completable g(String str, String str2, Bundle bundle) {
        boolean zEquals = str2.equals("SEEK_15_SECONDS_FORWARD");
        e6u0 e6u0Var = this.a;
        if (zEquals) {
            return e6u0Var.a(new y5u0(15000L));
        }
        return str2.equals("SEEK_15_SECONDS_BACK") ? e6u0Var.a(new y5u0(-15000L)) : CompletableEmpty.a;
    }

    @Override // p.lxh0
    public final Completable h(int i, String str) {
        return CompletableEmpty.a;
    }

    @Override // p.lxh0
    public final Completable i(String str, String str2, Bundle bundle) {
        return CompletableEmpty.a;
    }

    @Override // p.lxh0
    public final Single j(Bundle bundle, String str) {
        return Single.just(new eeh(0, (Bundle) null));
    }

    @Override // p.lxh0
    public final Completable k(String str) {
        return CompletableEmpty.a;
    }

    @Override // p.lxh0
    public final Completable l(String str, y0i0 y0i0Var) {
        return CompletableEmpty.a;
    }

    @Override // p.lxh0
    public final List m() {
        return z6x.a;
    }

    @Override // p.lxh0
    public final Completable n(int i, String str) {
        return CompletableEmpty.a;
    }

    @Override // p.lxh0
    public final Completable o(String str) {
        return this.a.a(x5u0.a);
    }

    @Override // p.lxh0
    public final Completable p(String str) {
        return this.a.a(a6u0.a);
    }

    @Override // p.lxh0
    public final Completable q(String str, Uri uri, Bundle bundle) {
        return CompletableEmpty.a;
    }

    @Override // p.lxh0
    public final Completable r(int i, Bundle bundle, String str, String str2) {
        return CompletableEmpty.a;
    }
}
