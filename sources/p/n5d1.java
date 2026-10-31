package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n5d1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cof0 a;

    public n5d1(cof0 cof0Var) {
        this.a = cof0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        c5d1 c5d1Var = (c5d1) obj;
        g7d1 g7d1Var = c5d1Var.a;
        g7d1 g7d1Var2 = c5d1Var.b;
        p6d1 p6d1Var = c5d1Var.c;
        List list = g7d1Var.b;
        int i = p6d1Var.a;
        List list2 = ((z6d1) list.get(i)).e;
        int i2 = p6d1Var.b;
        boolean z = ((y6d1) list2.get(i2)).d;
        List list3 = g7d1Var2.b;
        boolean z2 = ((y6d1) ((z6d1) list3.get(i)).e.get(i2)).d;
        z6d1 z6d1Var = (z6d1) list3.get(i);
        if (z != z2) {
            cof0 cof0Var = this.a;
            if (z2) {
                if (((y6d1) z6d1Var.e.get(i2)).c || z6d1Var.d == 2) {
                    int size = list2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (i3 != i2 && ((y6d1) list2.get(i3)).d) {
                            cof0.a(cof0Var, g7d1Var2, "event_option_deselected", Integer.valueOf(i3), null, 8);
                        }
                    }
                }
                cof0.a(cof0Var, g7d1Var2, "event_option_selected", Integer.valueOf(i2), null, 8);
            } else {
                cof0.a(cof0Var, g7d1Var2, "event_option_deselected", Integer.valueOf(i2), null, 8);
            }
        }
        return rih1.a;
    }
}
