package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.compose.ui.platform.ComposeView;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mpt0 implements isw {
    public final /* synthetic */ iu30 N0;
    public final FrameLayout X;
    public final /* synthetic */ Context Y;
    public final /* synthetic */ dfm Z;
    public final dcg a;
    public final dcg b;
    public final g4b1 c;
    public final g4b1 d;
    public final String e;
    public final String f;
    public boolean g;
    public final AppCompatImageButton h;
    public final ComposeView i;
    public final LottieAnimationView t;

    public mpt0(Context context, dfm dfmVar, iu30 iu30Var) {
        this.Y = context;
        this.Z = dfmVar;
        this.N0 = iu30Var;
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167031);
        j4b1 j4b1Var = j4b1.L4;
        g4b1 g4b1Var = new g4b1(context, j4b1Var, dimensionPixelSize);
        g4b1Var.c(x74.E(context, 2131101344));
        dcg dcgVar = new dcg(g4b1Var, 0.45f);
        int color = context.getColor(2131102463);
        dcgVar.e = ColorStateList.valueOf(color);
        dcgVar.d.setColor(color);
        dcgVar.g = color;
        dcgVar.a();
        dcgVar.invalidateSelf();
        this.a = dcgVar;
        j4b1 j4b1Var2 = j4b1.E4;
        g4b1 g4b1Var2 = new g4b1(context, j4b1Var2, dimensionPixelSize);
        g4b1Var2.c(x74.E(context, 2131101344));
        dcg dcgVar2 = new dcg(g4b1Var2, 0.45f);
        int color2 = context.getColor(2131102463);
        dcgVar2.e = ColorStateList.valueOf(color2);
        dcgVar2.d.setColor(color2);
        dcgVar2.g = color2;
        dcgVar2.a();
        dcgVar2.invalidateSelf();
        this.b = dcgVar2;
        g4b1 g4b1Var3 = new g4b1(context, j4b1Var, context.getResources().getDimensionPixelSize(2131167025));
        g4b1Var3.c(x74.E(context, 2131101354));
        this.c = g4b1Var3;
        g4b1 g4b1Var4 = new g4b1(context, j4b1Var2, context.getResources().getDimensionPixelSize(2131167025));
        g4b1Var4.c(x74.E(context, 2131101354));
        this.d = g4b1Var4;
        this.e = context.getResources().getString(2131959248);
        this.f = context.getResources().getString(2131959247);
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
        dcgVar.e = x74.E(context, 2131101354);
        dcgVar.onStateChange(dcgVar.getState());
        dcgVar.invalidateSelf();
        dcgVar2.e = x74.E(context, 2131101354);
        dcgVar2.onStateChange(dcgVar2.getState());
        dcgVar2.invalidateSelf();
        appCompatImageButton.setBackground(null);
        appCompatImageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        appCompatImageButton.setClickable(false);
        appCompatImageButton.setFocusable(false);
        appCompatImageButton.setPadding(0, 0, 0, 0);
        this.h = appCompatImageButton;
        View composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131167034);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
        layoutParams.gravity = 17;
        composeView.setLayoutParams(layoutParams);
        composeView.setClickable(true);
        composeView.setFocusable(true);
        composeView.setContent(new j2i(234747792, new tbs0(dfmVar, iu30Var, this, (byte) 12), true));
        this.i = composeView;
        View lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.setVisibility(8);
        ((LottieAnimationView) lottieAnimationView).h.b.addListener(new d20((LottieAnimationView) lottieAnimationView, this));
        this.t = lottieAnimationView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(2131430196);
        frameLayout.addView(lottieAnimationView);
        frameLayout.addView(appCompatImageButton);
        composeView.setVisibility(8);
        frameLayout.addView(composeView);
        this.X = frameLayout;
    }

    public final void a(Object obj, ysw yswVar) {
        ept0 ept0Var = (ept0) obj;
        boolean z = ept0Var.b;
        this.g = z;
        pcp0 pcp0Var = new pcp0(ept0Var, this.N0, this, (byte) 20);
        ipt0 ipt0Var = ept0Var.c;
        boolean z2 = ipt0Var instanceof fpt0;
        ComposeView composeView = this.i;
        gpt0 gpt0Var = gpt0.a;
        AppCompatImageButton appCompatImageButton = this.h;
        if (z2) {
            appCompatImageButton.setImageDrawable(z ? this.b : this.a);
        } else if (ipt0Var instanceof hpt0) {
            appCompatImageButton.setImageDrawable(z ? this.d : this.c);
        } else {
            if (!u890.j(ipt0Var, gpt0Var)) {
                eg.o();
                return;
            }
            composeView.setContent(new j2i(-1971713245, new tbs0(this, this.Z, pcp0Var, (byte) 13), true));
        }
        View.OnClickListener hid0Var = new hid0(pcp0Var, (byte) 13);
        FrameLayout frameLayout = this.X;
        frameLayout.setOnClickListener(hid0Var);
        appCompatImageButton.setVisibility(!u890.j(ipt0Var, gpt0Var) ? 0 : 8);
        composeView.setVisibility(u890.j(ipt0Var, gpt0Var) ? 0 : 8);
        frameLayout.setContentDescription(this.g ? this.f : this.e);
        frameLayout.setEnabled(ept0Var.d);
    }

    public final View getView() {
        return this.X;
    }
}
