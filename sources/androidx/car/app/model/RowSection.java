package androidx.car.app.model;

import java.util.Objects;
import p.l1d;
import p.qrd;
import p.qw31;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class RowSection extends Section<Row> {
    private final int mInitialSelectedIndex;

    private RowSection(qw31 qw31Var) {
        super(qw31Var);
        qw31Var.getClass();
        this.mInitialSelectedIndex = -1;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RowSection)) {
            return false;
        }
        RowSection rowSection = (RowSection) obj;
        return super.equals(rowSection) && this.mInitialSelectedIndex == rowSection.mInitialSelectedIndex;
    }

    public int getInitialSelectedIndex() {
        return this.mInitialSelectedIndex;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mInitialSelectedIndex));
    }

    public boolean isSelectionGroup() {
        return this.mInitialSelectedIndex >= 0;
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        StringBuilder sb = new StringBuilder("RowSection { initialSelectedIndex: ");
        sb.append(this.mInitialSelectedIndex);
        sb.append(", ");
        return l1d.n(super.toString(), " }", sb);
    }

    private RowSection() {
        this.mInitialSelectedIndex = -1;
    }

    public /* synthetic */ RowSection(qw31 qw31Var, int i) {
        this(qw31Var);
    }
}
