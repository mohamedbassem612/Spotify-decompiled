package com.spotify.puffin.setup.setupflow.manualselect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.cqo;
import p.e611;
import p.epy0;
import p.m5n1;
import p.qxx0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/spotify/puffin/setup/setupflow/manualselect/ui/AmbiguousDeviceSelectView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/epy0;", "T0", "Lp/epy0;", "getBinding", "()Lp/epy0;", "binding", "p/zud0", "src_main_java_com_spotify_puffin_setup_setupflow-setupflow"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class AmbiguousDeviceSelectView extends ConstraintLayout {

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public final epy0 binding;
    public final qxx0 U0;

    /* JADX WARN: Multi-variable type inference failed */
    public AmbiguousDeviceSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131625469, (ViewGroup) this);
        int i2 = 2131427554;
        TextView textView = (TextView) m5n1.t(this, 2131427554);
        if (textView != null) {
            i2 = 2131427890;
            EncoreButton encoreButtonT = m5n1.t(this, 2131427890);
            if (encoreButtonT != null) {
                i2 = 2131428472;
                RecyclerView recyclerViewT = m5n1.t(this, 2131428472);
                if (recyclerViewT != null) {
                    i2 = 2131428887;
                    FindInContextView findInContextViewT = m5n1.t(this, 2131428887);
                    if (findInContextViewT != null) {
                        i2 = 2131431130;
                        if (((TextView) m5n1.t(this, 2131431130)) != null) {
                            i2 = 2131431386;
                            TextView textView2 = (TextView) m5n1.t(this, 2131431386);
                            if (textView2 != null) {
                                this.binding = new epy0(this, textView, encoreButtonT, recyclerViewT, findInContextViewT, textView2);
                                qxx0 qxx0Var = new qxx0();
                                this.U0 = qxx0Var;
                                recyclerViewT.setAdapter(qxx0Var);
                                recyclerViewT.setLayoutManager(new AccessibleLinearLayoutManager(1));
                                recyclerViewT.setItemAnimator((e611) null);
                                cqo cqoVar = new cqo(context.getString(2131960715));
                                findInContextViewT.U0.setText("");
                                findInContextViewT.y(cqoVar);
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final epy0 getBinding() {
        return this.binding;
    }

    public AmbiguousDeviceSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AmbiguousDeviceSelectView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AmbiguousDeviceSelectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
