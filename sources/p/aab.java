package p;

import android.content.Context;
import com.spotify.bluejay.data.api.GenerationServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aab implements o46, bqh1 {
    public final eg40 a;
    public final frh1 b;
    public final v9b c;
    public final qnv0 d;
    public final dto0 e;
    public final Context f;
    public final q8n g;

    public aab(eg40 eg40Var, frh1 frh1Var, v9b v9bVar, qnv0 qnv0Var, dto0 dto0Var, Context context, q8n q8nVar) {
        this.a = eg40Var;
        this.b = frh1Var;
        this.c = v9bVar;
        this.d = qnv0Var;
        this.e = dto0Var;
        this.f = context;
        this.g = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(fg40 fg40Var, onm onmVar) {
        x9b x9bVar;
        w9b w9bVar;
        if (onmVar instanceof x9b) {
            x9bVar = (x9b) onmVar;
            int i = x9bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x9bVar.d = i - Integer.MIN_VALUE;
            } else {
                x9bVar = new x9b(this, onmVar);
            }
        } else {
            x9bVar = new x9b(this, onmVar);
        }
        Object obj = x9bVar.b;
        int i2 = x9bVar.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                w9b w9bVar2 = (w9b) fg40Var;
                eg40 eg40Var = this.a;
                dkn dknVar = new dkn(w9bVar2.a, w9bVar2.d, w9bVar2.c, (xk41) null, 24);
                x9bVar.a = w9bVar2;
                x9bVar.d = 1;
                Object objB = eg40Var.b(dknVar, x9bVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
                obj = objB;
                w9bVar = w9bVar2;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w9bVar = x9bVar.a;
                hm5.M(obj);
            }
            ekn eknVar = (ekn) obj;
            String str = nik1.t6.a;
            String str2 = eknVar.a;
            jaw0 jaw0Var = eknVar.b;
            qxk qxkVar = new qxk(jaw0Var.a, jaw0Var.b);
            ArrayList arrayListS = t0c.s(eknVar.c);
            zlk1 zlk1Var = eknVar.d;
            yxk yxkVar = new yxk(zlk1Var.a, zlk1Var.b);
            sxk sxkVarU = mod.u(eknVar.e);
            String str3 = (String) o7h.s0(w9bVar.c);
            String str4 = w9bVar.a;
            boolean z = eknVar.f;
            ArrayList arrayList = eknVar.g;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e311 e311Var = (e311) it.next();
                arrayList2.add(new rxk(e311Var.a, e311Var.b, e311Var.e, e311Var.c));
                it = it;
                str2 = str2;
            }
            return new r46(new dxn0(str, 2, new dzk(new pxk(str2, qxkVar, arrayListS, yxkVar, sxkVarU, str3, str4, z, arrayList2, eknVar.h, eknVar.i, w9bVar.k, 8704))), w9bVar.b);
        } catch (GenerationServiceException e) {
            return e.b == 5 ? q46.a : new p46(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            return new p46(e3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    /* JADX WARN: Code duplicated, block: B:63:0x00de  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fg40 fg40Var, onm onmVar) {
        z9b z9bVar;
        w9b w9bVar;
        String str;
        boolean z;
        if (onmVar instanceof z9b) {
            z9bVar = (z9b) onmVar;
            int i = z9bVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                z9bVar.e = i - Integer.MIN_VALUE;
            } else {
                z9bVar = new z9b(this, onmVar);
            }
        } else {
            z9bVar = new z9b(this, onmVar);
        }
        Object objC = z9bVar.c;
        int i2 = z9bVar.e;
        boolean z2 = true;
        String str2 = null;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                w9bVar = (w9b) fg40Var;
                String str3 = w9bVar.e;
                if (str3 == null) {
                    return new p46(new IllegalStateException("No URI provided for episode update"));
                }
                String str4 = w9bVar.f;
                if (str4 == null) {
                    return new p46(new IllegalStateException("No schedule ID provided for episode update"));
                }
                mvh1 mvh1Var = w9bVar.g;
                xk41 xk41Var = w9bVar.h;
                gm41 gm41VarM0 = xk41Var != null ? yon1.m0(mvh1Var, xk41Var, w9bVar.i) : new gm41(3, (Boolean) null);
                frh1 frh1Var = this.b;
                xk41 xk41Var2 = gm41VarM0.a;
                String str5 = w9bVar.l ? w9bVar.a : null;
                String str6 = w9bVar.m ? w9bVar.d : null;
                Boolean bool = gm41VarM0.b;
                Set set = w9bVar.j;
                fvh1 fvh1Var = new fvh1(str3, str4, xk41Var2, str5, str6, bool, set != null ? new u1f1(o7h.Z0(set)) : null, w9bVar.n ? w9bVar.k : null);
                z9bVar.a = w9bVar;
                z9bVar.b = str3;
                z9bVar.e = 1;
                objC = frh1Var.c(fvh1Var, z9bVar);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
                str = str3;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = z9bVar.b;
                w9bVar = z9bVar.a;
                hm5.M(objC);
            }
            String str7 = ((gvh1) objC).a;
            if (str7 != null) {
                Set set2 = s4b1.f;
                if (!(uic.x(str7).c == blc0.fh)) {
                    str7 = null;
                }
                if (str7 == null) {
                    Set set3 = s4b1.f;
                    if (uic.x(str).c == blc0.fh) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str2 = str;
                    }
                } else {
                    str2 = str7;
                }
            } else {
                Set set4 = s4b1.f;
                if (uic.x(str).c == blc0.fh) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str2 = str;
                }
            }
            boolean z3 = w9bVar.l;
            boolean z4 = z3 || w9bVar.m || w9bVar.n;
            String str8 = w9bVar.b;
            if (z4 && str2 != null) {
                return new s46(str2, nik1.o6.a + "?config=BLUEJAY_EDIT_SUCCESS", str8);
            }
            if (!z3 && !w9bVar.m && !w9bVar.n) {
                z2 = false;
            }
            if (z2) {
                return new p46(new IllegalStateException("No show URI returned for episode update"));
            }
            return new r46(new dxn0(nik1.o6.a + "?config=BLUEJAY_EDIT_SUCCESS", 4), str8);
        } catch (GenerationServiceException e) {
            return e.b == 5 ? q46.a : new p46(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            return new p46(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r9 == r6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.hvg1 r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.y9b
            if (r0 == 0) goto L13
            r0 = r9
            p.y9b r0 = (p.y9b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.y9b r0 = new p.y9b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            p.dvg1 r2 = p.dvg1.a
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3a
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            p.hm5.M(r9)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            goto L6a
        L2d:
            r7 = move-exception
            goto Lb0
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L36:
            p.hm5.M(r9)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            goto L58
        L3a:
            p.hm5.M(r9)
            p.v9b r9 = r7.c
            boolean r9 = r9.a()
            if (r9 == 0) goto L46
            return r2
        L46:
            p.frh1 r9 = r7.b     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            p.jvg1 r1 = new p.jvg1     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            java.lang.String r8 = r8.a     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            r1.<init>(r8)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            r0.c = r4     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            java.lang.Object r8 = r9.b(r1, r0)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            if (r8 != r6) goto L58
            goto L69
        L58:
            r0.c = r3     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            p.q8n r8 = r7.g     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            p.vk6 r9 = new p.vk6     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            r1 = 11
            r9.<init>(r7, r5, r1)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            java.lang.Object r9 = p.fn31.Y(r8, r9, r0)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            if (r9 != r6) goto L6a
        L69:
            return r6
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            boolean r7 = r9.booleanValue()     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            if (r7 == 0) goto L88
            p.lik1 r7 = p.nik1.o6     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            java.lang.String r7 = r7.a     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            r8.<init>()     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            r8.append(r7)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            java.lang.String r7 = "?config=BLUEJAY_CONFIRMED_NOTIFICATIONS"
            r8.append(r7)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            java.lang.String r7 = r8.toString()     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            goto L9d
        L88:
            p.lik1 r7 = p.nik1.o6     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            java.lang.String r7 = r7.a     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            r8.<init>()     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            r8.append(r7)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            java.lang.String r7 = "?config=BLUEJAY_REQUEST_NOTIFICATIONS"
            r8.append(r7)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            java.lang.String r7 = r8.toString()     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
        L9d:
            p.fvg1 r8 = new p.fvg1     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            p.dxn0 r9 = new p.dxn0     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            r0 = 4
            r9.<init>(r7, r0)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            r8.<init>(r9)     // Catch: com.spotify.bluejay.data.api.GenerationServiceException -> L2d java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbd
            return r8
        La9:
            r7 = move-exception
            p.evg1 r8 = new p.evg1
            r8.<init>(r7)
            goto Lbc
        Lb0:
            int r8 = r7.b
            r9 = 5
            if (r8 != r9) goto Lb6
            goto Lbb
        Lb6:
            p.evg1 r2 = new p.evg1
            r2.<init>(r7)
        Lbb:
            r8 = r2
        Lbc:
            return r8
        Lbd:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.aab.c(p.hvg1, p.onm):java.lang.Object");
    }
}
