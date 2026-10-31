package p;

import android.content.Context;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ndi1 implements f961 {
    public final Context a;
    public final q8n b;
    public final String c;
    public final LinkedHashMap d;

    public ndi1(Context context, tg8 tg8Var, Set set, q8n q8nVar) {
        this.a = context;
        this.b = q8nVar;
        String str = tg8Var.a.a;
        this.c = str;
        if (ihc1.y0(str)) {
            hhg1.n("Username cannot be blank");
            throw null;
        }
        byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes(Charset.defaultCharset()));
        bArrDigest.getClass();
        String strConcat = "user-".concat(f46.r0(bArrDigest, qi71.a1, 30));
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            List<a1c1> list = ((zv5) it.next()).a;
            ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
            for (a1c1 a1c1Var : list) {
                String strA = ((hii1) a1c1Var.a).a();
                hii1 hii1Var = (hii1) a1c1Var.a;
                arrayList2.add(new vrj0(strA, hii1Var.a, hii1Var.b, a1c1Var.b));
            }
            r7h.W(arrayList2, arrayList);
        }
        this.d = a4p1.u(context, strConcat, arrayList);
    }

    public final r4r a(String str) {
        ConcurrentHashMap concurrentHashMap = t4r.a;
        File file = new File(this.a.getApplicationContext().getFilesDir(), cy30.p("datastore/", str, "_", f46.r0(MessageDigest.getInstance("SHA-256").digest(this.c.getBytes(StandardCharsets.UTF_8)), osh1.c1, 30), ".preferences_pb"));
        return (r4r) t4r.a.computeIfAbsent(file.getAbsolutePath(), new s4r(p7h.N(this.d.get(str)), this.b, file));
    }

    public final Object b(hii1 hii1Var, Object obj, onm onmVar) {
        Object objH = jm5.h(a(hii1Var.a()), new ku91(hii1Var, obj, null, (byte) 23), onmVar);
        return objH == d9n.a ? objH : rih1.a;
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
