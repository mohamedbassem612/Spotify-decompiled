package com.spotify.encoreconsumermobile.elements.follow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.cvr;
import p.don1;
import p.eg;
import p.eix;
import p.f430;
import p.g330;
import p.g430;
import p.iu30;
import p.l1d;
import p.tlv;
import p.x74;
import p.z6p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/follow/EncoreFollowButton;", "Lcom/spotify/encoremobile/component/buttons/EncoreButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_follow-follow"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EncoreFollowButton extends EncoreButton implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public EncoreFollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, (eix) null, 8, (DefaultConstructorMarker) null);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setStrokeColor(x74.E(context, 2131101369));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void f(g330 g330Var) {
        int dimensionPixelSize;
        CharSequence text;
        int i = g330Var.a;
        setActivated(i == 1);
        z6p1 z6p1Var = g330Var.c;
        if (z6p1Var instanceof f430) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165810);
        } else {
            if (!(z6p1Var instanceof g430)) {
                eg.o();
                return;
            }
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165812);
        }
        setCornerRadius(dimensionPixelSize);
        int iC = l1d.C(i);
        if (iC == 0) {
            text = getContext().getText(2131956074);
        } else if (iC == 1) {
            text = getContext().getText(2131956075);
        } else {
            if (iC != 2) {
                eg.o();
                return;
            }
            text = getContext().getText(2131956066);
        }
        setText(text);
        setContentDescription(don1.t(i, getResources()));
        setAlpha(g330Var.b ? 0.3f : 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new cvr(this, iu30Var, (byte) 23));
    }

    public EncoreFollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EncoreFollowButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EncoreFollowButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2130969232 : i);
    }
}
