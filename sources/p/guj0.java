package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class guj0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ guj0(boolean z, Object obj, Object obj2, boolean z2, boolean z3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.f = obj;
        this.g = obj2;
        this.d = z2;
        this.e = z3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                return new guj0(this.c, (huj0) obj3, (String) obj2, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new guj0(this.c, (zen0) obj3, (zen0) obj2, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        d9n d9nVar = d9n.a;
        Object obj2 = this.f;
        Object obj3 = this.g;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                String str = (String) obj3;
                huj0 huj0Var = (huj0) obj2;
                kt91 kt91Var = huj0Var.c;
                iyc0 iyc0Var = huj0Var.b;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    if (z3) {
                        ayc0 ayc0Var = new ayc0("mix-opt-out", (phc) null, (phc) null, false, (String) null, 30);
                        this.b = (byte) 1;
                        if (iyc0.a(iyc0Var, str, ayc0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958602});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958602});
                        kt91Var.k(new er91((fs91) null, "", 2131958602, (String) null, 2131957350, new t230(huj0Var, str, (byte) 17), (cvr) null, (xq91) null, false));
                    } else if (z2) {
                        ayc0 ayc0Var2 = new ayc0("mix-remove-opt-out", (phc) null, (phc) null, false, (String) null, 30);
                        this.b = (byte) 2;
                        if (iyc0.a(iyc0Var, str, ayc0Var2, this) == d9nVar) {
                            return d9nVar;
                        }
                        if (z) {
                            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957348});
                            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                            kt91Var.k(new er91((fs91) null, "", 2131957348, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        }
                    }
                } else if (b2 == 1) {
                    hm5.M(obj);
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958602});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958602});
                    kt91Var.k(new er91((fs91) null, "", 2131958602, (String) null, 2131957350, new t230(huj0Var, str, (byte) 17), (cvr) null, (xq91) null, false));
                } else {
                    if (b2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    if (z) {
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957348});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        kt91Var.k(new er91((fs91) null, "", 2131957348, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    }
                }
                return rih1Var;
            default:
                zen0 zen0Var = (zen0) obj3;
                zen0 zen0Var2 = (zen0) obj2;
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    if (z3) {
                        zen0Var2.w1(Boolean.FALSE);
                        this.b = (byte) 1;
                        Object objJ = b5p1.j(rwq.q(new z8i0(zen0Var2, (byte) 24)), new nw5(2, (lnm) null, (byte) 15), this);
                        if (objJ != d9nVar) {
                            objJ = rih1Var;
                        }
                        if (objJ == d9nVar) {
                            return d9nVar;
                        }
                        zen0Var.w1(Boolean.valueOf(z2));
                    } else {
                        zen0Var.w1(Boolean.FALSE);
                        this.b = (byte) 2;
                        Object objJ2 = b5p1.j(rwq.q(new z8i0(zen0Var, (byte) 24)), new nw5(2, (lnm) null, (byte) 15), this);
                        if (objJ2 != d9nVar) {
                            objJ2 = rih1Var;
                        }
                        if (objJ2 == d9nVar) {
                            return d9nVar;
                        }
                        zen0Var2.w1(Boolean.valueOf(z));
                    }
                } else if (b3 == 1) {
                    hm5.M(obj);
                    zen0Var.w1(Boolean.valueOf(z2));
                } else {
                    if (b3 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    zen0Var2.w1(Boolean.valueOf(z));
                }
                return rih1Var;
        }
    }
}
