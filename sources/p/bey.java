package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class bey implements qey {
    public final aey a;

    public bey(aey aeyVar) {
        this.a = aeyVar;
    }

    @Override // p.qey
    public final String a(ttm1 ttm1Var, pey peyVar) {
        aey aeyVar = ttm1Var.e;
        aey aeyVar2 = this.a;
        if (aeyVar2 == aeyVar) {
            return b(ttm1Var, peyVar);
        }
        n57.e("This decorator is meant to be used with " + aeyVar2 + " entities, and was used with " + aeyVar + ", this should not happen");
        return null;
    }

    public abstract String b(ttm1 ttm1Var, pey peyVar);
}
