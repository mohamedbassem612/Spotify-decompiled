package p;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uid {
    public wat a;
    public flb0 b;
    public fid c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uid)) {
            return false;
        }
        uid uidVar = (uid) obj;
        return u890.j(this.a, uidVar.a) && this.b == uidVar.b && u890.j(this.c, uidVar.c) && Size.c(this.d, uidVar.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + Size.h(this.d) + ")";
    }
}
