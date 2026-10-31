package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sp90 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ up90 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sp90(up90 up90Var, boolean z, byte b) {
        super(0);
        this.a = b;
        this.b = up90Var;
        this.c = z;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        up90 up90Var = this.b;
        switch (b) {
            case 0:
                up90Var.e.p.onNext(new d4a1(z));
                break;
            default:
                up90Var.e.p.onNext(new f4a1(z));
                break;
        }
        return rih1Var;
    }
}
