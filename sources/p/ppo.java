package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ppo extends a8d1 implements xu30 {
    public /* synthetic */ float a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ o8n c;
    public final /* synthetic */ upo d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ iu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppo(c9n c9nVar, o8n o8nVar, upo upoVar, float f, Function0 function0, iu30 iu30Var, lnm lnmVar) {
        super(3, lnmVar);
        this.b = c9nVar;
        this.c = o8nVar;
        this.d = upoVar;
        this.e = f;
        this.f = function0;
        this.g = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        Function0 function0 = this.f;
        iu30 iu30Var = this.g;
        ppo ppoVar = new ppo(this.b, this.c, this.d, this.e, function0, iu30Var, (lnm) obj3);
        ppoVar.a = fFloatValue;
        rih1 rih1Var = rih1.a;
        ppoVar.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        float f = this.a;
        hm5.M(obj);
        fn31.T(this.b, this.c, 0, new nr9(this.d, f, this.e, this.f, this.g, (lnm) null), 2);
        return rih1.a;
    }
}
