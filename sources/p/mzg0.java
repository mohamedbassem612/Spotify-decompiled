package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mzg0 implements k0h0 {
    public final String a;

    public mzg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mzg0) && u890.j(this.a, ((mzg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
