package p;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class a1p1 {
    public final int a;
    public final bsd1 b = new bsd1();
    public final byte c;
    public final Bundle d;

    /* JADX WARN: Multi-variable type inference failed */
    public a1p1(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new zzq("Invalid response to one way request", null));
        }
    }

    public boolean b() {
        return true;
    }

    public final void c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzqVar);
            new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
        }
        this.b.a(zzqVar);
    }

    public final void d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle);
            new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
        }
        this.b.b(bundle);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append((int) this.c);
        sb.append(" id=");
        sb.append(this.a);
        sb.append(" oneWay=");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
