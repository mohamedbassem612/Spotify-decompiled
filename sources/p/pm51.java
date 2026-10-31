package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pm51 implements isw {
    public final /* synthetic */ byte a;
    public final int b;
    public final AppCompatImageButton c;

    public pm51(Context context, iu30 iu30Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167033);
                this.b = dimensionPixelSize;
                AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
                appCompatImageButton.setBackground(null);
                appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
                appCompatImageButton.setContentDescription(appCompatImageButton.getResources().getString(2131959259));
                appCompatImageButton.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                Drawable drawable = context.getDrawable(2131232619);
                drawable.getClass();
                appCompatImageButton.setImageTintList(x74.E(context, 2131101354));
                appCompatImageButton.setImageDrawable(drawable);
                appCompatImageButton.setOnClickListener(new zl51(iu30Var, (byte) 5));
                this.c = appCompatImageButton;
                break;
            default:
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131167033);
                this.b = dimensionPixelSize2;
                AppCompatImageButton appCompatImageButton2 = new AppCompatImageButton(context);
                appCompatImageButton2.setBackground(null);
                appCompatImageButton2.setContentDescription(appCompatImageButton2.getResources().getString(2131959254));
                appCompatImageButton2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                appCompatImageButton2.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                Drawable drawable2 = context.getDrawable(2131232611);
                drawable2.getClass();
                appCompatImageButton2.setImageTintList(x74.E(context, 2131101354));
                appCompatImageButton2.setImageDrawable(drawable2);
                appCompatImageButton2.setOnClickListener(new zl51(iu30Var, (byte) 1));
                this.c = appCompatImageButton2;
                break;
        }
    }

    public final void a(Object obj, ysw yswVar) {
        byte b = this.a;
        int i = this.b;
        AppCompatImageButton appCompatImageButton = this.c;
        switch (b) {
            case 0:
                nm51 nm51Var = (nm51) obj;
                appCompatImageButton.setEnabled(nm51Var.b);
                if (nm51Var.d) {
                    i = 0;
                }
                appCompatImageButton.setPadding(i, i, i, i);
                break;
            default:
                e791 e791Var = (e791) obj;
                appCompatImageButton.setEnabled(e791Var.a != null);
                if (e791Var.c) {
                    i = 0;
                }
                appCompatImageButton.setPadding(i, i, i, i);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.c;
    }
}
