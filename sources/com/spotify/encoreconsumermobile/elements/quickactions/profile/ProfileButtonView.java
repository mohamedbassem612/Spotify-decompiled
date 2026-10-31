package com.spotify.encoreconsumermobile.elements.quickactions.profile;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.encoremobile.facepile.FacePileView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.gw70;
import p.iu30;
import p.jn90;
import p.pze0;
import p.tlv;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/quickactions/profile/ProfileButtonView;", "Lcom/spotify/encoremobile/facepile/FacePileView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/gw70;", "imageLoader", "Lp/rih1;", "setImageLoader", "(Lp/gw70;)V", "src_main_java_com_spotify_encoreconsumermobile_elements_quickactions-quickactions"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileButtonView extends FacePileView implements tlv {
    public gw70 f;

    public ProfileButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setContentDescription(getResources().getString(2131960450));
    }

    public final void f(Object obj) {
        pze0.m(obj);
        if (this.f != null) {
            throw null;
        }
        u890.C("imageLoader");
        throw null;
    }

    public final void n(iu30 iu30Var) {
        setOnClickListener(new jn90(iu30Var, (byte) 24));
    }

    public final void setImageLoader(gw70 imageLoader) {
        this.f = imageLoader;
    }

    public ProfileButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ProfileButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ProfileButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
