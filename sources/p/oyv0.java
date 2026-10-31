package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oyv0 {
    public final String a;
    public final boolean b;

    public oyv0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyv0)) {
            return false;
        }
        oyv0 oyv0Var = (oyv0) obj;
        return this.a.equals(oyv0Var.a) && this.b == oyv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
