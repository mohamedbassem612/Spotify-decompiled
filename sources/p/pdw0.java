package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pdw0 implements Connectable {
    public String N0;
    public final AtomicLong O0;
    public final AtomicLong P0;
    public i091 Q0;
    public final AtomicReference R0;
    public ayh S0;
    public vii1 T0;
    public final yjp1 X;
    public llm Y;
    public faa0 Z;
    public final aru0 a;
    public final ugn0 b;
    public final hfw0 c;
    public final w9u0 d;
    public final yqg e;
    public final jr30 f;
    public final abu0 g;
    public final zau0 h;
    public final p731 i;
    public final q8n t;

    public pdw0(aru0 aru0Var, ugn0 ugn0Var, hfw0 hfw0Var, w9u0 w9u0Var, yqg yqgVar, jr30 jr30Var, abu0 abu0Var, zau0 zau0Var, p731 p731Var, q8n q8nVar) {
        yjp1 yjp1Var = fky0.a;
        this.a = aru0Var;
        this.b = ugn0Var;
        this.c = hfw0Var;
        this.d = w9u0Var;
        this.e = yqgVar;
        this.f = jr30Var;
        this.g = abu0Var;
        this.h = zau0Var;
        this.i = p731Var;
        this.t = q8nVar;
        this.X = yjp1Var;
        this.O0 = new AtomicLong(0L);
        this.P0 = new AtomicLong(0L);
        this.R0 = new AtomicReference(null);
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        hdw0 hdw0Var = new hdw0(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zbw0.class), cancelPrevious.a(hdw0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xbw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ycw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mcw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ldw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kcw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new jdw0()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vbw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zcw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wbw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new adw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gcw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bdw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(icw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cdw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ccw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ddw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hcw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new edw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bcw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fdw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ybw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ndw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lcw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gdw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ncw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rcw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dcw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new scw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fcw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tcw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(acw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ucw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ocw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vcw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jcw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wcw0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ecw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xcw0(this)));
        return new pee0(new a(this.t, coroutinesSubtypeEffectHandlerBuilderI).L(consumer), this, (byte) 7);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, onm onmVar) throws Throwable {
        qcw0 qcw0Var;
        ayh ayhVar;
        if (onmVar instanceof qcw0) {
            qcw0Var = (qcw0) onmVar;
            int i = qcw0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qcw0Var.d = i - Integer.MIN_VALUE;
            } else {
                qcw0Var = new qcw0(this, onmVar);
            }
        } else {
            qcw0Var = new qcw0(this, onmVar);
        }
        Object obj = qcw0Var.b;
        int i2 = qcw0Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            vii1 vii1Var = this.T0;
            if (vii1Var != null) {
                this.T0 = null;
                return vii1Var;
            }
            if (j <= 0) {
                return null;
            }
            ayh ayhVarA = sap1.a();
            this.S0 = ayhVarA;
            try {
                lhb lhbVar = new lhb(ayhVarA, (lnm) null, (byte) 3);
                qcw0Var.a = ayhVarA;
                qcw0Var.d = 1;
                Object objO = rc2.O(j, lhbVar, qcw0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
                obj = objO;
                ayhVar = ayhVarA;
            } catch (Throwable th) {
                th = th;
                ayhVar = ayhVarA;
                if (this.S0 == ayhVar) {
                    this.S0 = null;
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ayhVar = qcw0Var.a;
            try {
                hm5.M(obj);
            } catch (Throwable th2) {
                th = th2;
                if (this.S0 == ayhVar) {
                    this.S0 = null;
                }
                throw th;
            }
        }
        vii1 vii1Var2 = (vii1) obj;
        if (this.S0 == ayhVar) {
            this.S0 = null;
        }
        return vii1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(vr20 vr20Var, zbw0 zbw0Var, onm onmVar) throws Throwable {
        odw0 odw0Var;
        long jB;
        r091 r091Var;
        r091 r091Var2;
        vr20 vr20Var2;
        long j;
        vr20 vr20Var3 = vr20Var;
        zbw0 zbw0Var2 = zbw0Var;
        if (onmVar instanceof odw0) {
            odw0Var = (odw0) onmVar;
            int i = odw0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                odw0Var.g = i - Integer.MIN_VALUE;
            } else {
                odw0Var = new odw0(this, onmVar);
            }
        } else {
            odw0Var = new odw0(this, onmVar);
        }
        Object obj = odw0Var.e;
        int i2 = odw0Var.g;
        AtomicLong atomicLong = this.P0;
        yqg yqgVar = this.e;
        Object obj2 = d9n.a;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 2) {
                long j2 = odw0Var.d;
                r091Var2 = odw0Var.c;
                zbw0 zbw0Var3 = odw0Var.b;
                vr20 vr20Var4 = odw0Var.a;
                hm5.M(obj);
                jB = j2;
                zbw0Var2 = zbw0Var3;
                vr20Var3 = vr20Var4;
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = odw0Var.d;
                r091Var2 = odw0Var.c;
                vr20Var2 = odw0Var.a;
                hm5.M(obj);
            }
            bpb1 bpb1Var = r091Var2.g;
            zio0 zio0Var = new zio0(2, (lnm) null, (byte) 15);
            s4q0 s4q0Var = new s4q0(this, vr20Var2);
            odw0Var.a = null;
            odw0Var.b = null;
            odw0Var.c = null;
            odw0Var.d = j;
            odw0Var.g = 4;
            bpb1Var.collect(new wem((byte) 19, new l811(), zio0Var, s4q0Var), odw0Var);
            return obj2;
        }
        hm5.M(obj);
        if (zbw0Var2.h <= atomicLong.get()) {
            return rih1Var;
        }
        this.Z = odw0Var.getContext().A(fkj0.W0);
        jB = yqgVar.b();
        aru0 aru0Var = this.a;
        r091 r091Var3 = (r091) aru0Var.b;
        if (r091Var3 == null || ((Boolean) r091Var3.d.e.getValue()).booleanValue() || ((Boolean) r091Var3.e.b.getValue()).booleanValue()) {
            zau0 zau0Var = this.h;
            if (zau0Var != null && zau0Var.b() == 0 && (r091Var = (r091) aru0Var.b) != null) {
                r091Var.g();
            }
            aru0Var.b = zau0Var != null ? zau0Var.a() : null;
        }
        aru0Var.t();
        r091 r091Var4 = (r091) aru0Var.b;
        if (r091Var4 == null) {
            if (zbw0Var2.h == this.O0.get()) {
                this.T0 = null;
                odw0Var.a = null;
                odw0Var.b = null;
                odw0Var.c = null;
                odw0Var.d = jB;
                odw0Var.g = 1;
                if (vr20Var3.emit(zdw0.a, odw0Var) == obj2) {
                }
            }
            return rih1Var;
        }
        lsm0 lsm0VarA = zbw0Var2.a;
        long j3 = zbw0Var2.e;
        if (j3 > 0) {
            jsm0 jsm0Var = lsm0VarA.e;
            lsm0VarA = lsm0.a(lsm0VarA, (ksm0) null, new jsm0(Long.valueOf(j3), jsm0Var != null ? jsm0Var.b : null), 2031);
        }
        r091Var4.b(lsm0VarA);
        long j4 = zbw0Var2.d;
        odw0Var.a = vr20Var3;
        odw0Var.b = zbw0Var2;
        odw0Var.c = r091Var4;
        odw0Var.d = jB;
        odw0Var.g = 2;
        Object objA = a(j4, odw0Var);
        if (objA != obj2) {
            r091Var2 = r091Var4;
            obj = objA;
        }
        return obj2;
        vii1 vii1Var = (vii1) obj;
        if (zbw0Var2.h <= atomicLong.get()) {
            return rih1Var;
        }
        if (zbw0Var2.g) {
            tv80 tv80VarA = zbw0Var2.f;
            if (tv80VarA == null) {
                tv80VarA = vii1Var != null ? vii1Var.a : null;
                if (tv80VarA == null) {
                    String str = zbw0Var2.b;
                    ksm0 ksm0Var = zbw0Var2.a.b;
                    String str2 = ksm0Var.e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    tv80VarA = this.c.a(str, str2, ksm0Var.a instanceof gec1);
                }
            }
            r091Var2.e(tv80VarA, new Long(vii1Var != null ? yqgVar.b() : jB), zbw0Var2.c, this.X);
        }
        if (this.b.a()) {
            r091Var2.c();
        } else {
            r091Var2.k();
        }
        odw0Var.a = vr20Var3;
        odw0Var.b = null;
        odw0Var.c = r091Var2;
        odw0Var.d = jB;
        odw0Var.g = 3;
        if (vr20Var3.emit(aew0.a, odw0Var) != obj2) {
            vr20Var2 = vr20Var3;
            j = jB;
            bpb1 bpb1Var2 = r091Var2.g;
            zio0 zio0Var2 = new zio0(2, (lnm) null, (byte) 15);
            s4q0 s4q0Var2 = new s4q0(this, vr20Var2);
            odw0Var.a = null;
            odw0Var.b = null;
            odw0Var.c = null;
            odw0Var.d = j;
            odw0Var.g = 4;
            bpb1Var2.collect(new wem((byte) 19, new l811(), zio0Var2, s4q0Var2), odw0Var);
            return obj2;
        }
        return obj2;
    }

    public final void c() {
        abu0 abu0Var;
        p731 p731Var;
        this.P0.set(this.O0.get());
        this.T0 = null;
        faa0 faa0Var = this.Z;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        this.Z = null;
        String str = this.N0;
        if (str != null && (p731Var = this.i) != null) {
            p731Var.c(str);
        }
        this.N0 = null;
        this.f.e();
        llm llmVar = this.Y;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.Y = null;
        this.Q0 = null;
        this.R0.set(null);
        aru0 aru0Var = this.a;
        aru0Var.s();
        aru0Var.r();
        zau0 zau0Var = this.h;
        if (zau0Var == null || (abu0Var = this.g) == null) {
            return;
        }
        abu0Var.b(zau0Var);
    }
}
