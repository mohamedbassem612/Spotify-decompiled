package p;

import android.app.Activity;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cg0 implements Function {
    public final Activity a;

    public Object apply(Object obj) {
        bg0 bg0Var = (bg0) obj;
        return Boolean.valueOf(u890.j(bg0Var.a, this.a.toString()) && bg0Var.b == w8c0.e);
    }
}
