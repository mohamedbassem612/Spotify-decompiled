package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bw10 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ scx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw10(Function0 function0, scx scxVar) {
        super(0);
        this.b = function0;
        this.c = scxVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        scx scxVar = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                scxVar.a();
                function0.invoke();
                break;
            default:
                function0.invoke();
                scxVar.a();
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw10(scx scxVar, Function0 function0) {
        super(0);
        this.c = scxVar;
        this.b = function0;
    }
}
