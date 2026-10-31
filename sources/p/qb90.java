package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qb90 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb90(c9n c9nVar, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = c9nVar;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                fn31.T(this.b, (o8n) null, 0, new w73(this.c, (lnm) null, (byte) 5), 3);
                return new pb90((byte) 0);
            default:
                fn31.T(this.b, (o8n) null, 0, new w73(this.c, (lnm) null, (byte) 14), 3);
                return new pb90((byte) 1);
        }
    }
}
