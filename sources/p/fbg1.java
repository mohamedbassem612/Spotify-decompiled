package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fbg1 {
    public final /* synthetic */ bbg1 a;

    public fbg1(bbg1 bbg1Var) {
        this.a = bbg1Var;
    }

    public final adg1 a(d0r d0rVar, iac0 iac0Var, uot0 uot0Var) {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        yon1.D4();
        f0a f0aVar = (f0a) ((htq) ((jly0) new f0a(this.a.create(), uot0Var, iac0Var).P0).get()).a.c;
        uag1 uag1VarI = ((cbg1) f0aVar.b).i();
        c8o.l(uag1VarI);
        tag1 tag1VarA = uag1VarI.a();
        FlowableMap flowableMapA = f0aVar.A();
        cbg1 cbg1Var = (cbg1) f0aVar.b;
        Flowable flowableF = cbg1Var.f();
        c8o.l(flowableF);
        FlowableOnBackpressureLatest flowableOnBackpressureLatest = new FlowableOnBackpressureLatest(flowableF);
        mo9 mo9Var = mo9.Z;
        Flowable flowableJ = flowableOnBackpressureLatest.j(mo9Var);
        ok10 ok10Var = ok10.X0;
        FlowableFilter flowableFilterX = flowableJ.x(ok10Var);
        sl10 sl10Var = sl10.b1;
        bnj0 bnj0Var = new bnj0(flowableMapA, flowableFilterX.J(sl10Var));
        ou8 ou8Var = new ou8((byte) 0);
        xv81 xv81Var = new xv81((byte) 5);
        dr41 dr41Var = new dr41(f0aVar.z(), (byte) 3);
        FlowableMap flowableMapA2 = f0aVar.A();
        Flowable flowableF2 = cbg1Var.f();
        c8o.l(flowableF2);
        bnj0 bnj0Var2 = new bnj0(flowableMapA2, new FlowableOnBackpressureLatest(flowableF2).j(mo9Var).x(ok10Var).J(sl10Var));
        j4f1 j4f1VarS = f0aVar.s();
        q8n q8nVarE = cbg1Var.e();
        c8o.l(q8nVarE);
        yxb0 yxb0Var = new yxb0(dr41Var, bnj0Var2, j4f1VarS, q8nVarE);
        ng20 ng20Var = new ng20(f0aVar.s(), cbg1Var.n());
        et90 et90VarU = f0aVar.u();
        qj0 qj0Var = new qj0(f0aVar.A(), f0aVar.z());
        zhy zhyVarQ = f0aVar.q();
        u710 u710VarR = f0aVar.r();
        ldo ldoVar = new ldo(f0aVar.A(), f0aVar.z());
        luk lukVarK = cbg1Var.k();
        c8o.l(lukVarK);
        boolean zA = new vz4(false, false, lukVarK).a();
        luk lukVarK2 = cbg1Var.k();
        c8o.l(lukVarK2);
        boolean zB = new vz4(false, false, lukVarK2).b();
        gw70 gw70VarB = cbg1Var.b();
        c8o.l(gw70VarB);
        return new adg1(d0rVar, tag1VarA, bnj0Var, ou8Var, xv81Var, yxb0Var, ng20Var, et90VarU, qj0Var, zhyVarQ, u710VarR, ldoVar, zA, zB, gw70VarB, (fcd1) ((jly0) f0aVar.Z).get(), new ecd1(f0aVar.s(), (fcd1) ((jly0) f0aVar.Z).get()), f0aVar.s());
    }
}
