package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jxl extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxl(String str, String str2, String str3, String str4, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = qim0Var;
        this.g = iu30Var;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                pxl.a(czo1.p(i | 1), this.b, this.c, this.d, this.e, (b0k) obj, this.g, this.f);
                break;
            default:
                ((Number) obj2).intValue();
                pxl.b(czo1.p(i | 1), this.b, this.c, this.d, this.e, (b0k) obj, this.g, this.f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxl(String str, String str2, String str3, qim0 qim0Var, String str4, iu30 iu30Var, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = qim0Var;
        this.e = str4;
        this.g = iu30Var;
        this.h = i;
    }
}
