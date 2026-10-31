package p;

import android.os.Bundle;
import com.spotify.recents.recentsdatasourceimpl.GroupMetadata;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rzo0 implements Function, rl71, vfa, i3h1, xq61 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    public rzo0(Flowable flowable, o241 o241Var, phi0 phi0Var) {
        this.a = (byte) 2;
        this.b = phi0Var;
        this.c = flowable.t(sl10.U0);
        this.d = ((p241) o241Var).a.distinctUntilChanged(new ulc(this, (byte) 17)).toFlowable(BackpressureStrategy.d);
    }

    public static final void l(rzo0 rzo0Var) {
        for (Map.Entry entry : ((LinkedHashMap) rzo0Var.c).entrySet()) {
            String str = (String) entry.getKey();
            if (((Boolean) ((Function0) entry.getValue()).invoke()).booleanValue()) {
                ((CompositeDisposable) rzo0Var.d).b(((hs00) rzo0Var.b).a(str).o(Functions.h).subscribe());
            }
        }
    }

    public static final /* synthetic */ CompositeDisposable m(rzo0 rzo0Var) {
        return (CompositeDisposable) rzo0Var.d;
    }

    public static g2z o(rzo0 rzo0Var, FlowableDistinctUntilChanged flowableDistinctUntilChanged) {
        return new g2z(flowableDistinctUntilChanged, Flowable.I(Boolean.FALSE), (FlowableMap) rzo0Var.b, (Scheduler) rzo0Var.c, (tu4) rzo0Var.d);
    }

    public i8h1 A() {
        return (i8h1) ((idd1) this.d).getValue();
    }

    public mr20 B() {
        FlowableMap flowableMapJ = ((Flowable) this.b).J(va20.R0);
        vbm[] vbmVarArr = q601.a;
        return rqt0.u(new x010(new kge(flowableMapJ), new jqg0(ezn1.o(((m7p0) this.c).a), k8b0.W0).a(), new lag0(this, (lnm) null, (byte) 4), (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(onm onmVar) {
        d7q0 d7q0Var;
        if (onmVar instanceof d7q0) {
            d7q0Var = (d7q0) onmVar;
            int i = d7q0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d7q0Var.c = i - Integer.MIN_VALUE;
            } else {
                d7q0Var = new d7q0(this, onmVar);
            }
        } else {
            d7q0Var = new d7q0(this, onmVar);
        }
        Object objI = d7q0Var.a;
        int i2 = d7q0Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objI);
            x010 x010VarA = ((k7d) this.c).a();
            d7q0Var.c = 1;
            objI = b5p1.i(x010VarA, d7q0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        j7d j7dVar = (j7d) objI;
        if (j7dVar != j7d.b && j7dVar != j7d.d) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void D(int i, String str, String str2) {
        p().g(i, str, str2);
    }

    public tv80 E() {
        i8h1 i8h1VarA = A();
        xrl0 xrl0Var = (xrl0) this.c;
        b7x b7xVar = b7x.a;
        return i8h1VarA.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), xrl0Var.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void F(String str, Function0 function0) {
        ((LinkedHashMap) this.c).put(str, function0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object G(List list, onm onmVar) {
        eyp0 eyp0Var;
        if (onmVar instanceof eyp0) {
            eyp0Var = (eyp0) onmVar;
            int i = eyp0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eyp0Var.c = i - Integer.MIN_VALUE;
            } else {
                eyp0Var = new eyp0(this, onmVar);
            }
        } else {
            eyp0Var = new eyp0(this, onmVar);
        }
        Object objJ = eyp0Var.a;
        int i2 = eyp0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                ezc ezcVarG = yoi1.g(((uu00) this.c).b(new oi("download-offline-removal-gate", false, new nec0(list, (byte) 6))));
                zio0 zio0Var = new zio0(2, (lnm) null, (byte) 3);
                eyp0Var.c = 1;
                objJ = b5p1.j(ezcVarG, zio0Var, eyp0Var);
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
            return (uv00) objJ;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    public void H(xjr0 xjr0Var) {
        this.c = xjr0Var;
    }

    public void I(tsb0 tsb0Var) {
        this.d = tsb0Var;
    }

    public void a() {
        List<faa0> listL1;
        synchronized (this.b) {
            listL1 = o7h.l1(((HashMap) this.d).keySet());
            ((HashMap) this.c).clear();
            ((HashMap) this.d).clear();
        }
        for (faa0 faa0Var : listL1) {
            faa0Var.getClass();
            faa0Var.d((CancellationException) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
    public Object apply(Object obj) {
        String str;
        mq70 mq70Var;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 11:
                String str2 = (String) obj2;
                return (spq0) ((py21) obj).b(new atp0(str2, (byte) 1), new mvn0(str2, (String) this.c, (v2q0) this.d, (byte) 10));
            default:
                uv00 uv00Var = (uv00) obj;
                Map map = (Map) obj2;
                poj0 poj0Var = (poj0) this.c;
                m9m m9mVar = (m9m) this.d;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    atr0 atr0Var = (atr0) entry.getKey();
                    GroupMetadata groupMetadata = (GroupMetadata) entry.getValue();
                    List listD1 = o7h.d1(groupMetadata.o(), 3);
                    ArrayList<String> arrayList2 = new ArrayList();
                    for (Object obj3 : listD1) {
                        if (!eyo1.v((String) obj3)) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (String str3 : arrayList2) {
                        poj0Var.getClass();
                        tv00 tv00VarA = uv00Var.a(xkk1.class, str3);
                        if (tv00VarA.c.b == 5) {
                            poj0Var.D(4, "Recents: Image for " + str3 + " is unavailable for legal reasons.");
                        }
                        xkk1 xkk1Var = tv00VarA.b;
                        if (xkk1Var == null || (mq70Var = xkk1Var.a) == null) {
                            str = null;
                        } else {
                            up70 up70VarA = mq70Var.a(vp70.b);
                            if (up70VarA == null) {
                                up70VarA = mq70Var.a(vp70.c);
                            }
                            if (up70VarA != null) {
                                str = up70VarA.a.a;
                            } else {
                                str = null;
                            }
                        }
                        ft01 ft01Var = str != null ? new ft01(str, str3) : null;
                        if (ft01Var != null) {
                            arrayList3.add(ft01Var);
                        }
                    }
                    String str4 = atr0Var.b;
                    poj0Var.getClass();
                    arrayList.add(new mmr0(atr0Var, new btr0(arrayList3, new yq01(str4, poj0.q(groupMetadata, m9mVar)))));
                }
                Map mapT = sqg0.T(arrayList);
                ((xr01) poj0Var.d).b = mapT;
                return new cbr(mapT);
        }
    }

    public void b(String str) {
        p().b(str);
    }

    public void c(voa0 voa0Var, zsc zscVar, llm llmVar, kd8 kd8Var, hj8 hj8Var) {
        ArrayList arrayList;
        Set set = voa0Var.a;
        Set set2 = !set.isEmpty() ? set : null;
        xab1 xab1VarT = set2 != null ? fn31.T(llmVar, (o8n) null, 2, new ofk0((Object) zscVar, (Object) set2, (Object) hj8Var, (Object) kd8Var, (lnm) null, (byte) 17), 1) : null;
        synchronized (this.b) {
            try {
                LinkedHashSet<jh5> linkedHashSetY0 = dm61.y0(voa0Var.b, voa0Var.a);
                arrayList = new ArrayList();
                for (jh5 jh5Var : linkedHashSetY0) {
                    HashMap map = (HashMap) this.d;
                    faa0 faa0Var = (faa0) ((HashMap) this.c).remove(jh5Var);
                    if (faa0Var != null) {
                        Integer num = (Integer) map.get(faa0Var);
                        int iIntValue = (num != null ? num.intValue() : 1) - 1;
                        if (iIntValue > 0) {
                            map.put(faa0Var, Integer.valueOf(iIntValue));
                            faa0Var = null;
                        } else {
                            map.remove(faa0Var);
                        }
                    } else {
                        faa0Var = null;
                    }
                    if (faa0Var != null) {
                        arrayList.add(faa0Var);
                    }
                }
                if (xab1VarT != null) {
                    Iterator it = voa0Var.a.iterator();
                    while (it.hasNext()) {
                        ((HashMap) this.c).put((jh5) it.next(), xab1VarT);
                    }
                    ((HashMap) this.d).put(xab1VarT, Integer.valueOf(voa0Var.a.size()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((faa0) it2.next()).d((CancellationException) null);
        }
        if (xab1VarT != null) {
            xab1VarT.start();
        }
    }

    public void d(int i, String str, String str2) {
        p().d(i, str, str2);
    }

    public void e(String str) {
        p().e(str);
    }

    public void f(String str, boolean z) {
        p().f(str, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r9.a(r8 != null ? r8.a : null) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r9 == r6) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(p.k371 r8, p.lnm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.c7q0
            if (r0 == 0) goto L13
            r0 = r9
            p.c7q0 r0 = (p.c7q0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            p.c7q0 r0 = new p.c7q0
            p.onm r9 = (p.onm) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L34
            if (r1 != r4) goto L2e
            p.hm5.M(r9)
            goto L8f
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L34:
            p.k371 r8 = r0.a
            p.hm5.M(r9)
            goto L64
        L3a:
            p.hm5.M(r9)
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = r7.b
            p.xm41 r9 = (p.xm41) r9
            p.cwp0 r1 = p.cwp0.W0
            java.lang.Object r9 = p.eth.z(r9, r1)
            p.kbd r9 = (p.kbd) r9
            if (r9 != 0) goto L59
            java.lang.String r9 = "Session scope not entered, hiding on platform section"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.spotify.base.java.logging.Logger.k(r9, r1)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L61
        L59:
            p.mr20 r9 = r9.b()
            java.lang.Object r9 = p.b5p1.i(r9, r0)
        L61:
            if (r9 != r6) goto L64
            goto L8e
        L64:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L84
            java.lang.Object r9 = r7.d
            p.ywp r9 = (p.ywp) r9
            java.lang.Object r9 = r9.get()
            p.pki1 r9 = (p.pki1) r9
            p.wa71 r8 = r8.a
            if (r8 == 0) goto L7d
            java.lang.String r8 = r8.a
            goto L7e
        L7d:
            r8 = r2
        L7e:
            boolean r8 = r9.a(r8)
            if (r8 == 0) goto L98
        L84:
            r0.a = r2
            r0.d = r4
            java.lang.Object r9 = r7.C(r0)
            if (r9 != r6) goto L8f
        L8e:
            return r6
        L8f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 != 0) goto L98
            r3 = r5
        L98:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzo0.g(p.k371, p.lnm):java.lang.Object");
    }

    public tv80 h(String str, int i, int i2, gxs0 gxs0Var) {
        return p().h(str, i, i2, gxs0Var);
    }

    public void i(th61 th61Var, String str, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        bab1 bab1Var;
        lnm lnmVar;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1911317536);
        int i2 = i | (b0kVar3.i(th61Var) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | 384 | (b0kVar3.i(this) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new gfq0(str, (String) null, (Bundle) null);
                b0kVar3.s0(objT);
            }
            bab1 bab1VarR = prn1.r((gfq0) objT, b0kVar3, 0);
            mwq0 mwq0VarG = cgj1.G(b0kVar3);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = new r1q0((Runnable) null);
                b0kVar3.s0(objT2);
            }
            r1q0 r1q0Var = (r1q0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q((Object) null);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            boolean zG = b0kVar3.g(bab1VarR) | b0kVar3.g(mwq0VarG);
            Object objT4 = b0kVar3.T();
            if (zG || objT4 == m4cVar) {
                bxp bxpVar = (bxp) this.b;
                lwq0 lwq0Var = mwq0VarG.e;
                ocp0 ocp0Var = new ocp0(mwq0VarG, r1q0Var, (byte) 28);
                q2j0 q2j0Var = new q2j0(ven0Var, (byte) 15);
                abh0 abh0Var = new abh0(ven0Var, (byte) 21);
                qq qqVar = (qq) bxpVar.a.c;
                mwn0 mwn0Var = (mwn0) ((nbq0) qqVar.b).k.get();
                c8o.l(mwn0Var);
                q7r0 q7r0Var = (q7r0) qqVar.c;
                nbq0 nbq0Var = (nbq0) qqVar.b;
                c690 c690Var = (c690) nbq0Var.j.get();
                c8o.l(c690Var);
                n431 n431Var = (n431) nbq0Var.l.get();
                c8o.l(n431Var);
                bab1Var = bab1VarR;
                objT4 = new ods(mwn0Var, q7r0Var, c690Var, n431Var, new pds(), (los) ((jly0) qqVar.g).get(), bab1Var, lwq0Var, ocp0Var, q2j0Var, abh0Var);
                b0kVar3.s0(objT4);
            } else {
                bab1Var = bab1VarR;
            }
            ods odsVar = (ods) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = gio1.b(Boolean.TRUE);
                b0kVar3.s0(objT5);
            }
            wen0 wen0Var = (wen0) objT5;
            boolean zI = b0kVar3.i(this);
            Object objT6 = b0kVar3.T();
            if (zI || objT6 == m4cVar) {
                lnmVar = null;
                objT6 = new iyb0(this, (lnm) null, (byte) 25);
                b0kVar3.s0(objT6);
            } else {
                lnmVar = null;
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT6);
            Boolean boolValueOf = Boolean.valueOf(mwq0VarG.a());
            boolean zI2 = b0kVar3.i(wen0Var) | b0kVar3.i(mwq0VarG) | b0kVar3.i(ven0Var);
            Object objT7 = b0kVar3.T();
            if (zI2 || objT7 == m4cVar) {
                rwm0 rwm0Var = new rwm0((Object) wen0Var, (Object) mwq0VarG, ven0Var, lnmVar, (byte) 8);
                b0kVar3.s0(rwm0Var);
                objT7 = rwm0Var;
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT7);
            boolean zI3 = b0kVar3.i(odsVar);
            Object objT8 = b0kVar3.T();
            if (zI3 || objT8 == m4cVar) {
                objT8 = new meq0(odsVar);
                b0kVar3.s0(objT8);
            }
            q3p1.b(0, 1, (Function0) objT8, b0kVar3, false);
            j2i j2iVarR = apo.r(1796614381, new jb1(this, th61Var, odsVar, r1q0Var, ven0Var, (byte) 22), b0kVar3);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            fdg1.k(mwq0VarG, j2iVarR, u291.d(qim0Var3, 1.0f), apo.r(-1806753348, new e9g0(this, bab1Var, th61Var, odsVar, wen0Var, (byte) 14), b0kVar3), b0kVar2, 3120, 0);
            lnm lnmVar2 = (hzn0) ven0Var.getValue();
            if (lnmVar2 instanceof fzn0) {
                lnmVar = (fzn0) lnmVar2;
            }
            if (lnmVar != null) {
                b0kVar2.i0(-1676790569);
                boolean zI4 = b0kVar2.i(ven0Var);
                Object objT9 = b0kVar2.T();
                if (zI4 || objT9 == m4cVar) {
                    objT9 = new q2j0(ven0Var, (byte) 14);
                    b0kVar2.s0(objT9);
                }
                Function0 function0 = (Function0) objT9;
                boolean zI5 = b0kVar2.i(ven0Var) | b0kVar2.g(lnmVar);
                Object objT10 = b0kVar2.T();
                if (zI5 || objT10 == m4cVar) {
                    objT10 = new ocp0(lnmVar, ven0Var, (byte) 27);
                    b0kVar2.s0(objT10);
                }
                yto.c(function0, (Function0) objT10, b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1676595486);
                b0kVar2.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, this, th61Var, str, qim0Var2, (byte) 4);
        }
    }

    public void j(bab1 bab1Var, th61 th61Var, ods odsVar, mr20 mr20Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1808693058);
        int i2 = i | (x340Var.i(bab1Var) ? 4 : 2) | (x340Var.i(th61Var) ? 32 : 16) | (x340Var.g(odsVar) ? 256 : 128) | (x340Var.i(mr20Var) ? 2048 : 1024) | 24576 | (x340Var.i(this) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.a.a(), d4o1.a);
            WeakHashMap weakHashMap = osl1.x;
            w9b1.a(bab1Var, too1.y(qim0VarF, lhc.g(x340Var).g), apo.r(1746396268, new c9y(this, th61Var, odsVar, mr20Var, (byte) 18), x340Var), x340Var, (i2 & 14) | 384, 0);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy(this, bab1Var, th61Var, odsVar, mr20Var, qim0Var2, i, (byte) 24);
        }
    }

    public void k(gfq0 gfq0Var, th61 th61Var, ods odsVar, r1q0 r1q0Var, hzn0 hzn0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        rzo0 rzo0Var;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-328972220);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(gfq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(th61Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(odsVar) : b0kVar3.i(odsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(r1q0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? b0kVar3.g(hzn0Var) : b0kVar3.i(hzn0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            rzo0Var = this;
            i2 |= b0kVar3.i(rzo0Var) ? 1048576 : 524288;
        } else {
            rzo0Var = this;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            scx scxVarM = pno1.m(b0kVar3);
            boolean zI = ((57344 & i2) == 16384 || ((i2 & 32768) != 0 && b0kVar3.i(hzn0Var))) | b0kVar3.i(scxVarM) | ((i2 & 458752) == 131072);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                rwm0 rwm0Var = new rwm0((Object) hzn0Var, (Object) scxVarM, (Object) function0, (lnm) null, (byte) 9);
                b0kVar3.s0(rwm0Var);
                objT = rwm0Var;
            }
            qxd0.t(hzn0Var, b0kVar3, (vu30) objT);
            b0kVar2 = b0kVar3;
            w2g0.c(u291.d(nim0.a, 1.0f), (tl3) null, apo.r(-568493414, new pih(odsVar, gfq0Var, scxVarM, hzn0Var, r1q0Var, rzo0Var, th61Var, (byte) 4), b0kVar3), b0kVar2, 3072, 6);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(this, gfq0Var, th61Var, odsVar, r1q0Var, hzn0Var, function0, i, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(gbr0 gbr0Var, long j, boolean z, onm onmVar) {
        lbr0 lbr0Var;
        if (onmVar instanceof lbr0) {
            lbr0Var = (lbr0) onmVar;
            int i = lbr0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lbr0Var.c = i - Integer.MIN_VALUE;
            } else {
                lbr0Var = new lbr0(this, onmVar);
            }
        } else {
            lbr0Var = new lbr0(this, onmVar);
        }
        Object objP = lbr0Var.a;
        int i2 = lbr0Var.c;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objP);
            oy3 oy3Var = new oy3((Object) gbr0Var, z, lnmVar, (byte) 14);
            lbr0Var.c = 1;
            objP = rc2.P(j, oy3Var, lbr0Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        return Boolean.valueOf(u890.j(objP, Boolean.TRUE));
    }

    public j3h1 p() {
        return (j3h1) ((idd1) this.d).getValue();
    }

    public int q() {
        if (u().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((mfh0) o7h.q0(u().a)).a) - ((long) u().h);
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public boolean r() {
        return !u().a.isEmpty();
    }

    public int s() {
        if (u().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((mfh0) o7h.A0(u().a)).a) + ((long) u().h);
        long jZ = ((long) z()) - 1;
        if (j > jZ) {
            j = jZ;
        }
        return (int) j;
    }

    public boolean t() {
        return true;
    }

    public xjr0 u() {
        xjr0 xjr0Var = (xjr0) this.c;
        if (xjr0Var != null) {
            return xjr0Var;
        }
        u890.C("layoutInfo");
        throw null;
    }

    public int v() {
        if (u().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((mfh0) o7h.A0(u().a)).k + u().b) + u().c) - u().g);
    }

    public int w() {
        if (u().a.isEmpty()) {
            return 0;
        }
        int i = ((mfh0) o7h.q0(u().a)).k + (-u().f);
        return Math.abs(i <= 0 ? i : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        if (r0 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.Serializable x(long r15, p.iu30 r17, p.onm r18) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzo0.x(long, p.iu30, p.onm):java.io.Serializable");
    }

    public Object y(String str, huu huuVar) {
        return fn31.Y((q8n) this.d, new l4f0(this, str, (lnm) null, (byte) 17), huuVar);
    }

    public int z() {
        return ((Number) ((lsb0) this.b).invoke()).intValue();
    }

    public rzo0(xrp xrpVar) {
        this.a = (byte) 29;
        this.b = xrpVar;
        this.c = new txk0((byte) 23);
        this.d = new idd1(new gyq0(this, (byte) 21));
    }

    public rzo0(ykq ykqVar, xrl0 xrl0Var) {
        this.a = (byte) 4;
        this.b = ykqVar;
        this.c = xrl0Var;
        this.d = new idd1(new ivn0(this, (byte) 22));
    }

    public rzo0(hs00 hs00Var, iac0 iac0Var) {
        this.a = (byte) 24;
        this.b = hs00Var;
        this.c = new LinkedHashMap();
        this.d = new CompositeDisposable();
        iac0Var.getLifecycle().a(new w4r0(this));
    }

    public /* synthetic */ rzo0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public rzo0(Flowable flowable, o241 o241Var, List list) {
        this.a = (byte) 3;
        this.b = list;
        this.c = flowable.x(ws10.T0);
        this.d = ((p241) o241Var).a.distinctUntilChanged(new eoc(this, (byte) 17)).toFlowable(BackpressureStrategy.d);
    }

    public rzo0(d0r d0rVar, g5s g5sVar) {
        this.a = (byte) 6;
        this.b = d0rVar;
        this.c = g5sVar;
        this.d = w3p1.o(new l4r(pwc0.b, 1, pzo0.Z0, new j4r(pzo0.X0), pzo0.a1), pzo0.Y0);
    }

    public rzo0(fwp0 fwp0Var, hfb hfbVar, t2b t2bVar, f8b f8bVar, nw41 nw41Var) {
        this.a = (byte) 8;
        this.b = fwp0Var;
        this.c = f8bVar;
        this.d = nw41Var;
    }

    public rzo0(zht zhtVar, uqv0 uqv0Var) {
        this.a = (byte) 22;
        this.b = zhtVar;
        this.c = uqv0Var;
        this.d = new ConcurrentHashMap();
    }

    public rzo0(lsb0 lsb0Var) {
        this.a = (byte) 26;
        this.b = lsb0Var;
    }

    public rzo0(q7r0 q7r0Var, edr0 edr0Var) {
        this.a = (byte) 23;
        this.b = q7r0Var;
        this.c = edr0Var;
        this.d = new idd1(new gyq0(this, (byte) 7));
    }

    public rzo0(ss61 ss61Var, ov20 ov20Var) {
        this.a = (byte) 25;
        this.b = ss61Var;
        this.c = ov20Var;
        this.d = new idd1(new gyq0(this, (byte) 14));
    }

    public rzo0() {
        this.a = (byte) 21;
        this.b = new Object();
        this.c = new HashMap();
        this.d = new HashMap();
    }
}
