package p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.share.ShareButton;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.liveevents.uiusecases.multiavatar.MultiArtistAvatarView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zmr implements qzh {
    public final r4u N0;
    public final String O0;
    public final int P0;
    public final Drawable Q0;
    public final int R0;
    public final Typeface S0;
    public final Typeface T0;
    public int U0;
    public boolean V0;
    public llm W0;
    public iu30 X;
    public xab1 X0;
    public vu30 Y;
    public List Y0;
    public final f47 Z;
    public int Z0;
    public final Context a;
    public ArtworkView a1;
    public final boolean b;
    public ArtworkView b1;
    public final mo2 c;
    public xik c1;
    public final h72 d;
    public final e93 e;
    public final s24 f;
    public final MultiArtistAvatarView g;
    public final MultiArtistAvatarView h;
    public final kil i;
    public iu30 t;

    public zmr(Context context, gw70 gw70Var, boolean z) {
        mo2 mo2Var = new mo2(context, (byte) 5);
        this.a = context;
        this.b = z;
        this.c = mo2Var;
        h72 h72VarG = h72.G(LayoutInflater.from(context));
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72VarG.b;
        h360.h(h72VarG);
        this.d = h72VarG;
        ConstraintLayout constraintLayoutF = h360.f(h72VarG, 2131624454);
        int i = 2131427476;
        ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutF, 2131427476);
        if (viewStub != null) {
            int i2 = 2131427611;
            ArtworkView artworkViewT = m5n1.t(constraintLayoutF, 2131427611);
            if (artworkViewT != null) {
                i2 = 2131427617;
                Space space = (Space) m5n1.t(constraintLayoutF, 2131427617);
                if (space != null) {
                    i2 = 2131427619;
                    MultiArtistAvatarView multiArtistAvatarView = (MultiArtistAvatarView) m5n1.t(constraintLayoutF, 2131427619);
                    if (multiArtistAvatarView != null) {
                        i2 = 2131427691;
                        if (m5n1.t(constraintLayoutF, 2131427691) != null) {
                            i2 = 2131427693;
                            if (m5n1.t(constraintLayoutF, 2131427693) != null) {
                                i2 = 2131427876;
                                CalendarIconView calendarIconView = (CalendarIconView) m5n1.t(constraintLayoutF, 2131427876);
                                if (calendarIconView != null) {
                                    i2 = 2131428159;
                                    ComposeView composeViewT = m5n1.t(constraintLayoutF, 2131428159);
                                    if (composeViewT != null) {
                                        i2 = 2131428210;
                                        Space space2 = (Space) m5n1.t(constraintLayoutF, 2131428210);
                                        if (space2 != null) {
                                            i2 = 2131428224;
                                            Space space3 = (Space) m5n1.t(constraintLayoutF, 2131428224);
                                            if (space3 != null) {
                                                i2 = 2131428391;
                                                TextView textView = (TextView) m5n1.t(constraintLayoutF, 2131428391);
                                                if (textView != null) {
                                                    i2 = 2131429064;
                                                    if (m5n1.t(constraintLayoutF, 2131429064) != null) {
                                                        i2 = 2131429069;
                                                        if (m5n1.t(constraintLayoutF, 2131429069) != null) {
                                                            i2 = 2131429111;
                                                            ArtworkView artworkViewT2 = m5n1.t(constraintLayoutF, 2131429111);
                                                            if (artworkViewT2 != null) {
                                                                i2 = 2131429112;
                                                                ArtworkView artworkViewT3 = m5n1.t(constraintLayoutF, 2131429112);
                                                                if (artworkViewT3 != null) {
                                                                    i2 = 2131429113;
                                                                    CalendarIconView calendarIconView2 = (CalendarIconView) m5n1.t(constraintLayoutF, 2131429113);
                                                                    if (calendarIconView2 != null) {
                                                                        i2 = 2131429114;
                                                                        View viewT = m5n1.t(constraintLayoutF, 2131429114);
                                                                        if (viewT != null) {
                                                                            i2 = 2131429115;
                                                                            TextView textView2 = (TextView) m5n1.t(constraintLayoutF, 2131429115);
                                                                            if (textView2 != null) {
                                                                                i2 = 2131429116;
                                                                                TextView textView3 = (TextView) m5n1.t(constraintLayoutF, 2131429116);
                                                                                if (textView3 != null) {
                                                                                    i2 = 2131429777;
                                                                                    TextView textView4 = (TextView) m5n1.t(constraintLayoutF, 2131429777);
                                                                                    if (textView4 != null) {
                                                                                        i2 = 2131430252;
                                                                                        View viewT2 = m5n1.t(constraintLayoutF, 2131430252);
                                                                                        if (viewT2 != null) {
                                                                                            i2 = 2131430464;
                                                                                            TextView textView5 = (TextView) m5n1.t(constraintLayoutF, 2131430464);
                                                                                            if (textView5 != null) {
                                                                                                i2 = 2131431356;
                                                                                                TextView textView6 = (TextView) m5n1.t(constraintLayoutF, 2131431356);
                                                                                                if (textView6 != null) {
                                                                                                    i2 = 2131431567;
                                                                                                    TextView textView7 = (TextView) m5n1.t(constraintLayoutF, 2131431567);
                                                                                                    if (textView7 != null) {
                                                                                                        ConstraintLayout constraintLayout = constraintLayoutF;
                                                                                                        this.e = new e93(constraintLayout, viewStub, artworkViewT, space, multiArtistAvatarView, calendarIconView, composeViewT, space2, space3, textView, artworkViewT2, artworkViewT3, calendarIconView2, viewT, textView2, textView3, textView4, viewT2, textView5, textView6, textView7, (byte) 2);
                                                                                                        viewStub.setLayoutResource(2131624453);
                                                                                                        ConstraintLayout constraintLayoutInflate = viewStub.inflate();
                                                                                                        int i3 = 2131427522;
                                                                                                        EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131427522);
                                                                                                        if (encoreButtonT != null) {
                                                                                                            i3 = 2131427599;
                                                                                                            ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutInflate, 2131427599);
                                                                                                            if (constraintLayoutT != null) {
                                                                                                                i3 = 2131427600;
                                                                                                                MultiArtistAvatarView multiArtistAvatarView2 = (MultiArtistAvatarView) m5n1.t(constraintLayoutInflate, 2131427600);
                                                                                                                if (multiArtistAvatarView2 != null) {
                                                                                                                    i3 = 2131427601;
                                                                                                                    TextView textView8 = (TextView) m5n1.t(constraintLayoutInflate, 2131427601);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i3 = 2131427692;
                                                                                                                        if (m5n1.t(constraintLayoutInflate, 2131427692) != null) {
                                                                                                                            i3 = 2131427694;
                                                                                                                            if (m5n1.t(constraintLayoutInflate, 2131427694) != null) {
                                                                                                                                i3 = 2131428234;
                                                                                                                                ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutInflate, 2131428234);
                                                                                                                                if (contextMenuButtonT != null) {
                                                                                                                                    i3 = 2131428338;
                                                                                                                                    Space space4 = (Space) m5n1.t(constraintLayoutInflate, 2131428338);
                                                                                                                                    if (space4 != null) {
                                                                                                                                        i3 = 2131429047;
                                                                                                                                        if (m5n1.t(constraintLayoutInflate, 2131429047) != null) {
                                                                                                                                            i3 = 2131429049;
                                                                                                                                            Guideline guidelineT = m5n1.t(constraintLayoutInflate, 2131429049);
                                                                                                                                            if (guidelineT != null) {
                                                                                                                                                i3 = 2131429050;
                                                                                                                                                Guideline guidelineT2 = m5n1.t(constraintLayoutInflate, 2131429050);
                                                                                                                                                if (guidelineT2 != null) {
                                                                                                                                                    i3 = 2131429656;
                                                                                                                                                    EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131429656);
                                                                                                                                                    if (encoreButtonT2 != null) {
                                                                                                                                                        i3 = 2131429657;
                                                                                                                                                        AddToButtonView addToButtonViewT = m5n1.t(constraintLayoutInflate, 2131429657);
                                                                                                                                                        if (addToButtonViewT != null) {
                                                                                                                                                            i3 = 2131430735;
                                                                                                                                                            EncoreButton encoreButtonT3 = m5n1.t(constraintLayoutInflate, 2131430735);
                                                                                                                                                            if (encoreButtonT3 != null) {
                                                                                                                                                                i3 = 2131430742;
                                                                                                                                                                AddToButtonView addToButtonViewT2 = m5n1.t(constraintLayoutInflate, 2131430742);
                                                                                                                                                                if (addToButtonViewT2 != null) {
                                                                                                                                                                    i3 = 2131430938;
                                                                                                                                                                    ShareButton shareButtonT = m5n1.t(constraintLayoutInflate, 2131430938);
                                                                                                                                                                    if (shareButtonT != null) {
                                                                                                                                                                        ConstraintLayout constraintLayout2 = constraintLayoutInflate;
                                                                                                                                                                        s24 s24Var = new s24(constraintLayout2, encoreButtonT, constraintLayoutT, multiArtistAvatarView2, textView8, contextMenuButtonT, space4, guidelineT, guidelineT2, encoreButtonT2, addToButtonViewT, encoreButtonT3, addToButtonViewT2, shareButtonT);
                                                                                                                                                                        constraintLayout2.setId(2131427476);
                                                                                                                                                                        this.f = s24Var;
                                                                                                                                                                        this.g = multiArtistAvatarView;
                                                                                                                                                                        this.h = multiArtistAvatarView2;
                                                                                                                                                                        kil kilVar = new kil();
                                                                                                                                                                        kilVar.f(constraintLayout);
                                                                                                                                                                        this.i = kilVar;
                                                                                                                                                                        this.t = r5r.Y0;
                                                                                                                                                                        this.X = r5r.X0;
                                                                                                                                                                        this.Y = ido.V0;
                                                                                                                                                                        f47 f47Var = new f47(gw70Var);
                                                                                                                                                                        this.Z = f47Var;
                                                                                                                                                                        this.N0 = r4u.c(new r4u[]{r4u.a(new efr(this, (byte) 3)), r4u.d(new anr(smr.b, (byte) 0), r4u.a(new tzo(this, (byte) 6))), r4u.a(new ogr(this, (byte) 2)), r4u.d(mm10.b1, r4u.a(new n4b(this, (byte) 29))), r4u.d(new anr(tmr.b, (byte) 0), r4u.a(new a0m(this, (byte) 13))), r4u.a(new wcr(this, (byte) 4)), r4u.a(new sun(this, (byte) 6)), r4u.a(new her(this, (byte) 2)), r4u.a(new rjn(this, (byte) 10)), r4u.a(new vun(this, (byte) 8)), r4u.a(new qmr(this, (byte) 0)), r4u.d(e4y.W0, r4u.a(new rmr(this, (byte) 0)))});
                                                                                                                                                                        this.O0 = context.getResources().getString(2131956529);
                                                                                                                                                                        this.P0 = behaviorRetainingAppBarLayout.getContext().getColor(2131101370);
                                                                                                                                                                        this.Q0 = constraintLayout.getBackground();
                                                                                                                                                                        this.R0 = constraintLayout.getPaddingTop();
                                                                                                                                                                        Typeface typefaceB = qx21.b(context, 2131296262);
                                                                                                                                                                        this.S0 = typefaceB == null ? Typeface.DEFAULT_BOLD : typefaceB;
                                                                                                                                                                        Typeface typefaceB2 = qx21.b(context, 2131296277);
                                                                                                                                                                        this.T0 = typefaceB2 == null ? Typeface.DEFAULT_BOLD : typefaceB2;
                                                                                                                                                                        this.Y0 = z6x.a;
                                                                                                                                                                        this.a1 = artworkViewT2;
                                                                                                                                                                        this.b1 = artworkViewT3;
                                                                                                                                                                        h360.i(h72VarG, new ptj(1, this, zmr.class, "applyContentWindowInsetTop", "applyContentWindowInsetTop(I)V", 0, (byte) 21));
                                                                                                                                                                        h360.a(h72VarG, constraintLayout, textView6);
                                                                                                                                                                        Drawable icon = encoreButtonT.getIcon();
                                                                                                                                                                        if (icon != null) {
                                                                                                                                                                            int iB = b(6);
                                                                                                                                                                            encoreButtonT.setIcon(new InsetDrawable(icon, iB, 0, -iB, 0));
                                                                                                                                                                        }
                                                                                                                                                                        artworkViewT.setViewContext(f47Var);
                                                                                                                                                                        artworkViewT2.setViewContext(f47Var);
                                                                                                                                                                        artworkViewT3.setViewContext(f47Var);
                                                                                                                                                                        behaviorRetainingAppBarLayout.addOnAttachStateChangeListener(new y22(this, (byte) 6));
                                                                                                                                                                        constraintLayout.addOnLayoutChangeListener(new pmr(this, (byte) 0));
                                                                                                                                                                        behaviorRetainingAppBarLayout.a(new rzg(this, (byte) 5));
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
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i3)));
                                                                                                        throw null;
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
            i = i2;
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutF.getResources().getResourceName(i)));
        throw null;
    }

    public static void k(ArtworkView artworkView, String str) {
        artworkView.h(new x07(new g07(str, new zz6(0.0f)), false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public final xk6 a(xik xikVar) {
        ArrayList arrayList;
        String strY0;
        boolean z = xikVar.q;
        List list = xikVar.i;
        if (z) {
            if (list.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str = (String) obj;
                    String str2 = (String) o7h.t0(i, xikVar.h);
                    String str3 = (String) o7h.t0(i, xikVar.k);
                    kik kikVar = (ihc1.y0(str) || str2 == null || ihc1.y0(str2) || str3 == null || ihc1.y0(str3)) ? null : new kik(str, str2, str3);
                    if (kikVar != null) {
                        arrayList2.add(kikVar);
                    }
                    i = i2;
                }
                if (arrayList2.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList != null) {
                String strY1 = o7h.y0(arrayList, ", ", (String) null, (String) null, r5r.V0, 30);
                int size = arrayList.size();
                if (size == 1) {
                    strY0 = ((kik) o7h.q0(arrayList)).a;
                } else if (size != 2) {
                    String str4 = ((kik) o7h.q0(arrayList)).a;
                    int size2 = arrayList.size() - 1;
                    strY0 = xcg1.i(str4, " ", this.a.getResources().getQuantityString(2131820575, size2, Integer.valueOf(size2)));
                } else {
                    strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, r5r.W0, 30);
                }
                return new xk6(strY1, strY0, arrayList);
            }
        }
        return null;
    }

    public final int b(int i) {
        return jch0.U(i * this.a.getResources().getDisplayMetrics().density);
    }

    public final void e(boolean z) {
        Context context = this.a;
        int iB = z ? b(16) : context.getResources().getDimensionPixelSize(2131166116);
        int iB2 = z ? b(16) : context.getResources().getDimensionPixelSize(2131166112);
        s24 s24Var = this.f;
        Guideline guideline = (Guideline) s24Var.i;
        qhl layoutParams = guideline.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = layoutParams;
        qhlVar.a = iB;
        qhlVar.b = -1;
        qhlVar.c = -1.0f;
        guideline.setLayoutParams(qhlVar);
        Guideline guideline2 = (Guideline) s24Var.h;
        qhl layoutParams2 = guideline2.getLayoutParams();
        if (layoutParams2 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar2 = layoutParams2;
        qhlVar2.a = -1;
        qhlVar2.b = iB2;
        qhlVar2.c = -1.0f;
        guideline2.setLayoutParams(qhlVar2);
        ConstraintLayout constraintLayout = (ConstraintLayout) s24Var.d;
        ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
        if (layoutParams3 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar3 = (qhl) layoutParams3;
        qhlVar3.setMarginStart(z ? 0 : b(12));
        constraintLayout.setLayoutParams(qhlVar3);
    }

    public final void f(Object obj) {
        xik xikVar = (xik) obj;
        this.c1 = xikVar;
        this.N0.e(xikVar);
    }

    public final View getView() {
        return (BehaviorRetainingAppBarLayout) this.d.b;
    }

    public final void l() {
        xab1 xab1Var = this.X0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        llm llmVar = this.W0;
        if (llmVar != null && this.V0 && this.Y0.size() >= 2 && ((Boolean) this.c.invoke()).booleanValue()) {
            ArtworkView artworkView = this.b1;
            List list = this.Y0;
            k(artworkView, (String) list.get((this.Z0 + 1) % list.size()));
            this.a1.setAlpha(1.0f);
            this.a1.setVisibility(0);
            this.b1.setAlpha(0.0f);
            this.b1.setVisibility(0);
            this.X0 = fn31.T(llmVar, (o8n) null, 0, new p1r(this, (lnm) null, (byte) 4), 3);
        }
    }

    public final void n(iu30 iu30Var) {
        ((BackButtonView) this.d.e).n(new m0o(iu30Var, (byte) 24));
        s24 s24Var = this.f;
        ((ShareButton) s24Var.N0).n(new vmr(iu30Var, this, (byte) 0));
        ((EncoreButton) s24Var.c).setOnClickListener(new yer(iu30Var, (byte) 26));
        ((ContextMenuButton) s24Var.f).n(new vmr(iu30Var, this, (byte) 1));
        if (this.b) {
            ((EncoreButton) s24Var.Y).setOnClickListener(new umr(iu30Var, this, (byte) 2));
            ((AddToButtonView) s24Var.Z).n(new vmr(iu30Var, this, (byte) 2));
        } else {
            ((EncoreButton) s24Var.t).setOnClickListener(new umr(iu30Var, this, (byte) 3));
            ((AddToButtonView) s24Var.X).n(new vmr(iu30Var, this, (byte) 3));
        }
        ((ConstraintLayout) s24Var.d).setOnClickListener(new umr(this, iu30Var));
        e93 e93Var = this.e;
        ((TextView) e93Var.R0).setOnClickListener(new umr(iu30Var, this, (byte) 0));
        ((TextView) e93Var.T0).setOnClickListener(new umr(iu30Var, this, (byte) 1));
        this.t = new m0o(iu30Var, (byte) 22);
        this.X = new m0o(iu30Var, (byte) 23);
        this.Y = new v0j(iu30Var, (byte) 20);
    }

    public final void r(boolean z) {
        xab1 xab1Var = this.X0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.X0 = null;
        e93 e93Var = this.e;
        ArtworkView artworkView = (ArtworkView) e93Var.Y;
        ArtworkView artworkView2 = (ArtworkView) e93Var.Y;
        ArtworkView artworkView3 = (ArtworkView) e93Var.Z;
        artworkView.animate().cancel();
        artworkView3.animate().cancel();
        if (z) {
            artworkView2.setAlpha(1.0f);
            artworkView3.setAlpha(0.0f);
            artworkView3.setVisibility(8);
            this.a1 = artworkView2;
            this.b1 = artworkView3;
            this.Z0 = 0;
            if (this.Y0.isEmpty()) {
                return;
            }
            k(artworkView2, (String) o7h.q0(this.Y0));
        }
    }

    public final int s(int i) {
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public final void t() {
        s24 s24Var = this.f;
        Guideline guideline = (Guideline) s24Var.h;
        EncoreButton encoreButton = (EncoreButton) s24Var.c;
        TextView textView = (TextView) s24Var.e;
        ConstraintLayout constraintLayout = (ConstraintLayout) s24Var.d;
        int left = guideline.getLeft() - ((Guideline) s24Var.i).getLeft();
        if (left <= 0) {
            return;
        }
        qhl layoutParams = constraintLayout.getLayoutParams();
        qhl layoutParams2 = textView.getLayoutParams();
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add((Space) s24Var.g);
        if (encoreButton.getVisibility() == 0) {
            smc0VarN.add(encoreButton);
        }
        smc0VarN.add((ShareButton) s24Var.N0);
        smc0VarN.add((ContextMenuButton) s24Var.f);
        rmc0 rmc0VarListIterator = k4p1.k(smc0VarN).listIterator(0);
        int marginEnd = 0;
        while (true) {
            rmc0 rmc0Var = rmc0VarListIterator;
            if (!rmc0Var.hasNext()) {
                break;
            }
            qhl layoutParams3 = ((View) rmc0Var.next()).getLayoutParams();
            marginEnd += layoutParams3.getMarginEnd() + layoutParams3.getMarginStart() + ((ViewGroup.MarginLayoutParams) layoutParams3).width;
        }
        int marginStart = ((left - layoutParams.getMarginStart()) - marginEnd) - (constraintLayout.getPaddingEnd() + (layoutParams2.getMarginStart() + (constraintLayout.getPaddingStart() + this.h.getLayoutParams().width)));
        textView.setMaxWidth(marginStart >= 0 ? marginStart : 0);
    }

    public final void u() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.e.b;
        boolean z = this.V0;
        int i = this.R0;
        if (!z) {
            i += this.U0;
        }
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), i, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
    }

    public final void v(wik wikVar) {
        int iU;
        int iB;
        e93 e93Var = this.e;
        ConstraintLayout constraintLayout = (ConstraintLayout) e93Var.b;
        View view = (View) e93Var.O0;
        ArtworkView artworkView = (ArtworkView) e93Var.Y;
        int width = constraintLayout.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        Context context = this.a;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : context.getResources().getDisplayMetrics().widthPixels;
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.screenWidthDp >= 600) {
            iU = jch0.U((iIntValue * 0.75f) / 1.7777778f);
            int iU2 = jch0.U(configuration.screenHeightDp * context.getResources().getDisplayMetrics().density * 0.5f);
            if (iU > iU2) {
                iU = iU2;
            }
        } else {
            iU = jch0.U(iIntValue / 1.13f);
        }
        if (artworkView.getLayoutParams().height != iU) {
            ViewGroup.LayoutParams layoutParams = artworkView.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            } else {
                qhl qhlVar = (qhl) layoutParams;
                ((ViewGroup.MarginLayoutParams) qhlVar).height = iU;
                artworkView.setLayoutParams(qhlVar);
            }
        }
        int iC = l1d.C(wikVar.e);
        if (iC == 0) {
            iB = b(134);
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            iB = b(164);
        }
        if (view.getLayoutParams().height != iB) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            qhl qhlVar2 = (qhl) layoutParams2;
            ((ViewGroup.MarginLayoutParams) qhlVar2).height = iB;
            view.setLayoutParams(qhlVar2);
        }
    }

    public final void w(String str) {
        e93 e93Var = this.e;
        TextView textView = (TextView) e93Var.Q0;
        TextView textView2 = (TextView) e93Var.Q0;
        int width = textView.getWidth();
        if (width <= 0) {
            textView2.setMaxLines(1);
            return;
        }
        TextPaint textPaint = new TextPaint(textView2.getPaint());
        textPaint.setTextSize(TypedValue.applyDimension(2, 24.0f, this.a.getResources().getDisplayMetrics()));
        textPaint.setTypeface(textView2.getTypeface());
        textView2.setMaxLines(textPaint.measureText(str) > ((float) width) ? 2 : 1);
    }
}
