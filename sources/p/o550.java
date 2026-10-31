package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o550 implements q550 {
    public final String a;
    public final String b;
    public final Integer c;

    public o550(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o550)) {
            return false;
        }
        o550 o550Var = (o550) obj;
        return this.a.equals(o550Var.a) && this.b.equals(o550Var.b) && u890.j(this.c, o550Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iD + (num == null ? 0 : num.hashCode());
    }
}
