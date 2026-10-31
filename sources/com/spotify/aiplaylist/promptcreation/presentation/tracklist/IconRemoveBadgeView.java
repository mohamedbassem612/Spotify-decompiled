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
import p.hyy0;
import p.mma0;
import p.x74;
import p.xf;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/spotify/aiplaylist/promptcreation/presentation/tracklist/IconRemoveBadgeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "<set-?>", "b", "Ljava/lang/Object;", "isIconVisible", "()Z", "setIconVisible", "(Z)V", "src_main_java_com_spotify_aiplaylist_promptcreation-promptcreation"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IconRemoveBadgeView extends FrameLayout {
    public static final /* synthetic */ mma0[] c = {new een0(IconRemoveBadgeView.class, "isIconVisible", "isIconVisible()Z", 0)};
    public final hyy0 a;
    public final ce0 b;

    public IconRemoveBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(2131625584, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            bhn0.i("rootView");
            throw null;
        }
        ImageView imageView = (ImageView) viewInflate;
        this.a = new hyy0(imageView, imageView, (byte) 26);
        imageView.setImageTintList(x74.E(imageView.getContext(), 2131101518));
        b8k1.p(imageView, new xf(imageView, (byte) 5));
        this.b = new ce0(this);
    }

    public final void setIconVisible(boolean z) {
        this.b.c(c[0], this, Boolean.valueOf(z));
    }

    public IconRemoveBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public IconRemoveBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ IconRemoveBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
