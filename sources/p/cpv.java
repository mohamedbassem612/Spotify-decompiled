package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cpv extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cpv(byte b, String str, iu30 iu30Var, boolean z) {
        super(0);
        this.a = b;
        this.b = z;
        this.c = iu30Var;
        this.d = str;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        iu30 iu30Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    iu30Var.invoke(str);
                }
                break;
            default:
                if (!z) {
                    iu30Var.invoke(new dr10(str));
                }
                break;
        }
        return rih1Var;
    }
}
