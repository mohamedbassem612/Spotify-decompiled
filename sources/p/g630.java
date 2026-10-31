package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g630 extends a8d1 implements iu30 {
    public x4i1 a;
    public h630 b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ h630 e;
    public final /* synthetic */ x4i1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g630(h630 h630Var, x4i1 x4i1Var, boolean z, String str, lnm lnmVar) {
        super(1, lnmVar);
        this.e = h630Var;
        this.f = x4i1Var;
        this.g = z;
        this.h = str;
    }

    public final lnm create(lnm lnmVar) {
        return new g630(this.e, this.f, this.g, this.h, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Boolean m231Var;
        Boolean bool;
        h630 h630Var;
        x4i1 x4i1Var;
        boolean z;
        boolean z2 = this.d;
        boolean z3 = this.g;
        x4i1 x4i1Var2 = this.f;
        h630 h630Var2 = this.e;
        try {
            if (!z2) {
                hm5.M(obj);
                hl0 hl0Var = new hl0(h630Var2, x4i1Var2, z3, (lnm) null, (byte) 9);
                this.a = x4i1Var2;
                this.b = h630Var2;
                this.c = z3;
                this.d = true;
                Object objM = rc2.M(3500L, hl0Var, this);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
                h630Var = h630Var2;
                x4i1Var = x4i1Var2;
                z = z3;
            } else {
                if (!z2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.c;
                h630Var = this.b;
                x4i1Var = this.a;
                hm5.M(obj);
            }
            h630Var.j(x4i1Var, z);
            m231Var = Boolean.TRUE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        String str = this.h;
        a530 a530VarA = e331.a(m231Var);
        if (a530VarA == null) {
            bool = m231Var;
        } else {
            try {
                if (!(a530VarA instanceof a530)) {
                    throw a530VarA;
                }
                String str2 = x4i1Var2.a;
                e630.b(h630Var2.a, a530VarA, new gh1(z3, h630Var2, str2, str, (byte) 13));
                bool = Boolean.FALSE;
            } catch (Throwable th2) {
                m231Var = new m231(th2);
                bool = m231Var;
            }
        }
        if (bool instanceof m231) {
            return null;
        }
        return bool;
    }
}
