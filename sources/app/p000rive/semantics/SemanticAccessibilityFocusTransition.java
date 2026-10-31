package app.p000rive.semantics;

import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lapp/rive/semantics/SemanticAccessibilityFocusTransition;", "", "previousNodeId", "", "currentNodeId", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCurrentNodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPreviousNodeId", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lapp/rive/semantics/SemanticAccessibilityFocusTransition;", "equals", "", "other", "hashCode", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SemanticAccessibilityFocusTransition {
    public static final int $stable = 0;
    private final Integer currentNodeId;
    private final Integer previousNodeId;

    public SemanticAccessibilityFocusTransition(Integer num, Integer num2) {
        this.previousNodeId = num;
        this.currentNodeId = num2;
    }

    public static /* synthetic */ SemanticAccessibilityFocusTransition copy$default(SemanticAccessibilityFocusTransition semanticAccessibilityFocusTransition, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = semanticAccessibilityFocusTransition.previousNodeId;
        }
        if ((i & 2) != 0) {
            num2 = semanticAccessibilityFocusTransition.currentNodeId;
        }
        return semanticAccessibilityFocusTransition.copy(num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getPreviousNodeId() {
        return this.previousNodeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCurrentNodeId() {
        return this.currentNodeId;
    }

    public final SemanticAccessibilityFocusTransition copy(Integer previousNodeId, Integer currentNodeId) {
        return new SemanticAccessibilityFocusTransition(previousNodeId, currentNodeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticAccessibilityFocusTransition)) {
            return false;
        }
        SemanticAccessibilityFocusTransition semanticAccessibilityFocusTransition = (SemanticAccessibilityFocusTransition) other;
        return u890.j(this.previousNodeId, semanticAccessibilityFocusTransition.previousNodeId) && u890.j(this.currentNodeId, semanticAccessibilityFocusTransition.currentNodeId);
    }

    public final Integer getCurrentNodeId() {
        return this.currentNodeId;
    }

    public final Integer getPreviousNodeId() {
        return this.previousNodeId;
    }

    public int hashCode() {
        Integer num = this.previousNodeId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.currentNodeId;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "SemanticAccessibilityFocusTransition(previousNodeId=" + this.previousNodeId + ", currentNodeId=" + this.currentNodeId + ")";
    }
}
