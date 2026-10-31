package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xy2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy2(View view, byte b) {
        super(1);
        this.a = b;
        this.b = view;
    }

    public final Object invoke(Object obj) {
        ViewGroup viewGroup;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        View view = this.b;
        switch (b) {
            case 0:
                return view;
            case 1:
                ViewParent parent = view.getParent();
                viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                return view;
            case 2:
                return new jp80(new b8q0(view));
            case 3:
                return view;
            case 4:
                return view;
            case 5:
                view.getParent().requestDisallowInterceptTouchEvent(((Boolean) obj).booleanValue());
                return rih1Var;
            case 6:
                view.setKeepScreenOn(true);
                return new eou(view, (byte) 1);
            case 7:
                return view;
            case 8:
                ViewParent parent2 = view.getParent();
                viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                return view;
            case 9:
                ViewParent parent3 = view.getParent();
                viewGroup = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                return view;
            case 10:
                view.getViewTreeObserver().addOnWindowFocusChangeListener(vq01.a);
                return new kz6(view, (byte) 2);
            case 11:
                view.setTranslationX(((Number) obj).floatValue());
                return rih1Var;
            case 12:
                oek1 oek1Var = (oek1) obj;
                oek1Var.h((-view.getMeasuredHeight()) / 2.0f);
                oek1Var.e(wyb1.a);
                return rih1Var;
            default:
                view.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return rih1Var;
        }
    }
}
