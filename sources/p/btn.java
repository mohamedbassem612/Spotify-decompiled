package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class btn {
    public final CharSequence a;
    public final String b;
    public final gtn c;
    public final ftn d;
    public final Integer e;
    public final boolean f;
    public final ssn g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public btn(CharSequence charSequence, String str, gtn gtnVar, ftn ftnVar, Integer num, boolean z, ssn ssnVar, boolean z2, boolean z3, boolean z4) {
        this.a = charSequence;
        this.b = str;
        this.c = gtnVar;
        this.d = ftnVar;
        this.e = num;
        this.f = z;
        this.g = ssnVar;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btn)) {
            return false;
        }
        btn btnVar = (btn) obj;
        return u890.j(this.a, btnVar.a) && u890.j(this.b, btnVar.b) && this.c.equals(btnVar.c) && this.d.equals(btnVar.d) && u890.j(this.e, btnVar.e) && this.f == btnVar.f && this.g.equals(btnVar.g) && this.h == btnVar.h && this.i == btnVar.i && this.j == btnVar.j;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + cy30.d((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b)) * 31)) * 31;
        Integer num = this.e;
        return Boolean.hashCode(this.j) + xcg1.g(xcg1.g((this.g.hashCode() + xcg1.g((iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.f)) * 31, 31, this.h), 31, this.i);
    }
}
