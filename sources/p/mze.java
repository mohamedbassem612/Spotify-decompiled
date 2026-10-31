package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mze implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public mze(o0f o0fVar) {
        this.a = o0fVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        lze lzeVar;
        if (onmVar instanceof lze) {
            lzeVar = (lze) onmVar;
            int i = lzeVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzeVar.b = i - Integer.MIN_VALUE;
            } else {
                lzeVar = new lze(this, onmVar);
            }
        } else {
            lzeVar = new lze(this, onmVar);
        }
        lze lzeVar2 = lzeVar;
        Object obj2 = lzeVar2.a;
        int i2 = lzeVar2.b;
        if (i2 == 0) {
            hm5.M(obj2);
            zxe zxeVar = (zxe) obj;
            y441 y441Var = this.a.h;
            String str = zxeVar.a;
            String str2 = zxeVar.b;
            String str3 = zxeVar.c;
            sl01 sl01Var = zxeVar.d;
            lzeVar2.b = 1;
            Object objZ = y441Var.z(str, str2, str3, sl01Var, lzeVar2);
            d9n d9nVar = d9n.a;
            if (objZ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
            Object obj3 = ((e331) obj2).a;
        }
        return rih1.a;
    }
}
