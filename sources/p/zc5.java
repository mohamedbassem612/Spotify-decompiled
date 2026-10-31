package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zc5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 4;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zc5(String str, String str2, qim0 qim0Var, iu30 iu30Var, djc0 djc0Var, boolean z, lee1 lee1Var, int i, int i2) {
        super(2);
        this.b = str;
        this.g = str2;
        this.c = qim0Var;
        this.h = iu30Var;
        this.i = djc0Var;
        this.d = z;
        this.t = lee1Var;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.f;
                boolean z = this.d;
                qim0 qim0Var = this.c;
                String str = this.b;
                fq7.b((nbh) obj6, z, qim0Var, (bby) obj5, (ln00) obj4, str, (j2i) obj3, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.f;
                String str2 = this.b;
                qim0 qim0Var2 = this.c;
                boolean z2 = this.d;
                iko1.h(str2, (String) obj6, qim0Var2, z2, (Function0) obj5, (Function0) obj4, (String) obj3, (b0k) obj, iP2, b3);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.f;
                String str3 = this.b;
                qim0 qim0Var3 = this.c;
                c921.h(str3, (if5) obj6, (c380) obj5, qim0Var3, (if5) obj4, (lax) obj3, this.d, (b0k) obj, iP3, b4);
                break;
            case 3:
                ((Number) obj2).intValue();
                j2i j2iVar = (j2i) obj3;
                int iP4 = czo1.p(i | 1);
                byte b5 = this.f;
                String str4 = this.b;
                boolean z3 = this.d;
                qim0 qim0Var4 = this.c;
                ows0.e(str4, z3, (String) obj6, (Function0) obj5, qim0Var4, (String) obj4, j2iVar, (b0k) obj, iP4, b5);
                break;
            default:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                byte b6 = this.f;
                String str5 = this.b;
                qim0 qim0Var5 = this.c;
                boolean z4 = this.d;
                e130.n(str5, (String) obj6, qim0Var5, (iu30) obj5, (djc0) obj4, z4, (lee1) obj3, (b0k) obj, iP5, b6);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zc5(String str, String str2, qim0 qim0Var, boolean z, Function0 function0, Function0 function1, String str3, int i, int i2) {
        super(2);
        this.b = str;
        this.g = str2;
        this.c = qim0Var;
        this.d = z;
        this.h = function0;
        this.i = function1;
        this.t = str3;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zc5(String str, if5 if5Var, c380 c380Var, qim0 qim0Var, if5 if5Var2, lax laxVar, boolean z, int i, int i2) {
        super(2);
        this.b = str;
        this.g = if5Var;
        this.h = c380Var;
        this.c = qim0Var;
        this.i = if5Var2;
        this.t = laxVar;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zc5(String str, boolean z, String str2, Function0 function0, qim0 qim0Var, String str3, j2i j2iVar, int i, int i2) {
        super(2);
        this.b = str;
        this.d = z;
        this.g = str2;
        this.h = function0;
        this.c = qim0Var;
        this.i = str3;
        this.t = j2iVar;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zc5(nbh nbhVar, boolean z, qim0 qim0Var, bby bbyVar, ln00 ln00Var, String str, j2i j2iVar, int i, int i2) {
        super(2);
        this.g = nbhVar;
        this.d = z;
        this.c = qim0Var;
        this.h = bbyVar;
        this.i = ln00Var;
        this.b = str;
        this.t = j2iVar;
        this.e = i;
        this.f = i2;
    }
}
