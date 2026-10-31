package p;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.creativeworkplatform.headerelement.CreativeWorkHeaderStickyBehavior;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.layout.headers.ComposePlayButtonBehavior;
import com.spotify.encoreconsumermobile.layout.headers.PlayButtonBehavior;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qo9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qo9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        vrl1 prl1Var;
        byte b = this.a;
        int i9 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ro9 ro9Var = (ro9) obj3;
                yat yatVar = (yat) obj;
                err0 err0Var = ro9Var.q;
                erl1 erl1Var = ((wzf0) obj2).b;
                err0Var.t(erl1Var.c(yatVar));
                ro9Var.f129p.t(erl1Var.d(yatVar));
                return;
            case 1:
                p811 p811Var = (p811) obj;
                int i10 = i3 - i;
                n811 n811Var = (n811) obj3;
                if (i10 == n811Var.a) {
                    return;
                }
                n811Var.a = i10;
                Rect rectA = ((hoc) obj2).a(i10, view.getResources());
                int i11 = rectA.left;
                nk80 nk80Var = (nk80) p811Var.a;
                Rect rect = new Rect(i11, nk80Var.b, rectA.right, nk80Var.d);
                p811Var.a = nk80.c(rect.left, rect.top, rect.right, rect.bottom);
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup == null) {
                    return;
                }
                int i12 = 0;
                while (true) {
                    if (!(i12 < viewGroup.getChildCount())) {
                        return;
                    }
                    int i13 = i12 + 1;
                    View childAt = viewGroup.getChildAt(i12);
                    if (childAt == null) {
                        tw20.p();
                        return;
                    }
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 36) {
                        prl1Var = new url1();
                    } else if (i14 >= 35) {
                        prl1Var = new trl1();
                    } else if (i14 >= 34) {
                        prl1Var = new srl1();
                    } else if (i14 >= 31) {
                        prl1Var = new rrl1();
                    } else if (i14 >= 30) {
                        prl1Var = new qrl1();
                    } else {
                        prl1Var = i14 >= 29 ? new prl1() : new nrl1();
                    }
                    prl1Var.d(519, (nk80) p811Var.a);
                    b8k1.d(childAt, prl1Var.b());
                    i12 = i13;
                }
                break;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ComposePlayButtonBehavior.t((ComposeView) obj3, (View) obj2, (Toolbar) obj);
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                ((CreativeWorkHeaderStickyBehavior) obj3).t((View) obj2, (Toolbar) obj);
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                zmr zmrVar = (zmr) obj3;
                zmrVar.v((wik) obj2);
                zmrVar.w(((k160) obj).b);
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                View view2 = (View) obj2;
                h72 h72Var = (h72) obj;
                float height = ((View) obj3).getHeight();
                double y = (((double) ((view2.getY() - ((Toolbar) h72Var.X).getHeight()) / height)) + 0.1d) * 255.0d;
                double y2 = (((double) (view2.getY() / height)) + 0.1d) * 255.0d;
                int iArgb = Color.argb((int) y, 46, 46, 46);
                int iArgb2 = Color.argb((int) y2, 30, 30, 30);
                Toolbar toolbar = (Toolbar) h72Var.X;
                Drawable background = toolbar.getBackground();
                if ((background instanceof GradientDrawable ? (GradientDrawable) background : null) == null) {
                    toolbar.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iArgb2, iArgb}));
                    return;
                } else {
                    ((GradientDrawable) toolbar.getBackground()).setColors(new int[]{iArgb2, iArgb});
                    return;
                }
            case 6:
                view.removeOnLayoutChangeListener(this);
                int height2 = ((ConstraintLayout) obj3).getHeight();
                Barrier barrier = (Barrier) obj2;
                float y3 = barrier.getY();
                Toolbar toolbar2 = (Toolbar) ((byp) obj).g;
                float f = height2;
                double height3 = (((double) ((y3 - toolbar2.getHeight()) / f)) + 0.1d) * 255.0d;
                double y4 = (((double) (barrier.getY() / f)) + 0.1d) * 255.0d;
                int iArgb3 = Color.argb((int) height3, 46, 46, 46);
                int iArgb4 = Color.argb((int) y4, 30, 30, 30);
                Drawable background2 = toolbar2.getBackground();
                if ((background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null) == null) {
                    toolbar2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iArgb4, iArgb3}));
                    return;
                } else {
                    ((GradientDrawable) toolbar2.getBackground()).setColors(new int[]{iArgb4, iArgb3});
                    return;
                }
            case 7:
                view.removeOnLayoutChangeListener(this);
                for (Object obj4 : mka.m(view.getWidth(), view.getHeight(), ((axh0) obj3).a, (blb0) obj2)) {
                    int i15 = i9 + 1;
                    if (i9 < 0) {
                        p7h.T();
                        throw null;
                    }
                    zoh0 zoh0Var = (zoh0) obj4;
                    View view3 = (View) ((ArrayList) obj).get(i9);
                    float f2 = zoh0Var.a;
                    float f3 = zoh0Var.b;
                    view3.setRotation(f2);
                    view3.setScaleX(f3);
                    view3.setScaleY(f3);
                    i9 = i15;
                }
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                PlayButtonBehavior.t((PlayButtonView) obj3, (View) obj2, (Toolbar) obj);
                return;
        }
    }

    public /* synthetic */ qo9(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
