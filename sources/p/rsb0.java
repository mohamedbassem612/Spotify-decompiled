package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rsb0 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ tsb0 c;

    public rsb0(tsb0 tsb0Var, int i) {
        this.c = tsb0Var;
        this.a = i;
    }

    public final void a(int i) {
        tsb0 tsb0Var = this.c;
        rl1 rl1Var = tsb0Var.c;
        if (rl1Var == null) {
            return;
        }
        this.b.add(new kov0(rl1Var, i, tsb0Var.b, null));
    }
}
