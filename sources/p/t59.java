package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t59 extends x59 {
    public final boolean a;
    public final String b;
    public final Integer c;
    public final boolean d;

    public t59(Integer num, String str, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = num;
        this.d = z2;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t59)) {
            return false;
        }
        t59 t59Var = (t59) obj;
        return this.a == t59Var.a && u890.j(this.b, t59Var.b) && u890.j(this.c, t59Var.c) && this.d == t59Var.d;
    }

    public final int hashCode() {
        int iF = kaa0.f(2131960660, kaa0.f(2131954163, cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31);
        Integer num = this.c;
        return Boolean.hashCode(this.d) + kaa0.f(2131886206, (iF + (num == null ? 0 : num.hashCode())) * 31, 31);
    }
}
