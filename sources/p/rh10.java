package p;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rh10 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rh10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Class<?> cls;
        String strC;
        String strC2;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj3;
                qma0 qma0VarK = ((oma0) obj).k();
                if (qma0VarK == null) {
                    t8e1.m(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (!(qma0VarK instanceof tka0)) {
                    if (qma0VarK instanceof qma0) {
                        strC = qma0VarK.c();
                    } else {
                        cls = qma0VarK.getClass();
                    }
                    bhn0.B(rc11.a.b(cls), "Unknown upper bound classifier: ");
                    return 0;
                }
                strC = ((wdg) ((tka0) qma0VarK)).n().getName();
                qma0 qma0VarK2 = ((oma0) obj2).k();
                if (qma0VarK2 == null) {
                    t8e1.m(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (qma0VarK2 instanceof tka0) {
                    strC2 = ((wdg) ((tka0) qma0VarK2)).n().getName();
                } else {
                    if (!(qma0VarK2 instanceof qma0)) {
                        cls = qma0VarK2.getClass();
                        bhn0.B(rc11.a.b(cls), "Unknown upper bound classifier: ");
                        return 0;
                    }
                    strC2 = qma0VarK2.c();
                }
                return pap1.t(strC, strC2);
            default:
                View view = (MaterialButton) obj;
                View view2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                int iCompareTo = Boolean.valueOf(((MaterialButton) view).R0).compareTo(Boolean.valueOf(((MaterialButton) view2).R0));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(view.isPressed()).compareTo(Boolean.valueOf(view2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(materialButtonToggleGroup.indexOfChild(view)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(view2)));
        }
    }
}
