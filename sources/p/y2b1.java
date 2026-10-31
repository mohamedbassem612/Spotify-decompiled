package p;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.spotify.checkout.elements.utils.AdditionalInfoView;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutAddressStepLoaded;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutError;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class y2b1 implements rjp0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SpotifyCheckoutActivity b;

    public /* synthetic */ y2b1(SpotifyCheckoutActivity spotifyCheckoutActivity, byte b) {
        this.a = b;
        this.b = spotifyCheckoutActivity;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    public final void b(Object obj) {
        wgk1 ofk1Var;
        boolean z;
        SpannableString spannableString;
        fgk1 fgk1Var;
        xsw0 xsw0Var;
        SpannableString spannableString2;
        String str;
        String str2;
        String str3;
        byte b = this.a;
        dg30 dg30Var = this.b;
        switch (b) {
            case 0:
                nhm0 nhm0Var = (nhm0) obj;
                idd1 idd1Var = dg30Var.a1;
                int i = SpotifyCheckoutActivity.D1;
                try {
                    Set set = ehk1.a;
                    ofk1Var = ehk1.c(dg30Var, ((f3b1) idd1Var.getValue()).Z(), nhm0Var);
                } catch (Throwable th) {
                    n57.t("Invalid BE response", th);
                    yt91 yt91Var = dg30Var.m1;
                    if (yt91Var == null) {
                        u890.C("tracking");
                        throw null;
                    }
                    t2j0 t2j0Var = (t2j0) yt91Var.b;
                    xnc xncVarN = CPHostedCheckoutError.n();
                    xncVarN.n((String) yt91Var.c);
                    xncVarN.q();
                    t2j0Var.a(xncVarN.build());
                    ofk1Var = new ofk1(dg30Var.getString(2131953822), dg30Var.getString(2131953820), new nfk1(dg30Var.getString(2131953821), lfk1.a), null);
                }
                dg30Var.s1 = ofk1Var;
                if (ofk1Var instanceof lgk1) {
                    z = true;
                } else {
                    kgk1 kgk1Var = ofk1Var instanceof kgk1 ? (kgk1) ofk1Var : null;
                    if (kgk1Var == null || !kgk1Var.i) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                ai0 ai0Var = dg30Var.b1;
                if (ai0Var == null) {
                    u890.C("viewBinding");
                    throw null;
                }
                ((FrameLayout) ai0Var.e).setVisibility(z ? 0 : 8);
                kgk1 kgk1Var2 = ofk1Var instanceof kgk1 ? (kgk1) ofk1Var : null;
                vku vkuVar = dg30Var.w1;
                lmw lmwVar = dg30Var.U0;
                ai0 ai0Var2 = dg30Var.b1;
                if (kgk1Var2 != null) {
                    rgk1 rgk1Var = kgk1Var2.h;
                    jgk1 jgk1Var = kgk1Var2.f;
                    xfk1 xfk1Var = kgk1Var2.c;
                    sce sceVar = kgk1Var2.g;
                    fgk1 fgk1Var2 = kgk1Var2.e;
                    wfk1 wfk1Var = kgk1Var2.d;
                    if (ai0Var2 == null) {
                        u890.C("viewBinding");
                        throw null;
                    }
                    ((NestedScrollView) ai0Var2.U0).setVisibility(0);
                    ai0 ai0Var3 = dg30Var.b1;
                    if (ai0Var3 == null) {
                        u890.C("viewBinding");
                        throw null;
                    }
                    ((TextView) ai0Var3.T0).setText(kgk1Var2.a);
                    ai0 ai0Var4 = dg30Var.b1;
                    if (ai0Var4 == null) {
                        u890.C("viewBinding");
                        throw null;
                    }
                    ((TextView) ai0Var4.Y).setVisibility(xfk1Var != null ? 0 : 8);
                    ai0 ai0Var5 = dg30Var.b1;
                    if (ai0Var5 == null) {
                        u890.C("viewBinding");
                        throw null;
                    }
                    TextView textView = (TextView) ai0Var5.Y;
                    if (xfk1Var == null || (str2 = xfk1Var.a) == null) {
                        spannableString = null;
                    } else {
                        spannableString = new SpannableString(str2);
                        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 17);
                    }
                    textView.setText(spannableString);
                    dtw dtwVar = dg30Var.c1;
                    if (dtwVar == null) {
                        u890.C("lineItem");
                        throw null;
                    }
                    dtwVar.f(kgk1Var2.b);
                    ai0 ai0Var6 = dg30Var.b1;
                    if (ai0Var6 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((Group) ai0Var6.g).setVisibility(wfk1Var != null ? 0 : 8);
                    if (wfk1Var != null) {
                        ai0 ai0Var7 = dg30Var.b1;
                        if (ai0Var7 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var7.i).setText(wfk1Var.a);
                        ai0 ai0Var8 = dg30Var.b1;
                        if (ai0Var8 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var8.h).setText(wfk1Var.b);
                        ai30 ai30Var = ((tg30) lmwVar.b).g;
                        ai0 ai0Var9 = dg30Var.b1;
                        if (ai0Var9 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        if (ai30Var.F(((FrameLayout) ai0Var9.b).getId()) == null) {
                            yt91 yt91Var2 = dg30Var.m1;
                            if (yt91Var2 == null) {
                                u890.C("tracking");
                                throw null;
                            }
                            t2j0 t2j0Var2 = (t2j0) yt91Var2.b;
                            pnc pncVarN = CPHostedCheckoutAddressStepLoaded.n();
                            pncVarN.n((String) yt91Var2.c);
                            t2j0Var2.a(pncVarN.build());
                        }
                        if (dg30Var.h1 == null) {
                            u890.C("addressFormFragmentFactory");
                            throw null;
                        }
                        ai30 ai30Var2 = ((tg30) lmwVar.b).g;
                        ai0 ai0Var10 = dg30Var.b1;
                        if (ai0Var10 == null) {
                            u890.C("viewBinding");
                            throw null;
                        }
                        h22 h22VarA = j22.a(ai30Var2, ((FrameLayout) ai0Var10.b).getId(), new m12(2, 1, "checkoutSessionId:".concat(((f3b1) idd1Var.getValue()).Z()), wfk1Var.c), (yf30) null);
                        if (vkuVar.a.i() == 0) {
                            vkuVar.b(new Disposable[]{h22VarA.G1.subscribe(new w2b1(dg30Var, (byte) 4)), h22VarA.H1.subscribe(new w2b1(dg30Var, (byte) 5)), h22VarA.I1.subscribe(new w2b1(dg30Var, (byte) 6))});
                        }
                    }
                    ai0 ai0Var11 = dg30Var.b1;
                    if (ai0Var11 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((TextView) ai0Var11.R0).setText(fgk1Var2 != null ? fgk1Var2.getTitle() : null);
                    if (fgk1Var2 instanceof egk1) {
                        ai0 ai0Var12 = dg30Var.b1;
                        if (ai0Var12 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var12.R0).setVisibility(0);
                        ai0 ai0Var13 = dg30Var.b1;
                        if (ai0Var13 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var13.R0).setAlpha(0.2f);
                        ai0 ai0Var14 = dg30Var.b1;
                        if (ai0Var14 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((LinearLayout) ai0Var14.c1).setVisibility(0);
                        ai0 ai0Var15 = dg30Var.b1;
                        if (ai0Var15 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((FrameLayout) ai0Var15.f).setVisibility(8);
                        ai0 ai0Var16 = dg30Var.b1;
                        if (ai0Var16 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((LinearLayout) ai0Var16.b1).setVisibility(8);
                        dg30Var.q0(null);
                    } else if (fgk1Var2 instanceof zfk1) {
                        ai0 ai0Var17 = dg30Var.b1;
                        if (ai0Var17 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var17.R0).setVisibility(0);
                        ai0 ai0Var18 = dg30Var.b1;
                        if (ai0Var18 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var18.R0).setAlpha(1.0f);
                        ai0 ai0Var19 = dg30Var.b1;
                        if (ai0Var19 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((LinearLayout) ai0Var19.c1).setVisibility(8);
                        ai0 ai0Var20 = dg30Var.b1;
                        if (ai0Var20 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((FrameLayout) ai0Var20.f).setVisibility(0);
                        ai0 ai0Var21 = dg30Var.b1;
                        if (ai0Var21 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((LinearLayout) ai0Var21.b1).setVisibility(8);
                        dg30Var.q0(((zfk1) fgk1Var2).b);
                    } else if (fgk1Var2 instanceof dgk1) {
                        ai0 ai0Var22 = dg30Var.b1;
                        if (ai0Var22 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var22.R0).setVisibility(0);
                        ai0 ai0Var23 = dg30Var.b1;
                        if (ai0Var23 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var23.R0).setAlpha(1.0f);
                        ai0 ai0Var24 = dg30Var.b1;
                        if (ai0Var24 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((LinearLayout) ai0Var24.c1).setVisibility(8);
                        ai0 ai0Var25 = dg30Var.b1;
                        if (ai0Var25 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((FrameLayout) ai0Var25.f).setVisibility(8);
                        ai0 ai0Var26 = dg30Var.b1;
                        if (ai0Var26 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((LinearLayout) ai0Var26.b1).setVisibility(0);
                        dgk1 dgk1Var = (dgk1) fgk1Var2;
                        gw70 gw70Var = dg30Var.j1;
                        if (gw70Var == null) {
                            u890.C("imageLoader");
                            throw null;
                        }
                        kq70 kq70Var = dgk1Var.b;
                        String str4 = dgk1Var.d;
                        ixg ixgVarF = gw70Var.f(kq70Var.a);
                        ixgVarF.h();
                        ai0 ai0Var27 = dg30Var.b1;
                        if (ai0Var27 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ixgVarF.k((ShapeableImageView) ai0Var27.e1, (ird1) null);
                        ai0 ai0Var28 = dg30Var.b1;
                        if (ai0Var28 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var28.O0).setText(dgk1Var.c);
                        ai0 ai0Var29 = dg30Var.b1;
                        if (ai0Var29 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var29.N0).setText(str4);
                        ai0 ai0Var30 = dg30Var.b1;
                        if (ai0Var30 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var30.N0).setVisibility(str4 != null ? 0 : 8);
                        ai0 ai0Var31 = dg30Var.b1;
                        if (ai0Var31 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var31.Z).setText(dgk1Var.e.getLabel());
                        ai0 ai0Var32 = dg30Var.b1;
                        if (ai0Var32 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var32.Z).setOnClickListener(new wa21(dg30Var, dgk1Var, (byte) 16));
                        dg30Var.t1.j(dgk1Var.f);
                        dg30Var.u1.j(dgk1Var.g);
                        dg30Var.q0(null);
                    } else {
                        if (fgk1Var2 != null) {
                            eg.o();
                            return;
                        }
                        ai0 ai0Var33 = dg30Var.b1;
                        if (ai0Var33 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var33.R0).setVisibility(8);
                        ai0 ai0Var34 = dg30Var.b1;
                        if (ai0Var34 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((LinearLayout) ai0Var34.c1).setVisibility(8);
                        ai0 ai0Var35 = dg30Var.b1;
                        if (ai0Var35 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((FrameLayout) ai0Var35.f).setVisibility(8);
                        ai0 ai0Var36 = dg30Var.b1;
                        if (ai0Var36 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((LinearLayout) ai0Var36.b1).setVisibility(8);
                        dg30Var.q0(null);
                    }
                    if (jgk1Var instanceof ggk1) {
                        ai0 ai0Var37 = dg30Var.b1;
                        if (ai0Var37 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((TextView) ai0Var37.S0).setText(((ggk1) jgk1Var).a);
                        ai0 ai0Var38 = dg30Var.b1;
                        if (ai0Var38 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((LinearLayout) ai0Var38.d1).setVisibility(0);
                        fgk1Var = fgk1Var2;
                        wfk1Var = wfk1Var;
                    } else if (jgk1Var instanceof igk1) {
                        ai0 ai0Var39 = dg30Var.b1;
                        if (ai0Var39 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((LinearLayout) ai0Var39.d1).setVisibility(8);
                        ks6 ks6Var = dg30Var.v1;
                        if (ks6Var == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        ((Group) ks6Var.h).setVisibility(0);
                        ks6 ks6Var2 = dg30Var.v1;
                        if (ks6Var2 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        ((TextView) ks6Var2.N0).setVisibility(0);
                        ks6 ks6Var3 = dg30Var.v1;
                        if (ks6Var3 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        CardView cardView = (CardView) ks6Var3.g;
                        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                        if (layoutParams == null) {
                            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = dg30Var.getResources().getDimensionPixelOffset(2131165897);
                        cardView.setLayoutParams(marginLayoutParams);
                        ks6 ks6Var4 = dg30Var.v1;
                        if (ks6Var4 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        TextView textView2 = (TextView) ks6Var4.N0;
                        igk1 igk1Var = (igk1) jgk1Var;
                        String str5 = igk1Var.h;
                        List list = igk1Var.e;
                        pqe1 pqe1Var = igk1Var.c;
                        yfk1 yfk1Var = igk1Var.b;
                        fgk1Var = fgk1Var2;
                        textView2.setText(igk1Var.a);
                        ks6 ks6Var5 = dg30Var.v1;
                        if (ks6Var5 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        TextView textView3 = (TextView) ks6Var5.Z;
                        String str6 = yfk1Var.a;
                        String str7 = yfk1Var.e;
                        textView3.setText(str6);
                        ks6 ks6Var6 = dg30Var.v1;
                        if (ks6Var6 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        ((TextView) ks6Var6.t).setText(yfk1Var.c);
                        ks6 ks6Var7 = dg30Var.v1;
                        if (ks6Var7 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        ((TextView) ks6Var7.X).setText(yfk1Var.d);
                        ks6 ks6Var8 = dg30Var.v1;
                        if (ks6Var8 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        ((TextView) ks6Var8.Y).setVisibility(str7 != null ? 0 : 8);
                        if (str7 != null) {
                            ks6 ks6Var9 = dg30Var.v1;
                            if (ks6Var9 == null) {
                                u890.C("summaryBinding");
                                throw null;
                            }
                            ((TextView) ks6Var9.Y).setText(str7);
                        }
                        gw70 gw70Var2 = dg30Var.j1;
                        if (gw70Var2 == null) {
                            u890.C("imageLoader");
                            throw null;
                        }
                        ixg ixgVarF2 = gw70Var2.f(yfk1Var.b.a);
                        ixgVarF2.h();
                        ks6 ks6Var10 = dg30Var.v1;
                        if (ks6Var10 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        ixgVarF2.k((ShapeableImageView) ks6Var10.i, (ird1) null);
                        ks6 ks6Var11 = dg30Var.v1;
                        if (ks6Var11 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        ((RecyclerView) ks6Var11.O0).setVisibility(pqe1Var != null ? 0 : 8);
                        ks6 ks6Var12 = dg30Var.v1;
                        if (ks6Var12 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        RecyclerView recyclerView = (RecyclerView) ks6Var12.O0;
                        if (pqe1Var instanceof fqe1) {
                            xsw0Var = new xsw0(((fqe1) pqe1Var).a, (byte) 2);
                        } else if (pqe1Var instanceof nqe1) {
                            xsw0Var = new xsw0(((nqe1) pqe1Var).a, (byte) 3);
                        } else {
                            if (pqe1Var != null) {
                                eg.o();
                                return;
                            }
                            xsw0Var = null;
                        }
                        recyclerView.setAdapter(xsw0Var);
                        ks6 ks6Var13 = dg30Var.v1;
                        if (ks6Var13 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        ((AdditionalInfoView) ks6Var13.b).setVisibility(!list.isEmpty() ? 0 : 8);
                        ks6 ks6Var14 = dg30Var.v1;
                        if (ks6Var14 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        ((AdditionalInfoView) ks6Var14.b).setInfo(list);
                        ks6 ks6Var15 = dg30Var.v1;
                        if (ks6Var15 == null) {
                            u890.C("summaryBinding");
                            throw null;
                        }
                        vfk1 vfk1Var = igk1Var.d;
                        Group group = (Group) ks6Var15.e;
                        TextView textView4 = (TextView) ks6Var15.c;
                        group.setVisibility(vfk1Var != null ? 0 : 8);
                        if (vfk1Var != null) {
                            String str8 = vfk1Var.b;
                            ((TextView) ks6Var15.f).setText(vfk1Var.a);
                            SpannableString spannableString3 = new SpannableString(xcg1.i(str8, " ", vfk1Var.c));
                            spannableString3.setSpan(new TextAppearanceSpan(textView4.getContext(), 2132018007), 0, str8.length(), 33);
                            spannableString3.setSpan(new TextAppearanceSpan(textView4.getContext(), 2132018006), str8.length() + 1, spannableString3.length(), 33);
                            TypedValue typedValue = new TypedValue();
                            dg30Var.getTheme().resolveAttribute(2130970440, typedValue, true);
                            spannableString3.setSpan(new ForegroundColorSpan(typedValue.data), str8.length() + 1, spannableString3.length(), 33);
                            textView4.setText(spannableString3);
                            ((TextView) ks6Var15.d).setText(vfk1Var.d);
                        }
                        ks6 ks6Var16 = dg30Var.v1;
                        if (ks6Var16 == null) {
                            u890.C((String) r11);
                            throw null;
                        }
                        TextView textView5 = (TextView) ks6Var16.Q0;
                        ViewGroup.LayoutParams layoutParams2 = textView5.getLayoutParams();
                        if (layoutParams2 == null) {
                            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = dg30Var.getResources().getDimensionPixelOffset(2131165897);
                        textView5.setLayoutParams(marginLayoutParams2);
                        ks6 ks6Var17 = dg30Var.v1;
                        if (ks6Var17 == null) {
                            u890.C((String) r11);
                            throw null;
                        }
                        ((TextView) ks6Var17.Q0).setText(igk1Var.f);
                        ks6 ks6Var18 = dg30Var.v1;
                        if (ks6Var18 == null) {
                            u890.C((String) r11);
                            throw null;
                        }
                        ((TextView) ks6Var18.R0).setText(igk1Var.g);
                        ks6 ks6Var19 = dg30Var.v1;
                        if (ks6Var19 == null) {
                            u890.C((String) r11);
                            throw null;
                        }
                        ((TextView) ks6Var19.S0).setVisibility(str5 != null ? 0 : 8);
                        if (str5 != null) {
                            ks6 ks6Var20 = dg30Var.v1;
                            if (ks6Var20 == null) {
                                u890.C("summaryBinding");
                                throw null;
                            }
                            ((TextView) ks6Var20.S0).setText(" ".concat(str5));
                        }
                    } else {
                        fgk1Var = fgk1Var2;
                        wfk1Var = wfk1Var;
                        if (jgk1Var instanceof hgk1) {
                            ai0 ai0Var40 = dg30Var.b1;
                            if (ai0Var40 == null) {
                                u890.C(str3);
                                throw null;
                            }
                            ((LinearLayout) ai0Var40.d1).setVisibility(8);
                            ks6 ks6Var21 = dg30Var.v1;
                            if (ks6Var21 == null) {
                                u890.C("summaryBinding");
                                throw null;
                            }
                            ((Group) ks6Var21.h).setVisibility(8);
                            ks6 ks6Var22 = dg30Var.v1;
                            if (ks6Var22 == null) {
                                u890.C("summaryBinding");
                                throw null;
                            }
                            ((TextView) ks6Var22.N0).setVisibility(8);
                            ks6 ks6Var23 = dg30Var.v1;
                            if (ks6Var23 == null) {
                                u890.C("summaryBinding");
                                throw null;
                            }
                            CardView cardView2 = (CardView) ks6Var23.g;
                            ViewGroup.LayoutParams layoutParams3 = cardView2.getLayoutParams();
                            if (layoutParams3 == null) {
                                bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                return;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                            marginLayoutParams3.topMargin = 0;
                            cardView2.setLayoutParams(marginLayoutParams3);
                            ks6 ks6Var24 = dg30Var.v1;
                            if (ks6Var24 == null) {
                                u890.C("summaryBinding");
                                throw null;
                            }
                            TextView textView6 = (TextView) ks6Var24.Q0;
                            ViewGroup.LayoutParams layoutParams4 = textView6.getLayoutParams();
                            if (layoutParams4 == null) {
                                bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                return;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                            marginLayoutParams4.topMargin = 0;
                            textView6.setLayoutParams(marginLayoutParams4);
                            ks6 ks6Var25 = dg30Var.v1;
                            if (ks6Var25 == null) {
                                u890.C("summaryBinding");
                                throw null;
                            }
                            TextView textView7 = (TextView) ks6Var25.Q0;
                            hgk1 hgk1Var = (hgk1) jgk1Var;
                            String str9 = hgk1Var.c;
                            textView7.setText(hgk1Var.a);
                            ks6 ks6Var26 = dg30Var.v1;
                            if (ks6Var26 == null) {
                                u890.C("summaryBinding");
                                throw null;
                            }
                            ((TextView) ks6Var26.R0).setText(hgk1Var.b);
                            ks6 ks6Var27 = dg30Var.v1;
                            if (ks6Var27 == null) {
                                u890.C("summaryBinding");
                                throw null;
                            }
                            ((TextView) ks6Var27.S0).setVisibility(str9 != null ? 0 : 8);
                            if (str9 != null) {
                                ks6 ks6Var28 = dg30Var.v1;
                                if (ks6Var28 == null) {
                                    u890.C("summaryBinding");
                                    throw null;
                                }
                                ((TextView) ks6Var28.S0).setText(" ".concat(str9));
                            }
                        } else {
                            if (jgk1Var != null) {
                                eg.o();
                                return;
                            }
                            ai0 ai0Var41 = dg30Var.b1;
                            if (ai0Var41 == null) {
                                u890.C(str3);
                                throw null;
                            }
                            ((LinearLayout) ai0Var41.d1).setVisibility(8);
                        }
                    }
                    ai0 ai0Var42 = dg30Var.b1;
                    if (ai0Var42 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((TextView) ai0Var42.X).setVisibility(sceVar != null ? 0 : 8);
                    ai0 ai0Var43 = dg30Var.b1;
                    if (ai0Var43 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((TextView) ai0Var43.X).setText(sceVar != null ? sceVar.a : null);
                    ai0 ai0Var44 = dg30Var.b1;
                    if (ai0Var44 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((TextView) ai0Var44.t).setVisibility(sceVar != null ? 0 : 8);
                    ai0 ai0Var45 = dg30Var.b1;
                    if (ai0Var45 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    TextView textView8 = (TextView) ai0Var45.t;
                    if (sceVar == null || (str = sceVar.b) == null) {
                        spannableString2 = null;
                    } else {
                        spannableString2 = new SpannableString(str);
                        spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 17);
                    }
                    textView8.setText(spannableString2);
                    ai0 ai0Var46 = dg30Var.b1;
                    if (ai0Var46 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    for (View view : p7h.M(new View[]{(EncoreButton) ai0Var46.j1, (EncoreButton) ai0Var46.k1, (View) ai0Var46.V0})) {
                        view.getClass();
                        view.setVisibility(rgk1Var != null ? 0 : 8);
                    }
                    if (rgk1Var != null) {
                        String str10 = rgk1Var.b;
                        if (wfk1Var == null && fgk1Var == null) {
                            ai0 ai0Var47 = dg30Var.b1;
                            if (ai0Var47 == null) {
                                u890.C(str3);
                                throw null;
                            }
                            ((View) ai0Var47.V0).setVisibility(8);
                        }
                        ai0 ai0Var48 = dg30Var.b1;
                        if (ai0Var48 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((EncoreButton) ai0Var48.j1).setText(rgk1Var.a);
                        ai0 ai0Var49 = dg30Var.b1;
                        if (ai0Var49 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((EncoreButton) ai0Var49.j1).setOnClickListener(new z2b1(dg30Var, (byte) 3));
                        ai0 ai0Var50 = dg30Var.b1;
                        if (ai0Var50 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((EncoreButton) ai0Var50.k1).setVisibility(str10 != null ? 0 : 8);
                        ai0 ai0Var51 = dg30Var.b1;
                        if (ai0Var51 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((EncoreButton) ai0Var51.k1).setText(str10);
                        ai0 ai0Var52 = dg30Var.b1;
                        if (ai0Var52 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((EncoreButton) ai0Var52.k1).setOnClickListener(new z2b1(dg30Var, (byte) 4));
                    }
                } else {
                    if (ai0Var2 == null) {
                        u890.C("viewBinding");
                        throw null;
                    }
                    ((NestedScrollView) ai0Var2.U0).setVisibility(8);
                    ai30 ai30Var3 = ((tg30) lmwVar.b).g;
                    ai0 ai0Var53 = dg30Var.b1;
                    if (ai0Var53 == null) {
                        u890.C("viewBinding");
                        throw null;
                    }
                    zf30 zf30VarF = ai30Var3.F(((FrameLayout) ai0Var53.b).getId());
                    if (zf30VarF != null) {
                        nu9 nu9Var = new nu9(((tg30) lmwVar.b).g);
                        nu9Var.m(zf30VarF);
                        nu9Var.h();
                    }
                    vkuVar.c();
                    dg30Var.q0(null);
                    str3 = "viewBinding";
                }
                ofk1 ofk1Var2 = ofk1Var instanceof ofk1 ? (ofk1) ofk1Var : null;
                ai0 ai0Var54 = dg30Var.b1;
                if (ofk1Var2 != null) {
                    nfk1 nfk1Var = ofk1Var2.d;
                    nfk1 nfk1Var2 = ofk1Var2.c;
                    if (ai0Var54 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((ConstraintLayout) ai0Var54.g1).setVisibility(0);
                    ai0 ai0Var55 = dg30Var.b1;
                    if (ai0Var55 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((TextView) ai0Var55.Q0).setText(ofk1Var2.a);
                    ai0 ai0Var56 = dg30Var.b1;
                    if (ai0Var56 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((TextView) ai0Var56.P0).setText(ofk1Var2.b);
                    ai0 ai0Var57 = dg30Var.b1;
                    if (ai0Var57 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((EncoreButton) ai0Var57.i1).setVisibility(nfk1Var2 != null ? 0 : 8);
                    ai0 ai0Var58 = dg30Var.b1;
                    if (ai0Var58 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((EncoreButton) ai0Var58.i1).setText(nfk1Var2 != null ? nfk1Var2.a : null);
                    if (nfk1Var2 != null) {
                        ai0 ai0Var59 = dg30Var.b1;
                        if (ai0Var59 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((EncoreButton) ai0Var59.i1).setOnClickListener(new b3b1(nfk1Var2, dg30Var, (byte) 0));
                    }
                    ai0 ai0Var60 = dg30Var.b1;
                    if (ai0Var60 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((EncoreButton) ai0Var60.h1).setVisibility(nfk1Var != null ? 0 : 8);
                    ai0 ai0Var61 = dg30Var.b1;
                    if (ai0Var61 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((EncoreButton) ai0Var61.h1).setText(nfk1Var != null ? nfk1Var.a : null);
                    if (nfk1Var != null) {
                        ai0 ai0Var62 = dg30Var.b1;
                        if (ai0Var62 == null) {
                            u890.C(str3);
                            throw null;
                        }
                        ((EncoreButton) ai0Var62.h1).setOnClickListener(new b3b1(nfk1Var, dg30Var, (byte) 1));
                    }
                } else {
                    if (ai0Var54 == null) {
                        u890.C(str3);
                        throw null;
                    }
                    ((ConstraintLayout) ai0Var54.g1).setVisibility(8);
                }
                ufk1 ufk1Var = ofk1Var instanceof ufk1 ? (ufk1) ofk1Var : null;
                if (ufk1Var == null) {
                    ai0 ai0Var63 = dg30Var.b1;
                    if (ai0Var63 != null) {
                        ((FrameLayout) ai0Var63.c).setVisibility(8);
                        return;
                    } else {
                        u890.C(str3);
                        throw null;
                    }
                }
                dg30Var.setTitle(ufk1Var.a);
                ai0 ai0Var64 = dg30Var.b1;
                if (ai0Var64 == null) {
                    u890.C(str3);
                    throw null;
                }
                ((FrameLayout) ai0Var64.c).setVisibility(0);
                dtw dtwVar2 = dg30Var.d1;
                if (dtwVar2 != null) {
                    dtwVar2.f(ufk1Var.b);
                    return;
                } else {
                    u890.C("itemUnavailableVh");
                    throw null;
                }
                break;
            case 1:
                int i2 = SpotifyCheckoutActivity.D1;
                dg30Var.s0((diw) obj);
                return;
            default:
                int i3 = SpotifyCheckoutActivity.D1;
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    dg30Var.s0((diw) it.next());
                }
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new tv30(1, this.b, SpotifyCheckoutActivity.class, "render", "render(Lcom/spotify/checkout/spotifycheckout/domain/Model;)V", 0);
            case 1:
                return new tv30(1, this.b, SpotifyCheckoutActivity.class, "trigger", "trigger(Lcom/spotify/checkout/spotifycheckout/domain/Effect$ViewEffect;)V", 0);
            default:
                return new tv30(1, this.b, SpotifyCheckoutActivity.class, "triggerAfterPause", "triggerAfterPause(Ljava/lang/Iterable;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
