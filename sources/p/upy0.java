package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class upy0 implements dwo {
    public final Object X;
    public final Object Y;
    public final /* synthetic */ byte a;
    public final llm b;
    public final Object c;
    public final kly0 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public upy0(mrj1 mrj1Var, jly0 jly0Var, hqp0 hqp0Var, lvw0 lvw0Var, Single single, rma rmaVar, aj4 aj4Var, y2g0 y2g0Var, o5n o5nVar, huh0 huh0Var, q8n q8nVar) {
        this.a = (byte) 1;
        this.c = mrj1Var;
        this.d = jly0Var;
        this.e = hqp0Var;
        this.f = lvw0Var;
        this.g = rmaVar;
        this.h = aj4Var;
        this.i = y2g0Var;
        this.t = o5nVar;
        this.X = huh0Var;
        this.Y = new vku();
        llm llmVarX = l1d.x(q8nVar);
        this.b = llmVarX;
        c921.y(llmVarX, (o8n) null, 0, new yy11((byte) 7), 3);
        y2g0Var.b("VideoPlayerService", new mah1(this, single, (byte) 23));
        c921.y(llmVarX, (o8n) null, 0, new fkj1(this, (lnm) null, (byte) 5), 3);
    }

    public static CompletableOnErrorComplete a(Completable completable) {
        return completable.h(mux0.i).o(Functions.h);
    }

    @Override // p.dwo
    public final void shutdown() throws InterruptedException {
        switch (this.a) {
            case 0:
                smo1.q(this.b);
                break;
            default:
                CountDownLatch countDownLatch = new CountDownLatch(1);
                ((y2g0) this.i).b("VideoPlayerService", new mah1(this, new r4t(new o2b1(countDownLatch, (byte) 23)), (byte) 24));
                countDownLatch.await();
                break;
        }
    }

    public upy0(ykq ykqVar, ykq ykqVar2, y170 y170Var, ykq ykqVar3, ykq ykqVar4, ykq ykqVar5, ykq ykqVar6, ykq ykqVar7, ykq ykqVar8, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 0;
        this.c = ykqVar;
        this.d = ykqVar2;
        this.X = y170Var;
        this.e = ykqVar3;
        this.f = ykqVar4;
        this.g = ykqVar5;
        this.h = ykqVar6;
        this.i = ykqVar7;
        this.t = ykqVar8;
        this.Y = q8nVar2;
        llm llmVarE = smo1.e(ilo1.B(new z8n("PuffinDaemon"), q8nVar).y(new v62((byte) 17)));
        this.b = llmVarE;
        c921.y(llmVarE, (o8n) null, 0, new vse0(this, (lnm) null, (byte) 11), 3);
    }
}
