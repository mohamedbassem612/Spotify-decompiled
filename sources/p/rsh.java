package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rsh extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ short c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ cv30 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rsh(String str, boolean z, String str2, Function0 function0, qim0 qim0Var, String str3, int i, int i2) {
        super(2);
        this.e = str;
        this.b = z;
        this.f = str2;
        this.g = function0;
        this.h = qim0Var;
        this.i = str3;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.c;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Function0 function0 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                byte b2 = this.d;
                boolean z = this.b;
                bth.a((iu30) obj6, (j2i) function0, (vu30) obj4, (vu30) obj3, z, (iu30) obj5, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                byte b3 = this.d;
                boolean z2 = this.b;
                v8r.e((String) obj6, z2, (String) obj5, function0, (qim0) obj4, (String) obj3, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rsh(iu30 iu30Var, j2i j2iVar, vu30 vu30Var, vu30 vu30Var2, boolean z, iu30 iu30Var2, int i, int i2) {
        super(2);
        this.e = iu30Var;
        this.g = j2iVar;
        this.h = vu30Var;
        this.i = vu30Var2;
        this.b = z;
        this.f = iu30Var2;
        this.c = i;
        this.d = i2;
    }
}
