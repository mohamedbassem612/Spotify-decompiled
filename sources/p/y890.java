package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y890 extends onm {
    public byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ lnm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y890(lnm lnmVar, o8n o8nVar, vu30 vu30Var, lnm lnmVar2) {
        super(lnmVar, o8nVar);
        this.b = vu30Var;
        this.c = lnmVar2;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        if (b == 0) {
            this.a = (byte) 1;
            hm5.M(obj);
            vu30 vu30Var = this.b;
            w0h1.o(2, vu30Var);
            return vu30Var.invoke(this.c, this);
        }
        if (b != 1) {
            eg.m("This coroutine had already completed");
            return null;
        }
        this.a = (byte) 2;
        hm5.M(obj);
        return obj;
    }
}
