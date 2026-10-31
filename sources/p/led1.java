package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class led1 implements lnm {
    public final /* synthetic */ ifl1 a;
    public final /* synthetic */ tqt b;

    public led1(tqt tqtVar, ifl1 ifl1Var) {
        this.b = tqtVar;
        this.a = ifl1Var;
    }

    @Override // p.lnm
    public final o8n getContext() {
        return o6x.a;
    }

    @Override // p.lnm
    public final void resumeWith(Object obj) {
        tqt tqtVar = this.b;
        ifl1 ifl1Var = this.a;
        try {
            if (obj != null) {
                mmr0 mmr0Var = (mmr0) obj;
                Object obj2 = mmr0Var.b;
                Object obj3 = mmr0Var.a;
                tqtVar.F(((Integer) obj3).intValue());
                if (((Integer) obj3).intValue() == 0) {
                    tqtVar.E((String) obj2);
                } else {
                    tqtVar.E((String) obj2);
                }
            }
        } catch (Exception e) {
            i1k0.n("Error in continuation: " + e);
        } finally {
            ifl1Var.m();
        }
    }
}
