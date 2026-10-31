package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rwg1 {
    public final String a;
    public final int b;

    public rwg1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwg1)) {
            return false;
        }
        rwg1 rwg1Var = (rwg1) obj;
        return this.a.equals(rwg1Var.a) && this.b == rwg1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
