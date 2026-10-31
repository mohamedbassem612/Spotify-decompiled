package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zo10 implements tyq {
    public final /* synthetic */ byte a = 2;
    public final d0r b;
    public final q8n c;
    public final q8n d;
    public final f4r e;
    public final e7m0 f;
    public final psw g;
    public final ia00 h;

    public zo10(d0r d0rVar, f1n0 f1n0Var, yqg yqgVar, ihd0 ihd0Var, q8n q8nVar, q8n q8nVar2) {
        this.b = d0rVar;
        this.c = q8nVar;
        this.d = q8nVar2;
        elw elwVar = new elw(q8nVar, new j2e0(d0rVar), new v6a0(yqgVar, ihd0Var, (byte) 8), new yfc0(f1n0Var, (byte) 21), new yeu(f1n0Var));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(r850.c1, kzd.a));
        this.e = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        ml50 ml50Var = new ml50("", z6x.a, "");
        t2m t2mVar = t2m.y;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        bkw bkwVar = new bkw(elwVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nbw.class), cancelPrevious.a(bkwVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cgw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new lkw(elwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ejw(elwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ddw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jjw(elwVar)));
        this.f = sbl.B(ml50Var, t2mVar, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), new yg20(this, (byte) 15), new pl50(this));
        j2i j2iVar = eri.a;
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(d640.b1, d640.c1);
    }

    public static ml50 f(il50 il50Var) {
        String str = il50Var.a;
        String str2 = il50Var.b;
        ArrayList arrayList = il50Var.c;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((el50) it.next()).a);
        }
        return new ml50(str, arrayList2, str2);
    }

    public static Next g(nl50 nl50Var, il50 il50Var) {
        mmr0 mmr0VarQ = lm5.q(nl50Var, f(il50Var));
        return Next.i((nl50) mmr0VarQ.a, dm61.y0((Set) mmr0VarQ.b, Collections.singleton(new nbw(il50Var.c))));
    }

    public static Next h(ro10 ro10Var) {
        String str = ro10Var.a;
        fo10 fo10Var = ro10Var.b;
        String str2 = fo10Var.a;
        String str3 = fo10Var.b;
        qo10 qo10Var = fo10Var.c;
        return Next.i(new uo10(str, str2, str3, qo10Var, ro10Var.d, ro10Var.e), Collections.singleton(new qbw(str, str2, str3, qo10Var)));
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.h;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.g;
    }

    public final d0r e() {
        byte b = this.a;
        return this.b;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f;
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }

    public zo10(d0r d0rVar, f1n0 f1n0Var, q8n q8nVar, q8n q8nVar2) {
        f4r mchVar;
        this.b = d0rVar;
        this.c = q8nVar;
        this.d = q8nVar2;
        dlw dlwVar = new dlw(q8nVar, new ruc0(d0rVar, (byte) 5), new wrg(f1n0Var));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i4r(xc10.X0, kzd.a));
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.e = mchVar;
        uo10 uo10Var = new uo10("", "", (String) null, po10.a, lo10.a, false);
        t2m t2mVar = t2m.q;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        akw akwVar = new akw(dlwVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qbw.class), cancelPrevious.a(akwVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(efw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new djw(dlwVar)));
        this.f = sbl.B(uo10Var, t2mVar, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), new htu(this, (byte) 25), new yo10(this));
        j2i j2iVar = yni.a;
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(jq00.R0, jq00.S0);
    }

    public zo10(Flowable flowable, r4h1 r4h1Var, sgd0 sgd0Var, d0r d0rVar, q8n q8nVar, q8n q8nVar2) {
        f4r mchVar;
        this.b = d0rVar;
        this.c = q8nVar;
        this.d = q8nVar2;
        flw flwVar = new flw(new haa0((Object) r4h1Var, (Object) d0rVar, (Object) flowable, (byte) 29), sgd0Var, q8nVar);
        ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.e = mchVar;
        gp71 gp71Var = gp71.E;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        ckw ckwVar = new ckw(flwVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ebw.class), cancelPrevious.a(ckwVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(paw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fjw(flwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kfw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kjw(flwVar)));
        this.f = sbl.B(znm1.a, gp71Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), bom1.b, new dom1(this));
        j2i j2iVar = rsj.a;
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(yxl1.Z, yxl1.N0);
    }
}
