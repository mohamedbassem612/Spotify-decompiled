package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.share.linkgeneration.api.UnshorteningUrlException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s680 {
    public final lzn0 a;
    public final jnq b;
    public final wcr c;
    public final h5a1 d;
    public final fjb e;
    public final ae5 f;
    public final llm g;

    public s680(q8n q8nVar, lzn0 lzn0Var, jnq jnqVar, wcr wcrVar, h5a1 h5a1Var, fjb fjbVar, ae5 ae5Var) {
        this.a = lzn0Var;
        this.b = jnqVar;
        this.c = wcrVar;
        this.d = h5a1Var;
        this.e = fjbVar;
        this.f = ae5Var;
        this.g = smo1.e(ha71.A(op71.f(), q8nVar));
    }

    public final void a(int i, String str, String str2) {
        this.f.g(i, str, str2);
        this.a.f(rrn1.w("spotify:home").h());
    }

    public final void b(Intent intent, String str, String str2, String str3) {
        this.f.h(str2, str3, str);
        Bundle bundleE = j82.E(intent, m5n1.X(Uri.parse(str), str2).toString(), "in-house");
        dwn0 dwn0VarH = rrn1.w(str3).h();
        if (this.b.c(dwn0VarH, bundleE) == edr.b) {
            this.c.c(5, intent, "No app route for resolved in-house short link");
        }
        Logger.b("[InHouseShortLink] Navigating to resolved link: originalLink=%s, resolvedUrl=%s, shortlinkSessionId=%s", str, str3, str2);
        this.a.i(dwn0VarH, bundleE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Intent intent, String str, String str2, onm onmVar) {
        q680 q680Var;
        if (onmVar instanceof q680) {
            q680Var = (q680) onmVar;
            int i = q680Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                q680Var.f = i - Integer.MIN_VALUE;
            } else {
                q680Var = new q680(this, onmVar);
            }
        } else {
            q680Var = new q680(this, onmVar);
        }
        Object objO = q680Var.d;
        int i2 = q680Var.f;
        rih1 rih1Var = rih1.a;
        String str3 = null;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                x060 x060Var = new x060(this, str, (lnm) null, (byte) 17);
                q680Var.a = intent;
                q680Var.b = str;
                q680Var.c = str2;
                q680Var.f = 1;
                objO = rc2.O(20000L, x060Var, q680Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = q680Var.c;
                str = q680Var.b;
                intent = q680Var.a;
                hm5.M(objO);
            }
            nlh1 nlh1Var = (nlh1) objO;
            if (nlh1Var == null) {
                a(4, str2, "Unshorten timed out");
                return rih1Var;
            }
            String strA = nlh1Var.a().a();
            if (strA != null && !ihc1.y0(strA)) {
                str3 = strA;
            }
            if (str3 == null) {
                a(1, str2, "Unshorten response contained no URI");
                return rih1Var;
            }
            b(intent, str, str2, str3);
            return rih1Var;
        } catch (UnshorteningUrlException e) {
            String message = e.getMessage();
            a(3, str2, message != null ? message : "Unknown error");
            return rih1Var;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            String message2 = e3.getMessage();
            a(2, str2, message2 != null ? message2 : "Unknown error");
            return rih1Var;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:56|26|(0)(1:29)) */
    /* JADX WARN: Code duplicated, block: B:29:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        r14 = r2;
        r13 = r3;
        r2 = r10;
        r3 = r11;
        r10 = r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00cd -> B:46:0x00d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r18, p.onm r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.s680.d(java.lang.String, p.onm):java.lang.Object");
    }
}
