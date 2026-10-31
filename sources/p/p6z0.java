package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p6z0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6z0 b;

    public /* synthetic */ p6z0(t6z0 t6z0Var, byte b) {
        this.a = b;
        this.b = t6z0Var;
    }

    public final Object apply(Object obj) {
        List listSingletonList;
        int i;
        byte b = this.a;
        t6z0 t6z0Var = this.b;
        switch (b) {
            case 0:
                z4z0 z4z0Var = (z4z0) obj;
                return t6z0Var.i.b(new oi("queue", false, new n6z0(z4z0Var, (byte) 0))).filter(w1x0.d).take(1L).map(new hvp0(z4z0Var, (byte) 29)).onErrorReturn(new o6z0(z4z0Var, (byte) 0));
            default:
                r5z0 r5z0Var = (r5z0) obj;
                List list = r5z0Var.d;
                smc0 smc0VarN = k4p1.n();
                ContextTrack contextTrack = r5z0Var.e;
                if (contextTrack != null) {
                    smc0VarN.add(new mmr0(contextTrack, new tr80(1, 4, 1)));
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                if (!list.isEmpty()) {
                    ylm ylmVar = t6z0Var.e;
                    List list2 = list;
                    List listK0 = o7h.K0(ylmVar.a, o7h.p1(list2));
                    List listK1 = o7h.K0(list2, o7h.p1(ylmVar.a));
                    ArrayList arrayList = new ArrayList(ylmVar.b);
                    Iterator it = listK0.iterator();
                    while (it.hasNext()) {
                        arrayList.removeIf(new l61(ylmVar, it.next()));
                    }
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((ContextTrack) it2.next());
                    }
                    Iterator it3 = listK1.iterator();
                    while (true) {
                        int i2 = -1;
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            if (!arrayList2.contains((ContextTrack) next)) {
                                cqz0 cqz0Var = bf81.a;
                                int iIndexOf = list.indexOf(next);
                                int size = arrayList.size();
                                if (size <= 1) {
                                    i = 0;
                                } else {
                                    int i3 = size + 1;
                                    ArrayList arrayList3 = new ArrayList(i3);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        arrayList3.add(Double.valueOf(1.0d / ((double) (Math.abs(iIndexOf - i4) + 1))));
                                    }
                                    Double dValueOf = Double.valueOf(0.0d);
                                    int iU = q7h.U(arrayList3, 9);
                                    if (iU == 0) {
                                        listSingletonList = Collections.singletonList(dValueOf);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(iU + 1);
                                        arrayList4.add(dValueOf);
                                        Iterator it4 = arrayList3.iterator();
                                        while (it4.hasNext()) {
                                            dValueOf = Double.valueOf(dValueOf.doubleValue() + ((Number) it4.next()).doubleValue());
                                            arrayList4.add(dValueOf);
                                        }
                                        listSingletonList = arrayList4;
                                    }
                                    cqz0 cqz0Var2 = bf81.a;
                                    double dDoubleValue = ((Number) o7h.A0(listSingletonList)).doubleValue();
                                    cqz0Var2.getClass();
                                    double dC = dqz0.b.c(dDoubleValue);
                                    Iterator it5 = listSingletonList.iterator();
                                    int i5 = 0;
                                    while (it5.hasNext()) {
                                        if (((Number) it5.next()).doubleValue() > dC) {
                                            i2 = i5;
                                            i = i2 - 1;
                                        } else {
                                            i5++;
                                        }
                                    }
                                    i = i2 - 1;
                                }
                                arrayList.add(i, next);
                            }
                        } else {
                            rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
                            while (true) {
                                rmc0 rmc0Var = rmc0VarListIterator;
                                if (rmc0Var.hasNext()) {
                                    mmr0 mmr0Var = (mmr0) rmc0Var.next();
                                    Object obj2 = mmr0Var.a;
                                    tr80 tr80Var = (tr80) mmr0Var.b;
                                    if (list.contains(obj2)) {
                                        int iIndexOf2 = arrayList.indexOf(obj2);
                                        int i6 = ((rr80) tr80Var).a;
                                        if (iIndexOf2 > ((rr80) tr80Var).b || i6 > iIndexOf2) {
                                            if (iIndexOf2 != -1) {
                                                LinkedHashSet linkedHashSetV0 = o7h.v0(tr80Var, yoi1.Q(0, arrayList.size()));
                                                if (!linkedHashSetV0.isEmpty()) {
                                                    int iIntValue = ((Number) o7h.P0(linkedHashSetV0, dqz0.a)).intValue();
                                                    Object obj3 = arrayList.get(iIndexOf2);
                                                    arrayList.set(iIndexOf2, arrayList.get(iIntValue));
                                                    arrayList.set(iIntValue, obj3);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    ylmVar.a = list;
                                    ylmVar.b = arrayList;
                                    list = arrayList;
                                }
                            }
                        }
                    }
                }
                return Single.just(new m7z0(list)).toObservable();
        }
    }
}
