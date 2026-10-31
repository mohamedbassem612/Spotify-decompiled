package app.p000rive.semantics;

import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.iu30;
import p.kg;
import p.ng;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J)\u0010!\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J1\u0010%\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010'R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*¨\u0006+"}, d2 = {"Lapp/rive/semantics/ActiveSemanticNodeProvider;", "Lp/ng;", "delegate", "Lkotlin/Function1;", "", "", "isActiveVirtualNode", "Lkotlin/Function0;", "accessibilityFocusedVirtualNodeId", "inputFocusedVirtualNodeId", "Lp/rih1;", "synchronizeBeforeQuery", "Lkotlin/Function2;", "onAccessibilityFocusChanged", "<init>", "(Lp/ng;Lp/iu30;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lp/vu30;)V", "virtualViewId", "isQueryable", "(I)Z", "isAccessibilityFocusAction", "Lp/kg;", "createAccessibilityNodeInfo", "(I)Lp/kg;", "", "text", "", "findAccessibilityNodeInfosByText", "(Ljava/lang/String;I)Ljava/util/List;", "focus", "findFocus", "action", "Landroid/os/Bundle;", "arguments", "performAction", "(IILandroid/os/Bundle;)Z", "info", "extraDataKey", "addExtraDataToAccessibilityNodeInfo", "(ILp/kg;Ljava/lang/String;Landroid/os/Bundle;)V", "Lp/ng;", "Lp/iu30;", "Lkotlin/jvm/functions/Function0;", "Lp/vu30;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ActiveSemanticNodeProvider extends ng {
    private final Function0 accessibilityFocusedVirtualNodeId;
    private final ng delegate;
    private final Function0 inputFocusedVirtualNodeId;
    private final iu30 isActiveVirtualNode;
    private final vu30 onAccessibilityFocusChanged;
    private final Function0 synchronizeBeforeQuery;

    public ActiveSemanticNodeProvider(ng ngVar, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, vu30 vu30Var) {
        this.delegate = ngVar;
        this.isActiveVirtualNode = iu30Var;
        this.accessibilityFocusedVirtualNodeId = function0;
        this.inputFocusedVirtualNodeId = function1;
        this.synchronizeBeforeQuery = function2;
        this.onAccessibilityFocusChanged = vu30Var;
    }

    private final boolean isAccessibilityFocusAction(int i) {
        return i == 64 || i == 128;
    }

    private final boolean isQueryable(int virtualViewId) {
        this.synchronizeBeforeQuery.invoke();
        return virtualViewId == -1 || ((Boolean) this.isActiveVirtualNode.invoke(Integer.valueOf(virtualViewId))).booleanValue();
    }

    @Override // p.ng
    public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, kg info, String extraDataKey, Bundle arguments) {
        if (isQueryable(virtualViewId)) {
            this.delegate.addExtraDataToAccessibilityNodeInfo(virtualViewId, info, extraDataKey, arguments);
        }
    }

    @Override // p.ng
    public kg createAccessibilityNodeInfo(int virtualViewId) {
        if (isQueryable(virtualViewId)) {
            return this.delegate.createAccessibilityNodeInfo(virtualViewId);
        }
        return null;
    }

    @Override // p.ng
    public List<kg> findAccessibilityNodeInfosByText(String text, int virtualViewId) {
        if (isQueryable(virtualViewId)) {
            return this.delegate.findAccessibilityNodeInfosByText(text, virtualViewId);
        }
        return null;
    }

    @Override // p.ng
    public kg findFocus(int focus) {
        int iIntValue;
        this.synchronizeBeforeQuery.invoke();
        if (focus == 1) {
            iIntValue = ((Number) this.inputFocusedVirtualNodeId.invoke()).intValue();
        } else {
            if (focus != 2) {
                return this.delegate.findFocus(focus);
            }
            iIntValue = ((Number) this.accessibilityFocusedVirtualNodeId.invoke()).intValue();
        }
        if (iIntValue == Integer.MIN_VALUE || ((Boolean) this.isActiveVirtualNode.invoke(Integer.valueOf(iIntValue))).booleanValue()) {
            return this.delegate.findFocus(focus);
        }
        return null;
    }

    @Override // p.ng
    public boolean performAction(int virtualViewId, int action, Bundle arguments) {
        if (!isQueryable(virtualViewId)) {
            return false;
        }
        int iIntValue = ((Number) this.accessibilityFocusedVirtualNodeId.invoke()).intValue();
        boolean zPerformAction = this.delegate.performAction(virtualViewId, action, arguments);
        int iIntValue2 = ((Number) this.accessibilityFocusedVirtualNodeId.invoke()).intValue();
        if (zPerformAction && iIntValue != iIntValue2 && isAccessibilityFocusAction(action)) {
            this.onAccessibilityFocusChanged.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        return zPerformAction;
    }
}
