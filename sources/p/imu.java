package p;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class imu extends f611 {
    public static final int[] d = {R.attr.listDivider};
    public Drawable b;
    public final /* synthetic */ byte a = 0;
    public final Rect c = new Rect();

    public imu(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(d);
        this.b = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        switch (this.a) {
            case 0:
                Drawable drawable = this.b;
                if (drawable != null) {
                    rect.set(0, 0, 0, drawable.getIntrinsicHeight());
                } else {
                    rect.set(0, 0, 0, 0);
                }
                break;
            default:
                int iR = RecyclerView.R(view);
                if (iR == -1 || iR >= s611Var.b() - 1 || u890.j(view.getTag(2131430997), Boolean.TRUE)) {
                    rect.setEmpty();
                } else {
                    rect.set(0, 0, 0, this.b.getIntrinsicHeight());
                }
                break;
        }
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        int width;
        int paddingLeft;
        int width2;
        int paddingLeft2;
        byte b = this.a;
        int i = 0;
        Rect rect = this.c;
        switch (b) {
            case 0:
                if (recyclerView.getLayoutManager() != null && this.b != null) {
                    canvas.save();
                    if (recyclerView.getClipToPadding()) {
                        paddingLeft = recyclerView.getPaddingLeft();
                        width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                        canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                    } else {
                        width = recyclerView.getWidth();
                        paddingLeft = 0;
                    }
                    int childCount = recyclerView.getChildCount();
                    while (i < childCount) {
                        View childAt = recyclerView.getChildAt(i);
                        RecyclerView.V(rect, childAt);
                        int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                        this.b.setBounds(paddingLeft, iRound - this.b.getIntrinsicHeight(), width, iRound);
                        this.b.draw(canvas);
                        i++;
                    }
                    canvas.restore();
                    break;
                }
                break;
            default:
                Drawable drawable = this.b;
                if (recyclerView.getLayoutManager() != null) {
                    canvas.save();
                    if (recyclerView.getClipToPadding()) {
                        paddingLeft2 = recyclerView.getPaddingLeft();
                        width2 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                        canvas.clipRect(paddingLeft2, recyclerView.getPaddingTop(), width2, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                    } else {
                        width2 = recyclerView.getWidth();
                        paddingLeft2 = 0;
                    }
                    int iB = s611Var.b() - 1;
                    int childCount2 = recyclerView.getChildCount();
                    while (i < childCount2) {
                        View childAt2 = recyclerView.getChildAt(i);
                        int iR = RecyclerView.R(childAt2);
                        if (iR != -1 && iR < iB && !u890.j(childAt2.getTag(2131430997), Boolean.TRUE)) {
                            RecyclerView.V(rect, childAt2);
                            int iU = jch0.U(childAt2.getTranslationY()) + rect.bottom;
                            drawable.setBounds(paddingLeft2, iU - drawable.getIntrinsicHeight(), width2, iU);
                            drawable.draw(canvas);
                        }
                        i++;
                    }
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    public imu(Drawable drawable) {
        this.b = drawable;
    }
}
