package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lg6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w0d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lg6(w0d w0dVar, byte b) {
        super(1);
        this.a = b;
        this.b = w0dVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w0d w0dVar = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, (String) ((nx2) w0dVar.c).invoke());
                b261.x(e261Var, 0);
                if (w0dVar.b) {
                    b261.g(e261Var, (String) w0dVar.d, new i26(w0dVar, (byte) 4));
                    b261.p(e261Var, (List) w0dVar.g);
                }
                break;
            default:
                e261 e261Var2 = (e261) obj;
                b261.x(e261Var2, 0);
                if (w0dVar.b) {
                    b261.g(e261Var2, (String) w0dVar.d, new i26(w0dVar, (byte) 4));
                    b261.p(e261Var2, (List) w0dVar.g);
                }
                break;
        }
        return rih1Var;
    }
}
