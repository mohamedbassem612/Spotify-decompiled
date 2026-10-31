package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.musicappplatform.state.idle.api.MusicAppLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uue0 implements po70 {
    @Override // p.po70
    public final void a(MusicAppLock musicAppLock) {
        Logger.b(f4i1.f("Lock ", musicAppLock.getName(), " released."), new Object[0]);
    }

    @Override // p.po70
    public final void b() {
        Logger.b("Become idle.", new Object[0]);
    }

    @Override // p.po70
    public final void c() {
        Logger.b("Idle timer cancelled.", new Object[0]);
    }

    @Override // p.po70
    public final void d(MusicAppLock musicAppLock) {
        Logger.b(f4i1.f("Lock ", musicAppLock.getName(), " acquired."), new Object[0]);
    }

    @Override // p.po70
    public final void e(MusicAppLock musicAppLock) {
        Logger.b(f4i1.f("Lock re-acquired ", musicAppLock.getName(), "."), new Object[0]);
    }

    @Override // p.po70
    public final void f() {
        Logger.b("Idle timer started.", new Object[0]);
    }

    @Override // p.po70
    public final void g() {
        Logger.b("Become active.", new Object[0]);
    }

    @Override // p.po70
    public final void h(MusicAppLock musicAppLock) {
        Logger.b(f4i1.f("Attempted to release ", musicAppLock.getName(), " before acquire."), new Object[0]);
    }
}
