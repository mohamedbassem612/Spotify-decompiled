package com.spotify.transcript.uiusecases.zoomimageview;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.mmr0;
import p.n8p1;
import p.x37;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/spotify/transcript/uiusecases/zoomimageview/ZoomImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/RectF;", "rect", "Lp/rih1;", "setInitialRect", "(Landroid/graphics/RectF;)V", "Lp/mmr0;", "Landroid/graphics/PointF;", "Lcom/spotify/transcript/uiusecases/zoomimageview/viewfinder/Pointers;", "pointers", "setInitialEventPointers", "(Lp/mmr0;)V", "getRectF", "()Landroid/graphics/RectF;", "N0", "Lcom/spotify/transcript/uiusecases/zoomimageview/ZoomImageView;", "getView", "()Lcom/spotify/transcript/uiusecases/zoomimageview/ZoomImageView;", "view", "src_main_java_com_spotify_transcript_uiusecases_zoomimageview-zoomimageview"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class ZoomImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public final ZoomImageView view;
    public final AttributeSet d;
    public final int e;
    public final mmr0 f;
    public final RectF g;
    public int h;
    public final PointF i;
    public final PointF t;

    public ZoomImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = attributeSet;
        this.e = i;
        this.f = new mmr0(new PointF(), new PointF());
        this.g = new RectF();
        this.i = new PointF();
        this.t = new PointF();
        this.view = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setInitialRect(RectF rect) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new x37(this, rect, (byte) 18));
            return;
        }
        RectF rectF = this.g;
        rectF.set(rect);
        setTranslationX(rectF.left);
        setTranslationY(rectF.top);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, android.widget.ImageView, androidx.appcompat.widget.AppCompatImageView, com.spotify.transcript.uiusecases.zoomimageview.ZoomImageView] */
    public final ZoomImageView c(RectF rectF) {
        ?? zoomImageView = new ZoomImageView(getContext(), this.d, this.e);
        zoomImageView.setId(getId());
        zoomImageView.setLayoutParams(getLayoutParams());
        zoomImageView.setImageDrawable(getDrawable());
        zoomImageView.setScaleType(getScaleType());
        zoomImageView.setVisibility(4);
        zoomImageView.setInitialRect(rectF);
        return zoomImageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float d(mmr0 mmr0Var) {
        float fO = yoi1.o(n8p1.m(mmr0Var) / n8p1.m(this.f), 1.0f, 3.0f);
        setScaleX(fO);
        setScaleY(fO);
        PointF pointFB = n8p1.B((PointF) mmr0Var.a, (PointF) mmr0Var.b);
        float f = pointFB.x / 2.0f;
        float f2 = pointFB.y / 2.0f;
        PointF pointF = this.t;
        pointF.set(f, f2);
        PointF pointFL = n8p1.l(pointF, this.i);
        RectF rectF = this.g;
        setTranslationX(rectF.left + pointFL.x);
        setTranslationY(rectF.top + pointFL.y);
        return fO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RectF getRectF() {
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        return new RectF(rect);
    }

    public /* bridge */ View getView() {
        return getView();
    }

    public void setInitialEventPointers(mmr0 pointers) {
        mmr0 mmr0Var = this.f;
        ((PointF) mmr0Var.a).set((PointF) pointers.a);
        Object obj = mmr0Var.b;
        ((PointF) obj).set((PointF) pointers.b);
        PointF pointFB = n8p1.B((PointF) mmr0Var.a, (PointF) obj);
        this.i.set(pointFB.x / 2.0f, pointFB.y / 2.0f);
    }

    public ZoomImageView getView() {
        return this.view;
    }

    public ZoomImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ZoomImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ZoomImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
