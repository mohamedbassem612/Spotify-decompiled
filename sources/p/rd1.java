package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rd1 {
    public final byp0 a;
    public final r5h b;
    public final op31 c;
    public final g7h d;

    public /* synthetic */ rd1(byp0 byp0Var, r5h r5hVar, op31 op31Var, g7h g7hVar) {
        this.a = byp0Var;
        this.b = r5hVar;
        this.c = op31Var;
        this.d = g7hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (p.fc11.i(r5, r0) == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(p.icq0 r6, p.onm r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.aib1
            if (r0 == 0) goto L13
            r0 = r7
            p.aib1 r0 = (p.aib1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.aib1 r0 = new p.aib1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            p.icq0 r6 = r0.a
            p.hm5.M(r7)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            goto L60
        L2c:
            r5 = move-exception
            goto L6a
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L35:
            p.icq0 r6 = r0.a
            p.hm5.M(r7)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            goto L4b
        L3b:
            p.hm5.M(r7)
            java.lang.String r7 = r6.a     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            r0.a = r6     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            r0.d = r3     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            java.lang.Object r7 = r5.c(r7, r0)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            if (r7 != r4) goto L4b
            goto L5f
        L4b:
            p.byp0 r5 = r5.a     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            p.ept r7 = r6.b     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            java.lang.String r1 = r6.a     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            io.reactivex.rxjava3.core.Completable r5 = r5.a(r1, r7)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            r0.a = r6     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            r0.d = r2     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            java.lang.Object r5 = p.fc11.i(r5, r0)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            if (r5 != r4) goto L60
        L5f:
            return r4
        L60:
            p.wdq0 r5 = new p.wdq0     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            p.ept r7 = r6.b     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            java.lang.String r7 = r7.a     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            r5.<init>(r7)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L81
            return r5
        L6a:
            java.lang.String r7 = r6.a
            java.lang.String r0 = "Download failed for: "
            java.lang.String r7 = p.l1d.m(r0, r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.spotify.base.java.logging.Logger.d(r7, r5)
            p.xdq0 r5 = new p.xdq0
            java.lang.String r6 = r6.a
            r5.<init>(r6)
            return r5
        L81:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rd1.a(p.icq0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c9 A[PHI: r10
      0x00c9: PHI (r10v7 java.lang.Object) = (r10v4 java.lang.Object), (r10v12 java.lang.Object) binds: [B:49:0x00d7, B:43:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [int] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public Object b(q021 q021Var, onm onmVar) {
        qd1 qd1Var;
        q021 q021Var2;
        String str;
        ?? r11;
        b3i1 type;
        Object objC;
        int i;
        boolean z;
        Completable completableA;
        q021 q021Var3;
        if (onmVar instanceof qd1) {
            qd1Var = (qd1) onmVar;
            int i2 = qd1Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qd1Var.f = i2 - Integer.MIN_VALUE;
            } else {
                qd1Var = new qd1(this, onmVar);
            }
        } else {
            qd1Var = new qd1(this, onmVar);
        }
        Object obj = qd1Var.d;
        int i3 = qd1Var.f;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(obj);
            String str2 = q021Var.a;
            Single singleB = g7h.b(this.d, str2, new String[]{str2});
            qd1Var.a = q021Var;
            qd1Var.b = str2;
            qd1Var.f = 1;
            Object objJ = fc11.j(singleB, qd1Var);
            if (objJ != d9nVar) {
                q021Var2 = q021Var;
                str = str2;
                obj = objJ;
            }
            return d9nVar;
        }
        if (i3 == 1) {
            str = qd1Var.b;
            q021Var2 = qd1Var.a;
            hm5.M(obj);
        } else {
            if (i3 == 2) {
                i = qd1Var.c;
                q021Var2 = qd1Var.a;
                hm5.M(obj);
                r11 = i;
                r11 = z;
                completableA = this.a.a(q021Var2.a, q021Var2.b.c);
                qd1Var.a = q021Var2;
                qd1Var.b = null;
                qd1Var.c = r11;
                qd1Var.f = 3;
                if (fc11.i(completableA, qd1Var) != d9nVar) {
                    q021Var3 = q021Var2;
                }
                return d9nVar;
            }
            if (i3 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q021Var3 = qd1Var.a;
            hm5.M(obj);
        }
        m0u m0uVar = q021Var3.b;
        return new m121(m0uVar.c.a, m0uVar.f);
        f7h f7hVar = (f7h) ((Map) obj).get(str);
        if (f7hVar != null) {
            z = f7hVar.a;
        } else {
            r11 = 0;
        }
        if (r11 == 0) {
            qd1Var.a = q021Var2;
            qd1Var.b = null;
            qd1Var.c = r11 == true ? 1 : 0;
            qd1Var.f = 2;
            Set set = s4b1.f;
            v5b1 v5b1Var = uic.x(str).d;
            if (v5b1Var != null) {
                r11 = z;
                type = v5b1Var.getType();
            } else {
                r11 = z;
                type = null;
            }
            boolean zJ = u890.j(type, nyu0.e);
            Object obj2 = rih1.a;
            if (zJ) {
                objC = this.c.c(str, qd1Var);
                if (objC != d9nVar) {
                    objC = obj2;
                }
                if (objC == d9nVar) {
                    obj2 = objC;
                }
            } else {
                if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                    objC = this.c.c(str, qd1Var);
                    if (objC != d9nVar) {
                        objC = obj2;
                    }
                    if (objC == d9nVar) {
                        obj2 = objC;
                    }
                } else {
                    c0h c0hVarQ = CollectionAddRemoveItemsRequest.q();
                    c0hVarQ.r(str);
                    objC = fc11.j(this.b.a(c0hVarQ.build()), qd1Var);
                    if (objC != d9nVar) {
                        objC = obj2;
                    }
                    if (objC == d9nVar) {
                        obj2 = objC;
                    }
                }
            }
            if (obj2 != d9nVar) {
                i = r11 == true ? 1 : 0;
                r11 = i;
                r11 = z;
                completableA = this.a.a(q021Var2.a, q021Var2.b.c);
                qd1Var.a = q021Var2;
                qd1Var.b = null;
                qd1Var.c = r11;
                qd1Var.f = 3;
                if (fc11.i(completableA, qd1Var) != d9nVar) {
                    q021Var3 = q021Var2;
                    m0u m0uVar2 = q021Var3.b;
                    return new m121(m0uVar2.c.a, m0uVar2.f);
                }
            }
        } else {
            r11 = z;
            completableA = this.a.a(q021Var2.a, q021Var2.b.c);
            qd1Var.a = q021Var2;
            qd1Var.b = null;
            qd1Var.c = r11;
            qd1Var.f = 3;
            if (fc11.i(completableA, qd1Var) != d9nVar) {
                q021Var3 = q021Var2;
                m0u m0uVar3 = q021Var3.b;
                return new m121(m0uVar3.c.a, m0uVar3.f);
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, onm onmVar) {
        bib1 bib1Var;
        Object objJ;
        if (onmVar instanceof bib1) {
            bib1Var = (bib1) onmVar;
            int i = bib1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bib1Var.d = i - Integer.MIN_VALUE;
            } else {
                bib1Var = new bib1(this, onmVar);
            }
        } else {
            bib1Var = new bib1(this, onmVar);
        }
        Object objJ2 = bib1Var.b;
        int i2 = bib1Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ2);
            Single singleA = this.d.a(str, Collections.singletonList(str), false);
            bib1Var.a = str;
            bib1Var.d = 1;
            objJ2 = fc11.j(singleA, bib1Var);
            if (objJ2 != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objJ2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = bib1Var.a;
        hm5.M(objJ2);
        f7h f7hVar = (f7h) ((Map) objJ2).get(str);
        if (!(f7hVar != null ? f7hVar.a : false)) {
            bib1Var.a = null;
            bib1Var.d = 2;
            Set set = s4b1.f;
            v5b1 v5b1Var = uic.x(str).d;
            if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                objJ = this.c.c(str, bib1Var);
                if (objJ != d9nVar) {
                    objJ = rih1Var;
                }
            } else {
                c0h c0hVarQ = CollectionAddRemoveItemsRequest.q();
                c0hVarQ.r(str);
                objJ = fc11.j(this.b.a(c0hVarQ.build()), bib1Var);
                if (objJ != d9nVar) {
                    objJ = rih1Var;
                }
                if (objJ != d9nVar) {
                    objJ = rih1Var;
                }
            }
            if (objJ == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }
}
