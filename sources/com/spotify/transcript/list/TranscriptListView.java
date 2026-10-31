package com.spotify.transcript.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.nbg1;
import p.rih1;
import p.zl7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001b\u0010\u001a\u001a\u00060\u0015R\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/spotify/transcript/list/TranscriptListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/reactivex/rxjava3/core/Observable;", "", "m2", "Lio/reactivex/rxjava3/core/Observable;", "getManualScrollObservable", "()Lio/reactivex/rxjava3/core/Observable;", "manualScrollObservable", "Lp/rih1;", "o2", "getScrollingObservable", "scrollingObservable", "Lp/nbg1;", "p2", "Lp/nbg1;", "getScroller", "()Lp/nbg1;", "scroller", "src_main_java_com_spotify_transcript_list-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TranscriptListView extends RecyclerView {
    public static final /* synthetic */ int q2 = 0;
    public final PublishSubject l2;
    public final PublishSubject m2;
    public final PublishSubject n2;
    public final PublishSubject o2;

    /* JADX INFO: renamed from: p2, reason: from kotlin metadata */
    public final nbg1 scroller;

    public TranscriptListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PublishSubject publishSubject = new PublishSubject();
        this.l2 = publishSubject;
        this.m2 = publishSubject;
        PublishSubject publishSubject2 = new PublishSubject();
        this.n2 = publishSubject2;
        this.o2 = publishSubject2;
        this.scroller = new nbg1(this);
        m(new zl7(this, (byte) 23));
        setHasFixedSize(true);
    }

    public final Observable<Boolean> getManualScrollObservable() {
        return this.m2;
    }

    public final nbg1 getScroller() {
        return this.scroller;
    }

    public final Observable<rih1> getScrollingObservable() {
        return this.o2;
    }

    public TranscriptListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TranscriptListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TranscriptListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
