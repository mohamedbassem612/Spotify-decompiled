package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j2v0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pw40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2v0(Object obj, pw40 pw40Var, byte b) {
        super(0);
        this.a = b;
        this.b = pw40Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pw40 pw40Var = this.b;
        switch (b) {
            case 0:
                pw40Var.a();
                break;
            case 1:
                l2v0.c(new j2v0(pw40Var, (byte) 0));
                break;
            case 2:
                pw40Var.a();
                break;
            case 3:
                xae.a(new j2v0(pw40Var, (byte) 2));
                break;
            case 4:
                pw40Var.a();
                break;
            case 5:
                xae.a(new j2v0(pw40Var, (byte) 4));
                break;
            case 6:
                pw40Var.a();
                break;
            case 7:
                l2v0.d(new j2v0(pw40Var, (byte) 6));
                break;
            default:
                if (pw40Var != null) {
                    try {
                        pw40Var.a();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2v0(pw40 pw40Var, byte b) {
        super(0);
        this.a = b;
        this.b = pw40Var;
    }
}
