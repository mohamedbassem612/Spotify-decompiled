package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eho0 implements fho0 {
    public final boolean a;
    public final boolean b;

    public eho0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eho0)) {
            return false;
        }
        eho0 eho0Var = (eho0) obj;
        return this.a == eho0Var.a && this.b == eho0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NoInternet(wifiDisabled=" + this.a + ", mobileDataDisabled=" + this.b + ")";
    }
}
