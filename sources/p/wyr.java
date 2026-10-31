package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.podcastplaybackspeed.uiusecases.wheelcontrol.WheelControlLayoutManager;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wyr implements qzh {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public final Object d;
    public Object e;
    public final Object f;

    public wyr(Context context, bnl1 bnl1Var) {
        this.a = (byte) 3;
        this.b = bnl1Var;
        anl1 anl1Var = bnl1Var.b;
        boolean z = anl1Var.d;
        int i = z ? 2131165557 : 2131165556;
        idd1 idd1Var = new idd1(new mo2(context, (byte) 15));
        this.e = idd1Var;
        Resources resources = context.getResources();
        zml1 zml1Var = bnl1Var.a;
        inl1 inl1Var = new inl1(resources, zml1Var.a, zml1Var.b, zml1Var.c, anl1Var.c, i, anl1Var.b);
        this.f = inl1Var;
        knl1 knl1Var = (knl1) idd1Var.getValue();
        ConstraintLayout constraintLayout = knl1Var.d;
        RecyclerView recyclerView = knl1Var.b;
        if (z) {
            knl1Var.c.setTextAppearance(2132018022);
        }
        recyclerView.setLayoutManager(new WheelControlLayoutManager(i));
        recyclerView.setAdapter(inl1Var);
        xic0 xic0Var = new xic0((byte) 0);
        xic0Var.b(recyclerView);
        recyclerView.m(new jnl1(xic0Var, new i4o((Object) this, (byte) 25), new wrs(this, knl1Var, (byte) 5)));
        constraintLayout.setOnKeyListener(new q0t(this, (byte) 0));
        this.d = new fnl1(constraintLayout, recyclerView, bnl1Var);
    }

    public oxw0 a() {
        return (oxw0) ((idd1) this.f).getValue();
    }

    public void b(int i, boolean z) {
        fnl1 fnl1Var = (fnl1) this.d;
        b8k1.t(fnl1Var.a, (String) ((bnl1) this.b).b.b.invoke(Integer.valueOf(i)));
        iu30 iu30Var = (iu30) this.c;
        if (iu30Var != null) {
            iu30Var.invoke(new cnl1(i, z));
        }
    }

    public final void f(Object obj) {
        yjy yjyVar;
        yjy vjyVar;
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        int i = 1;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                w6z0 w6z0Var = (w6z0) obj;
                FacePileView facePileView = (FacePileView) obj3;
                se10 se10Var = w6z0Var.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                frameLayout.setVisibility(w6z0Var.c ? 0 : 8);
                frameLayout.setEnabled(w6z0Var.a);
                boolean zIsEmpty = se10Var.a.isEmpty();
                ((ConstraintLayout) this.e).setBackground(zIsEmpty ? null : (Drawable) obj4);
                facePileView.setVisibility(zIsEmpty ? 8 : 0);
                tto1.s((gw70) obj2, (af10) null, facePileView.a, se10Var.a, facePileView.c, se10Var.d);
                break;
            case 1:
                nxw0 nxw0Var = (nxw0) obj;
                Context context = (Context) obj2;
                String string = a().c.getText().toString();
                String str = nxw0Var.a;
                if (!u890.j(string, str)) {
                    a().c.setText(str);
                    if (!nxw0Var.b) {
                        a().f.setText(context.getString(2131960461));
                        a().b.setText(context.getString(2131960460));
                        a().c.setHint(context.getString(2131960461));
                        a().e.setText(context.getString(2131960452));
                    } else {
                        a().f.setText(context.getString(2131963947));
                        a().b.setText(context.getString(2131963945));
                        a().c.setHint(context.getString(2131963946));
                        a().e.setText(context.getString(2131963940));
                    }
                }
                break;
            case 2:
                axf1 axf1Var = (axf1) obj;
                lly llyVar = (lly) ((idd1) this.c).getValue();
                cky ckyVar = axf1Var.c;
                llyVar.a(new cky(ckyVar.a, ckyVar.b, ckyVar.c, ckyVar.d, new mky((LinearLayout) this.e), ckyVar.f, ckyVar.g, ckyVar.h, ckyVar.i, ckyVar.j, ckyVar.k, ckyVar.l, ckyVar.m, ckyVar.n));
                dtw dtwVar = (dtw) obj4;
                if (dtwVar != null) {
                    dtwVar.f(new tg7(axf1Var.a, axf1Var.b));
                }
                ((QuickActionView) ((idd1) obj3).getValue()).a(axf1Var.d);
                break;
            case 3:
                inl1 inl1Var = (inl1) obj4;
                int iP = yoi1.p((0 - inl1Var.d) / inl1Var.f, 0, inl1Var.e() - 1);
                int i2 = inl1Var.i;
                if (i2 != iP) {
                    if (i2 != iP) {
                        inl1Var.i = iP;
                        inl1Var.h();
                    }
                    ((knl1) ((idd1) this.e).getValue()).b.u0(iP);
                }
                break;
            default:
                u9z u9zVar = (u9z) obj;
                lly llyVar2 = (lly) ((idd1) this.e).getValue();
                idd1 idd1Var = (idd1) obj4;
                QuickActionView quickActionView = (QuickActionView) idd1Var.getValue();
                lky lkyVar = new lky(u9zVar.a, 14, false);
                kky kkyVar = new kky(u9zVar.b);
                if (((s9z) this.c).a) {
                    bjw0 bjw0Var = u9zVar.h;
                    if (bjw0Var instanceof yiw0) {
                        yiw0 yiw0Var = (yiw0) bjw0Var;
                        vjyVar = new vjy(yiw0Var.a, yiw0Var.b);
                    } else if (bjw0Var instanceof ajw0) {
                        vjyVar = xjy.a;
                    } else if (bjw0Var.equals(ziw0.a)) {
                        vjyVar = wjy.a;
                    } else if (!bjw0Var.equals(ziw0.b)) {
                        eg.o();
                    } else {
                        vjyVar = wjy.b;
                    }
                    yjyVar = vjyVar;
                } else {
                    yjyVar = null;
                }
                ujy ujyVar = new ujy(2);
                String str2 = u9zVar.e;
                if (str2 == null) {
                    str2 = "";
                }
                aky akyVar = new aky(new pjy(str2), ujyVar, (njy) null, yjyVar, (rjy) null, 20);
                bky bkyVar = new bky(Collections.singletonList(u9zVar.c), (dky) null);
                ajy bjyVar = u9zVar.f ? ajy.a : new bjy(new yiy());
                wiy wiyVar = new wiy(Html.fromHtml(u9zVar.d, 0).toString());
                mky mkyVar = new mky(quickActionView);
                xj61 xj61Var = new xj61();
                int iOrdinal = u9zVar.i.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        i = 3;
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                eg.o();
                            } else {
                                i = 0;
                            }
                        }
                    } else {
                        i = 2;
                    }
                }
                if (i != 0) {
                    xj61Var.add(new uiy(i));
                }
                llyVar2.a(new cky(lkyVar, akyVar, (fky) null, kkyVar, mkyVar, wiyVar, bkyVar, new piy(cwl1.j(xj61Var)), bjyVar, 7492));
                ((QuickActionView) idd1Var.getValue()).a(new qez0(u9zVar.g));
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return (FrameLayout) this.c;
            case 1:
                ConstraintLayout constraintLayout = a().a;
                constraintLayout.getClass();
                if (Build.VERSION.SDK_INT >= 30) {
                    constraintLayout.setOnApplyWindowInsetsListener(gg7.c);
                } else {
                    ((Window) obj).setSoftInputMode(16);
                }
                AccessibilityManager accessibilityManager = (AccessibilityManager) ((no5) this.c).a.getSystemService("accessibility");
                if (!(accessibilityManager != null ? accessibilityManager.isEnabled() : false)) {
                    constraintLayout.postDelayed(new a6n(this, (byte) 9), 600L);
                }
                return constraintLayout;
            case 2:
                return (View) ((idd1) this.b).getValue();
            case 3:
                return ((knl1) ((idd1) this.e).getValue()).a;
            default:
                return (View) ((idd1) obj).getValue();
        }
    }

    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                ((FrameLayout) this.c).setOnClickListener(new trr(iu30Var, (byte) 22));
                break;
            case 1:
                this.e = iu30Var;
                oxw0 oxw0VarA = a();
                oxw0VarA.e.setOnClickListener(new cvr(oxw0VarA, iu30Var, (byte) 12));
                oxw0VarA.c.setOnEditorActionListener(new jis(oxw0VarA, iu30Var, (byte) 0));
                break;
            case 2:
                ((lly) ((idd1) this.c).getValue()).n(new shs(iu30Var, (byte) 23));
                ((QuickActionView) ((idd1) this.d).getValue()).a = new shs(iu30Var, (byte) 24);
                break;
            case 3:
                this.c = iu30Var;
                break;
            default:
                ((QuickActionView) ((idd1) this.f).getValue()).a = new v2y(iu30Var, (byte) 13);
                ((lly) ((idd1) this.e).getValue()).n(new v2y(iu30Var, (byte) 14));
                break;
        }
    }

    public wyr(gw70 gw70Var, Context context, s9z s9zVar) {
        this.a = (byte) 4;
        this.b = context;
        this.c = s9zVar;
        this.d = new idd1(new pdy(this, (byte) 10));
        this.e = new idd1(new l3z(this, gw70Var, (byte) 0));
        this.f = new idd1(new l3z(this, gw70Var, (byte) 1));
    }

    public wyr(Context context, gw70 gw70Var, ywf1 ywf1Var) {
        this.a = (byte) 2;
        this.b = new idd1(new ots(this, (byte) 5));
        this.c = new idd1(new f98(context, gw70Var, (byte) 3));
        idd1 idd1Var = new idd1(new f98(context, gw70Var, (byte) 4));
        this.d = idd1Var;
        LinearLayout linearLayout = new LinearLayout(getView().getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView((QuickActionView) idd1Var.getValue());
        this.e = linearLayout;
        dtw dtwVarD = null;
        if (ywf1Var instanceof xwf1) {
            tka0 tka0Var = dtw.C;
            dtwVarD = mhc.d(getView().getContext(), linearLayout, f6o1.A(((xwf1) ywf1Var).a, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
        }
        this.f = dtwVarD;
        if (dtwVarD != null) {
            linearLayout.addView(dtwVarD.w, 0);
        }
    }

    public wyr(Context context, gw70 gw70Var) {
        this.a = (byte) 0;
        this.b = gw70Var;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131624631, (ViewGroup) null);
        this.c = frameLayout;
        this.d = (FacePileView) frameLayout.findViewById(2131428817);
        ImageView imageView = (ImageView) frameLayout.findViewById(2131430563);
        this.e = frameLayout.findViewById(2131427848);
        this.f = context.getDrawable(2131233847);
        g4b1 g4b1Var = new g4b1(context, j4b1.F5, too1.m(context, 2131166769));
        g4b1Var.c(x74.E(context, 2131102446));
        imageView.setImageDrawable(g4b1Var);
    }

    public wyr(Context context, no5 no5Var, Window window) {
        this.a = (byte) 1;
        this.b = context;
        this.c = no5Var;
        this.d = window;
        this.f = new idd1(new dor(this, (byte) 22));
    }
}
