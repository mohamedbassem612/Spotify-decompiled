package p;

import j$.time.LocalDate;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fff extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fff(iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = ven0Var;
        this.d = ven0Var2;
    }

    public final Object invoke() {
        byte b = this.a;
        ldf ldfVar = ldf.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.d;
        ven0 ven0Var2 = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                ven0Var2.setValue(Boolean.TRUE);
                ((s3f) ven0Var.getValue()).b(ldfVar, iu30Var);
                break;
            case 1:
                ven0Var2.setValue(Boolean.TRUE);
                ((s3f) ven0Var.getValue()).b(kdf.a, iu30Var);
                ((s3f) ven0Var.getValue()).b(ldfVar, iu30Var);
                break;
            case 2:
                iu30Var.invoke(p720.b);
                ven0Var2.setValue((Object) null);
                ven0Var.setValue((Object) null);
                break;
            case 3:
                iu30Var.invoke(new o720((LocalDate) ven0Var2.getValue(), (LocalDate) ven0Var.getValue()));
                break;
            default:
                iu30Var.invoke(u760.a);
                if (!((Boolean) ven0Var2.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return rih1Var;
    }
}
