package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nrg0 extends prg0 {
    public final String a;

    public nrg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrg0) && u890.j(this.a, ((nrg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
