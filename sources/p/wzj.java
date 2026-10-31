package p;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wzj extends o5 {
    public final Function0 e;
    public final LinkedHashSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzj(vzj vzjVar) {
        super(vzjVar);
        fki fkiVar = fki.N0;
        this.e = fkiVar;
        this.f = new LinkedHashSet();
    }

    public final void b(int i, int i2, int i3) {
        o5.y(i, i2, i3, ((vzj) ((o5) this).c).a());
        vzj vzjVar = (vzj) ((o5) this).c;
        if (vzjVar instanceof tzj) {
            this.f.add(vzjVar);
        }
    }

    public final void c(int i, int i2) {
        int i3 = i + i2;
        Iterator it = ((vzj) ((o5) this).c).a().subList(i, i3).iterator();
        while (it.hasNext()) {
            ((vzj) it.next()).b(null);
        }
        List listA = ((vzj) ((o5) this).c).a();
        if (i2 == 1) {
            listA.remove(i);
        } else {
            listA.subList(i, i3).clear();
        }
        vzj vzjVar = (vzj) ((o5) this).c;
        if (vzjVar instanceof tzj) {
            this.f.add(vzjVar);
        }
    }

    public final void e(int i, Object obj) {
        vzj vzjVar = (vzj) obj;
        vzj vzjVar2 = (vzj) ((o5) this).c;
        vzjVar2.getClass();
        vzjVar.b(vzjVar2);
        vzjVar2.a().add(i, vzjVar);
        vzj vzjVar3 = (vzj) ((o5) this).c;
        if (vzjVar3 instanceof tzj) {
            this.f.add(vzjVar3);
        }
    }

    public final void f() {
        LinkedHashSet<tzj> linkedHashSet = this.f;
        for (tzj tzjVar : linkedHashSet) {
            tzjVar.c.t(tzjVar.c.s() + 1);
        }
        linkedHashSet.clear();
        hqn1.b++;
        this.e.invoke();
    }

    public final /* bridge */ /* synthetic */ void g(int i, Object obj) {
    }

    public final void z() {
        vzj vzjVar = (vzj) ((o5) this).b;
        vzjVar.a().clear();
        if (vzjVar instanceof tzj) {
            this.f.add(vzjVar);
        }
    }
}
