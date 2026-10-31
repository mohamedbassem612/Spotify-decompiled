package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jni1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nbh b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jni1(nbh nbhVar, String str, String str2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = nbhVar;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        String str = this.d;
        String str2 = this.c;
        nbh nbhVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                wro1.f(nbhVar, str2, str, b0kVar, czo1.p(i | 1));
                break;
            default:
                wro1.o(nbhVar, str2, str, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
