package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wzl1 implements g0m1 {
    public final String a;
    public final li20 b;
    public final int c;

    public wzl1(String str, li20 li20Var, int i) {
        this.a = str;
        this.b = li20Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzl1)) {
            return false;
        }
        wzl1 wzl1Var = (wzl1) obj;
        return u890.j(this.a, wzl1Var.a) && this.b == wzl1Var.b && this.c == wzl1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
