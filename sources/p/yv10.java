package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yv10 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ erl1 b;
    public final /* synthetic */ wat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv10(erl1 erl1Var, wat watVar, byte b) {
        super(0);
        this.a = b;
        this.b = erl1Var;
        this.c = watVar;
    }

    public final Object invoke() {
        byte b = this.a;
        wat watVar = this.c;
        erl1 erl1Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(erl1Var.d(watVar));
            case 1:
                return Boolean.valueOf(erl1Var.d(watVar) > 0);
            case 2:
                return Integer.valueOf(erl1Var.d(watVar));
            default:
                return Integer.valueOf(erl1Var.d(watVar));
        }
    }
}
