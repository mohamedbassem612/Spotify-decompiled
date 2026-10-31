package com.spotify.encoreconsumermobile.elements.badge.contentrestriction;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.iu30;
import p.k4m;
import p.n0e1;
import p.tlv;
import p.zh2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/contentrestriction/ContentRestrictionBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lp/zh2;", "getOrCreateAgeRestrictionDrawable", "()Lp/zh2;", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_contentrestriction-contentrestriction"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContentRestrictionBadgeView extends AppCompatImageView implements tlv {
    public /* synthetic */ ContentRestrictionBadgeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zh2 getOrCreateAgeRestrictionDrawable() {
        Drawable drawable = getDrawable();
        return drawable instanceof zh2 ? (zh2) drawable : new zh2(getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void f(k4m k4mVar) {
        int iOrdinal = k4mVar.ordinal();
        if (iOrdinal == 0) {
            setImageDrawable(getOrCreateAgeRestrictionDrawable());
            setContentDescription(getContext().getString(2131959472));
            setVisibility(0);
            return;
        }
        if (iOrdinal == 1) {
            String string = getContext().getString(2131955842);
            Drawable drawable = getDrawable();
            setImageDrawable(drawable instanceof n0e1 ? (n0e1) drawable : new n0e1(getContext(), string));
            setContentDescription(getContext().getString(2131955840));
            setVisibility(0);
            return;
        }
        if (iOrdinal != 2) {
            setImageDrawable((Drawable) null);
            setVisibility(8);
            return;
        }
        String string2 = getContext().getString(2131955841);
        Drawable drawable2 = getDrawable();
        setImageDrawable(drawable2 instanceof n0e1 ? (n0e1) drawable2 : new n0e1(getContext(), string2));
        setContentDescription(string2);
        setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentRestrictionBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAdjustViewBounds(true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ContentRestrictionBadgeView(Context context) {
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public final void n(iu30 iu30Var) {
    }
}
