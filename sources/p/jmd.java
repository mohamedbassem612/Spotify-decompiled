package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jmd extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmd(String str, int i, String str2, qim0 qim0Var, Function0 function0, int i2) {
        super(2);
        this.a = (byte) 1;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = qim0Var;
        this.f = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                k1o1.b(czo1.p(i | 1), this.b, this.d, this.f, (b0k) obj, this.e);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP = czo1.p(3073);
                y4o1.c(this.c, iP, this.b, this.d, this.f, (b0k) obj, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                crn1.i(czo1.p(i | 1), this.b, this.d, this.f, (b0k) obj, this.e);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmd(String str, String str2, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.d = str2;
        this.f = function0;
        this.e = qim0Var;
        this.c = i;
    }
}
