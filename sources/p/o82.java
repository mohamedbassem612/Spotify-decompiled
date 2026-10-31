package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o82 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o82(String str, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = function0;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        Function0 function0 = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                fbp1.a(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 1:
                fq7.j(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 2:
                fq7.l(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 3:
                wgo1.c(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 4:
                adg.a(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 5:
                luo1.f(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 6:
                xyn1.g(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 7:
                yah0.j(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 8:
                ltn1.f(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 9:
                zgo1.d(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 10:
                tro1.l(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 11:
                e9k.f(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 12:
                b3o1.k(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 13:
                b3o1.m(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            case 14:
                yzo1.c(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
            default:
                ilo1.c(czo1.p(i | 1), str, function0, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o82(String str, qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.d = qim0Var;
        this.c = function0;
        this.e = i;
    }
}
