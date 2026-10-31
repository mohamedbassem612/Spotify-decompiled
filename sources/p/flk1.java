package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, d2 = {"Lp/flk1;", "Lp/xov0;", "Lp/hlk1;", "systemPropertyGetter", "", "filename", "partnerId", "Lio/reactivex/rxjava3/core/Scheduler;", "ioScheduler", "Lp/cpv0;", "fileFactory", "<init>", "(Lp/hlk1;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/rxjava3/core/Scheduler;Lp/cpv0;)V", "Lp/vov0;", "c", "()Lp/vov0;", "a", "Lp/hlk1;", "b", "Ljava/lang/String;", "d", "Lp/cpv0;", "Lio/reactivex/rxjava3/core/Single;", "e", "Lio/reactivex/rxjava3/core/Single;", "()Lio/reactivex/rxjava3/core/Single;", "preloadData", "src_main_java_com_spotify_preload_statusimpl-statusimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class flk1 implements xov0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final hlk1 systemPropertyGetter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String filename;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String partnerId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final cpv0 fileFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Single<vov0> preloadData;

    public flk1(hlk1 hlk1Var, String str, String str2, Scheduler scheduler, cpv0 cpv0Var) {
        this.systemPropertyGetter = hlk1Var;
        this.filename = str;
        this.partnerId = str2;
        this.fileFactory = cpv0Var;
        this.preloadData = Single.fromCallable(new sra(this, (byte) 27)).subscribeOn(scheduler).cache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vov0 c() {
        this.systemPropertyGetter.getClass();
        String strA = hlk1.a();
        if (strA.length() > 0) {
            cpv0 cpv0Var = this.fileFactory;
            if (cpv0Var.a.o(strA, this.filename).b.exists()) {
                String str = this.partnerId;
                return new uov0(str, str, false);
            }
        }
        return tov0.a;
    }

    @Override // p.xov0
    public Single<vov0> a() {
        return this.preloadData;
    }
}
