package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cc60 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc60(s24 s24Var, c0b1 c0b1Var, iu30 iu30Var, fv0 fv0Var, woa woaVar, kma kmaVar, iu30 iu30Var2, zob1 zob1Var, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.d = s24Var;
        this.e = c0b1Var;
        this.f = iu30Var;
        this.g = fv0Var;
        this.h = woaVar;
        this.i = kmaVar;
        this.t = iu30Var2;
        this.X = zob1Var;
        this.Y = qim0Var;
        this.b = z;
        this.c = i;
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
        Object obj11 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                wmo1.f((i2c) obj11, (ArrayList) obj10, (jkr0) obj9, z, (cmt) obj8, (String) obj7, (String) obj6, (db60) obj5, (slx0) obj4, (kjp) obj3, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                ((s24) obj11).o((c0b1) obj10, (iu30) obj9, (fv0) obj8, (woa) obj7, (kma) obj6, (iu30) obj5, (zob1) obj4, (qim0) obj3, this.b, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc60(i2c i2cVar, ArrayList arrayList, jkr0 jkr0Var, boolean z, cmt cmtVar, String str, String str2, db60 db60Var, slx0 slx0Var, kjp kjpVar, int i) {
        super(2);
        this.d = i2cVar;
        this.e = arrayList;
        this.f = jkr0Var;
        this.b = z;
        this.g = cmtVar;
        this.h = str;
        this.i = str2;
        this.t = db60Var;
        this.X = slx0Var;
        this.Y = kjpVar;
        this.c = i;
    }
}
