package com.spotify.nowplaying.scroll.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDefer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.an90;
import p.gr41;
import p.j6p0;
import p.ua20;
import p.yj1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/nowplaying/scroll/view/NowPlayingScrollView;", "Landroidx/core/widget/NestedScrollView;", "Lp/j6p0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_nowplaying_scroll-scroll"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public class NowPlayingScrollView extends NestedScrollView implements j6p0 {
    public final BehaviorProcessor j1;
    public final FlowableRefCount k1;
    public final FlowableRefCount l1;

    public NowPlayingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        this.j1 = behaviorProcessor;
        Flowable flowableT = behaviorProcessor.T(Flowable.I(new gr41(0, 0)));
        flowableT.getClass();
        Function function = Functions.a;
        this.k1 = new FlowableRefCount(new FlowableOnBackpressureLatest(flowableT.t(function)).Q());
        Flowable flowableT2 = behaviorProcessor.J(ua20.R0).T(new FlowableDefer(new yj1(this, (byte) 16)));
        flowableT2.getClass();
        this.l1 = new FlowableRefCount(new FlowableOnBackpressureLatest(flowableT2.t(function)).Q());
    }

    @Override // p.j6p0
    public final Flowable f() {
        return this.l1;
    }

    @Override // p.j6p0
    public final Flowable h() {
        return this.k1;
    }

    @Override // p.j6p0
    public Flowable m() {
        int i = Flowable.a;
        return FlowableEmpty.b;
    }

    @Override // p.j6p0
    public void n() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.j6p0
    public void o() {
        post(new an90(this, (byte) 14));
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.j1.onNext(new gr41(i2, i4));
    }

    public NowPlayingScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public NowPlayingScrollView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ NowPlayingScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
