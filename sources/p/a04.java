package p;

import android.graphics.Rect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a04 {
    public final boolean a;
    public final Rect b;
    public final int c;

    public a04(boolean z, int i, Rect rect) {
        this.a = z;
        this.b = rect;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a04)) {
            return false;
        }
        a04 a04Var = (a04) obj;
        return this.a == a04Var.a && u890.j(this.b, a04Var.b) && this.c == a04Var.c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Rect rect = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (rect == null ? 0 : rect.hashCode())) * 31);
    }
}
