package p;

import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jzu0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qzu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jzu0(qzu0 qzu0Var, byte b) {
        super(0);
        this.a = b;
        this.b = qzu0Var;
    }

    public final Object invoke() {
        xzq xzqVarU;
        byte b = this.a;
        byte b2 = 0;
        rih1 rih1Var = rih1.a;
        qzu0 qzu0Var = this.b;
        switch (b) {
            case 0:
                tuj tujVar = qzu0Var.y0;
                if (tujVar == null) {
                    return rih1Var;
                }
                pbq pbqVar = qzu0Var.w0;
                ComposeView composeView = (ComposeView) qzu0Var.u0.b;
                if (composeView != null) {
                    j1v0 j1v0Var = tujVar.m;
                    ArrayList<s1v0> arrayList = j1v0Var.f;
                    int iS = zno1.s(q7h.U(arrayList, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                    for (s1v0 s1v0Var : arrayList) {
                        String str = s1v0Var.a;
                        yqw yqwVar = (yqw) ((zqw) s1v0Var.b).e().invoke();
                        if (yqwVar instanceof wqw) {
                            xzqVarU = ((wqw) yqwVar).a;
                        } else if (yqwVar instanceof xqw) {
                            xzqVarU = q1o1.u(((xqw) yqwVar).a, u291.f(nim0.a, 1.0f), (FrameLayout.LayoutParams) null, 4);
                        } else {
                            eg.o();
                        }
                        linkedHashMap.put(str, xzqVarU);
                    }
                    j1v0Var.n = linkedHashMap;
                    ArrayList<s1v0> arrayList2 = j1v0Var.h;
                    int iS2 = zno1.s(q7h.U(arrayList2, 10));
                    if (iS2 < 16) {
                        iS2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2);
                    for (s1v0 s1v0Var2 : arrayList2) {
                        linkedHashMap2.put(s1v0Var2.a, vno1.m((tf51) s1v0Var2.b));
                    }
                    j1v0Var.o = linkedHashMap2;
                    ArrayList<s1v0> arrayList3 = j1v0Var.i;
                    int iS3 = zno1.s(q7h.U(arrayList3, 10));
                    if (iS3 < 16) {
                        iS3 = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS3);
                    for (s1v0 s1v0Var3 : arrayList3) {
                        linkedHashMap3.put(s1v0Var3.a, vno1.m((tf51) s1v0Var3.b));
                    }
                    j1v0Var.f17p = linkedHashMap3;
                    ArrayList<s1v0> arrayList4 = j1v0Var.j;
                    int iS4 = zno1.s(q7h.U(arrayList4, 10));
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iS4 >= 16 ? iS4 : 16);
                    for (s1v0 s1v0Var4 : arrayList4) {
                        linkedHashMap4.put(s1v0Var4.a, vno1.m((tf51) s1v0Var4.b));
                    }
                    j1v0Var.q = linkedHashMap4;
                    LinkedHashMap linkedHashMap5 = j1v0Var.o;
                    if (linkedHashMap5 == null) {
                        u890.C("sectionAboveElementsAndCompanions");
                        throw null;
                    }
                    LinkedHashMap linkedHashMap6 = j1v0Var.f17p;
                    if (linkedHashMap6 == null) {
                        u890.C("sectionBelowElementsAndCompanions");
                        throw null;
                    }
                    LinkedHashMap linkedHashMapO = sqg0.O(linkedHashMap5, linkedHashMap6);
                    LinkedHashMap linkedHashMap7 = j1v0Var.q;
                    if (linkedHashMap7 == null) {
                        u890.C("sectionMidElementsAndCompanions");
                        throw null;
                    }
                    j1v0Var.r = sqg0.O(linkedHashMapO, linkedHashMap7);
                    composeView.setContent(new j2i(1167076103, new puj(tujVar, composeView, pbqVar), true));
                    return rih1Var;
                }
                hhg1.n("Required value was null.");
                return null;
            case 1:
                if (qzu0Var.v0 != null) {
                    qzu0Var.d.c(h5d0.T0, new jzu0(qzu0Var, b2));
                }
                return rih1Var;
            case 2:
                qzu0Var.d.c(h5d0.c, new jzu0(qzu0Var, (byte) 5));
                return rih1Var;
            case 3:
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                d3t d3tVar = qzu0Var.a;
                ArrayList arrayListC = qzu0Var.c();
                d3tVar.d = false;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj : arrayListC) {
                    if (obj instanceof mqb1) {
                        arrayList5.add(obj);
                    }
                }
                Iterator it = arrayList5.iterator();
                while (it.hasNext()) {
                    ((mqb1) it.next()).f(bundle2);
                }
                bundle.putBundle("deferred_component_state", bundle2);
                return bundle;
            case 4:
                d3t d3tVar2 = qzu0Var.a;
                ArrayList arrayListC2 = qzu0Var.c();
                d3tVar2.b = true;
                if (d3tVar2.a) {
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : arrayListC2) {
                        if (obj2 instanceof anc0) {
                            arrayList6.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList6.iterator();
                    while (it2.hasNext()) {
                        ((anc0) it2.next()).b();
                    }
                    d3tVar2.c = true;
                }
                return rih1Var;
            default:
                d3t d3tVar3 = qzu0Var.a;
                ArrayList arrayListC3 = qzu0Var.c();
                if (!d3tVar3.a) {
                    d3tVar3.a = true;
                    if (d3tVar3.d) {
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj3 : arrayListC3) {
                            if (obj3 instanceof mqb1) {
                                arrayList7.add(obj3);
                            }
                        }
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            ((mqb1) it3.next()).e(d3tVar3.e);
                        }
                    }
                    if (d3tVar3.b) {
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj4 : arrayListC3) {
                            if (obj4 instanceof anc0) {
                                arrayList8.add(obj4);
                            }
                        }
                        Iterator it4 = arrayList8.iterator();
                        while (it4.hasNext()) {
                            ((anc0) it4.next()).b();
                        }
                        d3tVar3.c = true;
                    }
                }
                return rih1Var;
        }
    }
}
