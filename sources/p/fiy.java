package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fiy implements niy {
    public final View a;

    public fiy(View view) {
        this.a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fiy) && u890.j(this.a, ((fiy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
