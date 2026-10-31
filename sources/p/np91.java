package p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class np91 implements Function {
    public final ut71 a;
    public final Context b;

    public np91(ut71 ut71Var, Context context) {
        this.a = ut71Var;
        this.b = context;
    }

    public Object apply(Object obj) {
        return this.a.b(this.b, (String) obj);
    }

    public np91(Context context, ut71 ut71Var) {
        this.b = context;
        this.a = ut71Var;
    }
}
