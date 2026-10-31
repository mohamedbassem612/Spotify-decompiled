package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xv20 implements mr20 {
    public final /* synthetic */ ezc a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public xv20(ezc ezcVar, String str, boolean z) {
        this.a = ezcVar;
        this.b = str;
        this.c = z;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        Object objCollect = this.a.collect(new wv20(vr20Var, this.b, this.c), lnmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
