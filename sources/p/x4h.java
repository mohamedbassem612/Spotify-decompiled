package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x4h implements b5h {
    public final String a;

    public x4h(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4h) && u890.j(this.a, ((x4h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
