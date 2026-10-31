package app.p000rive.semantics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bb00;
import p.cy30;
import p.kaa0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 82\u00020\u0001:\u00018Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n¢\u0006\u0002\u0010\u0012J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\nHÆ\u0003¢\u0006\u0002\u0010%J\u0086\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u001c2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0006HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b'\u0010\u0014¨\u00069"}, d2 = {"Lapp/rive/semantics/SemanticsDiff;", "", "treeVersion", "", "frameNumber", "rootId", "", "removed", "", "added", "", "Lapp/rive/semantics/SemanticsDiffNode;", "moved", "childrenUpdated", "Lapp/rive/semantics/SemanticsChildrenUpdate;", "updatedSemantic", "updatedGeometry", "Lapp/rive/semantics/SemanticsBoundsUpdate;", "(JJI[I[Lapp/rive/semantics/SemanticsDiffNode;[Lapp/rive/semantics/SemanticsDiffNode;[Lapp/rive/semantics/SemanticsChildrenUpdate;[Lapp/rive/semantics/SemanticsDiffNode;[Lapp/rive/semantics/SemanticsBoundsUpdate;)V", "getAdded", "()[Lapp/rive/semantics/SemanticsDiffNode;", "[Lapp/rive/semantics/SemanticsDiffNode;", "getChildrenUpdated", "()[Lapp/rive/semantics/SemanticsChildrenUpdate;", "[Lapp/rive/semantics/SemanticsChildrenUpdate;", "getFrameNumber", "()J", "isEmpty", "", "()Z", "getMoved", "getRemoved", "()[I", "getRootId", "()I", "getTreeVersion", "getUpdatedGeometry", "()[Lapp/rive/semantics/SemanticsBoundsUpdate;", "[Lapp/rive/semantics/SemanticsBoundsUpdate;", "getUpdatedSemantic", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJI[I[Lapp/rive/semantics/SemanticsDiffNode;[Lapp/rive/semantics/SemanticsDiffNode;[Lapp/rive/semantics/SemanticsChildrenUpdate;[Lapp/rive/semantics/SemanticsDiffNode;[Lapp/rive/semantics/SemanticsBoundsUpdate;)Lapp/rive/semantics/SemanticsDiff;", "equals", "other", "hashCode", "toString", "", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SemanticsDiff {
    private final SemanticsDiffNode[] added;
    private final SemanticsChildrenUpdate[] childrenUpdated;
    private final long frameNumber;
    private final SemanticsDiffNode[] moved;
    private final int[] removed;
    private final int rootId;
    private final long treeVersion;
    private final SemanticsBoundsUpdate[] updatedGeometry;
    private final SemanticsDiffNode[] updatedSemantic;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final SemanticsDiff Empty = new SemanticsDiff(0, 0, 0, new int[0], new SemanticsDiffNode[0], new SemanticsDiffNode[0], new SemanticsChildrenUpdate[0], new SemanticsDiffNode[0], new SemanticsBoundsUpdate[0]);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/semantics/SemanticsDiff$Companion;", "", "()V", "Empty", "Lapp/rive/semantics/SemanticsDiff;", "getEmpty", "()Lapp/rive/semantics/SemanticsDiff;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SemanticsDiff getEmpty() {
            return SemanticsDiff.Empty;
        }

        private Companion() {
        }
    }

    public SemanticsDiff(long j, long j2, int i, int[] iArr, SemanticsDiffNode[] semanticsDiffNodeArr, SemanticsDiffNode[] semanticsDiffNodeArr2, SemanticsChildrenUpdate[] semanticsChildrenUpdateArr, SemanticsDiffNode[] semanticsDiffNodeArr3, SemanticsBoundsUpdate[] semanticsBoundsUpdateArr) {
        this.treeVersion = j;
        this.frameNumber = j2;
        this.rootId = i;
        this.removed = iArr;
        this.added = semanticsDiffNodeArr;
        this.moved = semanticsDiffNodeArr2;
        this.childrenUpdated = semanticsChildrenUpdateArr;
        this.updatedSemantic = semanticsDiffNodeArr3;
        this.updatedGeometry = semanticsBoundsUpdateArr;
    }

    public static /* synthetic */ SemanticsDiff copy$default(SemanticsDiff semanticsDiff, long j, long j2, int i, int[] iArr, SemanticsDiffNode[] semanticsDiffNodeArr, SemanticsDiffNode[] semanticsDiffNodeArr2, SemanticsChildrenUpdate[] semanticsChildrenUpdateArr, SemanticsDiffNode[] semanticsDiffNodeArr3, SemanticsBoundsUpdate[] semanticsBoundsUpdateArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = semanticsDiff.treeVersion;
        }
        return semanticsDiff.copy(j, (i2 & 2) != 0 ? semanticsDiff.frameNumber : j2, (i2 & 4) != 0 ? semanticsDiff.rootId : i, (i2 & 8) != 0 ? semanticsDiff.removed : iArr, (i2 & 16) != 0 ? semanticsDiff.added : semanticsDiffNodeArr, (i2 & 32) != 0 ? semanticsDiff.moved : semanticsDiffNodeArr2, (i2 & 64) != 0 ? semanticsDiff.childrenUpdated : semanticsChildrenUpdateArr, (i2 & SemanticState.Focused) != 0 ? semanticsDiff.updatedSemantic : semanticsDiffNodeArr3, (i2 & SemanticState.Hidden) != 0 ? semanticsDiff.updatedGeometry : semanticsBoundsUpdateArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTreeVersion() {
        return this.treeVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getFrameNumber() {
        return this.frameNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRootId() {
        return this.rootId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int[] getRemoved() {
        return this.removed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SemanticsDiffNode[] getAdded() {
        return this.added;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SemanticsDiffNode[] getMoved() {
        return this.moved;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SemanticsChildrenUpdate[] getChildrenUpdated() {
        return this.childrenUpdated;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SemanticsDiffNode[] getUpdatedSemantic() {
        return this.updatedSemantic;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SemanticsBoundsUpdate[] getUpdatedGeometry() {
        return this.updatedGeometry;
    }

    public final SemanticsDiff copy(long treeVersion, long frameNumber, int rootId, int[] removed, SemanticsDiffNode[] added, SemanticsDiffNode[] moved, SemanticsChildrenUpdate[] childrenUpdated, SemanticsDiffNode[] updatedSemantic, SemanticsBoundsUpdate[] updatedGeometry) {
        return new SemanticsDiff(treeVersion, frameNumber, rootId, removed, added, moved, childrenUpdated, updatedSemantic, updatedGeometry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticsDiff)) {
            return false;
        }
        SemanticsDiff semanticsDiff = (SemanticsDiff) other;
        return this.treeVersion == semanticsDiff.treeVersion && this.frameNumber == semanticsDiff.frameNumber && this.rootId == semanticsDiff.rootId && u890.j(this.removed, semanticsDiff.removed) && u890.j(this.added, semanticsDiff.added) && u890.j(this.moved, semanticsDiff.moved) && u890.j(this.childrenUpdated, semanticsDiff.childrenUpdated) && u890.j(this.updatedSemantic, semanticsDiff.updatedSemantic) && u890.j(this.updatedGeometry, semanticsDiff.updatedGeometry);
    }

    public final SemanticsDiffNode[] getAdded() {
        return this.added;
    }

    public final SemanticsChildrenUpdate[] getChildrenUpdated() {
        return this.childrenUpdated;
    }

    public final long getFrameNumber() {
        return this.frameNumber;
    }

    public final SemanticsDiffNode[] getMoved() {
        return this.moved;
    }

    public final int[] getRemoved() {
        return this.removed;
    }

    public final int getRootId() {
        return this.rootId;
    }

    public final long getTreeVersion() {
        return this.treeVersion;
    }

    public final SemanticsBoundsUpdate[] getUpdatedGeometry() {
        return this.updatedGeometry;
    }

    public final SemanticsDiffNode[] getUpdatedSemantic() {
        return this.updatedSemantic;
    }

    public int hashCode() {
        return Arrays.hashCode(this.updatedGeometry) + ((Arrays.hashCode(this.updatedSemantic) + ((Arrays.hashCode(this.childrenUpdated) + ((Arrays.hashCode(this.moved) + ((Arrays.hashCode(this.added) + ((Arrays.hashCode(this.removed) + kaa0.f(this.rootId, cy30.f(Long.hashCode(this.treeVersion) * 31, this.frameNumber, 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isEmpty() {
        return this.removed.length == 0 && this.added.length == 0 && this.moved.length == 0 && this.childrenUpdated.length == 0 && this.updatedSemantic.length == 0 && this.updatedGeometry.length == 0;
    }

    public String toString() {
        long j = this.treeVersion;
        long j2 = this.frameNumber;
        int i = this.rootId;
        String string = Arrays.toString(this.removed);
        String string2 = Arrays.toString(this.added);
        String string3 = Arrays.toString(this.moved);
        String string4 = Arrays.toString(this.childrenUpdated);
        String string5 = Arrays.toString(this.updatedSemantic);
        String string6 = Arrays.toString(this.updatedGeometry);
        StringBuilder sbS = cy30.s(j, "SemanticsDiff(treeVersion=", ", frameNumber=");
        sbS.append(j2);
        sbS.append(", rootId=");
        sbS.append(i);
        bb00.j(sbS, ", removed=", string, ", added=", string2);
        bb00.j(sbS, ", moved=", string3, ", childrenUpdated=", string4);
        bb00.j(sbS, ", updatedSemantic=", string5, ", updatedGeometry=", string6);
        sbS.append(")");
        return sbS.toString();
    }
}
