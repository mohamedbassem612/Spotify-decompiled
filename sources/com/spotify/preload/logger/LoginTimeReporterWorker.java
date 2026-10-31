package com.spotify.preload.logger;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.androidx.workmanager.DaggerRxWorker;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import p.r2f0;
import p.ydh;
import p.yqg;
import p.z8d0;
import p.zsc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class LoginTimeReporterWorker extends DaggerRxWorker {
    public Observable h;
    public zsc i;
    public yqg j;

    public LoginTimeReporterWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final Single h() {
        WorkerParameters workerParameters = ((z8d0) this).b;
        boolean zA = workerParameters.b.a("afterAccountCreation");
        long jB = workerParameters.b.b("timeInMillisWhenCreatedWork", 0L);
        Flowable flowable = this.h.toFlowable(BackpressureStrategy.b);
        return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMap(new r2f0(this, jB, zA));
    }
}
