package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.eventsender.Fragment;
import com.spotify.messages.EventSenderStats2NonAuth;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g7t implements vu30 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public g7t(t2j0 t2j0Var, Flowable flowable, yfu yfuVar) {
        this.a = (byte) 7;
        this.b = t2j0Var;
        this.d = flowable;
        this.c = yfuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object a(String str, String str2, onm onmVar) {
        d7t d7tVar;
        if (onmVar instanceof d7t) {
            d7tVar = (d7t) onmVar;
            int i = d7tVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d7tVar.c = i - Integer.MIN_VALUE;
            } else {
                d7tVar = new d7t(this, onmVar);
            }
        } else {
            d7tVar = new d7t(this, onmVar);
        }
        Object objB = d7tVar.a;
        int i2 = d7tVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                ssy0 ssy0Var = (ssy0) this.b;
                d7tVar.c = 1;
                objB = ssy0Var.b(str, str2, d7tVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            if (!((sy21) objB).a.Q0) {
                Logger.d("[Puffin] DeleteCrossDeviceFilterUseCase error response " + this, new Object[0]);
            }
        } catch (IOException e) {
            Logger.d("[Puffin] DeleteCrossDeviceFilterUseCase IOException: " + e, new Object[0]);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r7 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (a("WIRED", r6, r0) == r4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.String r6, p.onm r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.e7t
            if (r0 == 0) goto L13
            r0 = r7
            p.e7t r0 = (p.e7t) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.e7t r0 = new p.e7t
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r7)
            goto L63
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r7)
            goto L4f
        L35:
            p.hm5.M(r7)
            if (r6 == 0) goto L56
            java.lang.Object r7 = r5.c
            p.yfu r7 = (p.yfu) r7
            java.lang.Object r7 = r7.c
            p.uny r7 = (p.uny) r7
            io.reactivex.rxjava3.core.Single r6 = r7.l(r6)
            r0.c = r3
            java.lang.Object r7 = p.fc11.j(r6, r0)
            if (r7 != r4) goto L4f
            goto L62
        L4f:
            p.l3c1 r7 = (p.l3c1) r7
            p.q3c1 r7 = (p.q3c1) r7
            java.lang.String r6 = r7.e
            goto L58
        L56:
            java.lang.String r6 = "GENERIC"
        L58:
            r0.c = r2
            java.lang.String r7 = "WIRED"
            java.lang.Object r5 = r5.a(r7, r6, r0)
            if (r5 != r4) goto L63
        L62:
            return r4
        L63:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g7t.d(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(c560 c560Var, lnm lnmVar) {
        f7t f7tVar;
        if (lnmVar instanceof f7t) {
            f7tVar = (f7t) lnmVar;
            int i = f7tVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f7tVar.c = i - Integer.MIN_VALUE;
            } else {
                f7tVar = new f7t(this, lnmVar);
            }
        } else {
            f7tVar = new f7t(this, lnmVar);
        }
        Object obj = f7tVar.a;
        int i2 = f7tVar.c;
        Object obj2 = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return obj2;
            }
            if (i2 == 2) {
                hm5.M(obj);
                return obj2;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (((qpy0) this.d).a()) {
            m560 m560VarA = c560Var.a();
            boolean z = m560VarA instanceof k560;
            Object obj3 = d9n.a;
            if (z) {
                f7tVar.c = 1;
                Object objA = a("BLUETOOTH", ((k560) m560VarA).a, f7tVar);
                if (objA != obj3) {
                    objA = obj2;
                }
                if (objA == obj3) {
                    return obj3;
                }
            } else {
                if (!(m560VarA instanceof l560)) {
                    eg.o();
                    return null;
                }
                String str = c560Var.b().d;
                f7tVar.c = 2;
                if (d(str, f7tVar) == obj3) {
                    return obj3;
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(tzg0 tzg0Var, lnm lnmVar) {
        krn0 krn0Var;
        if (lnmVar instanceof krn0) {
            krn0Var = (krn0) lnmVar;
            int i = krn0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                krn0Var.c = i - Integer.MIN_VALUE;
            } else {
                krn0Var = new krn0(this, lnmVar);
            }
        } else {
            krn0Var = new krn0(this, lnmVar);
        }
        Object obj = krn0Var.a;
        d9n d9nVar = d9n.a;
        int i2 = krn0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (tzg0Var.b) {
                ((p7h0) this.c).X = true;
            }
            q8n q8nVar = (q8n) this.b;
            hyg0 hyg0Var = new hyg0(tzg0Var, this, (lnm) null, (byte) 19);
            krn0Var.c = 1;
            if (fn31.Y(q8nVar, hyg0Var, krn0Var) == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r0.a(r9, r3) == r8) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(p.yzg0 r22, p.lnm r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof p.vit0
            if (r3 == 0) goto L19
            r3 = r2
            p.vit0 r3 = (p.vit0) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.d = r4
            goto L1e
        L19:
            p.vit0 r3 = new p.vit0
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.b
            int r4 = r3.d
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r4 == 0) goto L3d
            if (r4 == r6) goto L37
            if (r4 != r5) goto L31
            p.hm5.M(r2)
            goto L8c
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r7
        L37:
            p.yzg0 r1 = r3.a
            p.hm5.M(r2)
            goto L56
        L3d:
            p.hm5.M(r2)
            java.lang.Object r2 = r0.b
            p.q8n r2 = (p.q8n) r2
            p.e3p0 r4 = new p.e3p0
            r9 = 29
            r4.<init>(r1, r0, r7, r9)
            r3.a = r1
            r3.d = r6
            java.lang.Object r2 = p.fn31.Y(r2, r4, r3)
            if (r2 != r8) goto L56
            goto L8b
        L56:
            java.lang.Object r0 = r0.c
            p.uyt0 r0 = (p.uyt0) r0
            java.lang.String r10 = r1.a
            java.lang.String r11 = r1.b
            java.lang.Long r13 = r1.c
            java.lang.String r14 = r1.d
            java.lang.String r2 = r1.e
            p.tv80 r1 = r1.f
            if (r1 == 0) goto L70
            p.ou80 r1 = r1.a
            if (r1 == 0) goto L70
            java.lang.String r1 = r1.a
            r15 = r1
            goto L71
        L70:
            r15 = r7
        L71:
            p.xzg0 r9 = new p.xzg0
            r20 = 708(0x2c4, float:9.92E-43)
            r19 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3.a = r7
            r3.d = r5
            java.lang.Object r0 = r0.a(r9, r3)
            if (r0 != r8) goto L8c
        L8b:
            return r8
        L8c:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g7t.g(p.yzg0, p.lnm):java.lang.Object");
    }

    public n700 h(EventSenderStats2NonAuth eventSenderStats2NonAuth, byte[] bArr) {
        long jA = ((t561) this.c).a(2, "EventSenderStats2NonAuth", bArr);
        byte[] byteArray = eventSenderStats2NonAuth.toByteArray();
        ((ac00) this.d).getClass();
        h290<Fragment> h290VarQ = q1o1.e(byteArray, System.currentTimeMillis(), (s900) this.b).q();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
        for (Fragment fragment : h290VarQ) {
            arrayList.add(new mmr0(fragment.getName(), fragment.getData()));
        }
        return new n700(-100L, "EventSenderStats2NonAuth", phc.e(0, bArr, bArr.length), jA, arrayList, true);
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                return e((c560) obj, (lnm) obj2);
            case 1:
                return h((EventSenderStats2NonAuth) obj, (byte[]) obj2);
            case 2:
                return ((dxz0) obj5).e().flatMapSingle(new vmg0(this, (String) obj, (String) obj2, (byte) 1)).firstOrError();
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarH = l6o1.H(sgc1.H(2, uyn1.z(0.0f, 8.0f, 1, (qim0) obj4)), (es41) obj3, false, 14);
                    j2i j2iVar = (j2i) obj5;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iK = tgp1.k(x340Var2);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarH);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    llj lljVar = y580.R0;
                    if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
                        z5c.f(iK, x340Var2, iK, lljVar);
                    }
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    j2iVar.invoke(pbh.a, x340Var2, 6);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                return f((tzg0) obj, (lnm) obj2);
            case 5:
                return g((yzg0) obj, (lnm) obj2);
            case 6:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarI = zr7.i(nim0.a, new eus((mhg1) obj4, (byte) 3));
                    j2i j2iVar2 = (j2i) obj3;
                    r5f1 r5f1Var = (r5f1) obj5;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iK2 = tgp1.k(x340Var4);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarI);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    llj lljVar2 = y580.R0;
                    if (x340Var4.S || !u890.j(x340Var4.T(), Integer.valueOf(iK2))) {
                        z5c.f(iK2, x340Var4, iK2, lljVar2);
                    }
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    j2iVar2.invoke(r5f1Var, x340Var4, 6);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                me20 me20Var = (me20) obj;
                Maybe maybeOnErrorComplete = ((Flowable) obj5).j(mo9.Y).z().flatMap(new vnd1(this, me20Var, (byte) 10)).doOnSuccess(new hfd1(me20Var, this, (m560) obj2, (byte) 1)).doOnError(iqa1.U0).onErrorComplete();
                maybeOnErrorComplete.getClass();
                return new MaybeIgnoreElementCompletable(maybeOnErrorComplete);
        }
    }

    public /* synthetic */ g7t(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
