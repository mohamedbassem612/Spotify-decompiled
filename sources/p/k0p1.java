package p;

import android.webkit.CookieManager;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k0p1 implements Function, sya1, Predicate {
    public static final k0p1 b = new k0p1("opeokic");
    public final String a;

    public /* synthetic */ k0p1(String str) {
        this.a = str;
    }

    @Override // p.sya1
    public Iterator a(tya1 tya1Var, CharSequence charSequence) {
        return new qya1(this, tya1Var, charSequence, (byte) 1);
    }

    public Object apply(Object obj) {
        return Single.fromCallable(new e71((CookieManager) obj, this.a, (byte) 3));
    }

    public boolean test(Object obj) {
        return ((uv00) obj).a(va81.class, this.a).b != null;
    }
}
