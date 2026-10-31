package com.spotify.encoreconsumermobile.elements.downloadbutton;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.aqs;
import p.cdf0;
import p.eg;
import p.f1v;
import p.iu30;
import p.k1v;
import p.m1v;
import p.oqr;
import p.p1v;
import p.rwq0;
import p.sru;
import p.tlv;
import p.yjq;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/downloadbutton/DownloadButtonView;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/sru;", "model", "Lp/rih1;", "setDrawable", "(Lp/sru;)V", "", "enabled", "setEnabled", "(Z)V", "src_main_java_com_spotify_encoreconsumermobile_elements_downloadbutton-downloadbutton"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DownloadButtonView extends StateListAnimatorImageButton implements tlv {
    public final yjq d;
    public sru e;
    public boolean f;
    public Float g;

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new yjq(context);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setDrawable(sru model) {
        setImageDrawable(this.d.n(model.a));
        setVisibility(0);
        if (model.a instanceof k1v) {
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(sru sruVar, sru sruVar2) {
        p1v p1vVar = sruVar2.a;
        boolean z = p1vVar instanceof k1v;
        if (z) {
            this.g = ((k1v) p1vVar).a;
        }
        boolean z2 = this.f;
        Float f = this.g;
        if (z2 && p1vVar.equals(new k1v(null)) && f != null) {
            return;
        }
        c();
        this.f = false;
        if (p1vVar instanceof m1v) {
            setImageDrawable((Drawable) null);
            setContentDescription(null);
            setVisibility(8);
            this.e = null;
            return;
        }
        if (sruVar == null) {
            eg.m("currentState should not be null here");
            return;
        }
        p1v p1vVar2 = sruVar.a;
        yjq yjqVar = this.d;
        byte b = 1;
        if (yjqVar.q(p1vVar2, p1vVar)) {
            if (z) {
                this.f = true;
            }
            setImageDrawable(yjqVar.p(p1vVar2, p1vVar, new oqr(this, sruVar2, b)));
        } else {
            setDrawable(sruVar2);
        }
        setContentDescription(rwq0.q(getContext(), sruVar2));
        setEnabled(!p1vVar.equals(f1v.a));
        this.e = sruVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        cdf0 drawable = getDrawable();
        cdf0 cdf0Var = drawable instanceof cdf0 ? drawable : null;
        if (cdf0Var != null) {
            cdf0Var.b.removeAllListeners();
        }
        Drawable drawable2 = getDrawable();
        cdf0 cdf0Var2 = drawable2 instanceof cdf0 ? (cdf0) drawable2 : null;
        if (cdf0Var2 != null) {
            cdf0Var2.h();
        }
    }

    public final void f(Object obj) {
        sru sruVar = (sru) obj;
        sru sruVar2 = this.e;
        if (sruVar2 == null) {
            this.e = sruVar;
            sruVar2 = sruVar;
        }
        b(sruVar2, sruVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new aqs(iu30Var, (byte) 16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean enabled) {
        super/*android.view.View*/.setEnabled(enabled);
        setAlpha(enabled ? 1.0f : 0.3f);
        getDrawable().setAlpha(enabled ? 255 : 77);
    }

    public DownloadButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DownloadButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DownloadButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
