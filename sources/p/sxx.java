package p;

import android.util.LruCache;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sxx extends hab0 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object O0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ short g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sxx(List list, List list2, int i, boolean z, LruCache lruCache, q8n q8nVar, Function0 function0, iu30 iu30Var, Function0 function1, p8i0 p8i0Var, Function0 function2, int i2, int i3, int i4) {
        super(2);
        this.h = list;
        this.i = list2;
        this.b = i;
        this.c = z;
        this.t = lruCache;
        this.X = q8nVar;
        this.d = function0;
        this.Y = iu30Var;
        this.Z = function1;
        this.N0 = p8i0Var;
        this.O0 = function2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        int i2 = this.e;
        Object obj3 = this.O0;
        Object obj4 = this.N0;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        Object obj7 = this.X;
        Object obj8 = this.t;
        Object obj9 = this.i;
        Object obj10 = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i2 | 1);
                int iP2 = czo1.p(i);
                short s = this.g;
                boolean z = this.c;
                Function0 function0 = this.d;
                m5n1.c(z, function0, (j2i) obj10, (qim0) obj9, (vu30) obj8, (idn0) obj6, (max) obj5, (vu30) obj7, (hw61) obj4, (ga80) obj3, this.b, (b0k) obj, iP, iP2, s);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i2 | 1);
                int iP4 = czo1.p(i);
                short s2 = this.g;
                int i3 = this.b;
                boolean z2 = this.c;
                Function0 function1 = this.d;
                dko1.i((List) obj10, (List) obj9, i3, z2, (LruCache) obj8, (q8n) obj7, function1, (iu30) obj6, (Function0) obj5, (p8i0) obj4, (Function0) obj3, (b0k) obj, iP3, iP4, s2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sxx(boolean z, Function0 function0, j2i j2iVar, qim0 qim0Var, vu30 vu30Var, idn0 idn0Var, max maxVar, vu30 vu30Var2, hw61 hw61Var, ga80 ga80Var, int i, int i2, int i3, int i4) {
        super(2);
        this.c = z;
        this.d = function0;
        this.h = j2iVar;
        this.i = qim0Var;
        this.t = vu30Var;
        this.Y = idn0Var;
        this.Z = maxVar;
        this.X = vu30Var2;
        this.N0 = hw61Var;
        this.O0 = ga80Var;
        this.b = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }
}
