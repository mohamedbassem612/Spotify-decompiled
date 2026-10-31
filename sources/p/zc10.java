package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zc10 extends nfp0 {
    public static final ofp0 d;
    public float b = 0.0f;
    public float c = 0.0f;

    static {
        ofp0 ofp0VarA = ofp0.a(SemanticState.Hidden, new zc10());
        d = ofp0VarA;
        ofp0VarA.f = 0.5f;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zc10) {
            zc10 zc10Var = (zc10) obj;
            if (this.b == zc10Var.b && this.c == zc10Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return this.b + "x" + this.c;
    }
}
