package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h5d {
    public static final DynamicTagsMetadata h = new DynamicTagsMetadata("spotify:home", null, null, null, 14, null);
    public final boolean a;
    public final Scheduler b;
    public final Scheduler c;
    public final a1g1 d;
    public final ps7 e;
    public final l5d f;
    public final vku g = new vku();

    public h5d(boolean z, Scheduler scheduler, Scheduler scheduler2, a1g1 a1g1Var, ps7 ps7Var, l5d l5dVar) {
        this.a = z;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = a1g1Var;
        this.e = ps7Var;
        this.f = l5dVar;
    }
}
