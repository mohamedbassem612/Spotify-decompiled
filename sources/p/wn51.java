package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wn51 implements xn51 {
    public final Integer a;
    public final String b;
    public final int c;

    public wn51(int i, Integer num, String str) {
        this.a = num;
        this.b = str;
        this.c = i;
    }

    @Override // p.xn51
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn51)) {
            return false;
        }
        wn51 wn51Var = (wn51) obj;
        return u890.j(this.a, wn51Var.a) && this.b.equals(wn51Var.b) && this.c == wn51Var.c;
    }

    public final int hashCode() {
        Integer num = this.a;
        return l1d.C(this.c) + cy30.d((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
    }
}
