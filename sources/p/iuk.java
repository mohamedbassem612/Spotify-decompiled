package p;

import com.spotify.pses.pses.PsesFetchException;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iuk extends xbk1 {
    public String X;
    public int Y;
    public final fmy0 b;
    public final juk c;
    public final bpb1 d;
    public final xe01 e;
    public final bbc f;
    public final mfe g;
    public xab1 h;
    public boolean i;
    public boolean t;

    public iuk(fmy0 fmy0Var, zwz0 zwz0Var, juk jukVar) {
        this.b = fmy0Var;
        this.c = jukVar;
        bpb1 bpb1VarB = gio1.b(new wtk(1, xtk.a));
        this.d = bpb1VarB;
        this.e = d5p1.h(bpb1VarB);
        bbc bbcVarA = mno1.a(-2, 0, 6);
        this.f = bbcVarA;
        this.g = k4p1.B(bbcVarA);
        this.X = "initial";
        this.Y = 1;
        fn31.T(ack1.a(this), (o8n) null, 0, new cuk(zwz0Var, this, (lnm) null), 3);
        this.h = fn31.T(ack1.a(this), (o8n) null, 0, new huk(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T(onm onmVar) {
        guk gukVar;
        p811 p811Var;
        p811 p811Var2;
        long j;
        p811 p811Var3;
        Object m231Var;
        String strValueOf;
        Integer num;
        if (onmVar instanceof guk) {
            gukVar = (guk) onmVar;
            int i = gukVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gukVar.g = i - Integer.MIN_VALUE;
            } else {
                gukVar = new guk(this, onmVar);
            }
        } else {
            gukVar = new guk(this, onmVar);
        }
        Object objJ = gukVar.e;
        int i2 = gukVar.g;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objJ);
                    new Integer(((wtk) this.d.getValue()).a);
                    this.i = true;
                    this.Y++;
                    p811Var = new p811();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        Single singleA = fmy0.a(this.b);
                        gukVar.a = p811Var;
                        gukVar.b = p811Var;
                        gukVar.c = p811Var;
                        gukVar.d = jCurrentTimeMillis;
                        gukVar.g = 1;
                        objJ = fc11.j(singleA, gukVar);
                        d9n d9nVar = d9n.a;
                        if (objJ == d9nVar) {
                            return d9nVar;
                        }
                        p811Var2 = p811Var;
                        j = jCurrentTimeMillis;
                        p811Var3 = p811Var2;
                    } catch (Exception e) {
                        e = e;
                        p811Var2 = p811Var;
                        j = jCurrentTimeMillis;
                        p811Var3 = p811Var2;
                        m231Var = new m231(e);
                        p811Var = p811Var3;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = gukVar.d;
                    p811Var = gukVar.c;
                    p811Var3 = gukVar.b;
                    p811Var2 = gukVar.a;
                    try {
                        hm5.M(objJ);
                    } catch (Exception e2) {
                        e = e2;
                        m231Var = new m231(e);
                        p811Var = p811Var3;
                    }
                }
                objJ.getClass();
                m231Var = ((e331) objJ).a;
                p811Var.a = m231Var;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                Object obj = p811Var2.a;
                if (obj instanceof m231) {
                    PsesFetchException psesFetchExceptionA = e331.a(obj);
                    if (!(psesFetchExceptionA instanceof PsesFetchException) || (num = psesFetchExceptionA.a) == null) {
                        strValueOf = ((psesFetchExceptionA instanceof IOException) || (psesFetchExceptionA instanceof TimeoutException)) ? "no_connection" : "unknown";
                    } else {
                        strValueOf = String.valueOf(num);
                    }
                    new Long(jCurrentTimeMillis2);
                    this.c.a.a(new jhv0("start_retry", "error_endpoint_pses_fetch", 4, strValueOf));
                }
                fuk fukVar = new fuk(jCurrentTimeMillis2, p811Var2.a);
                this.i = false;
                return fukVar;
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
    }
}
