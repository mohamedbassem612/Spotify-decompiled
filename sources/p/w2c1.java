package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Update;
import com.spotify.mobius.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w2c1 extends xbk1 implements y1c1 {
    public final MobiusLoop b;
    public final kdn0 c;
    public final Disposable d;
    public final bpb1 f;
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public w2c1(List list, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Object obj;
        this.f = gio1.b(new u2c1(linkedHashMap));
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((nve0) it.next()).b());
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = new qs7((Update) next, (Update) it2.next(), (byte) 1);
            }
            obj = next;
        } else {
            obj = null;
        }
        gp71 gp71Var = (Update) obj;
        gp71Var = gp71Var == null ? gp71.k : gp71Var;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            Connectable connectableA = ((nve0) it3.next()).a();
            if (connectableA != null) {
                arrayList3.add(connectableA);
            }
        }
        MobiusLoop mobiusLoopG = Mobius.d(gp71Var, new lud(arrayList3, (byte) 2)).i(new lud(arrayList, (byte) 2)).g(linkedHashMap);
        this.b = mobiusLoopG;
        this.c = new kdn0(linkedHashMap);
        this.d = mobiusLoopG.b(new y11(this, (byte) 24));
    }

    public final void S() {
        this.b.dispose();
        this.d.dispose();
    }

    public final void T(Object obj) {
        this.b.a(obj);
    }

    public final zob1 U(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.g;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            bpb1 bpb1Var = this.f;
            xe01 xe01VarT = d5p1.t(new a1b1(bpb1Var, cls, (byte) 5), ack1.a(this), ey71.a, dug.l(cls, ((u2c1) bpb1Var.getValue()).a));
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, xe01VarT);
            obj = objPutIfAbsent == null ? xe01VarT : objPutIfAbsent;
        }
        return (zob1) obj;
    }

    public final mmr0 V(Class cls) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.e;
        Object objH = concurrentHashMap.get(cls);
        kdn0 kdn0Var = this.c;
        if (objH == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (objH = w6d1.h(w6d1.q(kdn0Var, new l5b1(cls, (byte) 19)))))) != null) {
            objH = objPutIfAbsent;
        }
        Object objE = kdn0Var.e();
        objE.getClass();
        return new mmr0((ymd0) objH, dug.l(cls, (Map) objE));
    }
}
