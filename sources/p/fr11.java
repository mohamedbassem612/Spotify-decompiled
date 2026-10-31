package p;

import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fr11 implements knm0 {
    public static final ewn0 e = ewn0.e(200);
    public final v9w0 a;
    public vc5 b;
    public vc5 c;
    public vc5 d;

    public fr11(v9w0 v9w0Var) {
        this.a = v9w0Var;
    }

    @Override // p.knm0
    public final void a(float f) {
        v9w0 v9w0Var = this.a;
        ArrayList arrayList = v9w0Var.c;
        View view = v9w0Var.b;
        view.setScaleX(this.b.a(f));
        view.setScaleY(this.b.a(f));
        ArrayList arrayList2 = v9w0Var.d;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setAlpha(this.c.a(f));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setAlpha(this.d.a(f));
        }
    }

    @Override // p.knm0
    public final int b() {
        return ((Integer) e.a()).intValue();
    }

    @Override // p.knm0
    public final void e() {
        v9w0 v9w0Var = this.a;
        ArrayList arrayList = v9w0Var.c;
        View view = v9w0Var.b;
        PathInterpolator pathInterpolatorX = boo1.x(view.getContext());
        this.b = new vc5(view.getScaleX(), 1.0f, pathInterpolatorX);
        ArrayList arrayList2 = v9w0Var.d;
        if (!arrayList2.isEmpty()) {
            this.c = new vc5(((View) arrayList2.get(0)).getAlpha(), 1.0f, pathInterpolatorX);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.d = new vc5(((View) arrayList.get(0)).getAlpha(), 1.0f, pathInterpolatorX);
    }
}
