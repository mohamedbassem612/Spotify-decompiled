package p;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vu7 {
    public final v0d1 a;
    public final Handler b;
    public ip00 c;
    public po7 d;
    public int f;
    public zu7 h;
    public float g = 1.0f;
    public byte e = 0;

    public vu7(final Context context, Looper looper, ip00 ip00Var) {
        final byte b = 0;
        this.a = zno1.u(new v0d1() { // from class: p.uu7
            public final Object get() {
                ajr ajrVar;
                byte b2 = b;
                Context context2 = context;
                switch (b2) {
                    case 0:
                        return kw7.u(context2);
                    case 1:
                        return new ojs(context2);
                    case 2:
                        return new z7s(context2, new vyr());
                    case 3:
                        return new exs(context2);
                    case 4:
                        bg11 bg11Var = ajr.P0;
                        synchronized (ajr.class) {
                            ajrVar = ajr.V0;
                            if (ajrVar == null) {
                                Context applicationContext = context2 == null ? null : context2.getApplicationContext();
                                HashMap map = new HashMap(8);
                                map.put(0, 1000000L);
                                map.put(2, -9223372036854775807L);
                                map.put(3, -9223372036854775807L);
                                map.put(4, -9223372036854775807L);
                                map.put(5, -9223372036854775807L);
                                map.put(10, -9223372036854775807L);
                                map.put(9, -9223372036854775807L);
                                map.put(7, -9223372036854775807L);
                                ajrVar = new ajr(applicationContext, map);
                                ajr.V0 = ajrVar;
                            }
                            break;
                        }
                        return ajrVar;
                    default:
                        return new z7s(context2, new vyr());
                }
            }
        });
        this.c = ip00Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        byte b = this.e;
        if (b == 1 || b == 0 || this.h == null) {
            return;
        }
        kw7.e((AudioManager) this.a.get(), this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        ip00 ip00Var = this.c;
        if (ip00Var != null) {
            ip00Var.g.j(34);
        }
    }

    public final int c(int i, boolean z) {
        int i2;
        ij81 ij81Var;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        byte b = this.e;
        if (z) {
            if (b != 2) {
                zu7 zu7Var = this.h;
                if (zu7Var == null) {
                    if (zu7Var == null) {
                        ij81Var = new ij81((byte) 4);
                        po7 po7Var = po7.i;
                        ij81Var.b = i2;
                    } else {
                        ij81 ij81Var2 = new ij81((byte) 4);
                        ij81Var2.b = zu7Var.a;
                        ij81Var = ij81Var2;
                    }
                    po7 po7Var2 = this.d;
                    boolean z2 = po7Var2 != null && po7Var2.a == 1;
                    po7Var2.getClass();
                    this.h = new zu7(ij81Var.b, new AudioManager.OnAudioFocusChangeListener() { // from class: p.tu7
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i3) {
                            po7 po7Var3;
                            vu7 vu7Var = this.a;
                            vu7Var.getClass();
                            if (i3 == -3 || i3 == -2) {
                                if (i3 != -2 && ((po7Var3 = vu7Var.d) == null || po7Var3.a != 1)) {
                                    vu7Var.b(4);
                                    return;
                                }
                                ip00 ip00Var = vu7Var.c;
                                if (ip00Var != null) {
                                    ip00Var.g.b(33, 0, 0).b();
                                }
                                vu7Var.b(3);
                                return;
                            }
                            if (i3 == -1) {
                                ip00 ip00Var2 = vu7Var.c;
                                if (ip00Var2 != null) {
                                    ip00Var2.g.b(33, -1, 0).b();
                                }
                                vu7Var.a();
                                vu7Var.b(1);
                                return;
                            }
                            if (i3 != 1) {
                                td6.p(i3, "Unknown focus change type: ");
                                return;
                            }
                            vu7Var.b(2);
                            ip00 ip00Var3 = vu7Var.c;
                            if (ip00Var3 != null) {
                                ip00Var3.g.b(33, 1, 0).b();
                            }
                        }
                    }, this.b, po7Var2, z2, true);
                }
                int iE = kw7.E((AudioManager) this.a.get(), this.h);
                if (iE == 1 || iE == 2) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (b == 1) {
                return -1;
            }
            if (b == 3) {
                return 0;
            }
        }
        return 1;
    }
}
