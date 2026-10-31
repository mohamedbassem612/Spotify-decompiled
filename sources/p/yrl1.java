package p;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class yrl1 extends xrl1 {
    public yrl1(hsl1 hsl1Var, WindowInsets windowInsets) {
        super(hsl1Var, windowInsets);
    }

    @Override // p.esl1
    public hsl1 a() {
        return hsl1.g(null, this.c.consumeDisplayCutout());
    }

    @Override // p.wrl1, p.esl1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrl1)) {
            return false;
        }
        yrl1 yrl1Var = (yrl1) obj;
        return Objects.equals(this.c, yrl1Var.c) && Objects.equals(this.g, yrl1Var.g) && wrl1.M(this.h, yrl1Var.h);
    }

    @Override // p.esl1
    public hju h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new hju(displayCutout);
    }

    @Override // p.esl1
    public int hashCode() {
        return this.c.hashCode();
    }

    public yrl1(hsl1 hsl1Var, yrl1 yrl1Var) {
        super(hsl1Var, yrl1Var);
    }
}
