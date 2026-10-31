package p;

import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mb00 {
    public final s561 a;
    public final t561 b;
    public final s900 c;
    public final ue00 d;
    public final xk4 e;
    public final zq4 f;

    public mb00(s561 s561Var, t561 t561Var, s900 s900Var, ue00 ue00Var, xk4 xk4Var, zq4 zq4Var) {
        this.a = s561Var;
        this.b = t561Var;
        this.c = s900Var;
        this.d = ue00Var;
        this.e = xk4Var;
        this.f = zq4Var;
    }

    public final void a(String str, byte[] bArr, byte[] bArr2, boolean z, String str2, long j) {
        String strA = this.e.a();
        ue00 ue00Var = this.d;
        qyo1.x(ue00Var.b, false, true, new te00(ue00Var, str, bArr, this.b, bArr2, this.c, this.f, z, str2, strA, j));
    }

    public final void b(String str, byte[] bArr, boolean z, String str2, long j, boolean z2) {
        String string;
        s561 s561Var = this.a;
        String strA = s561Var.a.a();
        String strA2 = s561Var.b.a();
        jmq jmqVar = s561Var.c;
        cu71 cu71Var = (cu71) jmqVar.b;
        if (((Number) qyo1.x(((ld00) jmqVar.a).a, true, false, new z5z(1, (byte) 2))).intValue() == 0) {
            string = UUID.randomUUID().toString();
            cu71Var.a.c().edit().putString("database_id", string).apply();
            jmqVar.c = string;
        } else {
            string = (String) jmqVar.c;
            if (string == null) {
                cu71Var.getClass();
                nn61 nn61Var = cu71Var.a;
                string = nn61Var.c().getString("database_id", null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    nn61Var.c().edit().putString("database_id", string).apply();
                    jmqVar.c = string;
                }
            }
        }
        byte[] bArrA = s561Var.a(str2, strA, strA2, string);
        if (str2 != null && !s561Var.d.containsKey("")) {
            s561Var.a((String) null, strA, strA2, string);
        }
        c(str, bArr, bArrA, z, str2, j, z2);
    }

    public final void c(String str, byte[] bArr, byte[] bArr2, boolean z, String str2, long j, boolean z2) {
        if (!z2) {
            try {
                a(str, bArr, bArr2, z, str2, j);
                return;
            } catch (SQLiteReadOnlyDatabaseException unused) {
                Thread.yield();
                a(str, bArr, bArr2, z, str2, j);
                return;
            }
        }
        try {
            a(str, bArr, bArr2, z, str2, j);
        } catch (Throwable th) {
            th.getMessage();
            this.f.a();
            Thread.yield();
            a(str, bArr, bArr2, z, str2, j);
        }
    }
}
