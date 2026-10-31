package p;

import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ld50 implements jd50 {
    public final ArrayList a;

    public ld50() {
        this.a = new ArrayList();
    }

    public void a(String str, String str2) {
        this.a.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2)));
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return sb.toString();
            }
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(((ala1) arrayList.get(i)).a);
            i++;
        }
    }

    public ArrayList c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sla1 sla1Var = ((ala1) it.next()).b;
            if (sla1Var != null) {
                arrayList.add(sla1Var);
            }
        }
        return arrayList;
    }

    public ld50(ArrayList arrayList) {
        this.a = arrayList;
    }
}
