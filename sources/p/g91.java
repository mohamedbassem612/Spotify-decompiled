package p;

import android.content.res.Resources;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g91 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ aa1 a;

    public g91(aa1 aa1Var) {
        this.a = aa1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        mmr0 mmr0Var;
        q81 q81Var = (q81) obj;
        d91 d91Var = this.a.a;
        String str = q81Var.c;
        iyr0 iyr0Var = q81Var.d;
        g4a g4aVar = q81Var.e;
        yu3 yu3Var = d91Var.f;
        yu3Var.getClass();
        iyr0 iyr0Var2 = iyr0.a;
        if (iyr0Var == iyr0Var2 && g4aVar == g4a.d) {
            mmr0Var = new mmr0(2131951890, t7l0.ARTIST_IS_ALREADY_APPROVED);
        } else {
            t7l0 t7l0Var = t7l0.ARTIST_IS_ALREADY_BLOCKED;
            g4a g4aVar2 = g4a.c;
            if (iyr0Var != iyr0Var2 || g4aVar != g4aVar2) {
                if (iyr0Var == iyr0.b && g4aVar == g4aVar2) {
                    mmr0Var = new mmr0(2131951891, t7l0Var);
                } else {
                    Logger.k("Unexpected call to show entity disabled reason snackbar.", new Object[0]);
                }
                return rih1.a;
            }
            mmr0Var = new mmr0(2131951892, t7l0Var);
        }
        int iIntValue = ((Number) mmr0Var.a).intValue();
        t7l0 t7l0Var2 = (t7l0) mmr0Var.b;
        it8 it8Var = (it8) yu3Var.e;
        ((i8h1) ((idd1) it8Var.c).getValue()).f(new wqk0(t7l0Var2, str, ((w6h1) it8Var.b).b()).e(), (Set) null);
        ((kt91) yu3Var.c).k(new er91((fs91) null, ((Resources) yu3Var.b).getString(iIntValue), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        return rih1.a;
    }
}
