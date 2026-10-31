package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class so90 {
    public final int a;
    public final String b;
    public final String c;

    public so90(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so90)) {
            return false;
        }
        so90 so90Var = (so90) obj;
        return this.a == so90Var.a && this.b.equals(so90Var.b) && u890.j(this.c, so90Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(l1d.C(this.a) * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
