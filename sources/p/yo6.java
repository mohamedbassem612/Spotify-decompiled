package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yo6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo6(String str, String str2, Function0 function0, int i) {
        super(2);
        this.c = str;
        this.d = str2;
        this.b = function0;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        String str = this.d;
        String str2 = this.c;
        Function0 function0 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                iko1.e(czo1.p(i | 1), str2, str, function0, b0kVar);
                break;
            default:
                fqo1.h(czo1.p(i | 1), str2, str, function0, b0kVar);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo6(Function0 function0, String str, String str2, int i) {
        super(2);
        this.b = function0;
        this.c = str;
        this.d = str2;
        this.e = i;
    }
}
