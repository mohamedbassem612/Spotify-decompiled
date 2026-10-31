package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class l2w0 implements Init {
    public final First e0(Object obj) {
        t2w0 t2w0Var = (t2w0) obj;
        List list = t2w0Var.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((o3w0) it.next()).c;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return First.c(t2w0Var, Collections.singleton(new zzv0(arrayList)));
    }
}
