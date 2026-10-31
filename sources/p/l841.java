package p;

import android.content.Context;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l841 {
    public static final String[] d = {"auth_server_url", "api_server_url"};
    public final Context a;
    public final zgz0 b;
    public spq0 c = j5.a;

    public l841(zgz0 zgz0Var, Context context) {
        this.b = zgz0Var;
        this.a = context;
    }

    public final Observable a() {
        Context context = this.a;
        zgz0 zgz0Var = this.b;
        return zgz0Var.a(context).doOnDispose(new w43(zgz0Var, (byte) 9)).doOnTerminate(new w43(zgz0Var, (byte) 9));
    }

    public final boolean b(dk70 dk70Var) {
        Bundle bundle = new Bundle();
        bundle.putStringArray("additional", d);
        bundle.putString("scope", "openid");
        if (!this.c.c()) {
            return false;
        }
        return ((bk70) dk70Var).B0(bundle, (String) this.c.b());
    }
}
