package p;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cch extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cch(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.i = obj2;
        this.e = obj3;
        this.b = obj4;
        this.g = obj5;
        this.h = obj6;
        this.c = obj7;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.i;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                return new cch((mr20) obj5, (o8n) obj4, this.e, (rsw0) this.b, (vr20) obj3, (xu30) obj2, (gaa0) this.c, lnmVar, (byte) 0);
            case 1:
                cch cchVar = new cch((qt20) obj4, (mr20) obj5, (vr20) obj3, (xu30) obj2, lnmVar);
                cchVar.e = obj;
                return cchVar;
            default:
                return new cch((q8y) obj5, (zy70) obj4, this.e, (dqq0) this.b, (va00) obj3, (bsi0) obj2, (vf01) this.c, lnmVar, (byte) 2);
        }
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((cch) create((rih1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((cch) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((cch) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [p.jfe] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [p.jfe] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // p.faa
    public final Object invokeSuspend(Object obj) throws Throwable {
        gaa0 gaa0Var;
        rsw0 rsw0Var;
        Object objC;
        boolean z;
        wf01 wf01VarD;
        switch (this.a) {
            case 0:
                d9n d9nVar = d9n.a;
                boolean z2 = this.d;
                if (!z2) {
                    hm5.M(obj);
                    mr20 mr20Var = (mr20) this.f;
                    bch bchVar = new bch((o8n) this.i, this.e, (rsw0) this.b, (vr20) this.g, (xu30) this.h, (gaa0) this.c);
                    this.d = true;
                    if (mr20Var.collect(bchVar, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 1:
                rih1 rih1Var = rih1.a;
                c9n c9nVar = (c9n) this.e;
                d9n d9nVar2 = d9n.a;
                ?? r3 = this.d;
                try {
                    if (r3 != 0) {
                        if (r3 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gaa0Var = (gaa0) this.c;
                        rsw0Var = (rsw0) this.b;
                        try {
                            hm5.M(obj);
                            r3 = rsw0Var;
                            break;
                        } catch (AbortFlowException e) {
                            e = e;
                            c4p1.p(e, gaa0Var);
                            r3 = rsw0Var;
                        }
                        r3.d(null);
                        return rih1Var;
                    }
                    hm5.M(obj);
                    rsw0 rsw0VarQ = jch0.Q(c9nVar, 0, new bag((qt20) this.i, (lnm) null, (byte) 11), 3);
                    gaa0 gaa0VarF = op71.f();
                    rsw0VarQ.B(new p5(gaa0VarF, (byte) 12));
                    try {
                        try {
                            o8n o8nVarJ = c9nVar.J();
                            Object objS = flo1.s(o8nVarJ);
                            o8n o8nVarY = c9nVar.J().y(gaa0VarF);
                            try {
                                cch cchVar = new cch((mr20) this.f, o8nVarJ, objS, rsw0VarQ, (vr20) this.g, (xu30) this.h, gaa0VarF, null, (byte) 0);
                                this.e = null;
                                this.b = rsw0VarQ;
                                this.c = gaa0VarF;
                                this.d = true;
                                if (blo1.y(o8nVarY, rih1Var, cchVar, this) == d9nVar2) {
                                    return d9nVar2;
                                }
                                r3 = rsw0VarQ;
                                r3.d(null);
                                return rih1Var;
                            } catch (AbortFlowException e2) {
                                e = e2;
                                gaa0VarF = gaa0VarF;
                                gaa0Var = gaa0VarF;
                                rsw0Var = rsw0VarQ;
                                c4p1.p(e, gaa0Var);
                                r3 = rsw0Var;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r3 = rsw0VarQ;
                            r3.d(null);
                            throw th;
                        }
                    } catch (AbortFlowException e3) {
                        e = e3;
                    }
                    break;
                    c4p1.p(e, gaa0Var);
                    r3 = rsw0Var;
                    r3.d(null);
                    return rih1Var;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                tsc1 tsc1Var = d9n.a;
                boolean z3 = this.d;
                if (!z3) {
                    hm5.M(obj);
                    q8y q8yVar = (q8y) this.f;
                    zy70 zy70Var = (zy70) this.i;
                    Object obj2 = this.e;
                    dqq0 dqq0Var = (dqq0) this.b;
                    va00 va00Var = (va00) this.g;
                    this.d = true;
                    objC = q8yVar.c(zy70Var, obj2, dqq0Var, va00Var, this);
                    if (objC != tsc1Var) {
                    }
                    return tsc1Var;
                }
                if (!z3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objC = obj;
                l8y l8yVar = (l8y) objC;
                i25 i25Var = ((q8y) this.f).b;
                synchronized (i25Var) {
                    try {
                        rf01 rf01Var = (rf01) ((WeakReference) i25Var.b).get();
                        if (rf01Var == null) {
                            i25Var.f();
                        } else if (((Context) i25Var.e) == null) {
                            Context context = rf01Var.a.a;
                            i25Var.e = context;
                            context.registerComponentCallbacks((h25) i25Var.d);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                ifl1 ifl1Var = ((q8y) this.f).d;
                bsi0 bsi0Var = (bsi0) this.h;
                zy70 zy70Var2 = (zy70) this.i;
                if (bsi0Var == null || !zy70Var2.j.b || !l8yVar.a.d() || (wf01VarD = ((rf01) ifl1Var.b).d()) == null) {
                    z = false;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("coil#is_sampled", Boolean.valueOf(l8yVar.b));
                    String str = l8yVar.d;
                    if (str != null) {
                        linkedHashMap.put("coil#disk_cache_key", str);
                    }
                    oq70 oq70Var = l8yVar.a;
                    Map mapG = ila0.G(linkedHashMap);
                    synchronized (wf01VarD.c) {
                        long jA = oq70Var.a();
                        if (jA < 0) {
                            throw new IllegalStateException(("Image size must be non-negative: " + jA).toString());
                        }
                        wf01VarD.a.b(bsi0Var, oq70Var, mapG, jA);
                    }
                    z = true;
                }
                oq70 oq70Var2 = l8yVar.a;
                zy70 zy70Var3 = (zy70) this.i;
                int i = l8yVar.c;
                bsi0 bsi0Var2 = z ? (bsi0) this.h : null;
                String str2 = l8yVar.d;
                boolean z4 = l8yVar.b;
                vf01 vf01Var = (vf01) this.c;
                tsc1Var = new tsc1(oq70Var2, zy70Var3, i, bsi0Var2, str2, z4, vf01Var != null && vf01Var.g);
                return tsc1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cch(qt20 qt20Var, mr20 mr20Var, vr20 vr20Var, xu30 xu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.i = qt20Var;
        this.f = mr20Var;
        this.g = vr20Var;
        this.h = xu30Var;
    }
}
