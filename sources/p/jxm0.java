package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jxm0 extends hab0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ zja1 b;
    public final /* synthetic */ aka1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxm0(boolean z, zja1 zja1Var, aka1 aka1Var, boolean z2, iu30 iu30Var, int i) {
        super(0);
        this.a = z;
        this.b = zja1Var;
        this.c = aka1Var;
        this.d = z2;
        this.e = iu30Var;
        this.f = i;
    }

    public final Object invoke() {
        if (this.a) {
            bka1.b(this.b, this.c, this.d ? fw80.d : fw80.e);
            this.e.invoke(Integer.valueOf(this.f));
        }
        return rih1.a;
    }
}
