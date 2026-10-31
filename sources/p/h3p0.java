package p;

import android.view.View;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h3p0 implements sek1 {
    public final qzh a;
    public final Connectable b;
    public Connection c;

    public h3p0(qzh qzhVar, Connectable connectable) {
        this.a = qzhVar;
        this.b = connectable;
    }

    public final synchronized void a() {
        if (this.c != null) {
            throw new IllegalStateException("Already started, cannot call start again before stop.");
        }
        Connection connectionL = this.b.L(new y11(this.a, (byte) 16));
        qzh qzhVar = this.a;
        connectionL.getClass();
        qzhVar.n(new v6a(1, connectionL, Connection.class, "accept", "accept(Ljava/lang/Object;)V", 0, (byte) 7));
        this.c = connectionL;
    }

    public final synchronized void b() {
        try {
            this.a.n(pzo0.h);
            Connection connection = this.c;
            if (connection != null) {
                connection.dispose();
            }
            this.c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final View getView() {
        return this.a.getView();
    }
}
