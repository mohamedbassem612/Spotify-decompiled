package p;

import android.database.ContentObserver;
import android.os.Handler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ah extends ContentObserver {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ssw0 ssw0Var, Function0 function0, Handler handler) {
        super(handler);
        this.a = ssw0Var;
        this.b = function0;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.l(this.b.invoke());
    }
}
