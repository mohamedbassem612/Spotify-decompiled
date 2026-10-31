package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class epd implements fpd {
    public final apd a;
    public final List b;

    public epd(apd apdVar) {
        this.a = apdVar;
        this.b = Collections.singletonList(apdVar);
    }

    @Override // p.fpd
    public final jpd a() {
        return null;
    }

    @Override // p.fpd
    public final yod b() {
        return null;
    }

    @Override // p.fpd
    public final li51 c() {
        return null;
    }

    @Override // p.fpd
    public final hvc d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epd) && this.a.equals(((epd) obj).a);
    }

    @Override // p.fpd
    public final String getId() {
        return null;
    }

    @Override // p.fpd
    public final List getItems() {
        return this.b;
    }

    @Override // p.fpd
    public final int getKind() {
        return 1;
    }

    @Override // p.fpd
    public final String getTitle() {
        return null;
    }

    @Override // p.fpd
    public final String getUri() {
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.fpd
    public final qi51 u() {
        return qi51.a;
    }
}
