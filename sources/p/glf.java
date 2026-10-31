package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class glf extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ hux c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glf(String str, hux huxVar, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 4;
        this.b = str;
        this.c = huxVar;
        this.e = function0;
        this.d = qim0Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                buo1.a(czo1.p(i | 1), this.b, this.e, (b0k) obj, this.c, this.d);
                break;
            case 1:
                ((Number) obj2).intValue();
                zpn1.d(czo1.p(i | 1), this.b, this.e, (b0k) obj, this.c, this.d);
                break;
            case 2:
                ((Number) obj2).intValue();
                w130.b(czo1.p(i | 1), this.b, this.e, (b0k) obj, this.c, this.d);
                break;
            case 3:
                ((Number) obj2).intValue();
                hqq0.a(czo1.p(i | 1), this.b, this.e, (b0k) obj, this.c, this.d);
                break;
            case 4:
                ((Number) obj2).intValue();
                rqt0.o(czo1.p(i | 1), this.b, this.e, (b0k) obj, this.c, this.d);
                break;
            default:
                ((Number) obj2).intValue();
                pvm1.b(czo1.p(i | 1), this.b, this.e, (b0k) obj, this.c, this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glf(String str, hux huxVar, qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = huxVar;
        this.d = qim0Var;
        this.e = function0;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glf(hux huxVar, String str, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = huxVar;
        this.b = str;
        this.e = function0;
        this.d = qim0Var;
        this.f = i;
    }
}
