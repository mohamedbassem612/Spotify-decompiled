package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.mobius.Connection;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.transcript.list.TranscriptListView;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i34 implements isw {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;

    public i34(Context context, ViewGroup viewGroup, d75 d75Var, ffh ffhVar, iu30 iu30Var) {
        this.a = (byte) 1;
        this.e = context;
        this.f = ffhVar;
        this.g = iu30Var;
        RoundedConstraintLayout roundedConstraintLayoutInflate = LayoutInflater.from(context).inflate(2131624425, viewGroup, false);
        int i = 2131427747;
        if (m5n1.t(roundedConstraintLayoutInflate, 2131427747) != null) {
            RoundedConstraintLayout roundedConstraintLayout = roundedConstraintLayoutInflate;
            i = 2131428137;
            EditText editText = (EditText) m5n1.t(roundedConstraintLayoutInflate, 2131428137);
            if (editText != null) {
                i = 2131428139;
                RecyclerView recyclerViewT = m5n1.t(roundedConstraintLayoutInflate, 2131428139);
                if (recyclerViewT != null) {
                    i = 2131428143;
                    if (((TextView) m5n1.t(roundedConstraintLayoutInflate, 2131428143)) != null) {
                        i = 2131428482;
                        if (m5n1.t(roundedConstraintLayoutInflate, 2131428482) != null) {
                            i = 2131428647;
                            if (m5n1.t(roundedConstraintLayoutInflate, 2131428647) != null) {
                                i = 2131429649;
                                TextView textView = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131429649);
                                if (textView != null) {
                                    i = 2131430144;
                                    TextView textView2 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131430144);
                                    if (textView2 != null) {
                                        i = 2131430964;
                                        EncoreButton encoreButtonT = m5n1.t(roundedConstraintLayoutInflate, 2131430964);
                                        if (encoreButtonT != null) {
                                            i = 2131430966;
                                            if (((Space) m5n1.t(roundedConstraintLayoutInflate, 2131430966)) != null) {
                                                i = 2131431070;
                                                if (m5n1.t(roundedConstraintLayoutInflate, 2131431070) != null) {
                                                    i = 2131431448;
                                                    if (m5n1.t(roundedConstraintLayoutInflate, 2131431448) != null) {
                                                        this.b = new kap1(roundedConstraintLayout, editText, recyclerViewT, textView, textView2, encoreButtonT);
                                                        k3s itemAnimator = recyclerViewT.getItemAnimator();
                                                        if (itemAnimator != null) {
                                                            ((zw81) itemAnimator).g = false;
                                                        }
                                                        roundedConstraintLayout.setOnClickListener(new v20(iu30Var, (byte) 17));
                                                        editText.setOnClickListener(new v20(iu30Var, (byte) 18));
                                                        a6o1.t(d75Var.c, new d1c(this, ffhVar, iu30Var, (byte) 21), new lwe(this, (byte) 28));
                                                        textView2.setText(ffhVar.c.b);
                                                        this.d = roundedConstraintLayout;
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(roundedConstraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(Object obj, ysw yswVar) {
        dtw dtwVarB;
        Object obj2;
        View view;
        View view2;
        dtw dtwVarB2;
        View view3;
        View view4;
        View view5;
        byte b = this.a;
        ViewParent parent = null;
        Object obj3 = this.b;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                idd1 idd1Var = (idd1) obj5;
                c34 c34Var = (c34) obj;
                x360 x360VarA = c34Var.a();
                idd1 idd1Var2 = (idd1) obj4;
                FrameLayout frameLayout = (FrameLayout) idd1Var2.getValue();
                frameLayout.removeAllViews();
                if (x360VarA != null) {
                    frameLayout.addView(((sp00) obj3).e(x360VarA, frameLayout).w);
                    frameLayout.setVisibility(0);
                }
                if (c34Var instanceof a34) {
                    RecyclerView recyclerView = (RecyclerView) idd1Var.getValue();
                    List list = ((a34) c34Var).a;
                    recyclerView.setVisibility(list.isEmpty() ? 8 : 0);
                    ((kdn0) this.d).m(list);
                } else if (!(c34Var instanceof b34)) {
                    eg.o();
                } else {
                    ((RecyclerView) idd1Var.getValue()).setVisibility(8);
                    ((FrameLayout) idd1Var2.getValue()).setVisibility(8);
                }
                break;
            case 1:
                bfh bfhVar = (bfh) obj;
                Context context = (Context) this.e;
                kap1 kap1Var = (kap1) obj3;
                TextView textView = (TextView) kap1Var.d;
                EncoreButton encoreButton = (EncoreButton) kap1Var.e;
                GetCommentCardResponse getCommentCardResponse = bfhVar.b;
                int iS = getCommentCardResponse.s();
                tuw tuwVar = tuw.ELIGIBILITY_STATUS_UNRESTRICTED;
                textView.setVisibility((iS == 0 && getCommentCardResponse.q() == tuwVar) ? 0 : 8);
                encoreButton.setText(context.getResources().getString(2131954122, Integer.valueOf(getCommentCardResponse.r())));
                encoreButton.setOnClickListener(new cg1(bfhVar, (iu30) obj4, (byte) 20));
                int iR = getCommentCardResponse.r();
                tuw tuwVar2 = tuw.ELIGIBILITY_STATUS_DISABLED;
                encoreButton.setVisibility((iR <= 0 || getCommentCardResponse.q() == tuwVar2) ? 8 : 0);
                boolean z = getCommentCardResponse.q() != tuw.ELIGIBILITY_STATUS_NEW_USER_ACCOUNT;
                Connection connection = (Connection) this.c;
                if (connection != null) {
                    connection.accept(new qkh(getCommentCardResponse.t(), bfhVar.a, bfhVar.d, z, bfhVar.e));
                }
                tuw tuwVarQ = getCommentCardResponse.q();
                RecyclerView recyclerView2 = (RecyclerView) kap1Var.b;
                TextView textView2 = (TextView) kap1Var.c;
                recyclerView2.setVisibility((getCommentCardResponse.t().isEmpty() || tuwVarQ == tuwVar2) ? 8 : 0);
                ((EditText) kap1Var.a).setVisibility(tuwVarQ == tuwVar ? 0 : 8);
                textView2.setVisibility(tuwVarQ == tuwVar ? 8 : 0);
                textView2.setText(((ffh) obj5).c.a(tuwVarQ));
                textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), textView2.getPaddingRight(), context.getResources().getDimensionPixelSize(efh.a[tuwVarQ.ordinal()] == 1 ? 2131166186 : 2131166187));
                break;
            case 2:
                Context context2 = (Context) obj5;
                axt0 axt0Var = (axt0) obj;
                bxt0 bxt0Var = (bxt0) obj4;
                FrameLayout frameLayout2 = (FrameLayout) obj3;
                Object obj6 = axt0Var.b;
                int iC = l1d.C(axt0Var.a);
                if (iC != 0) {
                    if (iC == 1) {
                        dtwVarB = (dtw) this.d;
                        if (dtwVarB == null) {
                            tka0 tka0Var = dtw.C;
                            dtwVarB = mhc.b(context2, frameLayout2, (wpw) bxt0Var.c.getValue(), obj6, (ipb1) null, 112);
                            View view6 = dtwVarB.w;
                            WeakHashMap weakHashMap = b8k1.a;
                            view6.setId(View.generateViewId());
                            this.d = dtwVarB;
                        }
                        obj2 = obj6;
                    } else if (iC != 2) {
                        eg.o();
                    } else {
                        obj2 = obj6;
                        dtwVarB = null;
                    }
                    break;
                } else {
                    dtwVarB = (dtw) this.e;
                    if (dtwVarB == null) {
                        tka0 tka0Var2 = dtw.C;
                        wpw wpwVar = (wpw) bxt0Var.d.getValue();
                        obj2 = obj6;
                        dtwVarB = mhc.b(context2, frameLayout2, wpwVar, obj2, (ipb1) null, 112);
                        View view7 = dtwVarB.w;
                        WeakHashMap weakHashMap2 = b8k1.a;
                        view7.setId(View.generateViewId());
                        this.e = dtwVarB;
                    } else {
                        obj2 = obj6;
                    }
                }
                if (dtwVarB != null) {
                    dtwVarB.f(obj2);
                }
                if (dtwVarB != null && (view2 = dtwVarB.w) != null) {
                    parent = view2.getParent();
                }
                if (!u890.j(parent, frameLayout2)) {
                    m87.q(frameLayout2);
                    frameLayout2.removeAllViews();
                    if (dtwVarB != null && (view = dtwVarB.w) != null) {
                        frameLayout2.addView(view);
                        break;
                    }
                }
                break;
            case 3:
                Context context3 = (Context) obj5;
                dxt0 dxt0Var = (dxt0) obj;
                jxt0 jxt0Var = (jxt0) obj4;
                FrameLayout frameLayout3 = (FrameLayout) obj3;
                Object obj7 = dxt0Var.b;
                int iOrdinal = dxt0Var.a.ordinal();
                if (iOrdinal == 0) {
                    dtwVarB2 = (dtw) this.e;
                    if (dtwVarB2 == null) {
                        tka0 tka0Var3 = dtw.C;
                        dtwVarB2 = mhc.b(context3, frameLayout3, (wpw) jxt0Var.g.getValue(), obj7, (ipb1) null, 112);
                        View view8 = dtwVarB2.w;
                        WeakHashMap weakHashMap3 = b8k1.a;
                        view8.setId(View.generateViewId());
                        this.e = dtwVarB2;
                    }
                } else if (iOrdinal == 1) {
                    dtwVarB2 = (dtw) this.d;
                    if (dtwVarB2 == null) {
                        tka0 tka0Var4 = dtw.C;
                        dtwVarB2 = mhc.b(context3, frameLayout3, (wpw) jxt0Var.f.getValue(), obj7, (ipb1) null, 112);
                        View view9 = dtwVarB2.w;
                        WeakHashMap weakHashMap4 = b8k1.a;
                        view9.setId(View.generateViewId());
                        this.d = dtwVarB2;
                    }
                } else if (iOrdinal != 2) {
                    eg.o();
                } else {
                    dtwVarB2 = null;
                }
                if (dtwVarB2 != null) {
                    dtwVarB2.f(obj7);
                }
                if (dtwVarB2 != null && (view4 = dtwVarB2.w) != null) {
                    parent = view4.getParent();
                }
                if (!u890.j(parent, frameLayout3)) {
                    m87.q(frameLayout3);
                    frameLayout3.removeAllViews();
                    if (dtwVarB2 != null && (view3 = dtwVarB2.w) != null) {
                        frameLayout3.addView(view3);
                        break;
                    }
                }
                break;
            case 4:
                Context context4 = (Context) obj5;
                x691 x691Var = (x691) obj;
                rt01 rt01Var = (rt01) obj4;
                FrameLayout frameLayout4 = (FrameLayout) obj3;
                boolean z2 = x691Var.b;
                k791 k791Var = x691Var.a;
                if (k791Var instanceof j791) {
                    f791 f791Var = new f791(((j791) k791Var).a, z2);
                    dtw dtwVarB3 = (dtw) this.d;
                    if (dtwVarB3 == null) {
                        tka0 tka0Var5 = dtw.C;
                        dtwVarB3 = mhc.b(context4, frameLayout4, (h791) rt01Var.d, f791Var, (ipb1) null, 112);
                        this.d = dtwVarB3;
                        View view10 = dtwVarB3.w;
                        WeakHashMap weakHashMap5 = b8k1.a;
                        view10.setId(View.generateViewId());
                    }
                    dtwVarB3.f(f791Var);
                    view5 = dtwVarB3.w;
                } else {
                    om51 om51Var = new om51(z2);
                    dtw dtwVarB4 = (dtw) this.c;
                    if (dtwVarB4 == null) {
                        tka0 tka0Var6 = dtw.C;
                        dtwVarB4 = mhc.b(context4, frameLayout4, (qm51) rt01Var.c, om51Var, (ipb1) null, 112);
                        this.c = dtwVarB4;
                        View view11 = dtwVarB4.w;
                        WeakHashMap weakHashMap6 = b8k1.a;
                        view11.setId(View.generateViewId());
                    }
                    dtwVarB4.f(om51Var);
                    view5 = dtwVarB4.w;
                }
                if (!u890.j(view5.getParent(), frameLayout4)) {
                    frameLayout4.removeAllViews();
                    frameLayout4.addView(view5);
                }
                break;
            default:
                ccg1 ccg1Var = (ccg1) obj;
                ((r4u) this.d).e(ccg1Var);
                ((dtw) ((idd1) obj5).getValue()).f(new ccd1(ccg1Var.a, new fgf1((iu30) obj4, (byte) 8)));
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (View) this.e;
            case 1:
                return (RoundedConstraintLayout) this.d;
            case 2:
                return (FrameLayout) this.c;
            case 3:
                return (FrameLayout) this.c;
            case 4:
                return (FrameLayout) this.e;
            default:
                return (View) this.e;
        }
    }

    public i34(Context context, rt01 rt01Var) {
        this.a = (byte) 4;
        this.f = context;
        this.g = rt01Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        this.e = frameLayout;
    }

    public i34(Context context, bxt0 bxt0Var) {
        this.a = (byte) 2;
        this.f = context;
        this.g = bxt0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        this.c = frameLayout;
    }

    public i34(Context context, jxt0 jxt0Var) {
        this.a = (byte) 3;
        this.f = context;
        this.g = jxt0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        this.c = frameLayout;
    }

    public i34(Context context, ViewGroup viewGroup, sma1 sma1Var, gpq gpqVar, iu30 iu30Var) {
        this.a = (byte) 5;
        this.g = iu30Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131626286, viewGroup, false);
        viewInflate.getClass();
        d1u.C(viewInflate);
        this.e = viewInflate;
        rku rkuVar = new rku();
        this.b = rkuVar;
        TranscriptListView transcriptListViewFindViewById = viewInflate.findViewById(2131431507);
        this.c = transcriptListViewFindViewById;
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(2131430573);
        mbg1 mbg1VarA = ((dpq) sma1Var.d).a(transcriptListViewFindViewById);
        hce1 hce1VarA = gpqVar.a(frameLayout, transcriptListViewFindViewById);
        this.f = new idd1(new x0e1(this, sma1Var, (byte) 25));
        this.d = r4u.c(new r4u[]{r4u.d(a2x0.e, r4u.a(new n801(mbg1VarA, (byte) 0))), r4u.d(e2x0.e, r4u.a(new xaz0(this, (byte) 3))), r4u.d(f2x0.e, r4u.a(new vyq0(this, (byte) 27))), r4u.d(h2x0.e, r4u.a(new rpv0(hce1VarA, (byte) 13)))});
        transcriptListViewFindViewById.setVerticalFadingEdgeEnabled(true);
        transcriptListViewFindViewById.setFadingEdgeLength(150);
        rkuVar.b(Observable.merge(transcriptListViewFindViewById.getManualScrollObservable().map(vbx0.U0), transcriptListViewFindViewById.getScrollingObservable().map(new ezb1(transcriptListViewFindViewById, (byte) 12)), transcriptListViewFindViewById.getScrollingObservable().map(u9x0.T0)).subscribe(new a74(iu30Var, (byte) 7)));
        viewInflate.addOnAttachStateChangeListener(new y22(this, (byte) 22));
    }

    public i34(Context context, p5x0 p5x0Var, sp00 sp00Var, ViewGroup viewGroup, bpb1 bpb1Var, gw70 gw70Var, lo60 lo60Var, vgm vgmVar) {
        this.a = (byte) 0;
        this.b = sp00Var;
        this.c = f6o1.A(new yxb0(gw70Var, lo60Var, bpb1Var, vgmVar), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        this.d = new kdn0();
        ne neVar = new ne(3, new h34(this, (byte) 1));
        View viewInflate = LayoutInflater.from(context).inflate(2131624051, viewGroup, false);
        RecyclerView recyclerViewN = b8k1.n(viewInflate, 2131427573);
        recyclerViewN.setItemAnimator((e611) null);
        recyclerViewN.j(new jjs(recyclerViewN.getResources().getDimensionPixelSize(2131165315), (byte) 1));
        int width = viewGroup.getWidth();
        float f = viewInflate.getContext().getResources().getDisplayMetrics().densityDpi / 160.0f;
        int i = (int) (width / (f < 1.0f ? 1.0f : f));
        int i2 = i < 320 ? 2 : (320 > i || i >= 600) ? 8 : 4;
        viewInflate.getContext();
        neVar.f(recyclerViewN, new GridLayoutManager(i2), false);
        this.e = viewInflate;
        this.f = new idd1(new g34(this, (byte) 0));
        this.g = new idd1(new g34(this, (byte) 1));
    }
}
