package p;

import android.content.res.Resources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lun0 implements FlowableTransformer {
    public final bnj0 a;
    public final Resources b;
    public final spq0 c;
    public final q8n d;

    public lun0(bnj0 bnj0Var, Resources resources, spq0 spq0Var, q8n q8nVar) {
        this.a = bnj0Var;
        this.b = resources;
        this.c = spq0Var;
        this.d = q8nVar;
    }

    public final moy0 a(Flowable flowable) {
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowable.t(Functions.a);
        vbm[] vbmVarArr = q601.a;
        return yoi1.h(rqt0.u(hu20.e(new kge(flowableDistinctUntilChangedT), new zz90((lnm) null, (Object) this, (byte) 27))), this.d);
    }
}
