package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ylh0 implements amh0 {
    public final String a;
    public final zlh0 b;

    public ylh0(String str, zlh0 zlh0Var) {
        this.a = str;
        this.b = zlh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylh0)) {
            return false;
        }
        ylh0 ylh0Var = (ylh0) obj;
        return this.a.equals(ylh0Var.a) && this.b.equals(ylh0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
