package app.p000rive.runtime.kotlin;

import kotlin.Metadata;
import p.adt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lapp/rive/runtime/kotlin/Observable;", "ListenerType", "", "listener", "Lp/rih1;", "registerListener", "(Ljava/lang/Object;)V", "unregisterListener", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Observable<ListenerType> {
    @adt
    void registerListener(ListenerType listener);

    @adt
    void unregisterListener(ListenerType listener);
}
