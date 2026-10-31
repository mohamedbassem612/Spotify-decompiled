package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r4n extends ovb {
    public final ViewGroup a;
    public final idd1 b = new idd1(new j3m(this, (byte) 14));
    public final /* synthetic */ s4n c;

    public r4n(s4n s4nVar, ViewGroup viewGroup) {
        this.c = s4nVar;
        this.a = viewGroup;
    }

    public final void a(View view, float f) {
        float f2 = 0.0f;
        s4n s4nVar = this.c;
        if (f < 0.0f) {
            float height = s4nVar.getHeight() - (((f + 1.0f) * view.getHeight()) - ((Number) this.b.getValue()).intValue());
            if (height >= 0.0f) {
                f2 = height;
            }
        }
        s4nVar.setTranslationY(f2);
    }

    public final void b(View view, int i) {
        if (i == 3 || i == 4) {
            this.c.setTranslationY(0.0f);
        }
    }
}
