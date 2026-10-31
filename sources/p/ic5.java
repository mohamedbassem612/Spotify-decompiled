package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ic5 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic5(vu30 vu30Var, int i, String str) {
        super(0);
        this.b = vu30Var;
        this.c = i;
        this.d = str;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        int i = this.c;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                vu30Var.invoke(str, Integer.valueOf(i));
                break;
            default:
                vu30Var.invoke(Integer.valueOf(i), str);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic5(vu30 vu30Var, String str, int i) {
        super(0);
        this.b = vu30Var;
        this.d = str;
        this.c = i;
    }
}
