package p;

import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ijs0 extends RelativeLayout.LayoutParams {
    public gjs0 a;

    @Override // android.view.ViewGroup.LayoutParams
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        ((ViewGroup.LayoutParams) this).width = typedArray.getLayoutDimension(i, 0);
        ((ViewGroup.LayoutParams) this).height = typedArray.getLayoutDimension(i2, 0);
    }
}
