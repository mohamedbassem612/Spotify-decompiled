package p;

import defpackage.g;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class wdm0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ vy71 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ c9n d;

    public /* synthetic */ wdm0(vy71 vy71Var, Function0 function0, c9n c9nVar) {
        this.b = vy71Var;
        this.c = function0;
        this.d = c9nVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = this.d;
        Function0 function0 = this.c;
        vy71 vy71Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) ((iu30) vy71Var.e.e).invoke(xy71.a)).booleanValue()) {
                    fn31.T(c9nVar, null, 0, new g(vy71Var, null, (byte) 14), 3).L(new ydm0(vy71Var, function0, (byte) 0));
                }
                break;
            default:
                int iOrdinal = vy71Var.d().ordinal();
                if (iOrdinal == 1) {
                    function0.invoke();
                } else if (iOrdinal == 2) {
                    fn31.T(c9nVar, null, 0, new g(vy71Var, null, (byte) 15), 3);
                } else {
                    fn31.T(c9nVar, null, 0, new g(vy71Var, null, (byte) 16), 3);
                }
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ wdm0(vy71 vy71Var, c9n c9nVar, Function0 function0) {
        this.b = vy71Var;
        this.d = c9nVar;
        this.c = function0;
    }
}
