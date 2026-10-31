package app.p000rive.semantics.compose;

import app.p000rive.semantics.SemanticNodeContent;
import app.p000rive.semantics.SemanticNodeContentKind;
import app.p000rive.semantics.SemanticNodeState;
import app.p000rive.semantics.SemanticRole;
import app.p000rive.semantics.SemanticToggleState;
import kotlin.Metadata;
import p.af5;
import p.b261;
import p.d261;
import p.d4h;
import p.e261;
import p.eg;
import p.f46;
import p.iu30;
import p.mma0;
import p.o7h;
import p.pm31;
import p.rih1;
import p.rze1;
import p.u890;
import p.z161;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\n*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\n*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u00020\n*\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lapp/rive/semantics/SemanticRole;", "Lp/pm31;", "toComposeRole", "(Lapp/rive/semantics/SemanticRole;)Lp/pm31;", "Lapp/rive/semantics/compose/ComposeSemanticNodeContainer;", "toComposeSemanticNodeContainer", "(Lapp/rive/semantics/SemanticRole;)Lapp/rive/semantics/compose/ComposeSemanticNodeContainer;", "Lp/e261;", "Lapp/rive/semantics/SemanticNodeContent;", "content", "Lp/rih1;", "applySemanticNodeContent", "(Lp/e261;Lapp/rive/semantics/SemanticNodeContent;)V", "Lapp/rive/semantics/SemanticNodeState;", "state", "applySemanticNodeState", "(Lp/e261;Lapp/rive/semantics/SemanticNodeState;)V", "container", "applySemanticNodeContainer", "(Lp/e261;Lapp/rive/semantics/compose/ComposeSemanticNodeContainer;)V", "", "siblingIndex", "applySemanticNodeTraversal", "(Lp/e261;I)V", "Lapp/rive/semantics/SemanticToggleState;", "Lp/rze1;", "toComposeToggleableState", "(Lapp/rive/semantics/SemanticToggleState;)Lp/rze1;", "", "value", "hint", "joinContentDescriptions", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ComposeSemanticNodeMappingKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[SemanticRole.values().length];
            try {
                iArr[SemanticRole.Button.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SemanticRole.Checkbox.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SemanticRole.SwitchControl.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SemanticRole.Slider.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SemanticRole.Image.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SemanticRole.Tab.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SemanticRole.RadioButton.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SemanticRole.None.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SemanticRole.Link.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SemanticRole.TextField.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SemanticRole.Text.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SemanticRole.Group.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SemanticRole.List.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SemanticRole.ListItem.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SemanticRole.TabList.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SemanticRole.Dialog.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SemanticRole.AlertDialog.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SemanticRole.RadioGroup.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SemanticNodeContentKind.values().length];
            try {
                iArr2[SemanticNodeContentKind.General.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[SemanticNodeContentKind.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[SemanticNodeContentKind.TextField.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ComposeSemanticNodeContainer.values().length];
            try {
                iArr3[ComposeSemanticNodeContainer.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[ComposeSemanticNodeContainer.Group.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[ComposeSemanticNodeContainer.Collection.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[ComposeSemanticNodeContainer.SelectableGroup.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[ComposeSemanticNodeContainer.Dialog.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SemanticToggleState.values().length];
            try {
                iArr4[SemanticToggleState.Off.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[SemanticToggleState.On.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[SemanticToggleState.Mixed.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final void applySemanticNodeContainer(e261 e261Var, ComposeSemanticNodeContainer composeSemanticNodeContainer) {
        int i = WhenMappings.$EnumSwitchMapping$2[composeSemanticNodeContainer.ordinal()];
        if (i == 2) {
            b261.F(e261Var, true);
            return;
        }
        if (i == 3) {
            b261.F(e261Var, true);
            b261.k(e261Var, new d4h(-1, -1));
            return;
        }
        rih1 rih1Var = rih1.a;
        if (i == 4) {
            b261.F(e261Var, true);
            e261Var.b(z161.e, rih1Var);
        } else {
            if (i != 5) {
                return;
            }
            b261.F(e261Var, true);
            e261Var.b(z161.y, rih1Var);
        }
    }

    public static final void applySemanticNodeContent(e261 e261Var, SemanticNodeContent semanticNodeContent) {
        int i = WhenMappings.$EnumSwitchMapping$1[semanticNodeContent.getKind().ordinal()];
        if (i == 1) {
            String label = semanticNodeContent.getLabel();
            if (label != null) {
                b261.n(e261Var, label);
            }
            String strJoinContentDescriptions = joinContentDescriptions(semanticNodeContent.getValue(), semanticNodeContent.getHint());
            if (strJoinContentDescriptions != null) {
                b261.A(e261Var, strJoinContentDescriptions);
                return;
            }
            return;
        }
        if (i == 2) {
            String label2 = semanticNodeContent.getLabel();
            if (label2 != null) {
                b261.C(e261Var, new af5(label2));
            }
            String strJoinContentDescriptions2 = joinContentDescriptions(semanticNodeContent.getValue(), semanticNodeContent.getHint());
            if (strJoinContentDescriptions2 != null) {
                b261.A(e261Var, strJoinContentDescriptions2);
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        String label3 = semanticNodeContent.getLabel();
        if (label3 != null) {
            b261.n(e261Var, label3);
        }
        String value = semanticNodeContent.getValue();
        if (value == null) {
            value = "";
        }
        b261.q(e261Var, new af5(value));
        String hint = semanticNodeContent.getHint();
        if (hint != null) {
            b261.A(e261Var, hint);
        }
        if (semanticNodeContent.isObscured()) {
            e261Var.b(z161.N, rih1.a);
            d261 d261Var = z161.o;
            mma0 mma0Var = b261.a[7];
            Boolean bool = Boolean.TRUE;
            d261Var.getClass();
            e261Var.b(d261Var, bool);
        }
    }

    public static final void applySemanticNodeState(e261 e261Var, SemanticNodeState semanticNodeState) {
        if (semanticNodeState.getLiveRegion()) {
            b261.t(e261Var, 0);
        }
        if (u890.j(semanticNodeState.getEnabled(), Boolean.FALSE)) {
            b261.a(e261Var);
        }
        Boolean selected = semanticNodeState.getSelected();
        if (selected != null) {
            b261.y(e261Var, selected.booleanValue());
        }
        SemanticToggleState toggleState = semanticNodeState.getToggleState();
        if (toggleState != null) {
            b261.E(e261Var, toComposeToggleableState(toggleState));
        }
    }

    public static final void applySemanticNodeTraversal(e261 e261Var, int i) {
        b261.G(e261Var, i);
    }

    private static final String joinContentDescriptions(String str, String str2) {
        String strY0 = o7h.y0(f46.i0(new String[]{str, str2}), ", ", (String) null, (String) null, (iu30) null, 62);
        if (strY0.length() == 0) {
            return null;
        }
        return strY0;
    }

    public static final pm31 toComposeRole(SemanticRole semanticRole) {
        switch (WhenMappings.$EnumSwitchMapping$0[semanticRole.ordinal()]) {
            case 1:
                return new pm31(0);
            case 2:
                return new pm31(1);
            case 3:
                return new pm31(2);
            case 4:
                return new pm31(7);
            case 5:
                return new pm31(5);
            case 6:
                return new pm31(4);
            case 7:
                return new pm31(3);
            default:
                eg.o();
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return null;
        }
    }

    public static final ComposeSemanticNodeContainer toComposeSemanticNodeContainer(SemanticRole semanticRole) {
        switch (WhenMappings.$EnumSwitchMapping$0[semanticRole.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 14:
                return ComposeSemanticNodeContainer.None;
            case 12:
                return ComposeSemanticNodeContainer.Group;
            case 13:
                return ComposeSemanticNodeContainer.Collection;
            case 15:
            case 18:
                return ComposeSemanticNodeContainer.SelectableGroup;
            case 16:
            case 17:
                return ComposeSemanticNodeContainer.Dialog;
            default:
                eg.o();
                return null;
        }
    }

    private static final rze1 toComposeToggleableState(SemanticToggleState semanticToggleState) {
        int i = WhenMappings.$EnumSwitchMapping$3[semanticToggleState.ordinal()];
        if (i == 1) {
            return rze1.b;
        }
        if (i == 2) {
            return rze1.a;
        }
        if (i == 3) {
            return rze1.c;
        }
        eg.o();
        return null;
    }
}
