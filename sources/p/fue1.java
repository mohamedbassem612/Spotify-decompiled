package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fue1 {
    public final String a;
    public final float b;
    public final int c;

    public fue1(float f, int i, String str) {
        this.a = str;
        this.b = f;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fue1)) {
            return false;
        }
        fue1 fue1Var = (fue1) obj;
        return this.a.equals(fue1Var.a) && Float.compare(this.b, fue1Var.b) == 0 && this.c == fue1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + x0d.f(this.a.hashCode() * 31, 31, this.b);
    }
}
