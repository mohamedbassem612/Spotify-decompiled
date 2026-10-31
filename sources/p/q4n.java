package p;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q4n implements v1i {
    public final uq8 a;
    public final RelativeLayout b;

    public q4n(uq8 uq8Var, RelativeLayout relativeLayout) {
        this.a = uq8Var;
        this.b = relativeLayout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q4n) {
            q4n q4nVar = (q4n) obj;
            if (this.a == q4nVar.a && this.b.equals(q4nVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final View getView() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
