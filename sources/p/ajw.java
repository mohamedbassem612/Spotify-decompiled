package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ajw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ blw a;

    public ajw(blw blwVar) {
        this.a = blwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ziw ziwVar;
        huz huzVar;
        Long l;
        String strL;
        Long l2;
        gad0 gad0Var;
        if (onmVar instanceof ziw) {
            ziwVar = (ziw) onmVar;
            int i = ziwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ziwVar.b = i - Integer.MIN_VALUE;
            } else {
                ziwVar = new ziw(this, onmVar);
            }
        } else {
            ziwVar = new ziw(this, onmVar);
        }
        Object obj2 = ziwVar.a;
        int i2 = ziwVar.b;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        haa0 haa0Var = this.a.a;
        yad0 yad0Var = ((hbw) obj).a;
        Map map = yad0Var.a;
        Map map2 = yad0Var.b;
        boolean zIsEmpty = map.isEmpty();
        iad0 iad0Var = iad0.a;
        if (zIsEmpty) {
            huzVar = new huz(iad0Var, (byte) 10);
        } else if (map.size() == 1) {
            zad0 zad0Var = (zad0) map2.get(o7h.p0(map.keySet()));
            huzVar = (zad0Var == null || (gad0Var = zad0Var.b) == null || gad0Var.a.length() == 0) ? new huz(iad0Var, (byte) 10) : new m441(new k1e0((Object) haa0Var, (Object) gad0Var, lnmVar, (byte) 0));
        } else {
            List listL1 = o7h.l1(map2.values());
            yqg yqgVar = (yqg) haa0Var.d;
            List list = listL1;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                gad0 gad0Var2 = ((zad0) obj3).b;
                if (gad0Var2 != null && gad0Var2.c && gad0Var2.a.length() > 0) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : list) {
                gad0 gad0Var3 = ((zad0) obj4).b;
                if (gad0Var3 != null && !gad0Var3.c && gad0Var3.a.length() != 0 && (l2 = gad0Var3.d) != null) {
                    if (yqgVar.b() - l2.longValue() <= 604800000) {
                        arrayList2.add(obj4);
                    }
                }
            }
            int size = arrayList2.size() + arrayList.size();
            if (size == 0) {
                huzVar = new huz(iad0Var, (byte) 10);
            } else if (arrayList.size() == 1 && size == 1) {
                zad0 zad0Var2 = (zad0) o7h.q0(arrayList);
                gad0 gad0Var4 = zad0Var2.b;
                huzVar = (gad0Var4 == null || (strL = haa0.l(zad0Var2.a, map)) == null) ? new huz(iad0Var, (byte) 10) : new huz(new mad0(gad0Var4.d, zad0Var2.a, strL, gad0Var4.a, gad0Var4.b), (byte) 10);
            } else if (arrayList.size() == 1) {
                String strL2 = haa0.l(((zad0) o7h.q0(arrayList)).a, map);
                huzVar = strL2 == null ? new huz(iad0Var, (byte) 10) : new huz(new nad0(strL2), (byte) 10);
            } else if (!arrayList.isEmpty()) {
                huzVar = new huz(new jad0(arrayList.size()), (byte) 10);
            } else if (arrayList2.size() == 1) {
                zad0 zad0Var3 = (zad0) o7h.q0(arrayList2);
                gad0 gad0Var5 = zad0Var3.b;
                if (gad0Var5 == null || (l = gad0Var5.d) == null) {
                    huzVar = new huz(iad0Var, (byte) 10);
                } else {
                    long jLongValue = l.longValue();
                    String strL3 = haa0.l(zad0Var3.a, map);
                    huzVar = strL3 == null ? new huz(iad0Var, (byte) 10) : new syt(new m441(new tfb0(false, l, yqgVar, (ihd0) haa0Var.c, true, null)), zad0Var3, strL3, gad0Var5, jLongValue, (byte) 1);
                }
            } else {
                huzVar = new huz(kad0.a, (byte) 10);
            }
        }
        wmk wmkVar = new wmk(r261Var, (byte) 6);
        ziwVar.b = 1;
        Object objCollect = huzVar.collect(new fed0((vr20) wmkVar, (byte) 22), ziwVar);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
