package androidx.car.app.model;

import java.util.Objects;
import p.c4g;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class ChipSection extends Section<Chip> {
    private final ChipStyle mStyle;

    private ChipSection() {
        this.mStyle = null;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipSection)) {
            return false;
        }
        ChipSection chipSection = (ChipSection) obj;
        return super.equals(chipSection) && Objects.equals(this.mStyle, chipSection.mStyle);
    }

    public ChipStyle getStyle() {
        return this.mStyle;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mStyle);
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "ChipSection{items=" + getItemsDelegate() + ", title=" + getTitle() + ", style=" + this.mStyle + "}";
    }

    public ChipSection(c4g c4gVar) {
        super(c4gVar);
        throw null;
    }
}
