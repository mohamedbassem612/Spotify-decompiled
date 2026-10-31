package p;

import android.os.Looper;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p1d0 {
    public final dmj1 a;
    public final Map b;
    public final short c;
    public final iu30 d;
    public final Map e;
    public final LinkedHashSet f;
    public int g;
    public final bpb1 h;
    public final bpb1 i;
    public Map j;

    /* JADX WARN: Type inference failed for: r5v1, types: [int, short] */
    public p1d0(dmj1 dmj1Var, Map map, long j, iu30 iu30Var) {
        Map linkedHashMap;
        this.a = dmj1Var;
        this.b = map;
        this.c = (int) j;
        this.d = iu30Var;
        bbk1 bbk1VarD = dmj1Var.d();
        boolean z = bbk1VarD instanceof cbk1;
        b7x b7xVar = b7x.a;
        if (z) {
            linkedHashMap = b7xVar;
        } else {
            if (!(bbk1VarD instanceof bbk1)) {
                eg.o();
                throw null;
            }
            Map mapA = bbk1VarD.a();
            linkedHashMap = new LinkedHashMap(zno1.s(mapA.size()));
            for (Map.Entry entry : mapA.entrySet()) {
                linkedHashMap.put(entry.getKey(), new idd1(new bsc0((Function0) entry.getValue(), (Class) entry.getKey(), (byte) 2)));
            }
        }
        this.e = linkedHashMap;
        this.f = new LinkedHashSet();
        this.g = linkedHashMap.size();
        this.h = gio1.b(new rnc0());
        this.i = gio1.b(z6x.a);
        this.j = b7xVar;
    }

    public final void a(RecyclerView recyclerView, iac0 iac0Var, androidx.recyclerview.widget.a aVar, boolean z) {
        byte b = 1;
        boolean z2 = z && !(aVar instanceof GridLayoutManager) && (aVar instanceof LinearLayoutManager) && ((LinearLayoutManager) aVar).Q0 == 1;
        new ne(2, new o1d0(this, b)).f(recyclerView, aVar, z2);
        c921.y(cto1.q(iac0Var), (o8n) null, 0, new t6a(iac0Var, this, recyclerView, z2, (lnm) null, (byte) 1), 3);
    }

    public final void b(rnc0 rnc0Var) {
        List list = rnc0Var.b;
        if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            eg.m("submitList must run on the main thread");
            return;
        }
        if (this.g > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Class<?> cls = ((h8k1) it.next()).a.getClass();
                LinkedHashSet linkedHashSet = this.f;
                if (!linkedHashSet.contains(cls)) {
                    znb0 znb0Var = (znb0) this.e.get(cls);
                    if (znb0Var != null) {
                        znb0Var.getValue();
                        this.g--;
                    }
                    linkedHashSet.add(cls);
                }
                if (this.g == 0) {
                    break;
                }
            }
        }
        List list2 = list;
        int iS = zno1.s(q7h.U(list2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : list2) {
            linkedHashMap.put(((h8k1) obj).a, obj);
        }
        this.j = linkedHashMap;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((h8k1) it2.next()).a);
        }
        bpb1 bpb1Var = this.i;
        bpb1Var.getClass();
        bpb1Var.m(null, arrayList);
        bpb1 bpb1Var2 = this.h;
        bpb1Var2.getClass();
        bpb1Var2.m(null, rnc0Var);
    }

    public p1d0(LinkedHashMap linkedHashMap, Map map, long j, iu30 iu30Var) {
        this(n8p1.u(linkedHashMap), map, j, iu30Var);
    }
}
