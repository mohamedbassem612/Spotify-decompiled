package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gbe1 {
    public static final gbe1 c = new gbe1(2, false);
    public static final gbe1 d = new gbe1(1, true);
    public final int a;
    public final boolean b;

    public gbe1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbe1)) {
            return false;
        }
        gbe1 gbe1Var = (gbe1) obj;
        return this.a == gbe1Var.a && this.b == gbe1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return "TextMotion.Static";
        }
        return equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
