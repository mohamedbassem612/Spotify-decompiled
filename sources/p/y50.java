package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y50 extends dzo1 {
    public final String c;

    public y50(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y50) {
            return u890.j(this.c, ((y50) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return f4i1.f("ActionLabel.Custom(actionLabel=", this.c, ")");
    }
}
