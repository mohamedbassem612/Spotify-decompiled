package p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z2h {
    public final uu00 a;
    public final xrc0 b;

    public /* synthetic */ z2h(xrc0 xrc0Var, uu00 uu00Var) {
        this.b = xrc0Var;
        this.a = uu00Var;
    }

    public z2h a(String str) {
        Set set = s4b1.f;
        if (uic.k(str, new b3i1[]{nyu0.e, wyu0.f})) {
            return new z2h(this.b, this.a);
        }
        hhg1.n("No collection content loader for ".concat(str));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, onm onmVar) {
        vhu0 vhu0Var;
        if (onmVar instanceof vhu0) {
            vhu0Var = (vhu0) onmVar;
            int i = vhu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vhu0Var.c = i - Integer.MIN_VALUE;
            } else {
                vhu0Var = new vhu0(this, onmVar);
            }
        } else {
            vhu0Var = new vhu0(this, onmVar);
        }
        Object objI = vhu0Var.a;
        int i2 = vhu0Var.c;
        List listK0 = null;
        if (i2 == 0) {
            hm5.M(objI);
            qvc0 qvc0Var = new qvc0(str, (c3d0) null, (Set) null, new iqz0(0, 10), 6);
            vhu0Var.c = 1;
            objI = this.b.i(qvc0Var, vhu0Var);
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
        List list = (List) ((py21) objI).c();
        if (list != null) {
            listK0 = z561.k0(z561.j0(new rlu(z561.T(hxt0.c1, new sgg1(hxt0.b1, new i46(list, (byte) 1))), new cix0((byte) 17), (byte) 0), 4));
        }
        return listK0 == null ? z6x.a : listK0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:65:0x0114  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, onm onmVar) throws Throwable {
        whu0 whu0Var;
        pxc0 pxc0Var;
        String str2;
        String str3;
        qxc0 qxc0Var;
        List list;
        Object objE;
        List list2;
        qxc0 qxc0Var2;
        uhu0 uhu0Var;
        ArrayList arrayList;
        Iterator it;
        pxc0 pxc0Var2;
        sxq0 pxq0Var;
        xkk1 xkk1Var;
        String strQ;
        mmr0 mmr0Var;
        fi90 fi90Var;
        if (onmVar instanceof whu0) {
            whu0Var = (whu0) onmVar;
            int i = whu0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                whu0Var.g = i - Integer.MIN_VALUE;
            } else {
                whu0Var = new whu0(this, onmVar);
            }
        } else {
            whu0Var = new whu0(this, onmVar);
        }
        Object objJ = whu0Var.e;
        int i2 = whu0Var.g;
        String str4 = null;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            rxc0 rxc0Var = new rxc0(str);
            whu0Var.a = str;
            whu0Var.g = 1;
            objJ = this.b.j(rxc0Var, whu0Var);
            if (objJ != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = whu0Var.a;
            hm5.M(objJ);
        } else {
            if (i2 == 2) {
                str3 = whu0Var.c;
                qxc0Var = whu0Var.b;
                hm5.M(objJ);
                list = (List) objJ;
                whu0Var.a = null;
                whu0Var.b = qxc0Var;
                whu0Var.c = str3;
                whu0Var.d = list;
                whu0Var.g = 3;
                objE = e(str3, list, whu0Var);
                if (objE != obj) {
                    objJ = objE;
                    list2 = list;
                    qxc0Var2 = qxc0Var;
                }
                return obj;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = whu0Var.d;
            str3 = whu0Var.c;
            qxc0Var2 = whu0Var.b;
            hm5.M(objJ);
        }
        uhu0Var = (uhu0) objJ;
        arrayList = new ArrayList();
        it = list2.iterator();
        while (it.hasNext()) {
            mmr0Var = (mmr0) uhu0Var.a.get((String) it.next());
            if (mmr0Var != null) {
                jo70 jo70Var = (jo70) mmr0Var.a;
                fi90Var = new fi90(jo70Var.a, m0p1.A(jo70Var), gxo1.q((xkk1) mmr0Var.b));
            } else {
                fi90Var = null;
            }
            if (fi90Var != null) {
                arrayList.add(fi90Var);
            }
        }
        if (qxc0Var2 != null) {
            pxc0Var2 = qxc0Var2.V0;
        } else {
            pxc0Var2 = null;
        }
        if (pxc0Var2 != null) {
            pxq0Var = rxq0.a;
        } else {
            pxq0Var = qxq0.a;
            if (str3 != null) {
                xkk1Var = uhu0Var.b;
                if (xkk1Var != null) {
                    strQ = gxo1.q(xkk1Var);
                    if (strQ.length() > 0) {
                        str4 = strQ;
                    }
                }
                if (str4 != null) {
                    pxq0Var = new pxq0(str4);
                }
            }
        }
        return new y2h(arrayList, pxq0Var);
        qxc0 qxc0Var3 = (qxc0) ((py21) objJ).c();
        if ((qxc0Var3 != null ? qxc0Var3.V0 : null) != null || qxc0Var3 == null || (pxc0Var = qxc0Var3.c) == null || (str2 = pxc0Var.a) == null || ihc1.y0(str2)) {
            str2 = null;
        }
        whu0Var.a = null;
        whu0Var.b = qxc0Var3;
        whu0Var.c = str2;
        whu0Var.g = 2;
        Object objB = b(str, whu0Var);
        if (objB != obj) {
            objJ = objB;
            str3 = str2;
            qxc0Var = qxc0Var3;
            list = (List) objJ;
            whu0Var.a = null;
            whu0Var.b = qxc0Var;
            whu0Var.c = str3;
            whu0Var.d = list;
            whu0Var.g = 3;
            objE = e(str3, list, whu0Var);
            if (objE != obj) {
                objJ = objE;
                list2 = list;
                qxc0Var2 = qxc0Var;
                uhu0Var = (uhu0) objJ;
                arrayList = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                    mmr0Var = (mmr0) uhu0Var.a.get((String) it.next());
                    if (mmr0Var != null) {
                        jo70 jo70Var2 = (jo70) mmr0Var.a;
                        fi90Var = new fi90(jo70Var2.a, m0p1.A(jo70Var2), gxo1.q((xkk1) mmr0Var.b));
                    } else {
                        fi90Var = null;
                    }
                    if (fi90Var != null) {
                        arrayList.add(fi90Var);
                    }
                }
                if (qxc0Var2 != null) {
                    pxc0Var2 = qxc0Var2.V0;
                } else {
                    pxc0Var2 = null;
                }
                if (pxc0Var2 != null) {
                    pxq0Var = rxq0.a;
                } else {
                    pxq0Var = qxq0.a;
                    if (str3 != null) {
                        xkk1Var = uhu0Var.b;
                        if (xkk1Var != null) {
                            strQ = gxo1.q(xkk1Var);
                            if (strQ.length() > 0) {
                                str4 = strQ;
                            }
                        }
                        if (str4 != null) {
                            pxq0Var = new pxq0(str4);
                        }
                    }
                }
                return new y2h(arrayList, pxq0Var);
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable d(ArrayList arrayList, onm onmVar) {
        uzk uzkVar;
        List list;
        if (onmVar instanceof uzk) {
            uzkVar = (uzk) onmVar;
            int i = uzkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uzkVar.c = i - Integer.MIN_VALUE;
            } else {
                uzkVar = new uzk(this, onmVar);
            }
        } else {
            uzkVar = new uzk(this, onmVar);
        }
        Object objG = uzkVar.a;
        int i2 = uzkVar.c;
        if (i2 == 0) {
            hm5.M(objG);
            trc0 trc0Var = new trc0((PlaylistRequestDecorationPolicy) null, (g3d0) null, (Set) null, false, new rrc0(Collections.singleton(dlc0.g)), hqz0.a, (prc0) null, 0, (List) null, 463);
            int iS = zno1.s(q7h.U(arrayList, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj : arrayList) {
                linkedHashMap.put(obj, new wrc0((String) obj, trc0Var));
            }
            uzkVar.c = 1;
            objG = this.b.g(linkedHashMap, (Integer) null, uzkVar);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objG);
        }
        Map map = (Map) objG;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            wsc0 wsc0Var = (wsc0) ((py21) entry.getValue()).c();
            linkedHashMap2.put(key, (wsc0Var == null || (list = wsc0Var.e) == null) ? null : new Integer(list.size()));
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, List list, onm onmVar) throws Throwable {
        xhu0 xhu0Var;
        uhu0 m231Var;
        if (onmVar instanceof xhu0) {
            xhu0Var = (xhu0) onmVar;
            int i = xhu0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xhu0Var.e = i - Integer.MIN_VALUE;
            } else {
                xhu0Var = new xhu0(this, onmVar);
            }
        } else {
            xhu0Var = new xhu0(this, onmVar);
        }
        Object objL = xhu0Var.c;
        int i2 = xhu0Var.e;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                if (list.isEmpty() && str == null) {
                    return uhu0.c;
                }
                Observable observableFilter = this.a.b(new oi("collection-share-card", false, new r3j(list, str, (byte) 5))).filter(dj20.Y0);
                xhu0Var.a = list;
                xhu0Var.b = str;
                xhu0Var.e = 1;
                objL = fc11.l(observableFilter, 1, (Object) null, xhu0Var);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = xhu0Var.b;
                list = xhu0Var.a;
                hm5.M(objL);
            }
            uv00 uv00Var = (uv00) objL;
            xkg0 xkg0Var = new xkg0();
            for (String str2 : list) {
                jo70 jo70Var = uv00Var.a(jo70.class, str2).b;
                xkk1 xkk1Var = uv00Var.a(xkk1.class, str2).b;
                if (jo70Var != null && xkk1Var != null) {
                    xkg0Var.put(str2, new mmr0(jo70Var, xkk1Var));
                }
            }
            m231Var = new uhu0(xkg0Var.b(), str != null ? (xkk1) uv00Var.a(xkk1.class, str).b : null);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null || (thA instanceof TimeoutCancellationException) || !(thA instanceof CancellationException)) {
            return m231Var instanceof m231 ? uhu0.c : m231Var;
        }
        throw thA;
    }

    public z2h(uu00 uu00Var, xrc0 xrc0Var) {
        this.a = uu00Var;
        this.b = xrc0Var;
    }
}
