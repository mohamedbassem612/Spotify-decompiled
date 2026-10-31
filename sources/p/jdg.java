package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.aiplaylist.promptcreation.presentation.PromptCreationHeaderView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.TrackListView;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconX;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.android.ObservableMutableLiveData;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jdg implements f4h1 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final View f;

    /* JADX WARN: Code duplicated, block: B:82:0x02d1 A[PHI: r12
      0x02d1: PHI (r12v3 int) = (r12v2 int), (r12v4 int), (r12v5 int) binds: [B:15:0x0076, B:17:0x0085, B:19:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x02e7 A[PHI: r4
      0x02e7: PHI (r4v2 int) = (r4v1 int), (r4v4 int), (r4v5 int), (r4v6 int), (r4v7 int) binds: [B:3:0x002c, B:5:0x0035, B:7:0x0041, B:9:0x004d, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    public jdg(qkq qkqVar, ViewGroup viewGroup, LayoutInflater layoutInflater, cir0 cir0Var, qux0 qux0Var, rvx0 rvx0Var) throws Throwable {
        Throwable th;
        this.b = cir0Var;
        this.c = qux0Var;
        this.d = rvx0Var;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625467, viewGroup, false);
        int i = 2131427685;
        EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131427685);
        if (encoreTextViewT != null) {
            i = 2131428529;
            View viewT = m5n1.t(constraintLayoutInflate, 2131428529);
            if (viewT != null) {
                i = 2131429102;
                PromptCreationHeaderView promptCreationHeaderViewT = m5n1.t(constraintLayoutInflate, 2131429102);
                if (promptCreationHeaderViewT != null) {
                    i = 2131429969;
                    MessageInputView messageInputViewT = m5n1.t(constraintLayoutInflate, 2131429969);
                    if (messageInputViewT != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        i = 2131430760;
                        ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutInflate, 2131430760);
                        if (constraintLayoutT != null) {
                            RecyclerView recyclerViewT = m5n1.t(constraintLayoutT, 2131427961);
                            if (recyclerViewT == null) {
                                bhn0.i("Missing required view with ID: ".concat(constraintLayoutT.getResources().getResourceName(2131427961)));
                                throw null;
                            }
                            m021 m021Var = new m021(constraintLayoutT, recyclerViewT, (byte) 20);
                            int i2 = 2131430761;
                            View viewT2 = m5n1.t(constraintLayoutInflate, 2131430761);
                            if (viewT2 != null) {
                                y441 y441VarH = y441.h(viewT2);
                                i2 = 2131430762;
                                ViewFlipper viewFlipper = (ViewFlipper) m5n1.t(constraintLayoutInflate, 2131430762);
                                if (viewFlipper != null) {
                                    i2 = 2131430763;
                                    View viewT3 = m5n1.t(constraintLayoutInflate, 2131430763);
                                    if (viewT3 != null) {
                                        th = null;
                                        zgz0 zgz0Var = new zgz0((ProgressBar) viewT3, (byte) 15);
                                        View viewT4 = m5n1.t(constraintLayoutInflate, 2131430764);
                                        if (viewT4 != null) {
                                            int i3 = 2131429063;
                                            if (m5n1.t(viewT4, 2131429063) != null) {
                                                i3 = 2131429070;
                                                if (m5n1.t(viewT4, 2131429070) != null) {
                                                    EncoreButton encoreButtonT = m5n1.t(viewT4, 2131430765);
                                                    if (encoreButtonT == null) {
                                                        i3 = 2131430765;
                                                    } else if (((TextView) m5n1.t(viewT4, 2131430766)) != null) {
                                                        ImageView imageView = (ImageView) m5n1.t(viewT4, 2131430767);
                                                        if (imageView != null) {
                                                            TextView textView = (TextView) m5n1.t(viewT4, 2131430768);
                                                            if (textView == null) {
                                                                i3 = 2131430768;
                                                            } else if (((TextView) m5n1.t(viewT4, 2131430769)) != null) {
                                                                y441 y441Var = new y441((ScrollView) viewT4, encoreButtonT, imageView, textView);
                                                                i = 2131430770;
                                                                ConstraintLayout constraintLayoutT2 = m5n1.t(constraintLayoutInflate, 2131430770);
                                                                if (constraintLayoutT2 != null) {
                                                                    int i4 = 2131427677;
                                                                    if (m5n1.t(constraintLayoutT2, 2131427677) != null) {
                                                                        i4 = 2131431115;
                                                                        EncoreTextView encoreTextViewT2 = m5n1.t(constraintLayoutT2, 2131431115);
                                                                        if (encoreTextViewT2 != null) {
                                                                            i4 = 2131431142;
                                                                            RecyclerView recyclerViewT2 = m5n1.t(constraintLayoutT2, 2131431142);
                                                                            if (recyclerViewT2 != null) {
                                                                                i4 = 2131431143;
                                                                                IconX iconXT = m5n1.t(constraintLayoutT2, 2131431143);
                                                                                if (iconXT != null) {
                                                                                    i4 = 2131431144;
                                                                                    EncoreTextView encoreTextViewT3 = m5n1.t(constraintLayoutT2, 2131431144);
                                                                                    if (encoreTextViewT3 != null) {
                                                                                        ConstraintLayout constraintLayout2 = constraintLayoutT2;
                                                                                        i4 = 2131431356;
                                                                                        EncoreTextView encoreTextViewT4 = m5n1.t(constraintLayoutT2, 2131431356);
                                                                                        if (encoreTextViewT4 != null) {
                                                                                            bjx bjxVar = new bjx(constraintLayout2, encoreTextViewT2, recyclerViewT2, iconXT, encoreTextViewT3, encoreTextViewT4, (byte) 26);
                                                                                            i = 2131430771;
                                                                                            ConstraintLayout constraintLayoutT3 = m5n1.t(constraintLayoutInflate, 2131430771);
                                                                                            if (constraintLayoutT3 != null) {
                                                                                                int i5 = 2131428918;
                                                                                                ShapeableImageView shapeableImageViewT = m5n1.t(constraintLayoutT3, 2131428918);
                                                                                                if (shapeableImageViewT != null) {
                                                                                                    i5 = 2131428919;
                                                                                                    ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutT3, 2131428919);
                                                                                                    if (progressBar != null) {
                                                                                                        i5 = 2131428920;
                                                                                                        SeeMoreTextView seeMoreTextViewT = m5n1.t(constraintLayoutT3, 2131428920);
                                                                                                        if (seeMoreTextViewT != null) {
                                                                                                            ConstraintLayout constraintLayout3 = constraintLayoutT3;
                                                                                                            i5 = 2131431484;
                                                                                                            TrackListView trackListViewT = m5n1.t(constraintLayoutT3, 2131431484);
                                                                                                            if (trackListViewT != null) {
                                                                                                                i5 = 2131431485;
                                                                                                                ConstraintLayout constraintLayoutT4 = m5n1.t(constraintLayoutT3, 2131431485);
                                                                                                                if (constraintLayoutT4 != null) {
                                                                                                                    i5 = 2131431486;
                                                                                                                    View viewT5 = m5n1.t(constraintLayoutT3, 2131431486);
                                                                                                                    if (viewT5 != null) {
                                                                                                                        y441 y441VarH2 = y441.h(viewT5);
                                                                                                                        i5 = 2131431487;
                                                                                                                        ViewFlipper viewFlipper2 = (ViewFlipper) m5n1.t(constraintLayoutT3, 2131431487);
                                                                                                                        if (viewFlipper2 != null) {
                                                                                                                            p1f0 p1f0Var = new p1f0(constraintLayout3, shapeableImageViewT, progressBar, seeMoreTextViewT, trackListViewT, constraintLayoutT4, y441VarH2, viewFlipper2);
                                                                                                                            i = 2131431462;
                                                                                                                            View viewT6 = m5n1.t(constraintLayoutInflate, 2131431462);
                                                                                                                            if (viewT6 != null) {
                                                                                                                                s24 s24Var = new s24(constraintLayout, encoreTextViewT, viewT, promptCreationHeaderViewT, messageInputViewT, m021Var, y441VarH, viewFlipper, zgz0Var, y441Var, bjxVar, p1f0Var, viewT6, (byte) 18);
                                                                                                                                iac0 iac0VarE = cir0Var.e();
                                                                                                                                y11 y11Var = new y11(qux0Var.c, (byte) 20);
                                                                                                                                ezo ezoVar = (ezo) qkqVar.a.c;
                                                                                                                                th30 th30Var = (th30) ((gux0) ezoVar.v).m.get();
                                                                                                                                c8o.l(th30Var);
                                                                                                                                skq skqVar = (skq) ezoVar.d.get();
                                                                                                                                ukq ukqVar = (ukq) ezoVar.f.get();
                                                                                                                                vkq vkqVar = (vkq) ezoVar.g.get();
                                                                                                                                wkq wkqVar = (wkq) ezoVar.i.get();
                                                                                                                                mtx0 mtx0Var = (mtx0) ezoVar.c.get();
                                                                                                                                q6u q6uVar = (q6u) ezoVar.j.get();
                                                                                                                                kiu0 kiu0Var = (kiu0) ((gux0) ezoVar.v).t.get();
                                                                                                                                c8o.l(kiu0Var);
                                                                                                                                this.e = new fvx0(th30Var, skqVar, ukqVar, vkqVar, wkqVar, mtx0Var, q6uVar, kiu0Var, s24Var, iac0VarE, y11Var);
                                                                                                                                cir0Var.j(new pd8(this, (byte) 14));
                                                                                                                                this.f = constraintLayout;
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                bhn0.i("Missing required view with ID: ".concat(constraintLayoutT3.getResources().getResourceName(i5)));
                                                                                                throw null;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutT2.getResources().getResourceName(i4)));
                                                                    throw null;
                                                                }
                                                            } else {
                                                                i3 = 2131430769;
                                                            }
                                                        } else {
                                                            i3 = 2131430767;
                                                        }
                                                    } else {
                                                        i3 = 2131430766;
                                                    }
                                                }
                                            }
                                            bhn0.i("Missing required view with ID: ".concat(viewT4.getResources().getResourceName(i3)));
                                            throw null;
                                        }
                                        i = 2131430764;
                                    } else {
                                        th = null;
                                        i = i2;
                                    }
                                } else {
                                    th = null;
                                    i = i2;
                                }
                            } else {
                                th = null;
                                i = i2;
                            }
                        } else {
                            th = null;
                        }
                    } else {
                        th = null;
                    }
                } else {
                    th = null;
                }
            } else {
                th = null;
            }
        } else {
            th = null;
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw th;
    }

    public final Object getView() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    public final void start() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                cfd cfdVar = (cfd) obj;
                i8h1 i8h1Var = (i8h1) cfdVar.b;
                fjl0 fjl0Var = (fjl0) cfdVar.c;
                x6h1 x6h1VarC = fjl0Var.c.c();
                x6h1VarC.i.add(new a7h1("error_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = fjl0Var.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                break;
            default:
                fvx0 fvx0Var = (fvx0) this.e;
                fvx0Var.X.getClass();
                fvx0Var.g.getClass();
                fvx0Var.h.getClass();
                fvx0Var.i.getClass();
                cqx0 cqx0Var = fvx0Var.t;
                cqx0Var.f.a(cqx0Var.e.map(new rut0(cqx0Var, (byte) 13)).distinctUntilChanged().filter(w1x0.c).takeUntil(cqx0Var.c).subscribe(new lyw0(cqx0Var, (byte) 8)));
                fvx0Var.Y.getClass();
                MobiusLoopViewModel mobiusLoopViewModel = ((qux0) obj).c;
                ObservableMutableLiveData observableMutableLiveData = mobiusLoopViewModel.b;
                cir0 cir0Var = (cir0) this.b;
                observableMutableLiveData.f(cir0Var.e(), new qpj0(this, (byte) 8));
                mobiusLoopViewModel.c.c(cir0Var.e(), new es3((rvx0) this.d, (byte) 5));
                break;
        }
    }

    public final void stop() {
        switch (this.a) {
            case 0:
                break;
            default:
                MobiusLoopViewModel mobiusLoopViewModel = ((qux0) this.c).c;
                mobiusLoopViewModel.b.l(((cir0) this.b).e());
                mobiusLoopViewModel.c.b();
                fvx0 fvx0Var = (fvx0) this.e;
                fvx0Var.X.getClass();
                fvx0Var.g.getClass();
                fvx0Var.h.getClass();
                fvx0Var.i.getClass();
                fvx0Var.t.f.c();
                fvx0Var.Y.getClass();
                break;
        }
    }

    private final void b() {
    }

    public jdg(lzn0 lzn0Var, cfd cfdVar, t8x t8xVar, pzn0 pzn0Var, cir0 cir0Var, Context context, bdg bdgVar) {
        int i;
        int i2;
        int i3;
        this.b = lzn0Var;
        this.c = cfdVar;
        this.d = pzn0Var;
        this.e = bdgVar;
        cir0Var.j(new pd8(this, (byte) 3));
        qzh qzhVarA = t8xVar.a((l0i) null);
        boolean z = bdgVar.c;
        if (z) {
            i = 2131959964;
        } else {
            if (z) {
                eg.o();
                throw null;
            }
            i = 2131959971;
        }
        String string = context.getString(i);
        if (z) {
            i2 = 2131959963;
        } else {
            if (z) {
                eg.o();
                throw null;
            }
            i2 = 2131959970;
        }
        String string2 = context.getString(i2);
        if (z) {
            i3 = 2131959962;
        } else {
            if (z) {
                eg.o();
                throw null;
            }
            i3 = 2131959969;
        }
        fcs fcsVar = (fcs) qzhVarA;
        fcsVar.f(new wku0(string, string2, context.getString(i3)));
        fcsVar.n(new syf(this, (byte) 5));
        this.f = (ConstraintLayout) ((goq) fcsVar.b).g;
    }
}
