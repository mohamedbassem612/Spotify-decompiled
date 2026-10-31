package app.p000rive.semantics;

import kotlin.Metadata;
import p.u890;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0092\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001d\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001e\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00065"}, d2 = {"Lapp/rive/semantics/SemanticNodeState;", "", "expanded", "", "selected", "toggleState", "Lapp/rive/semantics/SemanticToggleState;", "required", "enabled", "focused", "hidden", "liveRegion", "readOnly", "modal", "obscured", "multiline", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lapp/rive/semantics/SemanticToggleState;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZZZZZ)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExpanded", "getFocused", "getHidden", "()Z", "getLiveRegion", "getModal", "getMultiline", "getObscured", "getReadOnly", "getRequired", "getSelected", "getToggleState", "()Lapp/rive/semantics/SemanticToggleState;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lapp/rive/semantics/SemanticToggleState;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZZZZZ)Lapp/rive/semantics/SemanticNodeState;", "equals", "other", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SemanticNodeState {
    public static final int $stable = 0;
    private final Boolean enabled;
    private final Boolean expanded;
    private final Boolean focused;
    private final boolean hidden;
    private final boolean liveRegion;
    private final boolean modal;
    private final boolean multiline;
    private final boolean obscured;
    private final boolean readOnly;
    private final Boolean required;
    private final Boolean selected;
    private final SemanticToggleState toggleState;

    public SemanticNodeState(Boolean bool, Boolean bool2, SemanticToggleState semanticToggleState, Boolean bool3, Boolean bool4, Boolean bool5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.expanded = bool;
        this.selected = bool2;
        this.toggleState = semanticToggleState;
        this.required = bool3;
        this.enabled = bool4;
        this.focused = bool5;
        this.hidden = z;
        this.liveRegion = z2;
        this.readOnly = z3;
        this.modal = z4;
        this.obscured = z5;
        this.multiline = z6;
    }

    public static /* synthetic */ SemanticNodeState copy$default(SemanticNodeState semanticNodeState, Boolean bool, Boolean bool2, SemanticToggleState semanticToggleState, Boolean bool3, Boolean bool4, Boolean bool5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = semanticNodeState.expanded;
        }
        if ((i & 2) != 0) {
            bool2 = semanticNodeState.selected;
        }
        if ((i & 4) != 0) {
            semanticToggleState = semanticNodeState.toggleState;
        }
        if ((i & 8) != 0) {
            bool3 = semanticNodeState.required;
        }
        if ((i & 16) != 0) {
            bool4 = semanticNodeState.enabled;
        }
        if ((i & 32) != 0) {
            bool5 = semanticNodeState.focused;
        }
        if ((i & 64) != 0) {
            z = semanticNodeState.hidden;
        }
        if ((i & SemanticState.Focused) != 0) {
            z2 = semanticNodeState.liveRegion;
        }
        if ((i & SemanticState.Hidden) != 0) {
            z3 = semanticNodeState.readOnly;
        }
        if ((i & 512) != 0) {
            z4 = semanticNodeState.modal;
        }
        if ((i & SemanticState.ReadOnly) != 0) {
            z5 = semanticNodeState.obscured;
        }
        if ((i & SemanticState.Modal) != 0) {
            z6 = semanticNodeState.multiline;
        }
        boolean z7 = z5;
        boolean z8 = z6;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z;
        boolean z12 = z2;
        Boolean bool6 = bool4;
        Boolean bool7 = bool5;
        return semanticNodeState.copy(bool, bool2, semanticToggleState, bool3, bool6, bool7, z11, z12, z9, z10, z7, z8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getExpanded() {
        return this.expanded;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getObscured() {
        return this.obscured;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getMultiline() {
        return this.multiline;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SemanticToggleState getToggleState() {
        return this.toggleState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getFocused() {
        return this.focused;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getLiveRegion() {
        return this.liveRegion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final SemanticNodeState copy(Boolean expanded, Boolean selected, SemanticToggleState toggleState, Boolean required, Boolean enabled, Boolean focused, boolean hidden, boolean liveRegion, boolean readOnly, boolean modal, boolean obscured, boolean multiline) {
        return new SemanticNodeState(expanded, selected, toggleState, required, enabled, focused, hidden, liveRegion, readOnly, modal, obscured, multiline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticNodeState)) {
            return false;
        }
        SemanticNodeState semanticNodeState = (SemanticNodeState) other;
        return u890.j(this.expanded, semanticNodeState.expanded) && u890.j(this.selected, semanticNodeState.selected) && this.toggleState == semanticNodeState.toggleState && u890.j(this.required, semanticNodeState.required) && u890.j(this.enabled, semanticNodeState.enabled) && u890.j(this.focused, semanticNodeState.focused) && this.hidden == semanticNodeState.hidden && this.liveRegion == semanticNodeState.liveRegion && this.readOnly == semanticNodeState.readOnly && this.modal == semanticNodeState.modal && this.obscured == semanticNodeState.obscured && this.multiline == semanticNodeState.multiline;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Boolean getExpanded() {
        return this.expanded;
    }

    public final Boolean getFocused() {
        return this.focused;
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    public final boolean getLiveRegion() {
        return this.liveRegion;
    }

    public final boolean getModal() {
        return this.modal;
    }

    public final boolean getMultiline() {
        return this.multiline;
    }

    public final boolean getObscured() {
        return this.obscured;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final Boolean getRequired() {
        return this.required;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final SemanticToggleState getToggleState() {
        return this.toggleState;
    }

    public int hashCode() {
        Boolean bool = this.expanded;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.selected;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        SemanticToggleState semanticToggleState = this.toggleState;
        int iHashCode3 = (iHashCode2 + (semanticToggleState == null ? 0 : semanticToggleState.hashCode())) * 31;
        Boolean bool3 = this.required;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.enabled;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.focused;
        return Boolean.hashCode(this.multiline) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode5 + (bool5 != null ? bool5.hashCode() : 0)) * 31, 31, this.hidden), 31, this.liveRegion), 31, this.readOnly), 31, this.modal), 31, this.obscured);
    }

    public String toString() {
        return "SemanticNodeState(expanded=" + this.expanded + ", selected=" + this.selected + ", toggleState=" + this.toggleState + ", required=" + this.required + ", enabled=" + this.enabled + ", focused=" + this.focused + ", hidden=" + this.hidden + ", liveRegion=" + this.liveRegion + ", readOnly=" + this.readOnly + ", modal=" + this.modal + ", obscured=" + this.obscured + ", multiline=" + this.multiline + ")";
    }
}
