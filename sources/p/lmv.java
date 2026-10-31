package p;

import com.spotify.profile.editprofile.editprofile.biodatasource.BioRateLimitException;
import com.spotify.profile.editprofile.editprofile.biodatasource.BioViolationException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class lmv {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ps7 ps7Var, omv omvVar, onm onmVar) {
        kmv kmvVar;
        vmv vmvVar;
        fnv fnvVar;
        if (onmVar instanceof kmv) {
            kmvVar = (kmv) onmVar;
            int i = kmvVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kmvVar.b = i - Integer.MIN_VALUE;
            } else {
                kmvVar = new kmv(onmVar);
            }
        } else {
            kmvVar = new kmv(onmVar);
        }
        Object obj = kmvVar.a;
        int i2 = kmvVar.b;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                String str = omvVar.a;
                ova ovaVar = omvVar.b;
                kmvVar.b = 1;
                Object objJ = ps7Var.j(str, ovaVar, kmvVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return wmv.a;
        } catch (BioRateLimitException e) {
            vmvVar = new vmv(new dnv(e.a));
            return vmvVar;
        } catch (BioViolationException e2) {
            int iC = l1d.C(e2.a);
            if (iC != 0) {
                fnvVar = cnv.a;
                if (iC != 1 && iC != 2) {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    fnvVar = bnv.a;
                }
            } else {
                fnvVar = env.a;
            }
            vmvVar = new vmv(fnvVar);
            return vmvVar;
        } catch (CancellationException e3) {
            throw e3;
        } catch (Exception unused) {
            return new vmv(anv.a);
        }
    }
}
