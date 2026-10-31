package p;

import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mux extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ short d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mux(b180 b180Var, ksl kslVar, qim0 qim0Var, p3v p3vVar, zvx zvxVar, ecx ecxVar, j6m j6mVar, tl3 tl3Var, ColorFilter colorFilter, int i, int i2) {
        super(2);
        this.e = b180Var;
        this.f = kslVar;
        this.b = qim0Var;
        this.g = p3vVar;
        this.h = zvxVar;
        this.i = ecxVar;
        this.t = j6mVar;
        this.X = tl3Var;
        this.Y = colorFilter;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        Object obj10 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                short s = this.d;
                qim0 qim0Var = this.b;
                eso1.g((b180) obj10, (ksl) obj9, qim0Var, (p3v) obj8, (zvx) obj7, (ecx) obj6, (j6m) obj5, (tl3) obj4, (ColorFilter) obj3, (b0k) obj, iP, s);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                short s2 = this.d;
                grn1.j((zk80) obj10, (Function0) obj9, (Function0) obj8, (String) obj7, (String) obj6, (String) obj5, (u7h) obj4, (u7h) obj3, this.b, (b0k) obj, iP2, s2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mux(zk80 zk80Var, Function0 function0, Function0 function1, String str, String str2, String str3, u7h u7hVar, u7h u7hVar2, qim0 qim0Var, int i, int i2) {
        super(2);
        this.e = zk80Var;
        this.f = function0;
        this.g = function1;
        this.h = str;
        this.i = str2;
        this.t = str3;
        this.X = u7hVar;
        this.Y = u7hVar2;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
    }
}
