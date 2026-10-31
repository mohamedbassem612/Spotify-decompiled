package app.p000rive.semantics;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.p000rive.RiveSemanticsMode;
import kotlin.Metadata;
import p.b0k;
import p.eg;
import p.fkj0;
import p.hab0;
import p.iu30;
import p.nku;
import p.oku;
import p.qxd0;
import p.v8r;
import p.ven0;
import p.x340;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\n¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/rive/RiveSemanticsMode;", "mode", "", "rememberRiveSemanticsEnabled", "(Lapp/rive/RiveSemanticsMode;Lp/b0k;I)Z", "Lapp/rive/semantics/AccessibilityStateProvider;", "provider", "(Lapp/rive/RiveSemanticsMode;Lapp/rive/semantics/AccessibilityStateProvider;Lp/b0k;I)Z", "rememberAccessibilityEnabled", "(Lp/b0k;I)Z", "(Lapp/rive/semantics/AccessibilityStateProvider;Lp/b0k;I)Z", "enabled", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AccessibilityKt {

    /* JADX INFO: renamed from: app.rive.semantics.AccessibilityKt$rememberAccessibilityEnabled$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/oku;", "Lp/nku;", "invoke", "(Lp/oku;)Lp/nku;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements iu30 {
        final /* synthetic */ ven0 $enabled$delegate;
        final /* synthetic */ AccessibilityStateProvider $provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AccessibilityStateProvider accessibilityStateProvider, ven0 ven0Var) {
            super(1);
            this.$provider = accessibilityStateProvider;
            this.$enabled$delegate = ven0Var;
        }

        public final nku invoke(oku okuVar) {
            final ven0 ven0Var = this.$enabled$delegate;
            final AccessibilityEnabledListener accessibilityEnabledListener = new AccessibilityEnabledListener() { // from class: app.rive.semantics.a
                @Override // app.p000rive.semantics.AccessibilityEnabledListener
                public final void onAccessibilityEnabledChanged(boolean z) {
                    AccessibilityKt.access$rememberAccessibilityEnabled$lambda$3(ven0Var, z);
                }
            };
            this.$provider.addAccessibilityStateChangeListener(accessibilityEnabledListener);
            AccessibilityKt.rememberAccessibilityEnabled$lambda$3(this.$enabled$delegate, this.$provider.isEnabled());
            final AccessibilityStateProvider accessibilityStateProvider = this.$provider;
            return new nku() { // from class: app.rive.semantics.AccessibilityKt$rememberAccessibilityEnabled$1$invoke$$inlined$onDispose$1
                public void dispose() {
                    accessibilityStateProvider.removeAccessibilityStateChangeListener(accessibilityEnabledListener);
                }
            };
        }
    }

    public static final /* synthetic */ void access$rememberAccessibilityEnabled$lambda$3(ven0 ven0Var, boolean z) {
        rememberAccessibilityEnabled$lambda$3(ven0Var, z);
    }

    public static final boolean rememberAccessibilityEnabled(AccessibilityStateProvider accessibilityStateProvider, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(770726752);
        x340Var.i0(-2080052427);
        boolean z = (((i & 14) ^ 6) > 4 && x340Var.g(accessibilityStateProvider)) || (i & 6) == 4;
        Object objT = x340Var.T();
        if (z || objT == fkj0.X) {
            objT = v8r.q(Boolean.valueOf(accessibilityStateProvider.isEnabled()));
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        x340Var.r(false);
        qxd0.i(accessibilityStateProvider, new AnonymousClass1(accessibilityStateProvider, ven0Var), x340Var);
        boolean zRememberAccessibilityEnabled$lambda$2 = rememberAccessibilityEnabled$lambda$2(ven0Var);
        x340Var.r(false);
        return zRememberAccessibilityEnabled$lambda$2;
    }

    private static final boolean rememberAccessibilityEnabled$lambda$2(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rememberAccessibilityEnabled$lambda$3(ven0 ven0Var, boolean z) {
        ven0Var.setValue(Boolean.valueOf(z));
    }

    public static final boolean rememberRiveSemanticsEnabled(RiveSemanticsMode riveSemanticsMode, AccessibilityStateProvider accessibilityStateProvider, b0k b0kVar, int i) {
        boolean zRememberAccessibilityEnabled;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1034069957);
        if (riveSemanticsMode == RiveSemanticsMode.Off) {
            zRememberAccessibilityEnabled = false;
        } else if (riveSemanticsMode == RiveSemanticsMode.On) {
            zRememberAccessibilityEnabled = true;
        } else {
            if (riveSemanticsMode != RiveSemanticsMode.Automatic) {
                eg.o();
                return false;
            }
            zRememberAccessibilityEnabled = rememberAccessibilityEnabled(accessibilityStateProvider, x340Var, (i >> 3) & 14);
        }
        x340Var.r(false);
        return zRememberAccessibilityEnabled;
    }

    public static final boolean rememberRiveSemanticsEnabled(RiveSemanticsMode riveSemanticsMode, b0k b0kVar, int i) {
        boolean zRememberAccessibilityEnabled;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1148252407);
        if (riveSemanticsMode == RiveSemanticsMode.Off) {
            zRememberAccessibilityEnabled = false;
        } else if (riveSemanticsMode == RiveSemanticsMode.On) {
            zRememberAccessibilityEnabled = true;
        } else {
            if (riveSemanticsMode != RiveSemanticsMode.Automatic) {
                eg.o();
                return false;
            }
            zRememberAccessibilityEnabled = rememberAccessibilityEnabled(x340Var, 0);
        }
        x340Var.r(false);
        return zRememberAccessibilityEnabled;
    }

    private static final boolean rememberAccessibilityEnabled(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1937063564);
        Context applicationContext = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getApplicationContext();
        x340Var.i0(-2080072568);
        boolean zG = x340Var.g(applicationContext);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            applicationContext.getClass();
            objT = new AndroidAccessibilityStateProvider(applicationContext);
            x340Var.s0(objT);
        }
        x340Var.r(false);
        boolean zRememberAccessibilityEnabled = rememberAccessibilityEnabled((AndroidAccessibilityStateProvider) objT, x340Var, 8);
        x340Var.r(false);
        return zRememberAccessibilityEnabled;
    }
}
