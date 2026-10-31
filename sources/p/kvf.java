package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class kvf implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ kvf(j2i j2iVar, Function0 function0, qim0 qim0Var, vu30 vu30Var, boolean z, wsi0 wsi0Var, vzq0 vzq0Var, int i) {
        this.f = j2iVar;
        this.b = function0;
        this.c = qim0Var;
        this.g = vu30Var;
        this.d = z;
        this.h = wsi0Var;
        this.i = vzq0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.b;
        Object obj7 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Integer) obj2).getClass();
                int iP = czo1.p(i | 1);
                zxo1.o((rze1) obj7, (Function0) obj6, (phc1) obj5, (phc1) obj4, this.c, this.d, (hvf) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = czo1.p(i | 1);
                guo1.f((j2i) obj7, (Function0) obj6, this.c, (vu30) obj5, this.d, (wsi0) obj4, (vzq0) obj3, (b0k) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = czo1.p(i | 1);
                rb91.b((tb91) obj7, this.c, this.d, (fb91) obj6, (idn0) obj5, (j2i) obj4, (j2i) obj3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ kvf(tb91 tb91Var, qim0 qim0Var, boolean z, fb91 fb91Var, idn0 idn0Var, j2i j2iVar, j2i j2iVar2, int i) {
        this.f = tb91Var;
        this.c = qim0Var;
        this.d = z;
        this.b = fb91Var;
        this.g = idn0Var;
        this.h = j2iVar;
        this.i = j2iVar2;
        this.e = i;
    }

    public /* synthetic */ kvf(rze1 rze1Var, Function0 function0, phc1 phc1Var, phc1 phc1Var2, qim0 qim0Var, boolean z, hvf hvfVar, int i) {
        this.f = rze1Var;
        this.b = function0;
        this.g = phc1Var;
        this.h = phc1Var2;
        this.c = qim0Var;
        this.d = z;
        this.i = hvfVar;
        this.e = i;
    }
}
