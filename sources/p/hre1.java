package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hre1 {
    public final gn0 a;
    public final Flowable b;

    public hre1(gn0 gn0Var, Flowable flowable) {
        this.a = gn0Var;
        this.b = flowable;
    }

    public static on0 b(List list) {
        if (list.isEmpty()) {
            hhg1.n("timestamps must not be empty");
            return null;
        }
        List list2 = list;
        boolean z = list2 instanceof Collection;
        if (!z || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!(((xve1) it.next()) instanceof tve1)) {
                    if (!z || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (!(((xve1) it2.next()) instanceof uve1)) {
                                hhg1.n("toUser requires only Creator or only Ingested timestamps");
                                return null;
                            }
                        }
                    }
                    return on0.d;
                }
            }
        }
        return on0.c;
    }

    public static String d(PlayerState playerState, String str) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (contextTrack != null && u890.j(contextTrack.uri(), str)) {
            return (String) playerState.playbackId().h();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:13:0x003f, B:34:0x00db, B:36:0x00e3, B:39:0x00ea, B:25:0x0087, B:27:0x008d, B:29:0x00a7, B:30:0x00aa, B:41:0x00fd, B:18:0x0052, B:24:0x006c, B:21:0x0059), top: B:45:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7 A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:13:0x003f, B:34:0x00db, B:36:0x00e3, B:39:0x00ea, B:25:0x0087, B:27:0x008d, B:29:0x00a7, B:30:0x00aa, B:41:0x00fd, B:18:0x0052, B:24:0x006c, B:21:0x0059), top: B:45:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3 A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:13:0x003f, B:34:0x00db, B:36:0x00e3, B:39:0x00ea, B:25:0x0087, B:27:0x008d, B:29:0x00a7, B:30:0x00aa, B:41:0x00fd, B:18:0x0052, B:24:0x006c, B:21:0x0059), top: B:45:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00da -> B:34:0x00db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r12, java.lang.String r13, p.on0 r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hre1.a(java.util.List, java.lang.String, p.on0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        bre1 bre1Var;
        if (onmVar instanceof bre1) {
            bre1Var = (bre1) onmVar;
            int i = bre1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bre1Var.d = i - Integer.MIN_VALUE;
            } else {
                bre1Var = new bre1(this, onmVar);
            }
        } else {
            bre1Var = new bre1(this, onmVar);
        }
        Object objI = bre1Var.b;
        int i2 = bre1Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            vbm[] vbmVarArr = q601.a;
            kge kgeVar = new kge(this.b);
            bre1Var.a = str;
            bre1Var.d = 1;
            objI = b5p1.i(kgeVar, bre1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = bre1Var.a;
            hm5.M(objI);
        }
        return d((PlayerState) objI, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable e(String str, List list, onm onmVar) {
        cre1 cre1Var;
        if (onmVar instanceof cre1) {
            cre1Var = (cre1) onmVar;
            int i = cre1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cre1Var.c = i - Integer.MIN_VALUE;
            } else {
                cre1Var = new cre1(this, onmVar);
            }
        } else {
            cre1Var = new cre1(this, onmVar);
        }
        Object objA = cre1Var.a;
        int i2 = cre1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            if (list.isEmpty()) {
                hhg1.n("timestamps must not be empty");
                return null;
            }
            cre1Var.c = 1;
            objA = a(list, str, on0.b, cre1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        List list2 = (List) objA;
        if (list2 == null) {
            return null;
        }
        List list3 = list2;
        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(tve1.a(((Number) it.next()).longValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable f(String str, List list, onm onmVar) {
        dre1 dre1Var;
        if (onmVar instanceof dre1) {
            dre1Var = (dre1) onmVar;
            int i = dre1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dre1Var.c = i - Integer.MIN_VALUE;
            } else {
                dre1Var = new dre1(this, onmVar);
            }
        } else {
            dre1Var = new dre1(this, onmVar);
        }
        Object objA = dre1Var.a;
        int i2 = dre1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            if (list.isEmpty()) {
                hhg1.n("timestamps must not be empty");
                return null;
            }
            dre1Var.c = 1;
            objA = a(list, str, on0.d, dre1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        List list2 = (List) objA;
        if (list2 == null) {
            return null;
        }
        List list3 = list2;
        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(uve1.a(((Number) it.next()).longValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, ArrayList arrayList, xqe1 xqe1Var, onm onmVar) throws NoWhenBranchMatchedException {
        fre1 fre1Var;
        kn0 kn0Var;
        if (onmVar instanceof fre1) {
            fre1Var = (fre1) onmVar;
            int i = fre1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fre1Var.c = i - Integer.MIN_VALUE;
            } else {
                fre1Var = new fre1(this, onmVar);
            }
        } else {
            fre1Var = new fre1(this, onmVar);
        }
        Object objJ = fre1Var.a;
        int i2 = fre1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                on0 on0VarB = b(arrayList);
                int iOrdinal = xqe1Var.ordinal();
                if (iOrdinal == 0) {
                    kn0Var = kn0.c;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    kn0Var = kn0.d;
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(yah0.q(lm5.v((xve1) it.next())));
                }
                jge jgeVarI = i(arrayList2, str, on0VarB);
                kwb1 kwb1Var = new kwb1(kn0Var, (lnm) null, (byte) 9);
                fre1Var.c = 1;
                objJ = b5p1.j(jgeVarI, kwb1Var, fre1Var);
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
            return ((yqe1) objJ).a();
        } catch (Exception unused) {
            op71.x(fre1Var.getContext());
            return null;
        }
    }

    public final lt20 h(String str, List list) {
        on0 on0VarB = b(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(lm5.v((xve1) it.next())));
        }
        return x4p1.h(rqt0.u(new tf2(i(arrayList, str, on0VarB), (byte) 27)), new q8t0((byte) 18));
    }

    public final jge i(ArrayList arrayList, String str, on0 on0Var) {
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
        }
        vbm[] vbmVarArr = q601.a;
        return hu20.e(rqt0.u(new mpy0(new kge(this.b), this, str, (byte) 20)), new kdk(this, arrayList2, str, on0Var, (lnm) null, (byte) 4));
    }
}
