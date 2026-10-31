package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zle extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eme b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zle(eme emeVar, byte b) {
        super(1);
        this.a = b;
        this.b = emeVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        eme emeVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return emeVar.t.b();
            case 1:
                return new h3h1(new zle(emeVar, (byte) 0));
            default:
                ((Number) obj).intValue();
                return emeVar.t.b();
        }
    }
}
