package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ka10 {
    public final Object a;
    public final boolean b;

    public ka10(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka10)) {
            return false;
        }
        ka10 ka10Var = (ka10) obj;
        return this.a.equals(ka10Var.a) && this.b == ka10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
