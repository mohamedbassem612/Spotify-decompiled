package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u5r implements w5r {
    public final String a;
    public final View b;

    public u5r(View view, String str) {
        this.a = str;
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5r)) {
            return false;
        }
        u5r u5rVar = (u5r) obj;
        return u890.j(this.a, u5rVar.a) && this.b.equals(u5rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
