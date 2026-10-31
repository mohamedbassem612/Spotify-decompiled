package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eks extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hur b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eks(hur hurVar, byte b) {
        super(1);
        this.a = b;
        this.b = hurVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hur hurVar = this.b;
        switch (b) {
            case 0:
                return rqt0.F(igu.b, new dks(hurVar, (String) obj, null, (byte) 0));
            default:
                return rqt0.F(igu.b, new dks(hurVar, (String) obj, null, (byte) 1));
        }
    }
}
