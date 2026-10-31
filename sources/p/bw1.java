package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bw1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(int i, ot1 ot1Var, gy1 gy1Var, String str, boolean z, ow1 ow1Var, qim0 qim0Var, boolean z2, int i2) {
        super(2);
        this.f = i;
        this.g = ot1Var;
        this.h = gy1Var;
        this.b = str;
        this.d = z;
        this.i = ow1Var;
        this.c = qim0Var;
        this.e = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.f;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                boolean z = this.e;
                int iP = czo1.p(1);
                int i2 = this.f;
                boolean z2 = this.d;
                g9p1.j(i2, (ot1) obj6, (gy1) obj5, (String) obj7, z2, (ow1) obj4, (qim0) obj3, z, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                boolean z3 = this.d;
                boolean z4 = this.e;
                mth1.b((u5i0) obj6, (String) obj7, (orp) obj5, (qim0) obj3, z3, z4, (Function0) obj4, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                loo1.n((String) obj7, (lz71) obj6, (nu) obj5, (Function0) obj4, (Function0) obj3, this.d, this.e, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(1);
                boolean z5 = this.d;
                boolean z6 = this.e;
                int i3 = this.f;
                upo1.d((c380) obj6, z5, z6, (xtb0) obj5, (vu30) obj7, (iu30) obj4, i3, (qim0) obj3, (b0k) obj, iP4);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                boolean z7 = this.d;
                boolean z8 = this.e;
                gto1.g((String) obj7, (af5) obj6, (cqs0) obj5, (qim0) obj3, z7, z8, (iu30) obj4, (b0k) obj, iP5);
                break;
            case 5:
                ((Number) obj2).intValue();
                vu30 vu30Var = (vu30) obj4;
                int iP6 = czo1.p(1);
                boolean z9 = this.d;
                boolean z10 = this.e;
                int i4 = this.f;
                eqn1.j(z9, z10, i4, (xqn0) obj6, (Function0) obj5, (qim0) obj3, (Function0) obj7, vu30Var, (b0k) obj, iP6);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                vvm1.l((qim0) obj3, (vg41) obj6, (vu30) obj5, (iu30) obj7, (vu30) obj4, this.d, this.e, (b0k) obj, iP7);
                break;
            default:
                ((Number) obj2).intValue();
                int iP8 = czo1.p(196609);
                int i5 = this.f;
                boolean z11 = this.d;
                boolean z12 = this.e;
                y7y0.j((String) obj7, (c380) obj6, i5, z11, z12, (j2i) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, iP8);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(String str, af5 af5Var, cqs0 cqs0Var, qim0 qim0Var, boolean z, boolean z2, iu30 iu30Var, int i) {
        super(2);
        this.b = str;
        this.g = af5Var;
        this.h = cqs0Var;
        this.c = qim0Var;
        this.d = z;
        this.e = z2;
        this.i = iu30Var;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(String str, c380 c380Var, int i, boolean z, boolean z2, j2i j2iVar, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.b = str;
        this.g = c380Var;
        this.f = i;
        this.d = z;
        this.e = z2;
        this.h = j2iVar;
        this.i = function0;
        this.c = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(String str, lz71 lz71Var, nu nuVar, Function0 function0, Function0 function1, boolean z, boolean z2, int i) {
        super(2);
        this.b = str;
        this.g = lz71Var;
        this.h = nuVar;
        this.i = function0;
        this.c = function1;
        this.d = z;
        this.e = z2;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(c380 c380Var, boolean z, boolean z2, xtb0 xtb0Var, vu30 vu30Var, iu30 iu30Var, int i, qim0 qim0Var, int i2) {
        super(2);
        this.g = c380Var;
        this.d = z;
        this.e = z2;
        this.h = xtb0Var;
        this.b = vu30Var;
        this.i = iu30Var;
        this.f = i;
        this.c = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(u5i0 u5i0Var, String str, orp orpVar, qim0 qim0Var, boolean z, boolean z2, Function0 function0, int i) {
        super(2);
        this.g = u5i0Var;
        this.b = str;
        this.h = orpVar;
        this.c = qim0Var;
        this.d = z;
        this.e = z2;
        this.i = function0;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(qim0 qim0Var, vg41 vg41Var, vu30 vu30Var, iu30 iu30Var, vu30 vu30Var2, boolean z, boolean z2, int i) {
        super(2);
        this.c = qim0Var;
        this.g = vg41Var;
        this.h = vu30Var;
        this.b = iu30Var;
        this.i = vu30Var2;
        this.d = z;
        this.e = z2;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(boolean z, boolean z2, int i, xqn0 xqn0Var, Function0 function0, qim0 qim0Var, Function0 function1, vu30 vu30Var, int i2) {
        super(2);
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = xqn0Var;
        this.h = function0;
        this.c = qim0Var;
        this.b = function1;
        this.i = vu30Var;
    }
}
