package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hx00 implements ix00 {
    public final String a;

    public hx00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx00) && u890.j(this.a, ((hx00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
