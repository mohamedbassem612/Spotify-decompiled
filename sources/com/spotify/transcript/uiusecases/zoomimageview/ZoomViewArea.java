package com.spotify.transcript.uiusecases.zoomimageview;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.eg;
import p.f180;
import p.g180;
import p.idd1;
import p.l1d;
import p.mmr0;
import p.n8p1;
import p.x37;
import p.yrm1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/spotify/transcript/uiusecases/zoomimageview/ZoomViewArea;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/f180;", "foundImageView", "Lp/rih1;", "setupZoomImageView", "(Lp/f180;)V", "", "scaleFactor", "setOverlayOpacity", "(F)V", "Landroid/view/View;", "a", "Landroid/view/View;", "getZoomParentView", "()Landroid/view/View;", "setZoomParentView", "(Landroid/view/View;)V", "zoomParentView", "Lp/g180;", "f", "Lp/znb0;", "getViewFinder", "()Lp/g180;", "viewFinder", "src_main_java_com_spotify_transcript_uiusecases_zoomimageview-zoomimageview"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ZoomViewArea extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View zoomParentView;
    public ZoomImageView b;
    public final FrameLayout c;
    public ZoomImageView d;
    public int e;
    public final idd1 f;

    public ZoomViewArea(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setTranslationZ(Float.MAX_VALUE);
        frameLayout.setAlpha(0.0f);
        this.c = frameLayout;
        this.e = 1;
        this.f = new idd1(new yrm1(this, (byte) 9));
        addView(frameLayout);
        setFocusableInTouchMode(true);
    }

    public static mmr0 a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return null;
        }
        return new mmr0(new PointF(motionEvent.getX(0), motionEvent.getY(0)), new PointF(motionEvent.getX(1), motionEvent.getY(1)));
    }

    private final g180 getViewFinder() {
        return (g180) this.f.getValue();
    }

    private final void setOverlayOpacity(float scaleFactor) {
        this.c.setAlpha(Math.min((scaleFactor + 0.2f) - 1.0f, 0.6f));
    }

    private final void setupZoomImageView(f180 foundImageView) {
        View view = foundImageView.a.getView();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new x37(foundImageView, this, (byte) 19));
            return;
        }
        ZoomImageView zoomImageViewC = foundImageView.a.c(foundImageView.b);
        this.b = zoomImageViewC;
        addView(zoomImageViewC.getView());
    }

    public final View getZoomParentView() {
        return this.zoomParentView;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mmr0 mmr0VarA;
        Boolean bool;
        if (motionEvent.getActionMasked() != 5 || (mmr0VarA = a(motionEvent)) == null) {
            return false;
        }
        f180 f180VarB = getViewFinder().b(mmr0VarA);
        if (f180VarB != null) {
            setupZoomImageView(f180VarB);
            this.d = f180VarB.a;
            ZoomImageView zoomImageView = this.b;
            if (zoomImageView != null) {
                zoomImageView.setInitialEventPointers(mmr0VarA);
            }
            this.e = 2;
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ZoomImageView zoomImageView;
        ZoomImageView zoomImageView2;
        View view;
        View view2;
        ZoomImageView zoomImageView3 = this.b;
        if (zoomImageView3 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                zoomImageView = this.d;
                if (zoomImageView != null && (view = zoomImageView.getView()) != null) {
                    view.setVisibility(0);
                }
                this.d = null;
                zoomImageView2 = this.b;
                if (zoomImageView2 != null) {
                    removeView(zoomImageView2.getView());
                    this.b = null;
                }
                this.c.setAlpha(0.0f);
                this.e = 1;
            } else if (actionMasked == 2) {
                int iC = l1d.C(this.e);
                if (iC != 0) {
                    if (iC == 1) {
                        mmr0 mmr0VarA = a(motionEvent);
                        if (mmr0VarA != null && zoomImageView3.d(mmr0VarA) >= 1.1f) {
                            zoomImageView3.getView().setVisibility(0);
                            zoomImageView3.getView().setTranslationZ(Float.MAX_VALUE);
                            ZoomImageView zoomImageView4 = this.d;
                            if (zoomImageView4 != null && (view2 = zoomImageView4.getView()) != null) {
                                view2.setVisibility(4);
                            }
                            this.e = 3;
                        }
                    } else if (iC == 2) {
                        mmr0 mmr0VarA2 = a(motionEvent);
                        if (mmr0VarA2 != null) {
                            setOverlayOpacity(zoomImageView3.d(mmr0VarA2));
                        }
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return false;
                        }
                        ZoomImageView zoomImageView5 = this.b;
                        if (zoomImageView5 != null) {
                            PointF pointF = new PointF(motionEvent.getX(0), motionEvent.getY(0));
                            RectF rectF = zoomImageView5.g;
                            int i = zoomImageView5.h;
                            mmr0 mmr0Var = zoomImageView5.f;
                            PointF pointFL = n8p1.l(pointF, (PointF) (i == 0 ? mmr0Var.a : mmr0Var.b));
                            zoomImageView5.setTranslationX(rectF.left + pointFL.x);
                            zoomImageView5.setTranslationY(rectF.top + pointFL.y);
                        }
                    }
                }
            } else if (actionMasked == 3) {
                zoomImageView = this.d;
                if (zoomImageView != null) {
                    view.setVisibility(0);
                }
                this.d = null;
                zoomImageView2 = this.b;
                if (zoomImageView2 != null) {
                    removeView(zoomImageView2.getView());
                    this.b = null;
                }
                this.c.setAlpha(0.0f);
                this.e = 1;
            } else if (actionMasked == 6 && this.e == 3) {
                zoomImageView3.h = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.e = 4;
            }
            if (this.e != 1) {
                return true;
            }
        }
        return false;
    }

    public final void setZoomParentView(View view) {
        this.zoomParentView = view;
    }

    public ZoomViewArea(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ZoomViewArea(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ZoomViewArea(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
