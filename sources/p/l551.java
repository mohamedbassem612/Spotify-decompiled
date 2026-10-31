package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l551 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jqd0 b;
    public final /* synthetic */ q1o1 c;
    public final /* synthetic */ z551 d;
    public final /* synthetic */ tv80 e;
    public final /* synthetic */ v051 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l551(jqd0 jqd0Var, q1o1 q1o1Var, z551 z551Var, tv80 tv80Var, v051 v051Var, byte b) {
        super(0);
        this.a = b;
        this.b = jqd0Var;
        this.c = q1o1Var;
        this.d = z551Var;
        this.e = tv80Var;
        this.f = v051Var;
    }

    public final Object invoke() {
        byte b = this.a;
        v051 v051Var = this.f;
        switch (b) {
            case 0:
                return this.b.u(this.c, this.d, this.e, v051Var.c);
            case 1:
                return this.b.u(this.c, this.d, this.e, v051Var.c);
            default:
                return this.b.u(this.c, this.d, this.e, v051Var.c);
        }
    }
}
