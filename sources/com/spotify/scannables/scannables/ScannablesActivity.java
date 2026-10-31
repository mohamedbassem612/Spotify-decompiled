package com.spotify.scannables.scannables;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.ai41;
import p.b8k1;
import p.bi41;
import p.ci41;
import p.d241;
import p.ees;
import p.ei41;
import p.f341;
import p.ges;
import p.h190;
import p.i1n0;
import p.k241;
import p.kx40;
import p.lik1;
import p.mbq;
import p.mgx0;
import p.mir0;
import p.nik1;
import p.p2r;
import p.p6r0;
import p.pap1;
import p.q1n0;
import p.qdd1;
import p.qir0;
import p.r7k1;
import p.t3b1;
import p.u5b;
import p.u890;
import p.uw0;
import p.x7r0;
import p.xh41;
import p.yon1;
import p.zh41;
import p.zlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/scannables/scannables/ScannablesActivity;", "Lp/t3b1;", "Lp/iac0;", "<init>", "()V", "src_main_java_com_spotify_scannables_scannables-scannables"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class ScannablesActivity extends t3b1 {
    public static final /* synthetic */ int k1 = 0;
    public q1n0 f1;
    public i1n0 g1;
    public mbq h1;
    public xh41 i1;
    public k241 j1;

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.T4(), (qir0) null, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i, int i2, Intent intent) {
        xh41 xh41Var = this.i1;
        if (xh41Var != null) {
            ei41 ei41Var = xh41Var.d;
            if (ei41Var != null) {
                uw0 uw0Var = ei41Var.e;
                CompositeDisposable compositeDisposable = (CompositeDisposable) uw0Var.b;
                Scheduler scheduler = (Scheduler) uw0Var.h;
                Activity activity = ei41Var.a;
                if (i != 4567) {
                    if (i == 10001) {
                        if (i2 == -1) {
                            compositeDisposable.b(((Flowable) uw0Var.g).x(new f341((byte) 14)).z().observeOn(scheduler).subscribe(new bi41(uw0Var, activity, (byte) 0)));
                        } else {
                            activity.setResult(0);
                            activity.finish();
                        }
                    }
                } else if (i2 == -1) {
                    ContentResolver contentResolver = activity.getContentResolver();
                    Uri data = intent.getData();
                    ((Disposable) uw0Var.Z).dispose();
                    ((d241) uw0Var.e).getClass();
                    Disposable disposableSubscribe = Observable.fromCallable(new p2r(contentResolver, data, (byte) 6)).observeOn(scheduler).subscribeOn((Scheduler) uw0Var.c).flatMap(new ci41(uw0Var, (byte) 0)).doOnSubscribe(new zh41(uw0Var, (byte) 0)).observeOn(scheduler).subscribe((ai41) uw0Var.O0, (ai41) uw0Var.N0);
                    uw0Var.Z = disposableSubscribe;
                    compositeDisposable.b(disposableSubscribe);
                }
            }
        } else if (i2 != -1) {
            setResult(0);
            finish();
        }
        super/*p.dac0*/.onActivityResult(i, i2, intent);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super/*p.gj5*/.onConfigurationChanged(configuration);
        xh41 xh41Var = this.i1;
        if (xh41Var != null) {
            xh41Var.stop();
            xh41Var.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zlv.b(this, (qdd1) null, 3);
        h190 h190Var = new h190(Boolean.valueOf(getIntent().getBooleanExtra("EXTRA_SOCIAL_LISTENING", false)), (byte) 2);
        q1n0 q1n0Var = this.f1;
        if (q1n0Var == null) {
            u890.C("pageLoaderFactory");
            throw null;
        }
        this.j1 = q1n0Var.a(h190Var);
        i1n0 i1n0Var = this.g1;
        if (i1n0Var == null) {
            u890.C("viewBuilderFactory");
            throw null;
        }
        lik1 lik1Var = nik1.a3;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarT4 = yon1.T4();
        ees eesVarA = i1n0Var.a(new x7r0(p6r0VarT4), pap1.C(lik1Var));
        eesVarA.a.b = new u5b(this, (byte) 6);
        ges gesVarA = eesVarA.a(this);
        k241 k241Var = this.j1;
        k241Var.getClass();
        gesVarA.E(this, k241Var);
        mgx0 mgx0Var = mgx0.h;
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(gesVarA, mgx0Var);
        setContentView(gesVarA);
    }

    public final void onPause() {
        super/*p.dac0*/.onPause();
        k241 k241Var = this.j1;
        k241Var.getClass();
        k241Var.b();
    }

    public final void onResume() {
        super/*p.dac0*/.onResume();
        k241 k241Var = this.j1;
        k241Var.getClass();
        k241Var.a();
    }
}
