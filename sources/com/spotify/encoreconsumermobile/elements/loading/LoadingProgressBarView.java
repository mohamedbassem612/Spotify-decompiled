package com.spotify.encoreconsumermobile.elements.loading;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.f0o1;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@adt
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/loading/LoadingProgressBarView;", "Landroid/widget/ProgressBar;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_loading-loading"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class LoadingProgressBarView extends ProgressBar implements tlv {
    public LoadingProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setIndeterminate(true);
        setIndeterminateDrawable(f0o1.j(context, 2131233476));
    }

    public final void f(Object obj) {
        setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }

    public LoadingProgressBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LoadingProgressBarView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ LoadingProgressBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
