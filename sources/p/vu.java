package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vu extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vu(String str, qim0 qim0Var, qim0 qim0Var2, boolean z, gbx gbxVar, boolean z2, j2i j2iVar, int i, int i2) {
        super(2);
        this.c = str;
        this.d = qim0Var;
        this.h = qim0Var2;
        this.b = z;
        this.i = gbxVar;
        this.e = z2;
        this.t = j2iVar;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.c;
        Object obj6 = this.h;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                j2i j2iVar = (j2i) obj3;
                int iP = czo1.p(i | 1);
                byte b2 = this.g;
                qim0 qim0Var = this.d;
                boolean z = this.b;
                wu.b((String) obj5, qim0Var, (qim0) obj6, z, (gbx) obj4, this.e, j2iVar, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.g;
                boolean z2 = this.b;
                qim0 qim0Var2 = this.d;
                boolean z3 = this.e;
                qro1.d(z2, (iu30) obj6, (String) obj5, qim0Var2, z3, (idn0) obj4, (max) obj3, (b0k) obj, iP2, b3);
                break;
            case 2:
                ((Number) obj2).intValue();
                vnr0 vnr0Var = (vnr0) obj3;
                int iP3 = czo1.p(i | 1);
                byte b4 = this.g;
                qim0 qim0Var3 = this.d;
                boolean z4 = this.b;
                boolean z5 = this.e;
                kln1.l((iec) obj5, qim0Var3, z4, (djc0) obj6, z5, (u7h) obj4, vnr0Var, (b0k) obj, iP3, b4);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                byte b5 = this.g;
                qim0 qim0Var4 = this.d;
                boolean z6 = this.b;
                boolean z7 = this.e;
                two1.p((Function0) obj6, qim0Var4, (String) obj5, (String) obj4, z6, z7, (j2i) obj3, (b0k) obj, iP4, b5);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vu(Function0 function0, qim0 qim0Var, String str, String str2, boolean z, boolean z2, j2i j2iVar, int i, int i2) {
        super(2);
        this.h = function0;
        this.d = qim0Var;
        this.c = str;
        this.i = str2;
        this.b = z;
        this.e = z2;
        this.t = j2iVar;
        this.f = i;
        this.g = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vu(iec iecVar, qim0 qim0Var, boolean z, djc0 djc0Var, boolean z2, u7h u7hVar, vnr0 vnr0Var, int i, int i2) {
        super(2);
        this.c = iecVar;
        this.d = qim0Var;
        this.b = z;
        this.h = djc0Var;
        this.e = z2;
        this.i = u7hVar;
        this.t = vnr0Var;
        this.f = i;
        this.g = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vu(boolean z, iu30 iu30Var, String str, qim0 qim0Var, boolean z2, idn0 idn0Var, max maxVar, int i, int i2) {
        super(2);
        this.b = z;
        this.h = iu30Var;
        this.c = str;
        this.d = qim0Var;
        this.e = z2;
        this.i = idn0Var;
        this.t = maxVar;
        this.f = i;
        this.g = i2;
    }
}
