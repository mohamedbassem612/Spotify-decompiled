package p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hn5 implements Function, ejv {
    public int a;

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        return q9u0.g(((Long) obj).longValue() + ((long) this.a));
    }

    public int c(Context context, String str, boolean z) {
        return 0;
    }

    public int m(Context context, String str) {
        return this.a;
    }
}
