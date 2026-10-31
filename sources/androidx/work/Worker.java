package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import p.h341;
import p.hxl1;
import p.mf41;
import p.pzc;
import p.upn1;
import p.y8d0;
import p.z8d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Lp/z8d0;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Worker extends z8d0 {
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final pzc a() {
        return upn1.t(new h341((Object) ((z8d0) this).b.d, (Object) new mf41(this), (byte) 19));
    }

    public final pzc d() {
        return upn1.t(new h341((Object) ((z8d0) this).b.d, (Object) new hxl1(this), (byte) 19));
    }

    public abstract y8d0 f();
}
