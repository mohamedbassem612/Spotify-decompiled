package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fl60 extends gl60 {
    public static final fl60 o;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final ie30 j;
    public final List k;
    public final Map l;
    public final List m;
    public final dh30 n;

    static {
        List list = Collections.EMPTY_LIST;
        o = new fl60("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list, null);
    }

    public fl60(String str, List list, List list2, List list3, List list4, List list5, List list6, ie30 ie30Var, List list7, boolean z, Map map, List list8, dh30 dh30Var) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((el60) list2.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = ie30Var;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
        this.n = dh30Var;
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((dl60) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                vdc1 vdc1Var = (vdc1) list2.get(i3);
                if (vdc1Var.b == i && vdc1Var.c == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // p.kf20
    public final Object a(List list) {
        ArrayList arrayListC = c(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new fl60(this.a, this.b, arrayListC, list2, c(1, this.g, list), c(2, this.h, list), list2, this.j, this.k, this.c, this.l, this.m, this.n);
    }
}
