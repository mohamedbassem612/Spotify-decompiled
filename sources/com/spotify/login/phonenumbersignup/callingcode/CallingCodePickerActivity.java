package com.spotify.login.phonenumbersignup.callingcode;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p.a680;
import p.a8o;
import p.b8k1;
import p.bhn0;
import p.c20;
import p.dac0;
import p.dg8;
import p.eg;
import p.foo1;
import p.g4b1;
import p.hac0;
import p.j1e1;
import p.j4b1;
import p.j561;
import p.jgu;
import p.lir0;
import p.lq80;
import p.lt50;
import p.m5n1;
import p.mba;
import p.mir0;
import p.n4b;
import p.q0d;
import p.r7k1;
import p.u890;
import p.x29;
import p.ydb;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/spotify/login/phonenumbersignup/callingcode/CallingCodePickerActivity;", "Lp/dac0;", "Lp/hac0;", "Lp/lt50;", "Lp/lir0;", "<init>", "()V", "p/xpn1", "src_main_java_com_spotify_login_phonenumbersignup-phonenumbersignup"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class CallingCodePickerActivity extends dac0 implements hac0, lt50, lir0 {
    public static final /* synthetic */ int g1 = 0;
    public q0d b1;
    public jgu c1;
    public mir0 d1;
    public final lq80 e1 = new lq80(new n4b(this, (byte) 3));
    public a680 f1;

    public final mir0 c() {
        mir0 mir0Var = this.d1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    public final jgu f() {
        jgu jguVar = this.c1;
        if (jguVar != null) {
            return jguVar;
        }
        u890.C("androidInjector");
        throw null;
    }

    public final a680 l0() {
        a680 a680Var = this.f1;
        if (a680Var != null) {
            return a680Var;
        }
        eg.m("Failed to bind activity_calling_code_picker");
        return null;
    }

    public final q0d m0() {
        q0d q0dVar = this.b1;
        if (q0dVar != null) {
            return q0dVar;
        }
        u890.C("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        j1e1.q(this);
        super.onCreate(bundle);
        ConstraintLayout constraintLayoutInflate = getLayoutInflater().inflate(2131623991, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        int i = 2131430614;
        RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131430614);
        if (recyclerViewT != null) {
            i = 2131430850;
            SearchView searchViewT = m5n1.t(constraintLayoutInflate, 2131430850);
            if (searchViewT != null) {
                i = 2131430852;
                FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131430852);
                if (frameLayout != null) {
                    i = 2131431397;
                    View viewT = m5n1.t(constraintLayoutInflate, 2131431397);
                    if (viewT != null) {
                        i = 2131431420;
                        View viewT2 = m5n1.t(constraintLayoutInflate, 2131431420);
                        if (viewT2 != null) {
                            this.f1 = new a680(constraintLayout, recyclerViewT, searchViewT, frameLayout, viewT, viewT2);
                            setContentView((ConstraintLayout) l0().a);
                            GlueToolbar glueToolbarCreateGlueToolbar = GlueToolbars.createGlueToolbar((View) l0().e);
                            glueToolbarCreateGlueToolbar.setTitle(getString(2131959724));
                            ToolbarSide toolbarSide = ToolbarSide.START;
                            j4b1 j4b1Var = j4b1.Q7;
                            ColorStateList colorStateListU = foo1.u(this, 2130969946);
                            StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(this, (AttributeSet) null, 2130969939);
                            stateListAnimatorImageButton.setFocusable(false);
                            stateListAnimatorImageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            stateListAnimatorImageButton.setPadding(getResources().getDimensionPixelSize(2131166883), 0, 0, 0);
                            stateListAnimatorImageButton.setMinimumWidth(0);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                            layoutParams.setMargins(0, 0, 0, 0);
                            stateListAnimatorImageButton.setLayoutParams(layoutParams);
                            g4b1 g4b1Var = new g4b1(this, j4b1Var, a8o.y(24.0f, getResources()));
                            g4b1Var.c(colorStateListU);
                            g4b1Var.d(a8o.y(24.0f, getResources()));
                            stateListAnimatorImageButton.setImageDrawable(g4b1Var);
                            stateListAnimatorImageButton.setId(2131427461);
                            stateListAnimatorImageButton.setOnClickListener(new c20(this, (byte) 12));
                            glueToolbarCreateGlueToolbar.addView(toolbarSide, stateListAnimatorImageButton, 2131427461);
                            ConstraintLayout constraintLayoutFindViewById = findViewById(2131427881);
                            j561 j561Var = j561.O0;
                            WeakHashMap weakHashMap = b8k1.a;
                            r7k1.c(constraintLayoutFindViewById, j561Var);
                            J().a(this, new ydb(this, (byte) 2));
                            ((SearchView) l0().c).setOnQueryTextFocusChangeListener(new x29(this, (byte) 1));
                            ((SearchView) l0().c).setOnQueryTextListener(new dg8(this, (byte) 12));
                            ((RecyclerView) l0().b).setLayoutManager(new LinearLayoutManager(1));
                            ((RecyclerView) l0().b).setAdapter(this.e1);
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f1 = null;
    }

    public final void onResume() {
        super.onResume();
        ((FrameLayout) l0().d).requestFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super.onStart();
        q0d q0dVarM0 = m0();
        String stringExtra = getIntent().getStringExtra("selected-country-code");
        q0dVarM0.j = this;
        q0dVarM0.k = stringExtra;
        q0dVarM0.f.b(q0dVarM0.a.c.subscribeOn(q0dVarM0.c).observeOn(q0dVarM0.b).subscribe(new mba(q0dVarM0, (byte) 13)));
    }

    public final void onStop() {
        super.onStop();
        q0d q0dVarM0 = m0();
        q0dVarM0.f.g();
        q0dVarM0.j = null;
        q0dVarM0.k = null;
        q0dVarM0.h = false;
        q0dVarM0.i = false;
    }
}
