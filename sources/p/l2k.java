package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class l2k implements it80 {
    public final void a(ajq0 ajq0Var) {
        for (acr0 acr0Var : b()) {
            Iterator it = acr0Var.a().iterator();
            while (it.hasNext()) {
                ajq0Var.J(l6o1.o(new jbh0[]{new ebu((blc0) it.next(), (byte) 7), new ebu(acr0Var, (byte) 4)}), acr0Var.getDescription(), new mp8(acr0Var, (byte) 24));
            }
            Iterator it2 = acr0Var.e().iterator();
            while (it2.hasNext()) {
                ajq0Var.J(l6o1.o(new jbh0[]{new ebu((b3i1) it2.next(), (byte) 8), new ebu(acr0Var, (byte) 4)}), acr0Var.getDescription(), new mp8(acr0Var, (byte) 24));
            }
        }
    }

    public abstract Set b();
}
