package p;

import android.graphics.Rect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ovb1 {
    public static final /* synthetic */ mma0[] h = {new een0(ovb1.class, "label", "getLabel()Ljava/lang/String;", 0), new een0(ovb1.class, "theme", "getTheme()Lcom/spotify/quickscroll/quickscroll2/QuickScroll$Theme;", 0)};
    public float a;
    public final nvb1 b;
    public final nvb1 c;
    public final boolean d;
    public final Rect e;
    public final Rect f;
    public final /* synthetic */ qvb1 g;

    public ovb1(qvb1 qvb1Var) {
        this.g = qvb1Var;
        this.b = new nvb1(qvb1Var, this, (byte) 0);
        this.c = new nvb1(qvb1Var, this);
        this.d = qvb1Var.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
        this.e = new Rect();
        this.f = new Rect();
    }

    public final void a(float f) {
        this.a = yoi1.o(f, 0.0f, 1.0f);
        Rect rect = this.e;
        float f2 = rect.top;
        int iHeight = rect.height();
        agz0 agz0Var = this.g.b;
        if (agz0Var != null) {
            b((f * (iHeight - agz0Var.getHeight())) + f2);
        } else {
            u890.C("handle");
            throw null;
        }
    }

    public final void b(float f) {
        Rect rect = this.e;
        float f2 = rect.top;
        float f3 = rect.bottom;
        qvb1 qvb1Var = this.g;
        agz0 agz0Var = qvb1Var.b;
        if (agz0Var == null) {
            u890.C("handle");
            throw null;
        }
        float fO = yoi1.o(f, f2, f3 - agz0Var.getHeight());
        kl1 kl1Var = qvb1Var.c;
        if (kl1Var == null) {
            u890.C("listener");
            throw null;
        }
        agz0 agz0Var2 = (agz0) kl1Var.b;
        if (agz0Var2 != null) {
            agz0Var2.setTranslationY(fO);
        }
    }
}
