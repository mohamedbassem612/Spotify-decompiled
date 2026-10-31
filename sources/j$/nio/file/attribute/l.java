package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class l implements FileAttribute {
    public final /* synthetic */ k a;

    public l(k kVar) {
        this.a = kVar;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(j$.desugar.sun.nio.fs.g.l((Set) this.a.value()));
    }
}
