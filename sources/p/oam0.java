package p;

import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oam0 {
    public final kkn a;
    public final cn41 b;
    public final Observer c;
    public final boolean d;

    public oam0(kkn kknVar, cn41 cn41Var, Observer observer, boolean z) {
        this.a = kknVar;
        this.b = cn41Var;
        this.c = observer;
        this.d = z;
    }

    public static oam0 a(oam0 oam0Var, kkn kknVar, cn41 cn41Var, Observer observer, boolean z, int i) {
        if ((i & 1) != 0) {
            kknVar = oam0Var.a;
        }
        if ((i & 2) != 0) {
            cn41Var = oam0Var.b;
        }
        if ((i & 4) != 0) {
            observer = oam0Var.c;
        }
        if ((i & 8) != 0) {
            z = oam0Var.d;
        }
        oam0Var.getClass();
        return new oam0(kknVar, cn41Var, observer, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oam0)) {
            return false;
        }
        oam0 oam0Var = (oam0) obj;
        return this.a.equals(oam0Var.a) && u890.j(this.b, oam0Var.b) && u890.j(this.c, oam0Var.c) && this.d == oam0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cn41 cn41Var = this.b;
        int iHashCode2 = (iHashCode + (cn41Var == null ? 0 : cn41Var.hashCode())) * 31;
        Observer observer = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (observer != null ? observer.hashCode() : 0)) * 31);
    }

    public final String toString() {
        boolean z = this.c != null;
        StringBuilder sb = new StringBuilder("Model(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", has-subscriber=");
        return l1d.r(sb, z, ")");
    }
}
