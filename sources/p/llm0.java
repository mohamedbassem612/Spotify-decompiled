package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class llm0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nlm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ llm0(nlm0 nlm0Var, byte b) {
        super(0);
        this.a = b;
        this.b = nlm0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        nlm0 nlm0Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(nlm0Var.O0().getBoolean("reedit"));
            case 1:
                dtp dtpVar = nlm0Var.X1;
                if (dtpVar == null) {
                    u890.C("loggerFactory");
                    throw null;
                }
                String str = (String) nlm0Var.c2.getValue();
                String str2 = (String) nlm0Var.d2.getValue();
                i8h1 i8h1Var = (i8h1) ((olm0) ((z2p) dtpVar.a.b).b).b.get();
                c8o.l(i8h1Var);
                return new plm0(str, str2, i8h1Var);
            case 2:
                return nlm0Var.O0().getString("message_id");
            case 3:
                return nlm0Var.O0().getString("page_id");
            default:
                return nlm0Var.O0().getString("view_uri");
        }
    }
}
