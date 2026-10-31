package p;

import androidx.car.app.model.Action;
import androidx.car.app.model.RowSection;
import androidx.car.app.model.SectionHeader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l6w0 implements ag51 {
    public int a;
    public boolean b;
    public boolean c;

    public l6w0() {
        this.a = 0;
        this.b = false;
        this.c = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List c(fpd fpdVar, utj utjVar) throws Throwable {
        RowSection rowSectionR;
        int i = utjVar.a;
        r6h1 r6h1Var = utjVar.b;
        Function0 function0 = utjVar.e;
        b8p1 b8p1Var = utjVar.d;
        SectionHeader sectionHeader = utjVar.f;
        xu30 xu30Var = utjVar.c;
        int i2 = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        ouk0 ouk0Var = new ouk0(Integer.valueOf(i), fpdVar.getId(), fpdVar.getUri(), r6h1Var);
        Throwable th = null;
        switch (fpdVar.u().ordinal()) {
            case 0:
            case 7:
                String title = fpdVar.getTitle();
                List items = fpdVar.getItems();
                ArrayList arrayList = new ArrayList(q7h.U(items, 10));
                Iterator it = items.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    apd apdVar = (apd) next;
                    nwc nwcVar = apdVar.a;
                    nwc nwcVar2 = apdVar.b;
                    hvc hvcVar = apdVar.c;
                    Float f = apdVar.g;
                    if (!z) {
                        f = null;
                    }
                    arrayList.add(x760.w(nwcVar, nwcVar2, hvcVar, f, new gpd(xu30Var, apdVar, i3, ouk0Var, (byte) 0)));
                    title = title;
                    it = it;
                    i3 = i4;
                }
                rowSectionR = lgo1.r(title, arrayList, i2, function0, b8p1Var, sectionHeader);
                break;
            case 1:
                String title2 = fpdVar.getTitle();
                List items2 = fpdVar.getItems();
                ArrayList arrayList2 = new ArrayList(q7h.U(items2, 10));
                int i5 = 0;
                for (Object obj : items2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p7h.T();
                        throw null;
                    }
                    apd apdVar2 = (apd) obj;
                    nwc nwcVar3 = apdVar2.a;
                    nwc nwcVar4 = apdVar2.b;
                    hvc hvcVar2 = apdVar2.c;
                    Float f2 = apdVar2.g;
                    if (!z) {
                        f2 = null;
                    }
                    arrayList2.add(x760.w(nwcVar3, nwcVar4, hvcVar2, f2, new gpd(xu30Var, apdVar2, i5, ouk0Var, (byte) 1)));
                    title2 = title2;
                    i5 = i6;
                    z = z;
                }
                rowSectionR = lgo1.r(title2, arrayList2, 2, function0, b8p1Var, sectionHeader);
                break;
            case 2:
                String title3 = fpdVar.getTitle();
                String str = (title3 == null || title3.length() == 0) ? null : title3;
                List items3 = fpdVar.getItems();
                ArrayList arrayList3 = new ArrayList(q7h.U(items3, 10));
                int i7 = 0;
                for (Object obj2 : items3) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        p7h.T();
                        throw null;
                    }
                    apd apdVar3 = (apd) obj2;
                    arrayList3.add(x760.D(apdVar3.a, apdVar3.b, apdVar3.c, (Integer) null, (nwc) null, Boolean.valueOf(apdVar3.d instanceof g80), x1p1.n(apdVar3.f), false, false, z2 ? apdVar3.g : null, new ipd(xu30Var, apdVar3, i7, ouk0Var, (byte) 0), 824));
                    i7 = i8;
                }
                rowSectionR = lgo1.t(str, arrayList3, (String) null, function0, b8p1Var, sectionHeader, 4);
                break;
            case 3:
                List items4 = fpdVar.getItems();
                ArrayList arrayList4 = new ArrayList(q7h.U(items4, 10));
                int i9 = 0;
                for (Object obj3 : items4) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        Throwable th2 = th;
                        p7h.T();
                        throw th2;
                    }
                    apd apdVar4 = (apd) obj3;
                    arrayList4.add(x760.D(apdVar4.a, apdVar4.b, apdVar4.c, (Integer) null, (nwc) null, Boolean.valueOf(apdVar4.d instanceof g80), x1p1.n(apdVar4.f), false, false, z2 ? apdVar4.g : th, new ipd(xu30Var, apdVar4, i9, ouk0Var, (byte) 1), 824));
                    i9 = i10;
                    th = th;
                }
                rowSectionR = lgo1.t((String) null, arrayList4, (String) null, function0, b8p1Var, sectionHeader, 4);
                break;
            case 4:
                String title4 = fpdVar.getTitle();
                if (title4 == null) {
                    title4 = "";
                }
                rowSectionR = lgo1.t((String) null, Collections.singletonList(x760.D(new lwc(title4), (nwc) null, (hvc) null, (Integer) null, (nwc) null, Boolean.valueOf(!fpdVar.getItems().isEmpty()), (Action) null, false, false, (Float) null, new d1c(xu30Var, fpdVar, ouk0Var, (byte) 6), 1982)), (String) null, function0, b8p1Var, sectionHeader, 4);
                break;
            case 5:
                List items5 = fpdVar.getItems();
                apd apdVar5 = (apd) (items5.size() > 0 ? items5.get(0) : new apd(null, null, new dvc((String) null, 3), null, null, null, 251));
                rowSectionR = lgo1.t((String) null, Collections.singletonList(x760.D(apdVar5.a, apdVar5.b, apdVar5.c, (Integer) null, (nwc) null, Boolean.valueOf(apdVar5.d instanceof g80), x1p1.n(apdVar5.f), false, false, z2 ? apdVar5.g : null, new hpd(xu30Var, apdVar5, ouk0Var, (byte) 1), 824)), (String) null, function0, b8p1Var, sectionHeader, 4);
                break;
            case 6:
                String title5 = fpdVar.getTitle();
                List items6 = fpdVar.getItems();
                apd apdVar6 = (apd) (items6.size() > 0 ? items6.get(0) : new apd(null, null, new dvc((String) null, 3), null, null, null, 251));
                rowSectionR = lgo1.t(title5, Collections.singletonList(x760.D(apdVar6.a, apdVar6.b, apdVar6.c, (Integer) null, (nwc) null, Boolean.valueOf(apdVar6.d instanceof g80), x1p1.n(apdVar6.f), false, false, z2 ? apdVar6.g : null, new hpd(xu30Var, apdVar6, ouk0Var, (byte) 0), 824)), (String) null, function0, b8p1Var, sectionHeader, 4);
                break;
            default:
                eg.o();
                return null;
        }
        return Collections.singletonList(rowSectionR);
    }

    public l6w0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }
}
