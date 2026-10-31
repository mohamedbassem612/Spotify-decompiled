package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ynu extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hux b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ynu(hux huxVar, String str, boolean z, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = huxVar;
        this.c = str;
        this.d = z;
        this.e = function0;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                pxd0.h(czo1.p(b2 | 1), this.c, this.e, (b0k) obj, this.b, this.d);
                break;
            default:
                ((Number) obj2).intValue();
                sgc1.h(czo1.p(b2 | 1), this.c, this.e, (b0k) obj, this.b, this.d);
                break;
        }
        return rih1Var;
    }
}
