package p;

import io.reactivex.rxjava3.core.Scheduler;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class bba implements wha0 {
    public final Scheduler a;
    public final x390 b;
    public final Duration c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap.KeySetView e = ConcurrentHashMap.newKeySet();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public bba(Scheduler scheduler, x390 x390Var, Duration duration) {
        this.a = scheduler;
        this.b = x390Var;
        this.c = duration;
    }

    public final void a(String str) {
        ConcurrentHashMap concurrentHashMap = this.d;
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            wqd wqdVar = ((aba) ((Map.Entry) it.next()).getValue()).a;
            x390.n(this.b, 1, str);
        }
        concurrentHashMap.clear();
        ((aia0) this).N0.c();
    }

    public final void b(wqd wqdVar, List list) {
        wqdVar.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((xjs) it.next()).b());
        }
        this.b.m(1, "Restriction applied", o7h.p1(arrayList));
    }

    public final void c(String str, Throwable th) {
        ConcurrentHashMap concurrentHashMap = this.d;
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            wqd wqdVar = ((aba) ((Map.Entry) it.next()).getValue()).a;
            String message = th.getMessage();
            if (message == null) {
                message = th.getClass().getName();
            }
            x390.n(this.b, 2, str + ": " + message);
        }
        concurrentHashMap.clear();
        ((aia0) this).N0.c();
    }
}
