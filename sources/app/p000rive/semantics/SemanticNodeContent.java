package app.p000rive.semantics;

import kotlin.Metadata;
import p.bb00;
import p.l1d;
import p.u890;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JU\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000fR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006!"}, d2 = {"Lapp/rive/semantics/SemanticNodeContent;", "", "kind", "Lapp/rive/semantics/SemanticNodeContentKind;", "label", "", "value", "hint", "isReadOnly", "", "isObscured", "isMultiline", "(Lapp/rive/semantics/SemanticNodeContentKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getHint", "()Ljava/lang/String;", "()Z", "getKind", "()Lapp/rive/semantics/SemanticNodeContentKind;", "getLabel", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SemanticNodeContent {
    public static final int $stable = 0;
    private final String hint;
    private final boolean isMultiline;
    private final boolean isObscured;
    private final boolean isReadOnly;
    private final SemanticNodeContentKind kind;
    private final String label;
    private final String value;

    public SemanticNodeContent(SemanticNodeContentKind semanticNodeContentKind, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.kind = semanticNodeContentKind;
        this.label = str;
        this.value = str2;
        this.hint = str3;
        this.isReadOnly = z;
        this.isObscured = z2;
        this.isMultiline = z3;
    }

    public static /* synthetic */ SemanticNodeContent copy$default(SemanticNodeContent semanticNodeContent, SemanticNodeContentKind semanticNodeContentKind, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            semanticNodeContentKind = semanticNodeContent.kind;
        }
        if ((i & 2) != 0) {
            str = semanticNodeContent.label;
        }
        if ((i & 4) != 0) {
            str2 = semanticNodeContent.value;
        }
        if ((i & 8) != 0) {
            str3 = semanticNodeContent.hint;
        }
        if ((i & 16) != 0) {
            z = semanticNodeContent.isReadOnly;
        }
        if ((i & 32) != 0) {
            z2 = semanticNodeContent.isObscured;
        }
        if ((i & 64) != 0) {
            z3 = semanticNodeContent.isMultiline;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        String str4 = str2;
        return semanticNodeContent.copy(semanticNodeContentKind, str, str4, str3, z6, z4, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SemanticNodeContentKind getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsObscured() {
        return this.isObscured;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsMultiline() {
        return this.isMultiline;
    }

    public final SemanticNodeContent copy(SemanticNodeContentKind kind, String label, String value, String hint, boolean isReadOnly, boolean isObscured, boolean isMultiline) {
        return new SemanticNodeContent(kind, label, value, hint, isReadOnly, isObscured, isMultiline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticNodeContent)) {
            return false;
        }
        SemanticNodeContent semanticNodeContent = (SemanticNodeContent) other;
        return this.kind == semanticNodeContent.kind && u890.j(this.label, semanticNodeContent.label) && u890.j(this.value, semanticNodeContent.value) && u890.j(this.hint, semanticNodeContent.hint) && this.isReadOnly == semanticNodeContent.isReadOnly && this.isObscured == semanticNodeContent.isObscured && this.isMultiline == semanticNodeContent.isMultiline;
    }

    public final String getHint() {
        return this.hint;
    }

    public final SemanticNodeContentKind getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.kind.hashCode() * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        return Boolean.hashCode(this.isMultiline) + xcg1.g(xcg1.g((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.isReadOnly), 31, this.isObscured);
    }

    public final boolean isMultiline() {
        return this.isMultiline;
    }

    public final boolean isObscured() {
        return this.isObscured;
    }

    public final boolean isReadOnly() {
        return this.isReadOnly;
    }

    public String toString() {
        SemanticNodeContentKind semanticNodeContentKind = this.kind;
        String str = this.label;
        String str2 = this.value;
        String str3 = this.hint;
        boolean z = this.isReadOnly;
        boolean z2 = this.isObscured;
        boolean z3 = this.isMultiline;
        StringBuilder sb = new StringBuilder("SemanticNodeContent(kind=");
        sb.append(semanticNodeContentKind);
        sb.append(", label=");
        sb.append(str);
        sb.append(", value=");
        bb00.j(sb, str2, ", hint=", str3, ", isReadOnly=");
        sb.append(z);
        sb.append(", isObscured=");
        sb.append(z2);
        sb.append(", isMultiline=");
        return l1d.r(sb, z3, ")");
    }
}
