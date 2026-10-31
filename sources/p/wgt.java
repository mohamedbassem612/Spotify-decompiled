package p;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wgt {
    public static final xgc c = new xgc((byte) 7);
    public static int d = 1;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final wgt m;
    public static final wgt n;
    public static final wgt o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final wgt f49p;
    public static final wgt q;
    public static final ArrayList r;
    public static final ArrayList s;
    public final List a;
    public final int b;

    static {
        int iS = xgc.s();
        e = iS;
        int iS2 = xgc.s();
        f = iS2;
        int iS3 = xgc.s();
        g = iS3;
        int iS4 = xgc.s();
        h = iS4;
        int iS5 = xgc.s();
        i = iS5;
        int iS6 = xgc.s();
        j = iS6;
        int iS7 = xgc.s() - 1;
        k = iS7;
        int i2 = iS | iS2 | iS3;
        l = i2;
        m = new wgt(iS7);
        n = new wgt(iS5 | iS6);
        new wgt(iS);
        new wgt(iS2);
        new wgt(iS3);
        o = new wgt(i2);
        new wgt(iS4);
        f49p = new wgt(iS5);
        q = new wgt(iS6);
        new wgt(iS2 | iS5 | iS6);
        Field[] fields = wgt.class.getFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            wgt wgtVar = obj instanceof wgt ? (wgt) obj : null;
            vgt vgtVar = wgtVar != null ? new vgt(wgtVar.b, field2.getName()) : null;
            if (vgtVar != null) {
                arrayList2.add(vgtVar);
            }
        }
        r = arrayList2;
        Field[] fields2 = wgt.class.getFields();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (u890.j(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            int iIntValue = ((Integer) field4.get(null)).intValue();
            vgt vgtVar2 = iIntValue == ((-iIntValue) & iIntValue) ? new vgt(iIntValue, field4.getName()) : null;
            if (vgtVar2 != null) {
                arrayList5.add(vgtVar2);
            }
        }
        s = arrayList5;
    }

    public wgt(int i2, List list) {
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ~((ugt) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (this.b & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!wgt.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        wgt wgtVar = (wgt) obj;
        return u890.j(this.a, wgtVar.a) && this.b == wgtVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        Object next;
        Iterator it = r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((vgt) next).a != this.b);
        vgt vgtVar = (vgt) next;
        String strY0 = vgtVar != null ? vgtVar.b : null;
        if (strY0 == null) {
            ArrayList arrayList = new ArrayList();
            for (vgt vgtVar2 : s) {
                String str = a(vgtVar2.a) ? vgtVar2.b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strY0 = o7h.y0(arrayList, " | ", (String) null, (String) null, (iu30) null, 62);
        }
        StringBuilder sbT = l1d.t("DescriptorKindFilter(", strY0, ", ");
        sbT.append(this.a);
        sbT.append(')');
        return sbT.toString();
    }

    public /* synthetic */ wgt(int i2) {
        this(i2, z6x.a);
    }
}
