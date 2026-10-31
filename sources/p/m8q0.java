package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m8q0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ p8q0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8q0(boolean z, iu30 iu30Var, p8q0 p8q0Var, String str) {
        super(0);
        this.b = z;
        this.c = iu30Var;
        this.d = p8q0Var;
        this.e = str;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.e;
        o8q0 o8q0Var = this.d;
        iu30 iu30Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (o8q0Var instanceof o8q0) {
                    iu30Var.invoke(new r8q0(o8q0Var.a));
                    return rih1Var;
                }
                if (!(o8q0Var instanceof n8q0)) {
                    eg.o();
                    return null;
                }
                if (!z) {
                    iu30Var.invoke(new s8q0(str));
                    return rih1Var;
                }
                n8q0 n8q0Var = (n8q0) o8q0Var;
                iu30Var.invoke(new u8q0(n8q0Var.d, n8q0Var.e));
                return rih1Var;
            default:
                if (z) {
                    n8q0 n8q0Var2 = (n8q0) o8q0Var;
                    iu30Var.invoke(new v8q0(n8q0Var2.d, n8q0Var2.e));
                } else {
                    iu30Var.invoke(new t8q0(str));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8q0(p8q0 p8q0Var, iu30 iu30Var, boolean z, String str) {
        super(0);
        this.d = p8q0Var;
        this.c = iu30Var;
        this.b = z;
        this.e = str;
    }
}
