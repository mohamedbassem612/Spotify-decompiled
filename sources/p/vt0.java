package p;

import j$.time.Instant;
import j$.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vt0 {
    public final u961 a;
    public final rs0 b;
    public final kly0 c;
    public final jjh1 d;
    public final yqg e;
    public final bt0 f;
    public final zt0 g;
    public final be91 h;
    public final llm i;
    public final bpb1 j = gio1.b((Object) null);

    public vt0(u961 u961Var, rs0 rs0Var, caq caqVar, jjh1 jjh1Var, yqg yqgVar, bt0 bt0Var, zt0 zt0Var, be91 be91Var, q8n q8nVar) {
        this.a = u961Var;
        this.b = rs0Var;
        this.c = caqVar;
        this.d = jjh1Var;
        this.e = yqgVar;
        this.f = bt0Var;
        this.g = zt0Var;
        this.h = be91Var;
        this.i = l1d.x(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ct0 ct0Var, onm onmVar) {
        rt0 rt0Var;
        Object objU;
        Object obj;
        ji0 ji0Var;
        if (onmVar instanceof rt0) {
            rt0Var = (rt0) onmVar;
            int i = rt0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rt0Var.e = i - Integer.MIN_VALUE;
            } else {
                rt0Var = new rt0(this, onmVar);
            }
        } else {
            rt0Var = new rt0(this, onmVar);
        }
        Object obj2 = rt0Var.c;
        int i2 = rt0Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            rt0Var.e = 1;
            objU = this.a.u(ct0Var, rt0Var);
            if (objU != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(obj2);
            objU = ((e331) obj2).a;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ji0Var = rt0Var.b;
            obj = rt0Var.a;
            hm5.M(obj2);
        }
        this.d.b(ji0Var);
        objU = obj;
        if (objU instanceof m231) {
            return null;
        }
        return objU;
        if (!(objU instanceof m231)) {
            ji0 ji0Var2 = (ji0) objU;
            rt0Var.a = objU;
            rt0Var.b = ji0Var2;
            rt0Var.e = 2;
            if (f(rt0Var) != d9nVar) {
                obj = objU;
                ji0Var = ji0Var2;
                this.d.b(ji0Var);
                objU = obj;
            }
            return d9nVar;
        }
        if (objU instanceof m231) {
            return null;
        }
        return objU;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        st0 st0Var;
        if (onmVar instanceof st0) {
            st0Var = (st0) onmVar;
            int i = st0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                st0Var.d = i - Integer.MIN_VALUE;
            } else {
                st0Var = new st0(this, onmVar);
            }
        } else {
            st0Var = new st0(this, onmVar);
        }
        Object objO = st0Var.b;
        int i2 = st0Var.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objO);
            long jC = ((a44) this.c.get()).c();
            qm qmVar = new qm(this, (lnm) null, (byte) 3);
            st0Var.d = 1;
            objO = rc2.O(jC, qmVar, st0Var);
            if (objO != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ji0 ji0Var = st0Var.a;
            hm5.M(objO);
            return ji0Var;
        }
        hm5.M(objO);
        ji0 ji0Var2 = (ji0) objO;
        if (ji0Var2 == null) {
            return null;
        }
        st0Var.a = ji0Var2;
        st0Var.d = 2;
        return f(st0Var) == d9nVar ? d9nVar : ji0Var2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object c(onm onmVar) throws NoWhenBranchMatchedException {
        tt0 tt0Var;
        llm llmVar = this.i;
        zt0 zt0Var = this.g;
        if (onmVar instanceof tt0) {
            tt0Var = (tt0) onmVar;
            int i = tt0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tt0Var.c = i - Integer.MIN_VALUE;
            } else {
                tt0Var = new tt0(this, onmVar);
            }
        } else {
            tt0Var = new tt0(this, onmVar);
        }
        tt0 tt0Var2 = tt0Var;
        Object objA = tt0Var2.a;
        d9n d9nVar = d9n.a;
        int i2 = tt0Var2.c;
        boolean z = false;
        if (i2 == 0) {
            hm5.M(objA);
            if (!((a44) this.c.get()).b()) {
                return yah0.m(false);
            }
            if (zt0Var.b == null) {
                t45 t45VarA = zt0Var.a.a("ad-on-app-open");
                t45VarA.h = "android-ad-on-app-open";
                zt0Var.b = t45VarA;
            }
            op71.r(llmVar.a);
            this.j.l((Object) null);
            be91 be91Var = this.h;
            jx0 jx0Var = jx0.b;
            d3p1.y();
            jx0 jx0Var2 = jx0.l;
            l4p1.u(llmVar, f5p1.q(be91Var.b(jx0Var2), new k2(this, (lnm) null, (byte) 5)));
            bt0.a(this.f, at0.CORE_FETCH_AD_REQUESTED, null, null, null, 62);
            zt0Var.a(3);
            be91 be91Var2 = this.h;
            d3p1.y();
            qc91 qc91Var = qc91.FETCH;
            tt0Var2.c = 1;
            objA = be91.a(be91Var2, jx0Var2, qc91Var, null, tt0Var2, 12);
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        rc91 rc91Var = (tc91) objA;
        if (u890.j(rc91Var, sc91.a)) {
            t45 t45Var = zt0Var.b;
            if (t45Var != null) {
                t45Var.g(kk0.b(3));
            }
            z = true;
        } else {
            if (!(rc91Var instanceof rc91)) {
                eg.o();
                return null;
            }
            zt0Var.c(3, 2);
            bt0.a(this.f, at0.CORE_FETCH_AD_FAILED, null, null, rc91Var.a(), 30);
        }
        return yah0.m(z);
    }

    public final Date d() {
        yqg yqgVar = this.e;
        try {
            return new Date(Instant.ofEpochMilli(yqgVar.b()).atZone(ZoneId.systemDefault()).toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
        } catch (Exception e) {
            bt0.a(this.f, at0.DATE_TIME_PARSING_FAILED, null, null, j2h1.I(e), 30);
            Calendar calendar = Calendar.getInstance(yqgVar.g());
            calendar.setTimeInMillis(yqgVar.b());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return new Date(calendar.getTimeInMillis());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        ut0 ut0Var;
        if (onmVar instanceof ut0) {
            ut0Var = (ut0) onmVar;
            int i = ut0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ut0Var.c = i - Integer.MIN_VALUE;
            } else {
                ut0Var = new ut0(this, onmVar);
            }
        } else {
            ut0Var = new ut0(this, onmVar);
        }
        Object objZ = ut0Var.a;
        int i2 = ut0Var.c;
        if (i2 == 0) {
            hm5.M(objZ);
            Date dateD = d();
            Date date = new Date(this.e.b());
            ut0Var.c = 1;
            rs0 rs0Var = this.b;
            objZ = qyo1.z(ut0Var, new d4(rs0Var, dateD, date), rs0Var.a, true, false);
            d9n d9nVar = d9n.a;
            if (objZ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objZ);
        }
        zs0 zs0Var = (zs0) objZ;
        if (zs0Var == null) {
            return yah0.m(true);
        }
        return !zs0Var.a() ? yah0.m(true) : yah0.m(false);
    }

    public final Object f(onm onmVar) {
        zs0 zs0Var = new zs0(d(), false, new Date(TimeUnit.SECONDS.toMillis(((a44) this.c.get()).a()) + this.e.b()));
        rs0 rs0Var = this.b;
        Object objZ = qyo1.z(onmVar, new d4(rs0Var, zs0Var, (byte) 9), rs0Var.a, false, true);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objZ != d9nVar) {
            objZ = rih1Var;
        }
        return objZ == d9nVar ? objZ : rih1Var;
    }
}
