package p;

import android.os.Bundle;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bks0 implements c7r0, t2r0 {
    public final String a;
    public iw4 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public t7r0 g;
    public t6e0 h;

    public bks0(String str, iw4 iw4Var) {
        this.a = str;
        this.b = iw4Var;
    }

    @Override // p.c7r0
    public final void a(upn1 upn1Var) {
        if (this.e) {
            return;
        }
        if (!this.d) {
            this.d = true;
            iw4 iw4Var = this.b;
            if (iw4Var != null) {
                String str = this.a;
                UUID uuidFromString = str != null ? UUID.fromString(str) : null;
                gyq0 gyq0Var = new gyq0(this, (byte) 29);
                iw4Var.f = uuidFromString;
                iw4Var.e = gyq0Var;
                iw4Var.e(1, true);
            }
        }
        if (upn1Var instanceof m7r0) {
            iw4 iw4Var2 = this.b;
            if (iw4Var2 != null) {
                iw4Var2.e(2, false);
                return;
            }
            return;
        }
        if (upn1Var instanceof l7r0) {
            iw4 iw4Var3 = this.b;
            if (iw4Var3 != null) {
                iw4Var3.a(2);
                return;
            }
            return;
        }
        if (upn1Var instanceof g7r0) {
            iw4 iw4Var4 = this.b;
            if (iw4Var4 != null) {
                iw4Var4.e(3, false);
                return;
            }
            return;
        }
        if (upn1Var instanceof f7r0) {
            iw4 iw4Var5 = this.b;
            if (iw4Var5 != null) {
                iw4Var5.a(3);
                return;
            }
            return;
        }
        if (upn1Var instanceof i7r0) {
            this.f = true;
            iw4 iw4Var6 = this.b;
            if (iw4Var6 != null) {
                iw4Var6.e(4, false);
                return;
            }
            return;
        }
        if (upn1Var instanceof h7r0) {
            this.f = false;
            boolean z = ((h7r0) upn1Var).c;
            iw4 iw4Var7 = this.b;
            if (iw4Var7 != null) {
                iw4Var7.d = z;
                iw4Var7.a(4);
            }
            if (z) {
                this.c = true;
                iw4 iw4Var8 = this.b;
                if (iw4Var8 != null) {
                    iw4Var8.e(5, false);
                    return;
                }
                return;
            }
            iw4 iw4Var9 = this.b;
            if (iw4Var9 != null) {
                iw4Var9.c();
            }
            this.b = null;
            this.e = true;
            return;
        }
        if (upn1Var instanceof j7r0) {
            if (this.c) {
                f();
                iw4 iw4Var10 = this.b;
                if (iw4Var10 != null) {
                    iw4Var10.a(5);
                }
                iw4 iw4Var11 = this.b;
                if (iw4Var11 != null) {
                    iw4Var11.c();
                }
                this.b = null;
                this.e = true;
                return;
            }
            return;
        }
        if (!(upn1Var instanceof n7r0)) {
            if (upn1Var instanceof k7r0) {
                return;
            }
            eg.o();
        } else {
            f();
            iw4 iw4Var12 = this.b;
            if (iw4Var12 != null) {
                iw4Var12.b(3);
            }
            this.b = null;
            this.e = true;
        }
    }

    @Override // p.c7r0
    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.c = bundle.getBoolean("waitingForFirstFrame");
        this.d = bundle.getBoolean("started");
        this.e = bundle.getBoolean("finished");
        this.f = bundle.getBoolean("dataLoadEventsAllowed");
    }

    @Override // p.t2r0
    public final void c(u2r0 u2r0Var) {
        iw4 iw4Var;
        if (!this.f || (iw4Var = this.b) == null) {
            return;
        }
        String strA = u2r0Var.a();
        String strB = u2r0Var.b();
        t45 t45Var = iw4Var.c;
        if (t45Var != null) {
            t45Var.b(strA, strB);
        }
    }

    @Override // p.c7r0
    public final Bundle d() {
        Bundle bundle = new Bundle();
        if (this.d && !this.e) {
            iw4 iw4Var = this.b;
            if (iw4Var != null) {
                iw4Var.b(3);
            }
            this.e = true;
        }
        bundle.putBoolean("waitingForFirstFrame", this.c);
        bundle.putBoolean("started", this.d);
        bundle.putBoolean("finished", this.e);
        bundle.putBoolean("dataLoadEventsAllowed", this.f);
        return bundle;
    }

    public final void f() {
        t7r0 t7r0Var = this.g;
        if (t7r0Var != null) {
            for (Map.Entry entry : t7r0Var.a.entrySet()) {
                iw4 iw4Var = this.b;
                if (iw4Var != null) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    t45 t45Var = iw4Var.c;
                    if (t45Var != null) {
                        t45Var.b(str, str2);
                    }
                }
            }
        }
    }

    @Override // p.c7r0
    public final void g(bbr0 bbr0Var) {
        this.g = (t7r0) bbr0Var.b0(t7r0.class).a();
        this.h = wqn1.s(bbr0Var);
    }

    @Override // p.um70
    public final String h() {
        t45 t45Var;
        UUID uuid;
        iw4 iw4Var = this.b;
        if (iw4Var == null || (t45Var = iw4Var.c) == null || (uuid = t45Var.e) == null) {
            return null;
        }
        return uuid.toString();
    }
}
