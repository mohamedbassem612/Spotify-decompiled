package p;

import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qub0 implements esb0 {
    public final fvb0 a;
    public final pub0 b;
    public final mgc c;

    public qub0(fvb0 fvb0Var, pub0 pub0Var, mgc mgcVar) {
        this.a = fvb0Var;
        this.b = pub0Var;
        this.c = mgcVar;
    }

    public final int a() {
        return this.b.B().b;
    }

    public final Object b(int i) {
        return this.b.w(i);
    }

    public final int c(Object obj) {
        return this.c.x(obj);
    }

    public final Object d(int i) {
        Object objY = this.c.y(i);
        return objY == null ? this.b.D(i) : objY;
    }

    public final void e(int i, Object obj, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(89098518);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(obj) ? 32 : 16) | (x340Var.g(this) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            wmo1.d(obj, i, this.a.s, apo.r(608834466, new r1c(this, i, (byte) 3), x340Var), x340Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cf5(this, i, obj, i2, (byte) 8);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qub0)) {
            return false;
        }
        return u890.j(this.b, ((qub0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
