package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.compose.ui.platform.ComposeView;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l3 implements isw {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Context b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public final Object g;
    public final Object h;
    public final /* synthetic */ Object i;

    public l3(Context context, d75 d75Var, iu30 iu30Var, mi11 mi11Var) {
        this.b = context;
        this.i = mi11Var;
        this.c = new idd1(new qnd0(context, (byte) 12));
        idd1 idd1Var = new idd1(new li11(this, (byte) 1));
        this.d = idd1Var;
        this.e = new idd1(new li11(this, (byte) 0));
        this.f = new idd1(new li11(this, (byte) 2));
        this.g = new rku();
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
        appCompatImageButton.setBackground(null);
        appCompatImageButton.setContentDescription(context.getResources().getString(2131961024));
        appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageButton.setImageDrawable((Drawable) idd1Var.getValue());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167033);
        appCompatImageButton.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        appCompatImageButton.setOnClickListener(new jn90(iu30Var, (byte) 27));
        a6o1.t(d75Var.c, new zkz0(this, mi11Var, (byte) 19), new li11(this, (byte) 3));
        this.h = appCompatImageButton;
    }

    public final void a(Object obj, ysw yswVar) {
        koa0 koa0Var;
        vu30 vu30Var;
        int i;
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        idd1 idd1Var = this.f;
        Object obj4 = this.h;
        switch (b) {
            case 0:
                ComposeView composeView = (ComposeView) obj2;
                c3 c3Var = (c3) obj;
                p811 p811Var = (p811) this.g;
                n3 n3Var = (n3) obj4;
                String str = c3Var.a;
                kdn0 kdn0Var = (kdn0) obj3;
                kdn0Var.m(c3Var.g);
                p811 p811Var2 = (p811) idd1Var;
                Object obj5 = p811Var2.a;
                Context context = this.b;
                koa0 koa0Var2 = goa0.a;
                if (obj5 == null) {
                    tka0 tka0Var = dtw.C;
                    koa0Var = koa0Var2;
                    p811Var2.a = mhc.b(context, composeView, (l430) n3Var.g.getValue(), new k430(str, false, false), (ipb1) null, 112);
                    vu30Var = null;
                } else {
                    koa0Var = koa0Var2;
                    vu30Var = null;
                    k430 k430Var = new k430(str, false, false);
                    tka0 tka0Var2 = dtw.C;
                    ((dtw) obj5).k(k430Var, koa0Var, (vu30) null);
                }
                Object obj6 = p811Var.a;
                if (obj6 == null) {
                    l0x0 l0x0Var = n3Var.c;
                    bs0 bs0Var = new bs0((ofx) l0x0Var.b, (w3l0) l0x0Var.c, (lzn0) l0x0Var.d, kdn0Var, new hsz0(false));
                    tka0 tka0Var3 = dtw.C;
                    p811Var.a = mhc.b(context, composeView, bs0Var, new wsz0(str), (ipb1) null, 112);
                } else {
                    ((dtw) obj6).k(new wsz0(str), koa0Var, vu30Var);
                }
                composeView.setContent(new j2i(250302456, new k3(n3Var, c3Var, (iu30) this.i, p811Var2, p811Var, (byte) 1), true));
                break;
            default:
                ii11 ii11Var = (ii11) obj;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) obj4;
                ue21 ue21Var = ii11Var.a;
                appCompatImageButton.setEnabled(ue21Var.b);
                int i2 = ue21Var.c;
                appCompatImageButton.setActivated(i2 != 1);
                int iC = l1d.C(i2);
                if (iC == 0) {
                    appCompatImageButton.setImageDrawable((Drawable) ((idd1) obj2).getValue());
                } else if (iC == 1) {
                    appCompatImageButton.setImageDrawable((Drawable) ((idd1) obj3).getValue());
                } else if (iC != 2) {
                    eg.o();
                } else {
                    appCompatImageButton.setImageDrawable((Drawable) idd1Var.getValue());
                }
                int iC2 = l1d.C(ii11Var.b);
                if (iC2 == 0) {
                    i = 2131101354;
                } else if (iC2 == 1) {
                    i = 2131101345;
                } else if (iC2 != 2) {
                    eg.o();
                } else {
                    i = 2131101340;
                }
                appCompatImageButton.setSupportImageTintList(x74.E(appCompatImageButton.getContext(), i));
                break;
        }
    }

    public Drawable b(int i, boolean z) {
        idd1 idd1Var = (idd1) this.c;
        Context context = this.b;
        Drawable drawable = context.getDrawable(i);
        drawable.getClass();
        if (!z) {
            drawable.setTint(context.getColor(2131101354));
            return drawable;
        }
        drawable.setTint(context.getColor(2131101340));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, (Drawable) idd1Var.getValue()});
        int intrinsicWidth = (drawable.getIntrinsicWidth() - ((Drawable) idd1Var.getValue()).getIntrinsicWidth()) / 2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167033) + drawable.getIntrinsicHeight();
        layerDrawable.setLayerGravity(0, 16);
        layerDrawable.setLayerInset(1, intrinsicWidth, dimensionPixelSize, intrinsicWidth, 0);
        return layerDrawable;
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (ComposeView) this.c;
            default:
                return (AppCompatImageButton) this.h;
        }
    }

    public l3(ComposeView composeView, kdn0 kdn0Var, p811 p811Var, Context context, n3 n3Var, p811 p811Var2, iu30 iu30Var) {
        this.d = composeView;
        this.e = kdn0Var;
        this.f = p811Var;
        this.b = context;
        this.h = n3Var;
        this.g = p811Var2;
        this.i = iu30Var;
        this.c = composeView;
    }
}
