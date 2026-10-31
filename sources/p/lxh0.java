package p;

import android.net.Uri;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface lxh0 {
    Completable a(long j, String str);

    Completable b(String str, Uri uri, Bundle bundle);

    Completable c(String str);

    Completable d(long j, String str);

    Completable e(String str);

    boolean f(String str);

    Completable g(String str, String str2, Bundle bundle);

    Completable h(int i, String str);

    Completable i(String str, String str2, Bundle bundle);

    Single j(Bundle bundle, String str);

    Completable k(String str);

    Completable l(String str, y0i0 y0i0Var);

    List m();

    Completable n(int i, String str);

    Completable o(String str);

    Completable p(String str);

    Completable q(String str, Uri uri, Bundle bundle);

    Completable r(int i, Bundle bundle, String str, String str2);
}
