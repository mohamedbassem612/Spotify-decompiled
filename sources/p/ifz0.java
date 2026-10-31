package p;

import android.view.ViewGroup;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR#\u0010&\u001a\n \"*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0017\u0010%¨\u0006'"}, d2 = {"Lp/ifz0;", "Lp/iyf0;", "Lp/iac0;", "Lp/ynb0;", "Lp/ofz0;", "a", "Lp/ynb0;", "quickPlayPreferencesFactory", "Lio/reactivex/rxjava3/core/Observable;", "", "b", "Lio/reactivex/rxjava3/core/Observable;", "getUsername$annotations", "()V", "username", "Lp/jfz0;", "c", "quickPlayRepository", "Lio/reactivex/rxjava3/core/Flowable;", "Lcom/spotify/player/model/PlayerState;", "d", "playerStateFlowable", "Lp/t8u0;", "e", "playerApisFactory", "Lp/rku;", "f", "Lp/rku;", "disposableRef", "Lp/tac0;", "g", "Lp/tac0;", "lifecycleRegistry", "Lp/muz;", "kotlin.jvm.PlatformType", "h", "Lp/znb0;", "()Lp/muz;", "player", "src_main_java_com_spotify_quickplay_quickplay-quickplay"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class ifz0 implements iyf0, iac0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ynb0 quickPlayPreferencesFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Observable<String> username;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ynb0 quickPlayRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ynb0 playerStateFlowable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ynb0 playerApisFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final rku disposableRef = new rku();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final tac0 lifecycleRegistry = new tac0(this, true);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final znb0 player = new idd1(new h2y0(this, (byte) 26));

    public ifz0(ynb0 ynb0Var, Observable observable, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4) {
        this.quickPlayPreferencesFactory = ynb0Var;
        this.username = observable;
        this.quickPlayRepository = ynb0Var2;
        this.playerStateFlowable = ynb0Var3;
        this.playerApisFactory = ynb0Var4;
    }

    @Override // p.iyf0
    public final void c() {
        this.lifecycleRegistry.g(k8c0.ON_START);
        this.lifecycleRegistry.g(k8c0.ON_RESUME);
        this.disposableRef.b(this.username.take(1L).map(new jxp0(this, (byte) 28)).flatMapCompletable(new xaz0(this, (byte) 1)).subscribe());
    }

    @Override // p.iyf0
    public final void d() {
        this.disposableRef.a();
        this.lifecycleRegistry.g(k8c0.ON_PAUSE);
        this.lifecycleRegistry.g(k8c0.ON_STOP);
    }

    public final muz e() {
        return (muz) this.player.getValue();
    }

    public final Completable f(nfz0 nfz0Var) {
        dma1 dma1Var = nfz0Var.a;
        String strE = dma1Var.e(nfz0.d, "");
        if (strE == null) {
            strE = "";
        }
        String strE2 = dma1Var.e(nfz0.e, "");
        String str = strE2 != null ? strE2 : "";
        if (strE.length() > 0) {
            return h(str, k4p1.x(strE), dma1Var.h(nfz0.c, false));
        }
        Maybe maybeFilter = ((jfz0) this.quickPlayRepository.get()).a().onErrorReturn(u9x0.d).filter(vbx0.d);
        l0x0 l0x0Var = new l0x0(this, nfz0Var, str, (byte) 19);
        maybeFilter.getClass();
        return new MaybeFlatMapCompletable(maybeFilter, l0x0Var);
    }

    public final x8c0 getLifecycle() {
        return this.lifecycleRegistry;
    }

    public final Completable h(String str, List list, boolean z) {
        PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
        if (z) {
            builder.shufflingContext(Boolean.FALSE);
        }
        Flowable flowable = (Flowable) this.playerStateFlowable.get();
        return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new hfz0(list, z, builder, str, this));
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
    }
}
