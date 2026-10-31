package com.spotify.aiplaylist.promptcreation.presentation.tracklist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.aqf1;
import p.bhn0;
import p.q881;
import p.qqf1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/aiplaylist/promptcreation/presentation/tracklist/TrackListView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lp/aqf1;", "tracks", "Lp/rih1;", "setContent", "(Ljava/util/List;)V", "", "isWaitingForAnswer", "setIsWaitingForAnswer", "(Z)V", "src_main_java_com_spotify_aiplaylist_promptcreation-promptcreation"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrackListView extends FrameLayout {
    public final q881 a;
    public qqf1 b;

    public TrackListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        RecyclerView recyclerViewInflate = LayoutInflater.from(context).inflate(2131626279, (ViewGroup) this, false);
        addView(recyclerViewInflate);
        if (recyclerViewInflate == null) {
            bhn0.i("rootView");
            throw null;
        }
        RecyclerView recyclerView = recyclerViewInflate;
        this.a = new q881(recyclerView, recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
    }

    public final void setContent(List<aqf1> tracks) {
        qqf1 qqf1Var = this.b;
        if (qqf1Var == null) {
            u890.C("adapter");
            throw null;
        }
        qqf1Var.C(tracks);
        ((RecyclerView) this.a.b).setNestedScrollingEnabled(true);
    }

    public final void setIsWaitingForAnswer(boolean isWaitingForAnswer) {
        qqf1 qqf1Var = this.b;
        if (qqf1Var != null) {
            qqf1Var.t = isWaitingForAnswer;
        } else {
            u890.C("adapter");
            throw null;
        }
    }

    public TrackListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TrackListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TrackListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
