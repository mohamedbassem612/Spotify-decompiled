package androidx.work.rxjava3;

import android.content.Context;
import androidx.work.WorkerParameters;
import io.reactivex.rxjava3.core.Single;
import p.h341;
import p.n5u;
import p.pzc;
import p.upn1;
import p.z8d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class RxWorker extends z8d0 {
    public static final n5u e = new n5u((byte) 6);

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // p.z8d0
    public final pzc d() {
        return upn1.t(new h341(this, f(), (byte) 0));
    }

    public abstract Single f();
}
