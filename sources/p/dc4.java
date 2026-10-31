package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dc4 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ec4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc4(ec4 ec4Var, byte b) {
        super(0);
        this.a = b;
        this.b = ec4Var;
    }

    public final Object invoke() {
        yo00 yo00Var;
        switch (this.a) {
            case 0:
                ec4 ec4Var = this.b;
                ec4Var.a();
                yo00 yo00Var2 = ec4Var.c;
                if (yo00Var2 != null) {
                    yo00Var2.y1();
                }
                ec4Var.c = null;
                break;
            default:
                cc4 cc4Var = this.b.e;
                if (cc4Var != null && (yo00Var = this.b.c) != null) {
                    yo00Var.P(cc4Var);
                }
                this.b.e = null;
                yo00 yo00Var3 = this.b.c;
                if (yo00Var3 != null) {
                    yo00Var3.stop();
                }
                break;
        }
        return rih1.a;
    }
}
