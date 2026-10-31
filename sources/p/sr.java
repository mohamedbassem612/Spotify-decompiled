package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class sr implements Function, Predicate {
    public final Object a;

    public hzx a() {
        Context context = (Context) this.a;
        Context applicationContext = context.getApplicationContext();
        sw9 sw9Var = new sw9(context.getApplicationContext());
        sw9Var.H();
        return hzx.a(applicationContext, "accountswitching_encrypted_sharedprefs", sw9Var.v(), fzx.b, gzx.b);
    }

    public Object apply(Object obj) {
        cw cwVar = (ew) obj;
        if (cwVar instanceof cw) {
            cwVar.a.c((yg8) this.a, 0);
            return Single.just(Boolean.TRUE);
        }
        if (cwVar.equals(dw.a)) {
            return Single.just(Boolean.FALSE);
        }
        eg.o();
        return null;
    }

    public boolean test(Object obj) {
        th61 th61Var = (th61) obj;
        return voo1.p(th61Var) && u890.j(th61Var.a, (String) this.a);
    }
}
