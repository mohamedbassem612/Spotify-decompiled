package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sgg0 implements ugg0 {
    public final String a;
    public final boolean b;

    public sgg0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgg0)) {
            return false;
        }
        sgg0 sgg0Var = (sgg0) obj;
        return this.a.equals(sgg0Var.a) && this.b == sgg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
