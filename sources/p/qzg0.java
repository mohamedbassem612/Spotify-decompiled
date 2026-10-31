package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qzg0 implements k0h0 {
    public final String a;

    public qzg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzg0) && u890.j(this.a, ((qzg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
