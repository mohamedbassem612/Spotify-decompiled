package p;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Pane;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class knr0 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public boolean c;
    public CarIcon d;

    public final Pane a() {
        if ((this.a.size() > 0) != this.c) {
            return new Pane(this);
        }
        eg.m("The pane is set to loading but is not empty, or vice versa");
        return null;
    }
}
