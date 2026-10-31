package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class med1 {
    public String a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || med1.class != obj.getClass()) {
            return false;
        }
        med1 med1Var = (med1) obj;
        return this.a.equals(med1Var.a) && this.b == med1Var.b;
    }

    public final int hashCode() {
        int i = ((this.b ? 1 : 0) + 1) * 31;
        String str = this.a;
        return i + (str == null ? 0 : str.hashCode());
    }
}
