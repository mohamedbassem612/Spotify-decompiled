package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vkw0 implements jn60, h030, szg, i631 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final String e;
    public final EmbeddedAdMetadata f;
    public final ArrayList g;

    public vkw0(String str, String str2, x360 x360Var, yz21 yz21Var, String str3, EmbeddedAdMetadata embeddedAdMetadata, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = str3;
        this.f = embeddedAdMetadata;
        this.g = arrayList;
    }

    public final Set a() {
        ArrayList arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((ykw0) it.next()).c;
            if (str == null) {
                str = "";
            }
            arrayList2.add(str);
        }
        return o7h.p1(arrayList2);
    }

    public final Set b() {
        ArrayList arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ykw0) it.next()).b);
        }
        return o7h.p1(arrayList2);
    }

    public final List d(op80 op80Var) {
        skw0 rkw0Var;
        String str = this.d.a;
        String str2 = this.b;
        String str3 = this.a;
        int i = 0;
        ArrayList arrayList = this.g;
        EmbeddedAdMetadata embeddedAdMetadata = this.f;
        x360 x360Var = this.c;
        String str4 = this.e;
        if (x360Var != null) {
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                ykw0 ykw0Var = (ykw0) obj;
                arrayList2.add(new nii0(l1d.k(i, str3, "-"), l1d.k(i, str2, "-"), ykw0Var.a, ykw0Var.b, ykw0Var.c, embeddedAdMetadata != null ? zgo1.u(embeddedAdMetadata) : null));
                i = i2;
            }
            rkw0Var = new skw0(str3, op80Var, new oii0(str3, str2, str4, x360Var, arrayList2, embeddedAdMetadata != null ? zgo1.u(embeddedAdMetadata) : null, str));
        } else {
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
            for (Object obj2 : arrayList) {
                int i3 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                ykw0 ykw0Var2 = (ykw0) obj2;
                String str5 = str4;
                arrayList3.add(new nii0(l1d.k(i, str3, "-"), l1d.k(i, str2, "-"), ykw0Var2.a, ykw0Var2.b, ykw0Var2.c, embeddedAdMetadata != null ? zgo1.u(embeddedAdMetadata) : null));
                str4 = str5;
                i = i3;
            }
            rkw0Var = new rkw0(str3, op80Var, new oii0(str3, str2, str4, x360Var, arrayList3, embeddedAdMetadata != null ? zgo1.u(embeddedAdMetadata) : null, str));
        }
        return Collections.singletonList(rkw0Var);
    }

    public final String e() {
        return this.a;
    }

    public final yz21 f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }
}
