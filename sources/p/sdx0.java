package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sdx0 {
    public final m980 a;
    public final Scheduler b;
    public final t5w c;
    public final LinkedHashMap d;
    public final m5k e = new m5k(new nbc((byte) 2).d(), new z511[0]);
    public List f = z6x.a;
    public final bpb1 g;
    public final CompositeDisposable h;
    public final m9r0 i;
    public final BehaviorSubject j;

    public sdx0(m980 m980Var, Scheduler scheduler, t5w t5wVar, LinkedHashMap linkedHashMap) {
        this.a = m980Var;
        this.b = scheduler;
        this.c = t5wVar;
        this.d = linkedHashMap;
        bpb1 bpb1VarB = gio1.b(b7x.a);
        this.g = bpb1VarB;
        this.h = new CompositeDisposable();
        this.i = new m9r0(bpb1VarB, this, (byte) 28);
        this.j = BehaviorSubject.g(Boolean.TRUE);
    }

    public final Completable a(List list, boolean z, udx0 udx0Var) {
        this.f = list;
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap.isEmpty()) {
            return CompletableEmpty.a;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            vdx0 vdx0Var = (vdx0) linkedHashMap.get(str);
            if (vdx0Var == null) {
                utw0 utw0Var = ike1.a;
                utw0Var.y("Profile Platform Fail");
                utw0Var.A("Section '%s' not found in sectionsMap", new Object[]{str});
            } else {
                odx0 odx0VarA = vdx0Var.a();
                if (odx0VarA.c(z) && !((Map) this.g.getValue()).containsKey(str)) {
                    odx0VarA.d(udx0Var);
                    arrayList.add(odx0VarA.e().g(new wf0(linkedHashMap2, str, odx0VarA, (byte) 12)).h(new lyw0(odx0VarA, (byte) 6)).p(pdx0.b));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return Completable.l(arrayList).g(new wf0(this, linkedHashMap2, list, (byte) 13));
        }
        CompletableEmpty completableEmpty = CompletableEmpty.a;
        completableEmpty.getClass();
        return completableEmpty;
    }
}
