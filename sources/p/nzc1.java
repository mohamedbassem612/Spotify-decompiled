package p;

import com.spotify.superconnect.pairingkit.SuperConnectHmacException;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nzc1 {
    public final a0d1 a;
    public final tzc1 b;
    public final dp5 c;

    public nzc1(a0d1 a0d1Var, tzc1 tzc1Var, dp5 dp5Var) {
        this.a = a0d1Var;
        this.b = tzc1Var;
        this.c = dp5Var;
    }

    public final lzc1 a(String str, String str2, String str3, String str4, String str5) {
        pzc1 pzc1VarB;
        String strConcat = str5 != null ? str5.concat(str4) : str4;
        tzc1 tzc1Var = this.b;
        synchronized (tzc1Var) {
            String strA = tzc1Var.a(str2);
            pzc1VarB = (szc1) tzc1Var.c.get(strA);
            if (pzc1VarB == null) {
                pzc1VarB = tzc1Var.b(strConcat, str, str3);
                tzc1Var.c.put(strA, pzc1VarB);
                if (tzc1Var.c.size() > 5000) {
                    Iterator it = tzc1Var.c.entrySet().iterator();
                    it.next();
                    it.remove();
                }
            }
        }
        if (pzc1VarB instanceof rzc1) {
            return new kzc1(str4);
        }
        if (pzc1VarB instanceof pzc1) {
            return new kzc1(pzc1VarB.a());
        }
        if (!(pzc1VarB instanceof qzc1)) {
            eg.o();
            return null;
        }
        buo1 buo1VarA = ((qzc1) pzc1VarB).a();
        if ((buo1VarA instanceof xzc1) || (buo1VarA instanceof wzc1)) {
            return hzc1.a;
        }
        return buo1VarA instanceof uzc1 ? izc1.a : gzc1.a;
    }

    public final mzc1 b(String str, String str2, String str3) {
        Object objA = ((b0d1) this.a).a();
        if (objA instanceof m231) {
            objA = null;
        }
        fzc1 fzc1Var = (fzc1) objA;
        if (fzc1Var == null) {
            return new mzc1(str3);
        }
        if (!fzc1Var.a().equals(str)) {
            return new mzc1(str3);
        }
        byte[] bArrB = fzc1Var.b();
        if (bArrB.length != 32) {
            hhg1.n("key must be exactly 32 bytes");
            return null;
        }
        byte[] bArr = (byte[]) ((nda1) this.c.b).invoke();
        byte[] bArrR = rqo1.r(bArrB, cuo1.A(str, str2, bArr, str3));
        m231 m231Var = bArrR == null ? new m231(new SuperConnectHmacException()) : new ozc1(str3, bArr, bArrR);
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        ozc1 ozc1Var = (ozc1) m231Var;
        return new mzc1(str3, ozc1Var != null ? yto1.q(ozc1Var.a(), ozc1Var.b()) : null);
    }
}
