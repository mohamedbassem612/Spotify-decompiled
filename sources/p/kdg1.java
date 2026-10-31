package p;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kdg1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdg1(ven0 ven0Var, iu30 iu30Var, pe peVar, ven0 ven0Var2, ven0 ven0Var3) {
        super(1);
        this.a = (byte) 4;
        this.f = ven0Var;
        this.b = iu30Var;
        this.d = peVar;
        this.c = ven0Var2;
        this.e = ven0Var3;
    }

    public final Object invoke(Object obj) {
        w771 w771Var;
        byte b = this.a;
        int i = 2;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                abc0 abc0Var = (abc0) obj;
                h680 h680Var = (h680) obj4;
                abc0Var.c = new jdg1((o0i) obj5, h680Var, (pe) obj3, (idg1) obj2, (ven0) obj6, (lnm) null, (byte) 1);
                abc0Var.a = new pad1((ven0) obj6, null, (byte) 3);
                abc0Var.d = new j4f1(h680Var, (byte) 14);
                return rih1Var;
            case 1:
                rtb0 rtb0Var = (rtb0) obj;
                kyi1 kyi1Var = (kyi1) obj5;
                List list = kyi1Var.a;
                int size = list.size();
                int i2 = kyi1Var.b;
                kfd1 kfd1Var = (size <= i2 || i2 < 0) ? (kfd1) o7h.s0(list) : (kfd1) list.get(i2);
                if (kfd1Var != null) {
                    t8r0 t8r0Var = (t8r0) obj4;
                    xfx xfxVar = (xfx) obj3;
                    j2i j2iVar = (j2i) obj2;
                    iu30 iu30Var = (iu30) obj6;
                    boolean zEquals = kfd1Var.a.equals("events");
                    List list2 = kfd1Var.b;
                    if (zEquals) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj7 : list2) {
                            ArrayList arrayList3 = ((vf51) obj7).a;
                            if (!arrayList3.isEmpty()) {
                                Iterator it = arrayList3.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((f6m) it.next()).b instanceof oyi1) {
                                            arrayList.add(obj7);
                                        }
                                        break;
                                    }
                                }
                            }
                            arrayList2.add(obj7);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            r7h.W(((vf51) it2.next()).a, arrayList4);
                        }
                        rtb0Var.e(arrayList4.size(), (iu30) null, new tjk(arrayList4, (byte) 2), new j2i(802480018, new kxi1(arrayList4, t8r0Var, xfxVar, j2iVar, iu30Var, (byte) 0), true));
                        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList, 10));
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(((vf51) it3.next()).a);
                        }
                        ArrayList arrayListV = q7h.V(arrayList5);
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj8 : arrayListV) {
                            oyi1 oyi1Var = ((f6m) obj8).b;
                            if ((oyi1Var instanceof oyi1) && oyi1Var.n.compareTo(new Date()) >= 0) {
                                arrayList6.add(obj8);
                            }
                        }
                        List listA1 = o7h.a1(arrayList6, new be21((byte) 28));
                        rtb0Var.e(listA1.size(), (iu30) null, new vse1(listA1, (byte) 10), new j2i(802480018, new a87(listA1, t8r0Var, xfxVar, j2iVar, iu30Var, (byte) 10), true));
                    } else {
                        List list3 = list2;
                        ArrayList arrayList7 = new ArrayList(q7h.U(list3, 10));
                        Iterator it4 = list3.iterator();
                        while (it4.hasNext()) {
                            arrayList7.add(((vf51) it4.next()).a);
                        }
                        ArrayList arrayListV2 = q7h.V(arrayList7);
                        rtb0Var.e(arrayListV2.size(), (iu30) null, new byc1(arrayListV2, (byte) 3), new j2i(802480018, new kxi1(arrayListV2, t8r0Var, xfxVar, j2iVar, iu30Var, (byte) 1), true));
                    }
                }
                return rih1Var;
            case 2:
                ((qtr) obj).b(new lsj1((msj1) obj5, (iu30) obj4, (ywv0) obj3, (tgt0) obj2, (gn10) obj6, null));
                return rih1Var;
            case 3:
                hml1 hml1Var = new hml1((pe) obj3, (tjs0) obj2, (ven0) obj6, (byte) 5);
                ContentObserver p2aVar = new p2a(hml1Var, new Handler(Looper.getMainLooper()), (byte) 4);
                zg zgVar = new zg(hml1Var, (byte) 3);
                ContentResolver contentResolver = (ContentResolver) obj5;
                contentResolver.registerContentObserver(Settings.Global.getUriFor("animator_duration_scale"), false, p2aVar);
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj4;
                accessibilityManager.addTouchExplorationStateChangeListener(zgVar);
                hml1Var.invoke();
                return new sj4(contentResolver, p2aVar, accessibilityManager, zgVar, (byte) 4);
            case 4:
                abc0 abc0Var2 = (abc0) obj;
                ven0 ven0Var = (ven0) obj6;
                abc0Var2.a = new pad1(ven0Var, null, (byte) 11);
                abc0Var2.c = new q4m1((iu30) obj5, (pe) obj3, ven0Var, (lnm) null, (byte) 5);
                abc0Var2.d = new zqe((ven0) obj4, (ven0) obj2, (byte) 16);
                return rih1Var;
            default:
                zuj1 zuj1Var = (fvj1) obj;
                avp0 avp0Var = (avp0) obj5;
                if (!(zuj1Var instanceof evj1)) {
                    if (!(zuj1Var instanceof dvj1)) {
                        if (zuj1Var instanceof cvj1) {
                            i = 1;
                        } else {
                            eg.o();
                        }
                    }
                    return null;
                }
                i = 3;
                i8h1 i8h1Var = (i8h1) avp0Var.d;
                l4m0 l4m0Var = (l4m0) obj4;
                String str = (String) obj3;
                l4m0Var.getClass();
                x6h1 x6h1VarC = l4m0Var.b.c();
                x6h1VarC.i.add(new a7h1("video_preview", str, (Integer) null, (String) null, z3m0.b(i)));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = l4m0Var.a;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                if (!(zuj1Var instanceof cvj1)) {
                    return rih1Var;
                }
                g871 g871Var = (g871) avp0Var.e;
                zuj1 zuj1Var2 = (cvj1) zuj1Var;
                String str2 = (String) obj2;
                String str3 = (String) obj6;
                if (zuj1Var2 instanceof bvj1) {
                    w771Var = new w771(200, str2, str3, "Param resolution failed", (String) null);
                } else if (zuj1Var2 instanceof zuj1) {
                    w771Var = new w771(201, str2, str3, "Rive file load failed", j2h1.I(zuj1Var2.a));
                } else {
                    if (!(zuj1Var2 instanceof avj1)) {
                        eg.o();
                        return null;
                    }
                    w771Var = new w771(202, str2, str3, "Terminal error (not a Rive asset)", (String) null);
                }
                g871Var.b(w771Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kdg1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
