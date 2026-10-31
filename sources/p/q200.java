package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q200 implements y600 {
    public final String a;
    public final boolean b;
    public final int c;

    public q200(String str, int i, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q200)) {
            return false;
        }
        q200 q200Var = (q200) obj;
        return u890.j(this.a, q200Var.a) && this.b == q200Var.b && this.c == q200Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return l1d.C(this.c) + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
