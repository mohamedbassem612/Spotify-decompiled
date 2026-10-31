package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import j$.time.LocalDate;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oia extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oia(yx70 yx70Var, String str, gt40 gt40Var, int i, u8h u8hVar, int i2, int i3) {
        super(2);
        this.a = (byte) 8;
        this.b = yx70Var;
        this.g = str;
        this.c = gt40Var;
        this.d = i;
        this.h = u8hVar;
        this.e = i2;
        this.f = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.h;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.f;
                boolean z = this.d;
                j7p1.n((String) obj6, z, (iu30) obj5, (qim0) obj4, (lee1) obj3, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.f;
                rck.c((hdk) obj6, (gw70) obj3, (iu30) obj5, (qim0) obj4, this.d, (b0k) obj, iP2, b3);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.f;
                u4p1.e((LocalDate) obj6, (x6r) obj5, (Function0) obj3, (qim0) obj4, this.d, (b0k) obj, iP3, b4);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                byte b5 = this.f;
                ((lqc) obj5).h((String) obj6, (sst) obj3, (qim0) obj4, this.d, (b0k) obj, iP4, b5);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                byte b6 = this.f;
                boolean z2 = this.d;
                k4k.d(z2, (hux) obj5, (String) obj6, (String) obj4, (Function0) obj3, (b0k) obj, iP5, b6);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                byte b7 = this.f;
                boolean z3 = this.d;
                puo1.c((qim0) obj4, (n9d1) obj6, (n9d1) obj5, z3, (j2i) obj3, (b0k) obj, iP6, b7);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                byte b8 = this.f;
                boolean z4 = this.d;
                anm1.c(z4, (iu30) obj5, (qim0) obj4, (max) obj6, (idn0) obj3, (b0k) obj, iP7, b8);
                break;
            case 7:
                ((Number) obj2).intValue();
                int iP8 = czo1.p(i | 1);
                byte b9 = this.f;
                cgj1.a((p750) obj4, (dh30) obj3, (iu30) obj5, (String) obj6, this.d, (b0k) obj, iP8, b9);
                break;
            case 8:
                ((Number) obj2).intValue();
                byte b10 = this.f;
                int i2 = this.d ? 1 : 0;
                yoi1.d((yx70) obj5, (String) obj6, (gt40) obj4, i2, (u8h) obj3, (b0k) obj, i | 1, b10);
                break;
            case 9:
                ((Number) obj2).intValue();
                int iP9 = czo1.p(i | 1);
                byte b11 = this.f;
                boolean z5 = this.d;
                vqo1.b(z5, (hux) obj5, (gbx) obj3, (String) obj6, (qim0) obj4, (b0k) obj, iP9, b11);
                break;
            default:
                ((Number) obj2).intValue();
                int iP10 = czo1.p(i | 1);
                byte b12 = this.f;
                boolean z6 = this.d;
                fuo1.f((rj01) obj6, z6, (Function0) obj5, (br0) obj4, (dey) obj3, (b0k) obj, iP10, b12);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oia(LocalDate localDate, x6r x6rVar, Function0 function0, qim0 qim0Var, boolean z, int i, int i2) {
        super(2);
        this.a = (byte) 2;
        this.g = localDate;
        this.b = x6rVar;
        this.h = function0;
        this.c = qim0Var;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oia(lqc lqcVar, String str, sst sstVar, qim0 qim0Var, boolean z, int i, int i2) {
        super(2);
        this.a = (byte) 3;
        this.b = lqcVar;
        this.g = str;
        this.h = sstVar;
        this.c = qim0Var;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oia(hdk hdkVar, gw70 gw70Var, iu30 iu30Var, qim0 qim0Var, boolean z, int i, int i2) {
        super(2);
        this.a = (byte) 1;
        this.g = hdkVar;
        this.h = gw70Var;
        this.b = iu30Var;
        this.c = qim0Var;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oia(p750 p750Var, dh30 dh30Var, iu30 iu30Var, String str, boolean z, int i, int i2) {
        super(2);
        this.a = (byte) 7;
        this.c = p750Var;
        this.h = dh30Var;
        this.b = iu30Var;
        this.g = str;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ oia(Object obj, boolean z, cv30 cv30Var, Object obj2, Object obj3, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.g = obj;
        this.d = z;
        this.b = cv30Var;
        this.c = obj2;
        this.h = obj3;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oia(qim0 qim0Var, n9d1 n9d1Var, n9d1 n9d1Var2, boolean z, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = (byte) 5;
        this.c = qim0Var;
        this.g = n9d1Var;
        this.b = n9d1Var2;
        this.d = z;
        this.h = j2iVar;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oia(boolean z, hux huxVar, String str, String str2, Function0 function0, int i, int i2) {
        super(2);
        this.a = (byte) 4;
        this.d = z;
        this.b = huxVar;
        this.g = str;
        this.c = str2;
        this.h = function0;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oia(boolean z, hux huxVar, gbx gbxVar, String str, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = (byte) 9;
        this.d = z;
        this.b = huxVar;
        this.h = gbxVar;
        this.g = str;
        this.c = qim0Var;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oia(boolean z, iu30 iu30Var, qim0 qim0Var, max maxVar, idn0 idn0Var, int i, int i2) {
        super(2);
        this.a = (byte) 6;
        this.d = z;
        this.b = iu30Var;
        this.c = qim0Var;
        this.g = maxVar;
        this.h = idn0Var;
        this.e = i;
        this.f = i2;
    }
}
