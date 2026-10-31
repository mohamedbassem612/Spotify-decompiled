package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vzg0 implements k0h0 {
    public final String a;

    public vzg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzg0) && u890.j(this.a, ((vzg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
