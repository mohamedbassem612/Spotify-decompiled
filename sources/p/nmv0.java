package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nmv0 implements mmv0 {
    public static final Map d = Collections.singletonMap("😢", "🥺");
    public static final Map e = Collections.singletonMap("🥺", "😢");
    public final int b;
    public final List c;

    public nmv0(int i, List list) {
        this.b = i;
        this.c = list;
    }

    public final c380 a() {
        List list = this.c;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c((String) it.next()));
        }
        return mqo1.A(arrayList);
    }

    public final String b(String str) {
        String str2;
        return (this.b >= 28 || (str2 = (String) d.get(str)) == null) ? str : str2;
    }

    public final String c(String str) {
        String str2;
        return (this.b >= 28 || (str2 = (String) e.get(str)) == null) ? str : str2;
    }
}
