package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ndk extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tdk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndk(tdk tdkVar, byte b) {
        super(1);
        this.a = b;
        this.b = tdkVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tdk tdkVar = this.b;
        switch (b) {
            case 0:
                return tdkVar.Q0.getString(((Number) obj).intValue());
            default:
                ((qtr) obj).b(new gz0(tdkVar, (lnm) null, (byte) 5));
                return rih1.a;
        }
    }
}
