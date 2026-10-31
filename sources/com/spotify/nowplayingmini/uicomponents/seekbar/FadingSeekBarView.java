package com.spotify.nowplayingmini.uicomponents.seekbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.widgets.CancellableSeekBar;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bm51;
import p.by8;
import p.fjg1;
import p.hh10;
import p.hlv;
import p.nmr0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/spotify/nowplayingmini/uicomponents/seekbar/FadingSeekBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "positionMs", "Lp/rih1;", "setPosition", "(I)V", "durationMs", "setDuration", "setPositionText", "", "enabled", "setSeekingEnabled", "(Z)V", "visible", "setTimestampsVisible", "Lp/bm51;", "listener", "setListener", "(Lp/bm51;)V", "src_main_java_com_spotify_nowplayingmini_uicomponents-uicomponents"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class FadingSeekBarView extends ConstraintLayout {
    public nmr0 T0;
    public final CancellableSeekBar U0;
    public final TextView V0;
    public final TextView W0;
    public bm51 X0;
    public final by8 Y0;
    public final by8 Z0;

    /* JADX WARN: Multi-variable type inference failed */
    public FadingSeekBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.T0 = new nmr0(0, "0:00");
        by8 by8Var = new by8();
        by8Var.W(150L);
        by8Var.X(hlv.e);
        this.Y0 = by8Var;
        by8 by8Var2 = new by8();
        by8Var2.W(1500L);
        by8Var2.X(hlv.a);
        this.Z0 = by8Var2;
        View.inflate(context, 2131625333, this);
        CancellableSeekBar cancellableSeekBarFindViewById = findViewById(2131430900);
        this.U0 = cancellableSeekBarFindViewById;
        this.V0 = (TextView) findViewById(2131430457);
        this.W0 = (TextView) findViewById(2131428536);
        cancellableSeekBarFindViewById.setOnSeekBarChangeListener(new hh10(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super/*android.view.View*/.onRestoreInstanceState(parcelable);
        setTimestampsVisible(false);
    }

    public void setDuration(int durationMs) {
        TextView textView = this.W0;
        if (textView != null) {
            textView.setText(y(durationMs));
        }
        this.U0.setMax(durationMs);
    }

    public void setListener(bm51 listener) {
        this.X0 = listener;
    }

    public void setPosition(int positionMs) {
        this.U0.setProgress(positionMs);
    }

    public void setPositionText(int positionMs) {
        TextView textView = this.V0;
        if (textView != null) {
            textView.setText(y(positionMs));
        }
    }

    public void setSeekingEnabled(boolean enabled) {
        this.U0.setEnabled(enabled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTimestampsVisible(boolean visible) {
        TextView textView;
        TextView textView2 = this.W0;
        if (textView2 == null || (textView = this.V0) == null) {
            return;
        }
        int i = visible ? 0 : 4;
        fjg1.b(this);
        fjg1.a(this, visible ? this.Y0 : this.Z0);
        textView.setVisibility(i);
        textView2.setVisibility(i);
    }

    public final String y(int i) {
        int iMax = (int) (((long) Math.max(0, i)) / 1000);
        Integer num = (Integer) this.T0.a;
        if (num == null || num.intValue() != iMax) {
            this.T0 = new nmr0(Integer.valueOf(iMax), String.format(Locale.ROOT, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (((long) iMax) / 60)), Integer.valueOf(iMax % 60)}, 2)));
        }
        return (String) this.T0.b;
    }

    public FadingSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FadingSeekBarView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FadingSeekBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
