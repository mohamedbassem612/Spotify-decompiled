package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cj80 extends hab0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ y7e1 e;
    public final /* synthetic */ az20 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj80(boolean z, boolean z2, boolean z3, iu30 iu30Var, y7e1 y7e1Var, az20 az20Var) {
        super(0);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = iu30Var;
        this.e = y7e1Var;
        this.f = az20Var;
    }

    public final Object invoke() {
        if (!this.a && this.b && this.c) {
            y7e1 y7e1Var = this.e;
            this.d.invoke(new mi80(y7e1Var.d().d.toString(), null));
            az20.a(this.f);
            c4p1.E("", y7e1Var);
        }
        return rih1.a;
    }
}
