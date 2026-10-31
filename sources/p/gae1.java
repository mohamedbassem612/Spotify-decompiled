package p;

import android.graphics.Rect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gae1 {
    public final String a;
    public final Rect b;
    public final Rect c;

    public gae1(String str, Rect rect, Rect rect2) {
        this.a = str;
        this.b = rect;
        this.c = rect2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gae1)) {
            return false;
        }
        gae1 gae1Var = (gae1) obj;
        return this.a.equals(gae1Var.a) && this.b.equals(gae1Var.b) && this.c.equals(gae1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
