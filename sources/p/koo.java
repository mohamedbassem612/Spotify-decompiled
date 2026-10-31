package p;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class koo extends ContentObserver {
    public final /* synthetic */ wwc1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koo(wwc1 wwc1Var) {
        super(new Handler());
        this.a = wwc1Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.e();
    }
}
