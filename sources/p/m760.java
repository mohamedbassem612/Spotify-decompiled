package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m760 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ woa b;
    public final /* synthetic */ uoa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m760(woa woaVar, uoa uoaVar, byte b) {
        super(1);
        this.a = b;
        this.b = woaVar;
        this.c = uoaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        uoa uoaVar = this.c;
        woa woaVar = this.b;
        switch (b) {
            case 0:
                return new l760(woaVar, uoaVar, (byte) 0);
            case 1:
                return new l760(woaVar, uoaVar, (byte) 1);
            default:
                return new l760(woaVar, uoaVar, (byte) 2);
        }
    }
}
