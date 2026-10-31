package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kw40 implements cx40, g260 {
    public final HashSet a = new HashSet(1);
    public final ArrayList b = new ArrayList(1);
    public final LinearLayout c;
    public final agg1 d;

    public kw40(Context context, ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(2131625033, viewGroup, false);
        this.c = linearLayout;
        this.d = b9p1.n(linearLayout);
    }

    @Override // p.g260
    public final void a(float f) {
        this.d.a(f);
    }

    public final void b() {
        for (bz50 bz50Var : this.b) {
            if (bz50Var.p()) {
                float fG = bz50Var.g();
                LinearLayout linearLayout = this.c;
                linearLayout.setPivotX(fG);
                linearLayout.setPivotY(bz50Var.j());
                return;
            }
        }
    }

    public final View getView() {
        return this.c;
    }
}
