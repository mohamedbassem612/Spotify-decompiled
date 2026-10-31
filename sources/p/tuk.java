package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tuk {
    public final ynb0 a;

    public /* synthetic */ tuk(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    public List a() {
        return o7h.l1((Iterable) this.a.get());
    }

    public suk b(String str) {
        Iterable iterable = (Iterable) this.a.get();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((suk) obj).b(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Logger.d("MBS: Configurator for package '%s': '%s'", new Object[]{str, ((suk) it.next()).getClass().getName()});
            }
            l1d.z("Multiple handlers registered for package: '", str, "'");
        }
        return (suk) o7h.s0(arrayList);
    }
}
