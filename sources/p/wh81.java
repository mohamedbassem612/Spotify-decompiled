package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wh81 implements ne41 {
    public static final /* synthetic */ mma0[] R0 = {new een0(wh81.class, "isSideDrawerOpened", "isSideDrawerOpened()Z", 0), new een0(wh81.class, "onBackPressedCallback", "getOnBackPressedCallback()Landroidx/activity/OnBackPressedCallback;", 0), new een0(wh81.class, "isOpeningSideDrawerAllowed", "isOpeningSideDrawerAllowed()Z", 0)};
    public final war0 N0;
    public final uh81 O0;
    public e6w0 P0;
    public final kdn0 Q0;
    public final en70 X;
    public final xjr Y;
    public bn70 Z;
    public final fh81 a;
    public final ph81 b;
    public final r1q0 c;
    public llm d;
    public final be0 e;
    public final vh81 f;
    public final vh81 g;
    public final war0 h;
    public final uh81 i;
    public String t;

    public wh81(fh81 fh81Var, bbr0 bbr0Var, ph81 ph81Var, r1q0 r1q0Var) {
        this.a = fh81Var;
        this.b = ph81Var;
        this.c = r1q0Var;
        Boolean bool = Boolean.FALSE;
        this.e = new be0(this);
        this.f = new vh81(this, (byte) 0);
        this.g = new vh81(this, (byte) 1);
        this.h = bbr0Var.b0(ly3.class);
        this.i = new uh81(this, (byte) 0);
        this.X = j0p1.l(bbr0Var.b0(bn70.class));
        this.Y = new xjr(this, (byte) 6);
        this.N0 = bbr0Var.b0(f6w0.class);
        this.O0 = new uh81(this, (byte) 1);
        this.Q0 = new kdn0(bool);
        b();
    }

    public final Bundle a() {
        mma0 mma0Var = R0[0];
        Boolean bool = (Boolean) this.e.a;
        bool.booleanValue();
        return mno1.h(new mmr0[]{oqn1.n("isSideDrawerOpened", bool), oqn1.n("identifierWhenOpened", this.t)});
    }

    public final void b() {
        mma0[] mma0VarArr = R0;
        mma0 mma0Var = mma0VarArr[2];
        int i = 0;
        if (!((Boolean) this.g.a).booleanValue()) {
            mma0 mma0Var2 = mma0VarArr[0];
            if (!((Boolean) this.e.a).booleanValue()) {
                i = 1;
            }
        }
        this.a.setDrawerLockMode(i);
    }
}
