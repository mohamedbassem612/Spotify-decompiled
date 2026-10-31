package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jeo0 implements r290 {
    public final jnq a;
    public final yjq b;
    public final jkp0 c;
    public final q8n d;

    public jeo0(jnq jnqVar, yjq yjqVar, jkp0 jkp0Var, q8n q8nVar) {
        this.a = jnqVar;
        this.b = yjqVar;
        this.c = jkp0Var;
        this.d = q8nVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static List c(kio kioVar, blc0 blc0Var) throws NoWhenBranchMatchedException {
        if (kioVar instanceof iio) {
            return k4p1.x(((iio) kioVar).a());
        }
        if (kioVar instanceof gio) {
            return k4p1.x(heo0.a[blc0Var.ordinal()] == 1 ? "spotify:collection:your-episodes" : "spotify:collection");
        }
        if (kioVar instanceof jio) {
            return k4p1.x(heo0.a[blc0Var.ordinal()] == 1 ? "spotify:collection:your-episodes" : "spotify:collection");
        }
        if (!(kioVar instanceof hio)) {
            eg.o();
            return null;
        }
        List listA = ((hio) kioVar).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            r7h.W(c((kio) it.next(), blc0Var), arrayList);
        }
        return arrayList;
    }

    @Override // p.r290
    public final Single a(List list, String str, String str2, boolean z, int i, kio kioVar, gj3 gj3Var) {
        return rqt0.F(this.d, new ieo0(list, i, this, str, str2, z, kioVar, gj3Var, (lnm) null));
    }

    @Override // p.r290
    public final Completable b(List list, String str, String str2, gj3 gj3Var) {
        return j2h1.D(this.d, new ary((byte) 24, this, list, str, str2, gj3Var, (lnm) null));
    }
}
