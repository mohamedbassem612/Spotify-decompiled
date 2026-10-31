package p;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ihn implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ jhn b;

    public ihn(jhn jhnVar, long j) {
        this.b = jhnVar;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.k.d(bundle);
        return null;
    }
}
