package p;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iq90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq90(j2i j2iVar, Object obj, ViewGroup viewGroup, byte b) {
        super(2);
        this.a = b;
        this.b = j2iVar;
        this.c = viewGroup;
    }

    public final Object invoke(Object obj, Object obj2) {
        BottomSheetBehavior m231Var;
        BottomSheetBehavior m231Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        BottomSheetBehavior bottomSheetBehavior = null;
        ViewGroup viewGroup = this.c;
        j2i j2iVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ViewParent parent = viewGroup.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        try {
                            m231Var = BottomSheetBehavior.z(viewGroup2);
                        } catch (Throwable th) {
                            m231Var = new m231(th);
                        }
                        bottomSheetBehavior = m231Var instanceof m231 ? null : m231Var;
                    }
                    j2iVar.invoke(bottomSheetBehavior, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ViewParent parent2 = viewGroup.getParent();
                    ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup3 != null) {
                        try {
                            m231Var2 = BottomSheetBehavior.z(viewGroup3);
                        } catch (Throwable th2) {
                            m231Var2 = new m231(th2);
                        }
                        bottomSheetBehavior = m231Var2 instanceof m231 ? null : m231Var2;
                    }
                    j2iVar.invoke(bottomSheetBehavior, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }
}
