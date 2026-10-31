package p;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class av40 implements f961 {
    public final Context a;
    public final q8n b;
    public final LinkedHashMap c;

    public av40(Context context, Set set, q8n q8nVar) {
        this.a = context;
        this.b = q8nVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            List<a1c1> list = ((h7y) it.next()).a;
            ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
            for (a1c1 a1c1Var : list) {
                arrayList2.add(new vrj0("engage_sdk", ((j7y) a1c1Var.a).a, -1, a1c1Var.b));
            }
            r7h.W(arrayList2, arrayList);
        }
        this.c = a4p1.u(context, "spotify_preferences", arrayList);
    }

    public final r4r a() {
        ConcurrentHashMap concurrentHashMap = t4r.a;
        File file = new File(this.a.getApplicationContext().getFilesDir(), "datastore/engage_sdk.preferences_pb");
        return (r4r) t4r.a.computeIfAbsent(file.getAbsolutePath(), new s4r(p7h.N(this.c.get("engage_sdk")), this.b, file));
    }

    public final Object b(j7y j7yVar, onm onmVar) {
        return b5p1.i(new evz(new lt20(a().getData(), new rf2(3, (lnm) null, (byte) 18), (byte) 0), j7yVar, (byte) 25), onmVar);
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
