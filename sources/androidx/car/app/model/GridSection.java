package androidx.car.app.model;

import java.util.Objects;
import p.l1d;
import p.qg50;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class GridSection extends Section<GridItem> {
    public static final int INCOMPLETE_LAST_ROW_AS_IS = 0;
    public static final int INCOMPLETE_LAST_ROW_TRUNCATE = 1;
    public static final int ITEM_IMAGE_SHAPE_CIRCLE = 2;
    public static final int ITEM_IMAGE_SHAPE_UNSET = 1;
    public static final int ITEM_SIZE_EXTRA_LARGE = 4;
    public static final int ITEM_SIZE_LARGE = 3;
    public static final int ITEM_SIZE_MEDIUM = 2;
    public static final int ITEM_SIZE_SMALL = 1;
    private final int mIncompleteLastRowStrategy;
    private final int mItemImageShape;
    private final int mItemSize;

    private GridSection(qg50 qg50Var) {
        super(qg50Var);
        this.mItemSize = qg50Var.f;
        this.mItemImageShape = 1;
        this.mIncompleteLastRowStrategy = qg50Var.g;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GridSection)) {
            return false;
        }
        GridSection gridSection = (GridSection) obj;
        return super.equals(gridSection) && this.mItemImageShape == gridSection.mItemImageShape && this.mItemSize == gridSection.mItemSize && this.mIncompleteLastRowStrategy == gridSection.mIncompleteLastRowStrategy;
    }

    public int getIncompleteLastRowStrategy() {
        return this.mIncompleteLastRowStrategy;
    }

    public int getItemImageShape() {
        return this.mItemImageShape;
    }

    public int getItemSize() {
        return this.mItemSize;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mItemImageShape), Integer.valueOf(this.mItemSize), Integer.valueOf(this.mIncompleteLastRowStrategy));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        StringBuilder sb = new StringBuilder("GridSection { itemSize: ");
        sb.append(this.mItemSize);
        sb.append(", itemImageShape: ");
        sb.append(this.mItemImageShape);
        sb.append(", incompleteLastRowStrategy: ");
        sb.append(this.mIncompleteLastRowStrategy);
        sb.append(", ");
        return l1d.n(super.toString(), " }", sb);
    }

    private GridSection() {
        this.mItemSize = 1;
        this.mItemImageShape = 1;
        this.mIncompleteLastRowStrategy = 1;
    }

    public /* synthetic */ GridSection(qg50 qg50Var, int i) {
        this(qg50Var);
    }
}
