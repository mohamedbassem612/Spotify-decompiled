package app.p000rive.semantics.compose;

import app.p000rive.semantics.SemanticNodeActions;
import app.p000rive.semantics.SemanticNodeContent;
import app.p000rive.semantics.SemanticNodeState;
import app.p000rive.semantics.SemanticRole;
import app.p000rive.semantics.SemanticState;
import java.util.List;
import kotlin.Metadata;
import p.kaa0;
import p.n511;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0082\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010$\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'Jz\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0017J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010\"R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b?\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010%R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u0010'¨\u0006D"}, d2 = {"Lapp/rive/semantics/compose/RenderSemanticNode;", "", "", "id", "Lapp/rive/semantics/SemanticRole;", "role", "Lapp/rive/semantics/compose/ComposeSemanticNodeContainer;", "container", "siblingIndex", "Lapp/rive/semantics/SemanticNodeContent;", "content", "Lapp/rive/semantics/SemanticNodeState;", "state", "Lapp/rive/semantics/SemanticNodeActions;", "actions", "headingLevel", "Lp/n511;", "rect", "", "children", "<init>", "(ILapp/rive/semantics/SemanticRole;Lapp/rive/semantics/compose/ComposeSemanticNodeContainer;ILapp/rive/semantics/SemanticNodeContent;Lapp/rive/semantics/SemanticNodeState;Lapp/rive/semantics/SemanticNodeActions;ILp/n511;Ljava/util/List;)V", "component1", "()I", "component2", "()Lapp/rive/semantics/SemanticRole;", "component3", "()Lapp/rive/semantics/compose/ComposeSemanticNodeContainer;", "component4", "component5", "()Lapp/rive/semantics/SemanticNodeContent;", "component6", "()Lapp/rive/semantics/SemanticNodeState;", "component7", "()Lapp/rive/semantics/SemanticNodeActions;", "component8", "component9", "()Lp/n511;", "component10", "()Ljava/util/List;", "copy", "(ILapp/rive/semantics/SemanticRole;Lapp/rive/semantics/compose/ComposeSemanticNodeContainer;ILapp/rive/semantics/SemanticNodeContent;Lapp/rive/semantics/SemanticNodeState;Lapp/rive/semantics/SemanticNodeActions;ILp/n511;Ljava/util/List;)Lapp/rive/semantics/compose/RenderSemanticNode;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lapp/rive/semantics/SemanticRole;", "getRole", "Lapp/rive/semantics/compose/ComposeSemanticNodeContainer;", "getContainer", "getSiblingIndex", "Lapp/rive/semantics/SemanticNodeContent;", "getContent", "Lapp/rive/semantics/SemanticNodeState;", "getState", "Lapp/rive/semantics/SemanticNodeActions;", "getActions", "getHeadingLevel", "Lp/n511;", "getRect", "Ljava/util/List;", "getChildren", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final /* data */ class RenderSemanticNode {
    private final SemanticNodeActions actions;
    private final List<RenderSemanticNode> children;
    private final ComposeSemanticNodeContainer container;
    private final SemanticNodeContent content;
    private final int headingLevel;
    private final int id;
    private final n511 rect;
    private final SemanticRole role;
    private final int siblingIndex;
    private final SemanticNodeState state;

    public RenderSemanticNode(int i, SemanticRole semanticRole, ComposeSemanticNodeContainer composeSemanticNodeContainer, int i2, SemanticNodeContent semanticNodeContent, SemanticNodeState semanticNodeState, SemanticNodeActions semanticNodeActions, int i3, n511 n511Var, List<RenderSemanticNode> list) {
        this.id = i;
        this.role = semanticRole;
        this.container = composeSemanticNodeContainer;
        this.siblingIndex = i2;
        this.content = semanticNodeContent;
        this.state = semanticNodeState;
        this.actions = semanticNodeActions;
        this.headingLevel = i3;
        this.rect = n511Var;
        this.children = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RenderSemanticNode copy$default(RenderSemanticNode renderSemanticNode, int i, SemanticRole semanticRole, ComposeSemanticNodeContainer composeSemanticNodeContainer, int i2, SemanticNodeContent semanticNodeContent, SemanticNodeState semanticNodeState, SemanticNodeActions semanticNodeActions, int i3, n511 n511Var, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = renderSemanticNode.id;
        }
        if ((i4 & 2) != 0) {
            semanticRole = renderSemanticNode.role;
        }
        if ((i4 & 4) != 0) {
            composeSemanticNodeContainer = renderSemanticNode.container;
        }
        if ((i4 & 8) != 0) {
            i2 = renderSemanticNode.siblingIndex;
        }
        if ((i4 & 16) != 0) {
            semanticNodeContent = renderSemanticNode.content;
        }
        if ((i4 & 32) != 0) {
            semanticNodeState = renderSemanticNode.state;
        }
        if ((i4 & 64) != 0) {
            semanticNodeActions = renderSemanticNode.actions;
        }
        if ((i4 & SemanticState.Focused) != 0) {
            i3 = renderSemanticNode.headingLevel;
        }
        if ((i4 & SemanticState.Hidden) != 0) {
            n511Var = renderSemanticNode.rect;
        }
        if ((i4 & 512) != 0) {
            list = renderSemanticNode.children;
        }
        n511 n511Var2 = n511Var;
        List list2 = list;
        SemanticNodeActions semanticNodeActions2 = semanticNodeActions;
        int i5 = i3;
        SemanticNodeContent semanticNodeContent2 = semanticNodeContent;
        SemanticNodeState semanticNodeState2 = semanticNodeState;
        return renderSemanticNode.copy(i, semanticRole, composeSemanticNodeContainer, i2, semanticNodeContent2, semanticNodeState2, semanticNodeActions2, i5, n511Var2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final List<RenderSemanticNode> component10() {
        return this.children;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SemanticRole getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ComposeSemanticNodeContainer getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSiblingIndex() {
        return this.siblingIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SemanticNodeContent getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SemanticNodeState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SemanticNodeActions getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getHeadingLevel() {
        return this.headingLevel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final n511 getRect() {
        return this.rect;
    }

    public final RenderSemanticNode copy(int id, SemanticRole role, ComposeSemanticNodeContainer container, int siblingIndex, SemanticNodeContent content, SemanticNodeState state, SemanticNodeActions actions, int headingLevel, n511 rect, List<RenderSemanticNode> children) {
        return new RenderSemanticNode(id, role, container, siblingIndex, content, state, actions, headingLevel, rect, children);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderSemanticNode)) {
            return false;
        }
        RenderSemanticNode renderSemanticNode = (RenderSemanticNode) other;
        return this.id == renderSemanticNode.id && this.role == renderSemanticNode.role && this.container == renderSemanticNode.container && this.siblingIndex == renderSemanticNode.siblingIndex && u890.j(this.content, renderSemanticNode.content) && u890.j(this.state, renderSemanticNode.state) && u890.j(this.actions, renderSemanticNode.actions) && this.headingLevel == renderSemanticNode.headingLevel && u890.j(this.rect, renderSemanticNode.rect) && u890.j(this.children, renderSemanticNode.children);
    }

    public final SemanticNodeActions getActions() {
        return this.actions;
    }

    public final List<RenderSemanticNode> getChildren() {
        return this.children;
    }

    public final ComposeSemanticNodeContainer getContainer() {
        return this.container;
    }

    public final SemanticNodeContent getContent() {
        return this.content;
    }

    public final int getHeadingLevel() {
        return this.headingLevel;
    }

    public final int getId() {
        return this.id;
    }

    public final n511 getRect() {
        return this.rect;
    }

    public final SemanticRole getRole() {
        return this.role;
    }

    public final int getSiblingIndex() {
        return this.siblingIndex;
    }

    public final SemanticNodeState getState() {
        return this.state;
    }

    public int hashCode() {
        return this.children.hashCode() + ((this.rect.hashCode() + kaa0.f(this.headingLevel, (this.actions.hashCode() + ((this.state.hashCode() + ((this.content.hashCode() + kaa0.f(this.siblingIndex, (this.container.hashCode() + ((this.role.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public String toString() {
        return "RenderSemanticNode(id=" + this.id + ", role=" + this.role + ", container=" + this.container + ", siblingIndex=" + this.siblingIndex + ", content=" + this.content + ", state=" + this.state + ", actions=" + this.actions + ", headingLevel=" + this.headingLevel + ", rect=" + this.rect + ", children=" + this.children + ")";
    }
}
