package app.p000rive.semantics;

import java.util.Set;
import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lapp/rive/semantics/SemanticNodeActions;", "", "semanticActions", "", "Lapp/rive/semantics/SemanticActionType;", "canRequestFocus", "", "(Ljava/util/Set;Z)V", "getCanRequestFocus", "()Z", "getSemanticActions", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SemanticNodeActions {
    public static final int $stable = 8;
    private final boolean canRequestFocus;
    private final Set<SemanticActionType> semanticActions;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticNodeActions(Set<? extends SemanticActionType> set, boolean z) {
        this.semanticActions = set;
        this.canRequestFocus = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SemanticNodeActions copy$default(SemanticNodeActions semanticNodeActions, Set set, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            set = semanticNodeActions.semanticActions;
        }
        if ((i & 2) != 0) {
            z = semanticNodeActions.canRequestFocus;
        }
        return semanticNodeActions.copy(set, z);
    }

    public final Set<SemanticActionType> component1() {
        return this.semanticActions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCanRequestFocus() {
        return this.canRequestFocus;
    }

    public final SemanticNodeActions copy(Set<? extends SemanticActionType> semanticActions, boolean canRequestFocus) {
        return new SemanticNodeActions(semanticActions, canRequestFocus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticNodeActions)) {
            return false;
        }
        SemanticNodeActions semanticNodeActions = (SemanticNodeActions) other;
        return u890.j(this.semanticActions, semanticNodeActions.semanticActions) && this.canRequestFocus == semanticNodeActions.canRequestFocus;
    }

    public final boolean getCanRequestFocus() {
        return this.canRequestFocus;
    }

    public final Set<SemanticActionType> getSemanticActions() {
        return this.semanticActions;
    }

    public int hashCode() {
        return Boolean.hashCode(this.canRequestFocus) + (this.semanticActions.hashCode() * 31);
    }

    public String toString() {
        return "SemanticNodeActions(semanticActions=" + this.semanticActions + ", canRequestFocus=" + this.canRequestFocus + ")";
    }
}
