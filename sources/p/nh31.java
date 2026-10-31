package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nh31 {
    public final View a;
    public final int b = 1;

    public nh31(View view) {
        this.a = view;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 10000L;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh31)) {
            return false;
        }
        nh31 nh31Var = (nh31) obj;
        return this.a.equals(nh31Var.a) && this.b == nh31Var.b && obj2.equals(obj2);
    }

    public final int hashCode() {
        Long l = 10000L;
        return l.hashCode() + kaa0.f(0, xcg1.g(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, false), 31);
    }
}
