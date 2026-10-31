package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hot0 {
    public final String a;
    public final boolean b;
    public final int c;

    public hot0(String str, int i, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hot0)) {
            return false;
        }
        hot0 hot0Var = (hot0) obj;
        return this.a.equals(hot0Var.a) && this.b == hot0Var.b && this.c == hot0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
