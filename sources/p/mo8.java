package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mo8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ po8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo8(po8 po8Var, byte b) {
        super(1);
        this.a = b;
        this.b = po8Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        po8 po8Var = this.b;
        switch (b) {
            case 0:
                return new lo8((Object) po8Var, obj, (byte) 0);
            case 1:
                ((Number) obj).intValue();
                return po8Var.j.b();
            default:
                return new h3j1(po8Var.c.a, 30);
        }
    }
}
