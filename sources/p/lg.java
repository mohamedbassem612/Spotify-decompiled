package p;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class lg extends AccessibilityNodeProvider {
    public final ng a;

    public lg(ng ngVar) {
        this.a = ngVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        kg kgVarCreateAccessibilityNodeInfo = this.a.createAccessibilityNodeInfo(i);
        if (kgVarCreateAccessibilityNodeInfo == null) {
            return null;
        }
        return kgVarCreateAccessibilityNodeInfo.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        List listFindAccessibilityNodeInfosByText = this.a.findAccessibilityNodeInfosByText(str, i);
        if (listFindAccessibilityNodeInfosByText == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((kg) listFindAccessibilityNodeInfosByText.get(i2)).a);
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        kg kgVarFindFocus = this.a.findFocus(i);
        if (kgVarFindFocus == null) {
            return null;
        }
        return kgVarFindFocus.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.performAction(i, i2, bundle);
    }
}
