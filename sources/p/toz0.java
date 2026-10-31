package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class toz0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ idn0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ cv30 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ toz0(boolean z, cv30 cv30Var, qim0 qim0Var, boolean z2, Object obj, idn0 idn0Var, int i, int i2, byte b) {
        this.a = b;
        this.b = z;
        this.h = cv30Var;
        this.c = qim0Var;
        this.d = z2;
        this.i = obj;
        this.e = idn0Var;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        Object obj3 = this.i;
        iu30 iu30Var = this.h;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Integer) obj2).getClass();
                int iP = czo1.p(i | 1);
                kno1.n(this.b, (Function0) iu30Var, this.c, this.d, (soz0) obj3, this.e, (b0k) obj, iP, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = czo1.p(i | 1);
                ljo1.j(this.b, iu30Var, this.c, this.d, (tad1) obj3, this.e, (b0k) obj, iP2, this.g);
                break;
        }
        return rih1Var;
    }
}
