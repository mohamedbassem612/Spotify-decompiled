package p;

import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.ReplaySubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l211 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cr6 b;

    public /* synthetic */ l211(cr6 cr6Var, byte b) {
        this.a = b;
        this.b = cr6Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        cr6 cr6Var = this.b;
        switch (b) {
            case 0:
                ((ReplaySubject) cr6Var.f).onNext(((u111) obj).a);
                break;
            default:
                Parcelable.Creator creator = lik1.CREATOR;
                String str = ((t111) obj).a;
                if (!oap1.o(str)) {
                    v8i0.j("Invalid URI, won't navigate. Uri: ", str);
                } else {
                    ((lzn0) cr6Var.c).f(new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                }
                break;
        }
    }
}
