package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sx3 {
    public final qns0 a;
    public final o241 b;
    public final ux3 c;

    public sx3(qns0 qns0Var, o241 o241Var, ux3 ux3Var) {
        this.a = qns0Var;
        this.b = o241Var;
        this.c = ux3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        qx3 qx3Var;
        if (onmVar instanceof qx3) {
            qx3Var = (qx3) onmVar;
            int i = qx3Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qx3Var.c = i - Integer.MIN_VALUE;
            } else {
                qx3Var = new qx3(this, onmVar);
            }
        } else {
            qx3Var = new qx3(this, onmVar);
        }
        Object objJ = qx3Var.a;
        int i2 = qx3Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleFirstOrError = this.b.a.firstOrError();
            qx3Var.c = 1;
            objJ = fc11.j(singleFirstOrError, qx3Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        Map map = (Map) objJ;
        if (!y7y0.t("filter-explicit-content", map) && !y7y0.t("obfuscate-restricted-tracks", map)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r9 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable b(java.util.List r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.rx3
            if (r0 == 0) goto L13
            r0 = r9
            p.rx3 r0 = (p.rx3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.rx3 r0 = new p.rx3
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            p.w7x r4 = p.w7x.a
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3a
            if (r1 != r3) goto L34
            java.util.List r7 = r0.a
            java.util.List r7 = (java.util.List) r7
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            goto L7b
        L31:
            r7 = move-exception
            goto Lb9
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L3a:
            java.util.List r8 = r0.a
            java.util.List r8 = (java.util.List) r8
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            goto L63
        L42:
            p.hm5.M(r9)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto Lc3
            p.ux3 r9 = r7.c
            boolean r9 = r9.a()
            if (r9 != 0) goto L55
            goto Lc3
        L55:
            r9 = r8
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            r0.a = r9     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            r0.d = r5     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            java.lang.Object r9 = r7.a(r0)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            if (r9 != r6) goto L63
            goto L7a
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            if (r9 != 0) goto L6c
            goto Lc3
        L6c:
            p.qns0 r7 = r7.a     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            java.lang.String r9 = "assisted-curation"
            r0.a = r2     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            r0.d = r3     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            java.lang.Object r9 = r7.a(r9, r8, r0, r5)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            if (r9 != r6) goto L7b
        L7a:
            return r6
        L7b:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            r7.<init>()     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            java.util.Iterator r8 = r9.iterator()     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
        L86:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            if (r9 == 0) goto L9b
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            r0 = r9
            p.qfd r0 = (p.qfd) r0     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            boolean r0 = r0.b     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            if (r0 == 0) goto L86
            r7.add(r9)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            goto L86
        L9b:
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            r8.<init>()     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
        La4:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            if (r9 == 0) goto Lb6
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            p.qfd r9 = (p.qfd) r9     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            java.lang.String r9 = r9.a     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            r8.add(r9)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> Lb7
            goto La4
        Lb6:
            return r8
        Lb7:
            r7 = move-exception
            goto Lc2
        Lb9:
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = "Failed to look up allowlisted tracks"
            com.spotify.base.java.logging.Logger.e(r7, r9, r8)
            return r4
        Lc2:
            throw r7
        Lc3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sx3.b(java.util.List, p.onm):java.io.Serializable");
    }
}
