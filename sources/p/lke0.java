package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import j$.time.Instant;
import j$.time.ZoneId;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lke0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qes a;

    public lke0(qes qesVar) {
        this.a = qesVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        nhe0 nhe0Var = ((yje0) obj).c;
        Integer num = nhe0Var.c;
        if (num != null) {
            int iIntValue = num.intValue();
            String str = nhe0Var.a;
            String str2 = nhe0Var.b;
            if (str2 == null) {
                str2 = "";
            }
            qes qesVar = this.a;
            hma1 hma1VarEdit = qesVar.a.edit();
            hma1VarEdit.d(oig0.a, str);
            hma1VarEdit.d(oig0.b, str2);
            hma1VarEdit.b(oig0.c, iIntValue);
            hma1VarEdit.c(oig0.d, Instant.ofEpochMilli(qesVar.b.b()).atZone(ZoneId.systemDefault()).toLocalDate().toEpochDay());
            hma1VarEdit.g();
        }
        return rih1.a;
    }
}
