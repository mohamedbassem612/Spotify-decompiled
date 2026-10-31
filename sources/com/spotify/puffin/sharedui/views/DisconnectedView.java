package com.spotify.puffin.sharedui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.m5n1;
import p.u7u;
import p.wpy0;
import p.zfs;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/spotify/puffin/sharedui/views/DisconnectedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/u7u;", "actions", "Lp/rih1;", "setActions", "(Lp/u7u;)V", "Lp/wpy0;", "T0", "Lp/wpy0;", "getBinding", "()Lp/wpy0;", "binding", "src_main_java_com_spotify_puffin_sharedui-sharedui"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class DisconnectedView extends ConstraintLayout {

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public final wpy0 binding;

    /* JADX WARN: Multi-variable type inference failed */
    public DisconnectedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131625473, (ViewGroup) this);
        int i2 = 2131427834;
        if (((LinearLayout) m5n1.t(this, 2131427834)) != null) {
            i2 = 2131427835;
            if (((LinearLayout) m5n1.t(this, 2131427835)) != null) {
                i2 = 2131427836;
                if (((LinearLayout) m5n1.t(this, 2131427836)) != null) {
                    i2 = 2131427837;
                    if (((LinearLayout) m5n1.t(this, 2131427837)) != null) {
                        i2 = 2131427946;
                        if (((ProgressBar) m5n1.t(this, 2131427946)) != null) {
                            i2 = 2131428449;
                            if (((TextView) m5n1.t(this, 2131428449)) != null) {
                                i2 = 2131428450;
                                if (((TextView) m5n1.t(this, 2131428450)) != null) {
                                    i2 = 2131428451;
                                    if (((TextView) m5n1.t(this, 2131428451)) != null) {
                                        i2 = 2131428452;
                                        if (((TextView) m5n1.t(this, 2131428452)) != null) {
                                            i2 = 2131428453;
                                            if (((TextView) m5n1.t(this, 2131428453)) != null) {
                                                i2 = 2131428454;
                                                if (((TextView) m5n1.t(this, 2131428454)) != null) {
                                                    i2 = 2131428455;
                                                    if (((TextView) m5n1.t(this, 2131428455)) != null) {
                                                        i2 = 2131428456;
                                                        if (((TextView) m5n1.t(this, 2131428456)) != null) {
                                                            i2 = 2131428488;
                                                            if (((TextView) m5n1.t(this, 2131428488)) != null) {
                                                                i2 = 2131431094;
                                                                Button button = (Button) m5n1.t(this, 2131431094);
                                                                if (button != null) {
                                                                    this.binding = new wpy0(this, button);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final wpy0 getBinding() {
        return this.binding;
    }

    public final void setActions(u7u actions) {
        this.binding.a.setOnClickListener(new zfs(actions, (byte) 3));
    }

    public DisconnectedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DisconnectedView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DisconnectedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
