package p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gz9 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ oud a;

    public gz9(oud oudVar) {
        this.a = oudVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        r8d1 u8d1Var;
        fz9 fz9Var = (fz9) obj;
        ArrayList arrayList = fz9Var.c;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            llw0 llw0Var = (llw0) obj2;
            boolean z = i == fz9Var.d;
            String strC = f4i1.c(i, "backgroundOption");
            if (llw0Var instanceof jlw0) {
                jlw0 jlw0Var = (jlw0) llw0Var;
                u8d1Var = new r8d1(strC, z, jlw0Var.b, Uri.parse(jlw0Var.a));
            } else if (llw0Var instanceof ilw0) {
                ilw0 ilw0Var = (ilw0) llw0Var;
                u8d1Var = new o8d1(strC, ilw0Var.c, p7h.M(new u7h[]{new u7h(z4p1.e(ilw0Var.a)), new u7h(z4p1.e(ilw0Var.b))}), z);
            } else {
                if (!(llw0Var instanceof klw0)) {
                    eg.o();
                    return null;
                }
                klw0 klw0Var = (klw0) llw0Var;
                u8d1Var = new u8d1(strC, z, klw0Var.g, Uri.parse(klw0Var.a), 3);
            }
            arrayList2.add(u8d1Var);
            i = i2;
        }
        Object objA = this.a.a(new hud(new on71(new f9d1(arrayList2), new rn71(rc11.a.b(i9d1.class)))), onmVar);
        return objA == d9n.a ? objA : rih1.a;
    }
}
