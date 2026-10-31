package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uqe extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqe(jre jreVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, vu30 vu30Var, int i) {
        super(2);
        this.g = jreVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.h = vu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                vu30 vu30Var = (vu30) obj3;
                int iP = czo1.p(1);
                poo1.b((jre) obj4, this.b, this.c, this.d, this.e, this.f, vu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                boolean z = this.f;
                int iP2 = czo1.p(1);
                boolean z2 = this.b;
                kyo1.k(z2, (String) obj4, (String) obj3, this.c, this.d, this.e, z, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqe(boolean z, String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        super(2);
        this.b = z;
        this.g = str;
        this.h = str2;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }
}
