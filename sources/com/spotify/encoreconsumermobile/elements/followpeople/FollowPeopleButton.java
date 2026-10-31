package com.spotify.encoreconsumermobile.elements.followpeople;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.aqs;
import p.idd1;
import p.iu30;
import p.mmr0;
import p.mo2;
import p.t630;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/followpeople/FollowPeopleButton;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "Lp/rih1;", "setEnabled", "(Z)V", "Landroid/graphics/drawable/Drawable;", "e", "Lp/znb0;", "getFollowPeopleIcon", "()Landroid/graphics/drawable/Drawable;", "followPeopleIcon", "src_main_java_com_spotify_encoreconsumermobile_elements_followpeople-followpeople"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FollowPeopleButton extends StateListAnimatorImageButton implements tlv {
    public t630 d;
    public final idd1 e;
    public final idd1 f;

    public FollowPeopleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new idd1(new mo2(context, (byte) 23));
        this.f = new idd1(new mo2(context, (byte) 24));
    }

    private final Drawable getFollowPeopleIcon() {
        return (Drawable) this.e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(t630 t630Var) {
        this.d = t630Var;
        mmr0 mmr0Var = t630Var.a ? new mmr0((Drawable) this.f.getValue(), 2131956092) : new mmr0(getFollowPeopleIcon(), 2131956091);
        Drawable drawable = (Drawable) mmr0Var.a;
        int iIntValue = ((Number) mmr0Var.b).intValue();
        setImageDrawable(drawable);
        setContentDescription(getResources().getString(iIntValue, t630Var.b));
        setEnabled(t630Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new aqs(iu30Var, (byte) 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean enabled) {
        int i;
        t630 t630Var;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (enabled || ((t630Var = this.d) != null && t630Var.a)) {
                super/*android.view.View*/.setEnabled(true);
                i = 255;
            } else {
                super/*android.view.View*/.setEnabled(false);
                i = 76;
            }
            drawable.setAlpha(i);
        }
    }

    public FollowPeopleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FollowPeopleButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FollowPeopleButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
