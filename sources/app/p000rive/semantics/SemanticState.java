package app.p000rive.semantics;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lapp/rive/semantics/SemanticState;", "", "()V", "CHECK_STATE_MASK", "", "CHECK_STATE_OFFSET", "Disabled", "Expanded", "Focused", "Hidden", "LiveRegion", "Modal", "Multiline", "Obscured", "ReadOnly", "Required", "Selected", "Toggled", "checkState", "Lapp/rive/semantics/SemanticCheckState;", "flags", "effectiveChecked", "", "effectiveMixed", "has", "state", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemanticState {
    public static final int $stable = 0;
    private static final int CHECK_STATE_MASK = 12;
    private static final int CHECK_STATE_OFFSET = 2;
    public static final int Disabled = 64;
    public static final int Expanded = 1;
    public static final int Focused = 128;
    public static final int Hidden = 256;
    public static final SemanticState INSTANCE = new SemanticState();
    public static final int LiveRegion = 512;
    public static final int Modal = 2048;
    public static final int Multiline = 8192;
    public static final int Obscured = 4096;
    public static final int ReadOnly = 1024;
    public static final int Required = 32;
    public static final int Selected = 2;
    public static final int Toggled = 16;

    private SemanticState() {
    }

    public final SemanticCheckState checkState(int flags) {
        int i = (flags & 12) >>> 2;
        if (i != 0) {
            return i != 1 ? SemanticCheckState.Mixed : SemanticCheckState.Checked;
        }
        return SemanticCheckState.Unchecked;
    }

    public final boolean effectiveChecked(int flags) {
        return checkState(flags) == SemanticCheckState.Checked;
    }

    public final boolean effectiveMixed(int flags) {
        return checkState(flags) == SemanticCheckState.Mixed;
    }

    public final boolean has(int flags, int state) {
        return (flags & state) != 0;
    }
}
