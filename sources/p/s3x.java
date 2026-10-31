package p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class s3x implements i3x {
    public int a;
    public final ArrayList b;

    public s3x(int i) {
        this.a = (i & 1) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : 50;
        this.b = new ArrayList();
    }

    public final String d() {
        return z561.d0(new sgg1(new jfa("  ", (byte) 14), ihc1.C0(o7h.y0(this.b, ",\n", (String) null, (String) null, (iu30) null, 62))), "\n");
    }

    public final ArrayList e() {
        return this.b;
    }
}
