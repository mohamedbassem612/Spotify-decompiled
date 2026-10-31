package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x2x0 extends z2x0 {
    public final String a;

    public x2x0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2x0) && this.a.equals(((x2x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
