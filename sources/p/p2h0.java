package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p2h0 implements e4h0 {
    public final String a;

    public p2h0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2h0) && u890.j(this.a, ((p2h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
