package p;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.icons.IconCheck;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qxx0 extends emc0 {
    public static final kn5 g = new kn5((byte) 22);
    public static final kn5 h = new kn5((byte) 26);
    public final /* synthetic */ byte e = 4;
    public Object f;

    public qxx0(v7l v7lVar) {
        super(new kn5((byte) 12));
        this.f = v7lVar;
    }

    public int g(int i) {
        switch (this.e) {
            case 0:
                m6j0 m6j0Var = (m6j0) A(i);
                if (m6j0Var instanceof h6j0) {
                    return 2131625227;
                }
                if (m6j0Var instanceof l6j0) {
                    return 2131625233;
                }
                if (m6j0Var instanceof j6j0) {
                    return 2131625231;
                }
                if (m6j0Var instanceof k6j0) {
                    return 2131625232;
                }
                if (m6j0Var instanceof i6j0) {
                    return 2131625229;
                }
                eg.o();
                return 0;
            case 4:
                n560 n560Var = (n560) A(i);
                if (!(n560Var instanceof cpa1)) {
                    if (n560Var instanceof jz3) {
                        return 1;
                    }
                    eg.o();
                }
                return 0;
            default:
                return super/*p.z511*/.g(i);
        }
    }

    public final void n(int i, w611 w611Var) {
        switch (this.e) {
            case 0:
                a8j0 a8j0Var = (a8j0) w611Var;
                l6j0 l6j0Var = (m6j0) A(i);
                if (l6j0Var instanceof h6j0) {
                    v7j0 v7j0Var = (v7j0) a8j0Var;
                    w6e0 w6e0Var = v7j0Var.U0;
                    h6j0 h6j0Var = (h6j0) l6j0Var;
                    String str = h6j0Var.b;
                    EncoreTextView encoreTextView = (EncoreTextView) w6e0Var.e;
                    encoreTextView.setText(Html.fromHtml(str, 0), TextView.BufferType.SPANNABLE);
                    encoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
                    ((ProgressBar) w6e0Var.b).setVisibility(h6j0Var.d() == 2 ? 0 : 8);
                    v7j0Var.E(h6j0Var);
                } else if (l6j0Var instanceof l6j0) {
                    z7j0 z7j0Var = (z7j0) a8j0Var;
                    l6j0 l6j0Var2 = l6j0Var;
                    ((EncoreTextView) z7j0Var.U0.d).setText(l6j0Var2.b);
                    z7j0Var.E(l6j0Var2);
                } else if (l6j0Var instanceof j6j0) {
                    ((x7j0) a8j0Var).U0.b.setText(((j6j0) l6j0Var).c);
                } else if (l6j0Var instanceof k6j0) {
                    ((y7j0) a8j0Var).U0.b.setText(((k6j0) l6j0Var).c);
                } else if (!(l6j0Var instanceof i6j0)) {
                    eg.o();
                } else {
                    ((EncoreTextView) ((w7j0) a8j0Var).U0.c).setText(((i6j0) l6j0Var).b);
                }
                break;
            case 1:
                ((ibe1) w611Var).U0.b.setText(((e9e1) A(i)).a);
                break;
            case 2:
                zrj1 zrj1Var = ((uan) w611Var).U0;
                kbn kbnVar = (kbn) A(i);
                ((ConstraintLayout) zrj1Var.b).setOnClickListener(new cg1(this, kbnVar, (byte) 25));
                ((TextView) zrj1Var.d).setText(kbnVar.a.b);
                ((IconCheck) zrj1Var.c).setVisibility(kbnVar.b ? 0 : 8);
                break;
            case 3:
                ((wh20) w611Var).U0.a((jbz) ((emc0) this).d.f.get(i));
                break;
            default:
                n560 n560Var = (n560) A(i);
                if (n560Var instanceof cpa1) {
                    cpa1 cpa1Var = (cpa1) n560Var;
                    hs20 hs20Var = new hs20(this, cpa1Var, (byte) 19);
                    kqm0 kqm0Var = ((p560) w611Var).U0;
                    kqm0Var.c.setText(cpa1Var.c);
                    kqm0Var.b.setText(cpa1Var.b);
                    kqm0Var.a.setOnClickListener(new zfs(hs20Var, (byte) 17));
                } else if (!(n560Var instanceof jz3)) {
                    eg.o();
                } else {
                    jz3 jz3Var = (jz3) n560Var;
                    hs20 hs20Var2 = new hs20(this, jz3Var, (byte) 20);
                    kqm0 kqm0Var2 = ((o560) w611Var).U0;
                    kqm0Var2.c.setText(jz3Var.b);
                    kqm0Var2.b.setText(jz3Var.c);
                    kqm0Var2.a.setOnClickListener(new zfs(hs20Var2, (byte) 16));
                }
                break;
        }
    }

    public void o(w611 w611Var, int i, List list) {
        switch (this.e) {
            case 0:
                a8j0 a8j0Var = (a8j0) w611Var;
                Object objS0 = o7h.s0(list);
                if (objS0 != null) {
                    gxx0 gxx0Var = objS0 instanceof gxx0 ? (gxx0) objS0 : null;
                    if (gxx0Var != null) {
                        ArrayList arrayList = gxx0Var.a;
                        boolean z = a8j0Var instanceof v7j0;
                        kxx0 kxx0Var = kxx0.a;
                        ixx0 ixx0Var = ixx0.a;
                        if (z) {
                            v7j0 v7j0Var = (v7j0) a8j0Var;
                            w6e0 w6e0Var = v7j0Var.U0;
                            h6j0 h6j0Var = (h6j0) A(i);
                            ArrayList<hxx0> arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                if (obj instanceof hxx0) {
                                    arrayList2.add(obj);
                                }
                            }
                            for (hxx0 hxx0Var : arrayList2) {
                                if (u890.j(hxx0Var, ixx0Var)) {
                                    String str = h6j0Var.b;
                                    EncoreTextView encoreTextView = (EncoreTextView) w6e0Var.e;
                                    encoreTextView.setText(Html.fromHtml(str, 0), TextView.BufferType.SPANNABLE);
                                    encoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                } else if (u890.j(hxx0Var, jxx0.a)) {
                                    ((ProgressBar) w6e0Var.b).setVisibility(h6j0Var.d() == 2 ? 0 : 8);
                                } else if (!u890.j(hxx0Var, kxx0Var)) {
                                    eg.o();
                                } else {
                                    v7j0Var.E(h6j0Var);
                                }
                            }
                        } else if (a8j0Var instanceof z7j0) {
                            z7j0 z7j0Var = (z7j0) a8j0Var;
                            l6j0 l6j0Var = (l6j0) A(i);
                            ArrayList<lxx0> arrayList3 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (obj2 instanceof lxx0) {
                                    arrayList3.add(obj2);
                                }
                            }
                            for (lxx0 lxx0Var : arrayList3) {
                                if (u890.j(lxx0Var, ixx0Var)) {
                                    ((EncoreTextView) z7j0Var.U0.d).setText(l6j0Var.b);
                                } else if (!u890.j(lxx0Var, kxx0Var)) {
                                    eg.o();
                                } else {
                                    z7j0Var.E(l6j0Var);
                                }
                            }
                        } else if (a8j0Var instanceof x7j0) {
                            x7j0 x7j0Var = (x7j0) a8j0Var;
                            j6j0 j6j0Var = (j6j0) A(i);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : arrayList) {
                                if (obj3 instanceof ixx0) {
                                    arrayList4.add(obj3);
                                }
                            }
                            Iterator it = arrayList4.iterator();
                            while (it.hasNext()) {
                                if (!u890.j((ixx0) it.next(), ixx0Var)) {
                                    eg.o();
                                } else {
                                    x7j0Var.U0.b.setText(j6j0Var.c);
                                }
                            }
                        } else if (a8j0Var instanceof y7j0) {
                            y7j0 y7j0Var = (y7j0) a8j0Var;
                            k6j0 k6j0Var = (k6j0) A(i);
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj4 : arrayList) {
                                if (obj4 instanceof ixx0) {
                                    arrayList5.add(obj4);
                                }
                            }
                            Iterator it2 = arrayList5.iterator();
                            while (it2.hasNext()) {
                                if (!u890.j((ixx0) it2.next(), ixx0Var)) {
                                    eg.o();
                                } else {
                                    y7j0Var.U0.b.setText(k6j0Var.c);
                                }
                            }
                        } else if (a8j0Var instanceof w7j0) {
                            w7j0 w7j0Var = (w7j0) a8j0Var;
                            i6j0 i6j0Var = (i6j0) A(i);
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj5 : arrayList) {
                                if (obj5 instanceof ixx0) {
                                    arrayList6.add(obj5);
                                }
                            }
                            Iterator it3 = arrayList6.iterator();
                            while (it3.hasNext()) {
                                if (!u890.j((ixx0) it3.next(), ixx0Var)) {
                                    eg.o();
                                } else {
                                    ((EncoreTextView) w7j0Var.U0.c).setText(i6j0Var.b);
                                }
                            }
                        } else {
                            eg.o();
                        }
                    }
                }
                n(i, a8j0Var);
                break;
            default:
                super/*p.z511*/.o(w611Var, i, list);
                break;
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        w611 w7j0Var;
        w611 z7j0Var;
        switch (this.e) {
            case 0:
                hox0 hox0Var = (hox0) this.f;
                ConstraintLayout constraintLayoutL = eqq.l(viewGroup, i, viewGroup, false);
                int i2 = 2131430683;
                if (i == 2131625227) {
                    ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutL, 2131428919);
                    if (progressBar != null) {
                        EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutL, 2131429967);
                        if (encoreTextViewT != null) {
                            EncoreTextView encoreTextViewT2 = m5n1.t(constraintLayoutL, 2131430683);
                            if (encoreTextViewT2 != null) {
                                i2 = 2131431560;
                                if (m5n1.t(constraintLayoutL, 2131431560) != null) {
                                    z7j0Var = new v7j0(new w6e0(constraintLayoutL, progressBar, encoreTextViewT, encoreTextViewT2, (byte) 24), hox0Var);
                                }
                            }
                        } else {
                            i2 = 2131429967;
                        }
                    } else {
                        i2 = 2131428919;
                    }
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(i2)));
                    return null;
                }
                if (i == 2131625233) {
                    EncoreTextView encoreTextViewT3 = m5n1.t(constraintLayoutL, 2131429967);
                    if (encoreTextViewT3 != null) {
                        EncoreTextView encoreTextViewT4 = m5n1.t(constraintLayoutL, 2131430683);
                        if (encoreTextViewT4 != null) {
                            z7j0Var = new z7j0(new kqi0(constraintLayoutL, encoreTextViewT3, encoreTextViewT4, (byte) 3), hox0Var);
                        }
                    } else {
                        i2 = 2131429967;
                    }
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(i2)));
                    return null;
                }
                if (i == 2131625231) {
                    TextView textView = (TextView) m5n1.t(constraintLayoutL, 2131429967);
                    if (textView == null) {
                        bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(2131429967)));
                        return null;
                    }
                    w7j0Var = new x7j0(new wb80(constraintLayoutL, textView));
                } else if (i == 2131625232) {
                    TextView textView2 = (TextView) m5n1.t(constraintLayoutL, 2131429967);
                    if (textView2 == null) {
                        bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(2131429967)));
                        return null;
                    }
                    w7j0Var = new y7j0(new ig3(constraintLayoutL, textView2));
                } else {
                    if (i != 2131625229) {
                        hhg1.n("Invalid view type");
                        return null;
                    }
                    EncoreTextView encoreTextViewT5 = m5n1.t(constraintLayoutL, 2131429967);
                    if (encoreTextViewT5 == null) {
                        bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(2131429967)));
                        return null;
                    }
                    w7j0Var = new w7j0(new j2e0(constraintLayoutL, encoreTextViewT5, (byte) 25));
                }
                return w7j0Var;
                return z7j0Var;
            case 1:
                View viewL = eqq.l(viewGroup, 2131626242, viewGroup, false);
                if (viewL != null) {
                    TextView textView3 = (TextView) viewL;
                    return new ibe1(this, new f9e1(textView3, textView3));
                }
                bhn0.i("rootView");
                return null;
            case 2:
                ConstraintLayout constraintLayoutL2 = eqq.l(viewGroup, 2131626323, viewGroup, false);
                int i3 = 2131427966;
                IconCheck iconCheckT = m5n1.t(constraintLayoutL2, 2131427966);
                if (iconCheckT != null) {
                    i3 = 2131431267;
                    TextView textView4 = (TextView) m5n1.t(constraintLayoutL2, 2131431267);
                    if (textView4 != null) {
                        return new uan(new zrj1(constraintLayoutL2, iconCheckT, textView4, (byte) 6));
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutL2.getResources().getResourceName(i3)));
                return null;
            case 3:
                g2z g2zVar = (g2z) this.f;
                w0d w0dVar = new w0d(new nfx(((xfx) g2zVar.a).c), (rxr) g2zVar.b, ((do4) g2zVar.c).c(), (nlu) ((chp) g2zVar.d).get(), (bf3) g2zVar.e, ((f6g1) g2zVar.f).a());
                LayoutInflater.from(viewGroup.getContext());
                return new wh20(w0dVar.d(), w0dVar);
            default:
                int i4 = 2131428471;
                if (i == 0) {
                    ConstraintLayout constraintLayoutL3 = eqq.l(viewGroup, 2131625477, viewGroup, false);
                    if (m5n1.t(constraintLayoutL3, 2131428469) != null) {
                        TextView textView5 = (TextView) m5n1.t(constraintLayoutL3, 2131428470);
                        if (textView5 != null) {
                            TextView textView6 = (TextView) m5n1.t(constraintLayoutL3, 2131428471);
                            if (textView6 != null) {
                                return new p560(new kqm0(constraintLayoutL3, textView5, textView6));
                            }
                        } else {
                            i4 = 2131428470;
                        }
                    } else {
                        i4 = 2131428469;
                    }
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutL3.getResources().getResourceName(i4)));
                    return null;
                }
                if (i != 1) {
                    hhg1.n(f4i1.c(i, "Unsupported view type: "));
                    return null;
                }
                ConstraintLayout constraintLayoutL4 = eqq.l(viewGroup, 2131625470, viewGroup, false);
                if (m5n1.t(constraintLayoutL4, 2131428469) != null) {
                    TextView textView7 = (TextView) m5n1.t(constraintLayoutL4, 2131428470);
                    if (textView7 != null) {
                        TextView textView8 = (TextView) m5n1.t(constraintLayoutL4, 2131428471);
                        if (textView8 != null) {
                            return new o560(new kqm0(constraintLayoutL4, textView7, textView8));
                        }
                    } else {
                        i4 = 2131428470;
                    }
                } else {
                    i4 = 2131428469;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutL4.getResources().getResourceName(i4)));
                return null;
        }
    }

    public qxx0(kgr kgrVar) {
        super(h);
        this.f = kgrVar;
    }

    public qxx0(g2z g2zVar) {
        super(lmt0.a);
        y(2);
        this.f = g2zVar;
    }

    public qxx0() {
        super(kn5.i);
        this.f = v160.S0;
    }

    public qxx0(hox0 hox0Var) {
        super(g);
        this.f = hox0Var;
    }
}
