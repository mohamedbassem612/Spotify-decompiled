package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t911 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u911 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t911(u911 u911Var, byte b) {
        super(0);
        this.a = b;
        this.b = u911Var;
    }

    public final Object invoke() {
        byte b = this.a;
        u911 u911Var = this.b;
        switch (b) {
            case 0:
                ztl0 ztl0Var = (ztl0) u911Var.g.getValue();
                ztl0Var.getClass();
                return new xtl0(ztl0Var);
            case 1:
                return new ztl0(u911Var.b.b());
            case 2:
                ztl0 ztl0Var2 = (ztl0) u911Var.g.getValue();
                ztl0Var2.getClass();
                return new ytl0(ztl0Var2);
            case 3:
                return new wtl0(3, u911Var.b.b());
            default:
                return new wtl0(4, u911Var.b.b());
        }
    }
}
