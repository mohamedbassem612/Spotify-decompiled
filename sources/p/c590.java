package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c590 extends f590 {
    public final View a;

    public c590(View view) {
        this.a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c590) && u890.j(this.a, ((c590) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
