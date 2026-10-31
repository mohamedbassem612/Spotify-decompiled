package p;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Trace;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.adsdisplay.uiusecases.videocontrolsoverlay.VideoControlsOverlayView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconVolume;
import com.spotify.encoremobile.component.icons.IconVolumeOff;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity;
import com.spotify.player.model.ContextTrack;
import com.spotify.profile.editprofile.proto.Userprofileview;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h72 implements dl4 {
    public Object X;
    public Object Y;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public final Object d;
    public Object e;
    public Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object t;

    public h72(bk7 bk7Var, q4e q4eVar, j1e j1eVar, m4p m4pVar, kdy0 kdy0Var, dg30 dg30Var, View view, String str, ree reeVar) {
        this.a = (byte) 4;
        this.b = bk7Var;
        this.c = q4eVar;
        this.d = kdy0Var;
        this.e = dg30Var;
        this.f = view;
        this.g = reeVar;
        wzn wznVar = (wzn) m4pVar.a.c;
        RetrofitMaker retrofitMaker = (RetrofitMaker) ((lee) wznVar.a).c.get();
        c8o.l(retrofitMaker);
        bfi1 bfi1Var = (bfi1) retrofitMaker.createWebgateService(bfi1.class, "android-profile-editprofile");
        lee leeVar = (lee) wznVar.a;
        Scheduler scheduler = (Scheduler) leeVar.a.get();
        c8o.l(scheduler);
        i8h1 i8h1Var = (i8h1) leeVar.f.get();
        c8o.l(i8h1Var);
        oee oeeVar = new oee(this, bfi1Var, scheduler, new xid(i8h1Var, (byte) 6));
        this.h = oeeVar;
        View.OnClickListener seeVar = new see(this, (byte) 0);
        uee ueeVar = new uee(this, (byte) 0);
        View.OnClickListener seeVar2 = new see(this, (byte) 1);
        uee ueeVar2 = new uee(this, (byte) 1);
        idd1 idd1Var = new idd1(new tee(this, (byte) 3));
        this.i = idd1Var;
        this.t = new idd1(new tee(this, (byte) 2));
        idd1 idd1Var2 = new idd1(new tee(this, (byte) 0));
        this.X = idd1Var2;
        this.Y = new idd1(new tee(this, (byte) 1));
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(dg30Var);
        StateListAnimatorButton stateListAnimatorButton = new StateListAnimatorButton(dg30Var);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(2131431411);
        GlueToolbar glueToolbarCreateGlueToolbar = GlueToolbars.createGlueToolbar(dg30Var, viewGroup);
        glueToolbarCreateGlueToolbar.setTitle(view.getResources().getString(2131955336));
        viewGroup.addView(glueToolbarCreateGlueToolbar.getView());
        WeakHashMap weakHashMap = b8k1.a;
        stateListAnimatorImageButton.setBackground(null);
        g4b1 g4b1Var = new g4b1(dg30Var, j4b1.Q7, view.getResources().getDimensionPixelSize(2131167143));
        g4b1Var.b(dg30Var.getColor(2131104462));
        stateListAnimatorImageButton.setImageDrawable(g4b1Var);
        stateListAnimatorImageButton.setContentDescription(view.getResources().getString(2131956217));
        stateListAnimatorImageButton.setOnClickListener(seeVar);
        glueToolbarCreateGlueToolbar.addView(ToolbarSide.START, stateListAnimatorImageButton, 2131431410);
        stateListAnimatorButton.setBackground(null);
        stateListAnimatorButton.setText(2131955339);
        foo1.F(dg30Var, stateListAnimatorButton, 2130969932);
        stateListAnimatorButton.setPadding(0, 0, 0, 0);
        stateListAnimatorButton.setOnClickListener(seeVar2);
        glueToolbarCreateGlueToolbar.addView(ToolbarSide.END, stateListAnimatorButton, 2131431408);
        RecyclerView recyclerViewFindViewById = view.findViewById(2131428080);
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(0));
        recyclerViewFindViewById.setAdapter(bk7Var);
        recyclerViewFindViewById.j(j1eVar);
        bk7Var.f = ueeVar;
        oeeVar.g.c(oee.h[0], oeeVar, str.length() == 0 ? z6x.a : ihc1.Q0(str, new String[]{"/"}, 0, 6));
        List listA = oeeVar.a();
        if (!u890.j((List) bk7Var.e, listA)) {
            bk7Var.e = listA;
            bk7Var.h();
        }
        RecyclerView recyclerViewFindViewById2 = view.findViewById(2131430555);
        recyclerViewFindViewById2.setLayoutManager(new LinearLayoutManager(1));
        recyclerViewFindViewById2.setAdapter(q4eVar);
        q4eVar.f = ueeVar2;
        q4eVar.g = kdy0Var;
        q4eVar.h = new ptb(recyclerViewFindViewById2, (byte) 23);
        ((EditText) idd1Var.getValue()).addTextChangedListener(new p96(this, (byte) 3));
        aki1 aki1VarN = Userprofileview.GetPronounsRequest.n();
        aki1VarN.n();
        bfi1Var.a(aki1VarN.build()).filter(bya0.O0).f(stf0.S0).g(scheduler).subscribe(new mba(oeeVar, (byte) 18), fcc.t);
        ((Group) idd1Var2.getValue()).setVisibility(0);
    }

    public static final boolean E(b440 b440Var, bfn0 bfn0Var) {
        Object[] objArr = bfn0Var.a;
        int i = bfn0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ky11 ky11Var = ((b440) objArr[i2]).a;
            if (ky11Var instanceof oas0) {
                bfn0 bfn0Var2 = ((oas0) ky11Var).b;
                if (bfn0Var2.k(b440Var) || E(b440Var, bfn0Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static h72 G(LayoutInflater layoutInflater) {
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayoutInflate = layoutInflater.inflate(2131625071, (ViewGroup) null, false);
        int i = 2131427448;
        ViewStub viewStub = (ViewStub) m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131427448);
        if (viewStub != null) {
            BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = behaviorRetainingAppBarLayoutInflate;
            i = 2131427670;
            BackButtonView backButtonViewT = m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131427670);
            if (backButtonViewT != null) {
                i = 2131427671;
                View viewT = m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131427671);
                if (viewT != null) {
                    i = 2131428119;
                    CollapsingToolbarLayout collapsingToolbarLayoutT = m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131428119);
                    if (collapsingToolbarLayoutT != null) {
                        i = 2131428212;
                        ViewStub viewStub2 = (ViewStub) m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131428212);
                        if (viewStub2 != null) {
                            i = 2131428884;
                            FindInContextView findInContextViewT = m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131428884);
                            if (findInContextViewT != null) {
                                i = 2131431023;
                                View viewT2 = m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131431023);
                                if (viewT2 != null) {
                                    i = 2131431397;
                                    Toolbar toolbarT = m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131431397);
                                    if (toolbarT != null) {
                                        i = 2131431409;
                                        TextView textView = (TextView) m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131431409);
                                        if (textView != null) {
                                            return new h72((Object) behaviorRetainingAppBarLayout, (Object) viewStub, (Object) behaviorRetainingAppBarLayout, (Object) backButtonViewT, (Object) viewT, (Object) collapsingToolbarLayoutT, (Object) viewStub2, (Object) findInContextViewT, (Object) viewT2, (Object) toolbarT, (Object) textView, (byte) 25);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(behaviorRetainingAppBarLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public static t881 O() {
        y381.Companion.getClass();
        Boolean bool = Boolean.TRUE;
        x381 x381Var = new x381((List) null, Collections.singletonMap("link", bool));
        e3z.Companion.getClass();
        y381 y381Var = new y381(new e3z((aqa0) null, Collections.singletonList(22), sqg0.J(new mmr0[]{new mmr0("name", bool), new mmr0("link", bool), new mmr0("isPlayed", bool), new mmr0("length", bool), new mmr0("publishDate", bool), new mmr0("isExplicit", bool), new mmr0("is19PlusOnly", bool)})), x381Var, (aqa0) null);
        t881.Companion.getClass();
        return new t881(y381Var);
    }

    public static fh90 S(zuc0 zuc0Var) {
        va81 va81VarA = zuc0Var.q.a(va81.class);
        String str = zuc0Var.i;
        String str2 = zuc0Var.c;
        String str3 = va81VarA != null ? va81VarA.c : null;
        if (str3 == null) {
            str3 = "";
        }
        w281 w281VarA = zuc0Var.q.a(w281.class);
        w281 w281Var = w281VarA == null ? new w281((e6p1) null, (k281) null, false, (ArrayList) null, (ArrayList) null, (u281) null, (q281) null, (t281) null, (byte[]) null, (r281) null, false, 4095) : w281VarA;
        String strA = va81VarA != null ? va81VarA.g.a(zdn.b) : null;
        return new fh90(str3, strA != null ? strA : "", str, str2, w281Var);
    }

    public static /* bridge */ /* synthetic */ yw30 a(h72 h72Var) {
        return (yw30) h72Var.b;
    }

    public static fqg0 o(laa laaVar) {
        return q1o1.u(laaVar, null, new FrameLayout.LayoutParams(-1, -1), 3);
    }

    public static ham s(h72 h72Var, String str, kp00 kp00Var, xu30 xu30Var, vu30 vu30Var, Function0 function0, iu30 iu30Var, int i) {
        Function0 function1 = (i & 16) != 0 ? lmm.T0 : function0;
        iu30 iu30Var2 = (i & 32) != 0 ? rwn.c : iu30Var;
        rzq rzqVar = (rzq) ((m3n) h72Var.X).invoke(str);
        w6e0 w6e0Var = (w6e0) ((kjk) h72Var.d).invoke(rzqVar);
        z7e0 z7e0Var = (z7e0) h72Var.b;
        wfr0 wfr0Var = new wfr0(new no2(h72Var, w6e0Var, str, kp00Var, (lnm) null, (byte) 3), (q8n) h72Var.f, (o3e0) h72Var.i, false);
        j96 j96Var = new j96(h72Var, function1, iu30Var2, xu30Var, vu30Var, rzqVar, (byte) 6);
        u7r0 u7r0Var = new u7r0((s6t0) null, (g4h1) null, (iu30) null, false, false, 125);
        z7e0Var.getClass();
        return new ham((Object) new w6e0(wfr0Var, z7e0Var, u7r0Var, j96Var, (byte) 3), (Object) rzqVar, (byte) 12);
    }

    public void A() {
        bfn0 bfn0Var = (bfn0) this.d;
        bfn0 bfn0Var2 = (bfn0) this.g;
        Set set = (Set) this.b;
        if (set == null) {
            return;
        }
        this.Y = null;
        if (bfn0Var2.c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                oen0 oen0Var = (oen0) this.i;
                int i = bfn0Var2.c;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = bfn0Var2.a[i];
                    try {
                        if (obj instanceof b440) {
                            ky11 ky11Var = ((b440) obj).a;
                            set.remove(ky11Var);
                            ky11Var.h();
                        }
                        if (obj instanceof wvj) {
                            if (oen0Var == null || !oen0Var.c(obj)) {
                                ((wvj) obj).b();
                            } else {
                                ((wvj) obj).a();
                            }
                        }
                    } catch (Throwable th) {
                        y3k y3kVar = (y3k) this.c;
                        if (y3kVar != null) {
                            jm5.r(th, new og(y3kVar, obj, (byte) 18));
                        }
                        throw th;
                    }
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (bfn0Var.c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.b;
                if (set2 != null) {
                    Object[] objArr = bfn0Var.a;
                    int i2 = bfn0Var.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        b440 b440Var = (b440) objArr[i3];
                        ky11 ky11Var2 = b440Var.a;
                        set2.remove(ky11Var2);
                        try {
                            ky11Var2.b();
                        } catch (Throwable th3) {
                            y3k y3kVar2 = (y3k) this.c;
                            if (y3kVar2 != null) {
                                jm5.r(th3, new og(y3kVar2, b440Var, (byte) 18));
                            }
                            throw th3;
                        }
                    }
                }
                Trace.endSection();
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        }
    }

    public void B() {
        bfn0 bfn0Var = (bfn0) this.h;
        if (bfn0Var.c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = bfn0Var.a;
                int i = bfn0Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                bfn0Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void C(h311 h311Var) {
        bfn0 bfn0Var;
        nen0 nen0Var = (nen0) this.t;
        if (nen0Var == null || ((oas0) nen0Var.g(h311Var)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.X;
        if (arrayList != null && (bfn0Var = (bfn0) arrayList.remove(arrayList.size() - 1)) != null) {
            this.f = bfn0Var;
        }
        nen0Var.k(h311Var);
    }

    public void D(b440 b440Var) {
        bfn0 bfn0Var = (bfn0) this.d;
        if (!((oen0) this.e).c(b440Var)) {
            oen0 oen0Var = (oen0) this.Y;
            if (oen0Var == null || !oen0Var.c(b440Var)) {
                ((bfn0) this.g).b(b440Var);
                return;
            }
            return;
        }
        ((oen0) this.e).l(b440Var);
        if (!((bfn0) this.f).k(b440Var) && !bfn0Var.k(b440Var)) {
            E(b440Var, bfn0Var);
        }
        Set set = (Set) this.b;
        if (set == null) {
            return;
        }
        set.add(b440Var.a);
    }

    public boolean F() {
        a3v0 a3v0Var = (a3v0) this.b;
        luk lukVar = (luk) a3v0Var.k.get();
        c8o.l(lukVar);
        return td70.b(new qm4(false, lukVar), ((Boolean) a3v0Var.r.get()).booleanValue());
    }

    public n980 H() {
        oo91 oo91Var = (oo91) this.b;
        Flowable flowableZ0 = oo91Var.z0();
        c8o.l(flowableZ0);
        FlowableElementAtSingle flowableElementAtSingleZ = flowableZ0.x(si10.g).J(xi10.g).z();
        io91 io91VarT = oo91Var.t();
        c8o.l(io91VarT);
        return new n980(flowableElementAtSingleZ, io91VarT);
    }

    public boolean I(ContextTrack contextTrack) {
        if (!((eu4) this.d).a()) {
            return false;
        }
        String str = (String) contextTrack.metadata().get("save_track.uri");
        if (str == null) {
            str = (String) contextTrack.metadata().get("audio_association");
        }
        return str != null;
    }

    public p6r0 J() {
        cxn cxnVar = ((kx11) this.b).b;
        if (cxnVar instanceof wwn) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.G1("ARTIST_RELEASES", "artist/releases", 175, "artist");
        }
        if (cxnVar instanceof ywn) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.G1("ARTIST_WORKS", "artist/works", 179, "artist");
        }
        if (cxnVar instanceof xwn) {
            AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
            return yon1.G1("AUTHOR_RELEASES", "author/releases", 210, "author");
        }
        eg.o();
        return null;
    }

    public u9u0 K() {
        vh00 vh00Var = (vh00) this.b;
        t8u0 t8u0Var = (t8u0) vh00Var.t.get();
        c8o.l(t8u0Var);
        q7r0 q7r0Var = (q7r0) this.c;
        cyp cypVarA = t8u0Var.a(q7r0Var.d.c.getLifecycle());
        b7r0 b7r0Var = (b7r0) vh00Var.s.get();
        c8o.l(b7r0Var);
        t8u0 t8u0Var2 = (t8u0) vh00Var.t.get();
        c8o.l(t8u0Var2);
        ruz ruzVarA = t8u0Var2.a(q7r0Var.d.c.getLifecycle()).a();
        Flowable flowable = (Flowable) vh00Var.u.get();
        c8o.l(flowable);
        return new u9u0(cypVarA, b7r0Var, ruzVarA, flowable);
    }

    public void L(Set set, y3k y3kVar) {
        q();
        this.b = set;
        this.c = y3kVar;
    }

    public void M(b440 b440Var) {
        ((bfn0) this.f).b(b440Var);
        ((oen0) this.e).a(b440Var);
    }

    public void N(boolean z, CharSequence charSequence) {
        idd1 idd1Var = (idd1) this.X;
        idd1 idd1Var2 = (idd1) this.Y;
        if (!z) {
            ((LinearLayout) idd1Var2.getValue()).setVisibility(8);
            ((Group) idd1Var.getValue()).setVisibility(0);
        } else {
            ((LinearLayout) idd1Var2.getValue()).setVisibility(0);
            ((Group) idd1Var.getValue()).setVisibility(8);
            ((TextView) ((LinearLayout) idd1Var2.getValue()).findViewById(2131431356)).setText(((dg30) this.e).getResources().getString(2131955334, charSequence));
        }
    }

    public void P(Function0 function0) {
        ((bfn0) this.h).b(function0);
    }

    public void Q(List list, AnimatorListenerAdapter animatorListenerAdapter, Interpolator interpolator, long j) {
        p();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(interpolator);
        animatorSet.addListener(animatorListenerAdapter);
        animatorSet.start();
        this.Y = animatorSet;
    }

    public void R(h311 h311Var) {
        nen0 nen0Var = (nen0) this.t;
        oas0 oas0Var = nen0Var != null ? (oas0) nen0Var.g(h311Var) : null;
        if (oas0Var != null) {
            ArrayList arrayList = (ArrayList) this.X;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.X = arrayList;
            }
            arrayList.add((bfn0) this.f);
            this.f = oas0Var.b;
        }
    }

    public zjf1 T() {
        uu00 uu00Var = (uu00) ((qda1) this.b).d.get();
        c8o.l(uu00Var);
        return new zjf1(uu00Var);
    }

    public lik1 U() {
        String str;
        switch (this.a) {
            case grn1.d /* 12 */:
                xdd0 xdd0Var = (xdd0) this.b;
                return cfm0.i("spotify:listening-activity:details:", Uri.encode(xdd0Var.a), nik1.r4);
            default:
                kx11 kx11Var = (kx11) this.b;
                cxn cxnVar = kx11Var.b;
                if (cxnVar instanceof wwn) {
                    str = "spotify:artist:[a-zA-Z0-9]{22}(:releases)?";
                } else if (cxnVar instanceof ywn) {
                    str = "spotify:artist:[a-zA-Z0-9]{22}(:works)?";
                } else {
                    if (!(cxnVar instanceof xwn)) {
                        eg.o();
                        return null;
                    }
                    str = "spotify:author:[a-zA-Z0-9]{22}(:releases)?";
                }
                return new kik1(str).b(kx11Var.a);
        }
    }

    public void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-418223202);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            el9 el9Var = (el9) this.i;
            String str = ((rm9) this.X).a.h;
            if (str == null) {
                str = "";
            }
            d0r d0rVar = (d0r) this.t;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            i1o1.e(el9Var, str, d0rVar, uyn1.y(qim0VarF, 16.0f, 8.0f), null, null, null, 0, null, x340Var, 8, 248);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pl9(this, qim0Var, i, (byte) 0);
        }
    }

    public void c(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(835610228);
        int i2 = i | 6 | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            hw2 hw2Var = (hw2) this.d;
            d0r d0rVar = (d0r) this.t;
            qim0Var2 = nim0.a;
            i1o1.e(hw2Var, rih1.a, d0rVar, u291.f(qim0Var2, 1.0f), null, null, null, 0, null, x340Var, 56, 248);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pl9(this, qim0Var2, i, (byte) 1);
        }
    }

    public void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(250881237);
        int i2 = i | 6 | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nm1 nm1Var = (nm1) this.e;
            d0r d0rVar = (d0r) this.t;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            float f = cbx.b(x340Var).b.b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            i1o1.e(nm1Var, rih1.a, d0rVar, uyn1.B(qim0VarF, 16.0f, f, 16.0f, 0.0f, 8), null, null, null, 0, null, x340Var, 56, 248);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pl9(this, qim0Var, i, (byte) 2);
        }
    }

    public void e(b0k b0kVar, int i) {
        h311 h311VarV;
        rl9 rl9Var;
        Activity activity;
        Window window;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(421787899);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            Context baseContext = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            do {
                activity = null;
                Activity activity2 = baseContext instanceof Activity ? (Activity) baseContext : null;
                if (activity2 != null) {
                    activity = activity2;
                    break;
                }
                ContextWrapper contextWrapper = baseContext instanceof ContextWrapper ? (ContextWrapper) baseContext : null;
                if (contextWrapper == null) {
                    break;
                } else {
                    baseContext = contextWrapper.getBaseContext();
                }
            } while (baseContext != null);
            if (activity == null || (window = activity.getWindow()) == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    rl9Var = new rl9(this, i, (byte) 1);
                }
            } else {
                boolean zI = x340Var.i(window);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new ql9(window, (byte) 0);
                    x340Var.s0(objT);
                }
                qxd0.i(window, (iu30) objT, x340Var);
            }
            h311VarV.d = rl9Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            rl9Var = new rl9(this, i, (byte) 0);
            h311VarV.d = rl9Var;
        }
    }

    public void f(ds9 ds9Var, String str, duk0 duk0Var, b0k b0kVar, int i) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1145192133);
        int i2 = (x340Var.i(ds9Var) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16) | (x340Var.i(duk0Var) ? 256 : 128) | (x340Var.i(nim0.a) ? 2048 : 1024) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            e(x340Var, (i2 >> 12) & 14);
            boolean zG = x340Var.g(duk0Var) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = new cuk0(str, duk0Var.b());
                x340Var.s0(objT);
            }
            cuk0 cuk0Var = (cuk0) objT;
            boolean zI = x340Var.i(cuk0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj) {
                objT2 = new sl9(cuk0Var, (byte) 1);
                x340Var.s0(objT2);
            }
            dgo1.c("byom_fullscreen", (iu30) objT2, apo.r(-839273983, new tl9(ds9Var), x340Var), x340Var, 390);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, (Object) this, (Object) ds9Var, (Object) str, (Object) duk0Var, (byte) 19);
        }
    }

    public void g(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(767596441);
        int i2 = i | 6 | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0Var = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ip9 ip9Var = (ip9) this.g;
            rih1 rih1Var = rih1.a;
            otw.c(ip9Var, rih1Var, (qim0) null, (ipb1) null, x340Var, 56, 12);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            otw.c((ip9) this.f, rih1Var, (qim0) null, (ipb1) null, x340Var, 56, 12);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            otw.c((ip9) this.h, rih1Var, (qim0) null, (ipb1) null, x340Var, 56, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pl9(this, qim0Var, i, (byte) 3);
        }
    }

    public void h(ds9 ds9Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(687782257);
        int i2 = i | (x340Var.i(ds9Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        nim0 nim0Var = nim0.a;
        int i3 = i2 | (x340Var.i(nim0Var) ? 2048 : 1024) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new or9();
                x340Var.s0(objT);
            }
            or9 or9Var = (or9) objT;
            qim0 qim0VarF = dug.f(u291.d(nim0Var, 1.0f), u7h.b(u7h.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            irn1.u(zr7.i(nim0Var, new qr9(function0, or9Var, (byte) 0)), apo.r(927259178, new zt6(or9Var, function0, this, (byte) 13), x340Var), null, null, apo.r(1183438320, new o3((Object) this, (Object) ds9Var, z, (byte) 5), x340Var), x340Var, 24624, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(this, ds9Var, z, function0, i, (byte) 8);
        }
    }

    public void i(int i, Function0 function0, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        qim0 qim0Var2;
        boolean z;
        boolean z2;
        boolean zA;
        k2p k2pVar = (k2p) this.b;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-74625653);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | 48 | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Configuration configuration = (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a);
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            boolean zG = x340Var.g(context);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = Boolean.valueOf(xoi1.b(context));
                x340Var.s0(objT);
            }
            boolean zBooleanValue = ((Boolean) objT).booleanValue();
            Object[] objArr = new Object[0];
            df41 df41Var = ho9.a;
            boolean zI = x340Var.i(configuration) | x340Var.h(zBooleanValue);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj) {
                objT2 = new xt7(configuration, zBooleanValue, (byte) 1);
                x340Var.s0(objT2);
            }
            ven0 ven0VarV = k5p1.v(objArr, df41Var, (Function0) objT2, x340Var, 0);
            boolean zG2 = x340Var.g(k2pVar);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == obj) {
                cy7 cy7Var = new cy7(ven0VarV, (byte) 2);
                c21 c21Var = (c21) k2pVar.a.c;
                jo9 jo9Var = (jo9) c21Var.c;
                rm9 rm9VarA = ((jo9) c21Var.c).a();
                c8o.l(rm9VarA);
                pqc1 pqc1Var = (pqc1) jo9Var.w.get();
                c8o.l(pqc1Var);
                nqc1 nqc1Var = (nqc1) jo9Var.x.get();
                c8o.l(nqc1Var);
                rm9 rm9VarA2 = jo9Var.a();
                c8o.l(rm9VarA2);
                tm tmVar = new tm(pqc1Var, nqc1Var, rm9VarA2);
                rm9 rm9VarA3 = jo9Var.a();
                c8o.l(rm9VarA3);
                ip9 ip9Var = new ip9(rm9VarA3, (byte) 0);
                rm9 rm9VarA4 = jo9Var.a();
                c8o.l(rm9VarA4);
                ip9 ip9Var2 = new ip9(rm9VarA4, (byte) 1);
                rm9 rm9VarA5 = jo9Var.a();
                c8o.l(rm9VarA5);
                it8 it8VarE = c21Var.e();
                yqg yqgVar = (yqg) jo9Var.e.get();
                c8o.l(yqgVar);
                tm tmVar2 = new tm(rm9VarA5, it8VarE, yqgVar);
                rm9 rm9VarA6 = jo9Var.a();
                c8o.l(rm9VarA6);
                ip9 ip9Var3 = new ip9(rm9VarA6, (byte) 2);
                d0r d0rVar = (d0r) ((jly0) c21Var.e).get();
                rm9 rm9VarA7 = jo9Var.a();
                c8o.l(rm9VarA7);
                nm1 nm1Var = new nm1(d0rVar, rm9VarA7, new xho(((mko) ((jly0) c21Var.f).get()).b()));
                w2k1 w2k1Var = (w2k1) jo9Var.r.get();
                c8o.l(w2k1Var);
                ds9 ds9Var = new ds9(rm9VarA, tmVar, ip9Var, ip9Var2, tmVar2, ip9Var3, nm1Var, w2k1Var, cy7Var);
                x340Var.s0(ds9Var);
                objT3 = ds9Var;
            }
            ds9 ds9Var2 = (ds9) objT3;
            if (zBooleanValue == 0) {
                x340Var.i0(1621037117);
                boolean zG3 = x340Var.g(context);
                Object objT4 = x340Var.T();
                if (zG3 || objT4 == obj) {
                    objT4 = new ar9(context.getApplicationContext());
                    x340Var.s0(objT4);
                }
                ar9 ar9Var = (ar9) objT4;
                boolean zI2 = x340Var.i(ven0VarV);
                Object objT5 = x340Var.T();
                if (zI2 || objT5 == obj) {
                    objT5 = new cy7(ven0VarV, (byte) 1);
                    x340Var.s0(objT5);
                }
                z = false;
                i2p1.d(ar9Var, (iu30) objT5, x340Var, 0);
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(1621308119);
                x340Var.r(false);
            }
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            kq9 kq9Var = ((go9) ven0VarV.getValue()).a;
            boolean zI3 = x340Var.i(ven0VarS) | x340Var.i(ven0VarV);
            Object objT6 = x340Var.T();
            if (zI3 || objT6 == obj) {
                z2 = true;
                objT6 = new vs3(ven0VarS, ven0VarV, (lnm) null, (byte) 1);
                x340Var.s0(objT6);
            } else {
                z2 = true;
            }
            qxd0.t(kq9Var, x340Var, (vu30) objT6);
            if (zBooleanValue != 0) {
                zA = ((go9) ven0VarV.getValue()).a.a();
            } else {
                zA = configuration.orientation == 2 ? z2 : z;
            }
            String str = ((rm9) this.X).a.h;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            boolean zG4 = x340Var.g(str2);
            Object objT7 = x340Var.T();
            if (zG4 || objT7 == obj) {
                objT7 = new duk0(str2);
                x340Var.s0(objT7);
            }
            duk0 duk0Var = (duk0) objT7;
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            boolean zI4 = x340Var.i(view) | x340Var.i(duk0Var);
            Object objT8 = x340Var.T();
            if (zI4 || objT8 == obj) {
                objT8 = new kd8(view, duk0Var, (byte) 6);
                x340Var.s0(objT8);
            }
            dgo1.c(view, (iu30) objT8, apo.r(-966732337, new vl(zA, this, ds9Var2, str2, duk0Var, zBooleanValue, function0), x340Var), x340Var, 384);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6((Object) this, iu30Var, (Object) qim0Var2, (Object) function0, i, (byte) 20);
        }
    }

    public void j(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-148983513);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            tm tmVar = (tm) this.Y;
            String str = ((rm9) this.X).a.h;
            if (str == null) {
                str = "";
            }
            qim0Var2 = qim0Var;
            otw.c(tmVar, str, qim0Var2, (ipb1) null, x340Var, 8 | ((i2 << 6) & 896), 8);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pl9(this, qim0Var2, i, (byte) 4);
        }
    }

    public void k(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1695157857);
        int i2 = i | 6 | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.f, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ip9 ip9Var = (ip9) this.g;
            rih1 rih1Var = rih1.a;
            otw.c(ip9Var, rih1Var, (qim0) null, (ipb1) null, x340Var, 56, 12);
            otw.c((ip9) this.f, rih1Var, (qim0) null, (ipb1) null, x340Var, 56, 12);
            otw.c((ip9) this.h, rih1Var, (qim0) null, (ipb1) null, x340Var, 56, 12);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pl9(this, qim0Var, i, (byte) 5);
        }
    }

    public void l(ds9 ds9Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(489557844);
        int i2 = (x340Var.i(ds9Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            as9 as9Var = new as9(1);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cbx.a.getClass();
            otw.c(ds9Var, as9Var, hno1.f(qim0VarF, uwr.d()), (ipb1) null, x340Var, 8 | (i2 & 14), 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(this, ds9Var, qim0Var2, i, (byte) 14);
        }
    }

    public f54 m() {
        luk lukVar = (luk) ((dx11) this.c).p.get();
        c8o.l(lukVar);
        return new f54(lukVar);
    }

    public kw4 n() {
        luk lukVar = (luk) ((yw30) this.b).x.get();
        c8o.l(lukVar);
        return new kw4(true, lukVar);
    }

    public void p() {
        AnimatorSet animatorSet = (AnimatorSet) this.Y;
        if (animatorSet != null) {
            if (!animatorSet.isRunning()) {
                animatorSet = null;
            }
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
    }

    public void q() {
        this.b = null;
        this.c = null;
        bfn0 bfn0Var = (bfn0) this.d;
        bfn0Var.g();
        ((oen0) this.e).b();
        this.f = bfn0Var;
        ((bfn0) this.g).g();
        ((bfn0) this.h).g();
        this.i = null;
        this.t = null;
        this.X = null;
    }

    public a83 r() {
        tim timVar = (tim) ((kim) this.b).e.get();
        c8o.l(timVar);
        Class<?> cls = ((mim) this.c).b.getClass();
        jd11 jd11Var = rc11.a;
        tka0 tka0VarB = jd11Var.b(cls);
        List list = (List) timVar.b.get(tka0VarB);
        a83 a83Var = list != null ? (a83) o7h.s0(list) : null;
        if (a83Var == null) {
            a83Var = null;
        }
        if (a83Var != null) {
            return a83Var;
        }
        bhn0.B(jd11Var.b(tka0VarB.getClass()).r(), "No ContextMenuRegistration found for key: ");
        return null;
    }

    public uh00 t() {
        vh00 vh00Var = (vh00) this.b;
        z7e0 z7e0Var = (z7e0) vh00Var.p.get();
        c8o.l(z7e0Var);
        zep zepVar = (zep) ((jly0) this.Y).get();
        wh00 wh00Var = (wh00) this.d;
        u9u0 u9u0VarK = K();
        lzn0 lzn0VarC = vh00Var.c();
        c8o.l(lzn0VarC);
        u9u0 u9u0VarK2 = K();
        kly0 kly0Var = vh00Var.w;
        RetrofitMaker retrofitMaker = (RetrofitMaker) kly0Var.get();
        c8o.l(retrofitMaker);
        cpd0 cpd0Var = (cpd0) retrofitMaker.createWebgateService(cpd0.class, "android-liveevents-datasource");
        RetrofitMaker retrofitMaker2 = (RetrofitMaker) kly0Var.get();
        c8o.l(retrofitMaker2);
        wlk wlkVar = (wlk) retrofitMaker2.createWebgateService(wlk.class, "android-liveevents-datasource");
        xrk xrkVarA = vh00Var.a();
        c8o.l(xrkVarA);
        uo5 uo5Var = new uo5(cpd0Var, wlkVar, xrkVarA, (byte) 24);
        Context context = (Context) vh00Var.j.get();
        c8o.l(context);
        dg8 dg8Var = new dg8(new qfl1(context), (byte) 28);
        khc khcVar = new khc((byte) 2);
        twa twaVar = new twa(x());
        uu00 uu00Var = (uu00) vh00Var.m.get();
        c8o.l(uu00Var);
        kt91 kt91Var = (kt91) vh00Var.A.get();
        c8o.l(kt91Var);
        kly0 kly0Var2 = vh00Var.d;
        yqg yqgVar = (yqg) kly0Var2.get();
        c8o.l(yqgVar);
        ig00 ig00Var = new ig00(lzn0VarC, u9u0VarK2, uo5Var, dg8Var, khcVar, twaVar, uu00Var, kt91Var, yqgVar);
        mwm1 mwm1Var = (mwm1) vh00Var.C.get();
        c8o.l(mwm1Var);
        th00 th00Var = new th00(u9u0VarK, ig00Var, mwm1Var);
        yqg yqgVar2 = (yqg) kly0Var2.get();
        c8o.l(yqgVar2);
        return new uh00(z7e0Var, zepVar, wh00Var, new nh00(wh00Var, th00Var, yqgVar2));
    }

    public xw30 u() {
        yw30 yw30Var = (yw30) this.b;
        z7e0 z7e0Var = (z7e0) yw30Var.d.get();
        c8o.l(z7e0Var);
        lip lipVar = (lip) ((jly0) this.X).get();
        ndi1 ndi1Var = (ndi1) yw30Var.f.get();
        c8o.l(ndi1Var);
        nfa0 nfa0Var = (nfa0) yw30Var.e.get();
        c8o.l(nfa0Var);
        ltf1 ltf1Var = new ltf1(ndi1Var, nfa0Var);
        RetrofitMaker retrofitMaker = (RetrofitMaker) yw30Var.g.get();
        c8o.l(retrofitMaker);
        b2e b2eVar = (b2e) retrofitMaker.createWebgateService(b2e.class, "android-home-funkis");
        c8o.m(b2eVar);
        dqu dquVar = new dqu(b2eVar, new zov0((byte) 20));
        kly0 kly0Var = yw30Var.w;
        b35 b35Var = (b35) kly0Var.get();
        c8o.l(b35Var);
        yfu yfuVar = new yfu(dquVar, b35Var, (byte) 7);
        lzn0 lzn0Var = (lzn0) yw30Var.n.get();
        c8o.l(lzn0Var);
        sun0 sun0Var = new sun0(lzn0Var);
        nn60 nn60Var = (nn60) yw30Var.t.get();
        c8o.l(nn60Var);
        kly0 kly0Var2 = yw30Var.v;
        xvo xvoVar = (xvo) kly0Var2.get();
        c8o.l(xvoVar);
        hj31 hj31Var = (hj31) yw30Var.k.get();
        c8o.l(hj31Var);
        dzp0 dzp0Var = new dzp0(nn60Var, xvoVar, hj31Var, (byte) 13);
        nn60 nn60Var2 = (nn60) yw30Var.t.get();
        c8o.l(nn60Var2);
        dc31 dc31Var = new dc31(nn60Var2, (cbr0) ((jly0) this.Y).get(), (byte) 7);
        dxz0 dxz0Var = (dxz0) yw30Var.p.get();
        c8o.l(dxz0Var);
        xvo xvoVar2 = (xvo) kly0Var2.get();
        c8o.l(xvoVar2);
        iac0 iac0Var = ((q7r0) this.d).d.c;
        c8o.m(iac0Var);
        lo60 lo60Var = (lo60) yw30Var.z.get();
        c8o.l(lo60Var);
        Scheduler scheduler = (Scheduler) yw30Var.b.get();
        c8o.l(scheduler);
        vw30 vw30Var = new vw30(ltf1Var, yfuVar, sun0Var, dzp0Var, dc31Var, dxz0Var, xvoVar2, iac0Var, lo60Var, scheduler);
        zw30 zw30Var = (zw30) this.c;
        nn60 nn60Var3 = (nn60) yw30Var.t.get();
        c8o.l(nn60Var3);
        b35 b35Var2 = (b35) kly0Var.get();
        c8o.l(b35Var2);
        return new xw30(z7e0Var, lipVar, new iw30(vw30Var, zw30Var, nn60Var3, b35Var2), (cbr0) ((jly0) this.Y).get());
    }

    public x4t0 v() {
        Set setSingleton;
        a5t0 a5t0Var = (a5t0) this.e;
        y4t0 y4t0Var = (y4t0) this.b;
        hvj hvjVar = (hvj) y4t0Var.a.get();
        c8o.l(hvjVar);
        dv00 dv00Var = (dv00) y4t0Var.b.get();
        c8o.l(dv00Var);
        q7r0 q7r0Var = (q7r0) this.c;
        iac0 iac0Var = q7r0Var.d.c;
        c8o.m(iac0Var);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new gfj1((nxp) ((jly0) this.f).get(), (vtm0) ((jly0) this.g).get(), q7r0Var));
        arrayList.add(new at00((oxp) ((jly0) this.h).get()));
        if (arrayList.isEmpty()) {
            setSingleton = Collections.EMPTY_SET;
        } else {
            setSingleton = arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
        }
        p1f0 p1f0Var = new p1f0(dv00Var, iac0Var, setSingleton, new khc((byte) 14));
        RetrofitMaker retrofitMaker = (RetrofitMaker) y4t0Var.d.get();
        c8o.l(retrofitMaker);
        zhq0 zhq0Var = new zhq0((k4t0) retrofitMaker.createWebgateService(k4t0.class, "android-watchfeed-pivotspage"), a5t0Var, (byte) 22);
        q8n q8nVar = (q8n) y4t0Var.c.get();
        c8o.l(q8nVar);
        return new x4t0(hvjVar, new w4t0(p1f0Var, zhq0Var, q8nVar, (ve20) ((jly0) this.i).get()), a5t0Var, (ul7) ((jly0) this.t).get(), (pxp) ((jly0) this.X).get(), (qxp) ((jly0) this.Y).get());
    }

    public void w(Object obj) {
        PartnerAccountLinkingActivity partnerAccountLinkingActivity = (PartnerAccountLinkingActivity) obj;
        ((t3b1) partnerAccountLinkingActivity).b1 = (jgu) ((s2q) this.f).get();
        ((t3b1) partnerAccountLinkingActivity).c1 = new tuk(xqu.a((s2q) this.i));
        partnerAccountLinkingActivity.f1 = (v0s0) ((jly0) this.X).get();
    }

    public fod0 x() {
        vh00 vh00Var = (vh00) this.b;
        yqg yqgVar = (yqg) vh00Var.d.get();
        c8o.l(yqgVar);
        c8o.l((Context) vh00Var.j.get());
        return new fod0(yqgVar);
    }

    public ogr y() {
        String str = ((dsg0) this.c).c;
        c8o.m(str);
        x881 x881Var = (x881) ((csg0) this.b).j.get();
        c8o.l(x881Var);
        return new ogr(x881Var.a(str), (byte) 10);
    }

    public void z() {
        Set set = (Set) this.b;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ky11 ky11Var = (ky11) it.next();
                it.remove();
                ky11Var.f();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public h72(gj5 gj5Var, baa baaVar, baa baaVar2, baa baaVar3, baa baaVar4, baa baaVar5, baa baaVar6, kmc kmcVar, qic qicVar, j50 j50Var) {
        this.a = (byte) 5;
        this.b = gj5Var;
        this.c = baaVar;
        this.d = baaVar2;
        this.e = baaVar3;
        this.f = baaVar4;
        this.g = baaVar5;
        this.h = baaVar6;
        this.i = kmcVar;
        this.t = qicVar;
        this.X = j50Var;
        this.Y = new ArrayList();
    }

    public h72(View view, View view2, View view3, ConstraintLayout constraintLayout) {
        this.a = (byte) 27;
        this.b = j0o1.x(view3);
        this.c = j0o1.y(view3);
        this.d = j0o1.x(view);
        this.e = j0o1.y(view);
        this.f = j0o1.x(constraintLayout);
        this.g = j0o1.y(constraintLayout);
        this.h = j0o1.x(view2);
        this.i = j0o1.y(view2);
        Property property = View.TRANSLATION_Y;
        this.t = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) property, 50.0f, 0.0f);
        this.X = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) property, 0.0f, 50.0f);
    }

    public h72(i8h1 i8h1Var, byp0 byp0Var, b7n b7nVar, xrc0 xrc0Var, dxz0 dxz0Var, Flowable flowable, ut71 ut71Var, Scheduler scheduler, Scheduler scheduler2, q8n q8nVar, Activity activity, lzn0 lzn0Var) {
        this.a = (byte) 23;
        this.b = i8h1Var;
        this.c = byp0Var;
        this.e = b7nVar;
        this.f = xrc0Var;
        this.g = dxz0Var;
        this.d = flowable;
        this.h = ut71Var;
        this.i = activity;
        this.t = lzn0Var;
        this.X = new vun(q8nVar, (byte) 29);
        this.Y = new otu(scheduler2, scheduler, (byte) 1);
    }

    public /* synthetic */ h72(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, byte b) {
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
    }

    public h72(String str, rit0 rit0Var, nm1 nm1Var, xvu xvuVar, bk90 bk90Var, q1p q1pVar, nm1 nm1Var2, qlb qlbVar, fp4 fp4Var, ezc ezcVar, mr20 mr20Var) {
        this.a = (byte) 2;
        this.b = str;
        this.c = rit0Var;
        this.d = nm1Var;
        this.e = xvuVar;
        this.f = bk90Var;
        this.g = nm1Var2;
        this.h = qlbVar;
        this.i = fp4Var;
        this.t = ezcVar;
        this.X = mr20Var;
        this.Y = q1pVar.a();
    }

    public h72(ip91 ip91Var, mwm1 mwm1Var, eu4 eu4Var, ln91 ln91Var, fl1 fl1Var, nwf1 nwf1Var, Optional optional) {
        this.a = (byte) 26;
        this.b = ip91Var;
        this.c = mwm1Var;
        this.d = eu4Var;
        this.e = ln91Var;
        this.f = fl1Var;
        this.g = nwf1Var;
        this.h = optional;
        this.i = new xh80(this, (byte) 2);
        this.t = new idd1(new nd70(this, (byte) 16));
        this.X = new xh80(this, (byte) 1);
        this.Y = new xh80(this, (byte) 0);
    }

    public h72() {
        this.a = (byte) 29;
        bfn0 bfn0Var = new bfn0(0, new b440[16]);
        this.d = bfn0Var;
        oen0 oen0Var = ij41.a;
        this.e = new oen0();
        this.f = bfn0Var;
        this.g = new bfn0(0, new Object[16]);
        this.h = new bfn0(0, new Function0[16]);
    }

    public h72(ConstraintLayout constraintLayout, TextView textView, TextView textView2, View view, View view2, View view3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.a = (byte) 6;
        this.b = textView;
        this.c = textView2;
        this.d = view;
        this.e = view2;
        this.f = view3;
        this.g = textView3;
        this.h = textView4;
        this.i = textView5;
        this.t = textView6;
        this.X = textView7;
        this.Y = textView8;
    }

    public h72(FrameLayout frameLayout, TextView textView, ClearButtonView clearButtonView, ConstraintLayout constraintLayout, EncoreButton encoreButton, IconVolume iconVolume, IconVolumeOff iconVolumeOff, FrameLayout frameLayout2, TextView textView2, FrameLayout frameLayout3, VideoControlsOverlayView videoControlsOverlayView, View view, VideoSurfaceView videoSurfaceView) {
        this.a = (byte) 22;
        this.b = frameLayout;
        this.c = textView;
        this.d = clearButtonView;
        this.e = encoreButton;
        this.f = iconVolume;
        this.g = iconVolumeOff;
        this.h = frameLayout2;
        this.i = textView2;
        this.t = videoControlsOverlayView;
        this.X = view;
        this.Y = videoSurfaceView;
    }

    public h72(FrameLayout frameLayout, ConstraintLayout constraintLayout, EncoreTextView encoreTextView, EncoreTextView encoreTextView2, LinearLayout linearLayout, ImageView imageView, View view, ImageView imageView2, ConstraintLayout constraintLayout2, EncoreTextView encoreTextView3, EncoreTextView encoreTextView4, ScrollView scrollView, EncoreTextView encoreTextView5, View view2, View view3) {
        this.a = (byte) 28;
        this.b = constraintLayout;
        this.c = encoreTextView;
        this.d = encoreTextView2;
        this.e = imageView;
        this.f = view;
        this.g = imageView2;
        this.h = constraintLayout2;
        this.i = encoreTextView3;
        this.t = encoreTextView4;
        this.X = view2;
        this.Y = view3;
    }

    public h72(sfm sfmVar) {
        this.a = (byte) 8;
        this.b = sfmVar;
        this.c = xqu.b(new d7p(this, 0, (byte) 9));
        this.d = new d7p(this, 1, (byte) 9);
        this.e = iy81.a(new d7p(this, 3, (byte) 9));
        this.f = new d7p(this, 4, (byte) 9);
        this.g = new d7p(this, 5, (byte) 9);
        this.h = iy81.a(new d7p(this, 7, (byte) 9));
        this.i = new d7p(this, 6, (byte) 9);
        this.t = iy81.a(new d7p(this, 9, (byte) 9));
        this.X = new d7p(this, 8, (byte) 9);
        this.Y = new d7p(this, 2, (byte) 9);
    }

    public h72(gq81 gq81Var) {
        this.a = (byte) 19;
        this.b = gq81Var;
        this.c = xqu.b(new ipq(this, 0, (byte) 15));
        this.d = iy81.a(new ipq(this, 1, (byte) 15));
        this.e = xqu.b(new ipq(this, 3, (byte) 15));
        this.f = xqu.b(new ipq(this, 2, (byte) 15));
        this.g = xqu.b(new ipq(this, 5, (byte) 15));
        this.h = xqu.b(new ipq(this, 4, (byte) 15));
        this.i = xqu.b(new ipq(this, 6, (byte) 15));
        this.t = xqu.b(new ipq(this, 7, (byte) 15));
        this.X = xqu.b(new ipq(this, 8, (byte) 15));
        this.Y = xqu.b(new ipq(this, 9, (byte) 15));
    }

    public h72(qda1 qda1Var, rda1 rda1Var, q7r0 q7r0Var) {
        this.a = (byte) 21;
        this.b = qda1Var;
        this.c = q7r0Var;
        this.d = xqu.b(new ipq(this, 1, (byte) 23));
        this.e = xqu.b(new ipq(this, 2, (byte) 23));
        this.f = iy81.a(new ipq(this, 3, (byte) 23));
        this.g = xqu.b(new ipq(this, 0, (byte) 23));
        this.h = iy81.a(new ipq(this, 5, (byte) 23));
        this.i = xqu.b(new ipq(this, 4, (byte) 23));
        this.t = xqu.b(new ipq(this, 6, (byte) 23));
        this.X = new ipq(this, 7, (byte) 23);
        this.Y = xqu.b(new ipq(this, 8, (byte) 23));
    }

    public h72(kim kimVar, mim mimVar) {
        this.a = (byte) 9;
        this.b = kimVar;
        this.c = mimVar;
        this.d = iy81.a(new d7p(this, 0, (byte) 10));
        this.e = new d7p(this, 1, (byte) 10);
        this.f = new d7p(this, 2, (byte) 10);
        this.g = iy81.a(new d7p(this, 4, (byte) 10));
        this.h = new d7p(this, 3, (byte) 10);
        this.i = iy81.a(new d7p(this, 6, (byte) 10));
        this.t = new d7p(this, 5, (byte) 10);
        this.X = xqu.b(new d7p(this, 7, (byte) 10));
        this.Y = new d7p(this, 8, (byte) 10);
    }

    public h72(y4t0 y4t0Var, ivj ivjVar, a5t0 a5t0Var, q7r0 q7r0Var) {
        this.a = (byte) 15;
        this.b = y4t0Var;
        this.c = q7r0Var;
        this.d = ivjVar;
        this.e = a5t0Var;
        this.f = iy81.a(new nxo(this, 0, (byte) 6));
        this.g = iy81.a(new nxo(this, 1, (byte) 6));
        this.h = iy81.a(new nxo(this, 2, (byte) 6));
        this.i = xqu.b(new nxo(this, 3, (byte) 6));
        this.t = xqu.b(new nxo(this, 4, (byte) 6));
        this.X = iy81.a(new nxo(this, 5, (byte) 6));
        this.Y = iy81.a(new nxo(this, 6, (byte) 6));
    }

    public h72(FrameLayout frameLayout, EncoreButton encoreButton, EncoreButton encoreButton2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, EncoreTextView encoreTextView, View view, EncoreTextView encoreTextView2, EncoreTextView encoreTextView3, ScrollView scrollView, AppCompatImageView appCompatImageView2, EncoreTextView encoreTextView4, EncoreTextView encoreTextView5, AppCompatImageView appCompatImageView3, EncoreTextView encoreTextView6, EncoreTextView encoreTextView7, View view2, ConstraintLayout constraintLayout2, View view3) {
        this.a = (byte) 24;
        this.b = frameLayout;
        this.c = encoreButton;
        this.d = encoreTextView;
        this.e = view;
        this.f = encoreTextView2;
        this.g = encoreTextView3;
        this.h = encoreTextView4;
        this.i = encoreTextView6;
        this.t = encoreTextView7;
        this.X = view2;
        this.Y = view3;
    }

    public h72(yw30 yw30Var, zw30 zw30Var, q7r0 q7r0Var) {
        this.a = (byte) 11;
        this.b = yw30Var;
        this.c = zw30Var;
        this.d = q7r0Var;
        this.e = iy81.a(new chp(this, 1, (byte) 11));
        this.f = iy81.a(new chp(this, 2, (byte) 11));
        this.g = iy81.a(new chp(this, 4, (byte) 11));
        this.h = iy81.a(new chp(this, 3, (byte) 11));
        this.i = iy81.a(new chp(this, 5, (byte) 11));
        this.t = new chp(this, 6, (byte) 11);
        this.X = iy81.a(new chp(this, 0, (byte) 11));
        this.Y = xqu.b(new chp(this, 7, (byte) 11));
    }

    public h72(wdd0 wdd0Var, xdd0 xdd0Var, q7r0 q7r0Var) {
        this.a = (byte) 12;
        this.b = xdd0Var;
        this.c = wdd0Var;
        this.d = q7r0Var;
        this.e = xqu.b(new blp(this, 1, (byte) 10));
        this.f = xqu.b(new blp(this, 2, (byte) 10));
        this.g = xqu.b(new blp(this, 3, (byte) 10));
        this.h = xqu.b(new blp(this, 4, (byte) 10));
        this.i = new blp(this, 5, (byte) 10);
        this.t = xqu.b(new blp(this, 6, (byte) 10));
        this.X = xqu.b(new blp(this, 0, (byte) 10));
        this.Y = new blp(this, 7, (byte) 10);
    }

    public h72(vh00 vh00Var, wh00 wh00Var, q7r0 q7r0Var) {
        this.a = (byte) 10;
        this.b = vh00Var;
        this.c = q7r0Var;
        this.d = wh00Var;
        this.e = new lbp(this, 1, (byte) 28);
        this.f = iy81.a(new lbp(this, 2, (byte) 28));
        this.g = iy81.a(new lbp(this, 3, (byte) 28));
        this.h = iy81.a(new lbp(this, 5, (byte) 28));
        this.i = iy81.a(new lbp(this, 6, (byte) 28));
        this.t = iy81.a(new lbp(this, 7, (byte) 28));
        this.X = iy81.a(new lbp(this, 4, (byte) 28));
        this.Y = iy81.a(new lbp(this, 0, (byte) 28));
    }

    public h72(csg0 csg0Var, dsg0 dsg0Var, q7r0 q7r0Var) {
        this.a = (byte) 13;
        this.b = csg0Var;
        this.c = dsg0Var;
        this.d = q7r0Var;
        this.e = new blp(this, 0, (byte) 25);
        this.f = xqu.b(new blp(this, 1, (byte) 25));
        this.g = xqu.b(new blp(this, 3, (byte) 25));
        this.h = new blp(this, 2, (byte) 25);
        this.i = xqu.b(new blp(this, 4, (byte) 25));
        this.t = iy81.a(new blp(this, 5, (byte) 25));
        this.X = xqu.b(new blp(this, 6, (byte) 25));
        this.Y = iy81.a(new blp(this, 7, (byte) 25));
    }

    public h72(oo91 oo91Var) {
        this.a = (byte) 20;
        this.b = oo91Var;
        this.c = iy81.a(new ipq(this, 2, (byte) 18));
        this.d = iy81.a(new ipq(this, 1, (byte) 18));
        this.e = new ipq(this, 3, (byte) 18);
        this.f = xqu.b(new ipq(this, 4, (byte) 18));
        this.g = iy81.a(new ipq(this, 6, (byte) 18));
        this.h = iy81.a(new ipq(this, 7, (byte) 18));
        this.i = iy81.a(new ipq(this, 8, (byte) 18));
        this.t = iy81.a(new ipq(this, 9, (byte) 18));
        this.X = iy81.a(new ipq(this, 5, (byte) 18));
        this.Y = iy81.a(new ipq(this, 0, (byte) 18));
    }

    public h72(dx11 dx11Var, kx11 kx11Var, q7r0 q7r0Var) {
        this.a = (byte) 18;
        this.b = kx11Var;
        this.c = dx11Var;
        this.d = q7r0Var;
        this.e = iy81.a(new ykq(this, 0, (byte) 17));
        this.f = iy81.a(new ykq(this, 2, (byte) 17));
        this.g = new ykq(this, 4, (byte) 17);
        this.h = new ykq(this, 5, (byte) 17);
        this.i = iy81.a(new ykq(this, 3, (byte) 17));
        this.t = new ykq(this, 6, (byte) 17);
        this.X = iy81.a(new ykq(this, 7, (byte) 17));
        this.Y = xqu.b(new ykq(this, 1, (byte) 17));
    }

    public h72(a3v0 a3v0Var, z2v0 z2v0Var) {
        this.a = (byte) 16;
        this.b = a3v0Var;
        this.c = z2v0Var;
        this.d = xqu.b(new ywp(this, 0, (byte) 14));
        this.e = xqu.b(new ywp(this, 4, (byte) 14));
        this.f = xqu.b(new ywp(this, 5, (byte) 14));
        this.g = xqu.b(new ywp(this, 3, (byte) 14));
        this.h = xqu.b(new ywp(this, 6, (byte) 14));
        this.i = xqu.b(new ywp(this, 2, (byte) 14));
        this.t = xqu.b(new ywp(this, 1, (byte) 14));
        this.X = xqu.b(new ywp(this, 8, (byte) 14));
        this.Y = xqu.b(new ywp(this, 7, (byte) 14));
    }

    public h72(s3p0 s3p0Var, r3p0 r3p0Var) {
        this.a = (byte) 14;
        this.b = s3p0Var;
        this.c = r3p0Var;
        this.d = xqu.b(new bsp(this, 0, (byte) 23));
        this.e = xqu.b(new bsp(this, 1, (byte) 23));
        this.f = iy81.a(new bsp(this, 2, (byte) 23));
        this.g = xqu.b(new bsp(this, 3, (byte) 23));
        this.h = xqu.b(new bsp(this, 4, (byte) 23));
        this.i = xqu.b(new bsp(this, 5, (byte) 23));
        this.t = xqu.b(new bsp(this, 6, (byte) 23));
        this.X = xqu.b(new bsp(this, 7, (byte) 23));
        this.Y = xqu.b(new bsp(this, 8, (byte) 23));
    }

    public h72(daq daqVar, PartnerAccountLinkingActivity partnerAccountLinkingActivity) {
        this.a = (byte) 17;
        this.c = daqVar;
        this.b = partnerAccountLinkingActivity;
        this.d = new s2q(daqVar, this, 1, (byte) 21);
        this.e = new s2q(daqVar, this, 2, (byte) 21);
        this.f = new s2q(daqVar, this, 0, (byte) 21);
        this.g = xqu.b(new s2q(daqVar, this, 5, (byte) 21));
        this.h = xqu.b(new s2q(daqVar, this, 4, (byte) 21));
        this.i = new s2q(daqVar, this, 3, (byte) 21);
        this.t = new s2q(daqVar, this, 7, (byte) 21);
        this.X = xqu.b(new s2q(daqVar, this, 6, (byte) 21));
        this.Y = xqu.b(new s2q(daqVar, this, 8, (byte) 21));
    }
}
