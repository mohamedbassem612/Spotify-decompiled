package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x6i1 {
    public final String a;

    public x6i1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6i1) && u890.j(this.a, ((x6i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
