package p;

import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u9w0 implements knm0 {
    public static final ewn0 e = ewn0.e(0);
    public static final ewn0 f;
    public static final ewn0 g;
    public final v9w0 a;
    public vc5 b;
    public vc5 c;
    public vc5 d;

    static {
        Float fValueOf = Float.valueOf(0.6f);
        f = ewn0.e(fValueOf);
        g = ewn0.e(fValueOf);
    }

    public u9w0(v9w0 v9w0Var) {
        this.a = v9w0Var;
    }

    @Override // p.knm0
    public final void a(float f2) {
        v9w0 v9w0Var = this.a;
        ArrayList arrayList = v9w0Var.c;
        View view = v9w0Var.b;
        view.setScaleX(this.b.a(f2));
        view.setScaleY(this.b.a(f2));
        ArrayList arrayList2 = v9w0Var.d;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setAlpha(this.c.a(f2));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setAlpha(this.d.a(f2));
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
        boolean z = v9w0Var.e;
        this.b = new vc5(view.getScaleX(), v9w0Var.a, pathInterpolatorX);
        ArrayList arrayList2 = v9w0Var.d;
        if (!arrayList2.isEmpty()) {
            float alpha = ((View) arrayList2.get(0)).getAlpha();
            this.c = new vc5(alpha, z ? ((Float) f.a()).floatValue() : alpha, pathInterpolatorX);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        float alpha2 = ((View) arrayList.get(0)).getAlpha();
        this.d = new vc5(alpha2, z ? ((Float) g.a()).floatValue() : alpha2, pathInterpolatorX);
    }
}
