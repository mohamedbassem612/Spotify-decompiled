package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ld81 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he81 b;
    public final /* synthetic */ od81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld81(he81 he81Var, od81 od81Var, byte b) {
        super(0);
        this.a = b;
        this.b = he81Var;
        this.c = od81Var;
    }

    public final Object invoke() {
        abu0 abu0Var;
        abu0 abu0Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        od81 od81Var = this.c;
        he81 he81Var = this.b;
        switch (b) {
            case 0:
                zau0 zau0Var = he81Var.o;
                if (zau0Var != null && (abu0Var = (abu0) od81Var.j.invoke()) != null) {
                    abu0Var.a(zau0Var);
                }
                break;
            default:
                zau0 zau0Var2 = he81Var.o;
                if (zau0Var2 != null && (abu0Var2 = (abu0) od81Var.j.invoke()) != null) {
                    abu0Var2.b(zau0Var2);
                }
                break;
        }
        return rih1Var;
    }
}
