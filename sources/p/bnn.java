package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bnn extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ tqw c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ maa f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bnn(maa maaVar, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.f = maaVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lwb1 lwb1Var = this.f;
        switch (b) {
            case 0:
                bnn bnnVar = new bnn((ldo) lwb1Var, (lnm) obj5, (byte) 0);
                bnnVar.d = (xmn) obj;
                bnnVar.e = (umn) obj3;
                bnnVar.c = (tqw) obj4;
                return bnnVar.invokeSuspend(rih1Var);
            default:
                bnn bnnVar2 = new bnn(lwb1Var, (lnm) obj5, (byte) 1);
                bnnVar2.d = (ewb1) obj2;
                bnnVar2.e = (dwb1) obj3;
                bnnVar2.c = (tqw) obj4;
                return bnnVar2.invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        String str;
        lzn0 lzn0Var;
        byte b = this.a;
        rih1 rih1Var = d9n.a;
        lwb1 lwb1Var = this.f;
        rih1 rih1Var2 = rih1.a;
        switch (b) {
            case 0:
                xmn xmnVar = (xmn) this.d;
                umn umnVar = (umn) this.e;
                tqw tqwVar = this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (umnVar instanceof smn) {
                    sr1 sr1Var = new sr1(xmnVar, tqwVar, (ldo) lwb1Var, (lnm) null, (byte) 7);
                    this.d = null;
                    this.e = null;
                    this.c = null;
                    this.b = true;
                    if (smo1.s(sr1Var, this) == rih1Var) {
                        return rih1Var;
                    }
                } else {
                    if (!(umnVar instanceof tmn)) {
                        eg.o();
                        return null;
                    }
                    vrv0 vrv0VarB = xmnVar.b();
                    if (vrv0VarB != null) {
                        vrv0VarB.l();
                    }
                }
                return rih1Var2;
            default:
                lwb1 lwb1Var2 = lwb1Var;
                ewb1 ewb1Var = (ewb1) this.d;
                dwb1 dwb1Var = (dwb1) this.e;
                tqw tqwVar2 = this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (!u890.j(dwb1Var, dwb1.a)) {
                        eg.o();
                    } else if (ewb1Var.a() && !ihc1.y0(ewb1Var.getContextUri())) {
                        iwb1 iwb1VarB = ewb1Var.b();
                        if (iwb1VarB instanceof gwb1) {
                            str = "LYRICS_STICKER";
                        } else if (iwb1VarB instanceof fwb1) {
                            str = "GRAPHIC_STICKER";
                        } else if (iwb1VarB instanceof hwb1) {
                            str = "NONE";
                        } else {
                            eg.o();
                        }
                        g931 g931VarG = lwb1.g(lwb1Var2);
                        String strG = ewb1Var.g();
                        String contextUri = ewb1Var.getContextUri();
                        this.d = ewb1Var;
                        this.e = null;
                        this.c = tqwVar2;
                        this.b = true;
                        g931VarG.r(strG, str, contextUri);
                        if (rih1Var2 == rih1Var) {
                            return rih1Var;
                        }
                        lzn0Var = (lzn0) lwb1.f(lwb1Var2).orElse(null);
                        if (lzn0Var != null) {
                            hqn1.r(ewb1Var.getContextUri(), tqwVar2, lzn0Var);
                        }
                    }
                    return null;
                }
                if (!z2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lzn0Var = (lzn0) lwb1.f(lwb1Var2).orElse(null);
                if (lzn0Var != null) {
                    hqn1.r(ewb1Var.getContextUri(), tqwVar2, lzn0Var);
                }
                return rih1Var2;
        }
    }
}
