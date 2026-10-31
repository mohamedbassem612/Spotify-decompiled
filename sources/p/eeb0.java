package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eeb0 {
    public final beb0 a;
    public final adb0 b;

    public eeb0(beb0 beb0Var, adb0 adb0Var) {
        this.a = beb0Var;
        this.b = adb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eeb0)) {
            return false;
        }
        eeb0 eeb0Var = (eeb0) obj;
        return this.a.equals(eeb0Var.a) && this.b.equals(eeb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
