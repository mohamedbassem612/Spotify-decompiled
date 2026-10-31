package p;

import android.content.Context;
import androidx.glance.session.TimeoutCancellationException;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.scrollsita.v1.Section;
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p651 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p651(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    private final Object e(Object obj) {
        Object next;
        Object next2;
        iu30 iu30Var = (iu30) this.e;
        ven0 ven0Var = (ven0) this.f;
        nl9 nl9Var = (nl9) this.d;
        sv61 sv61Var = (sv61) this.c;
        boolean z = this.b;
        lnm lnmVar = null;
        if (!z) {
            hm5.M(obj);
            jt61 jt61Var = sv61Var.a;
            String str = (String) sv61Var.b;
            String str2 = (String) jt61Var.a();
            j1c1 j1c1Var = (j1c1) ven0Var.getValue();
            Set<String> setA = ((pjm1) nl9Var.h).a();
            ArrayList arrayList = new ArrayList(q7h.U(setA, 10));
            for (String str3 : setA) {
                arrayList.add(new k1c1(str3, 252, nhc1.Y(str3, "/storage/emulated/0", false)));
            }
            j1c1 j1c1VarA = j1c1.a(j1c1Var, o7h.a1(arrayList, new xvd(new be21((byte) 19), (byte) 27)), null, null, null, 29);
            String str4 = str == null ? str2 : str;
            List<k1c1> list = j1c1VarA.b;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                k1c1 k1c1Var = (k1c1) next;
                if (str4 != null && nhc1.Y(str4, k1c1Var.a, false)) {
                    break;
                }
            }
            k1c1 k1c1Var2 = (k1c1) next;
            if (k1c1Var2 == null) {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!((k1c1) next2).b);
                k1c1Var2 = (k1c1) next2;
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
            for (k1c1 k1c1Var3 : list) {
                arrayList2.add(k1c1.a(k1c1Var3, u890.j(k1c1Var3, k1c1Var2), null, false, null, null, null, 251));
            }
            iu30Var.invoke(j1c1.a(j1c1VarA, arrayList2, str2, null, null, 25));
            mr20 mr20VarU = rqt0.u(new xs4(h4p1.f(new sb91((gpm0) nl9Var.b, lnmVar, (byte) 27)), str, (byte) 15));
            on1 on1Var = new on1(iu30Var, nl9Var, ven0Var, str2, (lnm) null);
            this.c = null;
            this.b = true;
            Object objQ = l4p1.q(mr20VarU, on1Var, this);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object g(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            zu30 zu30Var = ((k8d1) this.c).b;
            Object state = ((h141) this.d).getState();
            tqw tqwVar = (tqw) this.f;
            this.b = true;
            Object objJ = zu30Var.J(state, this.e, tqwVar, this);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object h(Object obj) {
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        z4e1 z4e1Var = (z4e1) this.c;
        idn0 idn0Var = z4e1Var.Z0;
        r7e1 r7e1Var = (r7e1) this.d;
        nav0 nav0Var = (nav0) this.e;
        qga0 qga0Var = (qga0) this.f;
        s4e1 s4e1Var = new s4e1(z4e1Var, (byte) 11);
        this.b = true;
        r7e1Var.getClass();
        s7e1 s7e1Var = new s7e1(idn0Var, r7e1Var, null);
        d5e1 d5e1Var = new d5e1(qga0Var, r7e1Var, s4e1Var, (byte) 4);
        u9a1 u9a1Var = rqd1.a;
        Object objS = smo1.s(new bj81((Object) nav0Var, (Object) s7e1Var, (Object) d5e1Var, (Object) new p9w0(nav0Var), (lnm) null, (byte) 8), this);
        d9n d9nVar = d9n.a;
        if (objS != d9nVar) {
            objS = rih1Var;
        }
        if (objS != d9nVar) {
            objS = rih1Var;
        }
        if (objS != d9nVar) {
            objS = rih1Var;
        }
        if (objS != d9nVar) {
            objS = rih1Var;
        }
        return objS == d9nVar ? d9nVar : rih1Var;
    }

    private final Object i(Object obj) {
        Object objJ;
        d9n d9nVar;
        ove1 ove1Var = (ove1) this.c;
        boolean z = this.b;
        if (z && !z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        do {
            Object obj2 = ove1Var.b.get();
            obj2.getClass();
            long jLongValue = ((Number) obj2).longValue();
            ((t8e1) this.d).getClass();
            if (jLongValue <= System.currentTimeMillis()) {
                smo1.p((c9n) this.e, new TimeoutCancellationException("Timed out of executing block.", ((vu30) this.f).hashCode()));
                return rih1.a;
            }
            long jA = ove1Var.a();
            this.b = true;
            objJ = hap1.j(jA, this);
            d9nVar = d9n.a;
        } while (objJ != d9nVar);
        return d9nVar;
    }

    private final Object j(Object obj) {
        c9n c9nVar = (c9n) this.c;
        boolean z = this.b;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        Iterable iterable = (Iterable) this.d;
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        int i = 0;
        for (Object obj2 : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            arrayList.add(fn31.q(c9nVar, (o8n) null, 0, new dk6(obj2, i, (g7m1) this.e, (o9f1) this.f, (lnm) null, (byte) 7), 3));
            i = i2;
        }
        this.c = null;
        this.b = true;
        Object objU = o1p1.u(arrayList, this);
        d9n d9nVar = d9n.a;
        return objU == d9nVar ? d9nVar : objU;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                return new p651((u651) this.c, (erl1) this.d, (wat) obj2, (c751) obj3, lnmVar, (byte) 0);
            case 1:
                return new p651((cr51) this.c, (EsPlayOrigin.PlayOrigin) this.d, (EsLoggingParams.LoggingParams) obj2, (ayc0) obj3, lnmVar, (byte) 1);
            case 2:
                return new p651((ujq0) this.c, (gyj) this.d, (sw31) obj2, (tv80) obj3, lnmVar, (byte) 2);
            case 3:
                return new p651((mzr0) this.c, (String) this.d, (vu30) obj2, (r6h1) obj3, lnmVar, (byte) 3);
            case 4:
                p651 p651Var = new p651(this.d, obj2, obj3, lnmVar, (byte) 4);
                p651Var.c = obj;
                return p651Var;
            case 5:
                return new p651((cy5) this.c, (Context) this.d, (Throwable) obj2, (ove1) obj3, lnmVar, (byte) 5);
            case 6:
                p651 p651Var2 = new p651(this.d, obj2, obj3, lnmVar, (byte) 6);
                p651Var2.c = obj;
                return p651Var2;
            case 7:
                return new p651(this.d, obj2, obj3, lnmVar, (byte) 7);
            case 8:
                return new p651(this.d, obj2, obj3, lnmVar, (byte) 8);
            case 9:
                return new p651(this.d, obj2, obj3, lnmVar, (byte) 9);
            case 10:
                return new p651((ung) this.c, (String) this.d, (String) obj2, (Context) obj3, lnmVar, (byte) 10);
            case 11:
                return new p651((le71) this.c, (oi) this.d, (List) obj2, (LinkedHashMap) obj3, lnmVar, (byte) 11);
            case 12:
                p651 p651Var3 = new p651(this.d, obj2, obj3, lnmVar, (byte) 12);
                p651Var3.c = obj;
                return p651Var3;
            case 13:
                p651 p651Var4 = new p651(this.d, obj2, obj3, lnmVar, (byte) 13);
                p651Var4.c = obj;
                return p651Var4;
            case 14:
                return new p651(this.d, obj2, obj3, lnmVar, (byte) 14);
            case 15:
                return new p651((xtb0) this.c, (ven0) this.d, (ven0) obj2, (iu30) obj3, lnmVar, (byte) 15);
            case 16:
                return new p651((k781) this.c, (lik1) this.d, (String) obj2, (l781) obj3, lnmVar, (byte) 16);
            case 17:
                return new p651((mzr0) this.c, (String) this.d, (String) obj2, (String) obj3, lnmVar, (byte) 17);
            case 18:
                p651 p651Var5 = new p651(this.d, obj2, obj3, lnmVar, (byte) 18);
                p651Var5.c = obj;
                return p651Var5;
            case 19:
                return new p651((v5a1) this.c, (ou80) this.d, (g5a1) obj2, (s4b1) obj3, lnmVar, (byte) 19);
            case 20:
                p651 p651Var6 = new p651(this.d, obj2, obj3, lnmVar, (byte) 20);
                p651Var6.c = obj;
                return p651Var6;
            case 21:
                return new p651((iu30) this.c, (bsd1) this.d, (SpotifyWearableListenerService) obj2, (iu30) obj3, lnmVar, (byte) 21);
            case 22:
                return new p651((nl9) this.c, (String) this.d, (iu30) obj2, (ven0) obj3, lnmVar, (byte) 22);
            case 23:
                p651 p651Var7 = new p651(this.d, obj2, obj3, lnmVar, (byte) 23);
                p651Var7.c = obj;
                return p651Var7;
            case 24:
                return new p651((ywc1) obj2, (ven0) obj3, lnmVar);
            case 25:
                return new p651((k8d1) this.c, (h141) this.d, this.e, (tqw) obj3, lnmVar, (byte) 25);
            case 26:
                return new p651((z4e1) this.c, (r7e1) this.d, (nav0) obj2, (qga0) obj3, lnmVar, (byte) 26);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new p651((ove1) this.c, (t8e1) this.d, (c9n) obj2, (vu30) obj3, lnmVar, (byte) 27);
            case 28:
                p651 p651Var8 = new p651((Iterable) this.d, lnmVar, (g7m1) obj2, (a3k) obj3, (byte) 28);
                p651Var8.c = obj;
                return p651Var8;
            default:
                p651 p651Var9 = new p651((Iterable) this.d, lnmVar, (g7m1) obj2, (a3k) obj3, (byte) 29);
                p651Var9.c = obj;
                return p651Var9;
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
                return create((ou80) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((tv80) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((il71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((jl71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((q0c1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((sv61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x032b  */
    /* JADX WARN: Code duplicated, block: B:366:0x071e A[PHI: r0
      0x071e: PHI (r0v68 p.ven0) = (r0v67 p.ven0), (r0v70 p.ven0), (r0v70 p.ven0) binds: [B:340:0x0682, B:345:0x0699, B:364:0x071b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:476:0x0713 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x06e2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v103, types: [p.ven0] */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v8 java.lang.Object, still in use, count: 2, list:
          (r6v8 java.lang.Object) from 0x070f: PHI (r6 I:??) = (r6v5 java.lang.Object), (r6v8 java.lang.Object) binds: [B:359:0x070e, B:481:0x070f] A[DONT_GENERATE, DONT_INLINE]
          (r6v8 java.lang.Object) from 0x06fd: CHECK_CAST (p.wq61) (r6v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 2582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p651.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p651(Iterable iterable, lnm lnmVar, g7m1 g7m1Var, a3k a3kVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = iterable;
        this.e = g7m1Var;
        this.f = a3kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p651(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p651(ywc1 ywc1Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 24;
        this.e = ywc1Var;
        this.f = ven0Var;
    }
}
