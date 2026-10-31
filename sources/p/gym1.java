package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gym1 {
    public final hux a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final fym1 f;

    public gym1(hux huxVar, String str, String str2, int i, boolean z, fym1 fym1Var) {
        this.a = huxVar;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = z;
        this.f = fym1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gym1)) {
            return false;
        }
        gym1 gym1Var = (gym1) obj;
        return this.a.equals(gym1Var.a) && u890.j(this.b, gym1Var.b) && this.c.equals(gym1Var.c) && this.d == gym1Var.d && this.e == gym1Var.e && this.f.equals(gym1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g((((Integer.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) + 580414516) * 31, 31, this.e);
    }
}
