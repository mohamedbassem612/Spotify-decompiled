package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hxu0 implements v5b1 {
    public static final x6c0 e = new x6c0((byte) 27);
    public final String a;
    public final xkg0 b;
    public final String c;
    public final String d;

    public hxu0(String str, xkg0 xkg0Var, String str2, String str3) {
        this.a = str;
        this.b = xkg0Var;
        this.c = str2;
        this.d = str3;
    }

    @Override // p.v5b1
    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxu0)) {
            return false;
        }
        hxu0 hxu0Var = (hxu0) obj;
        return this.a.equals(hxu0Var.a) && this.b.equals(hxu0Var.b) && u890.j(this.c, hxu0Var.c) && u890.j(this.d, hxu0Var.d);
    }

    @Override // p.v5b1
    public final b3i1 getType() {
        return e;
    }

    public final int hashCode() {
        int iH = kk0.h(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iH + (str == null ? 0 : str.hashCode())) * 31);
    }
}
