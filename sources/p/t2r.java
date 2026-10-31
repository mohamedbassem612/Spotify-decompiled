package p;

import com.spotify.kodiak.table.table.DataSourceException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t2r extends a8d1 implements zu30 {
    public boolean a;
    public /* synthetic */ jh5 b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wlu e;
    public final /* synthetic */ tka0 f;
    public final /* synthetic */ wd2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2r(wlu wluVar, tka0 tka0Var, wd2 wd2Var, lnm lnmVar) {
        super(4, lnmVar);
        this.e = wluVar;
        this.f = tka0Var;
        this.g = wd2Var;
    }

    @Override // p.zu30
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        tka0 tka0Var = this.f;
        wd2 wd2Var = this.g;
        t2r t2rVar = new t2r(this.e, tka0Var, wd2Var, (lnm) obj4);
        t2rVar.b = (jh5) obj;
        t2rVar.c = obj2;
        t2rVar.d = obj3;
        return t2rVar.invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException$InvalidAction */
    @Override // p.faa
    public final Object invokeSuspend(Object obj) throws DataSourceException.InvalidAction {
        jh5 jh5Var = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            if (!u890.j(jh5Var.a, this.e)) {
                throw new DataSourceException.InvalidAction(jh5Var, obj2);
            }
            Object obj4 = jh5Var.b;
            String str = obj4 instanceof String ? (String) obj4 : null;
            if (str == null) {
                throw new DataSourceException.InvalidAction(jh5Var, obj2);
            }
            v3b1.T0.invoke(str);
            if (!Boolean.TRUE.booleanValue() || !((wdg) this.f).n().isInstance(obj2)) {
                throw new DataSourceException.InvalidAction(jh5Var, obj2);
            }
            this.b = null;
            this.c = null;
            this.d = null;
            this.a = true;
            obj = this.g.J(str, obj2, (ez00) obj3, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return new dkm((mr20) obj, (byte) 18);
    }
}
