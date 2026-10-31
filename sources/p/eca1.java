package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eca1 implements gca1 {
    public final String a;
    public final String b;
    public final int c;

    public eca1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eca1)) {
            return false;
        }
        eca1 eca1Var = (eca1) obj;
        return this.a.equals(eca1Var.a) && u890.j(this.b, eca1Var.b) && this.c == eca1Var.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return l1d.C(1) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
