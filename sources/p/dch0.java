package p;

import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatCheckBox;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dch0 extends AppCompatCheckBox {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.e;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iR = xfo1.r(this, 2130969010);
        int iR2 = xfo1.r(this, 2130969040);
        int iR3 = xfo1.r(this, 2130969024);
        ColorStateList colorStateList2 = new ColorStateList(g, new int[]{ago1.s(iR2, iR, 1.0f), ago1.s(iR2, iR3, 0.54f), ago1.s(iR2, iR3, 0.38f), ago1.s(iR2, iR3, 0.38f)});
        this.e = colorStateList2;
        return colorStateList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
