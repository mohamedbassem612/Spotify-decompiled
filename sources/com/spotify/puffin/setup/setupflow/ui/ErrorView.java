package com.spotify.puffin.setup.setupflow.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.dkz;
import p.ekz;
import p.hkz;
import p.m5n1;
import p.ypy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/spotify/puffin/setup/setupflow/ui/ErrorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/dkz;", "actions", "Lp/rih1;", "setActions", "(Lp/dkz;)V", "Lp/ypy0;", "T0", "Lp/ypy0;", "getBinding", "()Lp/ypy0;", "binding", "src_main_java_com_spotify_puffin_setup_setupflow-setupflow"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class ErrorView extends ConstraintLayout {

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public final ypy0 binding;

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131625474, (ViewGroup) this);
        int i2 = 2131428447;
        EncoreTextView encoreTextViewT = m5n1.t(this, 2131428447);
        if (encoreTextViewT != null) {
            i2 = 2131428722;
            if (((LinearLayout) m5n1.t(this, 2131428722)) != null) {
                i2 = 2131430499;
                EncoreButton encoreButtonT = m5n1.t(this, 2131430499);
                if (encoreButtonT != null) {
                    i2 = 2131430865;
                    EncoreButton encoreButtonT2 = m5n1.t(this, 2131430865);
                    if (encoreButtonT2 != null) {
                        i2 = 2131431364;
                        EncoreTextView encoreTextViewT2 = m5n1.t(this, 2131431364);
                        if (encoreTextViewT2 != null) {
                            this.binding = new ypy0(this, encoreTextViewT, encoreButtonT, encoreButtonT2, encoreTextViewT2);
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void setActions(dkz actions) {
        ypy0 ypy0Var = this.binding;
        ypy0Var.b.setOnClickListener(new ekz(actions, (byte) 0));
        ypy0Var.c.setOnClickListener(new ekz(actions, (byte) 1));
    }

    public final ypy0 getBinding() {
        return this.binding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(hkz hkzVar, dkz dkzVar) {
        ypy0 ypy0Var = this.binding;
        ypy0Var.d.setText(getResources().getString(2131960683));
        ypy0Var.a.setText(getResources().getString(hkzVar.a));
        ypy0Var.b.setVisibility(0);
        ypy0Var.c.setVisibility(0);
        setActions(dkzVar);
    }

    public ErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ErrorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
