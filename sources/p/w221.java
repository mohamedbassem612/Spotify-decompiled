package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w221 implements shm {
    public final ov20 a;
    public final k811 b;
    public final b221 c;
    public final a4q0 d;
    public final me30 e;
    public final drp0 f;
    public final boolean g;

    public w221(ov20 ov20Var, k811 k811Var, b221 b221Var, a4q0 a4q0Var, me30 me30Var, drp0 drp0Var, boolean z) {
        this.a = ov20Var;
        this.b = k811Var;
        this.c = b221Var;
        this.d = a4q0Var;
        this.e = me30Var;
        this.f = drp0Var;
        this.g = z;
    }

    @Override // p.shm
    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        qxc0 qxc0VarC = c(hti0Var);
        return qxc0VarC == null ? new huz((Object) null, (byte) 10) : new x010(yoi1.g(this.c.a(hti0Var.a)), this.a.a, new n93(this, hti0Var, qxc0VarC, null), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.shm
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        v221 v221Var;
        qxc0 qxc0VarC;
        Object objL;
        c221 c221Var;
        String str;
        qxc0 qxc0Var;
        if (lnmVar instanceof v221) {
            v221Var = (v221) lnmVar;
            int i = v221Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                v221Var.i = i - Integer.MIN_VALUE;
            } else {
                v221Var = new v221(this, (onm) lnmVar);
            }
        } else {
            v221Var = new v221(this, (onm) lnmVar);
        }
        Object obj = v221Var.g;
        int i2 = v221Var.i;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            qxc0VarC = c(hti0Var);
            if (qxc0VarC != null) {
                Observable observableA = this.c.a(hti0Var.a);
                v221Var.a = hti0Var;
                v221Var.b = qxc0VarC;
                v221Var.i = 1;
                objL = fc11.l(observableA, 2, (Object) null, v221Var);
                if (objL != d9nVar) {
                }
                return d9nVar;
            }
            return null;
        }
        if (i2 == 1) {
            qxc0 qxc0Var2 = v221Var.b;
            hti0 hti0Var2 = v221Var.a;
            hm5.M(obj);
            qxc0VarC = qxc0Var2;
            hti0Var = hti0Var2;
            objL = obj;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c221 c221Var2 = v221Var.f;
            qxc0Var = v221Var.e;
            String str2 = v221Var.d;
            w221 w221Var = v221Var.c;
            hm5.M(obj);
            c221Var = c221Var2;
            this = w221Var;
            str = str2;
        }
        return this.d(str, qxc0Var, c221Var, (Map) obj);
        c221Var = (c221) objL;
        if (c221Var != null) {
            String str3 = hti0Var.a;
            ezc ezcVar = this.a.a;
            v221Var.a = null;
            v221Var.b = null;
            v221Var.c = this;
            v221Var.d = str3;
            v221Var.e = qxc0VarC;
            v221Var.f = c221Var;
            v221Var.i = 2;
            Object objI = b5p1.i(ezcVar, v221Var);
            if (objI != d9nVar) {
                str = str3;
                qxc0Var = qxc0VarC;
                obj = objI;
                return this.d(str, qxc0Var, c221Var, (Map) obj);
            }
            return d9nVar;
        }
        return null;
    }

    public final qxc0 c(hti0 hti0Var) {
        qxc0 qxc0Var;
        if (this.f.b() || this.d.a.g() || (qxc0Var = hti0Var.d) == null || this.e.a(qxc0Var.e) == le30.U0) {
            return null;
        }
        return qxc0Var;
    }

    public final jhm d(String str, qxc0 qxc0Var, c221 c221Var, Map map) {
        boolean zG = y7y0.G(map);
        if ((!y7y0.t("offline", map) && (zG || !y7y0.L(map) || y7y0.F(map))) || gyo1.H(qxc0Var.O0, dlc0.b) || !c221Var.a || Boolean.parseBoolean((String) qxc0Var.X.get("is_video_first"))) {
            return null;
        }
        return this.b.b(str, (zG && this.g) ? 3 : 0, c221Var.b);
    }
}
