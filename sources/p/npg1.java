package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.trending.v1.TrendingLocationSignalPayload;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class npg1 implements anc0, mqb1 {
    public final String a;
    public final gtt b;
    public final zhe0 c;
    public final hsq d;
    public final lzn0 e;
    public final ifl1 f;
    public final qes g;
    public final q8n h;
    public final q8n i;
    public llm j;
    public xab1 k;
    public b431 l;
    public ohd m;
    public boolean n;

    public npg1(String str, gtt gttVar, zhe0 zhe0Var, hsq hsqVar, lzn0 lzn0Var, ifl1 ifl1Var, qes qesVar, q8n q8nVar, q8n q8nVar2) {
        this.a = str;
        this.b = gttVar;
        this.c = zhe0Var;
        this.d = hsqVar;
        this.e = lzn0Var;
        this.f = ifl1Var;
        this.g = qesVar;
        this.h = q8nVar;
        this.i = q8nVar2;
    }

    @Override // p.anc0
    public final void a() {
        b431 b431Var = this.l;
        if (b431Var != null) {
            b431Var.unregister();
        }
        this.l = null;
        ohd ohdVar = this.m;
        if (ohdVar != null) {
            ohdVar.q((Throwable) null);
        }
        this.m = null;
        xab1 xab1Var = this.k;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.k = null;
        llm llmVar = this.j;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.j = null;
    }

    @Override // p.anc0
    public final void b() {
        this.j = smo1.e(this.h);
    }

    public final Object d(onm onmVar) {
        Object objY = fn31.Y(this.i, new vbc1(this, (lnm) null, (byte) 13), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    @Override // p.mqb1
    public final void e(Bundle bundle) {
        this.n = bundle != null ? bundle.getBoolean("tny_location_has_requested_refresh") : false;
    }

    @Override // p.mqb1
    public final void f(Bundle bundle) {
        bundle.putBoolean("tny_location_has_requested_refresh", this.n);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(onm onmVar) {
        jpg1 jpg1Var;
        if (onmVar instanceof jpg1) {
            jpg1Var = (jpg1) onmVar;
            int i = jpg1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jpg1Var.c = i - Integer.MIN_VALUE;
            } else {
                jpg1Var = new jpg1(this, onmVar);
            }
        } else {
            jpg1Var = new jpg1(this, onmVar);
        }
        Object obj = jpg1Var.a;
        int i2 = jpg1Var.c;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                Object obj2 = ((e331) obj).a;
                return rih1Var;
            }
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        nig0 nig0VarA = this.g.a();
        Object obj3 = d9n.a;
        if (nig0VarA == null) {
            jpg1Var.c = 2;
            if (l(jpg1Var) == obj3) {
                return obj3;
            }
            return rih1Var;
        }
        hpg1 hpg1VarN = TrendingLocationSignalPayload.n();
        hpg1VarN.n(nig0VarA.a);
        hpg1VarN.s(nig0VarA.b);
        hpg1VarN.q(nig0VarA.c);
        TrendingLocationSignalPayload trendingLocationSignalPayloadBuild = hpg1VarN.build();
        trendingLocationSignalPayloadBuild.getClass();
        jpg1Var.c = 1;
        if (this.f.e(this.a, trendingLocationSignalPayloadBuild, jpg1Var) == obj3) {
            return obj3;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(onm onmVar) {
        kpg1 kpg1Var;
        if (onmVar instanceof kpg1) {
            kpg1Var = (kpg1) onmVar;
            int i = kpg1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kpg1Var.c = i - Integer.MIN_VALUE;
            } else {
                kpg1Var = new kpg1(this, onmVar);
            }
        } else {
            kpg1Var = new kpg1(this, onmVar);
        }
        Object objB = kpg1Var.a;
        int i2 = kpg1Var.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            this.n = true;
            kpg1Var.c = 1;
            objB = this.b.b(30000L, "tny_load", kpg1Var);
            if (objB != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
            Object obj = ((e331) objB).a;
            return rih1Var;
        }
        hm5.M(objB);
        ctt cttVar = (ctt) objB;
        if (cttVar instanceof btt) {
            Logger.g("TNY: Device location refreshed and written", new Object[0]);
            hpg1 hpg1VarN = TrendingLocationSignalPayload.n();
            hpg1VarN.r();
            TrendingLocationSignalPayload trendingLocationSignalPayloadBuild = hpg1VarN.build();
            trendingLocationSignalPayloadBuild.getClass();
            kpg1Var.c = 2;
            return this.f.e(this.a, trendingLocationSignalPayloadBuild, kpg1Var) == d9nVar ? d9nVar : rih1Var;
        }
        if (cttVar instanceof att) {
            Logger.g("TNY: Device location refreshed but write failed: %s", new Object[]{qjm1.a});
            return rih1Var;
        }
        if ((cttVar instanceof vst) || (cttVar instanceof ust) || (cttVar instanceof yst)) {
            Logger.g("TNY: Unexpected result after consent acquired: %s", new Object[]{cttVar});
            return rih1Var;
        }
        if (cttVar instanceof xst) {
            Logger.g("TNY: Location services disabled", new Object[0]);
            return rih1Var;
        }
        if (cttVar instanceof zst) {
            Logger.g("TNY: Location request timed out", new Object[0]);
            return rih1Var;
        }
        if (cttVar instanceof wst) {
            Logger.g("TNY: Location fetch failed: %s", new Object[]{((wst) cttVar).a});
            return rih1Var;
        }
        eg.o();
        return null;
    }

    @Override // p.anc0
    public final void n() {
        xab1 xab1Var = this.k;
        if (xab1Var != null && xab1Var.v()) {
            this.k = null;
        }
        if (this.k == null && this.l == null) {
            if (this.g.a() == null && this.n) {
                return;
            }
            llm llmVar = this.j;
            this.k = llmVar != null ? fn31.T(llmVar, (o8n) null, 0, new i7u0(this, (lnm) null, (byte) 13), 3) : null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(onm onmVar) {
        mpg1 mpg1Var;
        if (onmVar instanceof mpg1) {
            mpg1Var = (mpg1) onmVar;
            int i = mpg1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpg1Var.c = i - Integer.MIN_VALUE;
            } else {
                mpg1Var = new mpg1(this, onmVar);
            }
        } else {
            mpg1Var = new mpg1(this, onmVar);
        }
        Object objY = mpg1Var.a;
        int i2 = mpg1Var.c;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objY);
            mpg1Var.c = 1;
            objY = fn31.Y(this.i, new k6g1(this, bst.b, (lnm) null, (byte) 3), mpg1Var);
            if (objY != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            hm5.M(objY);
        } else {
            if (i2 == 2) {
                hm5.M(objY);
                return rih1Var;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    hm5.M(objY);
                    return rih1Var;
                }
                if (i2 == 5) {
                    hm5.M(objY);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        if (u890.j((fie0) objY, die0.a)) {
            mpg1Var.c = 4;
            if (i(mpg1Var) != obj) {
                return obj;
            }
            return rih1Var;
        }
        mpg1Var.c = 5;
        if (d(mpg1Var) != obj) {
            return obj;
        }
        return rih1Var;
        if (((est) objY) != est.a) {
            mpg1Var.c = 2;
            if (d(mpg1Var) != obj) {
                return rih1Var;
            }
        } else {
            lpg1 lpg1Var = new lpg1(this, null, (byte) 1);
            mpg1Var.c = 3;
            objY = this.c.a("tny_load", lpg1Var, mpg1Var);
            if (objY != obj) {
                if (u890.j((fie0) objY, die0.a)) {
                    mpg1Var.c = 4;
                    if (i(mpg1Var) != obj) {
                        return rih1Var;
                    }
                } else {
                    mpg1Var.c = 5;
                    if (d(mpg1Var) != obj) {
                        return rih1Var;
                    }
                }
            }
        }
        return obj;
    }

    @Override // p.anc0
    public final void q() {
    }
}
