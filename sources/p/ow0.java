package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ow0 implements isw {
    public final /* synthetic */ byte a;
    public final AppCompatImageButton b;

    public ow0(Context context, iu30 iu30Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
                appCompatImageButton.setBackground(null);
                appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
                int dimensionPixelSize = appCompatImageButton.getResources().getDimensionPixelSize(2131167033);
                appCompatImageButton.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                Drawable drawable = context.getDrawable(2131232611);
                drawable.getClass();
                appCompatImageButton.setImageTintList(x74.E(context, 2131101354));
                appCompatImageButton.setImageDrawable(drawable);
                appCompatImageButton.setOnClickListener(new v20(iu30Var, (byte) 4));
                this.b = appCompatImageButton;
                break;
            case 2:
                AppCompatImageButton appCompatImageButton2 = new AppCompatImageButton(context);
                appCompatImageButton2.setBackground(null);
                appCompatImageButton2.setContentDescription(appCompatImageButton2.getResources().getString(2131959253));
                appCompatImageButton2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                int dimensionPixelSize2 = appCompatImageButton2.getResources().getDimensionPixelSize(2131167033);
                appCompatImageButton2.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                Drawable drawable2 = context.getDrawable(2131232602);
                drawable2.getClass();
                appCompatImageButton2.setImageTintList(x74.E(context, 2131101354));
                appCompatImageButton2.setImageDrawable(drawable2);
                appCompatImageButton2.setOnClickListener(new zl51(iu30Var, (byte) 0));
                this.b = appCompatImageButton2;
                break;
            default:
                AppCompatImageButton appCompatImageButton3 = new AppCompatImageButton(context);
                appCompatImageButton3.setBackground(null);
                appCompatImageButton3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                int dimensionPixelSize3 = appCompatImageButton3.getResources().getDimensionPixelSize(2131167033);
                appCompatImageButton3.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
                Drawable drawable3 = context.getDrawable(2131232602);
                drawable3.getClass();
                appCompatImageButton3.setImageTintList(x74.E(context, 2131101354));
                appCompatImageButton3.setImageDrawable(drawable3);
                appCompatImageButton3.setOnClickListener(new v20(iu30Var, (byte) 3));
                this.b = appCompatImageButton3;
                break;
        }
    }

    public final void a(Object obj, ysw yswVar) {
        byte b = this.a;
        AppCompatImageButton appCompatImageButton = this.b;
        switch (b) {
            case 0:
                appCompatImageButton.setEnabled(((nw0) obj).b);
                break;
            case 1:
                appCompatImageButton.setEnabled(((sw0) obj).b);
                break;
            default:
                appCompatImageButton.setEnabled(((yl51) obj).b);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.b;
    }
}
