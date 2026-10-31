package com.spotify.encoreconsumermobile.elements.badge.download;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.eg;
import p.g4b1;
import p.hhg1;
import p.idd1;
import p.j4b1;
import p.nru;
import p.o1v;
import p.tlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/download/DownloadBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_download-download"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DownloadBadgeView extends AppCompatImageView implements tlv {
    public /* synthetic */ DownloadBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void f(o1v o1vVar) {
        int iOrdinal = o1vVar.ordinal();
        if (iOrdinal == 0) {
            setImageDrawable((Drawable) null);
            setVisibility(8);
            return;
        }
        if (iOrdinal == 1) {
            d(o1v.b, 2131955024);
            return;
        }
        if (iOrdinal == 2) {
            d(o1v.c, 2131955022);
            return;
        }
        if (iOrdinal == 3) {
            d(o1v.d, 2131955021);
        } else if (iOrdinal == 4) {
            d(o1v.e, 2131955023);
        } else {
            eg.o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(o1v o1vVar, int i) {
        nru nruVar;
        Drawable drawable = getDrawable();
        if (drawable instanceof nru) {
            nruVar = (nru) drawable;
            if (nruVar.g == o1vVar) {
                nruVar.setCallback(null);
            } else {
                nruVar = new nru(getContext());
            }
        } else {
            nruVar = new nru(getContext());
        }
        idd1 idd1Var = nruVar.f;
        nruVar.setCallback(this);
        g4b1 g4b1Var = nruVar.d;
        if (nruVar.g != o1vVar) {
            nruVar.g = o1vVar;
            int iOrdinal = o1vVar.ordinal();
            if (iOrdinal == 0) {
                hhg1.n("DownloadBadgeDrawable.State cannot be Empty");
                return;
            }
            if (iOrdinal == 1) {
                ((ObjectAnimator) idd1Var.getValue()).cancel();
                g4b1Var.a = j4b1.z2;
                g4b1Var.f();
                g4b1Var.g();
                g4b1Var.invalidateSelf();
                g4b1Var.c(nruVar.b);
            } else if (iOrdinal == 2) {
                ((ObjectAnimator) idd1Var.getValue()).start();
            } else if (iOrdinal == 3) {
                ((ObjectAnimator) idd1Var.getValue()).cancel();
                g4b1Var.a = j4b1.A2;
                g4b1Var.f();
                g4b1Var.g();
                g4b1Var.invalidateSelf();
                g4b1Var.c(nruVar.a);
            } else {
                if (iOrdinal != 4) {
                    eg.o();
                    return;
                }
                ((ObjectAnimator) idd1Var.getValue()).cancel();
                g4b1Var.a = j4b1.L2;
                g4b1Var.f();
                g4b1Var.g();
                g4b1Var.invalidateSelf();
                g4b1Var.c(nruVar.c);
            }
            nruVar.invalidateSelf();
        }
        setImageDrawable(nruVar);
        setContentDescription(getContext().getString(i));
        setVisibility(0);
    }

    public DownloadBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAdjustViewBounds(true);
    }

    public DownloadBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }
}
