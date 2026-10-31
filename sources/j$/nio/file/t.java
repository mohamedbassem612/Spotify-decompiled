package j$.nio.file;

import java.nio.file.OpenOption;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class t implements v {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ t(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.v, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.v, java.nio.file.LinkOption] */
    public static /* synthetic */ v a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof u) {
            return ((u) openOption).a;
        }
        if (!(openOption instanceof LinkOption)) {
            return openOption instanceof g0 ? j$.desugar.sun.nio.fs.g.d((g0) openOption) : new t(openOption);
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof t) {
            obj = ((t) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
