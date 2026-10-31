package androidx.car.app.model;

import java.util.Objects;
import p.l1d;
import p.qrd;
import p.y7b1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class SpotlightSection extends Section<CondensedItem> {
    public static final int INCOMPLETE_LAST_COLUMN_AS_IS = 0;
    public static final int INCOMPLETE_LAST_COLUMN_TRUNCATE = 1;
    private final CarIcon mImage;
    private final int mIncompleteLastColumnStrategy;

    private SpotlightSection() {
        this.mImage = null;
        this.mIncompleteLastColumnStrategy = 1;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpotlightSection)) {
            return false;
        }
        SpotlightSection spotlightSection = (SpotlightSection) obj;
        return super.equals(spotlightSection) && Objects.equals(this.mImage, spotlightSection.mImage) && this.mIncompleteLastColumnStrategy == spotlightSection.mIncompleteLastColumnStrategy;
    }

    public CarIcon getImage() {
        CarIcon carIcon = this.mImage;
        Objects.requireNonNull(carIcon);
        return carIcon;
    }

    public int getIncompleteLastColumnStrategy() {
        return this.mIncompleteLastColumnStrategy;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mImage, Integer.valueOf(this.mIncompleteLastColumnStrategy));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        StringBuilder sb = new StringBuilder("SpotlightSection { image: ");
        sb.append(this.mImage);
        sb.append(", , incompleteLastColumn: ");
        sb.append(this.mIncompleteLastColumnStrategy);
        return l1d.n(super.toString(), " }", sb);
    }

    private SpotlightSection(y7b1 y7b1Var) {
        super(y7b1Var);
        throw null;
    }
}
