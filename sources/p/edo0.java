package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class edo0 implements o5s {
    public final /* synthetic */ tte0 a;

    public edo0(tte0 tte0Var) {
        this.a = tte0Var;
    }

    public final void onPause(iac0 iac0Var) {
        Set set = this.a.j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof lyf0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((lyf0) it.next()).a.a.m((Object) null, Boolean.FALSE);
        }
    }

    public final void onResume(iac0 iac0Var) {
        Set set = this.a.j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof lyf0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((lyf0) it.next()).a.a.m((Object) null, Boolean.TRUE);
        }
    }

    public final void onStart(iac0 iac0Var) {
        Set set = this.a.j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof yte0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yte0) it.next()).b();
        }
    }

    public final void onStop(iac0 iac0Var) {
        Set set = this.a.j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof yte0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yte0) it.next()).a();
        }
    }
}
