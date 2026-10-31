package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d3a extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e3a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3a(e3a e3aVar, byte b) {
        super(1);
        this.a = b;
        this.b = e3aVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        e3a e3aVar = this.b;
        switch (b) {
            case 0:
                return e3aVar.a.a(((b3a) obj).a);
            default:
                ((qtr) obj).b(new f3(e3aVar, (lnm) null, (byte) 6));
                return rih1.a;
        }
    }
}
