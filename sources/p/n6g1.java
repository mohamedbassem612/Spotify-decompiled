package p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n6g1 implements nwf1 {
    public final vlo a;
    public final jl00 b;

    public n6g1(vlo vloVar, jl00 jl00Var) {
        this.a = vloVar;
        this.b = jl00Var;
    }

    public final Single a(List list) {
        return b(list).map(m9x0.U0).map(new ps6(list, (byte) 4)).onErrorReturn(new txa1(list));
    }

    public final Single b(List list) {
        if (list.isEmpty()) {
            Single singleJust = Single.just(b7x.a);
            singleJust.getClass();
            return singleJust;
        }
        Single singleOnErrorReturn = rqt0.G(new k6g1(list, this, (lnm) null)).onErrorReturn(l9x0.U0);
        singleOnErrorReturn.getClass();
        return singleOnErrorReturn;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: Exception -> 0x0034, CancellationException -> 0x00bd, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00bd, Exception -> 0x0034, blocks: (B:12:0x002f, B:38:0x00ab, B:31:0x0086, B:33:0x008c, B:27:0x006a, B:30:0x007b), top: B:45:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00aa -> B:38:0x00ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.util.ArrayList r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.l6g1
            if (r0 == 0) goto L13
            r0 = r10
            p.l6g1 r0 = (p.l6g1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            p.l6g1 r0 = new p.l6g1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.g
            int r1 = r0.i
            p.b7x r2 = p.b7x.a
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 != r3) goto L37
            int r9 = r0.f
            int r1 = r0.e
            java.lang.Object r4 = r0.d
            java.util.Map r5 = r0.c
            java.util.Iterator r6 = r0.b
            java.util.Map r7 = r0.a
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            goto Lab
        L34:
            r8 = move-exception
            goto Lb3
        L37:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L3e:
            p.hm5.M(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L4a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r9.next()
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            p.vlo r5 = r8.a
            boolean r4 = r5.a(r4)
            if (r4 == 0) goto L4a
            r10.add(r1)
            goto L4a
        L63:
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L6a
            return r2
        L6a:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r1 = 10
            int r1 = p.q7h.U(r10, r1)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            int r1 = p.zno1.s(r1)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r4 = 16
            if (r1 >= r4) goto L7b
            r1 = r4
        L7b:
            r9.<init>(r1)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r1 = 0
            r5 = r9
            r6 = r10
            r9 = r1
        L86:
            boolean r10 = r6.hasNext()     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            if (r10 == 0) goto Lb2
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r0.a = r5     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r0.b = r6     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r0.c = r5     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r0.d = r4     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r0.e = r1     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r0.f = r9     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r0.i = r3     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            java.lang.Object r10 = r8.d(r10, r0)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            p.d9n r7 = p.d9n.a
            if (r10 != r7) goto Laa
            return r7
        Laa:
            r7 = r5
        Lab:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r5.put(r4, r10)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> Lbd
            r5 = r7
            goto L86
        Lb2:
            return r5
        Lb3:
            java.lang.String r9 = "TraitResolver: Failed to resolve curation trait URI associations"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.spotify.base.java.logging.Logger.d(r9, r8)
            return r2
        Lbd:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n6g1.c(java.util.ArrayList, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        m6g1 m6g1Var;
        String str2;
        if (onmVar instanceof m6g1) {
            m6g1Var = (m6g1) onmVar;
            int i = m6g1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m6g1Var.c = i - Integer.MIN_VALUE;
            } else {
                m6g1Var = new m6g1(this, onmVar);
            }
        } else {
            m6g1Var = new m6g1(this, onmVar);
        }
        Object objC = m6g1Var.a;
        int i2 = m6g1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                jl00 jl00Var = this.b;
                m6g1Var.c = 1;
                objC = jl00Var.c(str, "aligned_curation", m6g1Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objC);
            }
            uio uioVar = (uio) objC;
            if (uioVar == null || (str2 = uioVar.a) == null || str2.length() == 0) {
                return null;
            }
            return str2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }
}
