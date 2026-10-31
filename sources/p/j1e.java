package p;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j1e extends f611 {
    public final /* synthetic */ byte a;
    public int b;

    public j1e(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 7:
                this.b = (int) Math.rint((context.getResources().getDisplayMetrics().xdpi / 160.0f) * 13.0f);
                break;
            case 8:
            default:
                this.b = (int) TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics());
                break;
            case 9:
                this.b = (int) TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics());
                break;
        }
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        z511 adapter;
        switch (this.a) {
            case 0:
                boolean z = recyclerView.getLayoutDirection() == 1;
                int iR = RecyclerView.R(view);
                z511 adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && iR == adapter2.e() - 1) {
                    rect.set(0, 0, 0, 0);
                } else {
                    int i = this.b;
                    if (!z) {
                        rect.set(0, 0, i, 0);
                    } else {
                        rect.set(i, 0, 0, 0);
                    }
                }
                break;
            case 1:
                int i2 = this.b;
                boolean z2 = recyclerView.getLayoutDirection() == 1;
                int iR2 = RecyclerView.R(view);
                z511 adapter3 = recyclerView.getAdapter();
                if (adapter3 != null && iR2 == adapter3.e() - 1) {
                    rect.set(z2 ? i2 / 4 : 0, 0, 0, 0);
                } else if (!z2) {
                    rect.set(0, 0, i2, 0);
                } else {
                    rect.set(i2, 0, 0, 0);
                }
                break;
            case 2:
                int i3 = this.b;
                super.e(rect, view, recyclerView, s611Var);
                int iR3 = RecyclerView.R(view);
                if (iR3 != -1) {
                    if (iR3 == 0) {
                        rect.left = i3;
                    }
                    rect.right = i3;
                    break;
                }
                break;
            case 3:
                super.e(rect, view, recyclerView, s611Var);
                if (RecyclerView.R(view) == s611Var.b() - 1) {
                    rect.bottom = this.b;
                }
                break;
            case 4:
                if (recyclerView.T(view).n() > 0) {
                    rect.left = this.b;
                }
                break;
            case 5:
                boolean z3 = recyclerView.getLayoutDirection() == 1;
                if (RecyclerView.R(view) != 0) {
                    int i4 = this.b;
                    if (!z3) {
                        rect.left = i4;
                    } else {
                        rect.right = i4;
                    }
                }
                break;
            case 6:
                rect.left = this.b;
                break;
            case 7:
                if (RecyclerView.R(view) != 0) {
                    rect.set(-this.b, 0, 0, 0);
                    break;
                }
                break;
            case 8:
                int iR4 = RecyclerView.R(view);
                if (iR4 != -1 && (adapter = recyclerView.getAdapter()) != null && iR4 != adapter.e() - 1) {
                    rect.bottom = this.b;
                }
                break;
            case 9:
                int i5 = this.b;
                if (recyclerView.T(view).n() == 0) {
                    rect.left = i5 * 2;
                } else if (recyclerView.T(view).n() > 0) {
                    rect.left = i5;
                }
                break;
            case 10:
                int i6 = this.b;
                super.e(rect, view, recyclerView, s611Var);
                int iR5 = RecyclerView.R(view);
                if (iR5 != -1) {
                    if (iR5 == 0) {
                        rect.left = i6;
                    }
                    rect.right = i6;
                    break;
                }
                break;
            case 11:
                rect.top = RecyclerView.R(view) > 0 ? this.b : 0;
                break;
            case 12:
                super.e(rect, view, recyclerView, s611Var);
                int i7 = this.b;
                rect.left = i7;
                rect.right = i7;
                rect.bottom = i7;
                rect.top = i7;
                break;
            default:
                int i8 = this.b;
                rect.left = i8;
                rect.right = i8;
                rect.top = i8;
                rect.bottom = i8;
                break;
        }
    }

    public /* synthetic */ j1e(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public j1e(RecyclerView recyclerView, byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.b = recyclerView.getResources().getDimensionPixelOffset(2131166907);
                break;
            default:
                this.b = recyclerView.getResources().getDimensionPixelOffset(2131165606);
                break;
        }
    }
}
