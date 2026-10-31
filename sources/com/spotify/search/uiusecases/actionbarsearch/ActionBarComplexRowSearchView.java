package com.spotify.search.uiusecases.actionbarsearch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.addtobutton.EncoreAddToButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b20;
import p.bhn0;
import p.eg;
import p.eyh0;
import p.iu30;
import p.j7p1;
import p.l1d;
import p.m5n1;
import p.pk1;
import p.qj;
import p.qk1;
import p.tlv;
import p.y10;
import p.ydh;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/spotify/search/uiusecases/actionbarsearch/ActionBarComplexRowSearchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_search_uiusecases-uiusecases"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class ActionBarComplexRowSearchView extends ConstraintLayout implements tlv {
    public final eyh0 T0;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBarComplexRowSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131623971, (ViewGroup) this);
        int i2 = 2131427517;
        EncoreAddToButtonView encoreAddToButtonViewT = m5n1.t(this, 2131427517);
        if (encoreAddToButtonViewT != null) {
            i2 = 2131428234;
            ContextMenuButton contextMenuButtonT = m5n1.t(this, 2131428234);
            if (contextMenuButtonT != null) {
                this.T0 = new eyh0(this, encoreAddToButtonViewT, contextMenuButtonT, (byte) 9);
                setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void n(iu30 iu30Var) {
        eyh0 eyh0Var = this.T0;
        ((EncoreAddToButtonView) eyh0Var.c).n(new qj(iu30Var, (byte) 3));
        ((ContextMenuButton) eyh0Var.d).n(new qj(iu30Var, (byte) 4));
    }

    public final boolean y() {
        return ((ContextMenuButton) this.T0.d).getVisibility() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void f(b20 b20Var) {
        int i = b20Var.c;
        y10 y10Var = b20Var.b;
        eyh0 eyh0Var = this.T0;
        if (y10Var == null && i == 0) {
            ((EncoreAddToButtonView) eyh0Var.c).setVisibility(8);
            ((ContextMenuButton) eyh0Var.d).setVisibility(8);
            ((ActionBarComplexRowSearchView) eyh0Var.b).setVisibility(8);
            return;
        }
        tlv tlvVar = (ActionBarComplexRowSearchView) eyh0Var.b;
        ContextMenuButton contextMenuButton = (ContextMenuButton) eyh0Var.d;
        EncoreAddToButtonView encoreAddToButtonView = (EncoreAddToButtonView) eyh0Var.c;
        tlvVar.setVisibility(0);
        if (y10Var != null) {
            boolean z = y10Var.a;
            String str = b20Var.a;
            encoreAddToButtonView.setVisibility(0);
            encoreAddToButtonView.g(new pk1(z ? qk1.b : qk1.a, false, str, getContext().getResources().getString(2131951772), (j7p1) null, 16));
        } else {
            encoreAddToButtonView.setVisibility(8);
        }
        if (i == 0) {
            contextMenuButton.setVisibility(8);
            return;
        }
        String str2 = b20Var.a;
        contextMenuButton.setVisibility(0);
        int iC = l1d.C(i);
        int i2 = 3;
        if (iC != 0) {
            if (iC == 1) {
                i2 = 6;
            } else if (iC == 2) {
                i2 = 5;
            } else if (iC == 3) {
                i2 = 1;
            } else {
                if (iC != 4) {
                    eg.o();
                    return;
                }
                i2 = 2;
            }
        }
        contextMenuButton.setEnabled(true);
        contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(ydh.c(i2), str2));
    }

    public ActionBarComplexRowSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ActionBarComplexRowSearchView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ActionBarComplexRowSearchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
