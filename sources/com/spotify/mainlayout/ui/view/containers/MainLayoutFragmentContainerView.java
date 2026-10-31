package com.spotify.mainlayout.ui.view.containers;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.ce0;
import p.coz0;
import p.dvf0;
import p.een0;
import p.iu30;
import p.mma0;
import p.sgp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/spotify/mainlayout/ui/view/containers/MainLayoutFragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "<set-?>", "a", "Ljava/lang/Object;", "getCornerRadiusTop", "()F", "setCornerRadiusTop", "(F)V", "cornerRadiusTop", "Lkotlin/Function1;", "Landroid/view/WindowInsets;", "b", "Lp/iu30;", "getInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view", "()Lp/iu30;", "setInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view", "(Lp/iu30;)V", "insetsTransformer", "src_main_java_com_spotify_mainlayout_ui_view-view"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class MainLayoutFragmentContainerView extends FrameLayout {
    public static final /* synthetic */ mma0[] c = {new een0(MainLayoutFragmentContainerView.class, "cornerRadiusTop", "getCornerRadiusTop()F", 0)};
    public final ce0 a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public iu30 insetsTransformer;

    public MainLayoutFragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ce0(this);
        this.insetsTransformer = dvf0.Y;
        setClipToOutline(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, coz0.d, 0, 0);
        setCornerRadiusTop(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        return super.dispatchApplyWindowInsets((WindowInsets) this.insetsTransformer.invoke(windowInsets));
    }

    public final float getCornerRadiusTop() {
        mma0 mma0Var = c[0];
        return ((Number) ((sgp0) this.a).a).floatValue();
    }

    /* JADX INFO: renamed from: getInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view, reason: from getter */
    public final iu30 getInsetsTransformer() {
        return this.insetsTransformer;
    }

    public final void setCornerRadiusTop(float f) {
        this.a.c(c[0], this, Float.valueOf(f));
    }

    public final void setInsetsTransformer$src_main_java_com_spotify_mainlayout_ui_view_view(iu30 iu30Var) {
        this.insetsTransformer = iu30Var;
    }

    public MainLayoutFragmentContainerView(Context context) {
        this(context, null);
    }
}
