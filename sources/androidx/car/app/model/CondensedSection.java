package androidx.car.app.model;

import java.util.Objects;
import p.fsk;
import p.l1d;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class CondensedSection extends Section<CondensedItem> {
    public static final int INCOMPLETE_LAST_ROW_AS_IS = 0;
    public static final int INCOMPLETE_LAST_ROW_TRUNCATE = 1;
    private final int mIncompleteLastRowStrategy;

    private CondensedSection(fsk fskVar) {
        super(fskVar);
        fskVar.getClass();
        this.mIncompleteLastRowStrategy = 0;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CondensedSection) {
            return super.equals(obj) && this.mIncompleteLastRowStrategy == ((CondensedSection) obj).mIncompleteLastRowStrategy;
        }
        return false;
    }

    public int getIncompleteLastRowStrategy() {
        return this.mIncompleteLastRowStrategy;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mIncompleteLastRowStrategy));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        StringBuilder sb = new StringBuilder("CondensedSection { incompleteLastRowStrategy: ");
        sb.append(this.mIncompleteLastRowStrategy);
        sb.append(", ");
        return l1d.n(super.toString(), " }", sb);
    }

    public /* synthetic */ CondensedSection(fsk fskVar, int i) {
        this(fskVar);
    }

    private CondensedSection() {
        this.mIncompleteLastRowStrategy = 0;
    }
}
