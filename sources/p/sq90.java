package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sq90 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tq90 b;
    public final /* synthetic */ hr90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sq90(tq90 tq90Var, hr90 hr90Var, byte b) {
        super(0);
        this.a = b;
        this.b = tq90Var;
        this.c = hr90Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hr90 hr90Var = this.c;
        tq90 tq90Var = this.b;
        switch (b) {
            case 0:
                tq90Var.a.p.onNext(new n3a1(hr90Var));
                break;
            default:
                tq90Var.a.p.onNext(new z3a1(hr90Var));
                break;
        }
        return rih1Var;
    }
}
