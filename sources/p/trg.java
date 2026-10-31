package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class trg extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ trg(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.d = obj;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                trg trgVar = new trg((hf2) obj6, (lnm) obj5, (byte) 0);
                trgVar.b = (org) obj3;
                trgVar.c = (tqw) obj4;
                trgVar.invokeSuspend(rih1Var);
                break;
            default:
                trg trgVar2 = new trg((s801) obj6, (lnm) obj5, (byte) 1);
                trgVar2.b = (xag1) obj2;
                trgVar2.c = (wag1) obj3;
                trgVar2.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                hf2 hf2Var = (hf2) obj2;
                org orgVar = (org) this.b;
                tqw tqwVar = (tqw) this.c;
                hm5.M(obj);
                if (u890.j(orgVar, mrg.a)) {
                    hf2.f(hf2Var).e(mqn1.h());
                    hf2.f(hf2Var).f(mqn1.h());
                }
                hf2.e(hf2Var).a(tqwVar != null ? n3o1.y(tqwVar) : null);
                return rih1Var;
            default:
                xag1 xag1Var = (xag1) this.b;
                wag1 wag1Var = (wag1) this.c;
                hm5.M(obj);
                if (u890.j(wag1Var, wag1.a)) {
                    s801.b((s801) obj2, xag1Var.a());
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }
}
