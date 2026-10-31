package app.p000rive.semantics;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Iterator;
import kotlin.Metadata;
import p.eg;
import p.f4i1;
import p.fg;
import p.hg;
import p.hhg1;
import p.kg;
import p.sf;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\t*\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\t*\u00020\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0019\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\t*\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010 \u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!\u001a\u001b\u0010$\u001a\u00020\u0006*\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lapp/rive/semantics/SemanticRole;", "", "toAndroidAccessibilityClassName", "(Lapp/rive/semantics/SemanticRole;)Ljava/lang/String;", "Lp/kg;", "role", "Lp/rih1;", "applySemanticNodeRole", "(Lp/kg;Lapp/rive/semantics/SemanticRole;)V", "", "headingLevel", "", "isAndroidAccessibilityHeading", "(I)Z", "applySemanticNodeHeading", "(Lp/kg;I)V", "Lapp/rive/semantics/SemanticNodeState;", "toAndroidAccessibilityExpandedState", "(Lapp/rive/semantics/SemanticNodeState;)Ljava/lang/Integer;", "Lapp/rive/semantics/SemanticToggleState;", "toAndroidAccessibilityCheckedState", "(Lapp/rive/semantics/SemanticToggleState;)I", "toAndroidAccessibilityLiveRegion", "(Lapp/rive/semantics/SemanticNodeState;)I", "state", "applySemanticNodeState", "(Lp/kg;Lapp/rive/semantics/SemanticNodeState;)V", "Lapp/rive/semantics/SemanticActionType;", "toAndroidAccessibilityActionId", "(Lapp/rive/semantics/SemanticActionType;)I", "Lapp/rive/semantics/SemanticNodeActions;", "actions", "applySemanticNodeActions", "(Lp/kg;Lapp/rive/semantics/SemanticNodeActions;)V", "Lapp/rive/semantics/SemanticNodeContent;", "content", "applySemanticNodeContent", "(Lp/kg;Lapp/rive/semantics/SemanticNodeContent;)V", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidSemanticNodeMappingKt {

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
                iArr[SemanticRole.TextField.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SemanticRole.Text.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SemanticRole.Image.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SemanticRole.List.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SemanticRole.RadioGroup.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SemanticRole.RadioButton.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SemanticRole.None.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SemanticRole.Link.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SemanticRole.Group.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SemanticRole.ListItem.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SemanticRole.Tab.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SemanticRole.TabList.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SemanticRole.Dialog.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SemanticRole.AlertDialog.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SemanticToggleState.values().length];
            try {
                iArr2[SemanticToggleState.Off.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[SemanticToggleState.On.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[SemanticToggleState.Mixed.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SemanticActionType.values().length];
            try {
                iArr3[SemanticActionType.Tap.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[SemanticActionType.Increase.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[SemanticActionType.Decrease.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SemanticNodeContentKind.values().length];
            try {
                iArr4[SemanticNodeContentKind.General.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[SemanticNodeContentKind.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[SemanticNodeContentKind.TextField.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final void applySemanticNodeActions(kg kgVar, SemanticNodeActions semanticNodeActions) {
        kgVar.a.setClickable(semanticNodeActions.getSemanticActions().contains(SemanticActionType.Tap));
        Iterator<T> it = semanticNodeActions.getSemanticActions().iterator();
        while (it.hasNext()) {
            kgVar.b(new fg(toAndroidAccessibilityActionId((SemanticActionType) it.next()), (CharSequence) null));
        }
    }

    public static final void applySemanticNodeContent(kg kgVar, SemanticNodeContent semanticNodeContent) {
        AccessibilityNodeInfo accessibilityNodeInfo = kgVar.a;
        int i = WhenMappings.$EnumSwitchMapping$3[semanticNodeContent.getKind().ordinal()];
        if (i == 1) {
            kgVar.o(semanticNodeContent.getLabel());
            kgVar.v(semanticNodeContent.getValue());
        } else if (i == 2) {
            kgVar.w(semanticNodeContent.getLabel());
            kgVar.v(semanticNodeContent.getValue());
        } else if (i == 3) {
            kgVar.o(semanticNodeContent.getLabel());
            kgVar.w(semanticNodeContent.getValue());
            accessibilityNodeInfo.setEditable(false);
            accessibilityNodeInfo.setPassword(semanticNodeContent.isObscured());
            boolean zIsObscured = semanticNodeContent.isObscured();
            if (Build.VERSION.SDK_INT >= 34) {
                sf.J(accessibilityNodeInfo, zIsObscured);
            } else {
                kgVar.k(64, zIsObscured);
            }
            accessibilityNodeInfo.setMultiLine(semanticNodeContent.isMultiline());
        }
        String hint = semanticNodeContent.getHint();
        if (Build.VERSION.SDK_INT >= 36) {
            hg.n(accessibilityNodeInfo, hint);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY", hint);
        }
    }

    public static final void applySemanticNodeHeading(kg kgVar, int i) {
        kgVar.p(isAndroidAccessibilityHeading(i));
    }

    public static final void applySemanticNodeRole(kg kgVar, SemanticRole semanticRole) {
        String androidAccessibilityClassName = toAndroidAccessibilityClassName(semanticRole);
        if (androidAccessibilityClassName != null) {
            kgVar.l(androidAccessibilityClassName);
        }
    }

    public static final void applySemanticNodeState(kg kgVar, SemanticNodeState semanticNodeState) {
        AccessibilityNodeInfo accessibilityNodeInfo = kgVar.a;
        Integer androidAccessibilityExpandedState = toAndroidAccessibilityExpandedState(semanticNodeState);
        if (androidAccessibilityExpandedState != null) {
            int iIntValue = androidAccessibilityExpandedState.intValue();
            if (Build.VERSION.SDK_INT >= 36) {
                hg.k(accessibilityNodeInfo, iIntValue);
            } else {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", iIntValue);
            }
        }
        Boolean selected = semanticNodeState.getSelected();
        if (selected != null) {
            accessibilityNodeInfo.setSelected(selected.booleanValue());
        }
        SemanticToggleState toggleState = semanticNodeState.getToggleState();
        if (toggleState != null) {
            accessibilityNodeInfo.setCheckable(true);
            int androidAccessibilityCheckedState = toAndroidAccessibilityCheckedState(toggleState);
            if (Build.VERSION.SDK_INT >= 36) {
                hg.b(accessibilityNodeInfo, androidAccessibilityCheckedState);
            } else if (androidAccessibilityCheckedState != 1 && androidAccessibilityCheckedState != 2 && androidAccessibilityCheckedState != 0) {
                hhg1.n(f4i1.c(androidAccessibilityCheckedState, "Unknown checked argument: "));
                return;
            } else {
                accessibilityNodeInfo.setChecked(androidAccessibilityCheckedState == 1);
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", androidAccessibilityCheckedState);
            }
        }
        Boolean required = semanticNodeState.getRequired();
        if (required != null) {
            boolean zBooleanValue = required.booleanValue();
            if (Build.VERSION.SDK_INT >= 36) {
                hg.l(accessibilityNodeInfo, zBooleanValue);
            } else {
                accessibilityNodeInfo.getExtras().putBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY", zBooleanValue);
            }
        }
        Boolean enabled = semanticNodeState.getEnabled();
        if (enabled != null) {
            accessibilityNodeInfo.setEnabled(enabled.booleanValue());
        }
        accessibilityNodeInfo.setLiveRegion(toAndroidAccessibilityLiveRegion(semanticNodeState));
    }

    public static final boolean isAndroidAccessibilityHeading(int i) {
        return i > 0;
    }

    public static final int toAndroidAccessibilityActionId(SemanticActionType semanticActionType) {
        int i = WhenMappings.$EnumSwitchMapping$2[semanticActionType.ordinal()];
        if (i == 1) {
            return 16;
        }
        if (i == 2) {
            return SemanticState.Obscured;
        }
        if (i == 3) {
            return SemanticState.Multiline;
        }
        eg.o();
        return 0;
    }

    public static final int toAndroidAccessibilityCheckedState(SemanticToggleState semanticToggleState) {
        int i = WhenMappings.$EnumSwitchMapping$1[semanticToggleState.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        eg.o();
        return 0;
    }

    public static final String toAndroidAccessibilityClassName(SemanticRole semanticRole) {
        switch (WhenMappings.$EnumSwitchMapping$0[semanticRole.ordinal()]) {
            case 1:
                return "android.widget.Button";
            case 2:
                return "android.widget.CheckBox";
            case 3:
                return "android.widget.Switch";
            case 4:
                return "android.widget.SeekBar";
            case 5:
                return "android.widget.EditText";
            case 6:
                return "android.widget.TextView";
            case 7:
                return "android.widget.ImageView";
            case 8:
                return "android.widget.ListView";
            case 9:
                return "android.widget.RadioGroup";
            case 10:
                return "android.widget.RadioButton";
            default:
                eg.o();
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

    public static final Integer toAndroidAccessibilityExpandedState(SemanticNodeState semanticNodeState) {
        Boolean expanded = semanticNodeState.getExpanded();
        if (expanded != null) {
            return Integer.valueOf(expanded.booleanValue() ? 3 : 1);
        }
        return null;
    }

    public static final int toAndroidAccessibilityLiveRegion(SemanticNodeState semanticNodeState) {
        return semanticNodeState.getLiveRegion() ? 1 : 0;
    }
}
