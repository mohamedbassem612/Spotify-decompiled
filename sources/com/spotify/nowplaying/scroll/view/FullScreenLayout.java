package com.spotify.nowplaying.scroll.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.hhg1;
import p.jch0;
import p.mmr0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/spotify/nowplaying/scroll/view/FullScreenLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "b", "Z", "getFillScreenHeight", "()Z", "setFillScreenHeight", "(Z)V", "fillScreenHeight", "getScreenWidth", "()I", "screenWidth", "getScreenHeight", "screenHeight", "src_main_java_com_spotify_nowplaying_scroll-scroll"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class FullScreenLayout extends FrameLayout {
    public final BehaviorProcessor a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean fillScreenHeight;

    public FullScreenLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = BehaviorProcessor.e0(Boolean.TRUE);
        this.fillScreenHeight = true;
    }

    private final int getScreenHeight() {
        return getRootView().getHeight();
    }

    private final int getScreenWidth() {
        return getRootView().getWidth();
    }

    public final boolean getFillScreenHeight() {
        return this.fillScreenHeight;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        mmr0 mmr0Var;
        mmr0 mmr0Var2;
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        View view2 = view;
        while (true) {
            if (view2 == null) {
                int iMin = Math.min(view != null ? view.getWidth() : 0, getScreenWidth());
                int iMin2 = Math.min(view != null ? view.getHeight() : 0, getScreenHeight());
                if (iMin > 0 && iMin2 > 0) {
                    mmr0Var = new mmr0(Integer.valueOf(iMin), Integer.valueOf(iMin2));
                    break;
                }
                int iMin3 = Math.min(View.MeasureSpec.getSize(i), getScreenWidth());
                int iMin4 = Math.min(View.MeasureSpec.getSize(i2), getScreenHeight());
                if (iMin3 > 0 && iMin4 > 0) {
                    mmr0Var = new mmr0(Integer.valueOf(iMin3), Integer.valueOf(iMin4));
                    break;
                } else {
                    mmr0Var = new mmr0(Integer.valueOf(getScreenWidth()), Integer.valueOf(getScreenHeight()));
                    break;
                }
            }
            int iMin5 = Math.min(view2.getWidth(), getScreenWidth());
            int iMin6 = Math.min(view2.getHeight(), getScreenHeight());
            if (iMin5 > 0 && iMin6 > 0 && ((view2 instanceof NestedScrollView) || (view2 instanceof ScrollView))) {
                mmr0Var = new mmr0(Integer.valueOf(iMin5), Integer.valueOf(iMin6));
                break;
            } else {
                Object parent2 = view2.getParent();
                view2 = parent2 instanceof View ? (View) parent2 : null;
            }
        }
        int iIntValue = ((Number) mmr0Var.a).intValue();
        int iIntValue2 = ((Number) mmr0Var.b).intValue();
        if (this.fillScreenHeight) {
            mmr0Var2 = new mmr0(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        } else {
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue < 0) {
                hhg1.n("Reference value must be non-negative.");
                return;
            }
            mmr0Var2 = new mmr0(numValueOf, Integer.valueOf(Math.min(iIntValue2, jch0.U(iIntValue * 1.8f))));
        }
        super.onMeasure(View.MeasureSpec.getMode(i) == 0 ? View.MeasureSpec.makeMeasureSpec(((Number) mmr0Var2.a).intValue(), 1073741824) : View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.getMode(i2) == 0 ? View.MeasureSpec.makeMeasureSpec(((Number) mmr0Var2.b).intValue(), 1073741824) : View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        this.a.onNext(Boolean.valueOf(getMeasuredHeight() == iIntValue2));
    }

    public final void setFillScreenHeight(boolean z) {
        this.fillScreenHeight = z;
    }

    public FullScreenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FullScreenLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FullScreenLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
