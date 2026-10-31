package p;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n4l0 extends ContentObserver {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ aje0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4l0(Handler handler, ssw0 ssw0Var, aje0 aje0Var) {
        super(handler);
        this.a = ssw0Var;
        this.b = aje0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.l(Boolean.valueOf(aje0.b(this.b)));
    }
}
