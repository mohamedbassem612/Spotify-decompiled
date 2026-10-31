package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eo1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ cv30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo1(String str, Function0 function0, boolean z, boolean z2, String str2, String str3, boolean z3, Function0 function1, Function0 function2) {
        super(1);
        this.e = str;
        this.f = function0;
        this.b = z;
        this.c = z2;
        this.g = str2;
        this.h = str3;
        this.d = z3;
        this.i = function1;
        this.t = function2;
    }

    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.t;
        boolean z2 = this.d;
        boolean z3 = this.c;
        boolean z4 = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.i;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                rtb0 rtb0Var = (rtb0) obj;
                c380 c380Var = (c380) obj5;
                jw1 jw1Var = (jw1) obj2;
                iu30 iu30Var = (iu30) function0;
                ow1 ow1Var = (ow1) obj6;
                fu1 fu1Var = (fu1) obj3;
                eu1 eu1VarE = fu1Var.e();
                boolean z5 = eu1VarE instanceof xt1;
                if (z5) {
                    z = true;
                    rtb0.c(rtb0Var, (Object) null, new j2i(-70017435, new o2(eu1VarE, (byte) 20), true), 3);
                } else {
                    z = true;
                }
                if (z4) {
                    rtb0.f(rtb0Var, "search_header", new j2i(1736081218, new do1(ow1Var, iu30Var, (byte) 0), z), 2);
                }
                g9p1.q(rtb0Var, (c380) obj5, jw1Var.a, jw1Var.c, fu1Var.p, (ow1) obj6, 0, fu1Var.n, 32);
                if (!z4 && z3) {
                    rtb0.f(rtb0Var, "search_header", new j2i(403282017, new do1(ow1Var, iu30Var, (byte) 1), true), 2);
                }
                if (!z2) {
                    rtb0.c(rtb0Var, (Object) null, o4i.a, 3);
                }
                g9p1.q(rtb0Var, (c380) obj4, jw1Var.a, jw1Var.c, fu1Var.p, (ow1) obj6, c380Var.size(), fu1Var.n, 64);
                if (!z5 || !fu1Var.f) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(545711915, new n891(c380Var, (c380) obj4, ow1Var, (byte) 9), true), 3);
                }
                break;
            default:
                e261 e261Var = (e261) obj;
                String str = (String) obj3;
                if (str != null) {
                    b261.A(e261Var, str);
                }
                Function0 function1 = (Function0) obj2;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                Function0 function2 = (Function0) obj6;
                Function0 function3 = function0;
                smc0 smc0VarN = k4p1.n();
                if (function1 != null && z4 && z3) {
                    smc0VarN.add(new epo(str2, new lj2(function1, (byte) 17)));
                }
                smc0VarN.add(new epo(str3, new eb7(z2, function2, function3, (byte) 0)));
                b261.p(e261Var, k4p1.k(smc0VarN));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo1(fu1 fu1Var, boolean z, jw1 jw1Var, c380 c380Var, ow1 ow1Var, boolean z2, boolean z3, c380 c380Var2, iu30 iu30Var) {
        super(1);
        this.e = fu1Var;
        this.b = z;
        this.f = jw1Var;
        this.g = c380Var;
        this.i = ow1Var;
        this.c = z2;
        this.d = z3;
        this.h = c380Var2;
        this.t = iu30Var;
    }
}
