package com.spotify.encoreconsumermobile.elements.quickactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.encoreconsumermobile.elements.quickactions.ban.BanButton;
import com.spotify.encoreconsumermobile.elements.quickactions.hide.HideButton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.afz0;
import p.d7;
import p.eg;
import p.fft0;
import p.hid0;
import p.iu30;
import p.mk1;
import p.qez0;
import p.rez0;
import p.sez0;
import p.tez0;
import p.tlv;
import p.u890;
import p.uez0;
import p.zez0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/quickactions/QuickActionView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/zez0;", "viewContext", "(Lp/zez0;)V", "Lp/rih1;", "setViewContext", "src_main_java_com_spotify_encoreconsumermobile_elements_quickactions-quickactions"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class QuickActionView extends FrameLayout implements tlv {
    public iu30 a;

    public QuickActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = fft0.O0;
        context.getString(2131955428);
        setOnClickListener(new hid0(this, (byte) 20));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.mi90
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(uez0 uez0Var) throws NoWhenBranchMatchedException {
        int i;
        setClickable(!(uez0Var instanceof tez0));
        d7 d7Var = new d7(this, (byte) 8);
        View view = (View) (!d7Var.hasNext() ? null : d7Var.next());
        boolean zJ = u890.j((uez0) (view != null ? view.getTag() : null), uez0Var);
        tez0 tez0Var = tez0.a;
        sez0 sez0Var = sez0.a;
        rez0 rez0Var = rez0.a;
        if (!zJ) {
            removeAllViews();
            if (uez0Var.equals(rez0Var)) {
                i = 2131624081;
            } else if (uez0Var instanceof qez0) {
                i = 2131624019;
            } else if (uez0Var.equals(sez0Var)) {
                i = 2131625075;
            } else if (!uez0Var.equals(tez0Var)) {
                eg.o();
                return;
            }
            LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, true);
        }
        d7 d7Var2 = new d7(this, (byte) 8);
        mk1 mk1Var = (View) (d7Var2.hasNext() ? d7Var2.next() : null);
        if (mk1Var != null) {
            mk1Var.setTag(uez0Var);
        }
        if (uez0Var.equals(tez0Var)) {
            return;
        }
        if (uez0Var instanceof qez0) {
            mk1 mk1Var2 = mk1Var;
            mk1Var2.f(((qez0) uez0Var).a);
            mk1Var2.n(new afz0(this, (byte) 0));
        } else if (uez0Var.equals(rez0Var)) {
            BanButton banButton = (BanButton) mk1Var;
            banButton.a(true);
            banButton.n(new afz0(this, (byte) 1));
        } else {
            if (!uez0Var.equals(sez0Var)) {
                eg.o();
                return;
            }
            HideButton hideButton = (HideButton) mk1Var;
            hideButton.a(true);
            hideButton.n(new afz0(this, (byte) 2));
        }
    }

    @Override // p.mi90
    public final void n(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public QuickActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public QuickActionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ QuickActionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public QuickActionView(zez0 zez0Var) {
        this(zez0Var.a(), null, 0, 6, null);
        setViewContext(zez0Var);
    }

    public final void setViewContext(zez0 viewContext) {
    }
}
