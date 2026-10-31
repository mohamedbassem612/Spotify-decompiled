package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tgg0 implements ugg0 {
    public final String a;
    public final boolean b;

    public tgg0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgg0)) {
            return false;
        }
        tgg0 tgg0Var = (tgg0) obj;
        return this.a.equals(tgg0Var.a) && this.b == tgg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
