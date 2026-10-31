package p;

import com.google.protobuf.Duration;
import io.reactivex.rxjava3.core.Maybe;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class dic1 {
    public static final Maybe a(List list, tka0 tka0Var) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((mmr0) next).a, tka0Var));
        mmr0 mmr0Var = (mmr0) next;
        if (mmr0Var != null) {
            return (Maybe) mmr0Var.b;
        }
        return null;
    }

    public static final long b(Duration duration) {
        return (((long) duration.o()) / 1000000) + TimeUnit.SECONDS.toMillis(duration.p());
    }
}
