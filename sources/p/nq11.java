package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nq11 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rpv0 a;

    public nq11(rpv0 rpv0Var) {
        this.a = rpv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        mq11 mq11Var;
        ph11 huzVar;
        if (onmVar instanceof mq11) {
            mq11Var = (mq11) onmVar;
            int i = mq11Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mq11Var.b = i - Integer.MIN_VALUE;
            } else {
                mq11Var = new mq11(this, onmVar);
            }
        } else {
            mq11Var = new mq11(this, onmVar);
        }
        Object obj2 = mq11Var.a;
        int i2 = mq11Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            List list = ((gq11) obj).a;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (nhc1.Y((String) obj3, "spotify:episode", false)) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.isEmpty()) {
                huzVar = new huz(new awn[0], (byte) 9);
            } else {
                x3v0 x3v0Var = (x3v0) this.a.b;
                Boolean bool = Boolean.TRUE;
                Map mapJ = sqg0.J(new mmr0[]{new mmr0("playabilityRestriction", bool), new mmr0("playable", bool), new mmr0("link", bool)});
                List listSingletonList = Collections.singletonList(22);
                b7x b7xVar = b7x.a;
                huzVar = new ph11(yoi1.g(x3v0Var.b(arrayList, new t3v0(mapJ, b7xVar, b7xVar, listSingletonList, (List) null, 135)).map(b4x0.g).onErrorReturn(new j8q0(arrayList)).onErrorComplete()), (byte) 1);
            }
            klp0 klp0Var = new klp0(r261Var, (byte) 14);
            mq11Var.b = 1;
            Object objCollect = huzVar.collect(klp0Var, mq11Var);
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
