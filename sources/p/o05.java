package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o05 extends to21 {
    public static boolean g;

    public static void a(vk4 vk4Var, String str, Collection collection, z3j1 z3j1Var, int i, o65 o65Var, CronetException cronetException) {
        o05 o05Var = new o05(str, collection, new d8o(), i, o65Var, cronetException);
        vk4Var.getClass();
        ArrayList<z3j1> arrayList = new ArrayList();
        synchronized (vk4Var.b) {
            arrayList.addAll(vk4Var.b.values());
        }
        if (z3j1Var != null) {
            arrayList.add(z3j1Var);
        }
        for (z3j1 z3j1Var2 : arrayList) {
            try {
                z3j1Var2.a.getExecutor().execute(new ny2(z3j1Var2, o05Var, (byte) 3));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        if (!g) {
            g = true;
        }
        return this.c;
    }
}
