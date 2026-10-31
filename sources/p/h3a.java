package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class h3a implements wu30 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ int b;

    public /* synthetic */ h3a(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public final Object apply(Object obj) {
        int i;
        int i2;
        Drawable drawable = (Drawable) obj;
        j4b1 j4b1Var = j4b1.G1;
        Context context = this.a;
        int color = context.getColor(2131104462);
        int color2 = context.getColor(2131100287);
        Resources resources = context.getResources();
        int i3 = this.b;
        if (i3 == 1) {
            i = 2131165353;
        } else if (i3 == 2) {
            i = 2131165350;
        } else {
            if (i3 != 3) {
                throw null;
            }
            i = 2131165348;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        Resources resources2 = context.getResources();
        if (i3 == 1) {
            i2 = 2131165352;
        } else if (i3 == 2) {
            i2 = 2131165349;
        } else {
            if (i3 != 3) {
                throw null;
            }
            i2 = 2131165347;
        }
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(i2);
        g4b1 g4b1Var = new g4b1(context, j4b1Var, dimensionPixelSize * 0.6f);
        g4b1Var.b(color);
        dcg dcgVar = new dcg(g4b1Var, 0.6f);
        dcgVar.e = ColorStateList.valueOf(color2);
        dcgVar.d.setColor(color2);
        dcgVar.g = color2;
        dcgVar.a();
        dcgVar.invalidateSelf();
        int i4 = g3a.g;
        f3a f3aVar = new f3a();
        f3aVar.a = dimensionPixelSize2;
        f3aVar.b = dimensionPixelSize2;
        return new g3a(drawable, dcgVar, f3aVar);
    }
}
