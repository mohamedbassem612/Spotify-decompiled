package p;

import android.content.SharedPreferences;
import android.util.Base64;
import com.spotify.superconnect.pairingapi.SuperConnectPairingKeyStoreError;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tzc1 {
    public final a0d1 a;
    public final hp91 b;
    public final LinkedHashMap c = new LinkedHashMap();

    public tzc1(a0d1 a0d1Var, hp91 hp91Var) {
        this.a = a0d1Var;
        this.b = hp91Var;
    }

    public final String a(String str) {
        b0d1 b0d1Var = (b0d1) this.a;
        Object objB = b0d1Var.b();
        byte[] bArrB = null;
        if (objB instanceof m231) {
            objB = null;
        }
        d0d1 d0d1Var = (d0d1) objB;
        if (d0d1Var != null) {
            bArrB = d0d1Var.a();
        } else {
            Object objA = b0d1Var.a();
            if (objA instanceof m231) {
                objA = null;
            }
            fzc1 fzc1Var = (fzc1) objA;
            if (fzc1Var != null) {
                bArrB = fzc1Var.b();
            }
        }
        return str + "|" + (bArrB != null ? Arrays.hashCode(bArrB) : 0);
    }

    public final szc1 b(String str, String str2, String str3) {
        Object m231Var;
        Object m231Var2;
        Object m231Var3;
        Object m231Var4;
        hp91 hp91Var = this.b;
        nl51 nl51Var = new nl51(hp91Var, (byte) 25);
        ozc1 ozc1VarV = yto1.v(str);
        b0d1 b0d1Var = (b0d1) this.a;
        Object objB = b0d1Var.b();
        if (objB instanceof m231) {
            objB = null;
        }
        d0d1 d0d1Var = (d0d1) objB;
        if (d0d1Var != null && ozc1VarV != null) {
            g0d1 g0d1VarQ = nl51Var.q(ozc1VarV, str2, str3, d0d1Var.a());
            if (g0d1VarQ instanceof g0d1) {
                if (str2.length() == 0) {
                    b0d1Var.getClass();
                    m231Var2 = new m231(new SuperConnectPairingKeyStoreError.EmptyHierarchyID());
                } else {
                    SharedPreferences sharedPreferences = (SharedPreferences) b0d1Var.b.getValue();
                    if (sharedPreferences == null) {
                        m231Var2 = b0d1.d();
                    } else {
                        try {
                            String string = sharedPreferences.getString("pending-key-v1", null);
                            if (string != null) {
                                try {
                                    m231Var4 = Base64.decode(string, 2);
                                } catch (Throwable th) {
                                    m231Var4 = new m231(th);
                                }
                                if (m231Var4 instanceof m231) {
                                    m231Var4 = null;
                                }
                                m231Var = (byte[]) m231Var4;
                            } else {
                                m231Var = null;
                            }
                        } catch (Throwable th2) {
                            m231Var = new m231(th2);
                        }
                        Object objC = b0d1.c(m231Var);
                        Throwable thA = e331.a(objC);
                        if (thA == null) {
                            byte[] bArr = (byte[]) objC;
                            if (bArr == null) {
                                m231Var2 = new m231(new SuperConnectPairingKeyStoreError.NoPendingKey());
                            } else {
                                try {
                                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                    editorEdit.getClass();
                                    editorEdit.putString("active-key-v1", Base64.encodeToString(bArr, 2));
                                    editorEdit.putString("active-bound-hierarchy-v1", str2);
                                    editorEdit.remove("pending-key-v1");
                                    editorEdit.apply();
                                    m231Var3 = rih1.a;
                                } catch (Throwable th3) {
                                    m231Var3 = new m231(th3);
                                }
                                m231Var2 = b0d1.c(m231Var3);
                            }
                        } else {
                            m231Var2 = new m231(thA);
                        }
                    }
                }
                if (!(m231Var2 instanceof m231)) {
                    return new pzc1(g0d1VarQ.E(), true);
                }
                hp91Var.n(ozc1VarV.a());
            }
        }
        Object objA = b0d1Var.a();
        if (objA instanceof m231) {
            objA = null;
        }
        fzc1 fzc1Var = (fzc1) objA;
        if (fzc1Var == null) {
            return new qzc1(xzc1.b);
        }
        if (!u890.j(str2, fzc1Var.a())) {
            return ozc1VarV != null ? new qzc1(uzc1.b) : rzc1.a;
        }
        if (ozc1VarV == null) {
            return new qzc1(wzc1.b);
        }
        g0d1 g0d1VarQ2 = nl51Var.q(ozc1VarV, str2, str3, fzc1Var.b());
        if (g0d1VarQ2 instanceof g0d1) {
            return new pzc1(g0d1VarQ2.E());
        }
        if (g0d1VarQ2 instanceof f0d1) {
            return new qzc1(((f0d1) g0d1VarQ2).E());
        }
        eg.o();
        return null;
    }
}
