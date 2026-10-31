package p;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fyd extends f611 {
    public final /* synthetic */ byte a;

    public fyd(zbh0 zbh0Var) {
        this.a = (byte) 5;
        foi1.c(null);
        foi1.c(null);
    }

    public void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Resources resources = recyclerView.getContext().getResources();
                int iR = RecyclerView.R(view);
                if (iR == 0) {
                    rect.left = resources.getDimensionPixelSize(2131167023);
                    rect.right = resources.getDimensionPixelSize(2131167033);
                } else if (iR != s611Var.b() - 1) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(2131167033);
                    rect.left = dimensionPixelSize;
                    rect.right = dimensionPixelSize;
                } else {
                    rect.right = resources.getDimensionPixelSize(2131167023);
                    rect.left = resources.getDimensionPixelSize(2131167033);
                }
                break;
            case 1:
                int iR2 = RecyclerView.R(view);
                if (iR2 == 0) {
                    rect.left = recyclerView.getContext().getResources().getDimensionPixelSize(2131167023);
                    if (s611Var.b() == 2) {
                        rect.right = recyclerView.getContext().getResources().getDimensionPixelSize(2131167022);
                    }
                } else if (iR2 != s611Var.b() - 1) {
                    int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(2131167022);
                    rect.left = dimensionPixelSize2;
                    rect.right = dimensionPixelSize2;
                } else {
                    rect.right = recyclerView.getContext().getResources().getDimensionPixelSize(2131167023);
                }
                break;
            case 2:
                if (RecyclerView.R(view) != s611Var.b() - 1) {
                    rect.left = recyclerView.getContext().getResources().getDimensionPixelSize(2131167023);
                } else {
                    rect.left = recyclerView.getContext().getResources().getDimensionPixelSize(2131167023);
                    rect.right = recyclerView.getContext().getResources().getDimensionPixelSize(2131167023);
                }
                break;
            case 3:
            case 5:
            default:
                super.e(rect, view, recyclerView, s611Var);
                break;
            case 4:
                rect.bottom = view.getContext().getResources().getDimensionPixelSize(2131167023);
                break;
            case 6:
                Resources resources2 = recyclerView.getContext().getResources();
                int iR3 = RecyclerView.R(view);
                if (iR3 == 0) {
                    rect.left = resources2.getDimensionPixelSize(2131167023);
                    rect.right = resources2.getDimensionPixelSize(2131167033);
                } else if (iR3 != s611Var.b() - 1) {
                    int dimensionPixelSize3 = resources2.getDimensionPixelSize(2131167033);
                    rect.left = dimensionPixelSize3;
                    rect.right = dimensionPixelSize3;
                } else {
                    rect.right = resources2.getDimensionPixelSize(2131167023);
                    rect.left = resources2.getDimensionPixelSize(2131167033);
                }
                break;
            case 7:
                Resources resources3 = recyclerView.getContext().getResources();
                rect.bottom = resources3.getDimensionPixelSize(2131167023);
                if (RecyclerView.R(view) % 2 != 0) {
                    rect.right = resources3.getDimensionPixelSize(2131167023);
                    rect.left = resources3.getDimensionPixelSize(2131167033);
                } else {
                    rect.left = resources3.getDimensionPixelSize(2131167023);
                    rect.right = resources3.getDimensionPixelSize(2131167033);
                }
                break;
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        switch (this.a) {
            case 5:
                if ((recyclerView.getAdapter() instanceof cnm1) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    recyclerView.getLayoutManager();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public void h(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        switch (this.a) {
            case 3:
                Drawable drawable = recyclerView.getContext().getDrawable(2131233467);
                if (drawable != null) {
                    int paddingLeft = recyclerView.getPaddingLeft();
                    int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    int i = 0;
                    while (true) {
                        if (i < recyclerView.getChildCount()) {
                            int i2 = i + 1;
                            View childAt = recyclerView.getChildAt(i);
                            if (childAt == null) {
                                tw20.p();
                            } else {
                                int iR = RecyclerView.R(childAt);
                                if (iR != -1) {
                                    if (1 <= iR && iR <= s611Var.b() - 3) {
                                        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
                                        drawable.setBounds(new Rect(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom));
                                        drawable.draw(canvas);
                                    }
                                    i = i2;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ fyd(byte b) {
        this.a = b;
    }
}
