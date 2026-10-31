package app.p000rive.semantics;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import p.eg;
import p.f46;
import p.u890;
import p.w7x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000\u001a/\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0015\u001a(\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002\u001a\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0000\u001a0\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0000\u001a\f\u0010\u001f\u001a\u00020\u0010*\u00020\u0007H\u0002\u001a\u0014\u0010 \u001a\u00020\u0010*\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\f\u0010!\u001a\u00020\"*\u00020\u0002H\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"tapRoles", "", "Lapp/rive/semantics/SemanticRole;", "classifySemanticNodeProjection", "Lapp/rive/semantics/SemanticNodeProjection;", "role", "content", "Lapp/rive/semantics/SemanticNodeContent;", "state", "Lapp/rive/semantics/SemanticNodeState;", "minX", "", "minY", "maxX", "maxY", "gatedState", "", "traitFlags", "", "trait", "stateFlags", "(IIII)Ljava/lang/Boolean;", "hasFinitePositiveArea", "mapSemanticNodeActions", "Lapp/rive/semantics/SemanticNodeActions;", "mapSemanticNodeContent", "label", "", "value", "hint", "mapSemanticNodeState", "hasAccessibleContent", "isActiveModal", "toSemanticNodeTopology", "Lapp/rive/semantics/SemanticNodeTopology;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SemanticNodeClassificationKt {
    private static final Set<SemanticRole> tapRoles = f46.S0(new SemanticRole[]{SemanticRole.Button, SemanticRole.Link, SemanticRole.Checkbox, SemanticRole.SwitchControl, SemanticRole.Tab, SemanticRole.RadioButton});

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SemanticRole.values().length];
            try {
                iArr[SemanticRole.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SemanticRole.Group.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SemanticRole.List.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SemanticRole.TabList.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SemanticRole.Dialog.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SemanticRole.AlertDialog.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SemanticRole.RadioGroup.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SemanticRole.Button.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SemanticRole.Link.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SemanticRole.Checkbox.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SemanticRole.SwitchControl.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SemanticRole.Slider.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SemanticRole.TextField.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SemanticRole.Text.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SemanticRole.Image.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SemanticRole.ListItem.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SemanticRole.Tab.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SemanticRole.RadioButton.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SemanticNodeTopology.values().length];
            try {
                iArr2[SemanticNodeTopology.Structural.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[SemanticNodeTopology.ExplicitContainer.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[SemanticNodeTopology.AbsorbingLeaf.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SemanticCheckState.values().length];
            try {
                iArr3[SemanticCheckState.Unchecked.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[SemanticCheckState.Checked.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[SemanticCheckState.Mixed.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final SemanticNodeProjection classifySemanticNodeProjection(SemanticRole semanticRole, SemanticNodeContent semanticNodeContent, SemanticNodeState semanticNodeState, float f, float f2, float f3, float f4) {
        if (semanticNodeState.getHidden()) {
            return SemanticNodeProjection.PruneSubtree;
        }
        if (!hasFinitePositiveArea(f, f2, f3, f4)) {
            return SemanticNodeProjection.PromoteChildren;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[toSemanticNodeTopology(semanticRole).ordinal()];
        if (i == 1) {
            return hasAccessibleContent(semanticNodeContent) ? SemanticNodeProjection.ExportContainer : SemanticNodeProjection.PromoteChildren;
        }
        if (i == 2) {
            return SemanticNodeProjection.ExportContainer;
        }
        if (i == 3) {
            return SemanticNodeProjection.ExportLeaf;
        }
        eg.o();
        return null;
    }

    private static final Boolean gatedState(int i, int i2, int i3, int i4) {
        if (SemanticTrait.INSTANCE.has(i, i2)) {
            return Boolean.valueOf(SemanticState.INSTANCE.has(i3, i4));
        }
        return null;
    }

    private static final boolean hasAccessibleContent(SemanticNodeContent semanticNodeContent) {
        String label = semanticNodeContent.getLabel();
        if (label != null && label.length() != 0) {
            return true;
        }
        String value = semanticNodeContent.getValue();
        if (value != null && value.length() != 0) {
            return true;
        }
        String hint = semanticNodeContent.getHint();
        return (hint == null || hint.length() == 0) ? false : true;
    }

    private static final boolean hasFinitePositiveArea(float f, float f2, float f3, float f4) {
        return (Float.isInfinite(f) || Float.isNaN(f) || Float.isInfinite(f2) || Float.isNaN(f2) || Float.isInfinite(f3) || Float.isNaN(f3) || Float.isInfinite(f4) || Float.isNaN(f4) || f == f3 || f2 == f4) ? false : true;
    }

    public static final boolean isActiveModal(SemanticRole semanticRole, SemanticNodeState semanticNodeState) {
        if (semanticNodeState.getModal()) {
            return semanticRole == SemanticRole.Dialog || semanticRole == SemanticRole.AlertDialog;
        }
        return false;
    }

    public static final SemanticNodeActions mapSemanticNodeActions(SemanticRole semanticRole, SemanticNodeState semanticNodeState) {
        boolean zJ = u890.j(semanticNodeState.getEnabled(), Boolean.FALSE);
        Set setS0 = w7x.a;
        if (!zJ) {
            if (tapRoles.contains(semanticRole)) {
                setS0 = Collections.singleton(SemanticActionType.Tap);
            } else if (semanticRole == SemanticRole.Slider) {
                setS0 = f46.S0(new SemanticActionType[]{SemanticActionType.Increase, SemanticActionType.Decrease});
            }
        }
        return new SemanticNodeActions(setS0, semanticNodeState.getFocused() != null);
    }

    public static final SemanticNodeContent mapSemanticNodeContent(SemanticRole semanticRole, String str, String str2, String str3, SemanticNodeState semanticNodeState) {
        SemanticNodeContentKind semanticNodeContentKind;
        String str4;
        int i = WhenMappings.$EnumSwitchMapping$0[semanticRole.ordinal()];
        if (i != 13) {
            semanticNodeContentKind = i != 14 ? SemanticNodeContentKind.General : SemanticNodeContentKind.Text;
        } else {
            semanticNodeContentKind = SemanticNodeContentKind.TextField;
        }
        SemanticNodeContentKind semanticNodeContentKind2 = semanticNodeContentKind;
        boolean z = semanticNodeContentKind2 == SemanticNodeContentKind.TextField;
        boolean z2 = z && semanticNodeState.getObscured();
        if (str.length() == 0) {
            str = null;
        }
        if (z2) {
            str4 = null;
        } else {
            if (!z && str2.length() == 0) {
                str2 = null;
            }
            str4 = str2;
        }
        return new SemanticNodeContent(semanticNodeContentKind2, str, str4, str3.length() != 0 ? str3 : null, z && semanticNodeState.getReadOnly(), z2, z && semanticNodeState.getMultiline());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    public static final SemanticNodeState mapSemanticNodeState(int i, int i2) {
        SemanticToggleState semanticToggleState;
        SemanticToggleState semanticToggleState2;
        SemanticTrait semanticTrait = SemanticTrait.INSTANCE;
        if (!semanticTrait.has(i, 4)) {
            if (semanticTrait.has(i, 8)) {
                semanticToggleState2 = SemanticState.INSTANCE.has(i2, 16) ? SemanticToggleState.On : SemanticToggleState.Off;
            } else {
                semanticToggleState = null;
            }
            Boolean boolGatedState = gatedState(i, 1, i2, 1);
            Boolean boolGatedState2 = gatedState(i, 2, i2, 2);
            Boolean boolGatedState3 = gatedState(i, 16, i2, 32);
            Boolean boolGatedState4 = gatedState(i, 32, i2, 64);
            Boolean boolValueOf = boolGatedState4 != null ? Boolean.valueOf(!boolGatedState4.booleanValue()) : null;
            Boolean boolGatedState5 = gatedState(i, 64, i2, SemanticState.Focused);
            SemanticState semanticState = SemanticState.INSTANCE;
            return new SemanticNodeState(boolGatedState, boolGatedState2, semanticToggleState, boolGatedState3, boolValueOf, boolGatedState5, semanticState.has(i2, SemanticState.Hidden), semanticState.has(i2, 512), semanticState.has(i2, SemanticState.ReadOnly), semanticState.has(i2, SemanticState.Modal), semanticState.has(i2, SemanticState.Obscured), semanticState.has(i2, SemanticState.Multiline));
        }
        int i3 = WhenMappings.$EnumSwitchMapping$2[SemanticState.INSTANCE.checkState(i2).ordinal()];
        if (i3 == 1) {
            semanticToggleState2 = SemanticToggleState.Off;
        } else if (i3 == 2) {
            semanticToggleState2 = SemanticToggleState.On;
        } else {
            if (i3 != 3) {
                eg.o();
                return null;
            }
            semanticToggleState2 = SemanticToggleState.Mixed;
        }
        semanticToggleState = semanticToggleState2;
        Boolean boolGatedState6 = gatedState(i, 1, i2, 1);
        Boolean boolGatedState7 = gatedState(i, 2, i2, 2);
        Boolean boolGatedState8 = gatedState(i, 16, i2, 32);
        Boolean boolGatedState9 = gatedState(i, 32, i2, 64);
        if (boolGatedState9 != null) {
        }
        Boolean boolGatedState10 = gatedState(i, 64, i2, SemanticState.Focused);
        SemanticState semanticState2 = SemanticState.INSTANCE;
        return new SemanticNodeState(boolGatedState6, boolGatedState7, semanticToggleState, boolGatedState8, boolValueOf, boolGatedState10, semanticState2.has(i2, SemanticState.Hidden), semanticState2.has(i2, 512), semanticState2.has(i2, SemanticState.ReadOnly), semanticState2.has(i2, SemanticState.Modal), semanticState2.has(i2, SemanticState.Obscured), semanticState2.has(i2, SemanticState.Multiline));
    }

    public static final SemanticNodeTopology toSemanticNodeTopology(SemanticRole semanticRole) {
        switch (WhenMappings.$EnumSwitchMapping$0[semanticRole.ordinal()]) {
            case 1:
                return SemanticNodeTopology.Structural;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return SemanticNodeTopology.ExplicitContainer;
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
                return SemanticNodeTopology.AbsorbingLeaf;
            default:
                eg.o();
                return null;
        }
    }
}
