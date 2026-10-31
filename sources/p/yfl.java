package p;

import com.spotify.devicelocation.consent.ConsentDataLoaderError;
import com.spotify.usergeopoints.v1.GetConsentResponse;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yfl implements vfl {
    public final fai1 a;
    public final prt b;
    public final bpb1 c = gio1.b(cgl.b);

    public yfl(fai1 fai1Var, prt prtVar) {
        this.a = fai1Var;
        this.b = prtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, onm onmVar) {
        wfl wflVar;
        cgl m231Var;
        if (onmVar instanceof wfl) {
            wflVar = (wfl) onmVar;
            int i = wflVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wflVar.d = i - Integer.MIN_VALUE;
            } else {
                wflVar = new wfl(this, onmVar);
            }
        } else {
            wflVar = new wfl(this, onmVar);
        }
        Object objC = wflVar.b;
        int i2 = wflVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                fai1 fai1Var = this.a;
                wflVar.a = str;
                wflVar.d = 1;
                objC = fai1Var.c(wflVar);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = wflVar.a;
                hm5.M(objC);
            }
            m231Var = bs51.h(((GetConsentResponse) objC).n());
            this.c.m((Object) null, m231Var);
        } catch (HttpException e) {
            m231Var = new m231(new ConsentDataLoaderError.BackendError(e.a, e.b));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable unused) {
            m231Var = new m231(ConsentDataLoaderError.Unknown.a);
        }
        ConsentDataLoaderError.BackendError backendErrorA = e331.a(m231Var);
        prt prtVar = this.b;
        if (backendErrorA == null) {
            prtVar.a(m231Var, 200, str);
        } else {
            ConsentDataLoaderError.BackendError backendError = backendErrorA instanceof ConsentDataLoaderError.BackendError ? backendErrorA : null;
            prtVar.a(null, backendError != null ? backendError.a() : -1, str);
        }
        return m231Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r8 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable b(java.lang.String r6, java.lang.String r7, p.onm r8, boolean r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yfl.b(java.lang.String, java.lang.String, p.onm, boolean):java.io.Serializable");
    }
}
