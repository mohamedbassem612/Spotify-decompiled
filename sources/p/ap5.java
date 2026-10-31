package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService;
import com.spotify.musicappplatform.state.idle.api.MusicAppLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ap5 implements po70 {
    public final Context a;
    public final t961 b;
    public final cd30 c;

    public ap5(Context context, t961 t961Var, cd30 cd30Var) {
        this.a = context;
        this.b = t961Var;
        this.c = cd30Var;
    }

    @Override // p.po70
    public final void a(MusicAppLock musicAppLock) {
        if (musicAppLock instanceof tzm0) {
            j((tzm0) musicAppLock);
        }
    }

    @Override // p.po70
    public final void d(MusicAppLock musicAppLock) {
        Context applicationContext = this.a.getApplicationContext();
        if (musicAppLock instanceof tzm0) {
            i((tzm0) musicAppLock);
            return;
        }
        applicationContext.getClass();
        ((w961) this.b).b(applicationContext, new Intent(this.c.a.getApplicationContext(), (Class<?>) ForegroundKeeperService.class));
    }

    @Override // p.po70
    public final void e(MusicAppLock musicAppLock) {
        if (musicAppLock instanceof tzm0) {
            i((tzm0) musicAppLock);
        }
    }

    @Override // p.po70
    public final void h(MusicAppLock musicAppLock) {
        if (musicAppLock instanceof tzm0) {
            j((tzm0) musicAppLock);
        }
    }

    public final void i(tzm0 tzm0Var) {
        ld30 ld30Var = tzm0Var.a;
        if (tzm0Var instanceof pzm0) {
            ld30 ld30Var2 = tzm0Var.a;
            if (!(ld30Var2 instanceof jd30)) {
                bhn0.s(ld30Var2, "Not supported action ");
                return;
            }
        } else if (!(tzm0Var instanceof rzm0) && !(tzm0Var instanceof qzm0) && !(tzm0Var instanceof szm0)) {
            eg.o();
            return;
        } else if (!(ld30Var instanceof gd30)) {
            bhn0.s(ld30Var, "Not supported action ");
            return;
        }
        ((w961) this.b).a(this.a.getApplicationContext(), this.c.a(ld30Var));
    }

    public final void j(tzm0 tzm0Var) {
        id30 kd30Var;
        if (tzm0Var instanceof rzm0) {
            id30 id30Var = tzm0Var.a;
            if (id30Var instanceof gd30) {
                kd30Var = new id30();
            } else {
                if (!(id30Var instanceof id30)) {
                    hhg1.g(id30Var, "Not supported action ");
                    return;
                }
                kd30Var = id30Var;
            }
        } else if (tzm0Var instanceof pzm0) {
            id30 id30Var2 = tzm0Var.a;
            if (id30Var2 instanceof jd30) {
                kd30Var = new hd30(((jd30) id30Var2).a());
            } else {
                if (!(id30Var2 instanceof hd30)) {
                    hhg1.g(id30Var2, "Not supported action ");
                    return;
                }
                kd30Var = (hd30) id30Var2;
            }
        } else {
            if (!(tzm0Var instanceof qzm0) && !(tzm0Var instanceof szm0)) {
                eg.o();
                return;
            }
            ld30 ld30Var = tzm0Var.a;
            if (!(ld30Var instanceof gd30) && !(ld30Var instanceof kd30)) {
                hhg1.g(ld30Var, "Not supported action ");
                return;
            }
            kd30Var = new kd30(k4p1.x("AppLifecycleServiceEventListener"));
        }
        ((w961) this.b).b(this.a, this.c.a(kd30Var));
    }
}
