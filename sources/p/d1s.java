package p;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d1s implements qek1 {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public boolean a;
    public byte b;
    public Object c;

    public d1s(gw31 gw31Var) {
        ot31 ot31Var = ot31.g;
        this.b = gw31Var.a;
        this.c = gw31Var.b;
        this.a = gw31Var.c;
    }

    public static void b(int i, ArrayList arrayList) {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (d[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public void a(View view) {
        this.a = true;
    }

    public ie30 c(ie30 ie30Var) {
        if (!this.a || !((sjb) this.c).e(ie30Var)) {
            return ie30Var;
        }
        ge30 ge30VarA = ie30Var.a();
        String str = ie30Var.l;
        ge30VarA.o = asj0.p("application/x-media3-cues");
        ge30VarA.P = ((sjb) this.c).c(ie30Var);
        StringBuilder sb = new StringBuilder();
        sb.append(ie30Var.f66p);
        sb.append(str != null ? " ".concat(str) : "");
        ge30VarA.k = sb.toString();
        ge30VarA.t = Long.MAX_VALUE;
        return new ie30(ge30VarA);
    }

    public void d(View view) {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    public void e() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }
}
