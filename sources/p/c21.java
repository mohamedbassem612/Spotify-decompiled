package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$NoComponentProducerFound;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c21 implements Function, t2x {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    public c21(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4) {
        this.a = (byte) 8;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = linkedHashMap3;
        this.e = linkedHashMap4;
        this.f = new ArrayList(list);
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            tka0 tka0Var = (tka0) entry.getKey();
            arrayList.add(new mmr0(Integer.valueOf(tka0Var.hashCode()), (qsw0) entry.getValue()));
        }
        this.g = sqg0.T(arrayList);
        LinkedHashMap linkedHashMap5 = (LinkedHashMap) this.d;
        ArrayList arrayList2 = new ArrayList(linkedHashMap5.size());
        for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
            tka0 tka0Var2 = (tka0) entry2.getKey();
            arrayList2.add(new mmr0(Integer.valueOf(tka0Var2.hashCode()), (t1i) entry2.getValue()));
        }
        this.h = sqg0.T(arrayList2);
        LinkedHashMap linkedHashMap6 = (LinkedHashMap) this.e;
        ArrayList arrayList3 = new ArrayList(linkedHashMap6.size());
        for (Map.Entry entry3 : linkedHashMap6.entrySet()) {
            tka0 tka0Var3 = (tka0) entry3.getKey();
            arrayList3.add(new mmr0(Integer.valueOf(tka0Var3.hashCode()), (w1i) entry3.getValue()));
        }
        this.i = sqg0.T(arrayList3);
        this.t = new LinkedHashMap();
    }

    public np4 a() {
        luk lukVarD = ((nzp) this.d).d();
        c8o.l(lukVarD);
        return new np4(false, false, false, lukVarD);
    }

    public Object apply(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        qcl qclVar = (qcl) this.b;
        return zBooleanValue ? qclVar.b.a((String) this.c, (Bundle) this.d, (m210) this.e, (AbstractSet) this.f) : qclVar.c.a((String) this.g, (Bundle) this.h, (m210) this.i, (AbstractSet) this.t);
    }

    public op4 b() {
        luk lukVar = (luk) ((k0q) this.d).a.L1.get();
        c8o.l(lukVar);
        return new op4(false, false, false, lukVar);
    }

    public q2x c() {
        nwp nwpVar = (nwp) this.c;
        dwp dwpVar = (dwp) nwpVar.R1.get();
        gwp gwpVar = (gwp) nwpVar.S1.get();
        em0 em0Var = nwpVar.a;
        daq daqVar = (daq) em0Var.b;
        d1x d1xVarK = daqVar.a.k();
        tjq tjqVar = new tjq((z1x) nwpVar.A1.get(), nwpVar.k(), dwpVar, gwpVar, f42.u((qxo) daqVar.a.a.kb.get()), d1xVarK);
        gw70 gw70VarA0 = em0Var.a0();
        c8o.l(gw70VarA0);
        return new q2x(tjqVar, new lud0(new vi11(gw70VarA0, (d0r) ((jly0) this.d).get(), new uym0(f2u0.j((Flowable) ((jly0) this.e).get()), (Flowable) ((jly0) this.h).get(), ((Flowable) ((jly0) this.e).get()).j(mo9.O0), (w9u0) ((jly0) this.i).get(), (d0r) ((jly0) this.d).get()), new et90(new xu4(false, (luk) nwpVar.g.get()), f2u0.f((Flowable) ((jly0) this.e).get()), (cbv) nwpVar.P.get()), nwpVar.e(), (byte) 14), (byte) 2), (rup) ((jly0) this.t).get());
    }

    public vu4 d() {
        switch (this.a) {
            case 25:
                luk lukVar = (luk) ((j3q) this.b).b.L1.get();
                c8o.l(lukVar);
                return new vu4(false, false, false, lukVar);
            case 26:
                luk lukVarA = ((j3q) this.b).a();
                c8o.l(lukVarA);
                return new vu4(false, false, false, lukVarA);
            default:
                return new vu4(false, false, false, (luk) ((nwp) this.c).g.get());
        }
    }

    public it8 e() {
        jo9 jo9Var = (jo9) this.c;
        uvy uvyVar = (uvy) jo9Var.f.get();
        c8o.l(uvyVar);
        uu00 uu00Var = (uu00) jo9Var.g.get();
        c8o.l(uu00Var);
        return new it8(uvyVar, new zo8(uu00Var), (byte) 6);
    }

    public soa f() {
        qma qmaVar;
        o2p o2pVar;
        q2p q2pVar = (q2p) this.c;
        Context context = q2pVar.a;
        l270 l270Var = (l270) ((jly0) this.d).get();
        yqu0 yqu0Var = q2pVar.c;
        g06 g06Var = q2pVar.d;
        yqg yqgVar = q2pVar.e;
        Handler handler = new Handler(Looper.getMainLooper());
        ubu0 ubu0Var = (ubu0) ((jly0) this.e).get();
        zwz0 zwz0Var = q2pVar.g;
        q8n q8nVar = q2pVar.h;
        d0u0 nnaVar = new nna(ubu0Var, zwz0Var, q8nVar, yqgVar, context);
        d0u0 ooaVar = new ooa(q2pVar.f, zwz0Var, q2pVar.i, new kba(q2pVar.j, (byte) 1), q8nVar);
        d0u0 d0u0Var = (goa) ((jly0) this.f).get();
        ArrayList arrayList = q2pVar.k;
        a0b a0bVar = new a0b((byte) 10);
        cnh0 cnh0Var = q2pVar.l;
        qma qmaVar2 = (qma) this.b;
        q8n q8nVar2 = q2pVar.m;
        i5w0 i5w0Var = q2pVar.n;
        i5w0 i5w0Var2 = q2pVar.o;
        spq0 spq0Var = q2pVar.p;
        d0u0 d0u0Var2 = nnaVar;
        um51 um51Var = (um51) ((jly0) this.h).get();
        o2p o2pVar2 = (o2p) ((jly0) this.t).get();
        epa epaVar = new epa();
        d0u0 s3u0Var = new s3u0();
        i5w0 i5w0Var3 = q2pVar.r;
        o5n o5nVar = q2pVar.s;
        tdj1 tdj1Var = q2pVar.t;
        cuw cuwVar = q2pVar.u;
        if (!qmaVar2.u1) {
            d0u0Var2 = null;
        }
        if (!qmaVar2.X0) {
            epaVar = null;
        }
        ArrayList arrayListN0 = o7h.N0(f46.i0(new d0u0[]{ooaVar, d0u0Var, d0u0Var2, epaVar, s3u0Var}), arrayList);
        boolean z = qmaVar2.R0;
        um51 um51Var2 = z ? um51Var : null;
        if (z) {
            qmaVar = qmaVar2;
            o2pVar = o2pVar2;
        } else {
            qmaVar = qmaVar2;
            o2pVar = null;
        }
        soa soaVar = new soa(context, (l270) 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x010b: CONSTRUCTOR (r2v9 'soaVar' p.soa) = 
              (r3v0 'context' android.content.Context)
              (wrap p.l270:?: CAST (p.l270) (r11v0 ?? I:??[OBJECT, ARRAY]))
              (r9v0 'yqu0Var' p.yqu0)
              (r10v0 'g06Var' p.g06)
              (r6v0 'yqgVar' p.yqg)
              (r8v2 'handler' android.os.Handler)
              (r0v13 'arrayListN0' java.util.ArrayList)
              (r10v1 'a0bVar' p.a0b)
              (r11v2 'qmaVar' p.qma)
              (r12v1 'q8nVar2' p.q8n)
              (r13v2 'i5w0Var' p.i5w0)
              (r14v5 'i5w0Var2' p.i5w0)
              (r4v6 'spq0Var' p.spq0)
              (r16v4 'um51Var2' p.um51)
              (r17v2 'o2pVar' p.o2p)
              (r0v5 'i5w0Var3' p.i5w0)
              (r5v0 'q8nVar' p.q8n)
              (r0v6 'o5nVar' p.o5n)
              (r0v7 'tdj1Var' p.tdj1)
              (r1v2 'cuwVar' p.cuw)
             A[DECLARE_VAR] (LINE:268) call: p.soa.<init>(android.content.Context, p.l270, p.yqu0, p.g06, p.yqg, android.os.Handler, java.util.ArrayList, p.a0b, p.qma, p.q8n, p.i5w0, p.i5w0, p.spq0, p.um51, p.o2p, p.i5w0, p.q8n, p.o5n, p.tdj1, p.cuw):void type: CONSTRUCTOR in method: p.c21.f():p.soa, file: /workspace/spotify-analysis/dex-input/classes8.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            */
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c21.f():p.soa");
    }

    public void g(u1i u1iVar, int i, Object obj) {
        if (obj == null) {
            obj = ((ArrayList) this.f).get(i);
        }
        Object obj2 = obj;
        t1i t1iVar = (t1i) ((LinkedHashMap) this.d).get(rc11.a.b(obj2.getClass()));
        switch (u1iVar.U0) {
            case 0:
                qzh qzhVar = (qzh) u1iVar.V0;
                if (t1iVar != null) {
                    t1iVar.l(new s1i(qzhVar, i, obj2));
                } else {
                    qzhVar.f(obj2);
                }
                qzhVar.n(new qf8(t1iVar, u1iVar, qzhVar, i, obj2));
                break;
            default:
                ((w1i) u1iVar.V0).b(obj2, (v1i) u1iVar.W0);
                break;
        }
    }

    public void h() {
        xab1 xab1Var = (xab1) this.g;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.g = null;
        xab1 xab1Var2 = (xab1) this.h;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.h = null;
        this.f = z6x.a;
        this.i = null;
        this.t = null;
    }

    public v51 i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        gid gidVar = (gid) this.b;
        g1f0 g1f0Var = (g1f0) this.c;
        return new v51(layoutInflater, viewGroup, gidVar, g1f0Var.N(), g1f0Var.L(), g1f0Var.H(), g1f0Var.z(), (i8h1) this.d, (qhe0) this.e, (vzl0) this.f, (wdl0) this.g, (zdl0) this.h, (xzl0) this.i, (yzl0) this.t);
    }

    public u1i j(int i, ViewGroup viewGroup, bkl bklVar) {
        qsw0 qsw0Var = (qsw0) ((Map) this.g).get(Integer.valueOf(i));
        if (qsw0Var == null) {
            w1i w1iVar = (w1i) ((Map) this.i).get(Integer.valueOf(i));
            if (w1iVar == null) {
                w1iVar = (w1i) ((LinkedHashMap) this.t).get(Integer.valueOf(i));
            }
            w1iVar.getClass();
            v1i v1iVarA = w1iVar.a(viewGroup);
            int i2 = u1i.X0;
            return new u1i(w1iVar, v1iVarA);
        }
        qzh qzhVar = (qzh) qsw0Var.get();
        t1i t1iVar = (t1i) ((Map) this.h).get(Integer.valueOf(i));
        if (t1iVar != null) {
            qzhVar.getClass();
            t1iVar.e(new q1i(qzhVar, viewGroup));
        }
        int i3 = u1i.X0;
        qzhVar.getClass();
        return new u1i(qzhVar, bklVar);
    }

    public lo9 k() {
        luk lukVarD = ((nzp) this.d).d();
        c8o.l(lukVarD);
        return new lo9(lukVarD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r0.equals("NotificationSubscriptionFailed") == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p.xvd0 l() {
        /*
            r3 = this;
            java.lang.Object r3 = r3.c
            p.bwd0 r3 = (p.bwd0) r3
            java.lang.String r0 = r3.a
            int r1 = r0.hashCode()
            p.nvd0 r2 = p.nvd0.a
            switch(r1) {
                case -1887987046: goto L8c;
                case -1864447404: goto L80;
                case -1310470997: goto L74;
                case -828977418: goto L68;
                case -140465314: goto L5c;
                case 257689922: goto L56;
                case 500827739: goto L4a;
                case 570317861: goto L3e;
                case 1266553263: goto L2b;
                case 1573139704: goto L1e;
                case 1937503882: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L94
        L11:
            java.lang.String r3 = "RoomNotFound"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L1b
            goto L94
        L1b:
            p.uvd0 r3 = p.uvd0.a
            return r3
        L1e:
            java.lang.String r3 = "RsvpFailed"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L28
            goto L94
        L28:
            p.vvd0 r3 = p.vvd0.a
            return r3
        L2b:
            java.lang.String r1 = "UpcomingPartyNotificationSubscriptionFailed"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L34
            goto L94
        L34:
            java.lang.String r3 = r3.c
            if (r3 == 0) goto L47
            p.wvd0 r0 = new p.wvd0
            r0.<init>(r3)
            return r0
        L3e:
            java.lang.String r3 = "NotificationSubscriptionFailed"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L47
            goto L94
        L47:
            p.pvd0 r3 = p.pvd0.a
            return r3
        L4a:
            java.lang.String r3 = "RoomHasEnded"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L53
            goto L94
        L53:
            p.svd0 r3 = p.svd0.a
            return r3
        L56:
            java.lang.String r3 = "ConnectivityIssue"
            r0.equals(r3)
            return r2
        L5c:
            java.lang.String r3 = "PlaybackIssue"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L65
            goto L94
        L65:
            p.qvd0 r3 = p.qvd0.a
            return r3
        L68:
            java.lang.String r3 = "PremiumRequired"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L71
            goto L94
        L71:
            p.rvd0 r3 = p.rvd0.a
            return r3
        L74:
            java.lang.String r3 = "RoomNotAvailableInLocation"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L7d
            goto L94
        L7d:
            p.tvd0 r3 = p.tvd0.a
            return r3
        L80:
            java.lang.String r3 = "Explicit"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L89
            goto L94
        L89:
            p.ovd0 r3 = p.ovd0.a
            return r3
        L8c:
            java.lang.String r3 = "AgeRestricted"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L95
        L94:
            return r2
        L95:
            p.mvd0 r3 = p.mvd0.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c21.l():p.xvd0");
    }

    public void m() {
        ((vku) this.t).c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, onm onmVar) throws Throwable {
        hz1 hz1Var;
        uio m231Var;
        if (onmVar instanceof hz1) {
            hz1Var = (hz1) onmVar;
            int i = hz1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hz1Var.d = i - Integer.MIN_VALUE;
            } else {
                hz1Var = new hz1(this, onmVar);
            }
        } else {
            hz1Var = new hz1(this, onmVar);
        }
        Object objJ = hz1Var.b;
        int i2 = hz1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleFirstOrError = ((uu00) this.e).b(new oi("add_to_your_episodes_action", false, new v1(str, (byte) 16))).filter(p9w.e).firstOrError();
                hz1Var.a = str;
                hz1Var.d = 1;
                objJ = fc11.j(singleFirstOrError, hz1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = hz1Var.a;
                hm5.M(objJ);
            }
            m231Var = (uio) ((uv00) objJ).a(uio.class, str).b;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pnn o() {
        return new pnn(2131954659, f46.i0(new enn[]{0, ((kly0) this.g).get(), 0}));
    }

    public int p(int i) {
        tka0 tka0VarB = rc11.a.b(((ArrayList) this.f).get(i).getClass());
        if (((qsw0) ((LinkedHashMap) this.c).get(tka0VarB)) != null) {
            return tka0VarB.hashCode();
        }
        if (((w1i) ((LinkedHashMap) this.e).get(tka0VarB)) != null) {
            return tka0VarB.hashCode();
        }
        throw new ComponentRecyclerAdapter$NoComponentProducerFound("No Producer<AnyComponent> or ComponentViewWrapper<AnyModel> instance for " + tka0VarB + " supplied.");
    }

    public pnn q() {
        return new pnn(2131954661, p7h.M(new enn[]{(q9b) this.e, (c0b) this.c, (zxg) this.t, (avj0) this.h, (b23) this.f, (o3y0) this.i}));
    }

    public boolean r() {
        uuf0 uuf0Var = (uuf0) this.b;
        luk lukVar = (luk) uuf0Var.k.get();
        c8o.l(lukVar);
        return td70.b(new qm4(false, lukVar), ((Boolean) uuf0Var.s.get()).booleanValue());
    }

    public byp s() {
        uuf0 uuf0Var = (uuf0) this.b;
        Resources resources = (Resources) uuf0Var.c.get();
        c8o.l(resources);
        dxz0 dxz0Var = (dxz0) uuf0Var.d.get();
        c8o.l(dxz0Var);
        return new byp(resources, dxz0Var);
    }

    public yok0 t() {
        n6r0 n6r0VarP = kmq0.p((b4p0) ((j3q) this.b).d.b);
        r6h1 r6h1Var = r6h1.c;
        return new yok0(n6r0VarP.path(), nik1.n1.a, (byte) 17);
    }

    public fdc u() {
        awd0 awd0Var = (awd0) this.b;
        gj5 gj5Var = (gj5) awd0Var.a.get();
        c8o.l(gj5Var);
        lzn0 lzn0Var = (lzn0) awd0Var.d.get();
        c8o.l(lzn0Var);
        a1r0 a1r0Var = (a1r0) awd0Var.e.get();
        c8o.l(a1r0Var);
        return new fdc(gj5Var, lzn0Var, a1r0Var, (bwd0) this.c, (byte) 22);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r8.collect(r9, r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object v(java.lang.String r8, p.qev r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.vm9
            if (r0 == 0) goto L13
            r0 = r10
            p.vm9 r0 = (p.vm9) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.vm9 r0 = new p.vm9
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            p.c21 r7 = r0.b
            p.mr20 r7 = (p.mr20) r7
            p.hm5.M(r10)
            goto L94
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L35:
            p.c21 r8 = r0.b
            p.qev r9 = r0.a
            p.hm5.M(r10)
            goto L56
        L3d:
            p.hm5.M(r10)
            boolean r10 = r9.d
            if (r10 == 0) goto L59
            java.lang.Object r10 = r7.b
            p.ymm0 r10 = (p.ymm0) r10
            r0.a = r9
            r0.b = r7
            r0.e = r3
            java.io.Serializable r10 = r10.c(r8, r0)
            if (r10 != r5) goto L55
            goto L93
        L55:
            r8 = r7
        L56:
            java.util.List r10 = (java.util.List) r10
            goto L5c
        L59:
            p.z6x r10 = p.z6x.a
            r8 = r7
        L5c:
            r8.f = r10
            p.xe01 r8 = r9.a
            p.xe01 r10 = r9.b
            p.xe01 r1 = r9.c
            p.wm9 r6 = p.wm9.h
            p.evz r8 = p.h5p1.s(r8, r10, r1, r6)
            java.lang.Object r10 = r7.e
            p.ik r10 = (p.ik) r10
            p.vd0 r1 = new p.vd0
            r6 = 13
            r1.<init>(r10, r7, r9, r6)
            p.mr20[] r9 = new p.mr20[r2]
            r10 = 0
            r9[r10] = r8
            r9[r3] = r1
            p.kge r8 = p.hu20.d(r9)
            p.hb0 r9 = new p.hb0
            r10 = 20
            r9.<init>(r7, r10)
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r7 = r8.collect(r9, r0)
            if (r7 != r5) goto L94
        L93:
            return r5
        L94:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c21.v(java.lang.String, p.qev, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object w(String str, onm onmVar) {
        iz1 iz1Var;
        xrm1 xrm1Var = (xrm1) this.c;
        if (onmVar instanceof iz1) {
            iz1Var = (iz1) onmVar;
            int i = iz1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                iz1Var.d = i - Integer.MIN_VALUE;
            } else {
                iz1Var = new iz1(this, onmVar);
            }
        } else {
            iz1Var = new iz1(this, onmVar);
        }
        Object objN = iz1Var.b;
        int i2 = iz1Var.d;
        String str2 = "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt";
        if (i2 == 0) {
            hm5.M(objN);
            if (!((vlo) this.d).a(str)) {
                xrm1Var.getClass();
                return new fz1("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", str);
            }
            iz1Var.a = str;
            iz1Var.d = 1;
            objN = n(str, iz1Var);
            Object obj = d9n.a;
            if (objN == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = iz1Var.a;
            hm5.M(objN);
        }
        uio uioVar = (uio) objN;
        if (uioVar == null) {
            xrm1Var.getClass();
            return new fz1("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", str);
        }
        String str3 = uioVar.a;
        if (str3.length() != 0) {
            str = str3;
        }
        rio rioVar = uioVar.b;
        if (rioVar instanceof rio) {
            str2 = rioVar.c;
        } else {
            xrm1Var.getClass();
        }
        return new fz1(str2, str);
    }

    public void x(lp9 lp9Var) {
        Long lValueOf;
        Long lValueOf2;
        qev qevVar;
        jp9 jp9Var = lp9Var instanceof jp9 ? (jp9) lp9Var : null;
        if (jp9Var != null && jp9Var.e > 0.0f) {
            long jA = jp9Var.a(((yqg) this.d).b());
            List<pq9> list = (List) this.f;
            ArrayList arrayList = new ArrayList();
            for (pq9 pq9Var : list) {
                r7h.W(p7h.M(new Long[]{Long.valueOf(pq9Var.a), Long.valueOf(pq9Var.b)}), arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Number) obj).longValue() > jA) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                lValueOf = Long.valueOf(((Number) it.next()).longValue() - jA);
                while (it.hasNext()) {
                    Long lValueOf3 = Long.valueOf(((Number) it.next()).longValue() - jA);
                    if (lValueOf.compareTo(lValueOf3) > 0) {
                        lValueOf = lValueOf3;
                    }
                }
            } else {
                lValueOf = null;
            }
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                if (jLongValue < 10) {
                    jLongValue = 10;
                }
                lValueOf2 = Long.valueOf(jLongValue);
            } else {
                lValueOf2 = null;
            }
            if (lValueOf2 != null) {
                long jLongValue2 = lValueOf2.longValue();
                llm llmVar = (llm) this.i;
                if (llmVar == null || (qevVar = (qev) this.t) == null) {
                    return;
                }
                this.h = fn31.T(llmVar, (o8n) null, 0, new wn2(jLongValue2, qevVar, this, (lnm) null, (byte) 3), 3);
            }
        }
    }

    public void y() {
        qev qevVar = (qev) this.t;
        float fFloatValue = qevVar != null ? ((Number) qevVar.b.a.getValue()).floatValue() : 1.0f;
        h();
        b8p1 b8p1Var = (b8p1) this.c;
        if (b8p1Var.b == 2) {
            ((wt7) b8p1Var.c).b(vt7.b, 0, fFloatValue);
            b8p1Var.b = 1;
        }
    }

    public /* synthetic */ c21(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
    }

    public c21(Flowable flowable, dy4 dy4Var, b7r0 b7r0Var, yqg yqgVar, z281 z281Var, Scheduler scheduler, PlayOrigin playOrigin, ruz ruzVar, muz muzVar) {
        this.a = (byte) 10;
        this.b = flowable;
        this.c = dy4Var;
        this.d = b7r0Var;
        this.e = yqgVar;
        this.f = z281Var;
        this.g = playOrigin;
        this.h = ruzVar;
        this.i = muzVar;
        this.t = new mp8(scheduler, (byte) 27);
    }

    public c21(mq90 mq90Var, c0b c0bVar, l891 l891Var, r7q r7qVar, q9b q9bVar, b23 b23Var, r7q r7qVar2, r7q r7qVar3, avj0 avj0Var, o3y0 o3y0Var, zxg zxgVar) {
        this.a = (byte) 11;
        this.b = mq90Var;
        this.c = c0bVar;
        this.d = l891Var;
        this.e = q9bVar;
        this.f = b23Var;
        this.g = r7qVar3;
        this.h = avj0Var;
        this.i = o3y0Var;
        this.t = zxgVar;
    }

    public c21(iyc0 iyc0Var, xrm1 xrm1Var, vlo vloVar, uu00 uu00Var, rb00 rb00Var, l0x0 l0x0Var, rvy0 rvy0Var, q8n q8nVar) {
        this.a = (byte) 1;
        this.b = iyc0Var;
        this.c = xrm1Var;
        this.d = vloVar;
        this.e = uu00Var;
        this.f = rb00Var;
        this.g = l0x0Var;
        this.h = rvy0Var;
        this.i = q8nVar;
        this.t = new vku();
    }

    public c21(ymm0 ymm0Var, b8p1 b8p1Var, yqg yqgVar, ik ikVar) {
        this.a = (byte) 5;
        this.b = ymm0Var;
        this.c = b8p1Var;
        this.d = yqgVar;
        this.e = ikVar;
        this.f = z6x.a;
    }

    public c21(wum0 wum0Var, xum0 xum0Var, q7r0 q7r0Var) {
        this.a = (byte) 27;
        this.b = wum0Var;
        this.c = xum0Var;
        this.d = q7r0Var;
        this.e = xqu.b(new bsp(this, 0, (byte) 14));
        this.f = new bsp(this, 3, (byte) 14);
        this.g = new bsp(this, 2, (byte) 14);
        this.h = new bsp(this, 1, (byte) 14);
        this.i = new bsp(this, 5, (byte) 14);
        this.t = new bsp(this, 4, (byte) 14);
    }

    public c21(qo8 qo8Var, to8 to8Var, q7r0 q7r0Var) {
        this.a = (byte) 13;
        this.b = qo8Var;
        this.c = to8Var;
        this.d = q7r0Var;
        this.e = xqu.b(new b2p(this, 0, (byte) 1));
        this.f = iy81.a(new b2p(this, 1, (byte) 1));
        this.g = iy81.a(new b2p(this, 2, (byte) 1));
        this.h = xqu.b(new b2p(this, 3, (byte) 1));
        this.i = xqu.b(new b2p(this, 4, (byte) 1));
        this.t = xqu.b(new b2p(this, 5, (byte) 1));
    }

    public c21(i7d i7dVar) {
        this.a = (byte) 16;
        this.b = i7dVar;
        this.c = iy81.a(new lbp(this, 0, (byte) 1));
        this.d = iy81.a(new lbp(this, 1, (byte) 1));
        this.e = iy81.a(new lbp(this, 2, (byte) 1));
        this.f = iy81.a(new lbp(this, 3, (byte) 1));
        this.g = iy81.a(new lbp(this, 4, (byte) 1));
        this.h = iy81.a(new lbp(this, 5, (byte) 1));
        this.i = iy81.a(new lbp(this, 6, (byte) 1));
        this.t = iy81.a(new lbp(this, 7, (byte) 1));
    }

    public c21(puy puyVar, ivj ivjVar, ruy ruyVar, q7r0 q7r0Var) {
        this.a = (byte) 18;
        this.b = ruyVar;
        this.c = q7r0Var;
        this.d = puyVar;
        this.e = xqu.b(new lbp(this, 1, (byte) 20));
        this.f = xqu.b(new lbp(this, 0, (byte) 20));
        this.g = iy81.a(new lbp(this, 3, (byte) 20));
        this.h = iy81.a(new lbp(this, 4, (byte) 20));
        this.i = new lbp(this, 2, (byte) 20);
        this.t = xqu.b(new lbp(this, 5, (byte) 20));
    }

    public c21(lvd0 lvd0Var, kvd0 kvd0Var) {
        this.a = (byte) 21;
        this.b = lvd0Var;
        this.c = kvd0Var;
        this.d = xqu.b(new blp(this, 0, (byte) 11));
        this.e = new blp(this, 2, (byte) 11);
        this.f = new blp(this, 1, (byte) 11);
        this.g = xqu.b(new blp(this, 4, (byte) 11));
        this.h = new blp(this, 3, (byte) 11);
        this.i = new blp(this, 5, (byte) 11);
        this.t = new blp(this, 6, (byte) 11);
    }

    public c21(nsy nsyVar, ivj ivjVar, ruy ruyVar, q7r0 q7r0Var) {
        this.a = (byte) 17;
        this.b = ruyVar;
        this.c = nsyVar;
        this.d = q7r0Var;
        this.e = xqu.b(new lbp(this, 1, (byte) 18));
        this.f = xqu.b(new lbp(this, 0, (byte) 18));
        this.g = iy81.a(new lbp(this, 3, (byte) 18));
        this.h = iy81.a(new lbp(this, 4, (byte) 18));
        this.i = new lbp(this, 2, (byte) 18);
        this.t = xqu.b(new lbp(this, 5, (byte) 18));
    }

    public c21(z9n0 z9n0Var, ean0 ean0Var, q7r0 q7r0Var) {
        this.a = (byte) 28;
        this.b = z9n0Var;
        this.c = q7r0Var;
        this.d = xqu.b(new bsp(this, 0, (byte) 17));
        this.e = new bsp(this, 1, (byte) 17);
        this.f = new bsp(this, 2, (byte) 17);
        this.g = new bsp(this, 4, (byte) 17);
        this.h = iy81.a(new bsp(this, 3, (byte) 17));
        this.i = iy81.a(new bsp(this, 5, (byte) 17));
        this.t = new bsp(this, 6, (byte) 17);
    }

    public c21(j3q j3qVar) {
        this.a = (byte) 25;
        this.b = j3qVar;
        this.c = xqu.b(new bsp(this, 1, (byte) 2));
        this.d = xqu.b(new bsp(this, 0, (byte) 2));
        this.e = iy81.a(new bsp(this, 3, (byte) 2));
        this.f = iy81.a(new bsp(this, 4, (byte) 2));
        this.g = iy81.a(new bsp(this, 2, (byte) 2));
        this.h = xqu.b(new bsp(this, 5, (byte) 2));
        this.i = new bsp(this, 6, (byte) 2);
        this.t = iy81.a(new bsp(this, 7, (byte) 2));
    }

    public c21(i9g0 i9g0Var, zuj zujVar, k9g0 k9g0Var, q7r0 q7r0Var) {
        this.a = (byte) 24;
        this.b = i9g0Var;
        this.c = q7r0Var;
        this.d = k9g0Var;
        this.e = new blp(this, 0, (byte) 23);
        this.f = iy81.a(new blp(this, 1, (byte) 23));
        this.g = xqu.b(new blp(this, 3, (byte) 23));
        this.h = new blp(this, 2, (byte) 23);
        this.i = iy81.a(new blp(this, 4, (byte) 23));
        this.t = xqu.b(new blp(this, 5, (byte) 23));
    }

    public c21(awd0 awd0Var, bwd0 bwd0Var, q7r0 q7r0Var) {
        this.a = (byte) 22;
        this.b = awd0Var;
        this.c = bwd0Var;
        this.d = q7r0Var;
        this.e = new blp(this, 1, (byte) 12);
        this.f = new blp(this, 0, (byte) 12);
        this.g = xqu.b(new blp(this, 3, (byte) 12));
        this.h = new blp(this, 2, (byte) 12);
        this.i = new blp(this, 4, (byte) 12);
        this.t = new blp(this, 5, (byte) 12);
    }

    public c21(nzp nzpVar, qop qopVar, fl90 fl90Var) {
        this.a = (byte) 19;
        this.b = fl90Var;
        this.c = qopVar;
        this.d = nzpVar;
        this.e = iy81.a(new lbp(this, 0, (byte) 24));
        this.f = iy81.a(new lbp(this, 1, (byte) 24));
        this.g = iy81.a(new lbp(this, 2, (byte) 24));
        this.h = new lbp(this, 4, (byte) 24);
        this.i = iy81.a(new lbp(this, 3, (byte) 24));
        this.t = iy81.a(new lbp(this, 5, (byte) 24));
    }

    public c21(k0q k0qVar, qop qopVar, bct bctVar) {
        this.a = (byte) 20;
        this.b = qopVar;
        this.c = bctVar;
        this.d = k0qVar;
        this.e = iy81.a(new chp(this, 1, (byte) 0));
        this.f = iy81.a(new chp(this, 2, (byte) 0));
        this.g = iy81.a(new chp(this, 3, (byte) 0));
        this.h = iy81.a(new chp(this, 4, (byte) 0));
        this.i = iy81.a(new chp(this, 0, (byte) 0));
        this.t = new chp(this, 5, (byte) 0);
    }

    public c21(j3q j3qVar, byte b) {
        this.a = (byte) 26;
        this.b = j3qVar;
        this.c = xqu.b(new bsp(this, 1, (byte) 5));
        this.d = xqu.b(new bsp(this, 0, (byte) 5));
        this.e = iy81.a(new bsp(this, 3, (byte) 5));
        this.f = iy81.a(new bsp(this, 4, (byte) 5));
        this.g = iy81.a(new bsp(this, 2, (byte) 5));
        this.h = xqu.b(new bsp(this, 5, (byte) 5));
        this.i = new bsp(this, 6, (byte) 5);
        this.t = iy81.a(new bsp(this, 7, (byte) 5));
    }

    public c21(jo9 jo9Var, ryj ryjVar, q7r0 q7r0Var) {
        this.a = (byte) 14;
        this.b = ryjVar;
        this.c = jo9Var;
        this.d = q7r0Var;
        this.e = xqu.b(new b2p(this, 1, (byte) 4));
        this.f = xqu.b(new b2p(this, 2, (byte) 4));
        this.g = iy81.a(new b2p(this, 0, (byte) 4));
        this.h = xqu.b(new b2p(this, 3, (byte) 4));
        this.i = xqu.b(new b2p(this, 4, (byte) 4));
        this.t = xqu.b(new b2p(this, 5, (byte) 4));
    }

    public c21(uuf0 uuf0Var) {
        this.a = (byte) 23;
        this.b = uuf0Var;
        this.c = xqu.b(new blp(this, 4, (byte) 19));
        this.d = xqu.b(new blp(this, 3, (byte) 19));
        this.e = xqu.b(new blp(this, 5, (byte) 19));
        this.f = xqu.b(new blp(this, 2, (byte) 19));
        this.g = xqu.b(new blp(this, 1, (byte) 19));
        this.h = xqu.b(new blp(this, 6, (byte) 19));
        this.i = xqu.b(new blp(this, 7, (byte) 19));
        this.t = xqu.b(new blp(this, 0, (byte) 19));
    }

    public c21(q2p q2pVar, qma qmaVar) {
        this.a = (byte) 15;
        this.c = q2pVar;
        this.b = qmaVar;
        this.d = xqu.b(new p2p(q2pVar, this, 0, (byte) 0));
        this.e = xqu.b(new p2p(q2pVar, this, 1, (byte) 0));
        this.f = iy81.a(new p2p(q2pVar, this, 2, (byte) 0));
        this.g = xqu.b(new p2p(q2pVar, this, 4, (byte) 0));
        this.h = iy81.a(new p2p(q2pVar, this, 3, (byte) 0));
        this.i = xqu.b(new p2p(q2pVar, this, 6, (byte) 0));
        this.t = iy81.a(new p2p(q2pVar, this, 5, (byte) 0));
    }

    public c21(nwp nwpVar, q2p0 q2p0Var) {
        this.a = (byte) 29;
        this.c = nwpVar;
        this.b = q2p0Var;
        this.d = iy81.a(new p2p(nwpVar, this, 0, (byte) 3));
        this.e = iy81.a(new p2p(nwpVar, this, 1, (byte) 3));
        this.f = iy81.a(new p2p(nwpVar, this, 3, (byte) 3));
        this.g = iy81.a(new p2p(nwpVar, this, 4, (byte) 3));
        this.h = iy81.a(new p2p(nwpVar, this, 2, (byte) 3));
        this.i = iy81.a(new p2p(nwpVar, this, 5, (byte) 3));
        this.t = iy81.a(new p2p(nwpVar, this, 6, (byte) 3));
    }
}
