package com.spotify.nowplayingmini.uicomponents.trackinfo;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.queued.QueuedBadgeView;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b8k1;
import p.bpf1;
import p.goz0;
import p.ipf1;
import p.iu30;
import p.lof1;
import p.o7h;
import p.p7h;
import p.zdc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/spotify/nowplayingmini/uicomponents/trackinfo/TrackInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "styledAttrs", "Lp/rih1;", "setAppearance", "(Landroid/content/res/TypedArray;)V", "src_main_java_com_spotify_nowplayingmini_uicomponents-uicomponents"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class TrackInfoView extends ConstraintLayout {
    public final TextView T0;
    public final TextView U0;
    public final EnhancedBadgeView V0;
    public final QueuedBadgeView W0;
    public final View X0;
    public iu30 Y0;

    /* JADX WARN: Multi-variable type inference failed */
    public TrackInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = bpf1.O0;
        View.inflate(context, 2131625335, this);
        TextView textView = (TextView) findViewById(2131431483);
        this.T0 = textView;
        TextView textView2 = (TextView) findViewById(2131431482);
        this.U0 = textView2;
        this.V0 = findViewById(2131431477);
        this.W0 = findViewById(2131431480);
        this.X0 = findViewById(2131431479);
        textView.setSelected(true);
        textView2.setSelected(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, goz0.a, i, 0);
        setAppearance(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        textView.setOnClickListener(new ipf1(this, (byte) 0));
        textView2.setOnClickListener(new ipf1(this, (byte) 1));
    }

    private final void setAppearance(TypedArray styledAttrs) {
        this.T0.setTextAppearance(styledAttrs.getResourceId(1, 2132018085));
        this.U0.setTextAppearance(styledAttrs.getResourceId(0, 2132018084));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(lof1 lof1Var) {
        iu30 iu30Var = lof1Var.b;
        boolean z = lof1Var.d;
        boolean z2 = lof1Var.c;
        String str = lof1Var.a;
        TextView textView = this.T0;
        if (!str.contentEquals(textView.getText())) {
            textView.setText(str);
            b8k1.p(textView, new zdc((byte) 12));
        }
        textView.setContentDescription(o7h.y0(o7h.o0(p7h.M(new String[]{str, z2 ? getContext().getString(2131959235) : null, z ? getContext().getString(2131959234) : null})), ", ", (String) null, (String) null, (iu30) null, 62));
        String str2 = (String) iu30Var.invoke(getContext());
        TextView textView2 = this.U0;
        if (!str2.contentEquals(textView2.getText())) {
            textView2.setText((CharSequence) iu30Var.invoke(getContext()));
            b8k1.p(textView2, new zdc((byte) 12));
        }
        this.V0.setVisibility(z2 ? 0 : 8);
        this.W0.setVisibility(z ? 0 : 8);
        this.X0.setVisibility(lof1Var.e ? 0 : 8);
    }

    public TrackInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TrackInfoView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TrackInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
