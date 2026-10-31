package p;

import android.view.View;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.nowplaying.scroll.view.PeekScrollView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u0y extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y0y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0y(y0y y0yVar, byte b) {
        super(1);
        this.a = b;
        this.b = y0yVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y0y y0yVar = this.b;
        switch (b) {
            case 0:
                PeekScrollView peekScrollView = y0yVar.s1;
                if (peekScrollView != null) {
                    return new zyb1(new y0u(0, peekScrollView, PeekScrollView.class, "scrollToTop", "scrollToTop()V", 0, (byte) 11), false);
                }
                u890.C("peekScrollView");
                throw null;
            case 1:
                return new jpt0(y0yVar.P0.d ? gpt0.a : fpt0.a, 2);
            case 2:
                return y0yVar.M1.U((r6h1) obj).b();
            case 3:
                return y0yVar.M1.G((r6h1) obj);
            case 4:
                return y0yVar.M1.p((r6h1) obj);
            case 5:
                return y0yVar.M1.a0((r6h1) obj);
            case 6:
                return y0yVar.M1.L((r6h1) obj);
            case 7:
                return y0yVar.M1.E((r6h1) obj);
            case 8:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                View view = y0yVar.B1;
                if (view == null) {
                    u890.C("addToButton");
                    throw null;
                }
                view.setVisibility(!zBooleanValue ? 0 : 8);
                View view2 = y0yVar.w1;
                if (view2 != null) {
                    view2.setVisibility(!zBooleanValue ? 0 : 8);
                }
                ((skn0) y0yVar.m1.get()).e.onNext(bool);
                View view3 = y0yVar.A1;
                if (zBooleanValue) {
                    if (view3 == null) {
                        u890.C("trackInfoContainer");
                        throw null;
                    }
                    view3.setVisibility(4);
                    View view4 = y0yVar.G1;
                    if (view4 == null) {
                        u890.C("trackSeekbar");
                        throw null;
                    }
                    view4.setVisibility(4);
                    View view5 = y0yVar.C1;
                    if (view5 == null) {
                        u890.C("shareButton");
                        throw null;
                    }
                    view5.setVisibility(8);
                } else {
                    if (view3 == null) {
                        u890.C("trackInfoContainer");
                        throw null;
                    }
                    view3.setVisibility(0);
                    View view6 = y0yVar.G1;
                    if (view6 == null) {
                        u890.C("trackSeekbar");
                        throw null;
                    }
                    view6.setVisibility(0);
                    View view7 = y0yVar.C1;
                    if (view7 == null) {
                        u890.C("shareButton");
                        throw null;
                    }
                    view7.setVisibility(0);
                }
                return rih1Var;
            case 9:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                View view8 = y0yVar.y1;
                if (view8 != null) {
                    view8.setVisibility(zBooleanValue2 ? 0 : 8);
                    return rih1Var;
                }
                u890.C("contextHeader");
                throw null;
            case 10:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                EncoreTextView encoreTextView = y0yVar.H1;
                if (encoreTextView != null) {
                    encoreTextView.setVisibility(zBooleanValue3 ? 0 : 8);
                    return rih1Var;
                }
                u890.C("disclaimer");
                throw null;
            default:
                return new nhl0(y0yVar.o1.path(), y0yVar.p1.a, (r6h1) obj);
        }
    }
}
