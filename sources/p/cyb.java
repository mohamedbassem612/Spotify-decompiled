package p;

import defpackage.g;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class cyb implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ vy71 c;

    public /* synthetic */ cyb(c9n c9nVar, vy71 vy71Var, byte b) {
        this.a = b;
        this.b = c9nVar;
        this.c = vy71Var;
    }

    public final Object invoke() {
        byte b = this.a;
        c9n c9nVar = this.b;
        vy71 vy71Var = this.c;
        switch (b) {
            case 0:
                int iOrdinal = vy71Var.d().ordinal();
                if (iOrdinal == 1) {
                    fn31.T(c9nVar, null, 0, new dyb(vy71Var, null, (byte) 0), 3);
                } else if (iOrdinal != 2) {
                    fn31.T(c9nVar, null, 0, new g(vy71Var, null, (byte) 6), 3);
                } else {
                    fn31.T(c9nVar, null, 0, new g(vy71Var, null, (byte) 5), 3);
                }
                return rih1.a;
            case 1:
                fn31.T(c9nVar, null, 0, new g(vy71Var, null, (byte) 7), 3);
                break;
            case 2:
                fn31.T(c9nVar, null, 0, new g(vy71Var, null, (byte) 8), 3);
                break;
            case 3:
                fn31.T(c9nVar, null, 0, new g(vy71Var, null, (byte) 9), 3);
                break;
            default:
                if (((Boolean) ((iu30) vy71Var.e.e).invoke(xy71.c)).booleanValue()) {
                    fn31.T(c9nVar, null, 0, new g(vy71Var, null, (byte) 18), 3);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }

    public /* synthetic */ cyb(vy71 vy71Var, c9n c9nVar, byte b) {
        this.a = b;
        this.c = vy71Var;
        this.b = c9nVar;
    }
}
