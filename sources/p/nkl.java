package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nkl extends okl {
    public final int a;
    public final String b;

    public nkl(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkl)) {
            return false;
        }
        nkl nklVar = (nkl) obj;
        return this.a == nklVar.a && u890.j(this.b, nklVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
