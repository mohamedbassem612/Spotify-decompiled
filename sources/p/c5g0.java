package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c5g0 extends t4n1 {
    public final String b;

    public c5g0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5g0) && u890.j(this.b, ((c5g0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
