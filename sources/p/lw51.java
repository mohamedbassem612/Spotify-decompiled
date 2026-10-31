package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lw51 {
    public static final PlaylistRequestDecorationPolicy g;
    public static final PlaylistRequestDecorationPolicy h;
    public final xrc0 a;
    public final iyc0 b;
    public final z6k0 c;
    public final mnk0 d;
    public final wm90 e;
    public final hp91 f;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        hru0VarS.x(sku0VarP);
        g = hru0VarS.build();
        hru0 hru0VarS2 = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.A();
        iou0VarV.D(true);
        hru0VarS2.v(iou0VarV);
        h = hru0VarS2.build();
    }

    public lw51(xrc0 xrc0Var, iyc0 iyc0Var, z6k0 z6k0Var, mnk0 mnk0Var, wm90 wm90Var, hp91 hp91Var) {
        this.a = xrc0Var;
        this.b = iyc0Var;
        this.c = z6k0Var;
        this.d = mnk0Var;
        this.e = wm90Var;
        this.f = hp91Var;
    }

    public static ly21 b(String str) {
        return new ly21(new iy21(str));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(String str, List list, List list2, ddd1 ddd1Var, List list3, List list4, boolean z, onm onmVar) {
        iw51 iw51Var;
        ly21 m231Var;
        lw51 lw51Var;
        List list5;
        if (onmVar instanceof iw51) {
            iw51Var = (iw51) onmVar;
            int i = iw51Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                iw51Var.d = i - Integer.MIN_VALUE;
            } else {
                iw51Var = new iw51(this, onmVar);
            }
        } else {
            iw51Var = new iw51(this, onmVar);
        }
        iw51 iw51Var2 = iw51Var;
        Object objO = iw51Var2.b;
        int i2 = iw51Var2.d;
        try {
            if (i2 == 0) {
                ArrayList arrayListJ = hrt.j(objO);
                Iterator it = list3.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    while (true) {
                        if (i3 >= list.size()) {
                            list5 = list;
                            break;
                        }
                        list5 = list;
                        if (u890.j(list5.get(i3), str2)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == list5.size()) {
                        return b("Added tracks do not match the selection");
                    }
                    arrayListJ.add(new Integer(i3));
                    i3++;
                }
                ba80 ba80VarU1 = o7h.u1(arrayListJ);
                int iS = zno1.s(q7h.U(ba80VarU1, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                ca80 it2 = ba80VarU1.iterator();
                while (true) {
                    ca80 ca80Var = it2;
                    if (!((Iterator) ca80Var.c).hasNext()) {
                        break;
                    }
                    aa80 aa80Var = (aa80) ca80Var.next();
                    linkedHashMap.put(aa80Var.b, new Integer(aa80Var.a));
                }
                List list6 = list2;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list6) {
                    if (obj instanceof hw51) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    hw51 hw51Var = (hw51) obj2;
                    Integer num = (Integer) linkedHashMap.get(new Integer(hw51Var.a));
                    if (z && num != null) {
                        Integer num2 = (Integer) linkedHashMap.get(new Integer(hw51Var.a + 1));
                        int iIntValue = num.intValue() + 1;
                        if (num2 != null && num2.intValue() == iIntValue) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                ArrayList<gw51> arrayList3 = new ArrayList();
                for (Object obj3 : list6) {
                    if (obj3 instanceof gw51) {
                        arrayList3.add(obj3);
                    }
                }
                int iS2 = zno1.s(q7h.U(arrayList3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (gw51 gw51Var : arrayList3) {
                    linkedHashMap2.put(new Integer(gw51Var.a), new Double(gw51Var.b));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    int iIntValue2 = ((Number) entry.getKey()).intValue();
                    double dDoubleValue = ((Number) entry.getValue()).doubleValue();
                    if (linkedHashMap.containsKey(new Integer(iIntValue2)) && dDoubleValue != 1.0d) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                if (arrayList2.isEmpty() && linkedHashMap3.isEmpty()) {
                    return new oy21(rih1.a);
                }
                long size = (((long) (arrayList2.size() + linkedHashMap3.size())) * 1000) + 5000;
                long j = size > 15000 ? 15000L : size;
                jw51 jw51Var = new jw51(this, linkedHashMap3, arrayList2, list4, str, ddd1Var, list3, linkedHashMap, null);
                iw51Var2.a = this;
                iw51Var2.d = 1;
                objO = rc2.O(j, jw51Var, iw51Var2);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
                lw51Var = this;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lw51Var = iw51Var2.a;
                hm5.M(objO);
            }
            m231Var = (py21) objO;
            if (m231Var == null) {
                lw51Var.getClass();
                m231Var = b("Timed out copying selected speeds and transitions");
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            return m231Var;
        }
        Logger.e(thA, "Failed to copy selected speeds and transitions", new Object[0]);
        String message = thA.getMessage();
        return b(message != null ? message : "Failed to copy selected speeds and transitions");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(String str, List list, onm onmVar) {
        kw51 kw51Var;
        List list2;
        if (onmVar instanceof kw51) {
            kw51Var = (kw51) onmVar;
            int i = kw51Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kw51Var.d = i - Integer.MIN_VALUE;
            } else {
                kw51Var = new kw51(this, onmVar);
            }
        } else {
            kw51Var = new kw51(this, onmVar);
        }
        Object objF = kw51Var.b;
        int i2 = kw51Var.d;
        if (i2 == 0) {
            hm5.M(objF);
            trc0 trc0Var = new trc0(h, (g3d0) null, Collections.singleton(wqc0.a), false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 474);
            kw51Var.a = list;
            kw51Var.d = 1;
            objF = this.a.f(str, trc0Var, kw51Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
            list2 = list;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = kw51Var.a;
            hm5.M(objF);
        }
        oy21 oy21Var = (py21) objF;
        if (oy21Var instanceof ly21) {
            return oy21Var;
        }
        if (!(oy21Var instanceof oy21)) {
            eg.o();
            return null;
        }
        List list3 = ((wsc0) oy21Var.a).e;
        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((zuc0) it.next()).c);
        }
        if (!arrayList.equals(list2)) {
            return b("New playlist tracks do not match the selection");
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((zuc0) it2.next()).a);
        }
        return new oy21(arrayList2);
    }
}
