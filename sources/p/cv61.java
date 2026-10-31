package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cv61 extends a8d1 implements xu30 {
    public /* synthetic */ Context a;
    public final /* synthetic */ int b;
    public final /* synthetic */ kv61 c;
    public final /* synthetic */ bu61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv61(int i, kv61 kv61Var, bu61 bu61Var, lnm lnmVar) {
        super(3, lnmVar);
        this.b = i;
        this.c = kv61Var;
        this.d = bu61Var;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kv61 kv61Var = this.c;
        bu61 bu61Var = this.d;
        cv61 cv61Var = new cv61(this.b, kv61Var, bu61Var, (lnm) obj3);
        cv61Var.a = (Context) obj;
        return cv61Var.invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        Context context = this.a;
        hm5.M(obj);
        String str = this.b + ".subject";
        xlc1 xlc1VarD = kv61.d(this.c);
        bu61 bu61Var = this.d;
        hux huxVarB = bu61Var.b();
        String strT = zmo1.t(context, bu61Var.e(), bu61Var.d());
        strT.getClass();
        return new wu61(str, (String) null, xlc1VarD, new wlc1(huxVarB, strT, zmo1.t(context, bu61Var.c(), (String) null), bu61Var.a() instanceof yt61, zmo1.t(context, bu61Var.a().a(), (String) null)));
    }
}
