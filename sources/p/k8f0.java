package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k8f0 {
    public final String a;
    public final String b;

    public k8f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8f0)) {
            return false;
        }
        k8f0 k8f0Var = (k8f0) obj;
        return u890.j(this.a, k8f0Var.a) && u890.j(this.b, k8f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ k8f0() {
        this("", "");
    }
}
