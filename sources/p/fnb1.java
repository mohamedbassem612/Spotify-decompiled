package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fnb1 implements job1 {
    public final String a;
    public final String b;

    public fnb1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnb1)) {
            return false;
        }
        fnb1 fnb1Var = (fnb1) obj;
        return this.a.equals(fnb1Var.a) && u890.j(this.b, fnb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
