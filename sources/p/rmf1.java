package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rmf1 {
    public final String a;
    public final String b;
    public final boolean c;

    public rmf1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmf1)) {
            return false;
        }
        rmf1 rmf1Var = (rmf1) obj;
        return this.a.equals(rmf1Var.a) && this.b.equals(rmf1Var.b) && this.c == rmf1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
