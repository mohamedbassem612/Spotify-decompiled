package p;

import android.app.Application;
import com.ravelin.core.model.DeviceId;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class evg extends onm {
    public Application a;
    public DeviceId b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ lvg e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evg(lvg lvgVar, onm onmVar) {
        super(onmVar);
        this.e = lvgVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(null, null, null, null, null, null, null, this);
    }
}
