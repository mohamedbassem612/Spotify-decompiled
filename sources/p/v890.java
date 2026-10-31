package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v890 extends n031 {
    public byte a;
    public final /* synthetic */ sty b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v890(lnm lnmVar, sty styVar) {
        super(lnmVar);
        this.b = styVar;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        if (b == 0) {
            this.a = (byte) 1;
            hm5.M(obj);
            sty styVar = this.b;
            w0h1.o(1, styVar);
            return styVar.invoke(this);
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
