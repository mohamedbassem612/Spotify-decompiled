package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class osm extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ldo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ osm(ldo ldoVar, byte b) {
        super(1);
        this.a = b;
        this.b = ldoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ldo ldoVar = this.b;
        switch (b) {
            case 0:
                return ((hum) ldoVar.d).a((String) ldoVar.c);
            default:
                ((qtr) obj).b(new psm(ldoVar, null, (byte) 0));
                return rih1.a;
        }
    }
}
