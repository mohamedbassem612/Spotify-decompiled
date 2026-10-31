package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eim extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jim b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eim(jim jimVar, byte b) {
        super(1);
        this.a = b;
        this.b = jimVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jim jimVar = this.b;
        switch (b) {
            case 0:
                hxb hxbVar = (hxb) obj;
                if ((hxbVar instanceof gxb) && ((gxb) hxbVar).a != 2) {
                    jimVar.e.c();
                }
                return rih1.a;
            default:
                return new hp0(jimVar.f.c(new eim(jimVar, (byte) 0)), (byte) 4);
        }
    }
}
