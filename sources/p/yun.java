package p;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yun implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    float fE = ktd.e(drawable.getIntrinsicWidth(), 2.0f, imageView.getWidth(), 2.0f);
                    float fE2 = ktd.e(drawable.getIntrinsicHeight(), 2.0f, imageView.getHeight(), 2.0f);
                    Matrix matrix = new Matrix();
                    matrix.setScale(2.0f, 2.0f);
                    matrix.postTranslate(fE, fE2);
                    imageView.setImageMatrix(matrix);
                    break;
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                View viewFindViewWithTag = view.findViewWithTag("appBarLayout");
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setFocusable(false);
                    viewFindViewWithTag.setFocusableInTouchMode(false);
                }
                View viewFindViewWithTag2 = view.findViewWithTag("backButton");
                View viewFindViewWithTag3 = view.findViewWithTag("find");
                View viewFindViewWithTag4 = view.findViewWithTag("headerTitle");
                View viewFindViewWithTag5 = view.findViewWithTag("tabsContainer");
                View viewFindViewWithTag6 = view.findViewWithTag("lastHeaderAction");
                if (viewFindViewWithTag2 != null) {
                    viewFindViewWithTag2.setNextFocusForwardId(viewFindViewWithTag3 != null ? viewFindViewWithTag3.getId() : viewFindViewWithTag4 != null ? viewFindViewWithTag4.getId() : -1);
                }
                if (viewFindViewWithTag3 != null) {
                    viewFindViewWithTag3.setNextFocusForwardId(viewFindViewWithTag4 != null ? viewFindViewWithTag4.getId() : -1);
                }
                if (viewFindViewWithTag6 != null) {
                    viewFindViewWithTag6.setNextFocusForwardId(viewFindViewWithTag5 != null ? viewFindViewWithTag5.getId() : -1);
                }
                if (viewFindViewWithTag2 != null) {
                    viewFindViewWithTag2.requestFocus();
                }
                break;
        }
    }
}
