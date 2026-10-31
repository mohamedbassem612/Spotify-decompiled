package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.animation.core.MutationInterruptedException;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.betamax.player.VideoSurfaceView;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xd1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(kl1 kl1Var, gcy gcyVar, String str, gcy gcyVar2, kdn0 kdn0Var, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.e = kl1Var;
        this.c = gcyVar;
        this.d = str;
        this.f = gcyVar2;
        this.g = kdn0Var;
        this.h = str2;
    }

    private final Object e(Object obj) {
        s2t s2tVar;
        a9h a9hVarA;
        a9h a9hVar;
        ang1 ang1Var = (ang1) this.g;
        lnf0 lnf0Var = (lnf0) this.f;
        c9n c9nVar = (c9n) this.c;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            s2t s2tVarQ = ((qg4) lnf0Var.g.get()).b() ? fn31.q(c9nVar, (o8n) null, 0, new jnf0(lnf0Var, ang1Var, (dhf0) this.h, (lnm) null, (byte) 1), 3) : null;
            this.c = null;
            this.d = s2tVarQ;
            this.b = (byte) 1;
            Object objA = lnf0Var.a(ang1Var, this);
            if (objA != d9nVar) {
                s2tVar = s2tVarQ;
                obj = objA;
            }
            return d9nVar;
        }
        if (b == 1) {
            s2tVar = (s2t) this.d;
            hm5.M(obj);
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a9hVar = (a9h) this.e;
            hm5.M(obj);
        }
        a9hVarA = a9h.a(a9hVar, (fef0) null, (bff0) obj, 1);
        lnf0Var.c.a.d(ang1Var.a, a9hVarA);
        return a9hVarA;
        a9hVarA = (a9h) obj;
        if (s2tVar != null) {
            this.c = null;
            this.d = null;
            this.e = a9hVarA;
            this.b = (byte) 2;
            Object objE = s2tVar.E(this);
            if (objE != d9nVar) {
                obj = objE;
                a9hVar = a9hVarA;
                a9hVarA = a9h.a(a9hVar, (fef0) null, (bff0) obj, 1);
            }
            return d9nVar;
        }
        lnf0Var.c.a.d(ang1Var.a, a9hVarA);
        return a9hVarA;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    /* JADX WARN: Code duplicated, block: B:46:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:62:0x0170  */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:66:0x019f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f9  */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x01f9, please report this as an issue */
    private final Object g(Object obj) {
        Object objP;
        String str;
        q1m q1mVar;
        String str2;
        String str3;
        Map map;
        String str4;
        Object objL;
        AbstractSet abstractSetAllOf;
        Object objJ;
        q1m q1mVar2;
        String str5;
        List<ba51> list;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str6;
        Uri uriBuild;
        Uri.Builder builderBuildUpon;
        nih0 nih0Var = (nih0) this.g;
        lih0 lih0Var = (lih0) this.h;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            String str7 = nih0Var.c;
            String str8 = nih0Var.a;
            String str9 = nih0Var.b;
            q1m q1mVar3 = nih0Var.f;
            wt20 wt20VarF = z4p1.F(new f8f0(lih0Var.c, (byte) 13), 1);
            this.d = str7;
            this.e = str8;
            this.c = str9;
            this.f = q1mVar3;
            this.b = (byte) 1;
            objP = b5p1.p(wt20VarF, this);
            if (objP != d9nVar) {
                str = str7;
                q1mVar = q1mVar3;
                str2 = str8;
                str3 = str9;
            }
            return d9nVar;
        }
        if (b == 1) {
            q1mVar = (q1m) this.f;
            str3 = (String) this.c;
            str2 = (String) this.e;
            str = (String) this.d;
            hm5.M(obj);
            objP = obj;
        } else {
            if (b == 2) {
                q1m q1mVar4 = (q1m) this.f;
                String str10 = (String) this.c;
                str4 = (String) this.e;
                String str11 = (String) this.d;
                hm5.M(obj);
                str = str11;
                str3 = str10;
                q1mVar = q1mVar4;
                objL = obj;
                map = (Map) objL;
                if (q1mVar != null) {
                    t45 t45Var = q1mVar.b;
                    t45.m(t45Var, "backend_call", 4);
                    t45Var.a("search_backend", fd21.f(1));
                }
                m710 m710Var = lih0Var.a;
                Bundle bundle = new Bundle();
                r8l r8lVar = lih0Var.b;
                if (str4 != null) {
                    str3 = str4;
                }
                m210 m210VarA = r8lVar.a(str3);
                if (map != null || y7y0.L(map)) {
                    abstractSetAllOf = EnumSet.allOf(l710.class);
                    abstractSetAllOf.getClass();
                } else {
                    abstractSetAllOf = dm61.u0(l710.a, EnumSet.allOf(l710.class));
                }
                Single singleA = m710Var.a(str, bundle, m210VarA, abstractSetAllOf);
                this.d = str;
                this.e = str4;
                this.c = null;
                this.f = q1mVar;
                this.b = (byte) 3;
                objJ = fc11.j(singleA, this);
                if (objJ != d9nVar) {
                    q1mVar2 = q1mVar;
                    str5 = str4;
                }
                return d9nVar;
            }
            if (b != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q1mVar2 = (q1m) this.f;
            str5 = (String) this.e;
            String str12 = (String) this.d;
            hm5.M(obj);
            str = str12;
            objJ = obj;
        }
        list = (List) objJ;
        if (q1mVar2 != null) {
            q1mVar2.b.g("backend_call");
        }
        if (list.isEmpty()) {
            n57.s("MBS: Partner API search returned empty results for query: " + str);
            eg.m(l1d.m("Partner API search returned empty results for query: ", str));
            return null;
        }
        arrayList = new ArrayList();
        for (ba51 ba51Var : list) {
            List<aa51> list2 = ba51Var.b;
            arrayList2 = new ArrayList(q7h.U(list2, 10));
            for (aa51 aa51Var : list2) {
                String str13 = ba51Var.a;
                String str14 = aa51Var.d;
                String str15 = aa51Var.a;
                String str16 = aa51Var.b;
                Uri uri = Uri.parse(aa51Var.c);
                Uri uri2 = Uri.parse(aa51Var.d);
                str6 = aa51Var.e;
                if (str6 != null) {
                    builderBuildUpon = Uri.parse(str6).buildUpon();
                    builderBuildUpon.appendQueryParameter("utm_medium", "search");
                    if (str5 != null) {
                        builderBuildUpon.appendQueryParameter("utm_campaign", str5);
                    }
                    uriBuild = builderBuildUpon.build();
                } else {
                    uriBuild = Uri.EMPTY;
                }
                arrayList2.add(new u310(str14, (String) null, str15, str16, uri, (Uri) null, (Uri) null, (Uri) null, (Uri) null, uri2, uriBuild, 1, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, aa51Var.f, (Integer) null, 0, (y310) null, str13, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -142609950, 15));
            }
            r7h.W(arrayList2, arrayList);
        }
        return arrayList;
        th61 th61Var = (th61) objP;
        if (!th61Var.b && !nih0Var.e) {
            eg.m("User is not logged in and unauth search is not allowed");
            return null;
        }
        if (str == null || str.length() == 0) {
            hhg1.n("Search query was null or empty");
            return null;
        }
        if (th61Var.b) {
            Observable observableTake = lih0Var.d.a.take(1L);
            this.d = str;
            this.e = str2;
            this.c = str3;
            this.f = q1mVar;
            this.b = (byte) 2;
            objL = fc11.l(observableTake, 4, (Object) null, this);
            if (objL != d9nVar) {
                str4 = str2;
                map = (Map) objL;
                if (q1mVar != null) {
                    t45 t45Var2 = q1mVar.b;
                    t45.m(t45Var2, "backend_call", 4);
                    t45Var2.a("search_backend", fd21.f(1));
                }
                m710 m710Var2 = lih0Var.a;
                Bundle bundle2 = new Bundle();
                r8l r8lVar2 = lih0Var.b;
                if (str4 != null) {
                    str3 = str4;
                }
                m210 m210VarA2 = r8lVar2.a(str3);
                if (map != null) {
                    abstractSetAllOf = EnumSet.allOf(l710.class);
                    abstractSetAllOf.getClass();
                } else {
                    abstractSetAllOf = EnumSet.allOf(l710.class);
                    abstractSetAllOf.getClass();
                }
                Single singleA2 = m710Var2.a(str, bundle2, m210VarA2, abstractSetAllOf);
                this.d = str;
                this.e = str4;
                this.c = null;
                this.f = q1mVar;
                this.b = (byte) 3;
                objJ = fc11.j(singleA2, this);
                if (objJ != d9nVar) {
                    q1mVar2 = q1mVar;
                    str5 = str4;
                    list = (List) objJ;
                    if (q1mVar2 != null) {
                        q1mVar2.b.g("backend_call");
                    }
                    if (list.isEmpty()) {
                        n57.s("MBS: Partner API search returned empty results for query: " + str);
                        eg.m(l1d.m("Partner API search returned empty results for query: ", str));
                        return null;
                    }
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        List<aa51> list3 = ba51Var.b;
                        arrayList2 = new ArrayList(q7h.U(list3, 10));
                        while (r4.hasNext()) {
                            String str17 = ba51Var.a;
                            String str18 = aa51Var.d;
                            String str19 = aa51Var.a;
                            String str110 = aa51Var.b;
                            Uri uri3 = Uri.parse(aa51Var.c);
                            Uri uri4 = Uri.parse(aa51Var.d);
                            str6 = aa51Var.e;
                            if (str6 != null) {
                                builderBuildUpon = Uri.parse(str6).buildUpon();
                                builderBuildUpon.appendQueryParameter("utm_medium", "search");
                                if (str5 != null) {
                                    builderBuildUpon.appendQueryParameter("utm_campaign", str5);
                                }
                                uriBuild = builderBuildUpon.build();
                            } else {
                                uriBuild = Uri.EMPTY;
                            }
                            arrayList2.add(new u310(str18, (String) null, str19, str110, uri3, (Uri) null, (Uri) null, (Uri) null, (Uri) null, uri4, uriBuild, 1, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, aa51Var.f, (Integer) null, 0, (y310) null, str17, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -142609950, 15));
                        }
                        r7h.W(arrayList2, arrayList);
                    }
                    return arrayList;
                }
            }
        } else {
            map = null;
            str4 = str2;
            if (q1mVar != null) {
                t45 t45Var3 = q1mVar.b;
                t45.m(t45Var3, "backend_call", 4);
                t45Var3.a("search_backend", fd21.f(1));
            }
            m710 m710Var3 = lih0Var.a;
            Bundle bundle3 = new Bundle();
            r8l r8lVar3 = lih0Var.b;
            if (str4 != null) {
                str3 = str4;
            }
            m210 m210VarA3 = r8lVar3.a(str3);
            if (map != null) {
                abstractSetAllOf = EnumSet.allOf(l710.class);
                abstractSetAllOf.getClass();
            } else {
                abstractSetAllOf = EnumSet.allOf(l710.class);
                abstractSetAllOf.getClass();
            }
            Single singleA3 = m710Var3.a(str, bundle3, m210VarA3, abstractSetAllOf);
            this.d = str;
            this.e = str4;
            this.c = null;
            this.f = q1mVar;
            this.b = (byte) 3;
            objJ = fc11.j(singleA3, this);
            if (objJ != d9nVar) {
                q1mVar2 = q1mVar;
                str5 = str4;
                list = (List) objJ;
                if (q1mVar2 != null) {
                    q1mVar2.b.g("backend_call");
                }
                if (list.isEmpty()) {
                    n57.s("MBS: Partner API search returned empty results for query: " + str);
                    eg.m(l1d.m("Partner API search returned empty results for query: ", str));
                    return null;
                }
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    List<aa51> list4 = ba51Var.b;
                    arrayList2 = new ArrayList(q7h.U(list4, 10));
                    while (r4.hasNext()) {
                        String str111 = ba51Var.a;
                        String str112 = aa51Var.d;
                        String str113 = aa51Var.a;
                        String str114 = aa51Var.b;
                        Uri uri5 = Uri.parse(aa51Var.c);
                        Uri uri6 = Uri.parse(aa51Var.d);
                        str6 = aa51Var.e;
                        if (str6 != null) {
                            builderBuildUpon = Uri.parse(str6).buildUpon();
                            builderBuildUpon.appendQueryParameter("utm_medium", "search");
                            if (str5 != null) {
                                builderBuildUpon.appendQueryParameter("utm_campaign", str5);
                            }
                            uriBuild = builderBuildUpon.build();
                        } else {
                            uriBuild = Uri.EMPTY;
                        }
                        arrayList2.add(new u310(str112, (String) null, str113, str114, uri5, (Uri) null, (Uri) null, (Uri) null, (Uri) null, uri6, uriBuild, 1, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, aa51Var.f, (Integer) null, 0, (y310) null, str111, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -142609950, 15));
                    }
                    r7h.W(arrayList2, arrayList);
                }
                return arrayList;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (p.l4p1.s(r1, r10, r9) == r6) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.g
            p.p8n0 r0 = (p.p8n0) r0
            java.lang.Object r1 = r9.c
            p.vr20 r1 = (p.vr20) r1
            byte r2 = r9.b
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L35
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1f
            java.lang.Object r9 = r9.e
            p.xgn0 r9 = (p.xgn0) r9
            p.wen0 r9 = (p.wen0) r9
            p.hm5.M(r10)
            goto L82
        L1f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r5
        L25:
            java.lang.Object r2 = r9.d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r7 = r9.f
            p.p8n0 r7 = (p.p8n0) r7
            java.lang.Object r8 = r9.e
            p.xgn0 r8 = (p.xgn0) r8
            p.hm5.M(r10)
            goto L51
        L35:
            p.hm5.M(r10)
            p.xgn0 r8 = r0.c
            java.lang.Object r10 = r9.h
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            r9.c = r1
            r9.e = r8
            r9.f = r0
            r9.d = r2
            r9.b = r4
            java.lang.Object r10 = r8.a(r9)
            if (r10 != r6) goto L50
            goto L81
        L50:
            r7 = r0
        L51:
            p.wen0 r10 = r7.f(r2)     // Catch: java.lang.Throwable -> L85
            r8.c(r5)
            p.ve01 r0 = r0.i
            p.tya r2 = new p.tya
            r7 = 8
            r2.<init>(r0, r5, r7)
            p.m441 r0 = new p.m441
            r0.<init>(r2)
            p.mr20[] r2 = new p.mr20[r3]
            r7 = 0
            r2[r7] = r10
            r2[r4] = r0
            p.kge r10 = p.hu20.d(r2)
            r9.c = r5
            r9.e = r5
            r9.f = r5
            r9.d = r5
            r9.b = r3
            java.lang.Object r9 = p.l4p1.s(r1, r10, r9)
            if (r9 != r6) goto L82
        L81:
            return r6
        L82:
            p.rih1 r9 = p.rih1.a
            return r9
        L85:
            r9 = move-exception
            r8.c(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xd1.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [byte, p.vgn0] */
    private final Object i(Object obj) {
        nfn0 nfn0Var;
        vgn0 vgn0Var;
        iu30 iu30Var;
        Throwable th;
        nfn0 nfn0Var2;
        vgn0 vgn0Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        qfn0 qfn0Var = (qfn0) this.g;
        ?? r1 = this.b;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (r1 == 0) {
                    hm5.M(obj);
                    faa0 faa0VarA = ((c9n) this.f).J().A(fkj0.W0);
                    faa0VarA.getClass();
                    nfn0Var = new nfn0(faa0VarA);
                    AtomicReference atomicReference3 = qfn0Var.a;
                    loop2: while (true) {
                        nfn0 nfn0Var3 = (nfn0) atomicReference3.get();
                        if (nfn0Var3 != null && l1d.c(1, 1) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(nfn0Var3, nfn0Var)) {
                                if (nfn0Var3 != null) {
                                    nfn0Var3.a.d(new MutationInterruptedException());
                                }
                                vgn0Var = qfn0Var.b;
                                iu30Var = (iu30) this.h;
                                this.f = nfn0Var;
                                this.d = vgn0Var;
                                this.c = iu30Var;
                                this.e = qfn0Var;
                                this.b = (byte) 1;
                                if (vgn0Var.a(this) != d9nVar) {
                                    break loop2;
                                }
                                return d9nVar;
                            }
                        } while (atomicReference3.get() == nfn0Var3);
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qfn0Var = (qfn0) this.c;
                        vgn0Var2 = (vgn0) this.d;
                        nfn0Var2 = (nfn0) this.f;
                        try {
                            hm5.M(obj);
                            atomicReference2 = qfn0Var.a;
                            while (!atomicReference2.compareAndSet(nfn0Var2, null) && atomicReference2.get() == nfn0Var2) {
                            }
                            vgn0Var2.c((Object) null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = qfn0Var.a;
                            while (!atomicReference.compareAndSet(nfn0Var2, null) && atomicReference.get() == nfn0Var2) {
                            }
                            throw th;
                        }
                    }
                    qfn0Var = (qfn0) this.e;
                    iu30 iu30Var2 = (iu30) this.c;
                    vgn0 vgn0Var3 = (vgn0) this.d;
                    nfn0 nfn0Var4 = (nfn0) this.f;
                    hm5.M(obj);
                    iu30Var = iu30Var2;
                    nfn0Var = nfn0Var4;
                    vgn0Var = vgn0Var3;
                }
                this.f = nfn0Var;
                this.d = vgn0Var;
                this.c = qfn0Var;
                this.e = null;
                this.b = (byte) 2;
                Object objInvoke = iu30Var.invoke(this);
                if (objInvoke != d9nVar) {
                    vgn0 vgn0Var4 = vgn0Var;
                    obj = objInvoke;
                    nfn0Var2 = nfn0Var;
                    vgn0Var2 = vgn0Var4;
                    atomicReference2 = qfn0Var.a;
                    while (!atomicReference2.compareAndSet(nfn0Var2, null)) {
                    }
                    vgn0Var2.c((Object) null);
                    return obj;
                }
                return d9nVar;
            } catch (Throwable th3) {
                th = th3;
                nfn0Var2 = nfn0Var;
                atomicReference = qfn0Var.a;
                while (!atomicReference.compareAndSet(nfn0Var2, null)) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.c((Object) null);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (r12 == r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.g
            p.p811 r0 = (p.p811) r0
            java.lang.Object r1 = r11.e
            p.p811 r1 = (p.p811) r1
            java.lang.Object r2 = r11.f
            p.u7o0 r2 = (p.u7o0) r2
            java.lang.String r3 = r2.a
            java.lang.Object r4 = r11.c
            p.i8o0 r4 = (p.i8o0) r4
            byte r5 = r11.b
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            p.d9n r10 = p.d9n.a
            if (r5 == 0) goto L32
            if (r5 == r8) goto L2a
            if (r5 != r7) goto L24
            p.hm5.M(r12)
            goto L8f
        L24:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r9
        L2a:
            java.lang.Object r5 = r11.d
            p.p811 r5 = (p.p811) r5
            p.hm5.M(r12)
            goto L4b
        L32:
            p.hm5.M(r12)
            java.lang.Object r12 = r1.a
            p.lf01 r12 = (p.lf01) r12
            java.lang.Object r5 = r0.a
            p.i8o0 r5 = (p.i8o0) r5
            r11.c = r4
            r11.d = r1
            r11.b = r8
            java.lang.Object r12 = r2.i(r12, r5, r4, r11)
            if (r12 != r10) goto L4a
            goto L8e
        L4a:
            r5 = r1
        L4b:
            r5.a = r12
            java.lang.Object r12 = r1.a
            if (r12 == 0) goto L7c
            p.lf01 r12 = (p.lf01) r12
            p.i8o0 r11 = r2.h(r12)
            r0.a = r11
            p.oka1 r11 = new p.oka1
            java.lang.Object r12 = r1.a
            r12.getClass()
            p.lf01 r12 = (p.lf01) r12
            p.j420 r12 = r2.g(r12)
            java.lang.Object r0 = r0.a
            p.i8o0 r0 = (p.i8o0) r0
            if (r0 == 0) goto L74
            p.w7o0 r0 = r0.d
            if (r0 == 0) goto L74
            java.lang.String r9 = r0.b()
        L74:
            java.lang.String r0 = p.u7o0.d(r3, r9)
            r11.<init>(r12, r0, r6)
            return r11
        L7c:
            p.ola1 r12 = r4.a()
            if (r12 == 0) goto Lb2
            r11.c = r4
            r11.d = r9
            r11.b = r7
            java.lang.Object r12 = p.bmq0.W(r12, r11)
            if (r12 != r10) goto L8f
        L8e:
            return r10
        L8f:
            p.nac r12 = (p.nac) r12
            long r0 = r12.b
            r7 = 0
            int r11 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r11 <= 0) goto Lb1
            p.oka1 r11 = new p.oka1
            p.i520 r0 = r2.c()
            p.qka1 r12 = p.jhc1.g(r12, r0)
            p.w7o0 r0 = r4.d
            java.lang.String r0 = r0.b()
            java.lang.String r0 = p.u7o0.d(r3, r0)
            r11.<init>(r12, r0, r6)
            return r11
        Lb1:
            return r9
        Lb2:
            java.lang.String r11 = "body == null"
            p.eg.m(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xd1.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x0025, B:33:0x00aa, B:37:0x00c1, B:39:0x00c9, B:16:0x003e, B:19:0x004e, B:32:0x00a6, B:22:0x005d, B:29:0x0094, B:25:0x0079), top: B:46:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
    
        if (r0.b(r14, r13) == r8) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v1, types: [p.faa0] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v6, types: [p.faa0] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00de -> B:10:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xd1.m(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) {
        s2t s2tVarQ;
        Object obj2;
        ArrayList arrayList = (ArrayList) this.h;
        ytp0 ytp0Var = (ytp0) this.f;
        c9n c9nVar = (c9n) this.e;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                s2tVarQ = (s2t) this.d;
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.c;
                hm5.M(obj);
            }
            return new mmr0(obj2, obj);
        }
        hm5.M(obj);
        s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new dvq0(ytp0Var, (wsc0) this.g, arrayList, (lnm) null, (byte) 28), 3);
        s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new f3t0(ytp0Var, arrayList, (lnm) null, (byte) 20), 3);
        this.e = null;
        this.d = s2tVarQ;
        this.b = (byte) 1;
        obj = s2tVarQ2.Q(this);
        if (obj != d9nVar) {
        }
        return d9nVar;
        this.e = null;
        this.d = null;
        this.c = obj;
        this.b = (byte) 2;
        Object objE = s2tVarQ.E(this);
        if (objE != d9nVar) {
            Object obj3 = obj;
            obj = objE;
            obj2 = obj3;
            return new mmr0(obj2, obj);
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (p.l4p1.q(r10, r1, r9) == r8) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.e
            r2 = r0
            p.iu30 r2 = (p.iu30) r2
            byte r0 = r9.b
            r5 = 0
            r7 = 2
            r1 = 1
            p.d9n r8 = p.d9n.a
            if (r0 == 0) goto L22
            if (r0 == r1) goto L1e
            if (r0 != r7) goto L17
            p.hm5.M(r10)
            goto L9f
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            r9 = 0
            return r9
        L1e:
            p.hm5.M(r10)
            goto L63
        L22:
            p.hm5.M(r10)
            java.lang.Object r10 = r9.d
            p.vuv0 r10 = (p.vuv0) r10
            p.uuv0 r0 = r10.m
            if (r0 == 0) goto L3a
            p.k760 r0 = r0.a
            p.i760 r3 = p.i760.a
            boolean r0 = r0.equals(r3)
            if (r0 != r1) goto L3a
            java.lang.String r10 = r10.g
            goto L3b
        L3a:
            r10 = r5
        L3b:
            if (r10 == 0) goto L9a
            boolean r10 = p.ihc1.y0(r10)
            if (r10 == 0) goto L44
            goto L9a
        L44:
            p.q2j0 r10 = new p.q2j0
            java.lang.Object r0 = r9.c
            p.ven0 r0 = (p.ven0) r0
            r3 = 26
            r10.<init>(r0, r3)
            p.m441 r10 = p.rwq.q(r10)
            p.any r0 = new p.any
            r3 = 18
            r0.<init>(r10, r3)
            r9.b = r1
            java.lang.Object r10 = p.b5p1.i(r0, r9)
            if (r10 != r8) goto L63
            goto L99
        L63:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L71
            p.u760 r9 = p.u760.d
            r2.invoke(r9)
            goto L9f
        L71:
            p.bu2 r10 = new p.bu2
            java.lang.Object r0 = r9.f
            p.tob1 r0 = (p.tob1) r0
            r1 = 17
            r10.<init>(r0, r1)
            p.m441 r10 = p.rwq.q(r10)
            p.du2 r1 = new p.du2
            java.lang.Object r0 = r9.g
            r3 = r0
            p.ven0 r3 = (p.ven0) r3
            java.lang.Object r0 = r9.h
            r4 = r0
            p.ven0 r4 = (p.ven0) r4
            r6 = 10
            r1.<init>(r2, r3, r4, r5, r6)
            r9.b = r7
            java.lang.Object r9 = p.l4p1.q(r10, r1, r9)
            if (r9 != r8) goto L9f
        L99:
            return r8
        L9a:
            p.u760 r9 = p.u760.c
            r2.invoke(r9)
        L9f:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xd1.p(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        z6x0 z6x0Var = (z6x0) this.f;
        kjm kjmVar = (kjm) this.d;
        m1x0 m1x0Var = (m1x0) this.e;
        vr20 vr20Var = (vr20) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            this.c = vr20Var;
            this.b = (byte) 1;
            if (vr20Var.emit(kjmVar, this) != d9nVar) {
            }
            return d9nVar;
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (m1x0Var.m.i() && !z6x0Var.a.h1) {
            jge jgeVarE = hu20.e(rqt0.u(m1x0Var.n.c()), new m6z((byte) 1, kjmVar, m1x0Var, z6x0Var, (n1r) this.g, (n1r) this.h, null));
            this.c = null;
            this.b = (byte) 2;
            if (l4p1.s(vr20Var, jgeVarE, this) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    private final Object s(Object obj) {
        l2t l2tVarQ;
        s2t s2tVar;
        jlz0 jlz0VarC;
        Object objE;
        gfi1 gfi1Var;
        Object objE2;
        jlz0 jlz0Var;
        gfi1 gfi1Var2;
        Object obj2;
        iiz0 iiz0Var = (iiz0) this.h;
        c9n c9nVar = (c9n) this.c;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new hiz0(iiz0Var, (lnm) null, (byte) 1), 3);
            s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new hiz0(iiz0Var, (lnm) null, (byte) 0), 3);
            l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new hiz0(iiz0Var, (lnm) null, (byte) 2), 3);
            this.c = null;
            this.d = s2tVarQ;
            this.e = l2tVarQ;
            this.b = (byte) 1;
            Object objQ = s2tVarQ2.Q(this);
            if (objQ != d9nVar) {
                s2tVar = s2tVarQ;
                obj = objQ;
            }
            return d9nVar;
        }
        if (b == 1) {
            l2tVarQ = (l2t) this.e;
            s2tVar = (s2t) this.d;
            hm5.M(obj);
        } else {
            if (b == 2) {
                jlz0 jlz0Var2 = (jlz0) this.f;
                l2t l2tVar = (l2t) this.e;
                hm5.M(obj);
                objE = obj;
                jlz0VarC = jlz0Var2;
                l2tVarQ = l2tVar;
                gfi1Var = (gfi1) objE;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = jlz0VarC;
                this.g = gfi1Var;
                this.b = (byte) 3;
                objE2 = l2tVarQ.E(this);
                if (objE2 != d9nVar) {
                    jlz0 jlz0Var3 = jlz0VarC;
                    obj = objE2;
                    jlz0Var = jlz0Var3;
                    gfi1Var2 = gfi1Var;
                }
                return d9nVar;
            }
            if (b != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gfi1Var2 = (gfi1) this.g;
            jlz0Var = (jlz0) this.f;
            hm5.M(obj);
        }
        obj2 = ((e331) obj).a;
        if (gfi1Var2 instanceof dfi1) {
            hm5.M(obj2);
        }
        return new giz0(gfi1Var2, jlz0Var, (ilz0) (obj2 instanceof m231 ? null : obj2));
        Object obj3 = ((e331) obj).a;
        jlz0VarC = e331.a(obj3) == null ? llz0.c((ehz0) obj3) : jlz0.i;
        this.c = null;
        this.d = null;
        this.e = l2tVarQ;
        this.f = jlz0VarC;
        this.b = (byte) 2;
        objE = s2tVar.E(this);
        if (objE != d9nVar) {
            gfi1Var = (gfi1) objE;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = jlz0VarC;
            this.g = gfi1Var;
            this.b = (byte) 3;
            objE2 = l2tVarQ.E(this);
            if (objE2 != d9nVar) {
                jlz0 jlz0Var4 = jlz0VarC;
                obj = objE2;
                jlz0Var = jlz0Var4;
                gfi1Var2 = gfi1Var;
                obj2 = ((e331) obj).a;
                if (gfi1Var2 instanceof dfi1) {
                    hm5.M(obj2);
                }
                return new giz0(gfi1Var2, jlz0Var, (ilz0) (obj2 instanceof m231 ? null : obj2));
            }
        }
        return d9nVar;
    }

    private final Object t(Object obj) {
        s2t s2tVarQ;
        Object obj2;
        s6z0 s6z0Var = (s6z0) this.f;
        c9n c9nVar = (c9n) this.e;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                s2tVarQ = (s2t) this.d;
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.c;
                hm5.M(obj);
            }
            return new mmr0(obj2, obj);
        }
        hm5.M(obj);
        s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new b201(s6z0Var, (qvc0) this.g, (lnm) null, (byte) 23), 3);
        s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new b201(s6z0Var, (rxc0) this.h, (lnm) null, (byte) 24), 3);
        this.e = null;
        this.d = s2tVarQ;
        this.b = (byte) 1;
        obj = s2tVarQ2.Q(this);
        if (obj != d9nVar) {
        }
        return d9nVar;
        this.e = null;
        this.d = null;
        this.c = obj;
        this.b = (byte) 2;
        Object objE = s2tVarQ.E(this);
        if (objE != d9nVar) {
            Object obj3 = obj;
            obj = objE;
            obj2 = obj3;
            return new mmr0(obj2, obj);
        }
        return d9nVar;
    }

    private final Object u(Object obj) {
        s2t s2tVarQ;
        Object obj2;
        zgz0 zgz0Var = (zgz0) this.f;
        c9n c9nVar = (c9n) this.e;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                s2tVarQ = (s2t) this.d;
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.c;
                hm5.M(obj);
            }
            return new mmr0(obj2, obj);
        }
        hm5.M(obj);
        s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new b201(zgz0Var, (qvc0) this.g, (lnm) null, (byte) 25), 3);
        s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new b201(zgz0Var, (rxc0) this.h, (lnm) null, (byte) 26), 3);
        this.e = null;
        this.d = s2tVarQ;
        this.b = (byte) 1;
        obj = s2tVarQ2.Q(this);
        if (obj != d9nVar) {
        }
        return d9nVar;
        this.e = null;
        this.d = null;
        this.c = obj;
        this.b = (byte) 2;
        Object objE = s2tVarQ.E(this);
        if (objE != d9nVar) {
            Object obj3 = obj;
            obj = objE;
            obj2 = obj3;
            return new mmr0(obj2, obj);
        }
        return d9nVar;
    }

    private final Object v(Object obj) {
        Throwable th;
        Context context = (Context) this.f;
        cy5 cy5Var = (cy5) this.c;
        byte b = this.b;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                h4k h4kVar = (h4k) this.e;
                cy5Var.getClass();
                h4kVar.A(new j2i(-1784282257, new ay5(context, cy5Var), true));
                p311 p311Var = (p311) this.g;
                this.b = (byte) 1;
                if (p311Var.R(this) == d9nVar2) {
                    return d9nVar2;
                }
            } else {
                if (b == 1) {
                    hm5.M(obj);
                    return d9nVar;
                }
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) this.d;
                hm5.M(obj);
                smo1.p((ove1) this.h, lgo1.b("Error in recomposition coroutine", th));
            }
        } catch (CancellationException unused) {
        } catch (Throwable th2) {
            this.d = th2;
            this.b = (byte) 2;
            cy5Var.c(context, th2);
            if (d9nVar != d9nVar2) {
                th = th2;
            }
            return d9nVar2;
        }
        return d9nVar;
    }

    private final Object w(Object obj) {
        cc71 cc71Var;
        nsw0 nsw0Var;
        cc71 cc71Var2;
        e821 e821Var = (e821) this.g;
        nsw0 nsw0Var2 = (nsw0) this.c;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            cc71Var = (cc71) ((psw0) nsw0Var2).a.getValue();
            String str = (String) this.d;
            String str2 = (String) this.h;
            this.c = nsw0Var2;
            this.e = nsw0Var2;
            this.f = cc71Var;
            this.b = (byte) 1;
            obj = e821Var.q(str, str2, this);
            if (obj != d9nVar) {
                nsw0Var = nsw0Var2;
            }
            return d9nVar;
        }
        if (b == 1) {
            cc71Var = (cc71) this.f;
            nsw0Var = (nsw0) this.e;
            hm5.M(obj);
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cc71Var2 = (cc71) this.f;
            nsw0Var2 = (nsw0) this.e;
            hm5.M(obj);
        }
        String str3 = cc71Var2.a;
        cc71Var2.getClass();
        ((psw0) nsw0Var2).setValue(new cc71((Uri) obj, str3));
        return rih1.a;
        Uri uri = cc71Var.b;
        cc71Var.getClass();
        ((psw0) nsw0Var).setValue(new cc71(uri, (String) obj));
        cc71 cc71Var3 = (cc71) ((psw0) nsw0Var2).a.getValue();
        this.c = null;
        this.e = nsw0Var2;
        this.f = cc71Var3;
        this.b = (byte) 2;
        Object objR = e821Var.r(this);
        if (objR != d9nVar) {
            cc71Var2 = cc71Var3;
            obj = objR;
            String str4 = cc71Var2.a;
            cc71Var2.getClass();
            ((psw0) nsw0Var2).setValue(new cc71((Uri) obj, str4));
            return rih1.a;
        }
        return d9nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r9 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object x(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            com.spotify.betamax.player.VideoSurfaceView r0 = (com.spotify.betamax.player.VideoSurfaceView) r0
            byte r1 = r8.b
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            p.hm5.M(r9)
            goto L70
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L1b:
            p.hm5.M(r9)
            goto L5f
        L1f:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.f
            p.ven0 r9 = (p.ven0) r9
            java.util.concurrent.atomic.AtomicLong r1 = p.no71.a
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7d
            java.lang.Object r9 = r8.d
            p.uoa r9 = (p.uoa) r9
            java.lang.Object r1 = r8.e
            p.ta71 r1 = (p.ta71) r1
            long r6 = r1.e
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            p.p3u0 r9 = r9.f
            if (r9 == 0) goto L4e
            p.rm51 r2 = r9.o0(r1, r6, r0)
        L4e:
            if (r2 == 0) goto L7d
            p.ixg r9 = r2.b
            io.reactivex.rxjava3.core.Single r9 = r9.i()
            r8.b = r4
            java.lang.Object r9 = p.fc11.j(r9, r8)
            if (r9 != r5) goto L5f
            goto L6f
        L5f:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto L7d
            java.lang.Object r0 = r8.g
            p.zxa r0 = (p.zxa) r0
            r8.b = r3
            java.lang.Object r9 = p.zxa.d(r0, r9, r8)
            if (r9 != r5) goto L70
        L6f:
            return r5
        L70:
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L7d
            java.lang.Object r8 = r8.h
            p.ven0 r8 = (p.ven0) r8
            java.util.concurrent.atomic.AtomicLong r0 = p.no71.a
            r8.setValue(r9)
        L7d:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xd1.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011e, code lost:
    
        if (r3.b(r2, r33) == r8) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object y(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xd1.y(java.lang.Object):java.lang.Object");
    }

    private final Object z(Object obj) {
        s2t s2tVarQ;
        Object obj2;
        String str = (String) this.d;
        mzr0 mzr0Var = (mzr0) this.h;
        rzq rzqVar = (rzq) this.g;
        c9n c9nVar = (c9n) this.f;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                s2tVarQ = (s2t) this.e;
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.c;
                hm5.M(obj);
            }
            return new mmr0(obj2, obj);
        }
        hm5.M(obj);
        s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new rs71(rzqVar, mzr0Var, str, (lnm) null, (byte) 0), 3);
        s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new rs71(rzqVar, mzr0Var, str, (lnm) null, (byte) 1), 3);
        this.f = null;
        this.e = s2tVarQ;
        this.b = (byte) 1;
        obj = s2tVarQ2.Q(this);
        if (obj != d9nVar) {
        }
        return d9nVar;
        this.f = null;
        this.e = null;
        this.c = obj;
        this.b = (byte) 2;
        Object objE = s2tVarQ.E(this);
        if (objE != d9nVar) {
            Object obj3 = obj;
            obj = objE;
            obj2 = obj3;
            return new mmr0(obj2, obj);
        }
        return d9nVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        switch (b) {
            case 0:
                xd1 xd1Var = new xd1(this.f, this.g, obj2, lnmVar, (byte) 0);
                xd1Var.c = obj;
                return xd1Var;
            case 1:
                xd1 xd1Var2 = new xd1((yu3) this.f, (String) this.d, (u7l0) this.g, (String) obj2, lnmVar);
                xd1Var2.c = obj;
                return xd1Var2;
            case 2:
                xd1 xd1Var3 = new xd1(this.g, obj2, lnmVar, (byte) 2);
                xd1Var3.c = obj;
                return xd1Var3;
            case 3:
                return new xd1((rsw0) this.e, (vr20) this.f, (xu30) this.g, this.c, (gaa0) obj2, lnmVar);
            case 4:
                xd1 xd1Var4 = new xd1(this.e, this.f, this.g, obj2, lnmVar, (byte) 4);
                xd1Var4.d = obj;
                return xd1Var4;
            case 5:
                xd1 xd1Var5 = new xd1(this.e, this.f, this.g, obj2, lnmVar, (byte) 5);
                xd1Var5.c = obj;
                return xd1Var5;
            case 6:
                xd1 xd1Var6 = new xd1(this.g, obj2, lnmVar, (byte) 6);
                xd1Var6.f = obj;
                return xd1Var6;
            case 7:
                return new xd1((cv30) this.c, (String) this.d, this.f, this.g, (ven0) obj2, lnmVar, (byte) 7);
            case 8:
                return new xd1((kl1) this.e, (gcy) this.c, (String) this.d, (gcy) this.f, (kdn0) this.g, (String) obj2, lnmVar);
            case 9:
                xd1 xd1Var7 = new xd1(this.g, obj2, lnmVar, (byte) 9);
                xd1Var7.c = obj;
                return xd1Var7;
            case 10:
                xd1 xd1Var8 = new xd1(this.d, this.e, this.f, this.g, (cv30) obj2, lnmVar, (byte) 10);
                xd1Var8.c = obj;
                return xd1Var8;
            case 11:
                xd1 xd1Var9 = new xd1(this.f, this.g, obj2, lnmVar, (byte) 11);
                xd1Var9.c = obj;
                return xd1Var9;
            case 12:
                xd1 xd1Var10 = new xd1(this.f, this.g, obj2, lnmVar, (byte) 12);
                xd1Var10.c = obj;
                return xd1Var10;
            case 13:
                return new xd1(this.g, obj2, lnmVar, (byte) 13);
            case 14:
                xd1 xd1Var11 = new xd1(this.g, obj2, lnmVar, (byte) 14);
                xd1Var11.c = obj;
                return xd1Var11;
            case 15:
                xd1 xd1Var12 = new xd1(this.g, obj2, lnmVar, (byte) 15);
                xd1Var12.f = obj;
                return xd1Var12;
            case 16:
                xd1 xd1Var13 = new xd1(this.e, this.f, this.g, obj2, lnmVar, (byte) 16);
                xd1Var13.c = obj;
                return xd1Var13;
            case 17:
                xd1 xd1Var14 = new xd1(this.g, obj2, lnmVar, (byte) 17);
                xd1Var14.c = obj;
                return xd1Var14;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                xd1 xd1Var15 = new xd1(this.f, this.g, obj2, lnmVar, (byte) 18);
                xd1Var15.e = obj;
                return xd1Var15;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new xd1((vuv0) this.d, (iu30) this.e, (ven0) this.c, (tob1) this.f, (ven0) this.g, (ven0) obj2, lnmVar, (byte) 19);
            case 20:
                xd1 xd1Var16 = new xd1(this.d, this.e, this.f, this.g, (cv30) obj2, lnmVar, (byte) 20);
                xd1Var16.c = obj;
                return xd1Var16;
            case 21:
                xd1 xd1Var17 = new xd1((iiz0) obj2, lnmVar);
                xd1Var17.c = obj;
                return xd1Var17;
            case 22:
                xd1 xd1Var18 = new xd1(this.f, this.g, obj2, lnmVar, (byte) 22);
                xd1Var18.e = obj;
                return xd1Var18;
            case 23:
                xd1 xd1Var19 = new xd1(this.f, this.g, obj2, lnmVar, (byte) 23);
                xd1Var19.e = obj;
                return xd1Var19;
            case 24:
                return new xd1((h4k) this.e, (cy5) this.c, (Context) this.f, (p311) this.g, (ove1) obj2, lnmVar);
            case 25:
                xd1 xd1Var20 = new xd1((e821) this.g, (String) this.d, (String) obj2, lnmVar);
                xd1Var20.c = obj;
                return xd1Var20;
            case 26:
                return new xd1((uoa) this.d, (ta71) this.e, (VideoSurfaceView) this.c, (ven0) this.f, (zxa) this.g, (ven0) obj2, lnmVar, (byte) 26);
            case 27:
                xd1 xd1Var21 = new xd1((to71) this.e, (String) this.d, (w4i1) this.f, (za21) this.g, (String) obj2, lnmVar);
                xd1Var21.c = obj;
                return xd1Var21;
            case 28:
                xd1 xd1Var22 = new xd1((rzq) this.g, (mzr0) obj2, (String) this.d, lnmVar);
                xd1Var22.f = obj;
                return xd1Var22;
            default:
                return new xd1((cv30) this.c, (String) this.d, this.f, this.g, (ven0) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create(obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((bg61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((i8o0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:227:0x056f  */
    /* JADX WARN: Code duplicated, block: B:433:0x095f  */
    /* JADX WARN: Code duplicated, block: B:497:0x0b3d  */
    /* JADX WARN: Code duplicated, block: B:500:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:518:0x057f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:? A[LOOP:1: B:225:0x0569->B:519:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v182 */
    /* JADX WARN: Type inference failed for: r0v183 */
    /* JADX WARN: Type inference failed for: r0v184 */
    /* JADX WARN: Type inference failed for: r0v185 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v74, types: [p.cen0] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:234:0x058e -> B:329:0x0707). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:327:0x0704 -> B:329:0x0707). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 2960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xd1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd1(Object obj, Object obj2, Object obj3, Object obj4, cv30 cv30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd1(Object obj, Object obj2, Object obj3, tob1 tob1Var, Object obj4, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = tob1Var;
        this.g = obj4;
        this.h = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd1(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(yu3 yu3Var, String str, u7l0 u7l0Var, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.f = yu3Var;
        this.d = str;
        this.g = u7l0Var;
        this.h = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(h4k h4kVar, cy5 cy5Var, Context context, p311 p311Var, ove1 ove1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 24;
        this.e = h4kVar;
        this.c = cy5Var;
        this.f = context;
        this.g = p311Var;
        this.h = ove1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(rzq rzqVar, mzr0 mzr0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 28;
        this.g = rzqVar;
        this.h = mzr0Var;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd1(cv30 cv30Var, String str, Object obj, Object obj2, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = cv30Var;
        this.d = str;
        this.f = obj;
        this.g = obj2;
        this.h = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(rsw0 rsw0Var, vr20 vr20Var, xu30 xu30Var, Object obj, gaa0 gaa0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.e = rsw0Var;
        this.f = vr20Var;
        this.g = xu30Var;
        this.c = obj;
        this.h = gaa0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(iiz0 iiz0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 21;
        this.h = iiz0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(e821 e821Var, String str, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 25;
        this.g = e821Var;
        this.d = str;
        this.h = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(to71 to71Var, String str, w4i1 w4i1Var, za21 za21Var, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 27;
        this.e = to71Var;
        this.d = str;
        this.f = w4i1Var;
        this.g = za21Var;
        this.h = str2;
    }
}
