package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k8e1 implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public k8e1(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8e1)) {
            return false;
        }
        k8e1 k8e1Var = (k8e1) obj;
        return this.a.equals(k8e1Var.a) && this.b.equals(k8e1Var.b) && this.c.equals(k8e1Var.c) && this.d.equals(k8e1Var.d) && this.e.equals(k8e1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
