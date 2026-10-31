package p;

import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.processors.PublishProcessor;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aup implements q2p0 {
    public final /* synthetic */ byte a;
    public final jly0 b;
    public final jly0 c;
    public final jly0 d;
    public final jly0 e;
    public final jly0 f;
    public final jly0 g;
    public final Object h;

    public aup(z2p z2pVar, byte b) {
        this.a = (byte) 2;
        this.h = z2pVar;
        iy81.a(new bsp(this, 0, (byte) 27));
        this.b = iy81.a(new bsp(this, 2, (byte) 27));
        this.c = iy81.a(new bsp(this, 1, (byte) 27));
        this.d = iy81.a(new bsp(this, 4, (byte) 27));
        this.e = iy81.a(new bsp(this, 3, (byte) 27));
        this.f = iy81.a(new bsp(this, 5, (byte) 27));
        this.g = iy81.a(new bsp(this, 6, (byte) 27));
    }

    public final boolean a() {
        byte b = this.a;
        Object obj = this.h;
        switch (b) {
            case 0:
                return ((Boolean) ((jly0) ((h72) ((d3p) obj).a).Y).get()).booleanValue();
            case 1:
                return ((Boolean) ((v3p0) ((wj3) ((z2p) obj).b).b).g.get()).booleanValue();
            default:
                return ((Boolean) ((v4p0) ((wdm) ((z2p) obj).b).b).b.get()).booleanValue();
        }
    }

    public final iac0 b() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return (iac0) this.b.get();
    }

    public final uqb1 c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return (uqb1) this.g.get();
    }

    public final PublishProcessor d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return (PublishProcessor) this.f.get();
    }

    public final lik1 e() {
        switch (this.a) {
            case 0:
                return d8.c((r3p0) ((h72) ((d3p) this.h).a).c);
            case 1:
                return d8.c(new vuf0((byte) 1));
            default:
                return d8.c(new vuf0((byte) 2));
        }
    }

    public final gn10 f() {
        switch (this.a) {
            case 0:
                return j310.r((r3p0) ((h72) ((d3p) this.h).a).c);
            case 1:
                return mno1.M;
            default:
                return mno1.M;
        }
    }

    public final FlowableTransformer g() {
        byte b = this.a;
        Object obj = this.h;
        switch (b) {
            case 0:
                FlowableTransformer flowableTransformer = (FlowableTransformer) ((jly0) ((d3p) obj).b).get();
                c8o.l(flowableTransformer);
                return flowableTransformer;
            case 1:
                FlowableTransformer flowableTransformer2 = (FlowableTransformer) ((z2p) obj).a.get();
                c8o.l(flowableTransformer2);
                return flowableTransformer2;
            default:
                FlowableTransformer flowableTransformer3 = (FlowableTransformer) ((z2p) obj).a.get();
                c8o.l(flowableTransformer3);
                return flowableTransformer3;
        }
    }

    public final o2p0 h() {
        byte b = this.a;
        Object obj = this.h;
        switch (b) {
            case 0:
                o2p0 o2p0Var = (o2p0) ((jly0) ((h72) ((d3p) obj).a).f).get();
                c8o.l(o2p0Var);
                return o2p0Var;
            case 1:
                o2p0 o2p0Var2 = (o2p0) ((jly0) ((wj3) ((z2p) obj).b).g).get();
                c8o.l(o2p0Var2);
                return o2p0Var2;
            default:
                o2p0 o2p0Var3 = (o2p0) ((jly0) ((wdm) ((z2p) obj).b).g).get();
                c8o.l(o2p0Var3);
                return o2p0Var3;
        }
    }

    public final n6r0 i() {
        switch (this.a) {
            case 0:
                return kmq0.p((r3p0) ((h72) ((d3p) this.h).a).c);
            case 1:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return yon1.X2();
            default:
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                return yon1.Z2();
        }
    }

    public final p2p0 j() {
        byte b = this.a;
        Object obj = this.h;
        switch (b) {
            case 0:
                pyo0 pyo0Var = (pyo0) ((s3p0) ((h72) ((d3p) obj).a).b).c.get();
                c8o.l(pyo0Var);
                return pyo0Var;
            case 1:
                p2p0 p2p0Var = (p2p0) ((jly0) ((wj3) ((z2p) obj).b).O0).get();
                c8o.l(p2p0Var);
                return p2p0Var;
            default:
                wdm wdmVar = (wdm) ((z2p) obj).b;
                dg30 dg30VarA = ((r2p0) wdmVar.c).a();
                c8o.l(dg30VarA);
                v4p0 v4p0Var = (v4p0) wdmVar.b;
                return new a4p0(dg30VarA, (e7p0) v4p0Var.c.get(), (d7p0) v4p0Var.f.get());
        }
    }

    public final pqq0 k() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return (pqq0) this.d.get();
    }

    public final hnl l() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return (hnl) this.e.get();
    }

    public final t2p0 m() {
        byte b = this.a;
        Object obj = this.h;
        switch (b) {
            case 0:
                t2p0 t2p0Var = (t2p0) ((s3p0) ((h72) ((d3p) obj).a).b).g.get();
                c8o.l(t2p0Var);
                return t2p0Var;
            case 1:
                t2p0 t2p0Var2 = (t2p0) ((jly0) ((wj3) ((z2p) obj).b).P0).get();
                c8o.l(t2p0Var2);
                return t2p0Var2;
            default:
                t2p0 t2p0Var3 = (t2p0) ((jly0) ((wdm) ((z2p) obj).b).Z).get();
                c8o.l(t2p0Var3);
                return t2p0Var3;
        }
    }

    public final d0r n() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return (d0r) this.c.get();
    }

    public aup(z2p z2pVar) {
        this.a = (byte) 1;
        this.h = z2pVar;
        iy81.a(new bsp(this, 0, (byte) 25));
        this.b = iy81.a(new bsp(this, 2, (byte) 25));
        this.c = iy81.a(new bsp(this, 1, (byte) 25));
        this.d = iy81.a(new bsp(this, 4, (byte) 25));
        this.e = iy81.a(new bsp(this, 3, (byte) 25));
        this.f = iy81.a(new bsp(this, 5, (byte) 25));
        this.g = iy81.a(new bsp(this, 6, (byte) 25));
    }

    public aup(d3p d3pVar) {
        this.a = (byte) 0;
        this.h = d3pVar;
        this.b = iy81.a(new bsp(this, 1, (byte) 22));
        this.c = iy81.a(new bsp(this, 0, (byte) 22));
        this.d = iy81.a(new bsp(this, 3, (byte) 22));
        this.e = iy81.a(new bsp(this, 2, (byte) 22));
        this.f = iy81.a(new bsp(this, 4, (byte) 22));
        this.g = iy81.a(new bsp(this, 5, (byte) 22));
    }
}
