package p;

import android.os.Bundle;
import androidx.media3.session.legacy.MediaSessionManager;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rph0 implements hxh0 {
    public final MediaSessionManager.RemoteUserInfo b;
    public final /* synthetic */ tph0 d;
    public final Object a = new Object();
    public final ArrayList c = new ArrayList();

    public rph0(tph0 tph0Var, MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.d = tph0Var;
        this.b = remoteUserInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rph0) {
            return Objects.equals(this.b, ((rph0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b);
    }

    @Override // p.hxh0
    public final void m(int i, String str) {
        this.d.notifyChildrenChanged(this.b, str, Bundle.EMPTY);
    }

    @Override // p.hxh0
    public final void n(int i, String str, iph0 iph0Var) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            try {
                for (int size = this.c.size() - 1; size >= 0; size--) {
                    sph0 sph0Var = (sph0) this.c.get(size);
                    if (Objects.equals(this.b, sph0Var.b) && sph0Var.c.equals(str)) {
                        arrayList.add(sph0Var);
                        this.c.remove(size);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.d.a(new ag20(this, arrayList, (byte) 20));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
