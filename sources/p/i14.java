package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i14 extends a8d1 implements xu30 {
    public /* synthetic */ c9n a;
    public /* synthetic */ float b;
    public final /* synthetic */ s24 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i14(s24 s24Var, lnm lnmVar) {
        super(3, lnmVar);
        this.c = s24Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        i14 i14Var = new i14(this.c, (lnm) obj3);
        i14Var.a = (c9n) obj;
        i14Var.b = fFloatValue;
        rih1 rih1Var = rih1.a;
        i14Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        fn31.T(this.a, (o8n) null, 0, new mz2(this.c, this.b, (lnm) null, (byte) 1), 3);
        return rih1.a;
    }
}
