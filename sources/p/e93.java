package p;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.endless.sessionstarter.EndlessActivity;
import com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e93 implements dl4 {
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final Object R0;
    public final Object S0;
    public final Object T0;
    public final Object U0;
    public final Object V0;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public e93(udv udvVar, ryj ryjVar, vdv vdvVar) {
        this.a = (byte) 3;
        this.b = vdvVar;
        this.c = udvVar;
        this.d = iy81.a(new lbp(this, 3, (byte) 3));
        this.e = xqu.b(new lbp(this, 5, (byte) 3));
        this.f = xqu.b(new lbp(this, 4, (byte) 3));
        this.g = iy81.a(new lbp(this, 2, (byte) 3));
        this.h = xqu.b(new lbp(this, 6, (byte) 3));
        this.i = xqu.b(new lbp(this, 7, (byte) 3));
        this.t = xqu.b(new lbp(this, 1, (byte) 3));
        this.X = iy81.a(new lbp(this, 9, (byte) 3));
        this.Y = iy81.a(new lbp(this, 10, (byte) 3));
        this.Z = iy81.a(new lbp(this, 12, (byte) 3));
        this.N0 = iy81.a(new lbp(this, 11, (byte) 3));
        this.O0 = iy81.a(new lbp(this, 14, (byte) 3));
        this.P0 = iy81.a(new lbp(this, 15, (byte) 3));
        this.Q0 = iy81.a(new lbp(this, 13, (byte) 3));
        this.R0 = iy81.a(new lbp(this, 8, (byte) 3));
        this.S0 = iy81.a(new lbp(this, 17, (byte) 3));
        this.T0 = iy81.a(new lbp(this, 16, (byte) 3));
        this.U0 = iy81.a(new lbp(this, 0, (byte) 3));
        this.V0 = xqu.b(new lbp(this, 18, (byte) 3));
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017b A[PHI: r1
      0x017b: PHI (r1v2 int) = 
      (r1v1 int)
      (r1v4 int)
      (r1v5 int)
      (r1v6 int)
      (r1v7 int)
      (r1v8 int)
      (r1v9 int)
      (r1v10 int)
      (r1v11 int)
      (r1v12 int)
      (r1v13 int)
      (r1v14 int)
      (r1v15 int)
      (r1v16 int)
      (r1v17 int)
      (r1v18 int)
      (r1v19 int)
      (r1v20 int)
      (r1v21 int)
     binds: [B:3:0x0017, B:5:0x0023, B:7:0x002c, B:9:0x0039, B:11:0x0044, B:13:0x0053, B:15:0x005f, B:17:0x006a, B:19:0x0076, B:21:0x007f, B:23:0x0088, B:25:0x0093, B:27:0x009e, B:29:0x00aa, B:31:0x00b3, B:33:0x00c0, B:35:0x00cd, B:37:0x00da, B:39:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    public static e93 b(LayoutInflater layoutInflater) {
        e93 e93Var;
        int i;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624429, (ViewGroup) null, false);
        int i2 = 2131427889;
        EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131427889);
        if (encoreButtonT != null) {
            i2 = 2131428103;
            EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131428103);
            if (encoreButtonT2 != null) {
                i2 = 2131428135;
                View viewT = m5n1.t(constraintLayoutInflate, 2131428135);
                if (viewT != null) {
                    jgh jghVarA = jgh.a(viewT);
                    i2 = 2131428140;
                    View viewT2 = m5n1.t(constraintLayoutInflate, 2131428140);
                    if (viewT2 != null) {
                        i2 = 2131428141;
                        if (((ImageView) m5n1.t(constraintLayoutInflate, 2131428141)) != null) {
                            ConstraintLayout constraintLayout = constraintLayoutInflate;
                            i2 = 2131428143;
                            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428143);
                            if (textView != null) {
                                i2 = 2131428216;
                                Group groupT = m5n1.t(constraintLayoutInflate, 2131428216);
                                if (groupT != null) {
                                    i2 = 2131428647;
                                    if (m5n1.t(constraintLayoutInflate, 2131428647) != null) {
                                        i2 = 2131428700;
                                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131428700);
                                        if (textView2 != null) {
                                            i2 = 2131429087;
                                            View viewT3 = m5n1.t(constraintLayoutInflate, 2131429087);
                                            if (viewT3 != null) {
                                                i2 = 2131429088;
                                                View viewT4 = m5n1.t(constraintLayoutInflate, 2131429088);
                                                if (viewT4 != null) {
                                                    i2 = 2131429097;
                                                    if (m5n1.t(constraintLayoutInflate, 2131429097) != null) {
                                                        i2 = 2131429098;
                                                        if (m5n1.t(constraintLayoutInflate, 2131429098) != null) {
                                                            i2 = 2131429649;
                                                            TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131429649);
                                                            if (textView3 != null) {
                                                                i2 = 2131429650;
                                                                View viewT5 = m5n1.t(constraintLayoutInflate, 2131429650);
                                                                if (viewT5 != null) {
                                                                    i2 = 2131429832;
                                                                    ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131429832);
                                                                    if (composeViewT != null) {
                                                                        i2 = 2131430144;
                                                                        TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131430144);
                                                                        if (textView4 != null) {
                                                                            i2 = 2131430287;
                                                                            TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate, 2131430287);
                                                                            if (textView5 != null) {
                                                                                i2 = 2131430535;
                                                                                ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutInflate, 2131430535);
                                                                                if (constraintLayoutT != null) {
                                                                                    ComposeView composeViewT2 = m5n1.t(constraintLayoutT, 2131430533);
                                                                                    if (composeViewT2 != null) {
                                                                                        e93Var = null;
                                                                                        View viewT6 = m5n1.t(constraintLayoutT, 2131430534);
                                                                                        if (viewT6 != null) {
                                                                                            cce cceVar = new cce(constraintLayoutT, composeViewT2, viewT6, (byte) 22);
                                                                                            i2 = 2131430611;
                                                                                            RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131430611);
                                                                                            if (recyclerViewT != null) {
                                                                                                i2 = 2131430652;
                                                                                                Group groupT2 = m5n1.t(constraintLayoutInflate, 2131430652);
                                                                                                if (groupT2 != null) {
                                                                                                    i2 = 2131430653;
                                                                                                    TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate, 2131430653);
                                                                                                    if (textView6 != null) {
                                                                                                        i2 = 2131430965;
                                                                                                        EncoreButton encoreButtonT3 = m5n1.t(constraintLayoutInflate, 2131430965);
                                                                                                        if (encoreButtonT3 != null) {
                                                                                                            i2 = 2131431013;
                                                                                                            CoordinatorLayout coordinatorLayoutT = m5n1.t(constraintLayoutInflate, 2131431013);
                                                                                                            if (coordinatorLayoutT != null) {
                                                                                                                i2 = 2131431070;
                                                                                                                if (m5n1.t(constraintLayoutInflate, 2131431070) != null) {
                                                                                                                    return new e93(constraintLayout, encoreButtonT, encoreButtonT2, jghVarA, viewT2, textView, groupT, textView2, viewT3, viewT4, textView3, viewT5, composeViewT, textView4, textView5, cceVar, recyclerViewT, groupT2, textView6, encoreButtonT3, coordinatorLayoutT, (byte) 1);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i = 2131430534;
                                                                                        }
                                                                                    } else {
                                                                                        e93Var = null;
                                                                                        i = 2131430533;
                                                                                    }
                                                                                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutT.getResources().getResourceName(i)));
                                                                                    return e93Var;
                                                                                }
                                                                                e93Var = null;
                                                                            } else {
                                                                                e93Var = null;
                                                                            }
                                                                        } else {
                                                                            e93Var = null;
                                                                        }
                                                                    } else {
                                                                        e93Var = null;
                                                                    }
                                                                } else {
                                                                    e93Var = null;
                                                                }
                                                            } else {
                                                                e93Var = null;
                                                            }
                                                        } else {
                                                            e93Var = null;
                                                        }
                                                    } else {
                                                        e93Var = null;
                                                    }
                                                } else {
                                                    e93Var = null;
                                                }
                                            } else {
                                                e93Var = null;
                                            }
                                        } else {
                                            e93Var = null;
                                        }
                                    } else {
                                        e93Var = null;
                                    }
                                } else {
                                    e93Var = null;
                                }
                            } else {
                                e93Var = null;
                            }
                        } else {
                            e93Var = null;
                        }
                    } else {
                        e93Var = null;
                    }
                } else {
                    e93Var = null;
                }
            } else {
                e93Var = null;
            }
        } else {
            e93Var = null;
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        return e93Var;
    }

    public xfx a() {
        xrv0 xrv0Var = (xrv0) this.b;
        Context context = (Context) xrv0Var.o.get();
        c8o.l(context);
        gw70 gw70Var = (gw70) xrv0Var.y.get();
        c8o.l(gw70Var);
        luk lukVar = (luk) xrv0Var.p.get();
        c8o.l(lukVar);
        new im4(false, lukVar);
        return new xfx(context, gw70Var, new sua((byte) 9));
    }

    public kvv0 c() {
        dma1 dma1VarA = ((xrv0) this.b).a();
        c8o.l(dma1VarA);
        kvv0 kvv0VarValueOf = kvv0.d;
        try {
            String strF = dma1VarA.f(qrv0.b);
            if (strF != null && strF.length() != 0) {
                kvv0VarValueOf = kvv0.valueOf(strF);
            }
        } catch (IllegalArgumentException unused) {
            kvv0 kvv0Var = kvv0.d;
        } catch (NoSuchElementException unused2) {
            kvv0 kvv0Var2 = kvv0.d;
        }
        c8o.m(kvv0VarValueOf);
        return kvv0VarValueOf;
    }

    public hp20 d() {
        xrv0 xrv0Var = (xrv0) this.b;
        Activity activity = (Activity) xrv0Var.n.get();
        c8o.l(activity);
        swv0 swv0Var = (swv0) xrv0Var.v.get();
        c8o.l(swv0Var);
        lzn0 lzn0Var = (lzn0) xrv0Var.g.get();
        c8o.l(lzn0Var);
        return new hp20(activity, swv0Var, lzn0Var);
    }

    public hp91 e() {
        i8h1 i8h1Var = (i8h1) ((daq) this.c).A5.get();
        String str = ((FandomCollectiblesStoryActivity) this.b).getViewUri().a;
        c8o.m(str);
        return new hp91(i8h1Var, new txk0(j310.b(), str, (byte) 15), (byte) 18);
    }

    public void w(Object obj) {
        switch (this.a) {
            case 5:
                EndlessActivity endlessActivity = (EndlessActivity) obj;
                daq daqVar = (daq) this.c;
                ((t3b1) endlessActivity).b1 = (jgu) daqVar.a.g0.get();
                ((t3b1) endlessActivity).c1 = new tuk(xqu.a((s2q) this.f));
                endlessActivity.j1 = (a2k) ((jly0) this.Z).get();
                zeu0 zeu0Var = (zeu0) daqVar.C6.get();
                EndlessActivity endlessActivity2 = (EndlessActivity) this.b;
                endlessActivity.g1 = new c4c0(new q3c0(zeu0Var, new yzu(new ozx(endlessActivity2, (byte) 1), xqu.a((s2q) this.P0), xqu.a((s2q) this.T0), endlessActivity2), ((edp) daqVar.wl.get()).a(((cyp) ((jly0) this.U0).get()).d()), (o241) daqVar.u4.get(), (op31) daqVar.Z6.get(), (p5y) daqVar.w9.get(), new lmw(endlessActivity2, (byte) 2), new o5y((Context) daqVar.x1.a, endlessActivity2, (ut71) daqVar.g2.get()), (yqg) daqVar.J1.get(), new q6r((yqg) daqVar.J1.get()), (b1y) daqVar.xl.get(), new zzx((xrc0) ((kly0) ((fdp) daqVar.u9.get()).a.a).get()), (q8n) daqVar.r2.get()), (zwz0) daqVar.U1.get());
                endlessActivity.k1 = (b7r0) daqVar.p7.get();
                endlessActivity.h1 = new k4c0();
                endlessActivity.i1 = new n4c0(xqu.a((s2q) this.V0), endlessActivity2, new x390(endlessActivity2, (i8h1) daqVar.A5.get()), new ozx(endlessActivity2, (byte) 1), new h21(xqu.a((s2q) this.Y), (byte) 27));
                break;
            default:
                FandomCollectiblesStoryActivity fandomCollectiblesStoryActivity = (FandomCollectiblesStoryActivity) obj;
                ((t3b1) fandomCollectiblesStoryActivity).b1 = (jgu) ((s2q) this.e).get();
                ((t3b1) fandomCollectiblesStoryActivity).c1 = new tuk(xqu.a((s2q) this.h));
                fandomCollectiblesStoryActivity.f1 = (a2k) ((jly0) this.N0).get();
                break;
        }
    }

    public e93(i2x0 i2x0Var, kc3 kc3Var, dx0 dx0Var, zwp zwpVar, pvu pvuVar, ze81 ze81Var, fd3 fd3Var, ycm ycmVar, azo azoVar, d771 d771Var, bzo bzoVar, czo czoVar, jc3 jc3Var, nu nuVar, rt01 rt01Var, kb3 kb3Var, ryo ryoVar, g23 g23Var, syo syoVar, bv40 bv40Var, ug3 ug3Var, rt01 rt01Var2, et90 et90Var) {
        this.a = (byte) 0;
        this.b = kc3Var;
        this.c = dx0Var;
        this.d = zwpVar;
        this.e = pvuVar;
        this.f = ze81Var;
        this.g = fd3Var;
        this.h = ycmVar;
        this.i = azoVar;
        this.t = d771Var;
        this.X = bzoVar;
        this.Y = jc3Var;
        this.Z = nuVar;
        this.N0 = rt01Var;
        this.O0 = kb3Var;
        this.P0 = ryoVar;
        this.Q0 = g23Var;
        this.R0 = syoVar;
        this.S0 = bv40Var;
        this.T0 = ug3Var;
        this.U0 = rt01Var2;
        this.V0 = et90Var;
    }

    public /* synthetic */ e93(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
        this.X = obj10;
        this.Y = obj11;
        this.Z = obj12;
        this.N0 = obj13;
        this.O0 = obj14;
        this.P0 = obj15;
        this.Q0 = obj16;
        this.R0 = obj17;
        this.S0 = obj18;
        this.T0 = obj19;
        this.U0 = obj20;
        this.V0 = obj21;
    }

    public e93(xrv0 xrv0Var, bsv0 bsv0Var, q7r0 q7r0Var) {
        this.a = (byte) 4;
        this.b = xrv0Var;
        this.c = bsv0Var;
        this.d = q7r0Var;
        this.e = xqu.b(new ywp(this, 1, (byte) 19));
        this.f = xqu.b(new ywp(this, 0, (byte) 19));
        this.g = new ywp(this, 3, (byte) 19);
        this.h = new ywp(this, 5, (byte) 19);
        this.i = new ywp(this, 6, (byte) 19);
        this.t = iy81.a(new ywp(this, 4, (byte) 19));
        this.X = iy81.a(new ywp(this, 7, (byte) 19));
        this.Y = iy81.a(new ywp(this, 9, (byte) 19));
        this.Z = iy81.a(new ywp(this, 10, (byte) 19));
        this.N0 = iy81.a(new ywp(this, 11, (byte) 19));
        this.O0 = iy81.a(new ywp(this, 12, (byte) 19));
        this.P0 = iy81.a(new ywp(this, 13, (byte) 19));
        this.Q0 = iy81.a(new ywp(this, 14, (byte) 19));
        this.R0 = iy81.a(new ywp(this, 15, (byte) 19));
        this.S0 = iy81.a(new ywp(this, 16, (byte) 19));
        this.T0 = iy81.a(new ywp(this, 17, (byte) 19));
        this.U0 = iy81.a(new ywp(this, 8, (byte) 19));
        this.V0 = iy81.a(new ywp(this, 2, (byte) 19));
    }

    public e93(daq daqVar, FandomCollectiblesStoryActivity fandomCollectiblesStoryActivity) {
        this.a = (byte) 6;
        this.c = daqVar;
        this.b = fandomCollectiblesStoryActivity;
        this.d = new s2q(daqVar, this, 1, (byte) 2);
        this.e = new s2q(daqVar, this, 0, (byte) 2);
        this.f = xqu.b(new s2q(daqVar, this, 4, (byte) 2));
        this.g = xqu.b(new s2q(daqVar, this, 3, (byte) 2));
        this.h = new s2q(daqVar, this, 2, (byte) 2);
        this.i = new s2q(daqVar, this, 6, (byte) 2);
        this.t = new s2q(daqVar, this, 8, (byte) 2);
        this.X = new s2q(daqVar, this, 7, (byte) 2);
        this.Y = new s2q(daqVar, this, 9, (byte) 2);
        this.Z = new s2q(daqVar, this, 10, (byte) 2);
        this.N0 = xqu.b(new s2q(daqVar, this, 5, (byte) 2));
        this.O0 = iy81.a(new s2q(daqVar, this, 11, (byte) 2));
        this.P0 = xqu.b(new s2q(daqVar, this, 15, (byte) 2));
        this.Q0 = xqu.b(new s2q(daqVar, this, 14, (byte) 2));
        this.R0 = new s2q(daqVar, this, 13, (byte) 2);
        this.S0 = xqu.b(new s2q(daqVar, this, 12, (byte) 2));
        this.T0 = iy81.a(new s2q(daqVar, this, 16, (byte) 2));
        this.U0 = xqu.b(new s2q(daqVar, this, 18, (byte) 2));
        this.V0 = new s2q(daqVar, this, 17, (byte) 2);
    }

    public e93(daq daqVar, EndlessActivity endlessActivity) {
        this.a = (byte) 5;
        this.c = daqVar;
        this.b = endlessActivity;
        this.d = xqu.b(new s2q(daqVar, this, 2, (byte) 1));
        this.e = xqu.b(new s2q(daqVar, this, 1, (byte) 1));
        this.f = new s2q(daqVar, this, 0, (byte) 1);
        this.g = new s2q(daqVar, this, 4, (byte) 1);
        this.h = new s2q(daqVar, this, 6, (byte) 1);
        this.i = new s2q(daqVar, this, 5, (byte) 1);
        this.t = new s2q(daqVar, this, 7, (byte) 1);
        this.X = new s2q(daqVar, this, 8, (byte) 1);
        this.Y = new s2q(daqVar, this, 9, (byte) 1);
        this.Z = xqu.b(new s2q(daqVar, this, 3, (byte) 1));
        this.N0 = xqu.b(new s2q(daqVar, this, 12, (byte) 1));
        this.O0 = xqu.b(new s2q(daqVar, this, 11, (byte) 1));
        this.P0 = new s2q(daqVar, this, 10, (byte) 1);
        this.Q0 = xqu.b(new s2q(daqVar, this, 15, (byte) 1));
        this.R0 = xqu.b(new s2q(daqVar, this, 14, (byte) 1));
        this.S0 = new s2q(daqVar, this, 16, (byte) 1);
        this.T0 = new s2q(daqVar, this, 13, (byte) 1);
        this.U0 = xqu.b(new s2q(daqVar, this, 17, (byte) 1));
        this.V0 = new s2q(daqVar, this, 18, (byte) 1);
    }
}
