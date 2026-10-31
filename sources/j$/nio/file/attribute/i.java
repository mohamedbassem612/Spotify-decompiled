package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class i implements k {
    public final /* synthetic */ FileAttribute a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.a;
        if (obj instanceof i) {
            obj = ((i) obj).a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.k
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.k
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
