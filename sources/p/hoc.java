package p;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hoc {
    public final boolean a;
    public final goc b;

    public hoc(boolean z, goc gocVar) {
        this.a = z;
        this.b = gocVar;
    }

    public final Rect a(int i, Resources resources) {
        int iMin = (i - Math.min((int) TypedValue.applyDimension(1, 672.0f, resources.getDisplayMetrics()), i - (resources.getDimensionPixelSize(this.b.a) * 2))) / 2;
        return new Rect(iMin, 0, iMin, 0);
    }

    public final void b(ViewGroup viewGroup) {
        Resources resources = viewGroup.getResources();
        boolean z = this.a;
        goc gocVar = this.b;
        int dimensionPixelSize = resources.getDimensionPixelSize(z ? gocVar.a : gocVar.b);
        p811 p811Var = new p811();
        Rect rect = new Rect(dimensionPixelSize, 0, dimensionPixelSize, 0);
        p811Var.a = nk80.c(rect.left, rect.top, rect.right, rect.bottom);
        n811 n811Var = new n811();
        q59 q59Var = new q59(this, p811Var, (byte) 22);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(viewGroup, q59Var);
        if (z) {
            viewGroup.addOnLayoutChangeListener(new qo9(n811Var, this, p811Var, (byte) 1));
        }
    }
}
