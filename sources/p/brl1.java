package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class brl1 {
    public static final brl1 b = new brl1(0);
    public static final brl1 c = new brl1(1);
    public static final brl1 d = new brl1(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public brl1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return brl1.class.equals(obj != null ? obj.getClass() : null) && this.a == ((brl1) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        String str;
        if (equals(b)) {
            str = "COMPACT";
        } else if (equals(c)) {
            str = "MEDIUM";
        } else {
            str = equals(d) ? "EXPANDED" : "UNKNOWN";
        }
        return "WindowHeightSizeClass: ".concat(str);
    }
}
