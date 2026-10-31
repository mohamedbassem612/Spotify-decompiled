package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ptd extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptd(Function0 function0, String str, String str2, String str3, int i) {
        super(2);
        this.a = (byte) 4;
        this.e = function0;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                d4o1.a(czo1.p(i | 1), this.b, this.c, this.d, this.e, (b0k) obj);
                break;
            case 1:
                ((Number) obj2).intValue();
                w2g0.d(czo1.p(i | 1), this.b, this.c, this.d, this.e, (b0k) obj);
                break;
            case 2:
                ((Number) obj2).intValue();
                w2g0.d(czo1.p(i | 1), this.b, this.c, this.d, this.e, (b0k) obj);
                break;
            case 3:
                ((Number) obj2).intValue();
                yoo1.k(czo1.p(i | 1), this.b, this.c, this.d, this.e, (b0k) obj);
                break;
            default:
                ((Number) obj2).intValue();
                eko1.p(czo1.p(i | 1), this.b, this.c, this.d, this.e, (b0k) obj);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ptd(String str, String str2, String str3, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = function0;
        this.f = i;
    }
}
