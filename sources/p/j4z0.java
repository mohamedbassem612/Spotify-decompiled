package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j4z0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ewe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4z0(ewe eweVar, byte b) {
        super(1);
        this.a = b;
        this.b = eweVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ewe eweVar = this.b;
        switch (b) {
            case 0:
                return (h3h1) eweVar.h;
            default:
                ((Number) obj).intValue();
                return ((h7l0) ((hyy0) eweVar.f).c).b();
        }
    }
}
