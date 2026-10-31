package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fum0 {
    public final uu00 a;
    public final q8n b;

    public /* synthetic */ fum0(uu00 uu00Var, q8n q8nVar) {
        this.a = uu00Var;
        this.b = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(ArrayList arrayList, onm onmVar) {
        mfi1 mfi1Var;
        Object next;
        if (onmVar instanceof mfi1) {
            mfi1Var = (mfi1) onmVar;
            int i = mfi1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfi1Var.d = i - Integer.MIN_VALUE;
            } else {
                mfi1Var = new mfi1(this, onmVar);
            }
        } else {
            mfi1Var = new mfi1(this, onmVar);
        }
        Object objI = mfi1Var.b;
        int i2 = mfi1Var.d;
        if (i2 == 0) {
            ArrayList arrayListJ = hrt.j(objI);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jfi1 jfi1Var = ((lfi1) it.next()).a;
                ifi1 ifi1Var = jfi1Var instanceof ifi1 ? (ifi1) jfi1Var : null;
                String str = ifi1Var != null ? ifi1Var.b : null;
                if (str != null) {
                    arrayListJ.add(str);
                }
            }
            List listJ0 = o7h.j0(arrayListJ);
            if (listJ0.isEmpty()) {
                return arrayList;
            }
            List list = listJ0;
            int iS = zno1.s(q7h.U(list, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj : list) {
                linkedHashMap.put("spotify:user:" + URLEncoder.encode((String) obj, "UTF-8"), obj);
            }
            mfi1Var.a = arrayList;
            mfi1Var.d = 1;
            Flowable flowable = this.a.b(new oi("playlist-collaboration", false, new paf(linkedHashMap, (byte) 3))).toFlowable(BackpressureStrategy.d);
            vbm[] vbmVarArr = q601.a;
            objI = b5p1.i(new a1b1(new xkb1(new jha1(o4p1.r(new kge(flowable), this.b), (byte) 29), (byte) 11), linkedHashMap, (byte) 26), mfi1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = mfi1Var.a;
            hm5.M(objI);
        }
        Map map = (Map) objI;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (lfi1 lfi1Var : arrayList) {
            jfi1 jfi1Var2 = lfi1Var.a;
            ifi1 ifi1Var2 = jfi1Var2 instanceof ifi1 ? (ifi1) jfi1Var2 : null;
            if (ifi1Var2 != null) {
                String str2 = ifi1Var2.b;
                zei1 zei1Var = (zei1) map.get(str2);
                if (zei1Var != null) {
                    String str3 = zei1Var.b;
                    Iterator it2 = zei1Var.e.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            yp70 yp70Var = (yp70) next;
                            int i3 = yp70Var.c * yp70Var.b;
                            do {
                                Object next2 = it2.next();
                                yp70 yp70Var2 = (yp70) next2;
                                int i4 = yp70Var2.c * yp70Var2.b;
                                if (i3 < i4) {
                                    next = next2;
                                    i3 = i4;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    yp70 yp70Var3 = (yp70) next;
                    String str4 = yp70Var3 != null ? yp70Var3.a : null;
                    if (str4 == null) {
                        str4 = ifi1Var2.c;
                    }
                    lfi1Var = new lfi1(new ifi1(str3, str2, str4), lfi1Var.b, lfi1Var.c);
                }
            }
            arrayList2.add(lfi1Var);
        }
        return arrayList2;
    }
}
