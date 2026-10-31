package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yo7 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo7(int i, String str, String str2, Function0 function0, Function0 function1, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, boolean z, boolean z2) {
        super(2);
        this.a = (byte) 4;
        this.e = str;
        this.b = z;
        this.c = z2;
        this.f = iu30Var;
        this.g = function0;
        this.h = iu30Var2;
        this.i = function1;
        this.t = qim0Var;
        this.X = str2;
        this.d = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.X;
        Object obj4 = this.t;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                boolean z = this.c;
                int iP = czo1.p(1);
                int i2 = this.d;
                boolean z2 = this.b;
                ((fp7) obj9).b(i2, z2, (xu30) obj8, (xu30) obj7, (xu30) obj6, (xu30) obj5, (xu30) obj4, (xu30) obj3, z, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                boolean z3 = this.b;
                boolean z4 = this.c;
                ((f8m) obj9).g((mr10) obj8, (String) obj7, (String) obj6, (qim0) obj5, z3, z4, (iu30) obj4, (l7c1) obj3, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                boolean z5 = this.b;
                boolean z6 = this.c;
                int i3 = this.d;
                i1p1.a((String) obj9, z5, z6, (String) obj8, (String) obj7, (String) obj6, i3, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                boolean z7 = this.b;
                boolean z8 = this.c;
                pwo1.f((i2c) obj9, (rdm1) obj8, (tob1) obj7, (tob1) obj6, (Set) obj5, z7, z8, (idm1) obj4, (iu30) obj3, (b0k) obj, iP4);
                break;
            case 4:
                ((Number) obj2).intValue();
                String str = (String) obj3;
                int iP5 = czo1.p(i | 1);
                f5p1.g(iP5, (String) obj9, str, (Function0) obj7, (Function0) obj5, (b0k) obj, (iu30) obj8, (iu30) obj6, (qim0) obj4, this.b, this.c);
                break;
            default:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                x2g0.w((hob1) obj9, (vu30) obj8, (j2i) obj7, (j2i) obj6, (j2i) obj5, (j2i) obj4, (qim0) obj3, this.b, this.c, (b0k) obj, iP6);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yo7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, boolean z2, Object obj6, Object obj7, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
        this.b = z;
        this.c = z2;
        this.t = obj6;
        this.X = obj7;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo7(String str, boolean z, boolean z2, String str2, String str3, String str4, int i, Function0 function0, Function0 function1, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 2;
        this.e = str;
        this.b = z;
        this.c = z2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.d = i;
        this.i = function0;
        this.t = function1;
        this.X = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo7(fp7 fp7Var, int i, boolean z, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, boolean z2, int i2) {
        super(2);
        this.a = (byte) 0;
        this.e = fp7Var;
        this.d = i;
        this.b = z;
        this.f = xu30Var;
        this.g = xu30Var2;
        this.h = xu30Var3;
        this.i = xu30Var4;
        this.t = xu30Var5;
        this.X = xu30Var6;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo7(hob1 hob1Var, vu30 vu30Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, qim0 qim0Var, boolean z, boolean z2, int i) {
        super(2);
        this.a = (byte) 5;
        this.e = hob1Var;
        this.f = vu30Var;
        this.g = j2iVar;
        this.h = j2iVar2;
        this.i = j2iVar3;
        this.t = j2iVar4;
        this.X = qim0Var;
        this.b = z;
        this.c = z2;
        this.d = i;
    }
}
