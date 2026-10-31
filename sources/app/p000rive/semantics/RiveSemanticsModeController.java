package app.p000rive.semantics;

import app.p000rive.RiveSemanticsMode;
import kotlin.Metadata;
import p.iu30;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lapp/rive/semantics/RiveSemanticsModeController;", "Ljava/lang/AutoCloseable;", "Lapp/rive/RiveSemanticsMode;", "initialMode", "Lapp/rive/semantics/AccessibilityStateProvider;", "provider", "Lkotlin/Function1;", "", "Lp/rih1;", "onEnabledChanged", "<init>", "(Lapp/rive/RiveSemanticsMode;Lapp/rive/semantics/AccessibilityStateProvider;Lp/iu30;)V", "applyMode", "()V", "enabled", "publishEnabled", "(Z)V", "stopObserving", "close", "Lapp/rive/semantics/AccessibilityStateProvider;", "Lp/iu30;", "Lapp/rive/semantics/AccessibilityEnabledListener;", "listener", "Lapp/rive/semantics/AccessibilityEnabledListener;", "observing", "Z", "resolvedEnabled", "Ljava/lang/Boolean;", "value", "mode", "Lapp/rive/RiveSemanticsMode;", "getMode", "()Lapp/rive/RiveSemanticsMode;", "setMode", "(Lapp/rive/RiveSemanticsMode;)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveSemanticsModeController implements AutoCloseable {
    public static final int $stable = 8;
    private final AccessibilityEnabledListener listener = new RiveSemanticsModeController$listener$1(this);
    private RiveSemanticsMode mode;
    private boolean observing;
    private final iu30 onEnabledChanged;
    private final AccessibilityStateProvider provider;
    private Boolean resolvedEnabled;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RiveSemanticsMode.values().length];
            try {
                iArr[RiveSemanticsMode.Off.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RiveSemanticsMode.On.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RiveSemanticsMode.Automatic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RiveSemanticsModeController(RiveSemanticsMode riveSemanticsMode, AccessibilityStateProvider accessibilityStateProvider, iu30 iu30Var) {
        this.provider = accessibilityStateProvider;
        this.onEnabledChanged = iu30Var;
        this.mode = riveSemanticsMode;
        applyMode();
    }

    private final void applyMode() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i == 1) {
            publishEnabled(false);
            return;
        }
        if (i == 2) {
            publishEnabled(true);
        } else {
            if (i != 3) {
                return;
            }
            this.provider.addAccessibilityStateChangeListener(this.listener);
            this.observing = true;
            publishEnabled(this.provider.isEnabled());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishEnabled(boolean enabled) {
        if (u890.j(this.resolvedEnabled, Boolean.valueOf(enabled))) {
            return;
        }
        this.resolvedEnabled = Boolean.valueOf(enabled);
        this.onEnabledChanged.invoke(Boolean.valueOf(enabled));
    }

    private final void stopObserving() {
        if (this.observing) {
            this.provider.removeAccessibilityStateChangeListener(this.listener);
            this.observing = false;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        stopObserving();
    }

    public final RiveSemanticsMode getMode() {
        return this.mode;
    }

    public final void setMode(RiveSemanticsMode riveSemanticsMode) {
        if (this.mode == riveSemanticsMode) {
            return;
        }
        stopObserving();
        this.mode = riveSemanticsMode;
        applyMode();
    }
}
