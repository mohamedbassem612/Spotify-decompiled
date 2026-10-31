package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ehv extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehv(boolean z, String str, Function0 function0) {
        super(1);
        this.c = z;
        this.b = str;
        this.d = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        boolean z = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 0);
                if (!z) {
                    b261.a(e261Var);
                } else {
                    b261.g(e261Var, str, new z9t(function0, (byte) 16));
                }
                break;
            default:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, str);
                b261.x(e261Var2, 0);
                if (z) {
                    b261.g(e261Var2, (String) null, new uuc1(function0, (byte) 18));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehv(String str, boolean z, Function0 function0) {
        super(1);
        this.b = str;
        this.c = z;
        this.d = function0;
    }
}
