package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class juj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ luj b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ juj(luj lujVar, boolean z, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = lujVar;
        this.c = z;
        this.d = j2iVar;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        j2i j2iVar = this.d;
        boolean z = this.c;
        luj lujVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                lujVar.d(z, j2iVar, b0kVar, czo1.p(i | 1));
                break;
            default:
                lujVar.d(z, j2iVar, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
