package com.spotify.encoreconsumermobile.elements.entityaction;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.encoreconsumermobile.elements.addtobutton.EncoreAddToButtonView;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.ccm;
import p.cet0;
import p.cvr;
import p.eg;
import p.gcy;
import p.hhx;
import p.iu30;
import p.k8p1;
import p.l1d;
import p.nby;
import p.nln;
import p.oby;
import p.ofg;
import p.pby;
import p.pk1;
import p.q4u;
import p.qby;
import p.rby;
import p.sby;
import p.sru;
import p.tby;
import p.tlv;
import p.uby;
import p.vby;
import p.w3w;
import p.wqg0;
import p.x20;
import p.xx61;
import p.yzo1;
import p.zby;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@adt
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityActionView;", "", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "Lp/rih1;", "setEnabled", "(Z)V", "Landroid/view/View;", "getActionViewSlot", "()Landroid/view/View;", "actionViewSlot", "src_main_java_com_spotify_encoreconsumermobile_elements_entityaction-entityaction"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class EntityActionView extends FrameLayout implements tlv {
    public static final /* synthetic */ int d = 0;
    public iu30 a;
    public zby b;
    public final q4u c;

    public EntityActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, 2131624586, this);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.c = nln.v(new gcy(this));
    }

    private final View getActionViewSlot() {
        return findViewById(2131428667);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.mi90
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(zby zbyVar) throws NoWhenBranchMatchedException {
        int dimensionPixelSize;
        this.b = zbyVar;
        this.c.a(zbyVar);
        vby vbyVar = zbyVar.a;
        if ((vbyVar instanceof pby) || (vbyVar instanceof sby)) {
            return;
        }
        View actionViewSlot = getActionViewSlot();
        EncoreButton encoreButton = actionViewSlot instanceof EncoreButton ? (EncoreButton) actionViewSlot : null;
        if (encoreButton != null) {
            int iC = l1d.C(zbyVar.c);
            if (iC == 0) {
                dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165806);
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165807);
            }
            encoreButton.setIconSize(dimensionPixelSize);
        }
    }

    public final void b() {
        iu30 iu30Var;
        zby zbyVar = this.b;
        if (((zbyVar != null ? zbyVar.a : null) instanceof pby) || (iu30Var = this.a) == null) {
            return;
        }
        KeyEvent.Callback actionViewSlot = getActionViewSlot();
        tlv tlvVar = actionViewSlot instanceof tlv ? (tlv) actionViewSlot : null;
        if (tlvVar != null) {
            tlvVar.n(new w3w(this, iu30Var, (byte) 19));
        } else {
            getActionViewSlot().setOnClickListener(new cvr(this, iu30Var, (byte) 24));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void c(zby zbyVar) throws NoWhenBranchMatchedException {
        vby vbyVar = zbyVar.a;
        if (vbyVar instanceof sby) {
            cet0 cet0VarT = yzo1.t((sby) vbyVar);
            getActionViewSlot().setVisibility(0);
            View actionViewSlot = getActionViewSlot();
            if (!(actionViewSlot instanceof PlayButtonView)) {
                actionViewSlot = null;
            }
            PlayButtonView playButtonView = (PlayButtonView) actionViewSlot;
            if (playButtonView != null) {
                playButtonView.B(cet0VarT);
            } else {
                PlayButtonView playButtonView2 = new PlayButtonView(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                k8p1.o(getActionViewSlot(), playButtonView2);
                playButtonView2.B(cet0VarT);
                b();
            }
        } else if (vbyVar instanceof qby) {
            sru sruVarS = yzo1.s((qby) vbyVar);
            getActionViewSlot().setVisibility(0);
            View actionViewSlot2 = getActionViewSlot();
            if (!(actionViewSlot2 instanceof hhx)) {
                actionViewSlot2 = null;
            }
            hhx hhxVar = (hhx) actionViewSlot2;
            if (hhxVar != null) {
                hhxVar.h(sruVarS);
            } else {
                hhx hhxVar2 = new hhx(getContext(), 0);
                k8p1.o(getActionViewSlot(), hhxVar2);
                hhxVar2.h(sruVarS);
                b();
            }
        } else if (vbyVar instanceof tby) {
            pk1 pk1VarR = yzo1.r((tby) vbyVar);
            getActionViewSlot().setVisibility(0);
            View actionViewSlot3 = getActionViewSlot();
            if (!(actionViewSlot3 instanceof EncoreAddToButtonView)) {
                actionViewSlot3 = null;
            }
            EncoreAddToButtonView encoreAddToButtonView = (EncoreAddToButtonView) actionViewSlot3;
            if (encoreAddToButtonView != null) {
                encoreAddToButtonView.g(pk1VarR);
            } else {
                EncoreAddToButtonView encoreAddToButtonView2 = new EncoreAddToButtonView(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                k8p1.o(getActionViewSlot(), encoreAddToButtonView2);
                encoreAddToButtonView2.g(pk1VarR);
                b();
            }
        } else if (vbyVar instanceof oby) {
            getActionViewSlot().setVisibility(0);
            View actionViewSlot4 = getActionViewSlot();
            if (!(actionViewSlot4 instanceof ccm)) {
                actionViewSlot4 = null;
            }
            if (((ccm) actionViewSlot4) == null) {
                k8p1.o(getActionViewSlot(), new ccm(getContext()));
                b();
            }
        } else if (vbyVar instanceof rby) {
            getActionViewSlot().setVisibility(0);
            View actionViewSlot5 = getActionViewSlot();
            if (!(actionViewSlot5 instanceof wqg0)) {
                actionViewSlot5 = null;
            }
            if (((wqg0) actionViewSlot5) == null) {
                k8p1.o(getActionViewSlot(), new wqg0(getContext()));
                b();
            }
        } else if (vbyVar instanceof nby) {
            getActionViewSlot().setVisibility(0);
            View actionViewSlot6 = getActionViewSlot();
            if (!(actionViewSlot6 instanceof ofg)) {
                actionViewSlot6 = null;
            }
            if (((ofg) actionViewSlot6) == null) {
                k8p1.o(getActionViewSlot(), new ofg(getContext()));
                b();
            }
        } else if (vbyVar instanceof uby) {
            getActionViewSlot().setVisibility(0);
            View actionViewSlot7 = getActionViewSlot();
            if (!(actionViewSlot7 instanceof xx61)) {
                actionViewSlot7 = null;
            }
            if (((xx61) actionViewSlot7) == null) {
                k8p1.o(getActionViewSlot(), new xx61(getContext()));
                b();
            }
        } else {
            if (!(vbyVar instanceof pby)) {
                eg.o();
                return;
            }
            getActionViewSlot().setVisibility(0);
            View actionViewSlot8 = getActionViewSlot();
            if (actionViewSlot8 == null) {
                actionViewSlot8 = null;
            }
            if (actionViewSlot8 != null) {
                k8p1.o(actionViewSlot8, ((pby) vbyVar).a);
            } else {
                View view = ((pby) vbyVar).a;
                k8p1.o(getActionViewSlot(), view);
                k8p1.o(view, view);
                b();
            }
        }
        if (getActionViewSlot() instanceof x20) {
            getActionViewSlot().setContentDescription(null);
        }
        getActionViewSlot().setImportantForAccessibility(zbyVar.b ? 1 : 2);
    }

    @Override // p.mi90
    public final void n(iu30 iu30Var) {
        this.a = iu30Var;
        b();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        getActionViewSlot().setEnabled(enabled);
    }

    public EntityActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EntityActionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EntityActionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
