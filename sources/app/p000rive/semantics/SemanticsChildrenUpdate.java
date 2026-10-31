package app.p000rive.semantics;

import java.util.Arrays;
import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lapp/rive/semantics/SemanticsChildrenUpdate;", "", "parentId", "", "childIds", "", "(I[I)V", "getChildIds", "()[I", "getParentId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SemanticsChildrenUpdate {
    public static final int $stable = 8;
    private final int[] childIds;
    private final int parentId;

    public SemanticsChildrenUpdate(int i, int[] iArr) {
        this.parentId = i;
        this.childIds = iArr;
    }

    public static /* synthetic */ SemanticsChildrenUpdate copy$default(SemanticsChildrenUpdate semanticsChildrenUpdate, int i, int[] iArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = semanticsChildrenUpdate.parentId;
        }
        if ((i2 & 2) != 0) {
            iArr = semanticsChildrenUpdate.childIds;
        }
        return semanticsChildrenUpdate.copy(i, iArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int[] getChildIds() {
        return this.childIds;
    }

    public final SemanticsChildrenUpdate copy(int parentId, int[] childIds) {
        return new SemanticsChildrenUpdate(parentId, childIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticsChildrenUpdate)) {
            return false;
        }
        SemanticsChildrenUpdate semanticsChildrenUpdate = (SemanticsChildrenUpdate) other;
        return this.parentId == semanticsChildrenUpdate.parentId && u890.j(this.childIds, semanticsChildrenUpdate.childIds);
    }

    public final int[] getChildIds() {
        return this.childIds;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public int hashCode() {
        return Arrays.hashCode(this.childIds) + (Integer.hashCode(this.parentId) * 31);
    }

    public String toString() {
        return "SemanticsChildrenUpdate(parentId=" + this.parentId + ", childIds=" + Arrays.toString(this.childIds) + ")";
    }
}
