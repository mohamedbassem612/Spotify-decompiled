package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ady {
    public final View a;

    public ady(View view) {
        this.a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ady) && this.a.equals(((ady) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
