package p;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.recyclerviewutil.SmoothScrollingGridLayoutManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ckr0 extends wic0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ byte f26p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ckr0(byte b, Context context, Object obj) {
        super(context);
        this.f26p = b;
        this.q = obj;
    }

    @Override // p.wic0
    public final float b(DisplayMetrics displayMetrics) {
        int i;
        switch (this.f26p) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            case 1:
                return 0.0f / displayMetrics.densityDpi;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // p.wic0
    public int c(int i) {
        switch (this.f26p) {
            case 0:
                return Math.min(100, super.c(i));
            default:
                return super.c(i);
        }
    }

    @Override // p.wic0
    public PointF d(int i) {
        switch (this.f26p) {
            case 1:
                return ((SmoothScrollingGridLayoutManager) this.q).a(i);
            default:
                return super.d(i);
        }
    }

    @Override // p.wic0
    public void j(View view, q611 q611Var) {
        byte b = this.f26p;
        DecelerateInterpolator decelerateInterpolator = this.i;
        Object obj = this.q;
        switch (b) {
            case 0:
                xic0 xic0Var = (xic0) obj;
                int[] iArrC = xic0Var.c(xic0Var.a.getLayoutManager(), view);
                int i = iArrC[0];
                int i2 = iArrC[1];
                int iCeil = (int) Math.ceil(((double) c(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
                if (iCeil > 0) {
                    q611Var.a = i;
                    q611Var.b = i2;
                    q611Var.c = iCeil;
                    q611Var.e = decelerateInterpolator;
                    q611Var.f = true;
                }
                break;
            case 1:
            default:
                super.j(view, q611Var);
                break;
            case 2:
                xic0 xic0Var2 = (xic0) obj;
                RecyclerView recyclerView = xic0Var2.a;
                if (recyclerView != null) {
                    int[] iArrC2 = xic0Var2.c(recyclerView.getLayoutManager(), view);
                    int i3 = iArrC2[0];
                    int i4 = iArrC2[1];
                    int iCeil2 = (int) Math.ceil(((double) c(Math.max(Math.abs(i3), Math.abs(i4)))) / 0.3356d);
                    if (iCeil2 > 0) {
                        q611Var.a = i3;
                        q611Var.b = i4;
                        q611Var.c = iCeil2;
                        q611Var.e = decelerateInterpolator;
                        q611Var.f = true;
                    }
                    break;
                }
                break;
        }
    }
}
