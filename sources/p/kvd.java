package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kvd {
    public final jvd a;
    public hsd b = esd.a;
    public final BehaviorSubject c = BehaviorSubject.f();
    public final Map d = Collections.synchronizedMap(new LinkedHashMap());

    public kvd(jvd jvdVar) {
        this.a = jvdVar;
    }
}
