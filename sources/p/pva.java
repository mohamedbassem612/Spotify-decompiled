package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class pva implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qva b;

    public /* synthetic */ pva(qva qvaVar, byte b) {
        this.a = b;
        this.b = qvaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qva qvaVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                mmo mmoVar = qvaVar.I1.j1;
                if (mmoVar != null) {
                    mmoVar.b(str, qvaVar);
                    return rih1Var;
                }
                u890.C("currentFragmentAccessor");
                throw null;
            default:
                qvaVar.W1.a(((Integer) obj).intValue());
                return rih1Var;
        }
    }
}
