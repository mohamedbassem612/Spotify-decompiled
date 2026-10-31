package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class znr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ znr(aor aorVar, byte b) {
        super(1);
        this.a = b;
        this.b = aorVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        aor aorVar = this.b;
        switch (b) {
            case 0:
                f3l f3lVar = (f3l) obj;
                unr unrVar = (unr) aorVar.c.get();
                return new qer(new yv8(vby0.r(unrVar.a, unrVar.b, f3lVar.j), (byte) 3), f3lVar, (byte) 5);
            default:
                ((qtr) obj).b(new ep0(aorVar, (lnm) null, (byte) 25));
                return rih1.a;
        }
    }
}
