package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vsh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsh(String str, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 3:
                this.b = str;
                this.c = function0;
                this.d = i;
                super(2);
                break;
            default:
                this.b = str;
                this.c = function0;
                this.d = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Function0 function0 = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                bth.f(czo1.p(i | 1), str, function0, b0kVar);
                break;
            case 1:
                poo1.m(czo1.p(i | 1), str, function0, b0kVar);
                break;
            case 2:
                u0p1.f(czo1.p(i | 1), str, function0, b0kVar);
                break;
            default:
                u0p1.g(czo1.p(i | 1), str, function0, b0kVar);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vsh(byte b, int i, String str, Function0 function0, boolean z) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = function0;
        this.d = i;
    }
}
