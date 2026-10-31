package app.p000rive.semantics;

import kotlin.Metadata;
import p.bb00;
import p.cy30;
import p.gvg;
import p.kaa0;
import p.ktd;
import p.u890;
import p.x0d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\u0095\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u00069"}, d2 = {"Lapp/rive/semantics/SemanticsDiffNode;", "", "id", "", "role", "label", "", "value", "hint", "stateFlags", "traitFlags", "headingLevel", "minX", "", "minY", "maxX", "maxY", "parentId", "siblingIndex", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIFFFFII)V", "getHeadingLevel", "()I", "getHint", "()Ljava/lang/String;", "getId", "getLabel", "getMaxX", "()F", "getMaxY", "getMinX", "getMinY", "getParentId", "getRole", "getSiblingIndex", "getStateFlags", "getTraitFlags", "getValue", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SemanticsDiffNode {
    public static final int $stable = 0;
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
    private final int siblingIndex;
    private final int stateFlags;
    private final int traitFlags;
    private final String value;

    public SemanticsDiffNode(int i, int i2, String str, String str2, String str3, int i3, int i4, int i5, float f, float f2, float f3, float f4, int i6, int i7) {
        this.id = i;
        this.role = i2;
        this.label = str;
        this.value = str2;
        this.hint = str3;
        this.stateFlags = i3;
        this.traitFlags = i4;
        this.headingLevel = i5;
        this.minX = f;
        this.minY = f2;
        this.maxX = f3;
        this.maxY = f4;
        this.parentId = i6;
        this.siblingIndex = i7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getMinY() {
        return this.minY;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getMaxX() {
        return this.maxX;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getMaxY() {
        return this.maxY;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSiblingIndex() {
        return this.siblingIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStateFlags() {
        return this.stateFlags;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTraitFlags() {
        return this.traitFlags;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getHeadingLevel() {
        return this.headingLevel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getMinX() {
        return this.minX;
    }

    public final SemanticsDiffNode copy(int id, int role, String label, String value, String hint, int stateFlags, int traitFlags, int headingLevel, float minX, float minY, float maxX, float maxY, int parentId, int siblingIndex) {
        return new SemanticsDiffNode(id, role, label, value, hint, stateFlags, traitFlags, headingLevel, minX, minY, maxX, maxY, parentId, siblingIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticsDiffNode)) {
            return false;
        }
        SemanticsDiffNode semanticsDiffNode = (SemanticsDiffNode) other;
        return this.id == semanticsDiffNode.id && this.role == semanticsDiffNode.role && u890.j(this.label, semanticsDiffNode.label) && u890.j(this.value, semanticsDiffNode.value) && u890.j(this.hint, semanticsDiffNode.hint) && this.stateFlags == semanticsDiffNode.stateFlags && this.traitFlags == semanticsDiffNode.traitFlags && this.headingLevel == semanticsDiffNode.headingLevel && Float.compare(this.minX, semanticsDiffNode.minX) == 0 && Float.compare(this.minY, semanticsDiffNode.minY) == 0 && Float.compare(this.maxX, semanticsDiffNode.maxX) == 0 && Float.compare(this.maxY, semanticsDiffNode.maxY) == 0 && this.parentId == semanticsDiffNode.parentId && this.siblingIndex == semanticsDiffNode.siblingIndex;
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

    public final int getSiblingIndex() {
        return this.siblingIndex;
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
        return Integer.hashCode(this.siblingIndex) + kaa0.f(this.parentId, x0d.f(x0d.f(x0d.f(x0d.f(kaa0.f(this.headingLevel, kaa0.f(this.traitFlags, kaa0.f(this.stateFlags, cy30.d(cy30.d(cy30.d(kaa0.f(this.role, Integer.hashCode(this.id) * 31, 31), 31, this.label), 31, this.value), 31, this.hint), 31), 31), 31), 31, this.minX), 31, this.minY), 31, this.maxX), 31, this.maxY), 31);
    }

    public String toString() {
        int i = this.id;
        int i2 = this.role;
        String str = this.label;
        String str2 = this.value;
        String str3 = this.hint;
        int i3 = this.stateFlags;
        int i4 = this.traitFlags;
        int i5 = this.headingLevel;
        float f = this.minX;
        float f2 = this.minY;
        float f3 = this.maxX;
        float f4 = this.maxY;
        int i6 = this.parentId;
        int i7 = this.siblingIndex;
        StringBuilder sbQ = cy30.q(i, i2, "SemanticsDiffNode(id=", ", role=", ", label=");
        bb00.j(sbQ, str, ", value=", str2, ", hint=");
        sbQ.append(str3);
        sbQ.append(", stateFlags=");
        sbQ.append(i3);
        sbQ.append(", traitFlags=");
        ktd.p(i4, i5, ", headingLevel=", ", minX=", sbQ);
        gvg.t(sbQ, f, ", minY=", f2, ", maxX=");
        gvg.t(sbQ, f3, ", maxY=", f4, ", parentId=");
        sbQ.append(i6);
        sbQ.append(", siblingIndex=");
        sbQ.append(i7);
        sbQ.append(")");
        return sbQ.toString();
    }
}
