package com.spotify.allboarding.greatpicksloadingview;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.allboarding.uiusecases.contentstack.ContentStackView;
import com.spotify.encoreconsumermobile.elements.loadingdots.ThreeDotsLoaderView;
import com.spotify.encoremobile.facepile.FacePileView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b8k1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/spotify/allboarding/greatpicksloadingview/GreatPicksLoadingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_allboarding_greatpicksloadingview-greatpicksloadingview"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GreatPicksLoadingView extends ConstraintLayout {
    public final ThreeDotsLoaderView T0;
    public final ContentStackView U0;
    public final FacePileView V0;
    public final TextView W0;
    public final TextView X0;
    public final AnimatorSet Y0;

    /* JADX WARN: Multi-variable type inference failed */
    public GreatPicksLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = new AnimatorSet();
        View.inflate(context, 2131625061, this);
        this.T0 = b8k1.n(this, 2131428503);
        this.U0 = b8k1.n(this, 2131428227);
        this.V0 = b8k1.n(this, 2131429037);
        this.W0 = (TextView) b8k1.n(this, 2131430354);
        this.X0 = (TextView) b8k1.n(this, 2131430646);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.Y0.cancel();
    }

    public GreatPicksLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GreatPicksLoadingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ GreatPicksLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
