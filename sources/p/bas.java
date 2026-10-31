package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.BiPredicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bas implements mc41, BiPredicate {
    public final iu30 a;
    public final iu30 b;

    public /* synthetic */ bas(int i) {
        this((i & 1) != 0 ? vm31.d1 : xj.N0, null);
    }

    public Bundle d(Object obj) {
        return (Bundle) this.a.invoke(obj);
    }

    public Object e(Bundle bundle, Object obj) {
        return this.b.invoke(bundle);
    }

    public boolean test(Object obj, Object obj2) {
        s0w s0wVar = (s0w) obj;
        s0w s0wVar2 = (s0w) obj2;
        s0wVar.getClass();
        iu30 iu30Var = this.a;
        boolean zBooleanValue = ((Boolean) iu30Var.invoke(s0wVar)).booleanValue();
        s0wVar2.getClass();
        if (zBooleanValue != ((Boolean) iu30Var.invoke(s0wVar2)).booleanValue()) {
            return false;
        }
        iu30 iu30Var2 = this.b;
        return u890.j(iu30Var2.invoke(s0wVar), iu30Var2.invoke(s0wVar2));
    }

    public /* synthetic */ bas(iu30 iu30Var, iu30 iu30Var2) {
        this.a = iu30Var;
        this.b = iu30Var2;
    }
}
