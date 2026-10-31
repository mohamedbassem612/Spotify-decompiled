package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q5h0 implements z5h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public q5h0(int i, String str, String str2) {
        str2 = (i & 4) != 0 ? null : str2;
        boolean z = (i & 8) == 0;
        boolean z2 = (i & 16) == 0;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5h0)) {
            return false;
        }
        q5h0 q5h0Var = (q5h0) obj;
        return this.a.equals(q5h0Var.a) && u890.j(this.b, q5h0Var.b) && this.c == q5h0Var.c && this.d == q5h0Var.d;
    }

    @Override // p.z5h0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        String str = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
