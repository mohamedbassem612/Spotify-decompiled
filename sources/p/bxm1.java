package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bxm1 implements wnl {
    public final xpr a;

    public bxm1(xpr xprVar) {
        this.a = xprVar;
    }

    public final Object invoke(Object obj) {
        vnl vnlVar = (vnl) obj;
        if (vnlVar.b instanceof lml) {
            return vnlVar.a ? qnl.a : new tnl(vnlVar.c.u().getTagName());
        }
        return (unl) this.a.invoke(vnlVar);
    }
}
