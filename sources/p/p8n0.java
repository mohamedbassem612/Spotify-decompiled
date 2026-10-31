package p;

import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p8n0 {
    public final String a;
    public final vpp0 b;
    public final xgn0 c = ygn0.a();
    public final LinkedHashMap d = new LinkedHashMap();
    public Set e = w7x.a;
    public final LinkedHashSet f = new LinkedHashSet();
    public final LinkedHashSet g = new LinkedHashSet();
    public final bpb1 h;
    public final ve01 i;
    public final mr20 j;

    public p8n0(String str, vpp0 vpp0Var, q8n q8nVar) {
        this.a = str;
        this.b = vpp0Var;
        mr20 mr20VarB = gio1.b(mbm.a);
        this.h = mr20VarB;
        lnm lnmVar = null;
        ve01 ve01VarR = d5p1.r(new fu20(new evz(new m441(new m3n0(this, lnmVar, (byte) 1)), new o8n0(4, null, (byte) 0), (byte) 11), new nsm0(2, this, p8n0.class, "handleContextResponse", "handleContextResponse(Lcom/spotify/offline_esperanto/proto/EsOffline$GetContextsResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 3), (byte) 1), us71.h(q8nVar), new alb1(5000L, 0L), 1);
        this.i = ve01VarR;
        this.j = rqt0.u(hu20.d(new mr20[]{mr20VarB, new m441(new m3n0(ve01VarR, lnmVar, (byte) 2))}));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b7 A[Catch: all -> 0x00d9, LOOP:1: B:34:0x00af->B:37:0x00b7, LOOP_END, TRY_ENTER, TryCatch #1 {all -> 0x00d9, blocks: (B:33:0x00ab, B:34:0x00af, B:37:0x00b7, B:40:0x00dc), top: B:68:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc A[EDGE_INSN: B:75:0x00dc->B:40:0x00dc BREAK  A[LOOP:1: B:34:0x00af->B:37:0x00b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0115, code lost:
    
        if (r3.a(r0) == r10) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.Collection r13, p.onm r14) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p8n0.a(java.util.Collection, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(EsOffline.GetContextsResponse getContextsResponse, lnm lnmVar) {
        k8n0 k8n0Var;
        int i;
        Set setKeySet;
        xgn0 xgn0Var;
        LinkedHashMap linkedHashMap;
        Set set;
        gkj1 gkj1Var;
        if (lnmVar instanceof k8n0) {
            k8n0Var = (k8n0) lnmVar;
            int i2 = k8n0Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k8n0Var.h = i2 - Integer.MIN_VALUE;
            } else {
                k8n0Var = new k8n0(this, lnmVar);
            }
        } else {
            k8n0Var = new k8n0(this, lnmVar);
        }
        Object obj = k8n0Var.f;
        int i3 = k8n0Var.h;
        gkj1 gkj1Var2 = gkj1.b;
        rih1 rih1Var = rih1.a;
        gkj1 gkj1Var3 = gkj1.a;
        if (i3 == 0) {
            hm5.M(obj);
            EsOffline.ContextInfo contextInfo = (EsOffline.ContextInfo) o7h.s0(getContextsResponse.p());
            if (contextInfo == null) {
                return rih1Var;
            }
            i = contextInfo.o().q() != poz.b ? 1 : 0;
            List itemsList = contextInfo.getItemsList();
            ArrayList<EsOffline.Item> arrayList = new ArrayList();
            for (Object obj2 : itemsList) {
                if (((EsOffline.Item) obj2).o() == bpz.VIDEO) {
                    arrayList.add(obj2);
                }
            }
            int iS = zno1.s(q7h.U(arrayList, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
            for (EsOffline.Item item : arrayList) {
                String uri = item.getUri();
                cpz cpzVarP = item.p();
                Set set2 = q8n0.a;
                switch (cpzVarP.ordinal()) {
                    case 0:
                        gkj1Var = gkj1Var3;
                        break;
                    case 1:
                    case 2:
                    case 7:
                    case 8:
                        gkj1Var = gkj1.e;
                        break;
                    case 3:
                        gkj1Var = gkj1.d;
                        break;
                    case 4:
                    case 6:
                        gkj1Var = gkj1Var2;
                        break;
                    case 5:
                        gkj1Var = gkj1.c;
                        break;
                    default:
                        eg.o();
                        return null;
                }
                linkedHashMap2.put(uri, gkj1Var);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                if (q8n0.a.contains((gkj1) entry.getValue())) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            setKeySet = linkedHashMap3.keySet();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (((gkj1) entry2.getValue()) != gkj1Var3) {
                    linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                }
            }
            Set setKeySet2 = linkedHashMap4.keySet();
            k8n0Var.a = linkedHashMap2;
            k8n0Var.b = setKeySet;
            k8n0Var.c = setKeySet2;
            xgn0Var = this.c;
            k8n0Var.d = xgn0Var;
            k8n0Var.e = i;
            k8n0Var.h = 1;
            Object objA = xgn0Var.a(k8n0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            linkedHashMap = linkedHashMap2;
            set = setKeySet2;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = k8n0Var.e;
            xgn0Var = k8n0Var.d;
            set = k8n0Var.c;
            setKeySet = k8n0Var.b;
            linkedHashMap = k8n0Var.a;
            hm5.M(obj);
        }
        try {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                LinkedHashSet linkedHashSet = this.g;
                LinkedHashSet linkedHashSet2 = this.f;
                if (!zHasNext) {
                    Set setR1 = o7h.r1(linkedHashMap.keySet(), linkedHashSet2);
                    for (Map.Entry entry3 : this.d.entrySet()) {
                        String str = (String) entry3.getKey();
                        bpb1 bpb1Var = (wen0) entry3.getValue();
                        if (!setR1.contains(str)) {
                            bpb1 bpb1Var2 = bpb1Var;
                            bpb1Var2.getClass();
                            bpb1Var2.m((Object) null, gkj1Var3);
                        }
                    }
                    this.e = setKeySet;
                    linkedHashSet2.removeAll(set);
                    linkedHashSet.retainAll(setKeySet);
                    xgn0Var.c((Object) null);
                    lbm lbmVar = new lbm(i != 0);
                    bpb1 bpb1Var3 = this.h;
                    bpb1Var3.getClass();
                    bpb1Var3.m((Object) null, lbmVar);
                    return rih1Var;
                }
                Map.Entry entry4 = (Map.Entry) it.next();
                String str2 = (String) entry4.getKey();
                gkj1 gkj1Var4 = (gkj1) entry4.getValue();
                if (linkedHashSet2.contains(str2) && gkj1Var4 == gkj1Var3) {
                    gkj1Var4 = gkj1Var2;
                } else if (linkedHashSet.contains(str2) && gkj1Var4 != gkj1Var3) {
                    gkj1Var4 = gkj1Var3;
                }
                str2.getClass();
                f(str2).l(gkj1Var4);
            }
        } catch (Throwable th) {
            xgn0Var.c((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        l8n0 l8n0Var;
        if (onmVar instanceof l8n0) {
            l8n0Var = (l8n0) onmVar;
            int i = l8n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l8n0Var.c = i - Integer.MIN_VALUE;
            } else {
                l8n0Var = new l8n0(this, onmVar);
            }
        } else {
            l8n0Var = new l8n0(this, onmVar);
        }
        Object obj = l8n0Var.a;
        int i2 = l8n0Var.c;
        lnm lnmVar = null;
        boolean z = true;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                uug0 uug0Var = new uug0((Object) this, lnmVar, (byte) 19);
                l8n0Var.c = 1;
                Object objM = rc2.M(10000L, uug0Var, l8n0Var);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (TimeoutCancellationException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        if (r4.a(r1) == r11) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r13, p.onm r14) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p8n0.d(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(List list, onm onmVar) {
        n8n0 n8n0Var;
        if (onmVar instanceof n8n0) {
            n8n0Var = (n8n0) onmVar;
            int i = n8n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n8n0Var.c = i - Integer.MIN_VALUE;
            } else {
                n8n0Var = new n8n0(this, onmVar);
            }
        } else {
            n8n0Var = new n8n0(this, onmVar);
        }
        Object obj = n8n0Var.a;
        int i2 = n8n0Var.c;
        boolean z = true;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                vpp0 vpp0Var = this.b;
                toz tozVarO = EsOffline$DownloadRequest.o();
                tozVarO.r(this.a);
                tozVarO.n(list);
                Single singleA = vpp0Var.a((EsOffline$DownloadRequest) tozVarO.build());
                n8n0Var.c = 1;
                Object objJ = fc11.j(singleA, n8n0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final wen0 f(String str) {
        LinkedHashMap linkedHashMap = this.d;
        Object objB = linkedHashMap.get(str);
        if (objB == null) {
            objB = gio1.b(gkj1.a);
            linkedHashMap.put(str, objB);
        }
        return (wen0) objB;
    }
}
