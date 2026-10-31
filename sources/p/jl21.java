package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jl21 {
    public final yqg a;
    public final dg30 b;
    public final Flowable c;
    public final ca40 d;
    public final mm21 e;
    public final lzn0 f;
    public final boolean g;

    public jl21(yqg yqgVar, dg30 dg30Var, Flowable flowable, ca40 ca40Var, mm21 mm21Var, lzn0 lzn0Var, boolean z) {
        this.a = yqgVar;
        this.b = dg30Var;
        this.c = flowable;
        this.d = ca40Var;
        this.e = mm21Var;
        this.f = lzn0Var;
        this.g = z;
    }

    public final jhm a(String str, lik1 lik1Var, Map map) {
        return new jhm("reporting_report", csx.c, (fhm) null, 2131959454, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(ma21.c1, new sc21(str, (byte) 2)), new vvu0(this, lik1Var, str, map, (byte) 20)), 244);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(onm onmVar) {
        hl21 hl21Var;
        Boolean m231Var;
        if (onmVar instanceof hl21) {
            hl21Var = (hl21) onmVar;
            int i = hl21Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hl21Var.c = i - Integer.MIN_VALUE;
            } else {
                hl21Var = new hl21(this, onmVar);
            }
        } else {
            hl21Var = new hl21(this, onmVar);
        }
        Object objJ = hl21Var.a;
        int i2 = hl21Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleA = this.d.a();
                hl21Var.c = 1;
                objJ = fc11.j(singleA, hl21Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            m231Var = (Boolean) objJ;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? Boolean.FALSE : m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, Map map, onm onmVar) {
        il21 il21Var;
        PlayerState m231Var;
        if (onmVar instanceof il21) {
            il21Var = (il21) onmVar;
            int i = il21Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                il21Var.e = i - Integer.MIN_VALUE;
            } else {
                il21Var = new il21(this, onmVar);
            }
        } else {
            il21Var = new il21(this, onmVar);
        }
        Object objJ = il21Var.c;
        int i2 = il21Var.e;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleTimeout = this.c.z().timeout(1L, TimeUnit.SECONDS, Single.error(new TimeoutException()));
                il21Var.a = str;
                il21Var.b = map;
                il21Var.e = 1;
                objJ = fc11.j(singleTimeout, il21Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map = il21Var.b;
                str = il21Var.a;
                hm5.M(objJ);
            }
            m231Var = (PlayerState) objJ;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        PlayerState playerState = m231Var;
        if (playerState == null || !o4p1.o(playerState).equals(str)) {
            e(str, map, null);
        } else {
            Long l = (Long) playerState.position(this.a.b()).h();
            e(str, map, l != null ? new Integer((int) (l.longValue() / 1000)) : null);
        }
        return rih1.a;
    }

    public final void e(String str, Map map, Integer num) {
        if (this.g) {
            StringBuilder sb = new StringBuilder();
            sb.append(nik1.H1.a);
            sb.append("?uri=");
            sb.append(Uri.encode(str));
            if (num != null) {
                int iIntValue = num.intValue();
                sb.append("&playback_timestamp=");
                sb.append(iIntValue);
            }
            this.f.f(new dwn0(sb.toString(), "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
            return;
        }
        xkg0 xkg0Var = new xkg0();
        xkg0Var.putAll(map);
        if (num != null) {
            xkg0Var.put("playback_timestamp", String.valueOf(num.intValue()));
        }
        xkg0 xkg0VarB = xkg0Var.b();
        if (xkg0VarB.isEmpty()) {
            xkg0VarB = null;
        }
        String strO = hap1.o(str, xkg0VarB);
        this.e.a(this.b.getApplication(), str, strO);
    }
}
