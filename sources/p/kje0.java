package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kje0 extends hab0 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object O0;
    public final /* synthetic */ Object P0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kje0(String str, boolean z, boolean z2, boolean z3, String str2, List list, String str3, List list2, iu30 iu30Var, vu30 vu30Var, Function0 function0, Function0 function1, qim0 qim0Var, j2i j2iVar, int i, int i2) {
        super(2);
        this.t = str;
        this.e = z;
        this.f = z2;
        this.h = z3;
        this.X = str2;
        this.Z = list;
        this.Y = str3;
        this.N0 = list2;
        this.b = iu30Var;
        this.O0 = vu30Var;
        this.c = function0;
        this.d = function1;
        this.g = qim0Var;
        this.P0 = j2iVar;
        this.i = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.i;
        Object obj3 = this.P0;
        Object obj4 = this.O0;
        Object obj5 = this.N0;
        Object obj6 = this.Z;
        Object obj7 = this.Y;
        Object obj8 = this.X;
        Object obj9 = this.t;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                j2i j2iVar = (j2i) obj3;
                int iP = czo1.p(1);
                int iP2 = czo1.p(i);
                boolean z = this.e;
                boolean z2 = this.f;
                boolean z3 = this.h;
                iu30 iu30Var = this.b;
                b9p1.i((String) obj9, z, z2, z3, (String) obj8, (List) obj6, (String) obj7, (List) obj5, iu30Var, (vu30) obj4, this.c, this.d, this.g, j2iVar, (b0k) obj, iP, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                iu30 iu30Var2 = this.b;
                Function0 function0 = this.c;
                Function0 function1 = this.d;
                oon1.e((xag0) obj9, iu30Var2, (iu30) obj8, function0, function1, (Function0) obj7, (lzn0) obj6, (nwa) obj5, (ezc) obj4, (ezc) obj3, this.e, this.f, this.g, this.h, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kje0(xag0 xag0Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, Function0 function2, lzn0 lzn0Var, nwa nwaVar, ezc ezcVar, ezc ezcVar2, boolean z, boolean z2, qim0 qim0Var, boolean z3, int i) {
        super(2);
        this.t = xag0Var;
        this.b = iu30Var;
        this.X = iu30Var2;
        this.c = function0;
        this.d = function1;
        this.Y = function2;
        this.Z = lzn0Var;
        this.N0 = nwaVar;
        this.O0 = ezcVar;
        this.P0 = ezcVar2;
        this.e = z;
        this.f = z2;
        this.g = qim0Var;
        this.h = z3;
        this.i = i;
    }
}
