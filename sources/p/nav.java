package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class nav {
    public static final mav Companion = new mav();
    public long a;
    public long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nav)) {
            return false;
        }
        nav navVar = (nav) obj;
        return this.a == navVar.a && this.b == navVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
