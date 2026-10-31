package p;

import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wag extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wag(String str, tyq tyqVar, jd6 jd6Var, boolean z, Function0 function0, boolean z2, int i) {
        super(2);
        this.a = (byte) 8;
        this.e = str;
        this.f = tyqVar;
        this.g = jd6Var;
        this.c = z;
        this.h = function0;
        this.d = z2;
        this.b = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        int i = this.b;
        Object obj3 = this.f;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                xag.a((String) obj6, (String) obj3, (gag) obj5, (csj1) obj4, this.c, this.d, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(196617);
                int i2 = this.b;
                boolean z = this.c;
                boolean z2 = this.d;
                qxd0.k((rm0) obj6, i2, z, (Function0) obj3, z2, (j2i) obj5, (qim0) obj4, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                j2i j2iVar = bsj.a;
                int iP3 = czo1.p(i | 1);
                boolean z3 = this.c;
                boolean z4 = this.d;
                ob51.a((jkr0) obj6, (j2i) obj3, z3, (j2i) obj5, z4, (iu30) obj4, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(1);
                int i3 = this.b;
                boolean z5 = this.c;
                boolean z6 = this.d;
                n3o1.a((String) obj6, i3, (Function0) obj3, (qim0) obj5, z5, z6, (Function0) obj4, (b0k) obj, iP4);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                boolean z7 = this.c;
                boolean z8 = this.d;
                u7n0.l((String) obj6, (egq0) obj3, z7, z8, (iu30) obj5, (qim0) obj4, (b0k) obj, iP5);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                u4p1.c((ew20) obj6, (n4m) obj3, (bv11) obj5, (q1v) obj4, this.c, this.d, (b0k) obj, iP6);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                Object obj7 = this.f;
                boolean z9 = this.c;
                boolean z10 = this.d;
                s8p1.c((pe21) obj6, obj7, z9, (qim0) obj5, z10, (j2i) obj4, (b0k) obj, iP7);
                break;
            case 7:
                ((Number) obj2).intValue();
                int iP8 = czo1.p(i | 1);
                boolean z11 = this.c;
                boolean z12 = this.d;
                ((hvb1) obj6).g((mhm0) obj3, (c380) obj5, z11, z12, (qim0) obj4, (b0k) obj, iP8);
                break;
            case 8:
                ((Number) obj2).intValue();
                int iP9 = czo1.p(i | 1);
                boolean z13 = this.c;
                o4o1.k((String) obj6, (tyq) obj3, (jd6) obj5, z13, (Function0) obj4, this.d, (b0k) obj, iP9);
                break;
            case 9:
                ((Number) obj2).intValue();
                boolean z14 = this.d;
                int iP10 = czo1.p(65);
                boolean z15 = this.c;
                int i4 = this.b;
                nln.p((n8f1) obj6, (q8f1) obj3, z15, i4, (vu30) obj5, (iu30) obj4, z14, (b0k) obj, iP10);
                break;
            default:
                ((Number) obj2).intValue();
                boolean z16 = this.d;
                int iP11 = czo1.p(65);
                boolean z17 = this.c;
                int i5 = this.b;
                x760.p((wff1) obj6, (zff1) obj3, z17, i5, (iu30) obj5, (iu30) obj4, z16, (b0k) obj, iP11);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wag(String str, String str2, gag gagVar, csj1 csj1Var, boolean z, boolean z2, int i) {
        super(2);
        this.a = (byte) 0;
        this.e = str;
        this.f = str2;
        this.g = gagVar;
        this.h = csj1Var;
        this.c = z;
        this.d = z2;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wag(String str, int i, Function0 function0, qim0 qim0Var, boolean z, boolean z2, Function0 function1, int i2) {
        super(2);
        this.a = (byte) 3;
        this.e = str;
        this.b = i;
        this.f = function0;
        this.g = qim0Var;
        this.c = z;
        this.d = z2;
        this.h = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wag(String str, egq0 egq0Var, boolean z, boolean z2, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 4;
        this.e = str;
        this.f = egq0Var;
        this.c = z;
        this.d = z2;
        this.g = iu30Var;
        this.h = qim0Var;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wag(rm0 rm0Var, int i, boolean z, Function0 function0, boolean z2, j2i j2iVar, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 1;
        this.e = rm0Var;
        this.b = i;
        this.c = z;
        this.f = function0;
        this.d = z2;
        this.g = j2iVar;
        this.h = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wag(ew20 ew20Var, n4m n4mVar, bv11 bv11Var, q1v q1vVar, boolean z, boolean z2, int i) {
        super(2);
        this.a = (byte) 5;
        this.e = ew20Var;
        this.f = n4mVar;
        this.g = bv11Var;
        this.h = q1vVar;
        this.c = z;
        this.d = z2;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wag(jkr0 jkr0Var, j2i j2iVar, boolean z, j2i j2iVar2, boolean z2, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 2;
        j2i j2iVar3 = bsj.a;
        this.e = jkr0Var;
        this.f = j2iVar;
        this.c = z;
        this.g = j2iVar2;
        this.d = z2;
        this.h = iu30Var;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wag(pe21 pe21Var, Object obj, boolean z, qim0 qim0Var, boolean z2, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 6;
        this.e = pe21Var;
        this.f = obj;
        this.c = z;
        this.g = qim0Var;
        this.d = z2;
        this.h = j2iVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wag(dtb1 dtb1Var, Parcelable parcelable, boolean z, int i, cv30 cv30Var, iu30 iu30Var, boolean z2, int i2, byte b) {
        super(2);
        this.a = b;
        this.e = dtb1Var;
        this.f = parcelable;
        this.c = z;
        this.b = i;
        this.g = cv30Var;
        this.h = iu30Var;
        this.d = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wag(hvb1 hvb1Var, mhm0 mhm0Var, c380 c380Var, boolean z, boolean z2, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 7;
        this.e = hvb1Var;
        this.f = mhm0Var;
        this.g = c380Var;
        this.c = z;
        this.d = z2;
        this.h = qim0Var;
        this.b = i;
    }
}
