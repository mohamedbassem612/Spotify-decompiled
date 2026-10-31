package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class evq0 extends hab0 implements Function0 {
    public final /* synthetic */ nwb a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ vy71 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evq0(nwb nwbVar, boolean z, c9n c9nVar, vy71 vy71Var, Function0 function0, ven0 ven0Var) {
        super(0);
        this.a = nwbVar;
        this.b = z;
        this.c = c9nVar;
        this.d = vy71Var;
        this.e = function0;
        this.f = ven0Var;
    }

    public final Object invoke() {
        owb owbVar = this.a.a;
        boolean z = this.b;
        owbVar.invoke(Boolean.valueOf(z));
        if (z) {
            fn31.T(this.c, (o8n) null, 0, new dvq0((Object) this.d, (Object) this.e, this.f, (lnm) null, (byte) 1), 3);
        }
        return rih1.a;
    }
}
