package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q281 {
    public final String a;
    public final String b;
    public final int c;

    public q281(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q281)) {
            return false;
        }
        q281 q281Var = (q281) obj;
        return this.a.equals(q281Var.a) && this.b.equals(q281Var.b) && this.c == q281Var.c;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        int i = this.c;
        return iD + (i == 0 ? 0 : l1d.C(i));
    }
}
