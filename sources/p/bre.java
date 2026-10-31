package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bre extends hab0 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object O0;
    public final /* synthetic */ Object P0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bre(String str, iu30 iu30Var, String str2, qim0 qim0Var, boolean z, boolean z2, boolean z3, lee1 lee1Var, kua0 kua0Var, bua0 bua0Var, boolean z4, int i, int i2, elk1 elk1Var, int i3) {
        super(2);
        this.X = str;
        this.b = iu30Var;
        this.Y = str2;
        this.c = qim0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.Z = lee1Var;
        this.N0 = kua0Var;
        this.O0 = bua0Var;
        this.g = z4;
        this.h = i;
        this.i = i2;
        this.P0 = elk1Var;
        this.t = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.t;
        Object obj3 = this.P0;
        Object obj4 = this.O0;
        Object obj5 = this.N0;
        Object obj6 = this.Z;
        Object obj7 = this.Y;
        Object obj8 = this.X;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                orm0 orm0Var = (orm0) obj3;
                int iP = czo1.p(this.h | 1);
                int iP2 = czo1.p(i);
                iu30 iu30Var = this.b;
                boolean z = this.d;
                poo1.p((jre) obj8, (g9m) obj7, (lz71) obj6, (nu) obj5, iu30Var, z, (iu30) obj4, this.e, orm0Var, this.f, this.g, this.i, null, this.c, (b0k) obj, iP, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                elk1 elk1Var = (elk1) obj3;
                int iP3 = czo1.p(i | 1);
                iu30 iu30Var2 = this.b;
                qim0 qim0Var = this.c;
                boolean z2 = this.d;
                boolean z3 = this.e;
                boolean z4 = this.f;
                j0o1.m((String) obj8, iu30Var2, (String) obj7, qim0Var, z2, z3, z4, (lee1) obj6, (kua0) obj5, (bua0) obj4, this.g, this.h, this.i ? 1 : 0, elk1Var, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bre(jre jreVar, g9m g9mVar, lz71 lz71Var, nu nuVar, iu30 iu30Var, boolean z, iu30 iu30Var2, boolean z2, orm0 orm0Var, boolean z3, boolean z4, boolean z5, zg61 zg61Var, qim0 qim0Var, int i, int i2) {
        super(2);
        this.X = jreVar;
        this.Y = g9mVar;
        this.Z = lz71Var;
        this.N0 = nuVar;
        this.b = iu30Var;
        this.d = z;
        this.O0 = iu30Var2;
        this.e = z2;
        this.P0 = orm0Var;
        this.f = z3;
        this.g = z4;
        this.i = z5;
        this.c = qim0Var;
        this.h = i;
        this.t = i2;
    }
}
