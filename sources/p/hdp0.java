package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hdp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ io80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hdp0(io80 io80Var, byte b) {
        super(0);
        this.a = b;
        this.b = io80Var;
    }

    public final Object invoke() {
        byte b = this.a;
        io80 io80Var = this.b;
        switch (b) {
            case 0:
                return (tau0) io80Var.a();
            case 1:
                return new jbp0(io80Var, (byte) 5);
            case 2:
                return (zuw0) io80Var.a();
            case 3:
                return (ez11) io80Var.a();
            case 4:
                return new jbp0(io80Var, (byte) 6);
            case 5:
                return (ez11) io80Var.a();
            case 6:
                return (g651) io80Var.a();
            case 7:
                return (cex0) io80Var.a();
            case 8:
                return (mu2) io80Var.a();
            case 9:
                return new jbp0(io80Var, (byte) 7);
            case 10:
                return new kc00(io80Var, (byte) 3);
            default:
                return (q940) io80Var.a();
        }
    }
}
