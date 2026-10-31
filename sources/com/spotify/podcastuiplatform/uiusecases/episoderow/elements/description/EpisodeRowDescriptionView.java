package com.spotify.podcastuiplatform.uiusecases.episoderow.elements.description;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a8o;
import p.aaz;
import p.aqs;
import p.b2u;
import p.baz;
import p.bhn0;
import p.caz;
import p.fft;
import p.g4b1;
import p.iu30;
import p.j4b1;
import p.m5n1;
import p.tlv;
import p.v9w0;
import p.x74;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/podcastuiplatform/uiusecases/episoderow/elements/description/EpisodeRowDescriptionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/aaz;", "model", "Lp/rih1;", "setUpWithTagLine", "(Lp/aaz;)V", "Lp/baz;", "tagLineType", "setUpTagLineIcon", "(Lp/baz;)V", "src_main_java_com_spotify_podcastuiplatform_uiusecases-uiusecases"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class EpisodeRowDescriptionView extends ConstraintLayout implements tlv {
    public final caz T0;

    /* JADX WARN: Multi-variable type inference failed */
    public EpisodeRowDescriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131624601, (ViewGroup) this);
        int i2 = 2131428438;
        TextView textView = (TextView) m5n1.t(this, 2131428438);
        if (textView != null) {
            i2 = 2131429223;
            ImageView imageView = (ImageView) m5n1.t(this, 2131429223);
            if (imageView != null) {
                i2 = 2131431202;
                TextView textView2 = (TextView) m5n1.t(this, 2131431202);
                if (textView2 != null) {
                    caz cazVar = new caz(this, textView, imageView, textView2);
                    setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    v9w0 v9w0VarQ = b2u.q(textView);
                    Collections.addAll(v9w0VarQ.c, textView2);
                    Collections.addAll(v9w0VarQ.d, imageView);
                    v9w0VarQ.a();
                    this.T0 = cazVar;
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUpTagLineIcon(baz tagLineType) {
        g4b1 g4b1Var;
        Context context = getContext();
        if (fft.a[tagLineType.ordinal()] == 1) {
            g4b1Var = new g4b1(context, j4b1.t5, a8o.y(a8o.y(16.0f, context.getResources()), context.getResources()));
            g4b1Var.c(x74.E(context, 2131100240));
        } else {
            g4b1Var = null;
        }
        caz cazVar = this.T0;
        if (g4b1Var == null) {
            cazVar.a.setVisibility(8);
        } else {
            cazVar.a.setImageDrawable(g4b1Var);
            cazVar.a.setVisibility(0);
        }
    }

    private final void setUpWithTagLine(aaz model) {
        caz cazVar = this.T0;
        TextView textView = cazVar.c;
        model.getClass();
        textView.setText((CharSequence) null);
        cazVar.c.setVisibility(0);
        setUpTagLineIcon(null);
    }

    public final void f(Object obj) {
        caz cazVar = this.T0;
        cazVar.b.setText((CharSequence) null);
        cazVar.c.setVisibility(8);
        cazVar.a.setVisibility(8);
    }

    public final void n(iu30 iu30Var) {
        this.T0.c.setOnClickListener(new aqs(iu30Var, (byte) 19));
    }

    public EpisodeRowDescriptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EpisodeRowDescriptionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EpisodeRowDescriptionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
