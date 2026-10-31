package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kpm0 implements rij0 {
    public final float a;
    public final jpm0 b;
    public final jpm0 c;

    public kpm0(float f, jpm0 jpm0Var, jpm0 jpm0Var2) {
        this.a = f;
        this.b = jpm0Var;
        this.c = jpm0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kpm0)) {
            return false;
        }
        kpm0 kpm0Var = (kpm0) obj;
        return Float.compare(this.a, kpm0Var.a) == 0 && Objects.equals(this.b, kpm0Var.b) && Objects.equals(this.c, kpm0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        jpm0 jpm0Var = this.b;
        int iHashCode2 = (iHashCode + (jpm0Var != null ? jpm0Var.hashCode() : 0)) * 31;
        jpm0 jpm0Var2 = this.c;
        return iHashCode2 + (jpm0Var2 != null ? jpm0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
