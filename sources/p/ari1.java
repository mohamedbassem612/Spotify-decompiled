package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ari1 {
    public gv20 a;

    public abstract void a(DrawScope drawScope);

    public iu30 b() {
        return this.a;
    }

    public final void c() {
        iu30 iu30VarB = b();
        if (iu30VarB != null) {
            iu30VarB.invoke(this);
        }
    }

    public void d(gv20 gv20Var) {
        this.a = gv20Var;
    }
}
