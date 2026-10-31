package com.spotify.puffin.setup.setupflow.manualselect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import p.fry0;
import p.m5n1;
import p.mkg0;
import p.qxx0;
import p.wg20;
import p.zl7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/spotify/puffin/setup/setupflow/manualselect/ui/ManualSelectView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/fry0;", "T0", "Lp/fry0;", "getBinding", "()Lp/fry0;", "binding", "p/eb80", "src_main_java_com_spotify_puffin_setup_setupflow-setupflow"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class ManualSelectView extends ConstraintLayout {

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public final fry0 binding;
    public final qxx0 U0;
    public final wg20 V0;

    /* JADX WARN: Multi-variable type inference failed */
    public ManualSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131625476, (ViewGroup) this);
        int i2 = 2131427743;
        View viewT = m5n1.t(this, 2131427743);
        if (viewT != null) {
            i2 = 2131427891;
            EncoreButton encoreButtonT = m5n1.t(this, 2131427891);
            if (encoreButtonT != null) {
                i2 = 2131428472;
                RecyclerView recyclerViewT = m5n1.t(this, 2131428472);
                if (recyclerViewT != null) {
                    i2 = 2131428887;
                    FindInContextView findInContextViewT = m5n1.t(this, 2131428887);
                    if (findInContextViewT != null) {
                        i2 = 2131431130;
                        if (m5n1.t(this, 2131431130) != null) {
                            i2 = 2131431386;
                            if (m5n1.t(this, 2131431386) != null) {
                                this.binding = new fry0(this, viewT, encoreButtonT, recyclerViewT, findInContextViewT);
                                qxx0 qxx0Var = new qxx0();
                                this.U0 = qxx0Var;
                                cqo cqoVar = new cqo(context.getString(2131960715));
                                this.V0 = new wg20(cqoVar);
                                recyclerViewT.setAdapter(qxx0Var);
                                recyclerViewT.setLayoutManager(new AccessibleLinearLayoutManager(1));
                                recyclerViewT.setItemAnimator((e611) null);
                                findInContextViewT.U0.setText("");
                                findInContextViewT.y(cqoVar);
                                recyclerViewT.m(new zl7(this, (byte) 11));
                                recyclerViewT.setOnApplyWindowInsetsListener(new mkg0(this));
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

    public final fry0 getBinding() {
        return this.binding;
    }

    public ManualSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ManualSelectView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ManualSelectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
