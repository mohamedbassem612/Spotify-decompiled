package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z1a0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ c2a0 a;

    public z1a0(c2a0 c2a0Var) {
        this.a = c2a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        y1a0 y1a0Var;
        if (onmVar instanceof y1a0) {
            y1a0Var = (y1a0) onmVar;
            int i = y1a0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                y1a0Var.b = i - Integer.MIN_VALUE;
            } else {
                y1a0Var = new y1a0(this, onmVar);
            }
        } else {
            y1a0Var = new y1a0(this, onmVar);
        }
        Object obj2 = y1a0Var.a;
        int i2 = y1a0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            lt20 lt20Var = new lt20(new ry50(this.a.e.r(), (byte) 21), new ob00(3, null, (byte) 4), (byte) 0);
            cg00 cg00Var = new cg00(r261Var, (byte) 22);
            y1a0Var.b = 1;
            Object objCollect = lt20Var.collect(cg00Var, y1a0Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
