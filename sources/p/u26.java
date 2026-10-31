package p;

import android.graphics.Rect;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u26 {
    public final /* synthetic */ byte a;

    public final ice1 a(ice1 ice1Var) {
        AbstractList<qzd1> abstractList;
        AbstractList abstractList2;
        AbstractList<qzd1> abstractList3;
        AbstractList abstractList4;
        switch (this.a) {
            case 0:
                mj80 mj80Var = ice1Var.a;
                ArrayList<mmr0> arrayList = ice1Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (mmr0 mmr0Var : arrayList) {
                    szd1 szd1Var = (szd1) mmr0Var.a;
                    Set set = (Set) mmr0Var.b;
                    wbe1 wbe1Var = wbe1.b;
                    Rect rect = (Rect) ((o5) szd1Var).c;
                    arrayList2.add(new mmr0(szd1Var, dm61.x0(new xbe1(wbe1Var, ((rect.width() / mj80Var.d) * rect.height()) / mj80Var.e), set)));
                }
                return new ice1(mj80Var, arrayList2);
            case 1:
                mj80 mj80Var2 = ice1Var.a;
                ArrayList<mmr0> arrayList3 = ice1Var.b;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                for (mmr0 mmr0Var2 : arrayList3) {
                    szd1 szd1Var2 = (szd1) mmr0Var2.a;
                    Set set2 = (Set) mmr0Var2.b;
                    wbe1 wbe1Var2 = wbe1.a;
                    synchronized (szd1Var2) {
                        abstractList = szd1Var2.e;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (qzd1 qzd1Var : abstractList) {
                        synchronized (qzd1Var) {
                            abstractList2 = qzd1Var.e;
                        }
                        r7h.W(abstractList2, arrayList5);
                    }
                    float size = 0.0f;
                    if (!arrayList5.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it = arrayList5.iterator();
                        while (it.hasNext()) {
                            arrayList6.add(Float.valueOf(((pzd1) it.next()).e));
                        }
                        Iterator it2 = arrayList6.iterator();
                        while (it2.hasNext()) {
                            size += ((Number) it2.next()).floatValue();
                        }
                        size /= arrayList5.size();
                    }
                    arrayList4.add(new mmr0(szd1Var2, dm61.x0(new xbe1(wbe1Var2, size), set2)));
                }
                return new ice1(mj80Var2, arrayList4);
            case 2:
                mj80 mj80Var3 = ice1Var.a;
                ArrayList<mmr0> arrayList7 = ice1Var.b;
                ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
                for (mmr0 mmr0Var3 : arrayList7) {
                    szd1 szd1Var3 = (szd1) mmr0Var3.a;
                    Set set3 = (Set) mmr0Var3.b;
                    wbe1 wbe1Var3 = wbe1.d;
                    int iCenterX = ((Rect) ((o5) szd1Var3).c).centerX();
                    float f = mj80Var3.d / 2.0f;
                    arrayList8.add(new mmr0(szd1Var3, dm61.x0(new xbe1(wbe1Var3, 1.0f - (Math.abs(iCenterX - f) / f)), set3)));
                }
                return new ice1(mj80Var3, arrayList8);
            case 3:
                mj80 mj80Var4 = ice1Var.a;
                ArrayList<mmr0> arrayList9 = ice1Var.b;
                ArrayList arrayList10 = new ArrayList(q7h.U(arrayList9, 10));
                for (mmr0 mmr0Var4 : arrayList9) {
                    szd1 szd1Var4 = (szd1) mmr0Var4.a;
                    arrayList10.add(new mmr0(szd1Var4, dm61.x0(new xbe1(wbe1.c, 1.0f - (((Rect) ((o5) szd1Var4).c).top / mj80Var4.e)), (Set) mmr0Var4.b)));
                }
                return new ice1(mj80Var4, arrayList10);
            default:
                mj80 mj80Var5 = ice1Var.a;
                ArrayList<mmr0> arrayList11 = ice1Var.b;
                ArrayList arrayList12 = new ArrayList(q7h.U(arrayList11, 10));
                for (mmr0 mmr0Var5 : arrayList11) {
                    szd1 szd1Var5 = (szd1) mmr0Var5.a;
                    Set set4 = (Set) mmr0Var5.b;
                    wbe1 wbe1Var4 = wbe1.e;
                    synchronized (szd1Var5) {
                        abstractList3 = szd1Var5.e;
                    }
                    ArrayList arrayList13 = new ArrayList();
                    for (qzd1 qzd1Var2 : abstractList3) {
                        synchronized (qzd1Var2) {
                            abstractList4 = qzd1Var2.e;
                        }
                        r7h.W(abstractList4, arrayList13);
                    }
                    arrayList12.add(new mmr0(szd1Var5, dm61.x0(new xbe1(wbe1Var4, Math.min(1.0f, arrayList13.size() / 10.0f)), set4)));
                }
                return new ice1(mj80Var5, arrayList12);
        }
    }
}
