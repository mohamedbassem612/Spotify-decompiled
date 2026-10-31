package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pcd0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cac b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pcd0(cac cacVar, byte b) {
        super(1);
        this.a = b;
        this.b = cacVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cac cacVar = this.b;
        switch (b) {
            case 0:
                return ((fg60) cacVar.c).c;
            default:
                return new ocd0(((Boolean) ((fg60) cacVar.c).c.a.getValue()).booleanValue());
        }
    }
}
