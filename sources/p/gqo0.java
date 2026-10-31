package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gqo0 {
    public static final String r = nik1.Z4.a;
    public static final String s = nik1.Y4.a;
    public final ynb0 a;
    public final ynb0 b;
    public final add c;
    public final ynb0 d;
    public final dg30 e;
    public final ynb0 f;
    public final ynb0 g;
    public final q8n h;
    public final q8n i;
    public final ynb0 j;
    public final ynb0 k;
    public final ynb0 l;
    public final ynb0 m;
    public final pf4 n;
    public final dt71 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bpb1 f44p;
    public ve01 q;

    public gqo0(ynb0 ynb0Var, ynb0 ynb0Var2, add addVar, ynb0 ynb0Var3, dg30 dg30Var, ynb0 ynb0Var4, ynb0 ynb0Var5, q8n q8nVar, q8n q8nVar2, ynb0 ynb0Var6, ynb0 ynb0Var7, ynb0 ynb0Var8, ynb0 ynb0Var9, pf4 pf4Var) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = addVar;
        this.d = ynb0Var3;
        this.e = dg30Var;
        this.f = ynb0Var4;
        this.g = ynb0Var5;
        this.h = q8nVar;
        this.i = q8nVar2;
        this.j = ynb0Var6;
        this.k = ynb0Var7;
        this.l = ynb0Var8;
        this.m = ynb0Var9;
        this.n = pf4Var;
        dt71 dt71VarE = mgo1.e(1, 0, 2, 2);
        dt71VarE.a(rih1.a);
        this.o = dt71VarE;
        this.f44p = gio1.b(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, onm onmVar) {
        upo0 upo0Var;
        if (onmVar instanceof upo0) {
            upo0Var = (upo0) onmVar;
            int i = upo0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                upo0Var.d = i - Integer.MIN_VALUE;
            } else {
                upo0Var = new upo0(this, onmVar);
            }
        } else {
            upo0Var = new upo0(this, onmVar);
        }
        Object objI = upo0Var.b;
        int i2 = upo0Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            upo0Var.a = z;
            upo0Var.d = 1;
            objI = i(upo0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = upo0Var.a;
            hm5.M(objI);
        }
        return yah0.m((((Boolean) objI).booleanValue() || ((Boolean) this.f44p.getValue()).booleanValue() || !this.c.a.h() || !z || e() == 4 || j()) ? false : true);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (p.smo1.s(r7, r0) == r6) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.onm r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p.vpo0
            if (r0 == 0) goto L13
            r0 = r11
            p.vpo0 r0 = (p.vpo0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.vpo0 r0 = new p.vpo0
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L40
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L2c
            goto L7f
        L2c:
            r10 = move-exception
            goto L82
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r5
        L34:
            int r10 = r0.b
            p.gqo0 r1 = r0.a
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L2c
            r9 = r11
            r11 = r10
            r10 = r1
            r1 = r9
            goto L5e
        L40:
            p.hm5.M(r11)
            p.ynb0 r11 = r10.m     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r11 = r11.get()     // Catch: java.lang.Throwable -> L2c
            p.a9o0 r11 = (p.a9o0) r11     // Catch: java.lang.Throwable -> L2c
            io.reactivex.rxjava3.core.Single r11 = r11.a()     // Catch: java.lang.Throwable -> L2c
            r0.a = r10     // Catch: java.lang.Throwable -> L2c
            r0.b = r2     // Catch: java.lang.Throwable -> L2c
            r0.e = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r11 = p.fc11.j(r11, r0)     // Catch: java.lang.Throwable -> L2c
            if (r11 != r6) goto L5c
            goto L7e
        L5c:
            r1 = r11
            r11 = r2
        L5e:
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = "followedShows"
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L2c
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L6b
            goto L7f
        L6b:
            p.wkk0 r7 = new p.wkk0     // Catch: java.lang.Throwable -> L2c
            r8 = 19
            r7.<init>(r1, r10, r5, r8)     // Catch: java.lang.Throwable -> L2c
            r0.a = r5     // Catch: java.lang.Throwable -> L2c
            r0.b = r11     // Catch: java.lang.Throwable -> L2c
            r0.e = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r10 = p.smo1.s(r7, r0)     // Catch: java.lang.Throwable -> L2c
            if (r10 != r6) goto L7f
        L7e:
            return r6
        L7f:
            p.rih1 r10 = p.rih1.a     // Catch: java.lang.Throwable -> L2c
            goto L88
        L82:
            p.m231 r11 = new p.m231
            r11.<init>(r10)
            r10 = r11
        L88:
            java.lang.Throwable r11 = p.e331.a(r10)
            if (r11 == 0) goto L9b
            boolean r0 = r11 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L9a
            java.lang.String r0 = "Failed to disable new episode push notifications"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.spotify.base.java.logging.Logger.e(r11, r0, r1)
            goto L9b
        L9a:
            throw r11
        L9b:
            boolean r10 = r10 instanceof p.m231
            r10 = r10 ^ r4
            java.lang.Boolean r10 = p.yah0.m(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gqo0.b(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) throws Throwable {
        wpo0 wpo0Var;
        rih1 m231Var;
        if (onmVar instanceof wpo0) {
            wpo0Var = (wpo0) onmVar;
            int i = wpo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wpo0Var.c = i - Integer.MIN_VALUE;
            } else {
                wpo0Var = new wpo0(this, onmVar);
            }
        } else {
            wpo0Var = new wpo0(this, onmVar);
        }
        Object obj = wpo0Var.a;
        int i2 = wpo0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                t0z t0zVar = mmq0.i;
                ArrayList arrayList = new ArrayList();
                d7 d7Var = new d7(t0zVar, (byte) 0);
                while (d7Var.hasNext()) {
                    Object next = d7Var.next();
                    mmq0 mmq0Var = (mmq0) next;
                    if (mmq0Var != mmq0.f && mmq0Var != mmq0.e) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new smq0(gfe.b, (mmq0) it.next(), false));
                }
                qnv0 qnv0Var = (qnv0) this.f.get();
                smq0[] smq0VarArr = (smq0[]) arrayList2.toArray(new smq0[0]);
                Completable completableE = qnv0.e(qnv0Var, (smq0[]) Arrays.copyOf(smq0VarArr, smq0VarArr.length), 5, str);
                wpo0Var.c = 1;
                Object objI = fc11.i(completableE, wpo0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = rih1.a;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            Logger.e(thA, "Failed to disable non-essential push", new Object[0]);
        }
        return yah0.m(!(m231Var instanceof m231));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(String str, onm onmVar) throws Throwable {
        xpo0 xpo0Var;
        Boolean m231Var;
        if (onmVar instanceof xpo0) {
            xpo0Var = (xpo0) onmVar;
            int i = xpo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xpo0Var.c = i - Integer.MIN_VALUE;
            } else {
                xpo0Var = new xpo0(this, onmVar);
            }
        } else {
            xpo0Var = new xpo0(this, onmVar);
        }
        Object objJ = xpo0Var.a;
        int i2 = xpo0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleC = ((qnv0) this.f.get()).c(mmq0.f, 5, str);
                xpo0Var.c = 1;
                objJ = fc11.j(singleC, xpo0Var);
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
            m231Var = yah0.m(((rmq0) objJ).a());
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            Logger.e(thA, "Failed to get messages push opt-in state", new Object[0]);
        }
        return m231Var instanceof m231 ? yah0.m(false) : m231Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int e() throws NoWhenBranchMatchedException {
        int iOrdinal = this.n.j().ordinal();
        if (iOrdinal == 0) {
            return 4;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                eg.o();
                return 0;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(onm onmVar) {
        aqo0 aqo0Var;
        if (onmVar instanceof aqo0) {
            aqo0Var = (aqo0) onmVar;
            int i = aqo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqo0Var.c = i - Integer.MIN_VALUE;
            } else {
                aqo0Var = new aqo0(this, onmVar);
            }
        } else {
            aqo0Var = new aqo0(this, onmVar);
        }
        Object obj = aqo0Var.a;
        int i2 = aqo0Var.c;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            zoo0 zoo0Var = (zoo0) this.d.get();
            aqo0Var.c = 1;
            if (zoo0Var.i(aqo0Var) != d9nVar2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return d9nVar;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        aqo0Var.c = 2;
        this.f44p.m((Object) null, yah0.m(true));
        return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (p.c921.H(r12.i, r0, r6) == r8) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r13, java.lang.String r14, p.tv80 r15, p.onm r16) {
        /*
            r12 = this;
            r0 = r16
            boolean r2 = r0 instanceof p.bqo0
            if (r2 == 0) goto L16
            r2 = r0
            p.bqo0 r2 = (p.bqo0) r2
            int r3 = r2.h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.h = r3
        L14:
            r6 = r2
            goto L1c
        L16:
            p.bqo0 r2 = new p.bqo0
            r2.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.f
            int r2 = r6.h
            r7 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r8 = p.d9n.a
            if (r2 == 0) goto L50
            if (r2 == r4) goto L42
            if (r2 == r3) goto L3a
            if (r2 != r7) goto L33
            p.hm5.M(r0)
            goto La4
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L3a:
            p.tv80 r2 = r6.b
            java.lang.String r3 = r6.a
            p.hm5.M(r0)
            goto L89
        L42:
            int r2 = r6.e
            p.zoo0 r4 = r6.d
            java.lang.Object r9 = r6.c
            p.tv80 r10 = r6.b
            java.lang.String r11 = r6.a
            p.hm5.M(r0)
            goto L74
        L50:
            p.hm5.M(r0)
            p.ynb0 r0 = r12.d
            java.lang.Object r9 = r0.get()
            r0 = r9
            p.zoo0 r0 = (p.zoo0) r0
            r6.a = r14
            r6.b = r15
            r6.c = r9
            r6.d = r0
            r11 = 0
            r6.e = r11
            r6.h = r4
            java.lang.Object r4 = r0.l(r13, r6)
            if (r4 != r8) goto L70
            goto La3
        L70:
            r10 = r15
            r4 = r0
            r2 = r11
            r11 = r14
        L74:
            r6.a = r11
            r6.b = r10
            r6.c = r9
            r6.d = r5
            r6.e = r2
            r6.h = r3
            java.lang.Object r0 = r4.j(r6)
            if (r0 != r8) goto L87
            goto La3
        L87:
            r2 = r10
            r3 = r11
        L89:
            p.rwm0 r0 = new p.rwm0
            r4 = r5
            r5 = 4
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a = r4
            r6.b = r4
            r6.c = r4
            r6.d = r4
            r6.h = r7
            p.q8n r1 = r12.i
            java.lang.Object r0 = p.c921.H(r1, r0, r6)
            if (r0 != r8) goto La4
        La3:
            return r8
        La4:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gqo0.g(java.lang.String, java.lang.String, p.tv80, p.onm):java.lang.Object");
    }

    public final boolean h() {
        if (!this.c.a.h() || e() == 4) {
            return false;
        }
        pf4 pf4Var = this.n;
        return pf4Var.f() || pf4Var.g() || pf4Var.e();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7 == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (((java.lang.Number) r7).intValue() >= r6.h()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r7 == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(p.onm r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.cqo0
            if (r0 == 0) goto L13
            r0 = r7
            p.cqo0 r0 = (p.cqo0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.cqo0 r0 = new p.cqo0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            p.ynb0 r2 = r6.d
            r3 = 2
            p.pf4 r6 = r6.n
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2e
            p.hm5.M(r7)
            goto L73
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L35:
            p.hm5.M(r7)
            goto L51
        L39:
            p.hm5.M(r7)
            int r7 = r6.h()
            if (r7 <= 0) goto L5e
            java.lang.Object r7 = r2.get()
            p.zoo0 r7 = (p.zoo0) r7
            r0.c = r4
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r5) goto L51
            goto L72
        L51:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r1 = r6.h()
            if (r7 < r1) goto L5e
            goto L81
        L5e:
            int r7 = r6.i()
            if (r7 <= 0) goto L80
            java.lang.Object r7 = r2.get()
            p.zoo0 r7 = (p.zoo0) r7
            r0.c = r3
            java.lang.Object r7 = r7.g(r0)
            if (r7 != r5) goto L73
        L72:
            return r5
        L73:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r6 = r6.i()
            if (r7 < r6) goto L80
            goto L81
        L80:
            r4 = 0
        L81:
            java.lang.Boolean r6 = p.yah0.m(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gqo0.i(p.onm):java.lang.Object");
    }

    public final boolean j() {
        dto0 dto0Var = (dto0) this.j.get();
        return dto0Var.a.g((Context) this.b.get());
    }

    public final mr20 k(String str, iu30 iu30Var) {
        return o4p1.r(x4p1.h(rqt0.u(hu20.e(this.f44p, new m53(this, str, iu30Var, (lnm) null, (byte) 7))), new i440((byte) 17)), this.h);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object l(onm onmVar) {
        eqo0 eqo0Var;
        long jLongValue;
        Object objF;
        long j;
        String str;
        zoo0 zoo0Var;
        long j2;
        if (onmVar instanceof eqo0) {
            eqo0Var = (eqo0) onmVar;
            int i = eqo0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                eqo0Var.f = i - Integer.MIN_VALUE;
            } else {
                eqo0Var = new eqo0(this, onmVar);
            }
        } else {
            eqo0Var = new eqo0(this, onmVar);
        }
        Object objH = eqo0Var.d;
        int i2 = eqo0Var.f;
        rih1 rih1Var = rih1.a;
        ynb0 ynb0Var = this.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objH);
            zoo0 zoo0Var2 = (zoo0) ynb0Var.get();
            eqo0Var.f = 1;
            objH = zoo0Var2.h(eqo0Var);
            if (objH != d9nVar) {
            }
        }
        if (i2 == 1) {
            hm5.M(objH);
        } else {
            if (i2 == 2) {
                hm5.M(objH);
                return rih1Var;
            }
            if (i2 == 3) {
                long j3 = eqo0Var.b;
                jLongValue = eqo0Var.a;
                hm5.M(objH);
                objF = objH;
                j = j3;
                str = (String) objF;
                zoo0Var = (zoo0) ynb0Var.get();
                eqo0Var.c = str;
                eqo0Var.a = jLongValue;
                eqo0Var.b = j;
                eqo0Var.f = 4;
                if (zoo0Var.a(eqo0Var) != d9nVar) {
                    j2 = jLongValue;
                }
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    hm5.M(objH);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = eqo0Var.b;
            j2 = eqo0Var.a;
            str = eqo0Var.c;
            hm5.M(objH);
        }
        hyg0 hyg0Var = new hyg0(this, str, (lnm) null, (byte) 24);
        eqo0Var.c = null;
        eqo0Var.a = j2;
        eqo0Var.b = j;
        eqo0Var.f = 5;
        return c921.H(this.i, hyg0Var, eqo0Var) == d9nVar ? d9nVar : rih1Var;
        jLongValue = ((Number) objH).longValue();
        if (jLongValue != 0) {
            long jB = ((yqg) this.a.get()).b() - jLongValue;
            if (jB >= this.n.a()) {
                zoo0 zoo0Var3 = (zoo0) ynb0Var.get();
                eqo0Var.a = jLongValue;
                eqo0Var.b = jB;
                eqo0Var.f = 2;
                if (zoo0Var3.c(eqo0Var) == d9nVar) {
                }
            } else {
                zoo0 zoo0Var4 = (zoo0) ynb0Var.get();
                eqo0Var.a = jLongValue;
                eqo0Var.b = jB;
                eqo0Var.f = 3;
                objF = zoo0Var4.f(eqo0Var);
                if (objF != d9nVar) {
                    j = jB;
                    str = (String) objF;
                    zoo0Var = (zoo0) ynb0Var.get();
                    eqo0Var.c = str;
                    eqo0Var.a = jLongValue;
                    eqo0Var.b = j;
                    eqo0Var.f = 4;
                    if (zoo0Var.a(eqo0Var) != d9nVar) {
                        j2 = jLongValue;
                        hyg0 hyg0Var2 = new hyg0(this, str, (lnm) null, (byte) 24);
                        eqo0Var.c = null;
                        eqo0Var.a = j2;
                        eqo0Var.b = j;
                        eqo0Var.f = 5;
                        if (c921.H(this.i, hyg0Var2, eqo0Var) == d9nVar) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(onm onmVar) {
        fqo0 fqo0Var;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        zoo0 zoo0Var;
        boolean z;
        boolean z2;
        if (onmVar instanceof fqo0) {
            fqo0Var = (fqo0) onmVar;
            int i = fqo0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fqo0Var.e = i - Integer.MIN_VALUE;
            } else {
                fqo0Var = new fqo0(this, onmVar);
            }
        } else {
            fqo0Var = new fqo0(this, onmVar);
        }
        Object objD = fqo0Var.c;
        int i2 = fqo0Var.e;
        ynb0 ynb0Var = this.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objD);
            zoo0 zoo0Var2 = (zoo0) ynb0Var.get();
            fqo0Var.e = 1;
            objD = zoo0Var2.d(fqo0Var);
            if (objD != d9nVar) {
            }
        }
        if (i2 == 1) {
            hm5.M(objD);
        } else {
            if (i2 == 2) {
                hm5.M(objD);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(objD);
                mmr0 mmr0Var = (mmr0) objD;
                zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
                zBooleanValue2 = ((Boolean) mmr0Var.b).booleanValue();
                if (zBooleanValue || zBooleanValue2) {
                    ((w5e) this.k.get()).a();
                }
                if (zBooleanValue && zBooleanValue2) {
                    zoo0Var = (zoo0) ynb0Var.get();
                    fqo0Var.a = zBooleanValue;
                    fqo0Var.b = zBooleanValue2;
                    fqo0Var.e = 4;
                    if (zoo0Var.b(fqo0Var) != d9nVar) {
                        z = zBooleanValue;
                        z2 = zBooleanValue2;
                    }
                }
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    hm5.M(objD);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = fqo0Var.b;
            z = fqo0Var.a;
            hm5.M(objD);
        }
        fqo0Var.a = z;
        fqo0Var.b = z2;
        fqo0Var.e = 5;
        return l(fqo0Var) == d9nVar ? d9nVar : rih1Var;
        String str = (String) objD;
        if (str != null) {
            if (j()) {
                hgo0 hgo0Var = new hgo0(this, str, (lnm) null, (byte) 2);
                fqo0Var.e = 3;
                objD = smo1.s(hgo0Var, fqo0Var);
                if (objD != d9nVar) {
                    mmr0 mmr0Var2 = (mmr0) objD;
                    zBooleanValue = ((Boolean) mmr0Var2.a).booleanValue();
                    zBooleanValue2 = ((Boolean) mmr0Var2.b).booleanValue();
                    if (zBooleanValue) {
                        ((w5e) this.k.get()).a();
                    } else {
                        ((w5e) this.k.get()).a();
                    }
                    if (zBooleanValue) {
                        zoo0Var = (zoo0) ynb0Var.get();
                        fqo0Var.a = zBooleanValue;
                        fqo0Var.b = zBooleanValue2;
                        fqo0Var.e = 4;
                        if (zoo0Var.b(fqo0Var) != d9nVar) {
                            z = zBooleanValue;
                            z2 = zBooleanValue2;
                            fqo0Var.a = z;
                            fqo0Var.b = z2;
                            fqo0Var.e = 5;
                            if (l(fqo0Var) == d9nVar) {
                            }
                        }
                    }
                }
            } else {
                zoo0 zoo0Var3 = (zoo0) ynb0Var.get();
                fqo0Var.e = 2;
                if (zoo0Var3.b(fqo0Var) == d9nVar) {
                }
            }
        }
    }
}
