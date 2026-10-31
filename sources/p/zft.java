package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class zft extends lft implements nla0, fma0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zft() {
        super(rka0.i);
        rka0 rka0Var = rka0.i;
    }

    public final mla0 a() {
        return z().h;
    }

    public final rzc g() {
        return null;
    }

    public final boolean isExternal() {
        return y().g;
    }

    public final boolean isInfix() {
        y();
        return false;
    }

    public final boolean isInline() {
        return y().t;
    }

    public final boolean isOperator() {
        y();
        return false;
    }

    public final boolean isSuspend() {
        y();
        return false;
    }

    public final Object u() {
        return z().X;
    }

    public abstract rdy0 y();

    public abstract mgt z();
}
