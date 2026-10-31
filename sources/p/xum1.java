package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xum1 {
    public final Context a;
    public final ynb0 b;
    public final ynb0 c;
    public final ynb0 d;

    public xum1(Context context, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3) {
        this.a = context;
        this.b = ynb0Var;
        this.c = ynb0Var2;
        this.d = ynb0Var3;
    }

    public final Observable a() {
        return Observable.combineLatest((ObservableSource) yoi1.i(((lut0) this.b.get()).b, o6x.a), (ObservableSource) ((qut0) this.c.get()).c.getValue(), (BiFunction) new a1g1(this, (byte) 16)).onErrorReturnItem(new uut0());
    }
}
