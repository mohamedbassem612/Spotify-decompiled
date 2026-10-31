package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vrm0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ wrm0 a;

    public vrm0(wrm0 wrm0Var) {
        this.a = wrm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        urm0 urm0Var;
        if (onmVar instanceof urm0) {
            urm0Var = (urm0) onmVar;
            int i = urm0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                urm0Var.b = i - Integer.MIN_VALUE;
            } else {
                urm0Var = new urm0(this, onmVar);
            }
        } else {
            urm0Var = new urm0(this, onmVar);
        }
        Object obj2 = urm0Var.a;
        int i2 = urm0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            hrm0 hrm0Var = new hrm0(x74.j(this.a.a, "android.permission.RECORD_AUDIO") == 0);
            urm0Var.b = 1;
            Object objB = r261Var.b(hrm0Var, urm0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
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
