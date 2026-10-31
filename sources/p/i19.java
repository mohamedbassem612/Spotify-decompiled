package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i19 {
    public final iac0 a;
    public final my8 b;

    public i19(iac0 iac0Var, my8 my8Var) {
        if (iac0Var == null) {
            bhn0.i("Null lifecycleOwner");
            throw null;
        }
        this.a = iac0Var;
        this.b = my8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i19)) {
            return false;
        }
        i19 i19Var = (i19) obj;
        return this.a.equals(i19Var.a) && this.b.equals(i19Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}
