package com.spotify.encoreconsumermobile.elements.playindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.blt0;
import p.cdf0;
import p.clt0;
import p.eg;
import p.idd1;
import p.l1d;
import p.rkt0;
import p.tlv;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001b\u0010\u0019\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001b\u0010\u001c\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u001b\u0010\u001f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000fR\u001b\u0010\"\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\u000fR\u001b\u0010%\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000fR\u001b\u0010(\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u000fR\u001b\u0010+\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010\u000fR\u001b\u0010.\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b-\u0010\u000fR\u001b\u00101\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\r\u001a\u0004\b0\u0010\u000f¨\u00062"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/playindicator/PlayIndicatorView;", "", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/cdf0;", "d", "Lp/znb0;", "getPlayingDrawable", "()Lp/cdf0;", "playingDrawable", "e", "getWhitePlayingDrawable", "whitePlayingDrawable", "f", "getBlackPlayingDrawable", "blackPlayingDrawable", "g", "getPausedDrawable", "pausedDrawable", "h", "getWhitePausedDrawable", "whitePausedDrawable", "i", "getBlackPausedDrawable", "blackPausedDrawable", "t", "getPlayingToPausedDrawable", "playingToPausedDrawable", "N0", "getWhitePlayingToPausedDrawable", "whitePlayingToPausedDrawable", "O0", "getBlackPlayingToPausedDrawable", "blackPlayingToPausedDrawable", "P0", "getPausedToPlayingDrawable", "pausedToPlayingDrawable", "Q0", "getWhitePausedToPlayingDrawable", "whitePausedToPlayingDrawable", "R0", "getBlackPausedToPlayingDrawable", "blackPausedToPlayingDrawable", "src_main_java_com_spotify_encoreconsumermobile_elements_playindicator-playindicator"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlayIndicatorView extends AppCompatImageView implements tlv {
    public final idd1 N0;
    public final idd1 O0;
    public final idd1 P0;
    public final idd1 Q0;
    public final idd1 R0;
    public final String S0;
    public final String T0;
    public int U0;
    public boolean V0;
    public final idd1 d;
    public final idd1 e;
    public final idd1 f;
    public final idd1 g;
    public final idd1 h;
    public final idd1 i;
    public final idd1 t;

    public PlayIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new idd1(new blt0(this, (byte) 6));
        this.e = new idd1(new blt0(this, (byte) 10));
        this.f = new idd1(new blt0(this, (byte) 2));
        this.g = new idd1(new blt0(this, (byte) 4));
        this.h = new idd1(new blt0(this, (byte) 8));
        this.i = new idd1(new blt0(this, (byte) 0));
        this.t = new idd1(new blt0(this, (byte) 7));
        this.N0 = new idd1(new blt0(this, (byte) 11));
        this.O0 = new idd1(new blt0(this, (byte) 3));
        this.P0 = new idd1(new blt0(this, (byte) 5));
        this.Q0 = new idd1(new blt0(this, (byte) 9));
        this.R0 = new idd1(new blt0(this, (byte) 1));
        this.S0 = context.getResources().getString(2131959810);
        this.T0 = context.getResources().getString(2131959809);
        this.U0 = 3;
    }

    private final cdf0 getBlackPausedDrawable() {
        return (cdf0) this.i.getValue();
    }

    private final cdf0 getBlackPausedToPlayingDrawable() {
        return (cdf0) this.R0.getValue();
    }

    private final cdf0 getBlackPlayingDrawable() {
        return (cdf0) this.f.getValue();
    }

    private final cdf0 getBlackPlayingToPausedDrawable() {
        return (cdf0) this.O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cdf0 getPausedDrawable() {
        return (cdf0) this.g.getValue();
    }

    private final cdf0 getPausedToPlayingDrawable() {
        return (cdf0) this.P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cdf0 getPlayingDrawable() {
        return (cdf0) this.d.getValue();
    }

    private final cdf0 getPlayingToPausedDrawable() {
        return (cdf0) this.t.getValue();
    }

    private final cdf0 getWhitePausedDrawable() {
        return (cdf0) this.h.getValue();
    }

    private final cdf0 getWhitePausedToPlayingDrawable() {
        return (cdf0) this.Q0.getValue();
    }

    private final cdf0 getWhitePlayingDrawable() {
        return (cdf0) this.e.getValue();
    }

    private final cdf0 getWhitePlayingToPausedDrawable() {
        return (cdf0) this.N0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void f(rkt0 rkt0Var) {
        String str;
        int i;
        if (this.V0 && this.U0 == 1) {
            return;
        }
        cdf0 drawable = getDrawable();
        cdf0 playingDrawable = null;
        cdf0 cdf0Var = drawable instanceof cdf0 ? drawable : null;
        if (cdf0Var != null) {
            cdf0Var.b.removeAllListeners();
        }
        this.U0 = 1;
        if (getDrawable() != null && u890.j(getDrawable(), getPlayingDrawable())) {
            cdf0 drawable2 = getDrawable();
            cdf0 cdf0Var2 = drawable2 instanceof cdf0 ? drawable2 : null;
            if (cdf0Var2 != null) {
                cdf0Var2.h();
            }
        }
        int iC = l1d.C(1);
        if (iC == 0) {
            str = this.S0;
        } else if (iC == 1) {
            str = this.T0;
        } else {
            if (iC != 2) {
                eg.o();
                return;
            }
            str = null;
        }
        setContentDescription(str);
        int iC2 = l1d.C(1);
        if (iC2 == 0 || iC2 == 1) {
            i = 0;
        } else {
            if (iC2 != 2) {
                eg.o();
                return;
            }
            i = 8;
        }
        setVisibility(i);
        int iC3 = l1d.C(1);
        if (iC3 == 0) {
            int iC4 = l1d.C(3);
            if (iC4 != 0) {
                if (iC4 != 1) {
                    if (iC4 != 2) {
                        eg.o();
                        return;
                    } else if (u890.j(getDrawable(), getBlackPausedDrawable())) {
                        g(getBlackPausedToPlayingDrawable(), 1);
                        playingDrawable = getBlackPausedToPlayingDrawable();
                    } else {
                        playingDrawable = getBlackPlayingDrawable();
                        playingDrawable.k();
                    }
                } else if (u890.j(getDrawable(), getWhitePausedDrawable())) {
                    g(getWhitePausedToPlayingDrawable(), 1);
                    playingDrawable = getWhitePausedToPlayingDrawable();
                } else {
                    playingDrawable = getWhitePlayingDrawable();
                    playingDrawable.k();
                }
            } else if (u890.j(getDrawable(), getPausedDrawable())) {
                g(getPausedToPlayingDrawable(), 1);
                playingDrawable = getPausedToPlayingDrawable();
            } else {
                playingDrawable = getPlayingDrawable();
                playingDrawable.k();
            }
        } else if (iC3 == 1) {
            int iC5 = l1d.C(3);
            if (iC5 != 0) {
                if (iC5 != 1) {
                    if (iC5 != 2) {
                        eg.o();
                        return;
                    } else if (u890.j(getDrawable(), getBlackPlayingDrawable())) {
                        g(getBlackPlayingToPausedDrawable(), 2);
                        playingDrawable = getBlackPlayingToPausedDrawable();
                    } else {
                        playingDrawable = getBlackPausedDrawable();
                    }
                } else if (u890.j(getDrawable(), getWhitePlayingDrawable())) {
                    g(getWhitePlayingToPausedDrawable(), 2);
                    playingDrawable = getWhitePlayingToPausedDrawable();
                } else {
                    playingDrawable = getWhitePausedDrawable();
                }
            } else if (u890.j(getDrawable(), getPlayingDrawable())) {
                g(getPlayingToPausedDrawable(), 2);
                playingDrawable = getPlayingToPausedDrawable();
            } else {
                playingDrawable = getPausedDrawable();
            }
        }
        setImageDrawable(playingDrawable);
    }

    public final void g(cdf0 cdf0Var, int i) {
        this.V0 = true;
        cdf0Var.k();
        cdf0Var.b.addListener(new clt0(i, this, cdf0Var));
    }

    public PlayIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlayIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PlayIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
