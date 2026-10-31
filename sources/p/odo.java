package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class odo extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odo(String str, boolean z, Function0 function0, int i) {
        super(2);
        this.c = str;
        this.b = z;
        this.d = function0;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Function0 function0 = this.d;
        String str = this.c;
        boolean z = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ouo1.h(czo1.p(i | 1), str, function0, b0kVar, z);
                break;
            default:
                kyo1.f(czo1.p(i | 1), str, function0, b0kVar, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odo(boolean z, String str, Function0 function0, int i) {
        super(2);
        this.b = z;
        this.c = str;
        this.d = function0;
        this.e = i;
    }
}
