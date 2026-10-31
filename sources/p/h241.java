package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h241 {
    public final LinkedHashMap a = new LinkedHashMap(10);
    public final BehaviorSubject b = BehaviorSubject.f();
    public final bpb1 c = gio1.b(z6x.a);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (((p.o710) r2.a.remove(r3.a)) != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(p.o710 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r3.c     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L12
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r3.a     // Catch: java.lang.Throwable -> L37
            java.lang.Object r0 = r0.putIfAbsent(r1, r3)     // Catch: java.lang.Throwable -> L37
            p.o710 r0 = (p.o710) r0     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L39
            goto L1e
        L12:
            java.lang.String r0 = r3.a     // Catch: java.lang.Throwable -> L37
            java.util.LinkedHashMap r1 = r2.a     // Catch: java.lang.Throwable -> L37
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L37
            p.o710 r0 = (p.o710) r0     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L39
        L1e:
            io.reactivex.rxjava3.subjects.BehaviorSubject r0 = r2.b     // Catch: java.lang.Throwable -> L37
            r0.onNext(r3)     // Catch: java.lang.Throwable -> L37
            p.bpb1 r3 = r2.c     // Catch: java.lang.Throwable -> L37
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L37
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L37
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L37
            java.util.List r0 = p.o7h.l1(r0)     // Catch: java.lang.Throwable -> L37
            r1 = 0
            r3.m(r1, r0)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            return
        L37:
            r3 = move-exception
            goto L3b
        L39:
            monitor-exit(r2)
            return
        L3b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h241.a(p.o710):void");
    }
}
