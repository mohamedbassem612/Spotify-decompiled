package app.p000rive.semantics;

import kotlin.Metadata;
import p.cy30;
import p.kaa0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lapp/rive/semantics/AndroidAccessibilityBounds;", "", "left", "", "top", "right", "bottom", "(IIII)V", "getBottom", "()I", "getLeft", "getRight", "getTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AndroidAccessibilityBounds {
    public static final int $stable = 0;
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public AndroidAccessibilityBounds(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public static /* synthetic */ AndroidAccessibilityBounds copy$default(AndroidAccessibilityBounds androidAccessibilityBounds, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = androidAccessibilityBounds.left;
        }
        if ((i5 & 2) != 0) {
            i2 = androidAccessibilityBounds.top;
        }
        if ((i5 & 4) != 0) {
            i3 = androidAccessibilityBounds.right;
        }
        if ((i5 & 8) != 0) {
            i4 = androidAccessibilityBounds.bottom;
        }
        return androidAccessibilityBounds.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    public final AndroidAccessibilityBounds copy(int left, int top, int right, int bottom) {
        return new AndroidAccessibilityBounds(left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidAccessibilityBounds)) {
            return false;
        }
        AndroidAccessibilityBounds androidAccessibilityBounds = (AndroidAccessibilityBounds) other;
        return this.left == androidAccessibilityBounds.left && this.top == androidAccessibilityBounds.top && this.right == androidAccessibilityBounds.right && this.bottom == androidAccessibilityBounds.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return Integer.hashCode(this.bottom) + kaa0.f(this.right, kaa0.f(this.top, Integer.hashCode(this.left) * 31, 31), 31);
    }

    public String toString() {
        int i = this.left;
        int i2 = this.top;
        int i3 = this.right;
        int i4 = this.bottom;
        StringBuilder sbQ = cy30.q(i, i2, "AndroidAccessibilityBounds(left=", ", top=", ", right=");
        sbQ.append(i3);
        sbQ.append(", bottom=");
        sbQ.append(i4);
        sbQ.append(")");
        return sbQ.toString();
    }
}
