package p;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vu50 {
    public final ArrayList a = new ArrayList();
    public Action b;
    public CarText c;

    public final void a(Action action) {
        Objects.requireNonNull(action);
        this.a.add(action);
    }

    public final Header b() {
        if (!CarText.isNullOrEmpty(this.c) || this.b != null) {
            return new Header(this);
        }
        eg.m("Either the title or start header action must be set");
        return null;
    }

    public final void c(Action action) {
        v90 v90Var = v90.l;
        Objects.requireNonNull(action);
        v90Var.a(Collections.singletonList(action));
        this.b = action;
    }

    public final void d(CarText carText) {
        Objects.requireNonNull(carText);
        this.c = carText;
        trd.e.b(carText);
    }
}
