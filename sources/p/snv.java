package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class snv extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snv(int i, int i2, Function0 function0, boolean z) {
        super(2);
        this.a = (byte) 3;
        this.b = i;
        this.e = function0;
        this.d = z;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                Function0 function0 = this.e;
                int iP = czo1.p(1);
                yon1.l(this.b, this.c, this.d, function0, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                Function0 function1 = this.e;
                int iP2 = czo1.p(1);
                k8p1.a(this.b, this.c, this.d, function1, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                Function0 function2 = this.e;
                int iP3 = czo1.p(1);
                vbe.k(this.b, this.c, this.d, function2, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(1 | this.c);
                n3o1.b(this.b, iP4, this.e, (b0k) obj, this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ snv(int i, int i2, boolean z, Function0 function0, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = function0;
    }
}
