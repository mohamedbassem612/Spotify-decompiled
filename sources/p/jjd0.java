package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jjd0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjd0(int i, String str, String str2, String str3, boolean z, boolean z2, iu30 iu30Var) {
        super(3);
        this.e = i;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.b = z;
        this.c = z2;
        this.d = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                int i = this.e;
                l0p1.b(i, (String) obj6, (String) obj5, (String) obj4, this.b, this.c, this.d, null, (b0k) obj2, 0);
                break;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                z6d1 z6d1Var = (z6d1) obj6;
                boolean z = false;
                zho1.q(z6d1Var, null, b0kVar, 0, 2);
                List<y6d1> list = z6d1Var.e;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (y6d1 y6d1Var : list) {
                    arrayList.add(new nhf1(y6d1Var.b, y6d1Var.d));
                }
                j2i j2iVarR = apo.r(-1243313911, new y3z0(arrayList, this.d, this.e, (f6d1) obj4, (byte) 1), b0kVar);
                boolean z2 = this.b;
                zho1.y(z2, j2iVarR, b0kVar, 48);
                op71.g(b0kVar, u291.h(nim0.a, 40.0f));
                if (z6d1Var.f && z2) {
                    z = true;
                }
                zho1.x(z, this.c, (e6d1) obj5, this.d, null, b0kVar, 0, 16);
                break;
            case 2:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                b0i0 b0i0Var = (b0i0) obj6;
                int i2 = this.e;
                boolean z3 = this.b;
                b0i0Var.e((xyz0) obj5, z3, this.c, this.d, apo.r(1373627994, new ok7(b0i0Var, i2, (a401) obj4, (byte) 3, z3), b0kVar2), b0kVar2, 24576);
                break;
            case 3:
                ((Number) obj3).intValue();
                boolean z4 = this.c;
                boolean z5 = this.b;
                int i3 = this.e;
                nln.p((n8f1) obj6, (q8f1) obj5, z5, i3, (vu30) obj4, this.d, z4, (b0k) obj2, 64);
                break;
            default:
                ((Number) obj3).intValue();
                boolean z6 = this.c;
                boolean z7 = this.b;
                int i4 = this.e;
                iu30 iu30Var = this.d;
                x760.p((wff1) obj6, (zff1) obj5, z7, i4, iu30Var, (iu30) obj4, z6, (b0k) obj2, 64);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjd0(b0i0 b0i0Var, xyz0 xyz0Var, boolean z, boolean z2, iu30 iu30Var, a401 a401Var, int i) {
        super(3);
        this.f = b0i0Var;
        this.g = xyz0Var;
        this.b = z;
        this.c = z2;
        this.d = iu30Var;
        this.h = a401Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjd0(z6d1 z6d1Var, boolean z, boolean z2, e6d1 e6d1Var, iu30 iu30Var, int i, f6d1 f6d1Var) {
        super(3);
        this.f = z6d1Var;
        this.b = z;
        this.c = z2;
        this.g = e6d1Var;
        this.d = iu30Var;
        this.e = i;
        this.h = f6d1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjd0(n8f1 n8f1Var, q8f1 q8f1Var, boolean z, int i, vu30 vu30Var, iu30 iu30Var, boolean z2) {
        super(3);
        this.f = n8f1Var;
        this.g = q8f1Var;
        this.b = z;
        this.e = i;
        this.h = vu30Var;
        this.d = iu30Var;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjd0(wff1 wff1Var, zff1 zff1Var, boolean z, int i, iu30 iu30Var, iu30 iu30Var2, boolean z2) {
        super(3);
        this.f = wff1Var;
        this.g = zff1Var;
        this.b = z;
        this.e = i;
        this.d = iu30Var;
        this.h = iu30Var2;
        this.c = z2;
    }
}
