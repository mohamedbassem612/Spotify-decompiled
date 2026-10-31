package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nz01 implements pz01 {
    public final String a;

    public nz01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nz01) && u890.j(this.a, ((nz01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
