package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n3m extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cv30 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3m(int i, hby hbyVar, d0r d0rVar, int i2, String str, iu30 iu30Var, vky vkyVar, int i3) {
        super(2);
        this.c = i;
        this.f = hbyVar;
        this.g = d0rVar;
        this.d = i2;
        this.b = str;
        this.h = iu30Var;
        this.i = vkyVar;
        this.e = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.e;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.i;
        Object obj4 = this.b;
        Object obj5 = this.g;
        iu30 iu30Var = this.h;
        Object obj6 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                int i2 = this.c;
                int i3 = this.d;
                bqn1.h(i2, (hby) obj6, (d0r) obj5, i3, (String) obj4, iu30Var, (vky) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                int i4 = this.c;
                int i5 = this.d;
                int i6 = this.e;
                zgo1.h((String) obj4, (String) obj6, i4, i5, i6, (Function0) obj5, (Function0) iu30Var, (qim0) obj3, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                int i7 = this.c;
                int i8 = this.d;
                iko1.i((mya0) obj6, i7, i8, (String) obj4, (shg1) obj5, iu30Var, (qim0) obj3, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                int i9 = this.c;
                int i10 = this.d;
                ((ji6) obj6).f(i9, i10, iu30Var, (j2i) obj5, (qim0) obj4, (j2i) obj3, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3m(String str, String str2, int i, int i2, int i3, Function0 function0, Function0 function1, qim0 qim0Var, int i4) {
        super(2);
        this.b = str;
        this.f = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.g = function0;
        this.h = function1;
        this.i = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3m(ji6 ji6Var, int i, int i2, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, j2i j2iVar2, int i3) {
        super(2);
        this.f = ji6Var;
        this.c = i;
        this.d = i2;
        this.h = iu30Var;
        this.g = j2iVar;
        this.b = qim0Var;
        this.i = j2iVar2;
        this.e = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3m(mya0 mya0Var, int i, int i2, String str, shg1 shg1Var, iu30 iu30Var, qim0 qim0Var, int i3) {
        super(2);
        this.f = mya0Var;
        this.c = i;
        this.d = i2;
        this.b = str;
        this.g = shg1Var;
        this.h = iu30Var;
        this.i = qim0Var;
        this.e = i3;
    }
}
