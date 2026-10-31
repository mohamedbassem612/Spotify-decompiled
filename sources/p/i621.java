package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i621 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i621(String str, String str2, Function0 function0, boolean z, int i, int i2) {
        super(2);
        this.b = str;
        this.f = str2;
        this.c = function0;
        this.d = z;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(this.e | 1);
                String str = this.b;
                boolean z = this.d;
                Function0 function0 = this.c;
                w6p1.e(str, z, function0, (Function0) obj3, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(49);
                byte b2 = this.e;
                String str2 = this.b;
                r6p1.n(str2, (String) obj3, this.c, this.d, (b0k) obj, iP2, b2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i621(String str, boolean z, Function0 function0, Function0 function1, int i) {
        super(2);
        this.b = str;
        this.d = z;
        this.c = function0;
        this.f = function1;
        this.e = i;
    }
}
