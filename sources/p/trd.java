package p;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import androidx.car.app.model.TimerSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class trd {
    public static final trd b = new trd(Collections.EMPTY_LIST);
    public static final trd c = new trd(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class));
    public static final trd d;
    public static final trd e;
    public static final trd f;
    public static final trd g;
    public static final trd h;
    public final HashSet a;

    static {
        new trd(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class, TimerSpan.class));
        d = new trd(Arrays.asList(ForegroundCarColorSpan.class));
        e = new trd(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class));
        f = new trd(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, CarIconSpan.class));
        g = new trd(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class));
        h = new trd(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    public trd(List list) {
        this.a = new HashSet(list);
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.a.contains(cls)) {
                hhg1.n("CarSpan type is not allowed: ".concat(cls.getSimpleName()));
                return;
            }
        }
    }

    public final void b(CarText carText) {
        a(carText.getSpans());
        Iterator<List<CarText.SpanWrapper>> it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
