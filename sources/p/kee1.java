package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kee1 {
    public final z9h a;
    public final TextUnit b;
    public final ka30 c;
    public final zzd1 d;
    public final xpv0 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public kee1(z9h z9hVar, TextUnit textUnit, ka30 ka30Var, zzd1 zzd1Var, xpv0 xpv0Var, int i) {
        if ((i & 1) != 0) {
            hn20 hn20Var = x3e1.a;
            z9hVar = x3e1.a;
        }
        this(z9hVar, (i & 2) != 0 ? null : textUnit, (i & 4) != 0 ? null : ka30Var, (i & 16) != 0 ? null : zzd1Var, (i & 64) != 0 ? null : xpv0Var);
    }

    public static kee1 a(kee1 kee1Var, z9h z9hVar, TextUnit textUnit, ka30 ka30Var, zzd1 zzd1Var, int i) {
        if ((i & 1) != 0) {
            z9hVar = kee1Var.a;
        }
        z9h z9hVar2 = z9hVar;
        if ((i & 2) != 0) {
            textUnit = kee1Var.b;
        }
        TextUnit textUnit2 = textUnit;
        if ((i & 4) != 0) {
            ka30Var = kee1Var.c;
        }
        ka30 ka30Var2 = ka30Var;
        kee1Var.getClass();
        if ((i & 16) != 0) {
            zzd1Var = kee1Var.d;
        }
        kee1Var.getClass();
        xpv0 xpv0Var = kee1Var.e;
        kee1Var.getClass();
        return new kee1(z9hVar2, textUnit2, ka30Var2, zzd1Var, xpv0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kee1)) {
            return false;
        }
        kee1 kee1Var = (kee1) obj;
        return u890.j(this.a, kee1Var.a) && u890.j(this.b, kee1Var.b) && u890.j(this.c, kee1Var.c) && u890.j(this.d, kee1Var.d) && u890.j(this.e, kee1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        TextUnit textUnit = this.b;
        int iHashCode2 = (iHashCode + (textUnit != null ? Long.hashCode(textUnit.a) : 0)) * 31;
        ka30 ka30Var = this.c;
        int iHashCode3 = (iHashCode2 + (ka30Var != null ? Integer.hashCode(ka30Var.a) : 0)) * 29791;
        zzd1 zzd1Var = this.d;
        int iHashCode4 = (iHashCode3 + (zzd1Var != null ? Integer.hashCode(zzd1Var.a) : 0)) * 31;
        xpv0 xpv0Var = this.e;
        return iHashCode4 + (xpv0Var != null ? xpv0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TextStyle(color=" + this.a + ", fontSize=" + this.b + ", fontWeight=" + this.c + ", fontStyle=null, textDecoration=null, textAlign=" + this.d + ", fontFamily=" + this.e + ')';
    }

    public kee1(z9h z9hVar, TextUnit textUnit, ka30 ka30Var, zzd1 zzd1Var, xpv0 xpv0Var) {
        this.a = z9hVar;
        this.b = textUnit;
        this.c = ka30Var;
        this.d = zzd1Var;
        this.e = xpv0Var;
    }
}
