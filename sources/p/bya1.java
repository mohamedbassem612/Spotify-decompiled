package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bya1 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ float e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bya1(String str, String str2, float f, boolean z, Function0 function0, Function0 function1, Function0 function2, String str3, iu30 iu30Var, int i) {
        super(2);
        this.d = str;
        this.f = str2;
        this.e = f;
        this.b = z;
        this.g = function0;
        this.i = function1;
        this.t = function2;
        this.h = str3;
        this.X = iu30Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.X;
        Object obj4 = this.t;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                int iP = czo1.p(this.c | 1);
                String str = this.d;
                String str2 = this.f;
                float f = this.e;
                boolean z = this.b;
                Function0 function0 = this.g;
                vvm1.c(str, str2, f, z, function0, (Function0) obj5, (Function0) obj4, (String) obj6, iu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(521);
                boolean z2 = this.b;
                int i = this.c;
                String str3 = this.d;
                float f2 = this.e;
                String str4 = this.f;
                nho1.i((vnr0) obj6, z2, (vnr0) obj5, i, str3, f2, str4, (dzo1) obj4, (qim0) obj3, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bya1(vnr0 vnr0Var, boolean z, vnr0 vnr0Var2, int i, String str, float f, String str2, dzo1 dzo1Var, qim0 qim0Var, Function0 function0, int i2) {
        super(2);
        this.h = vnr0Var;
        this.b = z;
        this.i = vnr0Var2;
        this.c = i;
        this.d = str;
        this.e = f;
        this.f = str2;
        this.t = dzo1Var;
        this.X = qim0Var;
        this.g = function0;
    }
}
