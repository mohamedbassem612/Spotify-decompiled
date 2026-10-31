package p;

import android.view.View;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jn91 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p1f0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ jn91(p1f0 p1f0Var, int i, View view, byte b) {
        this.a = b;
        this.b = p1f0Var;
        this.c = i;
        this.d = view;
    }

    public final Object apply(Object obj) {
        do91 do91Var;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                p1f0 p1f0Var = this.b;
                io91 io91Var = (io91) p1f0Var.f;
                int i = this.c;
                int iC = l1d.C(i);
                if (iC == 0) {
                    do91Var = eo91.c;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    do91Var = do91.c;
                }
                io91Var.getClass();
                return Single.fromCallable(new wra(io91Var, str, do91Var, (byte) 6)).flatMap(new b8p1(p1f0Var, this.d, i, str, (byte) 19));
            default:
                if (!((Boolean) obj).booleanValue()) {
                    return Single.just(in91.c);
                }
                p1f0 p1f0Var2 = this.b;
                return ((Flowable) p1f0Var2.g).J(e4x0.N0).x(f4x0.Z).z().flatMap(new jn91(p1f0Var2, this.c, this.d, (byte) 0));
        }
    }
}
