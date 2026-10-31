package p;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xgu implements isw {
    public ji0 a;
    public xab1 b;
    public dtw c;
    public final nwr d;
    public final FrameLayout e;
    public final r4u f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ ygu h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ ViewGroup t;

    public xgu(Context context, ygu yguVar, iu30 iu30Var, ViewGroup viewGroup) {
        xgu xguVar;
        ygu yguVar2;
        this.g = context;
        this.h = yguVar;
        this.i = iu30Var;
        this.t = viewGroup;
        nwr nwrVar = new nwr(context, yguVar.b, (byte) 0);
        nwrVar.n(new hws(iu30Var, (byte) 9));
        yjq yjqVar = (yjq) nwrVar.e;
        FrameLayout frameLayout = (FrameLayout) yjqVar.c;
        FrameLayout frameLayout2 = (FrameLayout) yjqVar.c;
        if (!frameLayout.isAttachedToWindow()) {
            xguVar = this;
            yguVar2 = yguVar;
            frameLayout.addOnAttachStateChangeListener(new vgu(frameLayout, yguVar2, xguVar, (byte) 0));
        } else if (yguVar.f.a) {
            xguVar = this;
            yguVar2 = yguVar;
            xguVar.b = fn31.T(yguVar.h, yguVar.a, 0, new sr1(yguVar2, xguVar, viewGroup, (lnm) null, (byte) 14), 2);
        } else {
            xguVar = this;
            yguVar2 = yguVar;
        }
        if (frameLayout2.isAttachedToWindow()) {
            frameLayout2.addOnAttachStateChangeListener(new c9s(frameLayout2, xguVar, (byte) 2));
        } else {
            xab1 xab1Var = xguVar.b;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
        }
        xguVar.d = nwrVar;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        xguVar.e = frameLayout2;
        ugu uguVar = ugu.b;
        xguVar.f = r4u.c(new r4u[]{r4u.d(new lfb((byte) 8), r4u.a(new hur(xguVar, yguVar2, (byte) 29)))});
    }

    public static final Object b(ygu yguVar, xgu xguVar, ViewGroup viewGroup, dn60 dn60Var, a8d1 a8d1Var) {
        Object objCollect = m4c.x(yguVar.g, (FrameLayout) ((yjq) xguVar.d.e).c, viewGroup, dn60Var).collect(new ryr((Object) xguVar, (Object) yguVar, (byte) 16), a8d1Var);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public final void a(Object obj, ysw yswVar) {
        String str;
        String str2;
        qhl layoutParams;
        p57 p57Var;
        p57 p57Var2;
        zgu zguVar = (zgu) obj;
        ji0 ji0Var = zguVar.c;
        ygu yguVar = this.h;
        rzo0 rzo0Var = yguVar.i;
        op0 op0Var = yguVar.t;
        if (rzo0Var != null) {
            rzo0Var.F(zguVar.b.a, u6t.Z0);
        }
        this.f.e(zguVar);
        String str3 = ji0Var.c;
        fgh0 fgh0Var = ji0Var.g;
        String str4 = ji0Var.R0;
        gq70 gq70Var = (gq70) o7h.s0(fgh0Var.a);
        if (gq70Var == null || (p57Var2 = gq70Var.c) == null) {
            str = "";
        } else {
            str = p57Var2 instanceof p57 ? p57Var2.a : null;
            if (str == null) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
        }
        i1x i1xVar = new i1x(str3, str4, str, ji0Var.e.length() > 0);
        nwr nwrVar = this.d;
        nwrVar.a(i1xVar);
        cs10 cs10Var = new cs10(false);
        gq70 gq70Var2 = (gq70) o7h.s0(fgh0Var.a);
        if (gq70Var2 == null || (p57Var = gq70Var2.c) == null) {
            str2 = null;
        } else {
            String str5 = p57Var instanceof p57 ? p57Var.a : null;
            if (str5 == null) {
                str5 = null;
            }
            str2 = str5;
        }
        kp0 kp0Var = new kp0(cs10Var, str2, ji0Var.c, ji0Var, ji0Var.i, ji0Var.b, ji0Var.Z.getValue(), ji0Var.W0, ji0Var.Y0.a, false, new hws(this.i, (byte) 10));
        dtw dtwVar = this.c;
        if (dtwVar != null) {
            dtwVar.f(kp0Var);
            return;
        }
        tka0 tka0Var = dtw.C;
        Context context = this.g;
        Activity activity = (Activity) context;
        dtw dtwVarB = mhc.b(activity, this.t, f6o1.A(op0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), kp0Var, (ipb1) null, 112);
        this.c = dtwVarB;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 48.0f, activity.getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 32.0f, activity.getResources().getDisplayMetrics());
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(iApplyDimension2, iApplyDimension2, 17));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Integer.MIN_VALUE);
        view.setBackground(gradientDrawable);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(iApplyDimension, iApplyDimension));
        frameLayout.addView(view);
        frameLayout.addView(dtwVarB.w, new FrameLayout.LayoutParams(iApplyDimension, iApplyDimension));
        View view2 = (ClearButtonView) ((yjq) nwrVar.e).b;
        ViewGroup viewGroup = (ViewGroup) view2.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        int id = view2.getId();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        qhl qhlVar = layoutParams2 instanceof qhl ? (qhl) layoutParams2 : null;
        viewGroup.removeView(view2);
        FrameLayout frameLayout2 = new FrameLayout((Context) nwrVar.c);
        frameLayout2.setId(id);
        if (qhlVar != null) {
            ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
            int i = (layoutParams3 != null ? layoutParams3.width : 0) - ((ViewGroup.MarginLayoutParams) qhlVar).width;
            if (i < 0) {
                i = 0;
            }
            int i2 = i / 2;
            layoutParams = new qhl(-2, -2);
            layoutParams.i = qhlVar.i;
            layoutParams.v = qhlVar.v;
            int marginStart = qhlVar.getMarginStart() - i2;
            if (marginStart < 0) {
                marginStart = 0;
            }
            layoutParams.setMarginStart(marginStart);
            int marginEnd = qhlVar.getMarginEnd() - i2;
            if (marginEnd < 0) {
                marginEnd = 0;
            }
            layoutParams.setMarginEnd(marginEnd);
            int i3 = ((ViewGroup.MarginLayoutParams) qhlVar).topMargin - i2;
            if (i3 < 0) {
                i3 = 0;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i3;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        frameLayout2.setLayoutParams(layoutParams);
        viewGroup.addView(frameLayout2, iIndexOfChild);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout2.addView(frameLayout);
    }

    public final View getView() {
        return this.e;
    }
}
