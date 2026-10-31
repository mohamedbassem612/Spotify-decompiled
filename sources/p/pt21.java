package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pt21 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rpv0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt21(rpv0 rpv0Var, onm onmVar) {
        super(onmVar);
        this.c = rpv0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objM = this.c.m((String) null, this);
        return objM == d9n.a ? objM : new e331(objM);
    }
}
