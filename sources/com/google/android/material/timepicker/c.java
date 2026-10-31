package com.google.android.material.timepicker;

import android.view.View;
import p.jg;
import p.kg;
import p.rf;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c extends rf {
    public final /* synthetic */ ClockFaceView a;

    public c(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        super.onInitializeAccessibilityNodeInfo(view, kgVar);
        int iIntValue = ((Integer) view.getTag(2131429930)).intValue();
        if (iIntValue > 0) {
            kgVar.a.setTraversalAfter((View) this.a.Z0.get(iIntValue - 1));
        }
        kgVar.n(jg.b(view.isSelected(), 0, 1, iIntValue, 1));
    }
}
