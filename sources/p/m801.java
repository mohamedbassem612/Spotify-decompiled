package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m801 implements EventSource {
    public final q8n a;
    public final bpb1 b;
    public final bpb1 c;
    public final mr20 d;
    public final mr20 e;
    public final wzv0 f;
    public final x010 g;

    public m801(FlowableMap flowableMap, FlowableMap flowableMap2, FlowableDistinctUntilChanged flowableDistinctUntilChanged, q8n q8nVar) {
        this.a = q8nVar;
        bpb1 bpb1VarB = gio1.b("");
        this.b = bpb1VarB;
        bpb1 bpb1VarB2 = gio1.b(z6x.a);
        this.c = bpb1VarB2;
        vbm[] vbmVarArr = q601.a;
        mr20 mr20VarU = rqt0.u(new any(new x010(new kge(flowableMap), rqt0.u(new x010(new x010(new kge(flowableMap2), bpb1VarB, new b801(3, null, (byte) 0), (byte) 1), new kge(flowableDistinctUntilChanged), new c801(3, null, (byte) 0), (byte) 1)), new vm0(3, (lnm) null, (byte) 27), (byte) 1), (byte) 18));
        this.d = rqt0.u(new x010(new x010(new kge(flowableMap2), bpb1VarB, new b801(3, null, (byte) 1), (byte) 1), rqt0.u(new h801(new kge(flowableDistinctUntilChanged), (byte) 0)), new irp0(3, (lnm) null, (byte) 15), (byte) 1));
        mr20 mr20VarU2 = rqt0.u(new x010(mr20VarU, new h5y0(bpb1VarB2, (byte) 12), new z701(3, null, (byte) 0), (byte) 1));
        this.e = rqt0.u(new h5y0(mr20VarU2, (byte) 14));
        this.f = new wzv0(new h5y0(rqt0.u(new x010(new vd0(z4p1.v(mr20VarU, 1), mr20VarU, new a801(3, (lnm) null, (byte) 0)), new wzv0(new h5y0(bpb1VarB2, (byte) 12), (byte) 7), new a801(3, (lnm) null, (byte) 1), (byte) 1)), (byte) 13), (byte) 8);
        this.g = new x010(new ve1(new x010(mr20VarU2, new h5y0(bpb1VarB2, (byte) 12), new z701(3, null, (byte) 1), (byte) 1), (byte) 8), mr20VarU, new ax9(3, null, (byte) 3), (byte) 1);
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {this.d, this.e, this.f, this.g};
        companion.getClass();
        return new b(this.a, mr20VarArr).a(new xu2(consumer, (byte) 19));
    }

    public final void b(String str, ArrayList arrayList) {
        bpb1 bpb1Var;
        Object value;
        bpb1 bpb1Var2;
        Object value2;
        do {
            bpb1Var = this.b;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, str));
        do {
            bpb1Var2 = this.c;
            value2 = bpb1Var2.getValue();
        } while (!bpb1Var2.k(value2, arrayList));
    }
}
