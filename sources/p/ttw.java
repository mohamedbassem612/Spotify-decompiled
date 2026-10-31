package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ttw implements isw {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final /* synthetic */ Object h;

    public ttw(ViewGroup viewGroup, boolean z, jsw jswVar, iu30 iu30Var, d75 d75Var, Context context, ViewGroup.LayoutParams layoutParams, Object obj) {
        this.a = (byte) 0;
        this.h = obj;
        this.b = new kdn0();
        this.c = new kdn0();
        this.d = new kdn0();
        this.e = new kdn0();
        ComposeView composeViewInflate = LayoutInflater.from(context).inflate(2131624448, viewGroup, false);
        if (layoutParams != null) {
            composeViewInflate.setLayoutParams(layoutParams);
        }
        if (obj != null) {
            composeViewInflate.setTag(obj);
        }
        this.f = new uhk1(composeViewInflate, viewGroup);
        this.g = composeViewInflate;
        composeViewInflate.setContent(new j2i(1028292508, new stw(this, z, jswVar, iu30Var, d75Var), true));
    }

    public static final /* synthetic */ uhk1 b(ttw ttwVar) {
        return (uhk1) ttwVar.f;
    }

    public final void a(Object obj, ysw yswVar) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                kdn0 kdn0Var = (kdn0) obj2;
                Object objE = kdn0Var.e();
                String str = yswVar.b;
                if (!u890.j(objE, str)) {
                    uhk1 uhk1Var = (uhk1) obj3;
                    if (!uhk1Var.a) {
                        uhk1Var.a = true;
                        ((ComposeView) uhk1Var.b).post(new seg1(uhk1Var, (byte) 8));
                    }
                }
                kdn0Var.m(str);
                ((kdn0) this.c).m(yswVar.a);
                ((kdn0) obj4).m(yswVar.c);
                ((kdn0) obj5).m(obj);
                break;
            default:
                unb1 unb1Var = (unb1) obj;
                FrameLayout frameLayout = (FrameLayout) obj5;
                isw iswVar = (isw) obj4;
                iswVar.a(unb1Var, yswVar);
                boolean z = unb1Var instanceof jmb1;
                iswVar.getView().setVisibility(!z ? 8 : 0);
                isw iswVarA = (isw) this.c;
                if (!z) {
                    if (iswVarA == null) {
                        iswVarA = ((osw) obj3).a((Context) obj2, frameLayout, (lsw) this.g, (iu30) this.h);
                        this.c = iswVarA;
                        frameLayout.addView(iswVarA.getView());
                    }
                    iswVarA.getView().setVisibility(0);
                    iswVarA.a(unb1Var, yswVar);
                } else if (iswVarA != null) {
                    iswVarA.a(unb1Var, yswVar);
                    iswVarA.getView().setVisibility(8);
                }
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (ComposeView) this.g;
            default:
                return (FrameLayout) this.b;
        }
    }

    public ttw(Context context, isw iswVar, osw oswVar, lsw lswVar, iu30 iu30Var) {
        this.a = (byte) 1;
        this.d = context;
        this.e = iswVar;
        this.f = oswVar;
        this.g = lswVar;
        this.h = iu30Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setTag(iswVar.getView().getTag());
        frameLayout.addView(iswVar.getView());
        this.b = frameLayout;
    }
}
