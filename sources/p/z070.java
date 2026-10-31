package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z070 implements ez00 {
    public final String a;

    public z070(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z070) && this.a.equals(((z070) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
