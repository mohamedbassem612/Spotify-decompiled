package p;

import android.content.Context;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ti31 {
    public final Context a;
    public final w5b1 b;

    public ti31(Context context, w5b1 w5b1Var) {
        this.a = context;
        this.b = w5b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ni31 ni31Var, Map map, onm onmVar) {
        pi31 pi31Var;
        byte[] bArr;
        if (onmVar instanceof pi31) {
            pi31Var = (pi31) onmVar;
            int i = pi31Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pi31Var.f = i - Integer.MIN_VALUE;
            } else {
                pi31Var = new pi31(this, onmVar);
            }
        } else {
            pi31Var = new pi31(this, onmVar);
        }
        Object objC = pi31Var.d;
        int i2 = pi31Var.f;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objC);
            ob01 ob01Var = new ob01(this, str, (lnm) null, (byte) 11);
            pi31Var.a = ni31Var;
            pi31Var.b = map;
            pi31Var.f = 1;
            objC = ni31Var.c(ob01Var, pi31Var);
            if (objC != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            map = pi31Var.b;
            ni31Var = pi31Var.a;
            hm5.M(objC);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bArr = pi31Var.c;
            hm5.M(objC);
        }
        return new ui31(bArr, (Map) objC);
        byte[] bArr2 = (byte[]) objC;
        pi31Var.a = null;
        pi31Var.b = null;
        pi31Var.c = bArr2;
        pi31Var.f = 2;
        objC = d(map, ni31Var, pi31Var);
        if (objC != d9nVar) {
            bArr = bArr2;
            return new ui31(bArr, (Map) objC);
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v5, types: [byte[], java.io.Serializable] */
    public final Serializable c(String str, onm onmVar) {
        qi31 qi31Var;
        if (onmVar instanceof qi31) {
            qi31Var = (qi31) onmVar;
            int i = qi31Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qi31Var.d = i - Integer.MIN_VALUE;
            } else {
                qi31Var = new qi31(this, onmVar);
            }
        } else {
            qi31Var = new qi31(this, onmVar);
        }
        Object objB = qi31Var.b;
        int i2 = qi31Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                cxc cxcVarC = this.b.d.c();
                qi31Var.a = str;
                qi31Var.d = 1;
                objB = bin.B(cxcVarC, str, qi31Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = qi31Var.a;
                hm5.M(objB);
            }
            return (byte[]) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            k220.p(l1d.m("Error fetching bytes from URL: ", str), e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008e -> B:27:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.util.Map r12, p.ni31 r13, p.onm r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.ri31
            if (r0 == 0) goto L13
            r0 = r14
            p.ri31 r0 = (p.ri31) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            p.ri31 r0 = new p.ri31
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.h
            int r1 = r0.t
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L40
            if (r1 != r2) goto L3a
            int r12 = r0.g
            int r13 = r0.f
            int r1 = r0.e
            java.lang.String r5 = r0.d
            java.util.Iterator r6 = r0.c
            java.util.Collection r7 = r0.b
            java.util.Collection r7 = (java.util.Collection) r7
            p.ni31 r8 = r0.a
            p.hm5.M(r14)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> Lb6
            goto L93
        L37:
            r14 = move-exception
            goto La0
        L3a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r4
        L40:
            java.util.ArrayList r14 = p.hrt.j(r14)
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
            r6 = r12
            r7 = r14
            r12 = r3
            r14 = r12
            r1 = r14
        L51:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto Lb8
            java.lang.Object r5 = r6.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r8 = r5.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            p.si31 r9 = new p.si31     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            r9.<init>(r8, r11, r5, r4)     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            r0.a = r13     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            r5 = r7
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            r0.b = r5     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            r0.c = r6     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            r0.d = r8     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            r0.e = r1     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            r0.f = r14     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            r0.g = r12     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            r0.t = r2     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            java.lang.Object r5 = r13.a(r8, r9, r0)     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> Lb6
            p.d9n r9 = p.d9n.a
            if (r5 != r9) goto L8e
            return r9
        L8e:
            r10 = r8
            r8 = r13
            r13 = r14
            r14 = r5
            r5 = r10
        L93:
            p.mmr0 r14 = (p.mmr0) r14     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> Lb6
        L95:
            r5 = r1
            r1 = r0
            r0 = r13
            r13 = r8
            goto Lad
        L9a:
            r5 = move-exception
            r10 = r8
            r8 = r13
            r13 = r14
            r14 = r5
            r5 = r10
        La0:
            java.lang.String r9 = "Failed to load font resource: "
            java.lang.String r5 = p.l1d.m(r9, r5)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.spotify.base.java.logging.Logger.e(r14, r5, r9)
            r14 = r4
            goto L95
        Lad:
            if (r14 == 0) goto Lb2
            r7.add(r14)
        Lb2:
            r14 = r0
            r0 = r1
            r1 = r5
            goto L51
        Lb6:
            r11 = move-exception
            throw r11
        Lb8:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Map r11 = p.sqg0.T(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ti31.d(java.util.Map, p.ni31, p.onm):java.lang.Object");
    }
}
