package j$.nio.file;

import java.nio.file.PathMatcher;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class d0 implements f0 {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ d0(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof d0) {
            obj = ((d0) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ boolean m(Path path) {
        return this.a.matches(y.p(path));
    }
}
