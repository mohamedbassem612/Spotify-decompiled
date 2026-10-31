package com.spotify.aiplaylist.promptcreation.presentation.tracklist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b8k1;
import p.bhn0;
import p.ce0;
import p.een0;
import p.mma0;
import p.uk70;
import p.x74;
import p.ycc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/spotify/aiplaylist/promptcreation/presentation/tracklist/IconAddBadgeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isActive", "Lp/rih1;", "setAccessibility", "(Z)V", "<set-?>", "b", "Ljava/lang/Object;", "isIconActive", "()Z", "setIconActive", "src_main_java_com_spotify_aiplaylist_promptcreation-promptcreation"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IconAddBadgeView extends FrameLayout {
    public static final /* synthetic */ mma0[] c = {new een0(IconAddBadgeView.class, "isIconActive", "isIconActive()Z", 0)};
    public final ycc1 a;
    public final ce0 b;

    public IconAddBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(2131624018, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            bhn0.i("rootView");
            throw null;
        }
        ImageView imageView = (ImageView) viewInflate;
        this.a = new ycc1(imageView, imageView, (byte) 12);
        imageView.setImageTintList(x74.E(imageView.getContext(), 2131101518));
        this.b = new ce0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAccessibility(boolean isActive) {
        ycc1 ycc1Var = this.a;
        if (isActive) {
            ((ImageView) ycc1Var.c).setContentDescription(getResources().getString(2131963176));
            ImageView imageView = (ImageView) ycc1Var.c;
            b8k1.p(imageView, new uk70(imageView, 2131963175));
        } else {
            ((ImageView) ycc1Var.c).setContentDescription(getResources().getString(2131960159));
            ImageView imageView2 = (ImageView) ycc1Var.c;
            b8k1.p(imageView2, new uk70(imageView2, 2131960158));
        }
    }

    public final void setIconActive(boolean z) {
        this.b.c(c[0], this, Boolean.valueOf(z));
    }

    public IconAddBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public IconAddBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ IconAddBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
