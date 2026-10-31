package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class enu0 implements gnu0 {
    public final knu0 a;
    public final knu0 b;

    public enu0(knu0 knu0Var, knu0 knu0Var2) {
        this.a = knu0Var;
        this.b = knu0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enu0)) {
            return false;
        }
        enu0 enu0Var = (enu0) obj;
        return this.a.equals(enu0Var.a) && this.b.equals(enu0Var.b);
    }

    public final knu0 getSender() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
