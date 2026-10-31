package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ltl1 {
    public static final ltl1 b = new ltl1(0);
    public static final ltl1 c = new ltl1(1);
    public static final ltl1 d = new ltl1(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public ltl1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ltl1.class.equals(obj != null ? obj.getClass() : null) && this.a == ((ltl1) obj).a;
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
        return "WindowWidthSizeClass: ".concat(str);
    }
}
