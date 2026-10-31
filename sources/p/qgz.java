package p;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qgz {
    public final yqg a;
    public final dl3 b;
    public final ArrayList c = new ArrayList();

    public qgz(yqg yqgVar, dl3 dl3Var) {
        this.a = yqgVar;
        this.b = dl3Var;
    }

    public final void a(String str) {
        synchronized (this) {
            try {
                if (((Boolean) this.b.invoke()).booleanValue()) {
                    if (this.c.size() >= 25) {
                        this.c.remove(0);
                    }
                    this.c.add(new mmr0(new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Long.valueOf(this.a.b())), str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, String str2, String str3) {
        if (((Boolean) this.b.invoke()).booleanValue()) {
            StringBuilder sb = new StringBuilder(str.concat(": "));
            sb.append(str2);
            if (str3 != null && str3.length() != 0) {
                sb.append(" | ");
                sb.append(str3);
            }
            a(sb.toString());
        }
    }
}
