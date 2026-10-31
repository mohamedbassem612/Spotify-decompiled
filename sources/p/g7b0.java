package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g7b0 extends y6b0 {
    public final znb0 X;
    public final u3b0 i;
    public final znb0 t;

    public g7b0(mla0 mla0Var, String str, Object obj, u3b0 u3b0Var) {
        super(mla0Var, str, obj);
        this.i = u3b0Var;
        this.t = dm5.S(2, new f7b0(mla0Var, this));
        this.X = dm5.S(2, new f7b0(this, mla0Var));
    }

    @Override // p.y6b0
    public final List A() {
        return this.i.f;
    }

    public final String getName() {
        return this.i.b;
    }

    public final oma0 getReturnType() {
        return (oma0) this.X.getValue();
    }

    public final xma0 getVisibility() {
        yzu yzuVar = xm7.h;
        mma0 mma0Var = xm7.a[22];
        return ajo1.C((vjk1) yzuVar.y(this.i));
    }

    public final boolean isExternal() {
        mgc mgcVar = xm7.m;
        mma0 mma0Var = xm7.a[28];
        return mgcVar.D(this.i);
    }

    public final boolean isInfix() {
        mgc mgcVar = xm7.k;
        mma0 mma0Var = xm7.a[25];
        return mgcVar.D(this.i);
    }

    public final boolean isInline() {
        mgc mgcVar = xm7.l;
        mma0 mma0Var = xm7.a[26];
        return mgcVar.D(this.i);
    }

    public final boolean isOperator() {
        mgc mgcVar = xm7.j;
        mma0 mma0Var = xm7.a[24];
        return mgcVar.D(this.i);
    }

    public final boolean isSuspend() {
        mgc mgcVar = xm7.n;
        mma0 mma0Var = xm7.a[29];
        return mgcVar.D(this.i);
    }

    @Override // p.v6b0
    public final dfm0 n() {
        yzu yzuVar = xm7.i;
        mma0 mma0Var = xm7.a[23];
        return (dfm0) yzuVar.y(this.i);
    }

    @Override // p.y6b0
    public final List w() {
        return this.i.g;
    }

    @Override // p.y6b0
    public final y3b0 x() {
        return this.i.d;
    }

    @Override // p.y6b0
    public final ija0 y() {
        ija0 ija0Var = ((yia0) ulo1.q(this.i.k, yia0.b)).a;
        if (ija0Var != null) {
            return ija0Var;
        }
        mna0.d(this, "No signature for function: ");
        return null;
    }

    @Override // p.y6b0
    public final c1h1 z() {
        return (c1h1) this.t.getValue();
    }
}
