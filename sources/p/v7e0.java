package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v7e0 implements q6e0 {
    public final Scheduler a;
    public final lzn0 b;
    public final boolean c;
    public final String d;
    public final q6e0 e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public v7e0(Scheduler scheduler, q8n q8nVar, lzn0 lzn0Var, boolean z, String str, q6e0 q6e0Var) {
        this.a = scheduler;
        this.b = lzn0Var;
        this.c = z;
        this.d = str;
        this.e = q6e0Var;
    }

    public final void a(Bundle bundle) {
        this.e.a(bundle);
    }

    public final Observable b() {
        return this.e.b().observeOn(this.a).doOnNext(new rwa0(this, (byte) 8));
    }

    public final Bundle serialize() {
        return this.e.serialize();
    }
}
