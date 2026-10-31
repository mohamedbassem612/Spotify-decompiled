package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a8m extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ short b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a8m(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ((f8m) obj6).i((m7m) obj5, (kes) obj4, (qim0) obj3, (b0k) obj, czo1.p(s | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                ((ouz) obj6).d((qt90) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(s | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                upo1.h((j2i) obj6, (j2i) obj5, (xu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(s | 1));
                break;
            default:
                ((Number) obj2).intValue();
                two1.o((String) obj6, (r061) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(s | 1));
                break;
        }
        return rih1Var;
    }
}
