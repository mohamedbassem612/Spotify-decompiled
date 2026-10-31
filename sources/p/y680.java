package p;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y680 implements zga {
    public final HashMap a;
    public final HashMap b;
    public final w680 c;
    public final String d;

    public y680(s900 s900Var, ac00 ac00Var, t561 t561Var) {
        HashMap map = new HashMap();
        this.a = map;
        this.b = map;
        this.c = new w680(s900Var, ac00Var, t561Var);
        this.d = UUID.randomUUID().toString();
    }

    @Override // p.zga
    public final void a(Collection collection) {
        x680 x680Var = new x680(collection, this, (byte) 0);
        synchronized (this.b) {
            x680Var.invoke();
        }
    }

    @Override // p.zga
    public final n561 b(String str) {
        Object objInvoke;
        nd70 nd70Var = new nd70(this, (byte) 11);
        synchronized (this.b) {
            objInvoke = nd70Var.invoke();
        }
        return (n561) objInvoke;
    }
}
