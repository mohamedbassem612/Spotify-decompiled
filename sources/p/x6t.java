package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x6t implements sdm {
    public final Context a;
    public final rmr b;

    public x6t(Context context, rmr rmrVar) {
        this.a = context;
        this.b = rmrVar;
    }

    @Override // p.sdm
    public final /* bridge */ /* synthetic */ Object a(oim oimVar, us0 us0Var) {
        return b((y6t) oimVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kjm b(y6t y6tVar) {
        igm igmVar = new igm(this.a.getString(2131958560), null, 0 == true ? 1 : 0, 6);
        smc0 smc0VarN = k4p1.n();
        tom tomVar = y6tVar.a;
        rmr rmrVar = this.b;
        smc0VarN.add(rmrVar.b(tomVar, false));
        smc0VarN.add(rmrVar.b(y6tVar.a, true));
        return new kjm(igmVar, k4p1.k(smc0VarN), 4);
    }
}
