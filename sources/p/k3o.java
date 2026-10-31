package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k3o {
    public final String a;
    public final String b;

    public k3o(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3o)) {
            return false;
        }
        k3o k3oVar = (k3o) obj;
        return u890.j(this.a, k3oVar.a) && this.b.equals(k3oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
