package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gr31 extends zko1 {
    public final void l(bx61 bx61Var, float f, float f2) {
        bx61Var.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        xw61 xw61Var = new xw61(0.0f, 0.0f, f3, f3);
        xw61Var.f = 180.0f;
        xw61Var.g = 90.0f;
        bx61Var.f.add(xw61Var);
        vw61 vw61Var = new vw61(xw61Var);
        bx61Var.a(180.0f);
        bx61Var.g.add(vw61Var);
        bx61Var.d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        bx61Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f4;
        bx61Var.c = (f5 * ((float) Math.sin(Math.toRadians(270.0d)))) + f4;
    }
}
