package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o5n {
    public final g541 a;
    public final bjx b;
    public final uo5 c;

    public o5n(fxu fxuVar, hmn0 hmn0Var, llm llmVar, kks0 kks0Var) {
        this.a = new g541(hmn0Var, kks0Var);
        bjx bjxVar = new bjx((byte) 9);
        this.b = bjxVar;
        this.c = new uo5((Object) fxuVar, (Object) llmVar, (Object) bjxVar, (byte) 23);
    }

    public final void a(rpt0 rpt0Var, String str, boolean z, v8v v8vVar) {
        rpt0 rpt0VarB = rpt0Var.b();
        bjx bjxVar = this.b;
        bjxVar.O(str, rpt0VarB);
        if (bjxVar.H(rpt0VarB)) {
            if (v8vVar != null) {
                v8vVar.f(3);
                return;
            }
            return;
        }
        rpt0 rpt0VarB2 = rpt0Var.b();
        uo5 uo5Var = this.c;
        bjx bjxVar2 = (bjx) uo5Var.d;
        bjxVar2.o(rpt0VarB2);
        if (v8vVar != null) {
            v8vVar.c();
        }
        saa0 saa0VarY = c921.y((llm) uo5Var.c, (o8n) null, 2, new qpa0(uo5Var, rpt0Var, z, rpt0VarB2, v8vVar, null), 1);
        bjxVar2.N(rpt0VarB2, saa0VarY);
        saa0VarY.start();
    }

    public final void b(String str) {
        ConcurrentHashMap concurrentHashMap = this.a.c;
        int length = str.length();
        bjx bjxVar = this.b;
        if (length == 0) {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                ((NativeMediaProcessor) it.next()).destroy();
            }
            concurrentHashMap.clear();
            bjxVar.P();
            return;
        }
        List listQ = bjxVar.Q(str);
        Set setKeySet = concurrentHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            f541 f541Var = (f541) obj;
            if (listQ.contains(Integer.valueOf(f541Var.a())) && f541Var.b().equals(str)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            NativeMediaProcessor nativeMediaProcessor = (NativeMediaProcessor) concurrentHashMap.remove((f541) it2.next());
            if (nativeMediaProcessor != null) {
                nativeMediaProcessor.destroy();
            }
        }
    }
}
