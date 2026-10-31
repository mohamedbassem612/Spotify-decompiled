package p;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.rxjava3.processors.UnicastProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l1r0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l1r0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View viewFindViewById;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((o1r0) obj).g().L(3);
                return;
            case 1:
                r001 r001Var = (r001) obj;
                Context contextH0 = r001Var.h0();
                if (contextH0 == null || (viewFindViewById = ((cwb) dialogInterface).findViewById(2131428458)) == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorZ = BottomSheetBehavior.z(viewFindViewById);
                r001Var.e2 = bottomSheetBehaviorZ;
                bottomSheetBehaviorZ.J((int) TypedValue.applyDimension(1, 390.0f, contextH0.getResources().getDisplayMetrics()));
                viewFindViewById.setBackground(null);
                return;
            case 2:
                mxr mxrVar = ((lqa1) obj).Y1;
                if (mxrVar != null) {
                    ((UnicastProcessor) mxrVar.d).onNext(new uss(mxrVar, (byte) 1));
                    return;
                } else {
                    u890.C("ubiLogger");
                    throw null;
                }
            default:
                mxr mxrVar2 = ((fva1) obj).Y1;
                if (mxrVar2 != null) {
                    ((UnicastProcessor) mxrVar2.d).onNext(new uss(mxrVar2, (byte) 1));
                    return;
                } else {
                    u890.C("ubiLogger");
                    throw null;
                }
        }
    }
}
