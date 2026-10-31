package j$.util.stream;

import j$.desugar.sun.nio.fs.g;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class d implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return g.o(((List) obj).toArray());
    }
}
