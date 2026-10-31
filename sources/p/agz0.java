package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.legacyglue.icons.SpotifyIconView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class agz0 extends ConstraintLayout implements tlv {
    public final phi0 T0;
    public final int U0;
    public final int V0;
    public final FrameLayout W0;
    public int X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public agz0(Context context) {
        super(context, (AttributeSet) null, 0);
        byte b = 0;
        LayoutInflater.from(context).inflate(2131625479, (ViewGroup) this);
        int i = 2131430574;
        SpotifyIconView spotifyIconViewT = m5n1.t(this, 2131430574);
        if (spotifyIconViewT != null) {
            i = 2131430575;
            SpotifyIconView spotifyIconViewT2 = m5n1.t(this, 2131430575);
            if (spotifyIconViewT2 != null) {
                i = 2131430576;
                ImageView imageView = (ImageView) m5n1.t(this, 2131430576);
                if (imageView != null) {
                    i = 2131430577;
                    if (m5n1.t(this, 2131430577) != null) {
                        i = 2131430578;
                        if (m5n1.t(this, 2131430578) != null) {
                            i = 2131430579;
                            if (m5n1.t(this, 2131430579) != null) {
                                i = 2131430580;
                                TextView textView = (TextView) m5n1.t(this, 2131430580);
                                if (textView != null) {
                                    i = 2131430581;
                                    FrameLayout frameLayout = (FrameLayout) m5n1.t(this, 2131430581);
                                    if (frameLayout != null) {
                                        this.T0 = new phi0(this, spotifyIconViewT, spotifyIconViewT2, imageView, textView, frameLayout);
                                        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166888);
                                        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131166887);
                                        this.U0 = dimensionPixelSize;
                                        this.V0 = dimensionPixelSize + dimensionPixelSize2;
                                        this.W0 = frameLayout;
                                        imageView.setBackground(imageView.getBackground());
                                        gch0 gch0Var = new gch0();
                                        gch0Var.l(getResources().getDimension(2131166894));
                                        gr31 gr31Var = new gr31();
                                        gr31 gr31Var2 = new gr31();
                                        gr31 gr31Var3 = new gr31();
                                        gr31 gr31Var4 = new gr31();
                                        fmv fmvVar = new fmv(b);
                                        fmv fmvVar2 = new fmv(b);
                                        fmv fmvVar3 = new fmv(b);
                                        fmv fmvVar4 = new fmv(b);
                                        float dimension = getResources().getDimension(2131166889);
                                        k5 k5Var = new k5(dimension);
                                        k5 k5Var2 = new k5(dimension);
                                        k5 k5Var3 = new k5(dimension);
                                        k5 k5Var4 = new k5(dimension);
                                        iw61 iw61Var = new iw61();
                                        iw61Var.a = gr31Var;
                                        iw61Var.b = gr31Var2;
                                        iw61Var.c = gr31Var3;
                                        iw61Var.d = gr31Var4;
                                        iw61Var.e = k5Var;
                                        iw61Var.f = k5Var2;
                                        iw61Var.g = k5Var3;
                                        iw61Var.h = k5Var4;
                                        iw61Var.i = fmvVar;
                                        iw61Var.j = fmvVar2;
                                        iw61Var.k = fmvVar3;
                                        iw61Var.l = fmvVar4;
                                        gch0Var.setShapeAppearanceModel(iw61Var);
                                        gch0Var.q();
                                        gch0Var.o(context.getColor(2131102455));
                                        gch0Var.p();
                                        gch0Var.m(x74.E(context, 2131104462));
                                        textView.setBackground(gch0Var);
                                        setAlpha(0.0f);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setArrowColors(int i) {
        int color = getContext().getColor(i);
        phi0 phi0Var = this.T0;
        ((SpotifyIconView) phi0Var.d).setColor(color);
        ((SpotifyIconView) phi0Var.c).setColor(color);
    }

    private final void setTextColor(int i) {
        phi0 phi0Var = this.T0;
        ((TextView) phi0Var.f).setTextColor(((agz0) phi0Var.b).getContext().getColor(i));
    }

    public final int getHandleHeight() {
        return this.U0;
    }

    public final int getHandleWidth() {
        return this.V0;
    }

    public final FrameLayout getLabelContainer() {
        return this.W0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void f(vfz0 vfz0Var) {
        String str = vfz0Var.b;
        int i = vfz0Var.a;
        int i2 = this.X0;
        phi0 phi0Var = this.T0;
        if (i != i2) {
            this.X0 = i;
            int iC = l1d.C(i);
            if (iC == 0) {
                ((ImageView) phi0Var.e).getBackground().setTint(getContext().getColor(2131103116));
                ((TextView) phi0Var.f).getBackground().setTint(getContext().getColor(2131103116));
                setArrowColors(2131103114);
                setTextColor(2131103118);
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                ((ImageView) phi0Var.e).getBackground().setTint(getContext().getColor(2131103117));
                ((TextView) phi0Var.f).getBackground().setTint(getContext().getColor(2131103117));
                setArrowColors(2131103115);
                setTextColor(2131103119);
            }
        }
        TextView textView = (TextView) phi0Var.f;
        TextView textView2 = (TextView) phi0Var.f;
        textView.setVisibility((str == null || str.length() == 0) ? 4 : 0);
        boolean zJ = u890.j(textView2.getText(), str);
        textView2.setText(str);
        if (zJ) {
            return;
        }
        textView2.requestLayout();
    }
}
