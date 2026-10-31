package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class j implements FileAttribute {
    public final /* synthetic */ k a;

    public final /* synthetic */ boolean equals(Object obj) {
        k kVar = this.a;
        if (obj instanceof j) {
            obj = ((j) obj).a;
        }
        return kVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
