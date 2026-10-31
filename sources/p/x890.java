package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x890 extends n031 {
    public byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ lnm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x890(lnm lnmVar, lnm lnmVar2, vu30 vu30Var) {
        super(lnmVar);
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
