package p;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a80 {
    public final ArrayList a = new ArrayList();
    public final HashSet b = new HashSet();

    public final void a(Action action) {
        Objects.requireNonNull(action);
        int type = action.getType();
        HashSet hashSet = this.b;
        if (type != 1 && hashSet.contains(Integer.valueOf(type))) {
            hhg1.g(action, "Duplicated action types are disallowed: ");
            return;
        }
        CarText title = action.getTitle();
        if (title != null) {
            trd.b.b(title);
        }
        hashSet.add(Integer.valueOf(type));
        this.a.add(action);
    }
}
