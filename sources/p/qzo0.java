package p;

import android.content.res.Resources;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qzo0 implements wpw {
    public final o3r N0;
    public final o3r O0;
    public final o3r P0;
    public final o3r Q0;
    public final poy0 R0;
    public final ia00 S0;
    public final nsw T0;
    public final Resources X;
    public final gh4 Y;
    public final vbs Z;
    public final FlowableFilter a;
    public final ruz b;
    public final azo0 c;
    public final d0r d;
    public final kp00 e;
    public final k811 f;
    public final cbv g;
    public final e7p0 h;
    public final yqg i;
    public final h0p0 t;

    public qzo0(FlowableFilter flowableFilter, ruz ruzVar, azo0 azo0Var, d0r d0rVar, o241 o241Var, yna0 yna0Var, ac10 ac10Var, iir iirVar, gid gidVar, kp00 kp00Var, k811 k811Var, cbv cbvVar, e7p0 e7p0Var, yqg yqgVar, h0p0 h0p0Var, Resources resources, gh4 gh4Var, vbs vbsVar, r1p0 r1p0Var, tap tapVar) {
        this.a = flowableFilter;
        this.b = ruzVar;
        this.c = azo0Var;
        this.d = d0rVar;
        this.e = kp00Var;
        this.f = k811Var;
        this.g = cbvVar;
        this.h = e7p0Var;
        this.i = yqgVar;
        this.t = h0p0Var;
        this.X = resources;
        this.Y = gh4Var;
        this.Z = vbsVar;
        jd11 jd11Var = rc11.a;
        this.N0 = w3p1.o(new l4r(new wlu(jd11Var.b(jo70.class)), 2, cmo0.Y0, new j4r(cmo0.U0), cmo0.Z0), cmo0.V0);
        this.O0 = w3p1.o(new l4r(new xv00(jd11Var.b(mtl.class)), 2, cmo0.a1, new j4r(cmo0.Q0), cmo0.b1), cmo0.R0);
        this.P0 = w3p1.o(new l4r(jd0.h, 2, cmo0.c1, new j4r(cmo0.O0), cmo0.d1), cmo0.P0);
        wlu wluVar = new wlu(jd11Var.b(jo70.class));
        ppa0 ppa0Var = lo70.a;
        this.Q0 = w3p1.o(new l4r(wluVar, 2, cmo0.e1, new k4r(cmo0.W0, ppa0Var), pzo0.b), cmo0.X0);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedS = flowableFilter.s(zz10.Q0);
        a020 a020Var = a020.R0;
        FlowableMap flowableMapJ = flowableFilter.J(a020Var);
        Function function = Functions.a;
        byte b = 2;
        Flowable flowableJ = flowableMapJ.t(function).j(new cax(this, b));
        Flowable flowableU = flowableFilter.J(ta20.R0).j(ac10Var).U(Boolean.FALSE);
        flowableU.getClass();
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableU.t(function);
        Observable observableI = iirVar.i();
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        Flowable flowableU2 = observableI.toFlowable(backpressureStrategy).U(new hry0((kpy0) null, 3));
        flowableU2.getClass();
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT2 = flowableU2.t(function);
        Flowable flowableU3 = gidVar.e().toFlowable(backpressureStrategy).U(new t62("", ""));
        flowableU3.getClass();
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT3 = flowableU3.t(function);
        Flowable flowableU4 = ((p241) o241Var).a.map(sa20.R0).toFlowable(backpressureStrategy).U(Boolean.TRUE);
        flowableU4.getClass();
        this.R0 = y3o1.Y(Flowable.d(flowableDistinctUntilChangedS, flowableJ, flowableDistinctUntilChangedT, flowableDistinctUntilChangedT2, flowableDistinctUntilChangedT3, flowableU4.t(function), flowableFilter.J(a020Var).t(function).j(tapVar.a("nowplayingbar-track-info-speed-badge")).U(b7x.a), yoi1.h(r1p0Var.a, o6x.a), yz10.Q0), cmo0.N0, new mzo0(this, (byte) 0), new y3o0(this, (byte) 14), 8);
        this.S0 = n3o1.q(this).a(new nzo0(this, (byte) 1), n3o0.W0);
        this.T0 = jch0.j(new nzo0(this, b));
    }

    public final rqw a() {
        return this.S0;
    }

    public final rsw c() {
        return this.T0;
    }

    public final String e(int i, String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return this.X.getString(i, str, str2);
        }
        if (str == null || str.length() == 0) {
            return (str2 == null || str2.length() == 0) ? "" : str2;
        }
        return str;
    }

    public final mr20 f(o3r o3rVar, List list) {
        if (list.isEmpty()) {
            return new huz(b7x.a, (byte) 10);
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (String str : list2) {
            arrayList.add(new v3o(d3p1.H(this.d, o3rVar, str), str, (byte) 1));
        }
        return new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 29);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    public final gjf1 g(ContextTrack contextTrack, boolean z, gzo0 gzo0Var) {
        boolean z2;
        z6x z6xVarS;
        z6x z6xVar;
        mmr0 mmr0Var;
        io70 io70Var;
        lzo0 lzo0Var = gzo0Var.b;
        Map map = lzo0Var.a;
        jo70 jo70Var = (jo70) map.get(l4o1.b0(contextTrack));
        if (jo70Var == null) {
            jo70Var = new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31);
        }
        String str = jo70Var.a;
        Map map2 = lzo0Var.b;
        Map map3 = lzo0Var.d;
        Map map4 = lzo0Var.c;
        mtl mtlVar = (mtl) map2.get(l4o1.b0(contextTrack));
        if (mtlVar == null) {
            mtlVar = new mtl();
        }
        ktl ktlVar = mtlVar.a;
        vbs vbsVar = this.Z;
        boolean z3 = vbsVar.a;
        boolean z4 = vbsVar.c;
        byte b = 1;
        if (z3 && vbsVar.b) {
            Boolean bool = (Boolean) map4.get(l4o1.b0(contextTrack));
            if (bool != null ? bool.booleanValue() : false) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean zT = l4o1.T(contextTrack);
        ktl ktlVar2 = ktl.b;
        boolean z5 = zT && ktlVar == ktlVar2;
        boolean z6 = l4o1.U(contextTrack) && !l4o1.T(contextTrack) && ktlVar == ktlVar2;
        boolean z7 = l4o1.U(contextTrack) && ktlVar == ktl.c;
        if (z5) {
            jo70 jo70Var2 = (jo70) map3.get(l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_POINTER_URI));
            if (str.length() <= 0) {
                str = null;
            }
            z6x z6xVar2 = jo70Var2 != null ? jo70Var2.d : null;
            if (z6xVar2 == null) {
                z6xVar2 = z6x.a;
            }
            mmr0Var = new mmr0(str, o7h.y0((Iterable) z6xVar2, ", ", (String) null, (String) null, cmo0.S0, 30));
        } else if (z6) {
            jo70 jo70Var3 = (jo70) map.get(contextTrack.uri());
            if (jo70Var3 == null) {
                jo70Var3 = new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31);
            }
            io70 io70Var2 = jo70Var.e;
            String strE = e(2131959225, str, io70Var2 != null ? io70Var2.a : null);
            if (strE.length() == 0) {
                strE = null;
            }
            String strY0 = o7h.y0(jo70Var.d, ", ", (String) null, (String) null, cmo0.T0, 30);
            io70 io70Var3 = jo70Var3.e;
            String strE2 = e(2131959224, strY0, io70Var3 != null ? io70Var3.a : null);
            if (strE2.length() == 0) {
                strE2 = null;
            }
            mmr0Var = new mmr0(strE, strE2);
        } else if (z7) {
            if (str.length() <= 0) {
                str = null;
            }
            jo70 jo70Var4 = (jo70) map3.get(l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_POINTER_URI));
            mmr0Var = new mmr0(str, (jo70Var4 == null || (io70Var = jo70Var4.e) == null) ? null : io70Var.a);
        } else {
            if (str.length() <= 0) {
                str = null;
            }
            if (z && l4o1.L(contextTrack)) {
                z6xVar = "";
            } else {
                j341 j341VarJ = cev0.J(jo70Var, ktlVar, u890.j(map4.get(l4o1.b0(contextTrack)), Boolean.TRUE), z4);
                if (j341VarJ != null) {
                    z6xVarS = j341VarJ.a(new mzo0(this, b));
                } else {
                    z6xVarS = l0p1.s(jo70Var, ktlVar, z2 && z4);
                }
                z6xVar = z6xVarS.length() != 0 ? z6xVarS : null;
            }
            mmr0Var = new mmr0(str, z6xVar);
        }
        return xyn1.w(contextTrack, z, (String) mmr0Var.b, (String) mmr0Var.a, new wao0(1, this.g, cbv.class, "indicatorEligibleToShowForTrack", "indicatorEligibleToShowForTrack(Lcom/spotify/player/model/ContextTrack;)Z", 0, (byte) 1));
    }

    public final mqw getBehavior() {
        return this.R0;
    }
}
