package p;

import com.spotify.messages.UbiProd1Impression;
import com.spotify.pending_events.esperanto.proto.AddPendingEventRequest;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n6h1 implements l6h1 {
    public final k690 a;
    public final i8h1 b;
    public final yqg c;
    public final p6h1 d;
    public final v6h1 e;
    public final m8h1 f;
    public final Scheduler g;
    public final Scheduler h;
    public final CompositeDisposable i;
    public final Map t = Collections.synchronizedMap(new LinkedHashMap());

    public n6h1(k690 k690Var, i8h1 i8h1Var, yqg yqgVar, p6h1 p6h1Var, v6h1 v6h1Var, s7h1 s7h1Var, m8h1 m8h1Var, Scheduler scheduler, Scheduler scheduler2, CompositeDisposable compositeDisposable) {
        this.a = k690Var;
        this.b = i8h1Var;
        this.c = yqgVar;
        this.d = p6h1Var;
        this.e = v6h1Var;
        this.f = m8h1Var;
        this.g = scheduler;
        this.h = scheduler2;
        this.i = compositeDisposable;
    }

    public final j6h1 a(k6h1 k6h1Var, u6h1 u6h1Var) {
        SingleSubject singleSubject = new SingleSubject();
        String str = u6h1Var.a;
        j6h1 j6h1VarW = y2o1.w(str);
        this.t.put(j6h1VarW, singleSubject);
        long jB = this.c.b();
        y6r0 y6r0Var = u6h1Var.b;
        String str2 = y6r0Var != null ? y6r0Var.a : null;
        String str3 = u6h1Var.c;
        String str4 = u6h1Var.d;
        String str5 = u6h1Var.e;
        String str6 = u6h1Var.f;
        String str7 = u6h1Var.g;
        String str8 = u6h1Var.h;
        l7h1 l7h1Var = k6h1Var.a;
        g6h1.Companion.getClass();
        UbiProd1Impression ubiProd1ImpressionD = b7h1.d(null, str, l7h1Var, Long.valueOf(jB), str2, str3, str4, str5, str6, str7, false, str8, null, g6h1.e);
        z8h1 z8h1Var = new z8h1(u6h1Var, k6h1Var.a);
        ii1 ii1VarN = AddPendingEventRequest.n();
        ii1VarN.q("UbiProd1Impression");
        ii1VarN.n(ubiProd1ImpressionD.toByteString());
        this.i.b(this.d.a.callSingle("spotify.pending_events.esperanto.proto.PendingEvents", "AddPendingEvent", ii1VarN.build()).map(dj20.U0).flatMap(new ffe1(z8h1Var, ubiProd1ImpressionD, (byte) 21)).subscribeOn(this.g).observeOn(this.h).subscribe(new z2a1(singleSubject, (byte) 21), new jkt0(this, (byte) 10)));
        return j6h1VarW;
    }

    @Override // p.l6h1
    public final j6h1 d(k6h1 k6h1Var) {
        l7h1 l7h1Var = k6h1Var.a;
        if (((Boolean) this.a.invoke()).booleanValue()) {
            this.b.f(l7h1Var, null);
            return y2o1.x();
        }
        this.f.a(l7h1Var);
        return a(k6h1Var, this.e.a());
    }

    @Override // p.l6h1
    public final String k(j6h1 j6h1Var) {
        Single single = (Single) this.t.remove(j6h1Var);
        if (single == null) {
            return null;
        }
        this.i.b(single.subscribeOn(this.g).observeOn(this.h).subscribe(new m6h1(this, this.c.b()), new jkt0(this, (byte) 11)));
        return j6h1Var.a();
    }
}
