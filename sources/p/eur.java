package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eur {
    public final BehaviorSubject a = BehaviorSubject.g(z6x.a);

    public final synchronized void a(String str) {
        try {
            List list = (List) this.a.h();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!u890.j(((zdz0) obj).a().a.name(), str)) {
                        arrayList.add(obj);
                    }
                }
                this.a.onNext(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String b(fwi0 fwi0Var, iu30 iu30Var) {
        try {
            List list = (List) this.a.h();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((zdz0) obj).a().a != fwi0Var.a) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.add(new zdz0(fwi0Var, iu30Var));
                this.a.onNext(arrayList2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return fwi0Var.a.name();
    }
}
