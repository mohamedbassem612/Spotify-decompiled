package com.spotify.accountswitching.accountpickerimpl;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p.b8k1;
import p.bhn0;
import p.daq;
import p.en;
import p.fn;
import p.gn;
import p.gw70;
import p.hn;
import p.i8h1;
import p.in;
import p.jn;
import p.jq;
import p.l1d;
import p.m480;
import p.m5n1;
import p.ns80;
import p.on;
import p.qn;
import p.r7k1;
import p.t3b1;
import p.t7o0;
import p.toj0;
import p.u890;
import p.u961;
import p.wn;
import p.xn;
import p.ycc1;
import p.yn;
import p.yyp;
import p.zn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/accountswitching/accountpickerimpl/AccountPickerActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_accountswitching_accountpickerimpl-accountpickerimpl"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class AccountPickerActivity extends t3b1 {
    public MobiusLoop.Controller f1;
    public u961 g1;
    public zn h1;
    public yyp i1;
    public ycc1 j1;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayoutInflate = getLayoutInflater().inflate(2131623966, (ViewGroup) null, false);
        int i = 2131429639;
        EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131429639);
        if (encoreTextViewT != null) {
            i = 2131430614;
            RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131430614);
            if (recyclerViewT != null) {
                i = 2131431356;
                EncoreTextView encoreTextViewT2 = m5n1.t(constraintLayoutInflate, 2131431356);
                if (encoreTextViewT2 != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    this.g1 = new u961(constraintLayout, encoreTextViewT, recyclerViewT, encoreTextViewT2);
                    setContentView(constraintLayout);
                    yyp yypVar = this.i1;
                    if (yypVar == null) {
                        u890.C("viewFactory");
                        throw null;
                    }
                    u961 u961Var = this.g1;
                    if (u961Var == null) {
                        u890.C("binding");
                        throw null;
                    }
                    daq daqVar = (daq) ((toj0) yypVar.a.d).c;
                    qn qnVar = new qn(u961Var, new en((gw70) daqVar.d8.get(), new ycc1((i8h1) daqVar.A5.get())));
                    zn znVar = this.h1;
                    if (znVar == null) {
                        u890.C("viewModelFactory");
                        throw null;
                    }
                    wn wnVar = new wn();
                    jn jnVar = znVar.a;
                    RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                    subtypeEffectHandlerBuilderC.c(hn.class, new in(this, jnVar, (byte) 0));
                    subtypeEffectHandlerBuilderC.c(fn.class, new in(jnVar, this));
                    subtypeEffectHandlerBuilderC.c(gn.class, new in(this, jnVar, (byte) 2));
                    MobiusLoop.Controller controllerA = MobiusAndroid.a(l1d.g(Mobius.d(wnVar, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).c(RxEventSources.a(new ObservableSource[]{((jq) znVar.b.get()).k().map(ns80.e).toObservable()}), new EventSource[0])).d(new xn(znVar)).b(new yn(znVar)), on.b);
                    controllerA.c(qnVar);
                    this.f1 = controllerA;
                    ycc1 ycc1Var = this.j1;
                    if (ycc1Var == null) {
                        u890.C("accountPickerLogger");
                        throw null;
                    }
                    ycc1Var.j(m480.c);
                    u961 u961Var2 = this.g1;
                    if (u961Var2 == null) {
                        u890.C("binding");
                        throw null;
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) u961Var2.a;
                    t7o0 t7o0Var = new t7o0(this, (byte) 2);
                    WeakHashMap weakHashMap = b8k1.a;
                    r7k1.c(constraintLayout2, t7o0Var);
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
    }

    public final void onDestroy() {
        super/*p.dac0*/.onDestroy();
        MobiusLoop.Controller controller = this.f1;
        if (controller != null) {
            controller.disconnect();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final void onPause() {
        super/*p.dac0*/.onPause();
        MobiusLoop.Controller controller = this.f1;
        if (controller != null) {
            controller.stop();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final void onResume() {
        super/*p.dac0*/.onResume();
        MobiusLoop.Controller controller = this.f1;
        if (controller != null) {
            controller.start();
        } else {
            u890.C("controller");
            throw null;
        }
    }
}
