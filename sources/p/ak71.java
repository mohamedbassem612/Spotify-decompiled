package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ak71 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ za71 a;

    public ak71(za71 za71Var) {
        this.a = za71Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        zj71 zj71Var;
        if (onmVar instanceof zj71) {
            zj71Var = (zj71) onmVar;
            int i = zj71Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zj71Var.b = i - Integer.MIN_VALUE;
            } else {
                zj71Var = new zj71(this, onmVar);
            }
        } else {
            zj71Var = new zj71(this, onmVar);
        }
        Object obj2 = zj71Var.a;
        int i2 = zj71Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            fk71 fk71Var = new fk71(this.a.a.l(za71.b, 0) > 0);
            zj71Var.b = 1;
            Object objB = r261Var.b(fk71Var, zj71Var);
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
