package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kp61 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lp61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp61(lp61 lp61Var, byte b) {
        super(0);
        this.a = b;
        this.b = lp61Var;
    }

    public final Object invoke() {
        byte b = this.a;
        lp61 lp61Var = this.b;
        switch (b) {
            case 0:
                jgb1 jgb1Var = lp61Var.a.b;
                return new if5(jgb1Var.f, null, jgb1Var.g, null, 8);
            default:
                jp61 jp61Var = lp61Var.a;
                jgb1 jgb1Var2 = jp61Var.b;
                km61 km61Var = new km61(jp61Var);
                Integer num = jgb1Var2.h;
                a2i a2iVar = jgb1Var2.i;
                return new if5(num, null, null, a2iVar != null ? new hf5(a2iVar, km61Var) : null, 4);
        }
    }
}
