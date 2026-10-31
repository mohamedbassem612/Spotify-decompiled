package com.spotify.yourlibrary.uiusecases.filterrow.chips;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.bhn0;
import p.haa0;
import p.idd1;
import p.iu30;
import p.m5n1;
import p.nzb0;
import p.td6;
import p.tlv;
import p.u890;
import p.w4c0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/spotify/yourlibrary/uiusecases/filterrow/chips/LibraryChipsContainerView;", "Landroid/widget/FrameLayout;", "Lp/tlv;", "", "Lp/ud20;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "Lp/rih1;", "setEnabled", "(Z)V", "", "a", "Lp/znb0;", "getDuration", "()J", "duration", "src_main_java_com_spotify_yourlibrary_uiusecases_filterrow-filterrow"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LibraryChipsContainerView extends FrameLayout implements tlv {
    public final idd1 a;
    public haa0 b;

    public LibraryChipsContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new idd1(new nzb0(this, (byte) 4));
    }

    private final long getDuration() {
        return ((Number) this.a.getValue()).longValue();
    }

    public final void f(Object obj) {
        throw td6.k(obj);
    }

    public final void n(iu30 iu30Var) {
        haa0 haa0Var = this.b;
        if (haa0Var != null) {
            ((LibraryChipsView) haa0Var.b).n(iu30Var);
        } else {
            u890.C("binding");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = 2131428077;
        LibraryChipsView libraryChipsView = (LibraryChipsView) m5n1.t(this, 2131428077);
        if (libraryChipsView != null) {
            i = 2131428081;
            LibraryChipsScrollView libraryChipsScrollView = (LibraryChipsScrollView) m5n1.t(this, 2131428081);
            if (libraryChipsScrollView != null) {
                i = 2131428082;
                LibraryChipsTransitionView libraryChipsTransitionView = (LibraryChipsTransitionView) m5n1.t(this, 2131428082);
                if (libraryChipsTransitionView != null) {
                    this.b = new haa0(this, libraryChipsView, libraryChipsScrollView, libraryChipsTransitionView);
                    libraryChipsScrollView.setSmoothScrollingEnabled(false);
                    haa0 haa0Var = this.b;
                    if (haa0Var == null) {
                        u890.C("binding");
                        throw null;
                    }
                    ((LibraryChipsScrollView) haa0Var.c).setOnScrollChangeListener(new w4c0((LibraryChipsTransitionView) haa0Var.d));
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (enabled != isEnabled()) {
            animate().alpha(enabled ? 1.0f : 0.5f).setDuration(getDuration()).start();
        }
        super.setEnabled(enabled);
    }

    public LibraryChipsContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LibraryChipsContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ LibraryChipsContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
