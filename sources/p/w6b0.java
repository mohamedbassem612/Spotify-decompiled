package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w6b0 extends y6b0 {
    public final p3b0 i;
    public final znb0 t;

    public w6b0(mla0 mla0Var, String str, Object obj, p3b0 p3b0Var) {
        super(mla0Var, str, obj);
        this.i = p3b0Var;
        this.t = dm5.S(2, new b9o(mla0Var, (byte) 7));
    }

    public static b7 B(mla0 mla0Var) {
        return ila0.o((bla0) mla0Var);
    }

    @Override // p.y6b0
    public final List A() {
        return this.i.b;
    }

    public final String getName() {
        return "<init>";
    }

    public final oma0 getReturnType() {
        return (oma0) this.t.getValue();
    }

    public final xma0 getVisibility() {
        yzu yzuVar = xm7.g;
        mma0 mma0Var = xm7.a[17];
        return ajo1.C((vjk1) yzuVar.y(this.i));
    }

    public final boolean isExternal() {
        return false;
    }

    public final boolean isInfix() {
        return false;
    }

    public final boolean isInline() {
        return false;
    }

    public final boolean isOperator() {
        return false;
    }

    public final boolean isSuspend() {
        return false;
    }

    @Override // p.y6b0
    public final ija0 y() {
        ija0 ija0Var = ((uia0) ulo1.q(this.i.e, uia0.b)).a;
        if (ija0Var != null) {
            return ija0Var;
        }
        mna0.d(this, "No signature for constructor: ");
        return null;
    }
}
