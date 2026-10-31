package p;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class rj4 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ cv30 i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rj4(Class cls, qim0 qim0Var, pi30 pi30Var, Bundle bundle, w8c0 w8c0Var, iu30 iu30Var, int i, int i2) {
        this.e = cls;
        this.b = qim0Var;
        this.f = pi30Var;
        this.g = bundle;
        this.h = w8c0Var;
        this.i = iu30Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        j2i j2iVar = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Integer) obj2).getClass();
                int iP = czo1.p(i | 1);
                m5n1.a((Class) obj6, this.b, (pi30) obj5, (Bundle) obj4, (w8c0) obj3, (iu30) j2iVar, (b0k) obj, iP, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = czo1.p(i | 1);
                l4o1.b(this.b, (hw61) obj6, (qsd) obj5, (ltd) obj4, (qqb) obj3, j2iVar, (b0k) obj, iP2, this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rj4(qim0 qim0Var, hw61 hw61Var, qsd qsdVar, ltd ltdVar, qqb qqbVar, j2i j2iVar, int i, int i2) {
        this.b = qim0Var;
        this.e = hw61Var;
        this.f = qsdVar;
        this.g = ltdVar;
        this.h = qqbVar;
        this.i = j2iVar;
        this.c = i;
        this.d = i2;
    }
}
