package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aze implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public aze(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        bph0 bph0Var;
        kxe kxeVar = (kxe) obj;
        lxh1 lxh1Var = this.a.y;
        String str = kxeVar.a;
        String str2 = kxeVar.b;
        ArrayList<jxe> arrayList = kxeVar.c;
        q9i0 q9i0Var = (q9i0) lxh1Var.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (jxe jxeVar : arrayList) {
            String str3 = jxeVar.a;
            String str4 = jxeVar.b;
            int iC = l1d.C(jxeVar.c);
            if (iC == 0) {
                bph0Var = aph0.a;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                bph0Var = bph0.a;
            }
            arrayList2.add(new woh0(str3, str4, bph0Var, jxeVar.d, jxeVar.e));
        }
        q9i0Var.h(str, str2, arrayList2, false);
        return rih1.a;
    }
}
