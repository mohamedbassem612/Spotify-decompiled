package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.followpeople.FollowPeopleButton;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nwr implements qzh {
    public final /* synthetic */ byte a;
    public iu30 b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public nwr(Context context, gw70 gw70Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625370, (ViewGroup) null, false);
                int i = 2131427460;
                ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutInflate, 2131427460);
                if (viewStub != null) {
                    i = 2131428234;
                    ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutInflate, 2131428234);
                    if (contextMenuButtonT != null) {
                        i = 2131428924;
                        View view = (FollowPeopleButton) m5n1.t(constraintLayoutInflate, 2131428924);
                        if (view != null) {
                            i = 2131430321;
                            View view2 = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131430321);
                            if (view2 != null) {
                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                i = 2131430863;
                                ViewStub viewStub2 = (ViewStub) m5n1.t(constraintLayoutInflate, 2131430863);
                                if (viewStub2 != null) {
                                    i = 2131431132;
                                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431132);
                                    if (textView != null) {
                                        i = 2131431388;
                                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431388);
                                        if (textView2 != null) {
                                            i = 2131431389;
                                            if (m5n1.t(constraintLayoutInflate, 2131431389) != null) {
                                                s880 s880Var = new s880(constraintLayout, viewStub, contextMenuButtonT, view, view2, viewStub2, textView, textView2);
                                                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                                Collections.addAll(v9w0VarQ.d, view2, view);
                                                Collections.addAll(v9w0VarQ.c, textView2, textView);
                                                v9w0VarQ.a();
                                                view2.setViewContext(new f47(gw70Var));
                                                this.c = s880Var;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            default:
                this.c = context;
                this.d = gw70Var;
                View viewInflate = LayoutInflater.from(context).inflate(2131624516, (ViewGroup) null, false);
                int i2 = 2131427511;
                if (m5n1.t(viewInflate, 2131427511) != null) {
                    i2 = 2131427543;
                    TextView textView3 = (TextView) m5n1.t(viewInflate, 2131427543);
                    if (textView3 != null) {
                        i2 = 2131428103;
                        ClearButtonView clearButtonViewT = m5n1.t(viewInflate, 2131428103);
                        if (clearButtonViewT != null) {
                            i2 = 2131428198;
                            ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131428198);
                            if (constraintLayoutT != null) {
                                i2 = 2131428292;
                                EncoreButton encoreButtonT = m5n1.t(viewInflate, 2131428292);
                                if (encoreButtonT != null) {
                                    i2 = 2131429612;
                                    ImageView imageView = (ImageView) m5n1.t(viewInflate, 2131429612);
                                    if (imageView != null) {
                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                        yjq yjqVar = new yjq(frameLayout, textView3, clearButtonViewT, constraintLayoutT, encoreButtonT, imageView);
                                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                        v9w0 v9w0VarP = b2u.p(constraintLayoutT);
                                        Collections.addAll(v9w0VarP.c, textView3);
                                        Collections.addAll(v9w0VarP.d, imageView);
                                        v9w0VarP.a();
                                        this.e = yjqVar;
                                        this.f = new idd1(new dor(this, (byte) 7));
                                        this.g = ido.b1;
                                        this.b = nvr.X;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                throw null;
        }
    }

    public void a(i1x i1xVar) {
        yjq yjqVar = (yjq) this.e;
        ((TextView) yjqVar.d).setText(i1xVar.a);
        FrameLayout frameLayout = (FrameLayout) yjqVar.c;
        boolean z = i1xVar.d;
        frameLayout.setClickable(z);
        EncoreButton encoreButton = (EncoreButton) yjqVar.e;
        encoreButton.setVisibility(!z ? 4 : 0);
        encoreButton.setClickable(z);
        String string = i1xVar.b;
        if (string == null) {
            string = "";
        }
        if (ihc1.y0(string)) {
            string = ((Context) this.c).getString(2131954910);
        }
        encoreButton.setText(string);
        ((ImageView) yjqVar.f).addOnLayoutChangeListener(new x37(this, i1xVar, (byte) 8));
    }

    public final void f(Object obj) {
        l07 j17Var;
        boolean z;
        boolean z2;
        int i;
        TextView textView;
        switch (this.a) {
            case 0:
                a((i1x) obj);
                break;
            default:
                cjs0 cjs0Var = (cjs0) obj;
                s880 s880Var = (s880) this.c;
                TextView textView2 = (TextView) s880Var.a;
                FollowPeopleButton followPeopleButton = (FollowPeopleButton) s880Var.e;
                textView2.setText(cjs0Var.d());
                TextView textView3 = (TextView) s880Var.h;
                String strC = cjs0Var.c();
                textView3.setVisibility((strC == null || strC.length() == 0) ? 8 : 0);
                textView3.setText(cjs0Var.c());
                ArtworkView artworkView = (ArtworkView) s880Var.f;
                boolean z3 = cjs0Var instanceof ajs0;
                if (z3) {
                    j17Var = new l07(new g07(((ajs0) cjs0Var).f), false);
                } else if (!(cjs0Var instanceof bjs0)) {
                    eg.o();
                } else {
                    bjs0 bjs0Var = (bjs0) cjs0Var;
                    j17Var = new j17(bjs0Var.g, bjs0Var.d, new g07(bjs0Var.f));
                }
                artworkView.h(j17Var);
                boolean z4 = cjs0Var instanceof bjs0;
                ((ContextMenuButton) s880Var.d).setVisibility((z4 && ((bjs0) cjs0Var).h) ? 0 : 8);
                bjs0 bjs0Var2 = z4 ? (bjs0) cjs0Var : null;
                bro1 bro1Var = bjs0Var2 != null ? bjs0Var2.i : null;
                bjs0 bjs0Var3 = z4 ? (bjs0) cjs0Var : null;
                bro1 bro1Var2 = bjs0Var3 != null ? bjs0Var3.j : null;
                this.f = bro1Var;
                Integer numX = bro1Var != null ? p8p1.x(bro1Var) : null;
                Button button = (Button) this.d;
                if (numX != null) {
                    if (button != null) {
                        z = true;
                        textView = button;
                    } else {
                        ViewStub viewStub = (ViewStub) s880Var.c;
                        ConstraintLayout parent = viewStub.getParent();
                        z = true;
                        TextView textViewR = sua.r(bro1Var, parent);
                        textViewR.setId(2131427460);
                        qhl qhlVar = new qhl(viewStub.getLayoutParams());
                        ((ViewGroup.MarginLayoutParams) qhlVar).height = -2;
                        textViewR.setLayoutParams(qhlVar);
                        int iIndexOfChild = parent.indexOfChild(viewStub);
                        parent.removeView(viewStub);
                        parent.addView(textViewR, iIndexOfChild);
                        this.d = textViewR;
                        textViewR.setOnClickListener(new nes(this, (byte) 0));
                        textView = textViewR;
                    }
                    textView.setText(numX.intValue());
                    textView.setEnabled(!(bro1Var instanceof vis0));
                    textView.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    qhl qhlVar2 = layoutParams instanceof qhl ? (qhl) layoutParams : null;
                    if (qhlVar2 != null) {
                        vas vasVar = new vas(textView, (byte) 4);
                        if (bro1Var2 != null) {
                            qhlVar2.u = 2131430863;
                            qhlVar2.setMarginEnd(((Number) vasVar.invoke(8)).intValue());
                        } else {
                            qhlVar2.u = 2131428234;
                            qhlVar2.setMarginEnd(((Number) vasVar.invoke(8)).intValue());
                        }
                        textView.setLayoutParams(qhlVar2);
                    }
                } else {
                    z = true;
                    if (button != null) {
                        button.setVisibility(8);
                    }
                }
                this.g = bro1Var2;
                Integer numX2 = bro1Var2 != null ? p8p1.x(bro1Var2) : null;
                Button button2 = (Button) this.e;
                if (numX2 != null) {
                    if (button2 != null) {
                        z2 = z;
                    } else {
                        ViewStub viewStub2 = (ViewStub) s880Var.g;
                        ConstraintLayout parent2 = viewStub2.getParent();
                        Button buttonR = sua.r(bro1Var2, parent2);
                        buttonR.setId(2131430863);
                        qhl qhlVar3 = new qhl(viewStub2.getLayoutParams());
                        ((ViewGroup.MarginLayoutParams) qhlVar3).height = -2;
                        buttonR.setLayoutParams(qhlVar3);
                        int iIndexOfChild2 = parent2.indexOfChild(viewStub2);
                        parent2.removeView(viewStub2);
                        parent2.addView(buttonR, iIndexOfChild2);
                        this.e = buttonR;
                        z2 = z;
                        buttonR.setOnClickListener(new nes(this, z2 ? (byte) 1 : (byte) 0));
                        button2 = buttonR;
                    }
                    button2.setText(numX2.intValue());
                    button2.setEnabled(z2);
                    button2.setVisibility(0);
                    i = 8;
                } else {
                    z2 = z;
                    i = 8;
                    if (button2 != null) {
                        button2.setVisibility(8);
                    }
                }
                boolean z5 = (!cjs0Var.b() || (z3 && !((ajs0) cjs0Var).g)) ? false : z2;
                followPeopleButton.setVisibility(z5 ? 0 : i);
                if (z5) {
                    followPeopleButton.a(new t630(cjs0Var.e(), cjs0Var.d(), cjs0Var.a()));
                }
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (FrameLayout) ((yjq) this.e).c;
            default:
                return (ConstraintLayout) ((s880) this.c).b;
        }
    }

    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                yjq yjqVar = (yjq) this.e;
                z8p1.v((FrameLayout) yjqVar.c, 1000, new m0o(iu30Var, (byte) 27));
                ((ClearButtonView) yjqVar.b).n(new m0o(iu30Var, (byte) 28));
                z8p1.v((EncoreButton) yjqVar.e, 1000, new m0o(iu30Var, (byte) 29));
                this.g = new v0j(iu30Var, (byte) 21);
                this.b = new mwr(iu30Var, (byte) 0);
                break;
            default:
                this.b = iu30Var;
                s880 s880Var = (s880) this.c;
                ConstraintLayout constraintLayout = (ConstraintLayout) s880Var.b;
                constraintLayout.setOnClickListener(new o0s(iu30Var, (byte) 29));
                constraintLayout.setOnLongClickListener(new wer(iu30Var, (byte) 9));
                ((FollowPeopleButton) s880Var.e).n(new mwr(iu30Var, (byte) 18));
                ((ContextMenuButton) s880Var.d).setOnClickListener(new oes(iu30Var, (byte) 0));
                break;
        }
    }
}
