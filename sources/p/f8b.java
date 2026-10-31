package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f8b {
    public final g7h a;
    public final o241 b;
    public final uu00 c;
    public final Scheduler d;

    public f8b(g7h g7hVar, o241 o241Var, uu00 uu00Var, Scheduler scheduler) {
        this.a = g7hVar;
        this.b = o241Var;
        this.c = uu00Var;
        this.d = scheduler;
    }

    public static String c(p7b p7bVar, Map map) {
        if (!(p7bVar instanceof p7b)) {
            eg.o();
            return null;
        }
        n7b n7bVarA = p7bVar.a();
        if (n7bVarA instanceof n7b) {
            String strA = n7bVarA.a();
            if (ihc1.y0(strA)) {
                return null;
            }
            return strA;
        }
        if (n7bVarA.equals(m7b.a)) {
            return (String) map.get(p7bVar.b());
        }
        eg.o();
        return null;
    }

    public static ycy d(p7b p7bVar, Map map, Map map2, boolean z) {
        vcy vcyVar;
        if (!(p7bVar instanceof p7b)) {
            eg.o();
            return null;
        }
        String strC = c(p7bVar, map2);
        String strB = p7bVar.b();
        f7h f7hVar = (f7h) map.get(p7bVar.b());
        boolean z2 = f7hVar != null ? f7hVar.b : false;
        if (strC != null) {
            f7h f7hVar2 = (f7h) map.get(strC);
            vcyVar = new vcy(strC, f7hVar2 != null ? f7hVar2.b : false);
        } else {
            vcyVar = ((p7bVar.a() instanceof n7b) || z) ? wcy.a : ucy.a;
        }
        return new ycy(strB, z2, vcyVar);
    }

    public final Observable a(List list) {
        return b().flatMapObservable(new it8(list, this, (byte) 15));
    }

    public final Single b() {
        return this.b.a("disable-blocked-content", "0").firstOrError().map(b6j0.X).doOnError(p.f).onErrorReturnItem(Boolean.FALSE);
    }
}
