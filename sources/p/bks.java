package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bks implements o5s {
    public final /* synthetic */ cks a;
    public final /* synthetic */ boolean b;

    public bks(cks cksVar, boolean z) {
        this.a = cksVar;
        this.b = z;
    }

    public final void onCreate(iac0 iac0Var) {
        cks cksVar = this.a;
        i94 i94Var = (i94) cksVar.i;
        i94Var.e("session_ui_plugins_on_create_ui");
        Set set = cksVar.a;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((iyf0) it.next()).g(((l1g0) cksVar.g.get()).b());
        }
        i94Var.a("session_ui_plugins_on_create_ui");
        c921.y(cto1.q(cksVar.b), (o8n) null, 0, new mx(cksVar, (lnm) null, (byte) 15), 3);
        if (this.b) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((iyf0) it2.next()).i();
            }
        }
    }
}
