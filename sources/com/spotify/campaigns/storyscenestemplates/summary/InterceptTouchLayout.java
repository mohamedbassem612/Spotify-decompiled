package com.spotify.campaigns.storyscenestemplates.summary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.lx70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/spotify/campaigns/storyscenestemplates/summary/InterceptTouchLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lp/rih1;", "e", "Lkotlin/jvm/functions/Function0;", "getUserLeftClickListener$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates", "()Lkotlin/jvm/functions/Function0;", "setUserLeftClickListener$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates", "(Lkotlin/jvm/functions/Function0;)V", "userLeftClickListener", "src_main_java_com_spotify_campaigns_storyscenestemplates-storyscenestemplates"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InterceptTouchLayout extends FrameLayout {
    public boolean a;
    public boolean b;
    public float c;
    public float d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Function0 userLeftClickListener;

    public InterceptTouchLayout(Context context) {
        super(context);
        this.userLeftClickListener = lx70.t;
    }

    /* JADX INFO: renamed from: getUserLeftClickListener$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates, reason: from getter */
    public final Function0 getUserLeftClickListener() {
        return this.userLeftClickListener;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a && 2 == motionEvent.getAction()) {
            this.b = true;
            this.a = false;
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
        }
        if (!this.a && motionEvent.getAction() == 0) {
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
            this.a = true;
        }
        if (1 == motionEvent.getAction()) {
            if ((motionEvent.getX() == this.c && motionEvent.getY() == this.d && motionEvent.getX() <= ((float) (((double) getWidth()) * 0.5d)) && this.a && !this.b) || (motionEvent.getX() == this.c && motionEvent.getY() == this.d && this.b && motionEvent.getX() <= ((float) (((double) getWidth()) * 0.5d)))) {
                this.userLeftClickListener.invoke();
            }
            this.a = false;
            this.b = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setUserLeftClickListener$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates(Function0 function0) {
        this.userLeftClickListener = function0;
    }

    public InterceptTouchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.userLeftClickListener = lx70.t;
    }

    public InterceptTouchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.userLeftClickListener = lx70.t;
    }
}
