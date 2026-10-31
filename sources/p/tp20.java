package p;

import android.view.View;
import androidx.car.app.model.Alert;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tp20 {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f141p;
    public boolean q;
    public boolean r;
    public int a = Alert.DURATION_SHOW_INDEFINITELY;
    public int b = Alert.DURATION_SHOW_INDEFINITELY;
    public int c = os00.INVALID_ID;
    public int d = os00.INVALID_ID;
    public final ArrayList n = new ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(View view, int i, int i2, int i3, int i4) {
        sp20 sp20Var = (sp20) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - sp20Var.F0()) - i);
        this.b = Math.min(this.b, (view.getTop() - sp20Var.R()) - i2);
        this.c = Math.max(this.c, sp20Var.X0() + view.getRight() + i3);
        this.d = Math.max(this.d, sp20Var.E0() + view.getBottom() + i4);
    }
}
