package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n1j extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1j(byte b, int i, int i2, iu30 iu30Var) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        int i2 = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new jvj0(i2, i));
                return rih1Var;
            case 1:
                iu30Var.invoke(new iqe0(new t50(i2, i)));
                return rih1Var;
            case 2:
                iu30Var.invoke(Integer.valueOf(i2 + i));
                return Boolean.TRUE;
            case 3:
                iu30Var.invoke(Integer.valueOf(i2 - i));
                return Boolean.TRUE;
            case 4:
                iu30Var.invoke(new p6d1(i2, i));
                return rih1Var;
            case 5:
                iu30Var.invoke(Integer.valueOf(i2 + i));
                return Boolean.TRUE;
            default:
                iu30Var.invoke(Integer.valueOf(i2 - i));
                return Boolean.TRUE;
        }
    }
}
