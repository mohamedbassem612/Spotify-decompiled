package p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ndd1 extends View {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ pdd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndd1(pdd1 pdd1Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = pdd1Var;
        this.a = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        pdd1 pdd1Var = this.b;
        ArrayList arrayList = pdd1Var.b;
        Drawable background = this.a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (pdd1Var.e != color) {
            pdd1Var.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((xey0) arrayList.get(size)).b(color);
            }
        }
    }
}
