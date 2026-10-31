package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v3s extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ s3s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3s(s3s s3sVar, lnm lnmVar) {
        super(lnmVar);
        this.c = s3sVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
