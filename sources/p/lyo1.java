package p;

import com.google.android.recaptcha.internal.zzhm;
import com.spotify.cosmos.cosmos.Request;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.TimeoutCancellationException;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lyo1 {
    public final tx a;
    public final CronetEngine b;
    public final ExecutorService c;

    public lyo1(tx txVar, CronetEngine cronetEngine, ExecutorService executorService) {
        this.a = txVar;
        this.b = cronetEngine;
        this.c = executorService;
    }

    public final Object a(String str, byte[] bArr, onm onmVar) {
        return b(str, Request.POST, bArr, zno1.t(oqn1.n("Content-Type", "application/x-protobuffer")), onmVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, byte[] bArr, Map map, onm onmVar) throws zzhm {
        iyo1 iyo1Var;
        if (onmVar instanceof iyo1) {
            iyo1Var = (iyo1) onmVar;
            int i = iyo1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                iyo1Var.d = i - Integer.MIN_VALUE;
            } else {
                iyo1Var = new iyo1(this, onmVar);
            }
        } else {
            iyo1Var = new iyo1(this, onmVar);
        }
        Object obj = iyo1Var.b;
        int i2 = iyo1Var.d;
        tgo1 tgo1Var = tgo1.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            if (!this.a.b(str)) {
                throw new zzhm(tgo1Var, ij81.S0, (String) null, (Exception) null);
            }
            iyo1Var.a = map;
            iyo1Var.d = 1;
            ohd ohdVar = new ohd(1, aym.t(iyo1Var));
            ohdVar.t();
            CronetEngine cronetEngine = this.b;
            pyo1 pyo1Var = new pyo1(ohdVar);
            ExecutorService executorService = this.c;
            UrlRequest.Builder builderNewUrlRequestBuilder = cronetEngine.newUrlRequestBuilder(str, pyo1Var, executorService);
            builderNewUrlRequestBuilder.setHttpMethod(str2);
            for (Map.Entry entry : map.entrySet()) {
                builderNewUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
            if (bArr != null) {
                builderNewUrlRequestBuilder.setUploadDataProvider(blo1.q(bArr), executorService);
            }
            builderNewUrlRequestBuilder.setTrafficStatsTag((int) Thread.currentThread().getId());
            UrlRequest urlRequestBuild = builderNewUrlRequestBuilder.build();
            urlRequestBuild.start();
            ohdVar.n(new gla0(urlRequestBuild, (byte) 7));
            Object objR = ohdVar.r();
            d9n d9nVar = d9n.a;
            return objR == d9nVar ? d9nVar : objR;
        } catch (TimeoutCancellationException e) {
            throw new zzhm(tgo1Var, ij81.e, e.getMessage(), (Exception) null);
        } catch (zzhm e2) {
            throw e2;
        } catch (Exception e3) {
            throw new zzhm(tgo1Var, ij81.Z0, e3.getMessage(), (Exception) null);
        }
    }
}
