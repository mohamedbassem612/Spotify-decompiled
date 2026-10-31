package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cbh0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ hux b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbh0(hux huxVar, String str, boolean z, Function0 function0, int i) {
        super(2);
        this.b = huxVar;
        this.c = str;
        this.d = z;
        this.e = function0;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                a6o1.f(czo1.p(i | 1), this.c, this.e, (b0k) obj, this.b, this.d);
                break;
            default:
                ((Number) obj2).intValue();
                rr51.c(czo1.p(i | 1), this.c, this.e, (b0k) obj, this.b, this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbh0(boolean z, String str, hux huxVar, Function0 function0, int i) {
        super(2);
        this.d = z;
        this.c = str;
        this.b = huxVar;
        this.e = function0;
        this.f = i;
    }
}
