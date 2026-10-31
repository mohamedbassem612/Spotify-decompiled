package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k8u extends d9u {
    public final abu a;
    public final String b;
    public final boolean c;

    public k8u(abu abuVar, String str, boolean z) {
        this.a = abuVar;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8u)) {
            return false;
        }
        k8u k8uVar = (k8u) obj;
        return u890.j(this.a, k8uVar.a) && u890.j(this.b, k8uVar.b) && this.c == k8uVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
