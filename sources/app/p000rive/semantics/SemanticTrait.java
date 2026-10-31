package app.p000rive.semantics;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lapp/rive/semantics/SemanticTrait;", "", "()V", "Checkable", "", "Enablable", "Expandable", "Focusable", "Requirable", "Selectable", "Toggleable", "has", "", "flags", "trait", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemanticTrait {
    public static final int $stable = 0;
    public static final int Checkable = 4;
    public static final int Enablable = 32;
    public static final int Expandable = 1;
    public static final int Focusable = 64;
    public static final SemanticTrait INSTANCE = new SemanticTrait();
    public static final int Requirable = 16;
    public static final int Selectable = 2;
    public static final int Toggleable = 8;

    private SemanticTrait() {
    }

    public final boolean has(int flags, int trait) {
        return (flags & trait) != 0;
    }
}
