package p;

import com.spotify.libraryimportservice.tmm.GetTransferResultsBannerResponse;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r6c0 {
    public final ov20 a;
    public final j6c0 b;
    public volatile Long c;
    public volatile n6c0 d;

    public r6c0(ov20 ov20Var, j6c0 j6c0Var) {
        this.a = ov20Var;
        this.b = j6c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(onm onmVar) {
        p6c0 p6c0Var;
        m6c0 m6c0Var = m6c0.a;
        if (onmVar instanceof p6c0) {
            p6c0Var = (p6c0) onmVar;
            int i = p6c0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6c0Var.c = i - Integer.MIN_VALUE;
            } else {
                p6c0Var = new p6c0(this, onmVar);
            }
        } else {
            p6c0Var = new p6c0(this, onmVar);
        }
        Object objA = p6c0Var.a;
        d9n d9nVar = d9n.a;
        int i2 = p6c0Var.c;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objA);
                    j6c0 j6c0Var = this.b;
                    p6c0Var.c = 1;
                    objA = j6c0Var.a(p6c0Var);
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
                o6c0 o6c0VarV = pro1.v((GetTransferResultsBannerResponse) objA);
                if (!o6c0VarV.equals(this.d)) {
                    this.d = null;
                    return o6c0VarV;
                }
            } catch (IOException | HttpException unused) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Unexpected error fetching library import match result banner", e2);
        }
        return m6c0Var;
    }
}
