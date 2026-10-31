package p;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m6s implements fae0 {
    public final View a;
    public final Context b;

    public m6s(Context context, View view) {
        n57.d(context, "Don't pass null context to constructor");
        n57.d(view, "Don't pass null views to constructor");
        this.b = context;
        this.a = view;
    }

    public final void a() {
        this.a.setVisibility(0);
    }

    public final long c() {
        return this.b.getResources().getInteger(2131492902);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m6s) && ((m6s) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
