package p;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hyg0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyg0(ipb1 ipb1Var, Object obj, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.c = ipb1Var;
        this.b = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hyg0 hyg0Var = new hyg0(obj2, lnmVar, (byte) 0);
                hyg0Var.b = obj;
                return hyg0Var;
            case 1:
                return new hyg0((smh0) this.b, (ven0) obj2, lnmVar, (byte) 1);
            case 2:
                hyg0 hyg0Var2 = new hyg0(obj2, lnmVar, (byte) 2);
                hyg0Var2.b = obj;
                return hyg0Var2;
            case 3:
                return new hyg0((fxh0) this.b, (Context) obj2, lnmVar, (byte) 3);
            case 4:
                hyg0 hyg0Var3 = new hyg0(obj2, lnmVar, (byte) 4);
                hyg0Var3.b = obj;
                return hyg0Var3;
            case 5:
                hyg0 hyg0Var4 = new hyg0(obj2, lnmVar, (byte) 5);
                hyg0Var4.b = obj;
                return hyg0Var4;
            case 6:
                hyg0 hyg0Var5 = new hyg0(obj2, lnmVar, (byte) 6);
                hyg0Var5.b = obj;
                return hyg0Var5;
            case 7:
                return new hyg0((duj0) this.b, (View) obj2, lnmVar, (byte) 7);
            case 8:
                hyg0 hyg0Var6 = new hyg0(obj2, lnmVar, (byte) 8);
                hyg0Var6.b = obj;
                return hyg0Var6;
            case 9:
                hyg0 hyg0Var7 = new hyg0(obj2, lnmVar, (byte) 9);
                hyg0Var7.b = obj;
                return hyg0Var7;
            case 10:
                return new hyg0((qyj0) this.b, (odm0) obj2, lnmVar, (byte) 10);
            case 11:
                hyg0 hyg0Var8 = new hyg0(obj2, lnmVar, (byte) 11);
                hyg0Var8.b = obj;
                return hyg0Var8;
            case 12:
                return new hyg0((wik0) this.b, (g431) obj2, lnmVar, (byte) 12);
            case 13:
                return new hyg0((ipb1) obj2, this.b, lnmVar);
            case 14:
                return new hyg0((c9n) this.b, (uem0) obj2, lnmVar, (byte) 14);
            case 15:
                return new hyg0((gum0) this.b, (tv80) obj2, lnmVar, (byte) 15);
            case 16:
                return new hyg0((b3k1) this.b, (ven0) obj2, lnmVar, (byte) 16);
            case 17:
                hyg0 hyg0Var9 = new hyg0(obj2, lnmVar, (byte) 17);
                hyg0Var9.b = obj;
                return hyg0Var9;
            case 18:
                return new hyg0((f1n0) this.b, (b3i1) obj2, lnmVar, (byte) 18);
            case 19:
                return new hyg0((tzg0) this.b, (g7t) obj2, lnmVar, (byte) 19);
            case 20:
                return new hyg0((rok0) this.b, (String) obj2, lnmVar, (byte) 20);
            case 21:
                hyg0 hyg0Var10 = new hyg0(obj2, lnmVar, (byte) 21);
                hyg0Var10.b = obj;
                return hyg0Var10;
            case 22:
                return new hyg0((a8o0) this.b, (String) obj2, lnmVar, (byte) 22);
            case 23:
                return new hyg0((tlo0) this.b, (qno0) obj2, lnmVar, (byte) 23);
            case 24:
                return new hyg0((gqo0) this.b, (String) obj2, lnmVar, (byte) 24);
            case 25:
                return new hyg0((cro0) this.b, (qqo0) obj2, lnmVar, (byte) 25);
            case 26:
                return new hyg0((i8h1) this.b, (ogl0) obj2, lnmVar, (byte) 26);
            case 27:
                return new hyg0((yso0) this.b, (ven0) obj2, lnmVar, (byte) 27);
            case 28:
                return new hyg0((yyo0) this.b, (ven0) obj2, lnmVar, (byte) 28);
            default:
                return new hyg0((vyo0) this.b, (ven0) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((p6i1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((lci0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                return create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                create((a4j0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                return create((Map) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((u0n0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((d831) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x010d  */
    /* JADX WARN: Code duplicated, block: B:31:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x014a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0168  */
    /* JADX WARN: Code duplicated, block: B:37:0x016c  */
    public final Object invokeSuspend(Object obj) {
        cn70 cn70VarD;
        rih1 rih1Var;
        u3j0 u3j0Var;
        o3j0 o3j0Var;
        int i;
        s3j0 s3j0Var;
        int i2;
        int i3;
        Integer num;
        View.OnClickListener t230Var;
        er91 er91Var;
        kt91 kt91Var;
        int i4 = 0;
        u0n0 string = null;
        switch (this.a) {
            case 0:
                p6i1 p6i1Var = (p6i1) this.b;
                hm5.M(obj);
                Object obj2 = this.c;
                return Boolean.valueOf(obj2 == null || !u890.j(p6i1Var.b, obj2));
            case 1:
                hm5.M(obj);
                if (((smh0) this.b).f != rmh0.a) {
                    ((ven0) this.c).setValue(Boolean.FALSE);
                }
                return rih1.a;
            case 2:
                Integer[] numArr = ila0.f;
                Integer[] numArr2 = ila0.e;
                List list = (List) this.b;
                hm5.M(obj);
                nwh0 nwh0Var = (nwh0) this.c;
                o4o0 o4o0Var = nwh0Var.b;
                if (o4o0Var.a()) {
                    ArrayList<vuh0> arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        vuh0 vuh0Var = (vuh0) obj3;
                        if (f46.M(numArr2, Integer.valueOf(vuh0Var.d)) || f46.M(numArr, Integer.valueOf(vuh0Var.d))) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    for (vuh0 vuh0Var2 : arrayList) {
                        String str = vuh0Var2.a;
                        int i5 = vuh0Var2.d;
                        ak akVar = ak.a;
                        String strU0 = ihc1.U0(str, ":", str);
                        if (strU0.length() <= 0 || strU0.equals(str)) {
                            cn70 cn70Var = cn70.b;
                            cn70VarD = cua.d(akVar, str);
                        } else {
                            cn70 cn70Var2 = cn70.b;
                            cn70VarD = cua.d(akVar, strU0);
                        }
                        arrayList2.add(new qi(vuh0Var2.b, f46.M(numArr, Integer.valueOf(i5)) ? ((Context) nwh0Var.a.get()).getString(2131954255) : null, (String) null, f46.M(numArr2, Integer.valueOf(i5)) ? 3 : 4, vuh0Var2.c, Boolean.valueOf(((fuf0) nwh0Var.d.get()).a(vuh0Var2.a, vuh0Var2.b)), (ii) null, cn70VarD, 68));
                    }
                    arrayList2.toString();
                    nwh0Var.f.m((Object) null, arrayList2);
                } else {
                    o4o0Var.a();
                }
                return rih1.a;
            case 3:
                fxh0 fxh0Var = (fxh0) this.b;
                Context context = (Context) this.c;
                hm5.M(obj);
                jd11 jd11Var = rc11.a;
                wdg wdgVarB = jd11Var.b(SpotifyMediaLibraryService.class);
                wdg wdgVarB2 = jd11Var.b(SpotifyMediaBrowserService.class);
                fxh0.a(context, ((Boolean) fxh0Var.b.b.getValue()).booleanValue() ? p7h.M(new mmr0[]{new mmr0(new ComponentName(context, (Class<?>) wdgVarB2.n()), new Integer(2)), new mmr0(new ComponentName(context, (Class<?>) wdgVarB.n()), new Integer(1))}) : p7h.M(new mmr0[]{new mmr0(new ComponentName(context, (Class<?>) wdgVarB.n()), new Integer(2)), new mmr0(new ComponentName(context, (Class<?>) wdgVarB2.n()), new Integer(1))}));
                return rih1.a;
            case 4:
                n0o n0oVar = (n0o) this.c;
                lci0 lci0Var = (lci0) this.b;
                hm5.M(obj);
                String str2 = lci0Var.b.a.a.f;
                if (str2.length() > 0 && ((AtomicBoolean) n0oVar.t).compareAndSet(false, true)) {
                    ((kko) n0oVar.f).c(Collections.singleton(str2));
                }
                return rih1.a;
            case 5:
                List list2 = (List) this.b;
                hm5.M(obj);
                int i6 = e4j0.k;
                return Boolean.valueOf(lfb.n(list2).contains((n3j0) this.c));
            case 6:
                t3j0 t3j0Var = t3j0.c;
                rih1 rih1Var2 = rih1.a;
                a4j0 a4j0Var = (a4j0) this.b;
                hm5.M(obj);
                e4j0 e4j0Var = (e4j0) this.c;
                llm llmVar = e4j0Var.d;
                bpb1 bpb1Var = e4j0Var.h;
                List list3 = a4j0Var.a;
                int i7 = e4j0.k;
                s3j0 s3j0Var2 = (s3j0) o7h.s0((List) e4j0Var.f.getValue());
                if (s3j0Var2 != null) {
                    s3j0Var2.c.invoke(Boolean.valueOf(e4j0Var.c(s3j0Var2.a, s3j0Var2.b, list3)));
                    rih1Var = rih1Var2;
                } else {
                    rih1Var = null;
                }
                if (rih1Var == null) {
                    List list4 = a4j0Var.a;
                    int i8 = e4j0.k;
                    ArrayList arrayListN = lfb.n(list4);
                    bpb1 bpb1Var2 = e4j0Var.g;
                    Iterable iterable = (Iterable) bpb1Var2.getValue();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : iterable) {
                        int i9 = i4 + 1;
                        if (i4 < 0) {
                            p7h.T();
                            throw null;
                        }
                        s3j0 s3j0Var3 = (s3j0) obj4;
                        Collection collectionU1 = o7h.u1((Iterable) bpb1Var2.getValue());
                        if ((collectionU1 instanceof Collection) && collectionU1.isEmpty()) {
                            arrayList3.add(obj4);
                        }
                        ca80 it = collectionU1.iterator();
                        do {
                            ca80 ca80Var = it;
                            if (!((Iterator) ca80Var.c).hasNext()) {
                                arrayList3.add(obj4);
                            }
                            aa80 aa80Var = (aa80) ca80Var.next();
                            i = aa80Var.a;
                            s3j0Var = (s3j0) aa80Var.b;
                            break;
                        } while (i4 > i ? e4j0.a(s3j0Var, s3j0Var3.a()) : i4 >= i || !e4j0.a(s3j0Var3, s3j0Var.a()) || e4j0.a(s3j0Var, s3j0Var3.a));
                        break;
                        i4 = i9;
                    }
                    lnm lnmVar = null;
                    int iS = zno1.s(q7h.U(arrayList3, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                    for (Object obj5 : arrayList3) {
                        q4j0[] q4j0VarArr = (q4j0[]) ((p3j0) ((s3j0) obj5).b).a.b;
                        if (arrayListN.isEmpty()) {
                            o3j0Var = o3j0.a;
                        }
                        Iterator it2 = arrayListN.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                o3j0Var = o3j0.a;
                            }
                            if (f46.M(q4j0VarArr, ((n3j0) it2.next()).a)) {
                                o3j0Var = o3j0.b;
                            }
                            break;
                            break;
                        }
                        break;
                        linkedHashMap.put(obj5, o3j0Var);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : list4) {
                        k6w0 k6w0Var = (k6w0) obj6;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            int iOrdinal = ((o3j0) entry.getValue()).ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    continue;
                                } else if (iOrdinal != 2) {
                                    eg.o();
                                    return null;
                                }
                            }
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                        if (!linkedHashMap2.isEmpty()) {
                            Iterator it3 = linkedHashMap2.entrySet().iterator();
                            while (it3.hasNext()) {
                                s3j0 s3j0Var4 = (s3j0) ((Map.Entry) it3.next()).getKey();
                                a0m a0mVar = ((p3j0) s3j0Var4.b).c;
                                q4j0 q4j0Var = k6w0Var.a;
                                d3j0 d3j0Var = k6w0Var.b;
                                n3j0 n3j0Var = s3j0Var4.a;
                                if (f46.M((q4j0[]) a0mVar.b, q4j0Var) && uwo1.p(n3j0Var.b, d3j0Var)) {
                                    arrayList4.add(obj6);
                                }
                                break;
                            }
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        arrayList4 = null;
                    }
                    if (arrayList4 != null) {
                        y3j0 y3j0Var = new y3j0(arrayList4, e4j0Var, null);
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, t3j0Var);
                        c921.y(llmVar, (o8n) null, 0, new d7i0((Object) y3j0Var, (Object) e4j0Var, lnmVar, (byte) 5), 3);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        s3j0 s3j0Var5 = (s3j0) entry2.getKey();
                        int iOrdinal2 = ((o3j0) entry2.getValue()).ordinal();
                        if (iOrdinal2 == 0) {
                            u3j0Var = new u3j0(s3j0Var5, true);
                        } else if (iOrdinal2 == 1) {
                            u3j0Var = new u3j0(s3j0Var5, false);
                        } else {
                            if (iOrdinal2 != 2) {
                                eg.o();
                                return null;
                            }
                            u3j0Var = null;
                        }
                        if (u3j0Var != null) {
                            arrayList5.add(u3j0Var);
                        }
                    }
                    if (arrayList5.isEmpty()) {
                        arrayList5 = null;
                    }
                    if (arrayList5 != null) {
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj7 : arrayList5) {
                            if (((u3j0) obj7).b) {
                                arrayList6.add(obj7);
                            } else {
                                arrayList7.add(obj7);
                            }
                        }
                        u3j0 u3j0Var2 = (u3j0) o7h.s0(arrayList6);
                        smc0 smc0VarN = k4p1.n();
                        smc0VarN.addAll(arrayList7);
                        if (u3j0Var2 != null) {
                            smc0VarN.add(u3j0Var2);
                        }
                        smc0 smc0VarK = k4p1.k(smc0VarN);
                        if (u3j0Var2 != null) {
                            tgg tggVar = new tgg(new xx3(smc0VarK, e4j0Var, (lnm) null, (byte) 6), e4j0Var, u3j0Var2.a.a, (lnm) null, (byte) 1);
                            bpb1Var.getClass();
                            bpb1Var.m((Object) null, t3j0Var);
                            c921.y(llmVar, (o8n) null, 0, new d7i0((Object) tggVar, (Object) e4j0Var, (lnm) null, (byte) 5), 3);
                        } else {
                            e4j0.d(smc0VarK, e4j0Var);
                        }
                    }
                }
                return rih1Var2;
            case 7:
                hm5.M(obj);
                ((duj0) this.b).f.onNext(new i5w0((View) this.c));
                return rih1.a;
            case 8:
                mmr0 mmr0Var = (mmr0) this.b;
                hm5.M(obj);
                spq0 spq0Var = (spq0) mmr0Var.a;
                w4l w4lVar = (w4l) mmr0Var.b;
                duj0 duj0Var = (duj0) this.c;
                goq goqVar = duj0Var.e;
                View view = (View) spq0Var.b();
                goqVar.f = new z8i0(duj0Var, (byte) 21);
                gj5 gj5Var = (gj5) goqVar.g;
                boolean z = w4lVar.b;
                boolean z2 = w4lVar.a;
                if (z2 && z) {
                    i2 = 2131958794;
                } else if (z) {
                    i2 = 2131958795;
                } else {
                    if (!z2) {
                        eg.m("Unreachable: at least one feature must be affected");
                        return null;
                    }
                    i2 = 2131958793;
                }
                ((vku) goqVar.d).a(((l8s) goqVar.b).c(new ijo0(new mx81(gj5Var.getString(i2), 0, 0, 10000L, 126), view, (m9s) goqVar.h, 8)).observeOn((Scheduler) goqVar.c).subscribe(new yrh(goqVar, (byte) 26)));
                return rih1.a;
            case 9:
                Map map = (Map) this.b;
                hm5.M(obj);
                return Boolean.valueOf(z6k0.b(map));
            case 10:
                hm5.M(obj);
                qyj0 qyj0Var = (qyj0) this.b;
                if (!qyj0Var.g) {
                    ank0 ank0Var = qyj0Var.e;
                    odm0 odm0Var = (odm0) this.c;
                    String str3 = odm0Var.a;
                    String str4 = odm0Var.b;
                    ymk0 ymk0Var = ank0Var.b;
                    int i10 = ank0Var.a.i0;
                    synchronized (ymk0Var) {
                        try {
                            if (str3.length() != 0 && str4.length() != 0) {
                                long jB = ymk0Var.a.b();
                                xmk0 xmk0VarA = ymk0Var.a(i10);
                                if (xmk0VarA != null) {
                                    jB = xmk0VarA.a;
                                }
                                i4 = xmk0VarA != null ? xmk0VarA.b : 0;
                                string = xmk0VarA != null ? xmk0VarA.c : null;
                                if (string == null) {
                                    string = w7x.a;
                                }
                                hma1 hma1VarEdit = ymk0Var.b.edit();
                                hma1VarEdit.c(zmk0.a, jB);
                                hma1VarEdit.b(zmk0.b, i10);
                                hma1VarEdit.b(zmk0.c, i4 + 1);
                                hma1VarEdit.e(zmk0.d, dm61.x0(str3.length() + ":" + str3 + str4, string));
                                hma1VarEdit.h();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ((qyj0) this.b).g = true;
                }
                return rih1.a;
            case 11:
                k1r k1rVar = (k1r) this.b;
                hm5.M(obj);
                if (k1rVar instanceof j1r) {
                    return new huz(k1rVar, (byte) 10);
                }
                if (k1rVar instanceof h1r) {
                    return new huz(k1rVar, (byte) 10);
                }
                if (!(k1rVar instanceof i1r)) {
                    eg.o();
                    return null;
                }
                v8k0 v8k0Var = (v8k0) this.c;
                d0r d0rVar = v8k0Var.d;
                f1r f1rVarA = v8k0Var.g.a1.a((kak0) ((idd1) v8k0Var.e.N0).getValue());
                j1r j1rVarB = d0rVar.b(f1rVarA);
                j1rVarB.getClass();
                if (j1rVarB instanceof h1r) {
                    j1rVarB = null;
                }
                if (j1rVarB == null) {
                    j1rVarB = j1r.a;
                }
                return yzo1.j(j1rVarB, new swn(d0rVar, f1rVarA, (lnm) null, (byte) 3));
            case 12:
                hm5.M(obj);
                wik0 wik0Var = (wik0) this.b;
                ulk0 ulk0Var = wik0Var.d;
                g431 g431Var = (g431) this.c;
                tik0 tik0Var = new tik0(wik0Var, (byte) 1);
                ulk0Var.getClass();
                ulk0Var.a = g431Var.a(uj1.A, new tlk0(ulk0Var, tik0Var, (byte) 0));
                ulk0Var.b = g431Var.a(uj1.i, new tlk0(ulk0Var, tik0Var, (byte) 1));
                return rih1.a;
            case 13:
                hm5.M(obj);
                ipb1 ipb1Var = (ipb1) this.c;
                Object state = ipb1Var.getState();
                Object obj8 = this.b;
                if (!u890.j(state, obj8)) {
                    ipb1Var.e(obj8);
                }
                return rih1.a;
            case 14:
                hm5.M(obj);
                c9n c9nVar = (c9n) this.b;
                uem0 uem0Var = (uem0) this.c;
                fn31.T(c9nVar, uem0Var.l, 0, new uug0((Object) uem0Var, (lnm) string, (byte) 13), 2);
                return rih1.a;
            case 15:
                hm5.M(obj);
                gum0 gum0Var = (gum0) this.b;
                lzn0 lzn0Var = (lzn0) gum0Var.b.get();
                tv80 tv80Var = (tv80) this.c;
                lzn0Var.f(new dwn0("spotify:premium-destination?displayReason=multi_song_capping", "", false, false, 0, 0, false, null, null, tv80Var != null ? new bwn0(tv80Var) : null));
                gum0Var.a.a(ixb.c);
                return rih1.a;
            case 16:
                hm5.M(obj);
                vm70 vm70Var = (vm70) ((ven0) this.c).getValue();
                if (vm70Var != null) {
                    vm70Var.setScaleType((b3k1) this.b);
                }
                return rih1.a;
            case 17:
                t0n0 t0n0Var = (t0n0) this.c;
                u0n0 u0n0Var = (u0n0) this.b;
                hm5.M(obj);
                if (u0n0Var != null) {
                    t0n0Var.b = u0n0Var.c;
                }
                if (u0n0Var != null) {
                    string = u0n0Var.g ? null : u0n0Var;
                    if (string != null) {
                        t0n0Var.c = string.c;
                    }
                }
                return rih1.a;
            case 18:
                hm5.M(obj);
                ((f1n0) this.b).a.b((b3i1) this.c);
                return rih1.a;
            case 19:
                lzn0 lzn0Var2 = (lzn0) ((g7t) this.c).d;
                hm5.M(obj);
                tzg0 tzg0Var = (tzg0) this.b;
                boolean z3 = tzg0Var.b;
                String str5 = tzg0Var.a;
                if (!z3) {
                    lzn0Var2.e();
                }
                tv80 tv80Var2 = tzg0Var.c;
                if (tv80Var2 != null) {
                    lzn0Var2.a(str5, tv80Var2, (Bundle) null);
                } else {
                    lzn0Var2.h(str5);
                }
                return rih1.a;
            case 20:
                hm5.M(obj);
                pcf.a((lzn0) ((rok0) this.b).b, (String) this.c, (tv80) null, (Bundle) null);
                return rih1.a;
            case 21:
                xkm0 xkm0Var = (xkm0) this.c;
                c831 c831Var = (d831) this.b;
                hm5.M(obj);
                if (c831Var instanceof c831) {
                    xkm0Var.invoke(c831Var.a);
                } else {
                    if (!(c831Var instanceof b831)) {
                        eg.o();
                        return null;
                    }
                    xkm0Var.invoke(((b831) c831Var).a);
                }
                return rih1.a;
            case 22:
                hm5.M(obj);
                try {
                    return (byte[]) ((a8o0) this.b).b.b((String) this.c, (String) null, (String) null, 3, (mn41) null).blockingGet();
                } catch (Exception e) {
                    Logger.l(e, f4i1.f("Downloading manifest: ", (String) this.c, " failed"), new Object[0]);
                    return null;
                }
            case 23:
                qno0 qno0Var = (qno0) this.c;
                String str6 = qno0Var.b;
                bw8 bw8Var = qno0Var.e;
                hm5.M(obj);
                tlo0 tlo0Var = (tlo0) this.b;
                if (u890.j(tlo0Var, qlo0.a)) {
                    string = bw8Var.a.getString(2131962432, str6);
                } else if (u890.j(tlo0Var, rlo0.a)) {
                    string = bw8Var.a.getString(2131962431, str6);
                } else if (!u890.j(tlo0Var, slo0.a)) {
                    eg.o();
                    return null;
                }
                u0n0 u0n0Var2 = string;
                if (u0n0Var2 != null) {
                    qno0Var.d.k(new er91((fs91) null, u0n0Var2, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                return rih1.a;
            case 24:
                hm5.M(obj);
                gqo0 gqo0Var = (gqo0) this.b;
                tjo0 tjo0Var = (tjo0) gqo0Var.l.get();
                int iE = gqo0Var.e();
                String str7 = (String) this.c;
                tjo0Var.getClass();
                int iC = l1d.C(iE);
                if (iC == 0) {
                    i3 = 2131959174;
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i3)});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    Integer numValueOf = Integer.valueOf(i3);
                    dvr dvrVar = new dvr(tjo0Var, (byte) 2);
                    if (str7 == null && iE == 3) {
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{numValueOf});
                        t230Var = new t230(tjo0Var, str7, (byte) 20);
                        num = 2131959172;
                    } else {
                        num = null;
                        t230Var = null;
                    }
                    er91Var = new er91((fs91) null, "", numValueOf, (String) null, num, t230Var, (cvr) null, dvrVar, false);
                    kt91Var = (kt91) tjo0Var.b.get();
                    if (kt91Var.g()) {
                        kt91Var.k(er91Var);
                    } else {
                        kt91Var.o(er91Var);
                    }
                } else if (iC == 1) {
                    i3 = 2131959173;
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i3)});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    Integer numValueOf2 = Integer.valueOf(i3);
                    dvr dvrVar2 = new dvr(tjo0Var, (byte) 2);
                    if (str7 == null) {
                        num = null;
                        t230Var = null;
                    } else {
                        num = null;
                        t230Var = null;
                    }
                    er91Var = new er91((fs91) null, "", numValueOf2, (String) null, num, t230Var, (cvr) null, dvrVar2, false);
                    kt91Var = (kt91) tjo0Var.b.get();
                    if (kt91Var.g()) {
                        kt91Var.k(er91Var);
                    } else {
                        kt91Var.o(er91Var);
                    }
                } else if (iC == 2) {
                    i3 = 2131959174;
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i3)});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    Integer numValueOf3 = Integer.valueOf(i3);
                    dvr dvrVar3 = new dvr(tjo0Var, (byte) 2);
                    if (str7 == null) {
                        num = null;
                        t230Var = null;
                    } else {
                        num = null;
                        t230Var = null;
                    }
                    er91Var = new er91((fs91) null, "", numValueOf3, (String) null, num, t230Var, (cvr) null, dvrVar3, false);
                    kt91Var = (kt91) tjo0Var.b.get();
                    if (kt91Var.g()) {
                        kt91Var.k(er91Var);
                    } else {
                        kt91Var.o(er91Var);
                    }
                } else if (iC != 3) {
                    eg.o();
                    return null;
                }
                return rih1.a;
            case 25:
                hm5.M(obj);
                ((cro0) this.b).g.o(new er91((fs91) null, ((qqo0) this.c).a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1.a;
            case 26:
                hm5.M(obj);
                ((i8h1) this.b).f(((ogl0) this.c).e(), (Set) null);
                return rih1.a;
            case 27:
                rih1 rih1Var3 = rih1.a;
                hm5.M(obj);
                yso0 yso0Var = (yso0) this.b;
                uso0 uso0Var = yso0Var.c;
                int iA = uso0Var.a();
                if (cfm0.c(iA)) {
                    hma1 hma1VarEdit2 = uso0Var.b.edit();
                    hma1VarEdit2.a(uso0.c, true);
                    hma1VarEdit2.h();
                } else {
                    if (cfm0.d(iA)) {
                        yso0Var.d.m();
                    }
                    yso0.d(yso0Var, (ven0) this.c);
                }
                return rih1Var3;
            case 28:
                hm5.M(obj);
                Set set = ((yyo0) this.b).a;
                ven0 ven0Var = (ven0) this.c;
                ven0Var.setValue(o7h.a1(o7h.N0((List) ven0Var.getValue(), o7h.l1(dm61.v0(set, o7h.p1((List) ven0Var.getValue())))), new ktg0((byte) 5)));
                return rih1.a;
            default:
                hm5.M(obj);
                ven0 ven0Var2 = (ven0) this.c;
                ven0Var2.setValue(o7h.J0((List) ven0Var2.getValue(), (vyo0) this.b));
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hyg0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hyg0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
