package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.player.model.Context$Metadata;
import com.spotify.player.model.ContextTrack$Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp/ts10;", "Lp/nzo;", "Lp/o6r0;", "Lp/ug30;", "<init>", "()V", "src_main_java_com_spotify_marquee_marquee-marquee"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class ts10 extends nzo implements o6r0, ug30 {
    public uny W1;
    public v2q X1;
    public yge0 Y1;
    public String Z1;
    public String a2;
    public String b2;
    public w6e0 c2;
    public AnimatorSet d2;
    public boolean e2;
    public final gn10 f2 = mno1.I;

    public final String A(Context context) {
        return "";
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        AnimatorSet animatorSet = this.d2;
        if (animatorSet != null) {
            if (!animatorSet.isRunning()) {
                animatorSet = null;
            }
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        if (this.e2) {
            return;
        }
        j1(p7h.M(new ObjectAnimator[]{j0o1.x(i1()), ObjectAnimator.ofFloat(i1(), (Property<LinearLayout, Float>) View.TRANSLATION_Y, 20.0f, 0.0f)}), new gi00(this, (byte) 12));
    }

    public final void F0(Bundle bundle) {
        bundle.putBoolean("feedback_animation_enter_completed", this.e2);
        super/*p.t2u*/.F0(bundle);
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getF2() {
        return this.f2;
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.M2(), (qir0) null, 4));
    }

    public final Dialog c1(Bundle bundle) {
        String string;
        String string2;
        ls10 ls10Var;
        ArrayList arrayList;
        String string3;
        Bundle bundle2 = ((zf30) this).f;
        String str = "";
        if (bundle2 == null || (string = bundle2.getString(ContextTrack$Metadata.KEY_ARTIST_URI, "")) == null) {
            string = "";
        }
        this.Z1 = string;
        Bundle bundle3 = ((zf30) this).f;
        if (bundle3 == null || (string2 = bundle3.getString("lineitem_id", "")) == null) {
            string2 = "";
        }
        this.a2 = string2;
        Bundle bundle4 = ((zf30) this).f;
        if (bundle4 != null && (string3 = bundle4.getString(ContextTrack$Metadata.KEY_AD_ID, "")) != null) {
            str = string3;
        }
        this.b2 = str;
        if (bundle != null) {
            this.e2 = bundle.getBoolean("feedback_animation_enter_completed", false);
        }
        View viewInflate = LayoutInflater.from(f0()).inflate(2131625180, (ViewGroup) null, false);
        int i = 2131428855;
        View viewT = m5n1.t(viewInflate, 2131428855);
        if (viewT != null) {
            i = 2131428856;
            LinearLayout linearLayout = (LinearLayout) m5n1.t(viewInflate, 2131428856);
            if (linearLayout != null) {
                i = 2131428857;
                if (((TextView) m5n1.t(viewInflate, 2131428857)) != null) {
                    i = 2131428858;
                    RecyclerView recyclerViewT = m5n1.t(viewInflate, 2131428858);
                    if (recyclerViewT != null) {
                        this.c2 = new w6e0((FrameLayout) viewInflate, viewT, linearLayout, recyclerViewT, (byte) 14);
                        rs10 rs10Var = new rs10(this, N0(), (byte) 0);
                        w6e0 w6e0Var = this.c2;
                        if (w6e0Var == null) {
                            u890.C("binding");
                            throw null;
                        }
                        rs10Var.setContentView((FrameLayout) w6e0Var.d);
                        v2q v2qVar = this.X1;
                        if (v2qVar == null) {
                            u890.C("feedbackItemInteractionFactory");
                            throw null;
                        }
                        String str2 = this.Z1;
                        if (str2 == null) {
                            u890.C("artistUri");
                            throw null;
                        }
                        String str3 = this.a2;
                        if (str3 == null) {
                            u890.C("lineItemId");
                            throw null;
                        }
                        String str4 = this.b2;
                        if (str4 == null) {
                            u890.C("adId");
                            throw null;
                        }
                        dg30 dg30VarN0 = N0();
                        switch (v2qVar.a) {
                            case 0:
                                w2q w2qVar = (w2q) v2qVar.b;
                                ls10Var = new ls10(w2qVar.c.X2(), (kt91) w2qVar.b.f8.get(), str2, str3, str4, dg30VarN0);
                                break;
                            default:
                                bup bupVar = (bup) v2qVar.b;
                                ls10Var = new ls10(((uw0) bupVar.c).u(), (kt91) ((daq) bupVar.b).f8.get(), str2, str3, str4, dg30VarN0);
                                break;
                        }
                        uny unyVar = this.W1;
                        if (unyVar == null) {
                            u890.C("feedbackOptionsGenerator");
                            throw null;
                        }
                        rug0 rug0Var = (rug0) unyVar.c;
                        List listI = rug0Var.I();
                        if (listI.isEmpty()) {
                            arrayList = listI;
                            ArrayList arrayListO = p7h.O(new lx10[]{unyVar.g(2131958189, "not_interested_releases"), unyVar.g(2131958188, "not_interested_artist"), unyVar.g(2131958191, "notifications"), unyVar.g(2131958193, "not_intersted_sponsored_content")});
                            Collections.shuffle(arrayListO, (Random) unyVar.d);
                            arrayListO.addAll(p7h.M(new lx10[]{unyVar.g(2131958190, Context$Metadata.SHUFFLE_ALGORITHM_NONE), unyVar.g(2131958192, "opt_out_confirm")}));
                            rug0Var.B(arrayListO);
                            arrayList = arrayListO;
                        }
                        arrayList = listI;
                        an anVar = new an(arrayList, LayoutInflater.from(f0()), ls10Var, (byte) 2);
                        w6e0 w6e0Var2 = this.c2;
                        if (w6e0Var2 == null) {
                            u890.C("binding");
                            throw null;
                        }
                        RecyclerView recyclerView = (RecyclerView) w6e0Var2.c;
                        f0();
                        recyclerView.setLayoutManager(new LinearLayoutManager(1));
                        w6e0 w6e0Var3 = this.c2;
                        if (w6e0Var3 == null) {
                            u890.C("binding");
                            throw null;
                        }
                        ((RecyclerView) w6e0Var3.c).setAdapter(anVar);
                        w6e0 w6e0Var4 = this.c2;
                        if (w6e0Var4 == null) {
                            u890.C("binding");
                            throw null;
                        }
                        FrameLayout frameLayout = (FrameLayout) w6e0Var4.d;
                        qs10 qs10Var = qs10.b;
                        WeakHashMap weakHashMap = b8k1.a;
                        r7k1.c(frameLayout, qs10Var);
                        return rs10Var;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.M2();
    }

    public final LinearLayout i1() {
        w6e0 w6e0Var = this.c2;
        if (w6e0Var != null) {
            return (LinearLayout) w6e0Var.e;
        }
        u890.C("binding");
        throw null;
    }

    public final void j1(List list, iu30 iu30Var) {
        AnimatorSet animatorSet = this.d2;
        if (animatorSet != null) {
            if (!animatorSet.isRunning()) {
                animatorSet = null;
            }
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(list);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new ss10(iu30Var, (byte) 0));
        animatorSet2.start();
        this.d2 = animatorSet2;
    }

    public final String s() {
        return nik1.i2.a;
    }
}
