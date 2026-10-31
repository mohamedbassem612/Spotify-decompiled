package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w4u implements c5u {
    public final int a;

    public /* synthetic */ w4u(int i) {
        this.a = i;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        hhg1.n("px must be > 0.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w4u) {
            return this.a == ((w4u) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "Pixels(px=" + this.a + ')';
    }
}
