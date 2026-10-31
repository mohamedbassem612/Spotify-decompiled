package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vj20 {
    public static final vj20 a = new vj20();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static tj20 a(di61 di61Var) {
        Object obj = b.get(di61Var);
        if (obj != null) {
            return (tj20) obj;
        }
        bhn0.u("Cannot get dependency ", di61Var, ". Dependencies should be added at class load time.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008c -> B:30:0x008d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(p.onm r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p.uj20
            if (r0 == 0) goto L13
            r0 = r9
            p.uj20 r0 = (p.uj20) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            p.uj20 r0 = new p.uj20
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r8 = r0.g
            int r9 = r0.i
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L38
            if (r9 != r1) goto L32
            java.lang.Object r9 = r0.f
            java.util.Map r3 = r0.e
            p.xgn0 r4 = r0.d
            p.di61 r5 = r0.c
            java.util.Iterator r6 = r0.b
            java.util.Map r7 = r0.a
            p.hm5.M(r8)
            goto L8d
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L38:
            p.hm5.M(r8)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            java.util.Map r9 = p.vj20.b
            int r3 = r9.size()
            int r3 = p.zno1.s(r3)
            r8.<init>(r3)
            java.util.Set r9 = r9.entrySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r3 = r8
            r6 = r9
        L56:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lbb
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r4 = r8.getKey()
            r5 = r4
            p.di61 r5 = (p.di61) r5
            java.lang.Object r8 = r8.getValue()
            p.tj20 r8 = (p.tj20) r8
            p.xgn0 r4 = r8.a
            r0.a = r3
            r0.b = r6
            r0.c = r5
            r0.d = r4
            r0.e = r3
            r0.f = r9
            r0.i = r1
            java.lang.Object r8 = r4.a(r0)
            p.d9n r7 = p.d9n.a
            if (r8 != r7) goto L8c
            return r7
        L8c:
            r7 = r3
        L8d:
            p.tj20 r8 = a(r5)     // Catch: java.lang.Throwable -> Lb6
            p.ghn r8 = r8.b     // Catch: java.lang.Throwable -> Lb6
            if (r8 == 0) goto L9d
            r4.c(r2)
            r3.put(r9, r8)
            r3 = r7
            goto L56
        L9d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "Subscriber "
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lb6
            r9.append(r5)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = " has not been registered."
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb6
            throw r8     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r8 = move-exception
            r4.c(r2)
            throw r8
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vj20.b(p.onm):java.lang.Object");
    }
}
