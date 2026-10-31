package com.spotify.lyrics.fullscreenview.page;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a2k;
import p.d6d1;
import p.fn10;
import p.gcb0;
import p.gn10;
import p.gw70;
import p.h0i;
import p.i1k0;
import p.i8h1;
import p.j2i;
import p.jgd0;
import p.jik1;
import p.l6h1;
import p.lik1;
import p.lir0;
import p.mir0;
import p.mno1;
import p.mqp;
import p.mwn0;
import p.n6r0;
import p.n7h1;
import p.nik1;
import p.o6r0;
import p.ou80;
import p.p6r0;
import p.qdd1;
import p.rg30;
import p.rjf0;
import p.t3b1;
import p.u890;
import p.wjf0;
import p.yon1;
import p.yrn0;
import p.zlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/spotify/lyrics/fullscreenview/page/LyricsFullscreenPageActivity;", "Lp/t3b1;", "Lp/jik1;", "Lp/fn10;", "Lp/o6r0;", "<init>", "()V", "src_main_java_com_spotify_lyrics_fullscreenview-fullscreenview"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class LyricsFullscreenPageActivity extends t3b1 implements jik1, fn10, o6r0 {
    public static final /* synthetic */ int p1 = 0;
    public a2k f1;
    public i8h1 g1;
    public l6h1 h1;
    public n7h1 i1;
    public lir0 j1;
    public mqp k1;
    public mwn0 l1;
    public gw70 m1;
    public final gn10 n1 = mno1.Y;
    public final lik1 o1 = nik1.R0;

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getN1() {
        return this.n1;
    }

    public final mir0 c() {
        lir0 lir0Var = this.j1;
        if (lir0Var != null) {
            return lir0Var.c();
        }
        u890.C("pageViewObservableProvider");
        throw null;
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("LYRICS_FULLSCREEN", "lyrics/fullscreen", 968, "lyrics");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        mwn0 mwn0Var = this.l1;
        if (mwn0Var == null) {
            u890.C("navigationLogger");
            throw null;
        }
        mwn0Var.e(new yrn0((ou80) null));
        mwn0 mwn0Var2 = this.l1;
        if (mwn0Var2 == null) {
            u890.C("navigationLogger");
            throw null;
        }
        mwn0Var2.f(new yrn0((ou80) null));
        super/*android.app.Activity*/.finish();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            overrideActivityTransition(1, 2130772027, 2130772028, 0);
        } else if (i >= 33) {
            overridePendingTransition(2130772027, 2130772028, 0);
        } else {
            overridePendingTransition(2130772027, 2130772028);
        }
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getO1() {
        return this.o1;
    }

    public final rg30 l0() {
        a2k a2kVar = this.f1;
        if (a2kVar != null) {
            return a2kVar;
        }
        u890.C("compositeFragmentFactory");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        wjf0 wjf0VarY;
        qdd1 qdd1Var = new qdd1(0, 0, 2, d6d1.U0);
        zlv.a(this, qdd1Var, qdd1Var);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            overrideActivityTransition(0, 2130772027, 2130772028, 0);
        } else if (i >= 33) {
            overridePendingTransition(2130772027, 2130772028, 0);
        } else {
            overridePendingTransition(2130772027, 2130772028);
        }
        super.onCreate(bundle);
        if (bundle != null) {
            wjf0VarY = i1k0.y(bundle);
        } else {
            Bundle extras = getIntent().getExtras();
            wjf0VarY = extras != null ? i1k0.y(extras) : new wjf0();
        }
        mqp mqpVar = this.k1;
        if (mqpVar == null) {
            u890.C("lyricsFullscreenPageElementFactory");
            throw null;
        }
        h0i.a(this, new j2i(1751419786, new rjf0(this, ((mqp) mqpVar.b).a(new jgd0(this, (byte) 26), gcb0.a), wjf0VarY, (byte) 2), true));
        View coordinatorLayout = new CoordinatorLayout(this);
        coordinatorLayout.setId(2131431013);
        coordinatorLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        ((ViewGroup) findViewById(R.id.content)).addView(coordinatorLayout);
    }
}
