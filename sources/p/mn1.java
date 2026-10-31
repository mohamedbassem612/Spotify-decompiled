package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.SingleSource;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mn1 {
    public final vu1 a;
    public final d520 b;
    public final jm1 c;
    public final otu d;
    public final wmy e;
    public final eyh0 f;
    public Uri g;

    public mn1(vu1 vu1Var, d520 d520Var, jm1 jm1Var, otu otuVar, wmy wmyVar, eyh0 eyh0Var) {
        this.a = vu1Var;
        this.b = d520Var;
        this.c = jm1Var;
        this.d = otuVar;
        this.e = wmyVar;
        this.f = eyh0Var;
    }

    public static boolean b(Uri uri) {
        String query = uri.getQuery();
        return query != null && ihc1.Q0(query, new String[]{"&"}, 0, 6).contains("intent=1");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, onm onmVar) {
        jn1 jn1Var;
        String strZ;
        String str2;
        String str3;
        Serializable m231Var;
        String str4;
        Serializable serializable;
        Throwable thA;
        if (onmVar instanceof jn1) {
            jn1Var = (jn1) onmVar;
            int i = jn1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jn1Var.f = i - Integer.MIN_VALUE;
            } else {
                jn1Var = new jn1(this, onmVar);
            }
        } else {
            jn1Var = new jn1(this, onmVar);
        }
        jn1 jn1Var2 = jn1Var;
        Object objJ = jn1Var2.d;
        int i2 = jn1Var2.f;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(objJ);
            Set set = s4b1.f;
            strZ = uic.x(str).z();
            if (strZ != null) {
                try {
                    SingleSource singleSource = (SingleSource) this.c.invoke(strZ);
                    jn1Var2.a = str;
                    jn1Var2.b = strZ;
                    jn1Var2.c = null;
                    jn1Var2.f = 1;
                    objJ = fc11.j(singleSource, jn1Var2);
                    if (objJ != d9nVar) {
                        str3 = str;
                    }
                } catch (Throwable th) {
                    th = th;
                    str2 = str;
                    m231Var = new m231(th);
                    str3 = str2;
                }
                return d9nVar;
            }
            return rih1Var;
        }
        if (i2 == 1) {
            strZ = jn1Var2.b;
            str3 = jn1Var2.a;
            try {
                hm5.M(objJ);
            } catch (Throwable th2) {
                th = th2;
                str2 = str3;
                m231Var = new m231(th);
                str3 = str2;
            }
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            serializable = jn1Var2.c;
            str4 = jn1Var2.b;
            hm5.M(objJ);
        }
        this.g = null;
        m231Var = serializable;
        strZ = str4;
        thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, f4i1.f("Add to library failed for Uri: ", strZ, "."), new Object[0]);
        }
        return rih1Var;
        m231Var = (Boolean) objJ;
        if (!(m231Var instanceof m231)) {
            Boolean bool = (Boolean) m231Var;
            bool.getClass();
            boolean zBooleanValue = bool.booleanValue();
            jn1Var2.a = null;
            jn1Var2.b = strZ;
            jn1Var2.c = m231Var;
            jn1Var2.f = 2;
            Object objCollect = x4p1.h(yoi1.g(this.e.r(strZ)), new kn1(strZ, (lnm) null, (byte) 0)).collect(new ln1(this, strZ, str3, zBooleanValue, (byte) 0), jn1Var2);
            if (objCollect != d9nVar) {
                objCollect = rih1Var;
            }
            if (objCollect != d9nVar) {
                str4 = strZ;
                serializable = m231Var;
                this.g = null;
                m231Var = serializable;
                strZ = str4;
                thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.e(thA, f4i1.f("Add to library failed for Uri: ", strZ, "."), new Object[0]);
                }
            }
            return d9nVar;
        }
        thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, f4i1.f("Add to library failed for Uri: ", strZ, "."), new Object[0]);
        }
        return rih1Var;
    }
}
