package p;

import com.google.android.recaptcha.internal.zzhm;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p18 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ long c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p18(Enum r1, Object obj, long j, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = r1;
        this.e = obj;
        this.c = j;
        this.f = obj2;
        this.g = obj3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                return new p18((i28) this.d, (iu30) this.e, this.c, (n18) obj3, (iac0) obj2, lnmVar, (byte) 0);
            case 1:
                p18 p18Var = new p18(this.e, obj3, obj2, this.c, lnmVar, (byte) 1);
                p18Var.d = obj;
                return p18Var;
            case 2:
                p18 p18Var2 = new p18((mr20) obj3, this.c, (vr20) obj2, lnmVar);
                p18Var2.e = obj;
                return p18Var2;
            case 3:
                return new p18((cr41) this.d, (u5u) this.e, this.c, (pob0) obj3, (g6o0) obj2, lnmVar, (byte) 3);
            case 4:
                p18 p18Var3 = new p18(this.c, this.e, obj3, obj2, lnmVar, (byte) 4);
                p18Var3.d = obj;
                return p18Var3;
            case 5:
                return new p18(this.e, obj3, obj2, this.c, lnmVar, (byte) 5);
            case 6:
                p18 p18Var4 = new p18((tmc0) this.e, (zwo1) obj3, this.c, (yln1) obj2, lnmVar);
                p18Var4.d = obj;
                return p18Var4;
            default:
                p18 p18Var5 = new p18(this.c, this.e, obj3, obj2, lnmVar, (byte) 7);
                p18Var5.d = obj;
                return p18Var5;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p.iu30] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r2;
        xab1 xab1Var;
        ven0 ven0Var;
        Object objS;
        Object objU;
        byte b = this.a;
        tgo1 tgo1Var = tgo1.c;
        long j = this.c;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        Object obj2 = this.g;
        rih1 rih1Var2 = d9n.a;
        Object obj3 = this.f;
        CancellationException cancellationException = null;
        switch (b) {
            case 0:
                iu30 iu30Var = (iu30) this.e;
                boolean z2 = this.b;
                try {
                    try {
                        if (z2) {
                            if (z2) {
                                hm5.M(obj);
                                return rih1Var;
                            }
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        i28 i28Var = (i28) this.d;
                        int i = i28Var == null ? -1 : o18.a[i28Var.ordinal()];
                        ?? r3 = 1;
                        try {
                            if (i == 1) {
                                iu30 iu30Var2 = iu30Var;
                                iu30Var2.invoke(new f2h0(j));
                                r3 = iu30Var2;
                            } else {
                                if (i != 2) {
                                    return rih1Var;
                                }
                                ((n18) obj3).b(j);
                                x8c0 lifecycle = ((iac0) obj2).getLifecycle();
                                w8c0 w8c0Var = w8c0.e;
                                d6 d6Var = new d6(iu30Var, (n18) obj3, this.c, (lnm) null, (byte) 2);
                                iu30 iu30Var3 = iu30Var;
                                this.b = true;
                                r3 = iu30Var3;
                                if (z8p1.t(lifecycle, w8c0Var, d6Var, this) == rih1Var2) {
                                    rih1Var = rih1Var2;
                                    r3 = iu30Var3;
                                }
                            }
                            return rih1Var;
                        } catch (Exception e) {
                            e = e;
                            r2 = r3;
                            Logger.e(e, "Full chat microphone permission request failed", new Object[0]);
                            r2.invoke(new i2h0(j, z18.a));
                            return rih1Var;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        r2 = iu30Var;
                    }
                } catch (CancellationException e3) {
                    throw e3;
                }
                break;
            case 1:
                xtl xtlVar = (xtl) this.e;
                ps7 ps7Var = xtlVar.T0;
                boolean z3 = this.b;
                try {
                    try {
                        if (!z3) {
                            hm5.M(obj);
                            faa0 faa0VarZ = op71.z(((c9n) this.d).J());
                            xtlVar.W0 = true;
                            du41 du41Var = xtlVar.P0;
                            hfn0 hfn0Var = hfn0.a;
                            try {
                                ie3 ie3Var = new ie3((vnh1) obj3, xtlVar, (p5c) obj2, this.c, faa0VarZ, (lnm) null);
                                this.b = true;
                                if (du41Var.g(hfn0Var, ie3Var, this) == rih1Var2) {
                                    return rih1Var2;
                                }
                            } catch (CancellationException e4) {
                                e = e4;
                                xtlVar = xtlVar;
                                cancellationException = e;
                                throw cancellationException;
                            } catch (Throwable th) {
                                th = th;
                                xtlVar = xtlVar;
                                xtlVar.W0 = false;
                                ps7Var.b(cancellationException);
                                xtlVar.U0 = false;
                                throw th;
                            }
                        } else {
                            if (!z3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                        }
                        ps7Var.h();
                        xtlVar.W0 = false;
                        ps7Var.b(null);
                        xtlVar.U0 = false;
                        return rih1Var;
                    } catch (CancellationException e5) {
                        e = e5;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            case 2:
                c9n c9nVar = (c9n) this.e;
                boolean z4 = this.b;
                if (z4) {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xab1Var = (xab1) this.d;
                    try {
                        hm5.M(obj);
                        xab1Var.d((CancellationException) null);
                        return rih1Var;
                    } catch (Throwable th3) {
                        th = th3;
                        xab1Var.d((CancellationException) null);
                        throw th;
                    }
                }
                hm5.M(obj);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                xab1 xab1VarT = fn31.T(c9nVar, (o8n) null, 0, new wn2(this.c, atomicBoolean, c9nVar, (lnm) null, (byte) 9), 3);
                try {
                    wem wemVar = new wem(atomicBoolean, xab1VarT, (vr20) obj2, (byte) 18);
                    this.e = null;
                    this.d = xab1VarT;
                    this.b = true;
                    if (((mr20) obj3).collect(wemVar, this) == rih1Var2) {
                        return rih1Var2;
                    }
                    xab1Var = xab1VarT;
                    xab1Var.d((CancellationException) null);
                    return rih1Var;
                } catch (Throwable th4) {
                    th = th4;
                    xab1Var = xab1VarT;
                    xab1Var.d((CancellationException) null);
                    throw th;
                }
            case 3:
                cr41 cr41Var = (cr41) this.d;
                u5u u5uVar = (u5u) this.e;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (cr41Var != cr41.a && u5uVar.a == null) {
                    u5uVar.a = Math.abs(Float.intBitsToFloat((int) (j >> 32))) > Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) ? cr41.b : cr41.c;
                }
                cr41 cr41Var2 = u5uVar.a;
                this.b = true;
                return sjo0.m((pob0) obj3, (g6o0) obj2, this.c, cr41Var, cr41Var2, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 4:
                ssw0 ssw0Var = (ssw0) this.d;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o811 o811Var = new o811();
                o811Var.a = j;
                mr20 mr20VarU = rqt0.u((mr20) this.e);
                fjk fjkVar = new fjk(ssw0Var, o811Var, (mr20) obj3, (skd0) obj2, (lnm) null, (byte) 1);
                this.d = null;
                this.b = true;
                return l4p1.q(mr20VarU, fjkVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 5:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    ven0Var = ((mz31) this.e).a;
                    dc31 dc31Var = (dc31) ((et90) obj3).e;
                    nz31 nz31Var = (nz31) obj2;
                    String str = nz31Var.a;
                    jz31 jz31Var = nz31Var.b;
                    hkm1 hkm1Var = new hkm1((int) j, (int) (j >> 32));
                    this.d = ven0Var;
                    this.b = true;
                    objS = smo1.s(new ae1(jz31Var, dc31Var, str, hkm1Var, (lnm) null, (byte) 19), this);
                    if (objS == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ven0Var = (ven0) this.d;
                    hm5.M(obj);
                    objS = obj;
                }
                ven0Var.setValue(objS);
                return rih1Var;
            case 6:
                boolean z8 = this.b;
                hm5.M(obj);
                if (z8) {
                    objU = obj;
                } else {
                    c9n c9nVar2 = (c9n) this.d;
                    List list = ((tmc0) this.e).a;
                    if (list.isEmpty()) {
                        return rih1Var;
                    }
                    List list2 = list;
                    zwo1 zwo1Var = (zwo1) obj3;
                    yln1 yln1Var = (yln1) obj2;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(fn31.q(c9nVar2, (o8n) null, 0, new zwn1(zwo1Var, (cwn1) it.next(), this.c, yln1Var, (lnm) null, (byte) 0), 3));
                        z = true;
                    }
                    this.b = z;
                    objU = o1p1.u(arrayList, this);
                    if (objU == rih1Var2) {
                        return rih1Var2;
                    }
                }
                List list3 = (List) objU;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (!(((e331) it2.next()).a instanceof m231)) {
                            return rih1Var;
                        }
                    }
                }
                throw new zzhm(tgo1Var, ij81.U0, (String) null, (Exception) null);
            default:
                try {
                    if (this.b) {
                        hm5.M(obj);
                    } else {
                        hm5.M(obj);
                        zwo1 zwo1Var2 = (zwo1) this.d;
                        long j2 = this.c;
                        lwn1 lwn1Var = new lwn1(zwo1Var2, (cik1) this.e, (b1o1) obj3, (yln1) obj2, j2, (lnm) null, (byte) 1);
                        this.b = true;
                        if (rc2.M(j2, lwn1Var, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    }
                    return rih1Var;
                } catch (Exception e6) {
                    throw new zzhm(tgo1Var, ij81.c1, e6.getMessage(), (Exception) null);
                } catch (zzhm e7) {
                    throw e7;
                } catch (TimeoutCancellationException e8) {
                    throw new zzhm(tgo1Var, ij81.e, e8.getMessage(), (Exception) null);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p18(long j, Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = j;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p18(Object obj, Object obj2, Object obj3, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p18(mr20 mr20Var, long j, vr20 vr20Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.f = mr20Var;
        this.c = j;
        this.g = vr20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p18(tmc0 tmc0Var, zwo1 zwo1Var, long j, yln1 yln1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.e = tmc0Var;
        this.f = zwo1Var;
        this.c = j;
        this.g = yln1Var;
    }
}
