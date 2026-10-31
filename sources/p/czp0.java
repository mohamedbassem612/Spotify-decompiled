package p;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class czp0 {
    public final List a;

    public czp0(azp0... azp0VarArr) {
        ArrayList arrayList = new ArrayList(azp0VarArr.length);
        for (azp0 azp0Var : azp0VarArr) {
            arrayList.add(azp0Var.F);
        }
        this.a = o7h.j0(arrayList);
    }

    public final void a() {
        Socket socket;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            k7v k7vVar = ((w9l) it.next()).a;
            Iterator it2 = ((ConcurrentLinkedQueue) k7vVar.e).iterator();
            while (it2.hasNext()) {
                kf01 kf01Var = (kf01) it2.next();
                kf01Var.getClass();
                synchronized (kf01Var) {
                    if (kf01Var.q.isEmpty()) {
                        it2.remove();
                        kf01Var.k = true;
                        socket = kf01Var.e;
                    } else {
                        socket = null;
                    }
                }
                if (socket != null) {
                    z4n1.c(socket);
                }
            }
            if (((ConcurrentLinkedQueue) k7vVar.e).isEmpty()) {
                ((hsd1) k7vVar.c).a();
            }
        }
    }
}
