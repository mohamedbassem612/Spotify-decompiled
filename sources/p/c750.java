package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c750 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ j2i h;
    public final /* synthetic */ int i;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c750(Function0 function0, qim0 qim0Var, boolean z, String str, max maxVar, float f, boolean z2, j2i j2iVar, int i, int i2) {
        super(2);
        this.b = function0;
        this.c = qim0Var;
        this.d = z;
        this.e = str;
        this.X = maxVar;
        this.f = f;
        this.g = z2;
        this.h = j2iVar;
        this.i = i;
        this.t = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.i;
        Object obj3 = this.X;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                String str = (String) obj3;
                int iP = czo1.p(i | 1);
                byte b2 = this.t;
                obg1.e(this.d, this.e, this.c, this.f, this.g, str, this.h, this.b, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.t;
                Function0 function0 = this.b;
                qim0 qim0Var = this.c;
                boolean z = this.d;
                String str2 = this.e;
                nz80.f(function0, qim0Var, z, str2, (max) obj3, this.f, this.g, this.h, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c750(boolean z, String str, qim0 qim0Var, float f, boolean z2, String str2, j2i j2iVar, Function0 function0, int i, int i2) {
        super(2);
        this.d = z;
        this.e = str;
        this.c = qim0Var;
        this.f = f;
        this.g = z2;
        this.X = str2;
        this.h = j2iVar;
        this.b = function0;
        this.i = i;
        this.t = i2;
    }
}
