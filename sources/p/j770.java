package p;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j770 extends n470 {
    @Override // p.n470
    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        int color;
        String strB = y570Var.g().B("backgroundColor");
        n57.j(!jhc1.F(strB), "background color missing ");
        super.a(y570Var, l670Var, yfuVar);
        try {
            color = Color.parseColor(strB);
        } catch (IllegalArgumentException unused) {
            color = 0;
        }
        RecyclerView recyclerView = ((l570) this).a;
        GradientDrawable gradientDrawableG = rno1.g(recyclerView.getContext(), color);
        WeakHashMap weakHashMap = b8k1.a;
        recyclerView.setBackground(gradientDrawableG);
    }
}
