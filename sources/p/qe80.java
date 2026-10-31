package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qe80 implements Connection {
    public final LinkedHashSet a = new LinkedHashSet();
    public boolean b;
    public final /* synthetic */ se80 c;
    public final /* synthetic */ Consumer d;

    public qe80(se80 se80Var, Consumer consumer) {
        this.c = se80Var;
        this.d = consumer;
    }

    public final void accept(Object obj) {
        je80 je80Var = (je80) obj;
        boolean z = je80Var instanceof ie80;
        Consumer consumer = this.d;
        LinkedHashSet linkedHashSet = this.a;
        se80 se80Var = this.c;
        if (z) {
            this.b = true;
            linkedHashSet.add(fn31.T(smo1.e(se80Var.e), (o8n) null, 0, new pe80(je80Var, se80Var, consumer, (lnm) null), 3));
        } else if (je80Var instanceof he80) {
            linkedHashSet.add(fn31.T(smo1.e(se80Var.d), (o8n) null, 0, new f530(je80Var, se80Var, consumer, (lnm) null, (byte) 23), 3));
        } else {
            eg.o();
        }
    }

    public final void dispose() {
        if (this.b && (this.c.f instanceof de80)) {
            this.c.g.set(false);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((faa0) it.next()).d((CancellationException) null);
        }
    }
}
