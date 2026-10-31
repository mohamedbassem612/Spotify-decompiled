package p;

import android.content.SharedPreferences;
import android.util.Base64;
import com.spotify.superconnect.pairingapi.SuperConnectPairingKeyStoreError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b0d1 implements a0d1 {
    public final no5 a;
    public final idd1 b = new idd1(new fjc1(this, (byte) 8));

    public b0d1(no5 no5Var) {
        this.a = no5Var;
    }

    public static Object c(Object obj) {
        Throwable thA = e331.a(obj);
        if (thA == null) {
            return obj;
        }
        try {
            throw new SuperConnectPairingKeyStoreError.StorageUnavailable(thA);
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public static m231 d() {
        return new m231(new SuperConnectPairingKeyStoreError.StorageUnavailable(new IllegalStateException("Encrypted SharedPreferences unavailable")));
    }

    public final Object a() {
        Object m231Var;
        Object m231Var2;
        SharedPreferences sharedPreferences = (SharedPreferences) this.b.getValue();
        if (sharedPreferences == null) {
            return d();
        }
        try {
            m231Var = oqn1.n(sharedPreferences.getString("active-key-v1", null), sharedPreferences.getString("active-bound-hierarchy-v1", null));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Object objC = c(m231Var);
        Throwable thA = e331.a(objC);
        if (thA != null) {
            return new m231(thA);
        }
        mmr0 mmr0Var = (mmr0) objC;
        String str = (String) mmr0Var.a;
        String str2 = (String) mmr0Var.b;
        if (str == null || str2 == null) {
            return new m231(new SuperConnectPairingKeyStoreError.NoActiveKey());
        }
        try {
            m231Var2 = Base64.decode(str, 2);
        } catch (Throwable th2) {
            m231Var2 = new m231(th2);
        }
        byte[] bArr = (byte[]) (m231Var2 instanceof m231 ? null : m231Var2);
        return bArr == null ? new m231(new SuperConnectPairingKeyStoreError.NoActiveKey()) : new fzc1(str2, bArr);
    }

    public final Object b() {
        Object m231Var;
        Object m231Var2;
        SharedPreferences sharedPreferences = (SharedPreferences) this.b.getValue();
        if (sharedPreferences == null) {
            return d();
        }
        try {
            m231Var = null;
            String string = sharedPreferences.getString("pending-key-v1", null);
            if (string != null) {
                try {
                    m231Var2 = Base64.decode(string, 2);
                } catch (Throwable th) {
                    m231Var2 = new m231(th);
                }
                if (!(m231Var2 instanceof m231)) {
                    m231Var = m231Var2;
                }
                m231Var = (byte[]) m231Var;
            }
        } catch (Throwable th2) {
            m231Var = new m231(th2);
        }
        Object objC = c(m231Var);
        Throwable thA = e331.a(objC);
        if (thA != null) {
            return new m231(thA);
        }
        byte[] bArr = (byte[]) objC;
        return bArr != null ? new d0d1(bArr) : new m231(new SuperConnectPairingKeyStoreError.NoPendingKey());
    }
}
