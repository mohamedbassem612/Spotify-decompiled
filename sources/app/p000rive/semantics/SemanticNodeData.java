package app.p000rive.semantics;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bb00;
import p.cy30;
import p.gvg;
import p.kaa0;
import p.ktd;
import p.u890;
import p.x0d;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u009b\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a¨\u0006;"}, d2 = {"Lapp/rive/semantics/SemanticNodeData;", "", "id", "", "parentId", "role", "label", "", "value", "hint", "stateFlags", "traitFlags", "headingLevel", "minX", "", "minY", "maxX", "maxY", "children", "", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIFFFFLjava/util/List;)V", "getChildren", "()Ljava/util/List;", "getHeadingLevel", "()I", "getHint", "()Ljava/lang/String;", "getId", "getLabel", "getMaxX", "()F", "getMaxY", "getMinX", "getMinY", "getParentId", "getRole", "getStateFlags", "getTraitFlags", "getValue", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SemanticNodeData {
    public static final int $stable = 8;
    private final List<Integer> children;
    private final int headingLevel;
    private final String hint;
    private final int id;
    private final String label;
    private final float maxX;
    private final float maxY;
    private final float minX;
    private final float minY;
    private final int parentId;
    private final int role;
    private final int stateFlags;
    private final int traitFlags;
    private final String value;

    public /* synthetic */ SemanticNodeData(int i, int i2, int i3, String str, String str2, String str3, int i4, int i5, int i6, float f, float f2, float f3, float f4, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2, str3, i4, i5, i6, f, f2, f3, f4, (i7 & SemanticState.Multiline) != 0 ? z6x.a : list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getMinX() {
        return this.minX;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getMinY() {
        return this.minY;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getMaxX() {
        return this.maxX;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getMaxY() {
        return this.maxY;
    }

    public final List<Integer> component14() {
        return this.children;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStateFlags() {
        return this.stateFlags;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getTraitFlags() {
        return this.traitFlags;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getHeadingLevel() {
        return this.headingLevel;
    }

    public final SemanticNodeData copy(int id, int parentId, int role, String label, String value, String hint, int stateFlags, int traitFlags, int headingLevel, float minX, float minY, float maxX, float maxY, List<Integer> children) {
        return new SemanticNodeData(id, parentId, role, label, value, hint, stateFlags, traitFlags, headingLevel, minX, minY, maxX, maxY, children);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticNodeData)) {
            return false;
        }
        SemanticNodeData semanticNodeData = (SemanticNodeData) other;
        return this.id == semanticNodeData.id && this.parentId == semanticNodeData.parentId && this.role == semanticNodeData.role && u890.j(this.label, semanticNodeData.label) && u890.j(this.value, semanticNodeData.value) && u890.j(this.hint, semanticNodeData.hint) && this.stateFlags == semanticNodeData.stateFlags && this.traitFlags == semanticNodeData.traitFlags && this.headingLevel == semanticNodeData.headingLevel && Float.compare(this.minX, semanticNodeData.minX) == 0 && Float.compare(this.minY, semanticNodeData.minY) == 0 && Float.compare(this.maxX, semanticNodeData.maxX) == 0 && Float.compare(this.maxY, semanticNodeData.maxY) == 0 && u890.j(this.children, semanticNodeData.children);
    }

    public final List<Integer> getChildren() {
        return this.children;
    }

    public final int getHeadingLevel() {
        return this.headingLevel;
    }

    public final String getHint() {
        return this.hint;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final float getMaxX() {
        return this.maxX;
    }

    public final float getMaxY() {
        return this.maxY;
    }

    public final float getMinX() {
        return this.minX;
    }

    public final float getMinY() {
        return this.minY;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final int getRole() {
        return this.role;
    }

    public final int getStateFlags() {
        return this.stateFlags;
    }

    public final int getTraitFlags() {
        return this.traitFlags;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.children.hashCode() + x0d.f(x0d.f(x0d.f(x0d.f(kaa0.f(this.headingLevel, kaa0.f(this.traitFlags, kaa0.f(this.stateFlags, cy30.d(cy30.d(cy30.d(kaa0.f(this.role, kaa0.f(this.parentId, Integer.hashCode(this.id) * 31, 31), 31), 31, this.label), 31, this.value), 31, this.hint), 31), 31), 31), 31, this.minX), 31, this.minY), 31, this.maxX), 31, this.maxY);
    }

    public String toString() {
        int i = this.id;
        int i2 = this.parentId;
        int i3 = this.role;
        String str = this.label;
        String str2 = this.value;
        String str3 = this.hint;
        int i4 = this.stateFlags;
        int i5 = this.traitFlags;
        int i6 = this.headingLevel;
        float f = this.minX;
        float f2 = this.minY;
        float f3 = this.maxX;
        float f4 = this.maxY;
        List<Integer> list = this.children;
        StringBuilder sbQ = cy30.q(i, i2, "SemanticNodeData(id=", ", parentId=", ", role=");
        sbQ.append(i3);
        sbQ.append(", label=");
        sbQ.append(str);
        sbQ.append(", value=");
        bb00.j(sbQ, str2, ", hint=", str3, ", stateFlags=");
        ktd.p(i4, i5, ", traitFlags=", ", headingLevel=", sbQ);
        sbQ.append(i6);
        sbQ.append(", minX=");
        sbQ.append(f);
        sbQ.append(", minY=");
        gvg.t(sbQ, f2, ", maxX=", f3, ", maxY=");
        sbQ.append(f4);
        sbQ.append(", children=");
        sbQ.append(list);
        sbQ.append(")");
        return sbQ.toString();
    }

    public SemanticNodeData(int i, int i2, int i3, String str, String str2, String str3, int i4, int i5, int i6, float f, float f2, float f3, float f4, List<Integer> list) {
        this.id = i;
        this.parentId = i2;
        this.role = i3;
        this.label = str;
        this.value = str2;
        this.hint = str3;
        this.stateFlags = i4;
        this.traitFlags = i5;
        this.headingLevel = i6;
        this.minX = f;
        this.minY = f2;
        this.maxX = f3;
        this.maxY = f4;
        this.children = list;
    }
}
