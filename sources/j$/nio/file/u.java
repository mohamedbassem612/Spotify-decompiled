package j$.nio.file;

import java.nio.file.OpenOption;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class u implements OpenOption {
    public final /* synthetic */ v a;

    public /* synthetic */ u(v vVar) {
        this.a = vVar;
    }

    public static /* synthetic */ OpenOption a(v vVar) {
        if (vVar == null) {
            return null;
        }
        if (vVar instanceof t) {
            return ((t) vVar).a;
        }
        if (vVar instanceof LinkOption) {
            return java.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        return vVar instanceof g0 ? j$.desugar.sun.nio.fs.g.d((g0) vVar) : new u(vVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        v vVar = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return vVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
