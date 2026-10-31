package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q57 {
    public final String a;
    public final String b;

    public q57(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q57)) {
            return false;
        }
        q57 q57Var = (q57) obj;
        return this.a.equals(q57Var.a) && this.b.equals(q57Var.b);
    }

    public final int hashCode() {
        return l1d.C(2) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
