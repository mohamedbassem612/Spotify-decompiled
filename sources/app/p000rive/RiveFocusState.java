package app.p000rive;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lapp/rive/RiveFocusState;", "", "hasFocus", "", "expectsKeyboardInput", "(ZZ)V", "getExpectsKeyboardInput", "()Z", "getHasFocus", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RiveFocusState {
    public static final int $stable = 0;
    private final boolean expectsKeyboardInput;
    private final boolean hasFocus;

    public /* synthetic */ RiveFocusState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public static /* synthetic */ RiveFocusState copy$default(RiveFocusState riveFocusState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = riveFocusState.hasFocus;
        }
        if ((i & 2) != 0) {
            z2 = riveFocusState.expectsKeyboardInput;
        }
        return riveFocusState.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasFocus() {
        return this.hasFocus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getExpectsKeyboardInput() {
        return this.expectsKeyboardInput;
    }

    public final RiveFocusState copy(boolean hasFocus, boolean expectsKeyboardInput) {
        return new RiveFocusState(hasFocus, expectsKeyboardInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiveFocusState)) {
            return false;
        }
        RiveFocusState riveFocusState = (RiveFocusState) other;
        return this.hasFocus == riveFocusState.hasFocus && this.expectsKeyboardInput == riveFocusState.expectsKeyboardInput;
    }

    public final boolean getExpectsKeyboardInput() {
        return this.expectsKeyboardInput;
    }

    public final boolean getHasFocus() {
        return this.hasFocus;
    }

    public int hashCode() {
        return Boolean.hashCode(this.expectsKeyboardInput) + (Boolean.hashCode(this.hasFocus) * 31);
    }

    public String toString() {
        return "RiveFocusState(hasFocus=" + this.hasFocus + ", expectsKeyboardInput=" + this.expectsKeyboardInput + ")";
    }

    public RiveFocusState(boolean z, boolean z2) {
        this.hasFocus = z;
        this.expectsKeyboardInput = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RiveFocusState() {
        boolean z = false;
        this(z, z, 3, null);
    }
}
