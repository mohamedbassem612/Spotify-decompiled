package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zsa0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ata0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsa0(ata0 ata0Var, onm onmVar) {
        super(onmVar);
        this.c = ata0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
