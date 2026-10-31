package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class npf1 implements ppf1 {
    public final int a;
    public final String b;
    public final String c;

    public npf1(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npf1)) {
            return false;
        }
        npf1 npf1Var = (npf1) obj;
        return this.a == npf1Var.a && this.b.equals(npf1Var.b) && this.c.equals(npf1Var.c);
    }

    public final int hashCode() {
        int i = this.a;
        return this.c.hashCode() + cy30.d((i == 0 ? 0 : l1d.C(i)) * 31, 31, this.b);
    }
}
