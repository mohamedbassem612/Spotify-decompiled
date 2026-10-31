package p;

import android.text.TextUtils;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromCallable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class dkw0 implements BiFunction, Function {
    public final /* synthetic */ lkw0 a;

    public Object apply(Object obj, Object obj2) {
        u19 u19Var = (u19) obj;
        String str = (String) obj2;
        String str2 = u19Var.a;
        spq0 spq0Var = u19Var.b;
        if (TextUtils.isEmpty(str2)) {
            return u19.e;
        }
        lkw0 lkw0Var = this.a;
        u19 u19Var2 = lkw0Var.o;
        if (u19Var2 != null && u19Var2.a.equals(str2)) {
            if (!lkw0Var.o.b.c() || !spq0Var.c()) {
                return u19.e;
            }
            if (((String) lkw0Var.o.b.b()).equals(spq0Var.b())) {
                return u19.e;
            }
        }
        spq0 spq0Var2 = u19Var.d;
        i5w0 i5w0VarD = spq0.d(str.replace("{id}", str2));
        if (str2 != null) {
            return new u19(str2, spq0Var, i5w0VarD, spq0Var2);
        }
        eg.m("Missing required properties: previewId");
        return null;
    }

    public Object apply(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            lkw0 lkw0Var = this.a;
            return lkw0Var.a.a(new d9u0("previewplayerimpl", false)).ignoreElement().c(new CompletableFromCallable(new lhn(lkw0Var, (byte) 4)));
        }
        return CompletableEmpty.a;
    }
}
