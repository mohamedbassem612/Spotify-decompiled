package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eow implements l01 {
    public final Context a;
    public final zeu b;

    public eow(Context context, zeu zeuVar) {
        this.a = context;
        this.b = zeuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(lnm lnmVar) {
        cow cowVar;
        eow eowVar = this;
        if (lnmVar instanceof cow) {
            cowVar = (cow) lnmVar;
            int i = cowVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cowVar.d = i - Integer.MIN_VALUE;
            } else {
                cowVar = new cow(eowVar, lnmVar);
            }
        } else {
            cowVar = new cow(eowVar, lnmVar);
        }
        Object objB = cowVar.b;
        int i2 = cowVar.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            cowVar.a = eowVar;
            cowVar.d = 1;
            zeu zeuVar = eowVar.b;
            objB = ((c610) zeuVar.a).b(new r9c(null, "root", null, null, lro1.r(((Context) zeuVar.b).getPackageName()), true, false, new hlr0(5), 3, 2, null, false, 254893), cowVar);
            if (objB != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objB);
                return objB;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        eowVar = cowVar.a;
        hm5.M(objB);
        cowVar.a = null;
        cowVar.d = 2;
        Object objB2 = eowVar.b((z310) objB, cowVar);
        return objB2 == d9nVar ? d9nVar : objB2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0077 -> B:20:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0055
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(p.z310 r12, p.onm r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof p.dow
            if (r0 == 0) goto L13
            r0 = r13
            p.dow r0 = (p.dow) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            p.dow r0 = new p.dow
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.g
            int r1 = r0.i
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L34
            int r12 = r0.f
            int r1 = r0.e
            int r4 = r0.d
            p.u310 r5 = r0.c
            java.util.Iterator r6 = r0.b
            java.util.Collection r7 = r0.a
            java.util.Collection r7 = (java.util.Collection) r7
            p.hm5.M(r13)
            goto L7a
        L34:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r3
        L3a:
            p.hm5.M(r13)
            java.util.List r12 = r12.a
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
            r1 = 0
            r6 = r12
            r7 = r13
            r12 = r1
            r4 = r12
        L4f:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto Lad
            java.lang.Object r13 = r6.next()
            r5 = r13
            p.u310 r5 = (p.u310) r5
            java.lang.String r13 = r5.a
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            r0.a = r8
            r0.b = r6
            r0.c = r5
            r0.d = r4
            r0.e = r1
            r0.f = r12
            r0.i = r2
            p.zeu r8 = r11.b
            java.lang.Object r13 = r8.p(r13, r0)
            p.d9n r8 = p.d9n.a
            if (r13 != r8) goto L7a
            return r8
        L7a:
            p.z310 r13 = (p.z310) r13
            java.util.List r8 = r13.a
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L86
            r8 = r3
            goto La7
        L86:
            p.h6y r8 = new p.h6y
            java.lang.String r9 = r5.a
            java.lang.String r10 = "spotify:section:0JQ5DAIiKWzVFULQfUm85Y"
            boolean r9 = p.u890.j(r9, r10)
            if (r9 == 0) goto L9c
            android.content.Context r5 = r11.a
            r9 = 2131955511(0x7f130f37, float:1.9547552E38)
            java.lang.String r5 = r5.getString(r9)
            goto La2
        L9c:
            java.lang.String r5 = r5.c
            if (r5 != 0) goto La2
            java.lang.String r5 = ""
        La2:
            java.util.List r13 = r13.a
            r8.<init>(r5, r13)
        La7:
            if (r8 == 0) goto L4f
            r7.add(r8)
            goto L4f
        Lad:
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eow.b(p.z310, p.onm):java.lang.Object");
    }
}
