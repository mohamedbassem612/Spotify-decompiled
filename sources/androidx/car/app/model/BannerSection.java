package androidx.car.app.model;

import java.util.Objects;
import p.k7a;
import p.l1d;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class BannerSection extends Section<Banner> {
    public BannerSection() {
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof BannerSection) {
            return super.equals((BannerSection) obj);
        }
        return false;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return l1d.n(super.toString(), " }", new StringBuilder("BannerSection { "));
    }

    public BannerSection(k7a k7aVar) {
        super(k7aVar);
    }
}
