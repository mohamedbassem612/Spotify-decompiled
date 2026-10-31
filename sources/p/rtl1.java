package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rtl1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ jge c;
    public final /* synthetic */ ayh d;
    public final /* synthetic */ bbc e;
    public final /* synthetic */ xtl1 f;
    public final /* synthetic */ ssw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtl1(jge jgeVar, ayh ayhVar, bbc bbcVar, ssw0 ssw0Var, xtl1 xtl1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = jgeVar;
        this.d = ayhVar;
        this.e = bbcVar;
        this.g = ssw0Var;
        this.f = xtl1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new rtl1(this.c, this.d, this.e, this.g, this.f, lnmVar);
            default:
                return new rtl1(this.c, this.d, this.e, this.f, this.g, lnmVar);
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

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jge jgeVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                bbc bbcVar = this.e;
                ayh ayhVar = this.d;
                try {
                    if (!z) {
                        hm5.M(obj);
                        qtl1 qtl1Var = new qtl1(new l811(), this.g, this.f, ayhVar, bbcVar);
                        this.b = true;
                        if (jgeVar.collect(qtl1Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    ayhVar.m0(rih1Var);
                    bbcVar.H((Throwable) null);
                    return rih1Var;
                } catch (Throwable th) {
                    ayhVar.m0(rih1Var);
                    bbcVar.H((Throwable) null);
                    throw th;
                }
            default:
                boolean z2 = this.b;
                bbc bbcVar2 = this.e;
                ayh ayhVar2 = this.d;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        qtl1 qtl1Var2 = new qtl1(new l811(), this.f, this.g, ayhVar2, bbcVar2);
                        this.b = true;
                        if (jgeVar.collect(qtl1Var2, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    ayhVar2.y0(new CancellationException());
                    bbcVar2.H((Throwable) null);
                    return rih1Var;
                } catch (Throwable th2) {
                    ayhVar2.y0(new CancellationException());
                    bbcVar2.H((Throwable) null);
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtl1(jge jgeVar, ayh ayhVar, bbc bbcVar, xtl1 xtl1Var, ssw0 ssw0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = jgeVar;
        this.d = ayhVar;
        this.e = bbcVar;
        this.f = xtl1Var;
        this.g = ssw0Var;
    }
}
