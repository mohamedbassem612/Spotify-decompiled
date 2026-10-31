package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mky extends bs51 {
    public final View b;

    public mky(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mky) && u890.j(this.b, ((mky) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
