package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hj11 {
    public final View a;

    public hj11(View view) {
        this.a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hj11) && u890.j(this.a, ((hj11) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(2131167147) + (this.a.hashCode() * 31);
    }
}
