package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uel1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dpo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uel1(boolean z, dpo dpoVar, byte b) {
        super(0);
        this.a = b;
        this.b = z;
        this.c = dpoVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dpo dpoVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    dpoVar.b();
                }
                break;
            case 1:
                if (z) {
                    dpoVar.a();
                }
                break;
            case 2:
                if (z) {
                    dpoVar.b();
                }
                break;
            default:
                if (z) {
                    dpoVar.a();
                }
                break;
        }
        return rih1Var;
    }
}
