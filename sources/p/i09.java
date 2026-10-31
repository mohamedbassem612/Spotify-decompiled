package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i09 implements Function {
    public List a;

    /* JADX WARN: Code duplicated, block: B:20:0x004d A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:12:0x0029, B:30:0x0087, B:18:0x0047, B:20:0x004d, B:21:0x005b, B:23:0x0061, B:25:0x006e, B:31:0x0091, B:32:0x0098, B:33:0x0099, B:17:0x0040), top: B:37:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0061 A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:12:0x0029, B:30:0x0087, B:18:0x0047, B:20:0x004d, B:21:0x005b, B:23:0x0061, B:25:0x006e, B:31:0x0091, B:32:0x0098, B:33:0x0099, B:17:0x0040), top: B:37:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0084 -> B:30:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object a(p.erv r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.a941
            if (r0 == 0) goto L13
            r0 = r10
            p.a941 r0 = (p.a941) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.a941 r0 = new p.a941
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            java.util.Iterator r9 = r0.c
            java.util.List r1 = r0.b
            java.util.List r1 = (java.util.List) r1
            p.erv r3 = r0.a
            p.hm5.M(r10)     // Catch: java.lang.Exception -> La1
            goto L87
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L34:
            p.hm5.M(r10)
            java.util.List r10 = r9.a
            java.util.Collection r10 = (java.util.Collection) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            java.util.Iterator r10 = r1.iterator()     // Catch: java.lang.Exception -> La1
            r7 = r10
            r10 = r9
            r9 = r7
        L47:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Exception -> La1
            if (r3 == 0) goto L99
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Exception -> La1
            p.ilq0 r3 = (p.ilq0) r3     // Catch: java.lang.Exception -> La1
            java.util.List r4 = r8.a     // Catch: java.lang.Exception -> La1
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Exception -> La1
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> La1
        L5b:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> La1
            if (r5 == 0) goto L91
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> La1
            r6 = r5
            p.tlq0 r6 = (p.tlq0) r6     // Catch: java.lang.Exception -> La1
            boolean r6 = r6.a(r3)     // Catch: java.lang.Exception -> La1
            if (r6 == 0) goto L5b
            p.tlq0 r5 = (p.tlq0) r5     // Catch: java.lang.Exception -> La1
            r0.a = r10     // Catch: java.lang.Exception -> La1
            r4 = r1
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Exception -> La1
            r0.b = r4     // Catch: java.lang.Exception -> La1
            r0.c = r9     // Catch: java.lang.Exception -> La1
            r0.f = r2     // Catch: java.lang.Exception -> La1
            java.lang.Object r3 = r5.b(r3, r0)     // Catch: java.lang.Exception -> La1
            p.d9n r4 = p.d9n.a
            if (r3 != r4) goto L84
            return r4
        L84:
            r7 = r3
            r3 = r10
            r10 = r7
        L87:
            p.py21 r10 = (p.py21) r10     // Catch: java.lang.Exception -> La1
            r10.d()     // Catch: java.lang.Exception -> La1
            r9.remove()     // Catch: java.lang.Exception -> La1
            r10 = r3
            goto L47
        L91:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException     // Catch: java.lang.Exception -> La1
            java.lang.String r9 = "Collection contains no element matching the predicate."
            r8.<init>(r9)     // Catch: java.lang.Exception -> La1
            throw r8     // Catch: java.lang.Exception -> La1
        L99:
            p.osv r8 = new p.osv     // Catch: java.lang.Exception -> La1
            p.arv r9 = r10.b     // Catch: java.lang.Exception -> La1
            r8.<init>(r9)     // Catch: java.lang.Exception -> La1
            return r8
        La1:
            p.bsv r8 = new p.bsv
            r8.<init>(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i09.a(p.erv, p.onm):java.lang.Object");
    }

    public Object apply(Object obj) {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (!list.contains(((hi90) obj2).getUri())) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public j09 b() {
        List list = this.a;
        if (list != null) {
            return new j09(list);
        }
        eg.m("Missing required properties: rolloutAssignments");
        return null;
    }

    public void c(List list) {
        if (list != null) {
            this.a = list;
        } else {
            bhn0.i("Null rolloutAssignments");
        }
    }

    public i09() {
    }
}
