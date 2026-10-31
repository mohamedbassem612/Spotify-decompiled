package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pby implements vby {
    public final View a;

    public pby(View view) {
        this.a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pby) && u890.j(this.a, ((pby) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
