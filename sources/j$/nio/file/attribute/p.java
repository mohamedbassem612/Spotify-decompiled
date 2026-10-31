package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class p implements r {
    public final /* synthetic */ FileOwnerAttributeView a;

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ void b(a0 a0Var) throws IOException {
        this.a.setOwner(z.a(a0Var));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof p) {
            obj = ((p) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ a0 getOwner() {
        return y.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
