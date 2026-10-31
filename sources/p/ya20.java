package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ya20 {
    public static final c9 c = mqo1.s(new ya20(k620.a, 2131953579), new ya20(k620.c, 2131953585), new ya20(k620.e, 2131953583), new ya20(k620.d, 2131953578), new ya20(k620.g, 2131953582), new ya20(k620.b, 2131953580), new ya20(k620.f, 2131953584), new ya20(k620.h, 2131953581));
    public final k620 a;
    public final int b;

    public ya20(k620 k620Var, int i) {
        this.a = k620Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya20)) {
            return false;
        }
        ya20 ya20Var = (ya20) obj;
        return this.a == ya20Var.a && this.b == ya20Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
