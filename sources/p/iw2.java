package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iw2 extends a8d1 implements bv30 {
    public jw2 a;
    public String b;
    public boolean c;
    public /* synthetic */ pw2 d;
    public /* synthetic */ mw2 e;
    public /* synthetic */ tqw f;
    public final /* synthetic */ jw2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw2(jw2 jw2Var, lnm lnmVar) {
        super(5, lnmVar);
        this.g = jw2Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iw2 iw2Var = new iw2(this.g, (lnm) obj5);
        iw2Var.d = (pw2) obj;
        iw2Var.e = (mw2) obj3;
        iw2Var.f = (tqw) obj4;
        return iw2Var.invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        String strA;
        String str;
        jw2 jw2Var;
        pw2 pw2Var = this.d;
        lw2 lw2Var = this.e;
        tqw tqwVar = this.f;
        boolean z = this.c;
        if (!z) {
            hm5.M(obj);
            if (lw2Var instanceof lw2) {
                strA = lw2Var.a();
            } else {
                if (!(lw2Var instanceof kw2)) {
                    eg.o();
                    return null;
                }
                strA = ((kw2) lw2Var).a();
            }
            if (strA != null) {
                if (strA.length() <= 0) {
                    strA = null;
                }
                if (strA != null) {
                    vu30 vu30VarA = pw2Var.a();
                    this.d = null;
                    this.e = null;
                    this.f = tqwVar;
                    jw2 jw2Var2 = this.g;
                    this.a = jw2Var2;
                    this.b = strA;
                    this.c = true;
                    Object objInvoke = vu30VarA.invoke(lw2Var, this);
                    d9n d9nVar = d9n.a;
                    if (objInvoke == d9nVar) {
                        return d9nVar;
                    }
                    str = strA;
                    jw2Var = jw2Var2;
                }
            }
            return rih1.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = this.b;
        jw2Var = this.a;
        hm5.M(obj);
        p1f0 p1f0VarW = rrn1.w(str);
        p1f0VarW.B(tqwVar != null ? n3o1.y(tqwVar) : null);
        jw2.e(jw2Var).f(p1f0VarW.h());
        return rih1.a;
    }
}
