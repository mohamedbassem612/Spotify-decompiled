package p;

import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class th extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th(View view, byte b) {
        super(0);
        this.a = b;
        this.b = view;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        View view = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                view.callOnClick();
                return rih1Var;
            case 1:
                break;
            case 2:
                WeakHashMap weakHashMap = b8k1.a;
                r7k1.c(view, (k1q0) null);
                return rih1Var;
            case 3:
                r6h1 r6h1VarS = j7p1.s(view);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-now-playing-view-video-overlay";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                r6h1 r6h1Var = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1VarS.a);
                arrayList.add(y6h1VarA);
                return new r6h1(arrayList, r6h1VarS.b);
            case 4:
                return hap1.w(view);
            default:
                WeakReference weakReference = (WeakReference) z561.W(z561.f0(eak1.N0, z561.c0(eak1.Z, view)));
                if (weakReference == null) {
                    eg.m("No PageContext in view hierarchy");
                    return null;
                }
                Object obj = weakReference.get();
                q7r0 q7r0Var = obj instanceof q7r0 ? (q7r0) obj : null;
                if (q7r0Var != null) {
                    return q7r0Var;
                }
                eg.m("PageContext in view hierarchy has been cleared");
                return null;
        }
        while (view != null) {
            view.getTag(2131431624);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return rih1Var;
    }
}
