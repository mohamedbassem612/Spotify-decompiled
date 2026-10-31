package com.spotify.puffin.setup.setupflow.autodetect.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.ipy0;
import p.j2i;
import p.kr60;
import p.m5n1;
import p.mu6;
import p.o59;
import p.p59;
import p.p5x0;
import p.t59;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/spotify/puffin/setup/setupflow/autodetect/ui/AutodetectView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/t59;", "data", "Lp/rih1;", "setDeviceInformation", "(Lp/t59;)V", "setAnimation", "Lp/o59;", "actions", "setActions", "(Lp/o59;)V", "Lp/ipy0;", "a", "Lp/ipy0;", "getBinding", "()Lp/ipy0;", "binding", "src_main_java_com_spotify_puffin_setup_setupflow-setupflow"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class AutodetectView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final ipy0 binding;

    public AutodetectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131625472, this);
        int i2 = 2131428147;
        EncoreTextView encoreTextViewT = m5n1.t(this, 2131428147);
        if (encoreTextViewT != null) {
            i2 = 2131430936;
            ComposeView composeViewT = m5n1.t(this, 2131430936);
            if (composeViewT != null) {
                i2 = 2131431115;
                EncoreTextView encoreTextViewT2 = m5n1.t(this, 2131431115);
                if (encoreTextViewT2 != null) {
                    i2 = 2131431528;
                    EncoreProgressIndicatorButton encoreProgressIndicatorButtonT = m5n1.t(this, 2131431528);
                    if (encoreProgressIndicatorButtonT != null) {
                        i2 = 2131431715;
                        EncoreButton encoreButtonT = m5n1.t(this, 2131431715);
                        if (encoreButtonT != null) {
                            this.binding = new ipy0(this, encoreTextViewT, composeViewT, encoreTextViewT2, encoreProgressIndicatorButtonT, encoreButtonT);
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void setActions(o59 actions) {
        ipy0 ipy0Var = this.binding;
        ipy0Var.d.setOnClickListener(new p59(actions, (byte) 0));
        ipy0Var.e.setOnClickListener(new p59(actions, (byte) 1));
    }

    private final void setAnimation(t59 data) {
        ComposeView composeView = this.binding.b;
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(new j2i(432158275, new mu6(data, (byte) 18), true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0042  */
    private final void setDeviceInformation(t59 data) {
        String string;
        ipy0 ipy0Var = this.binding;
        EncoreTextView encoreTextView = ipy0Var.a;
        Resources resources = getResources();
        data.getClass();
        boolean z = data.d;
        encoreTextView.setText(resources.getString(2131954163, data.b));
        ipy0Var.c.setText(getResources().getString(2131960660));
        EncoreProgressIndicatorButton encoreProgressIndicatorButton = ipy0Var.d;
        Integer num = data.c;
        if (num != null) {
            string = getResources().getString(num.intValue());
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        encoreProgressIndicatorButton.setText(string);
        encoreProgressIndicatorButton.setShowProgressIndicator(z);
        boolean z2 = !z;
        encoreProgressIndicatorButton.setEnabled(z2);
        ipy0Var.e.setEnabled(z2);
    }

    public final void a(t59 t59Var, kr60 kr60Var) {
        setActions(kr60Var);
        setDeviceInformation(t59Var);
        setAnimation(t59Var);
    }

    public final ipy0 getBinding() {
        return this.binding;
    }

    public AutodetectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AutodetectView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AutodetectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
