package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zm61 implements an61 {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final fj10 d;
    public final Integer e;
    public final xu30 f;
    public final boolean g;
    public final ym61 h;

    public zm61(Integer num, Integer num2, Integer num3, xu30 xu30Var, ym61 ym61Var, int i) {
        fj10 fj10Var = fj10.d1;
        String str = (i & 1) != 0 ? null : "https://cdn-spotify-gen-alpha.spotifycdn.com/in-app-messaging/ManagedAccountEducationSheet@3x.jpg";
        num2 = (i & 8) != 0 ? null : num2;
        fj10Var = (i & 32) != 0 ? null : fj10Var;
        boolean z = (i & 512) == 0;
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = fj10Var;
        this.e = num3;
        this.f = xu30Var;
        this.g = z;
        this.h = ym61Var;
        ero1.s(new Object[]{num, null}, w661.P0);
        ero1.s(new Object[]{num2, null, fj10Var}, w661.Q0);
        ero1.s(new Object[]{num3, null}, w661.R0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm61)) {
            return false;
        }
        zm61 zm61Var = (zm61) obj;
        return u890.j(this.a, zm61Var.a) && this.b.equals(zm61Var.b) && u890.j(this.c, zm61Var.c) && u890.j(this.d, zm61Var.d) && this.e.equals(zm61Var.e) && this.f.equals(zm61Var.f) && this.g == zm61Var.g && this.h.equals(zm61Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iE = pze0.e((str == null ? 0 : str.hashCode()) * 31, 961, this.b);
        Integer num = this.c;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 961;
        fj10 fj10Var = this.d;
        return this.h.hashCode() + xcg1.g((this.f.hashCode() + pze0.e((iHashCode + (fj10Var != null ? fj10Var.hashCode() : 0)) * 31, 961, this.e)) * 31, 31, this.g);
    }
}
