package p;

import androidx.car.app.model.CarColor;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qpd {
    public static final qpd b = new qpd(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public final HashSet a = new HashSet();

    static {
        new qpd(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public qpd(int[] iArr) {
        for (int i : iArr) {
            this.a.add(Integer.valueOf(i));
        }
    }

    public final void a(CarColor carColor) {
        if (this.a.contains(Integer.valueOf(carColor.getType()))) {
            return;
        }
        hhg1.g(carColor, "Car color type is not allowed: ");
    }
}
