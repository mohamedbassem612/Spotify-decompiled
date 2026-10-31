package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m6e0 implements q6e0 {
    public final Observable a;
    public final iu30 b;
    public final Function0 c;

    public m6e0(Observable observable, iu30 iu30Var, Function0 function0) {
        this.a = observable;
        this.b = iu30Var;
        this.c = function0;
    }

    @Override // p.q6e0
    public final void a(Bundle bundle) {
        this.b.invoke(bundle);
    }

    @Override // p.q6e0
    public final Observable b() {
        return this.a;
    }

    @Override // p.q6e0
    public final Bundle serialize() {
        return (Bundle) this.c.invoke();
    }
}
