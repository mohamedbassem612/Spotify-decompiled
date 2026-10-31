package p;

import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class glg implements p090 {
    public final ynb0 a;
    public final AtomicReference b = new AtomicReference(null);
    public final boolean c;

    public glg(ynb0 ynb0Var, i5w0 i5w0Var) {
        this.a = ynb0Var;
        this.c = ((Boolean) i5w0Var.a).booleanValue();
    }

    public static ry21 b(elg elgVar, ln21 ln21Var) {
        String strN = ab80.n("Could not retrieve access token for a client_token request, received error : ", " with description: ", elgVar.a, elgVar.b);
        Logger.d(strN.concat(": %s %s"), ln21Var.b, ln21Var.a);
        return c(ln21Var, NativeMediaProcessor.PROCESS_SAMPLE_RESULT_NULL_SKIP_BYTE_COUNTS, strN);
    }

    public static ry21 c(ln21 ln21Var, int i, String str) {
        r8i0 r8i0VarW;
        tz21 tz21Var = uz21.a;
        ArrayList arrayList = new ArrayList(20);
        se11 se11Var = r8i0.e;
        try {
            r8i0VarW = bmq0.w("plain/text");
        } catch (IllegalArgumentException unused) {
            r8i0VarW = null;
        }
        tz21 tz21VarD = dm5.D(str, r8i0VarW);
        if (i >= 0) {
            return new ry21(ln21Var, bjy0.c, str, i, (ms50) null, new v360((String[]) arrayList.toArray(new String[0])), tz21VarD, (a6a1) null, (ry21) null, (ry21) null, (ry21) null, 0L, 0L, (i25) null, a6g1.u0);
        }
        bhn0.f(f4i1.c(i, "code < 0: "));
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final ry21 a(uf01 uf01Var) throws NoWhenBranchMatchedException {
        boolean zEquals;
        int iHashCode;
        ln21 ln21Var = uf01Var.e;
        v360 v360Var = ln21Var.c;
        String str = ln21Var.b;
        l370 l370Var = ln21Var.a;
        if (!TextUtils.isEmpty(v360Var.c("client-token")) || !this.c || ln21Var.a().j) {
            return uf01Var.b(ln21Var);
        }
        Logger.g("Intercepting request: %s %s", str, l370Var);
        uy81 uy81Var = (uy81) this.a.get();
        dlg dlgVarA = uy81Var.a();
        if (!(dlgVarA instanceof klg)) {
            if (dlgVarA instanceof elg) {
                return b((elg) dlgVarA, ln21Var);
            }
            eg.o();
            return null;
        }
        Logger.g("Token received: %s %s", str, l370Var);
        klg klgVar = (klg) dlgVarA;
        h290<String> h290Var = klgVar.e;
        if (!h290Var.isEmpty()) {
            for (String str2 : h290Var) {
                String str3 = l370Var.d;
                if (str3.length() > str2.length()) {
                    zEquals = true;
                    if (str3.charAt((str3.length() - str2.length()) - 1) != '.' || !nhc1.R(str3, str2, false)) {
                        zEquals = false;
                    }
                } else {
                    zEquals = str3.equals(str2);
                }
                if (zEquals) {
                    AtomicReference atomicReference = this.b;
                    mmr0 mmr0Var = (mmr0) atomicReference.get();
                    if (mmr0Var != null) {
                        return c(ln21Var, ((Number) mmr0Var.a).intValue(), (String) mmr0Var.b);
                    }
                    ry21 ry21VarU = o0c.u(uf01Var, ln21Var, klgVar.a, (ry21) null);
                    v360 v360Var2 = ry21VarU.f;
                    int i = ry21VarU.d;
                    if (i == 401) {
                        String strC = v360Var2.c("client-token-error");
                        if (strC == null) {
                            strC = null;
                        }
                        if (strC != null && strC.equals("EXPIRED_CLIENTTOKEN")) {
                            ry21VarU.g.close();
                            uy81Var.b();
                            dlg dlgVarA2 = uy81Var.a();
                            if (dlgVarA2 instanceof klg) {
                                return o0c.u(uf01Var, ln21Var, ((klg) dlgVarA2).a, ry21VarU);
                            }
                            if (dlgVarA2 instanceof elg) {
                                return b((elg) dlgVarA2, ln21Var);
                            }
                            eg.o();
                            return null;
                        }
                    }
                    if (i == 403 || i == 400 || i == 401) {
                        String strC2 = v360Var2.c("client-token-error");
                        String str4 = strC2 != null ? strC2 : null;
                        if (str4 != null && ((iHashCode = str4.hashCode()) == -1419914618 ? str4.equals("INVALID_CLIENTTOKEN") : !(iHashCode == -837018315 ? !str4.equals("UNSUPPORTED_CLIENT") : !(iHashCode == 482194293 && str4.equals("MISSING_CLIENTTOKEN"))))) {
                            atomicReference.set(new mmr0(Integer.valueOf(i), str4));
                        }
                    }
                    return ry21VarU;
                }
            }
        }
        return uf01Var.b(ln21Var);
    }
}
