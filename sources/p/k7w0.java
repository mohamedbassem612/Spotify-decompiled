package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k7w0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n7w0 b;
    public final /* synthetic */ d331 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7w0(n7w0 n7w0Var, d331 d331Var, byte b) {
        super(0);
        this.a = b;
        this.b = n7w0Var;
        this.c = d331Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d1 A[LOOP:4: B:93:0x01cb->B:95:0x01d1, LOOP_END] */
    public final Object invoke() {
        eso esoVar;
        rih1 rih1Var;
        hso hsoVar;
        int i;
        ArrayList arrayList;
        n7r n7rVar;
        int i2;
        xxk vxkVar;
        String str;
        byte b = this.a;
        rih1 rih1Var2 = rih1.a;
        y231 y231Var = this.c;
        n7w0 n7w0Var = this.b;
        switch (b) {
            case 0:
                if (y231Var.equals(l231.a) && (esoVar = n7w0Var.a.t) != null) {
                    n7w0Var.d.a(esoVar, null);
                }
                return rih1Var2;
            default:
                y231 y231Var2 = y231Var instanceof y231 ? y231Var : null;
                if (y231Var2 != null && (hsoVar = (hso) y231Var2.a) != null) {
                    LinkedHashMap linkedHashMap = hsoVar.a;
                    s7w0 s7w0Var = n7w0Var.a;
                    eso esoVar2 = s7w0Var.t;
                    if (esoVar2 != null) {
                        List list = esoVar2.b;
                        List<evb1> list2 = list;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            linkedHashSet.add(new jvb1(((evb1) it.next()).a));
                        }
                        if (linkedHashSet.size() == list.size()) {
                            Set setV0 = dm61.v0(linkedHashMap.keySet(), linkedHashSet);
                            if (setV0.isEmpty()) {
                                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                                for (evb1 evb1Var : list2) {
                                    String str2 = evb1Var.a;
                                    kvb1 kvb1Var = evb1Var.b;
                                    mvb1 mvb1Var = (mvb1) linkedHashMap.get(new jvb1(str2));
                                    if (mvb1Var == null || kvb1Var.K0(mvb1Var)) {
                                        arrayList2.add(new evb1(str2, kvb1Var, mvb1Var, evb1Var.d));
                                    } else {
                                        hhg1.f(gvg.h("Unexpected result ", mvb1Var.getClass().getName(), " for step ", str2));
                                    }
                                }
                                s7w0Var.t = new eso(esoVar2.a, arrayList2, esoVar2.c);
                                b431 b431Var = n7w0Var.e;
                                ekn eknVar = hsoVar.b;
                                Collection collectionValues = linkedHashMap.values();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj : collectionValues) {
                                    if (obj instanceof xne0) {
                                        arrayList3.add(obj);
                                    }
                                }
                                xne0 xne0Var = (xne0) o7h.s0(arrayList3);
                                String str3 = (xne0Var == null || (str = xne0Var.a) == null || ihc1.y0(str)) ? null : str;
                                String str4 = eknVar.a;
                                jaw0 jaw0Var = eknVar.b;
                                qxk qxkVar = new qxk(jaw0Var.a, jaw0Var.b);
                                ArrayList<z681> arrayList4 = eknVar.c;
                                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                                for (z681 z681Var : arrayList4) {
                                    if (z681Var instanceof y681) {
                                        vxkVar = new wxk(((y681) z681Var).a);
                                    } else if (z681Var instanceof x681) {
                                        x681 x681Var = (x681) z681Var;
                                        vxkVar = new vxk(x681Var.a, x681Var.d, x681Var.b, x681Var.c);
                                    } else {
                                        eg.o();
                                    }
                                    arrayList5.add(new uxk(vxkVar));
                                }
                                zlk1 zlk1Var = eknVar.d;
                                yxk yxkVar = new yxk(zlk1Var.a, zlk1Var.b);
                                xk41 xk41Var = eknVar.e;
                                int i3 = xk41Var != null ? xk41Var.a : 0;
                                int i4 = i3 == 0 ? -1 : kzk.a[l1d.C(i3)];
                                int i5 = 1;
                                if (i4 == -1) {
                                    i = 1;
                                    if (xk41Var == null && (n7rVar = xk41Var.b) != null) {
                                        switch (n7rVar.ordinal()) {
                                            case 0:
                                                break;
                                            case 1:
                                                i5 = 2;
                                                break;
                                            case 2:
                                                i5 = 3;
                                                break;
                                            case 3:
                                                i5 = 4;
                                                break;
                                            case 4:
                                                i2 = 5;
                                                i5 = i2;
                                                break;
                                            case 5:
                                                i2 = 6;
                                                i5 = i2;
                                                break;
                                            case 6:
                                                i2 = 7;
                                                i5 = i2;
                                                break;
                                            default:
                                                eg.o();
                                                break;
                                        }
                                    } else {
                                        i5 = 0;
                                    }
                                    sxk sxkVar = new sxk(i, i5);
                                    String str5 = eknVar.t;
                                    boolean z = eknVar.f;
                                    ArrayList<e311> arrayList6 = eknVar.g;
                                    arrayList = new ArrayList(q7h.U(arrayList6, 10));
                                    for (e311 e311Var : arrayList6) {
                                        arrayList.add(new rxk(e311Var.a, e311Var.b, e311Var.e, e311Var.c));
                                        rih1Var2 = rih1Var2;
                                    }
                                    rih1Var = rih1Var2;
                                    b431Var.a(new pxk(str4, qxkVar, arrayList5, yxkVar, sxkVar, null, str5, z, arrayList, eknVar.h, eknVar.i, str3, 8736), null);
                                } else {
                                    if (i4 == 1) {
                                        i = 2;
                                    } else if (i4 == 2) {
                                        i = 3;
                                    } else if (i4 == 3) {
                                        i = 4;
                                    } else if (i4 == 4) {
                                        i = 1;
                                    } else {
                                        eg.o();
                                    }
                                    if (xk41Var == null) {
                                        i5 = 0;
                                    } else {
                                        i5 = 0;
                                    }
                                    sxk sxkVar2 = new sxk(i, i5);
                                    String str6 = eknVar.t;
                                    boolean z2 = eknVar.f;
                                    ArrayList<e311> arrayList7 = eknVar.g;
                                    arrayList = new ArrayList(q7h.U(arrayList7, 10));
                                    while (r5.hasNext()) {
                                        arrayList.add(new rxk(e311Var.a, e311Var.b, e311Var.e, e311Var.c));
                                        rih1Var2 = rih1Var2;
                                    }
                                    rih1Var = rih1Var2;
                                    b431Var.a(new pxk(str4, qxkVar, arrayList5, yxkVar, sxkVar2, null, str6, z2, arrayList, eknVar.h, eknVar.i, str3, 8736), null);
                                }
                            } else {
                                hhg1.f("Results contain unknown step keys: ".concat(o7h.y0(setV0, (CharSequence) null, (String) null, (String) null, cgb1.Q0, 31)));
                            }
                        } else {
                            hhg1.n("Customization plan must contain unique step keys");
                        }
                    } else {
                        eg.m("Customization completed without an active session");
                    }
                    return null;
                }
                rih1Var = rih1Var2;
                return rih1Var;
        }
    }
}
