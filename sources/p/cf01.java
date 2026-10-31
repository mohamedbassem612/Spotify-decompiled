package p;

import android.net.Uri;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cf01 {
    public final g23 a;
    public final bpb1 b;
    public final Object c;
    public final xe01 d;

    public cf01(g23 g23Var, c9n c9nVar) {
        this.a = g23Var;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.b = bpb1VarB;
        this.c = new Object();
        this.d = d5p1.t(hu20.e(bpb1VarB, new af01((lnm) null, (Object) this, (byte) 0)), c9nVar, ey71.a, ayh1.a);
    }

    public final void a() {
        synchronized (this.c) {
            ze01 ze01Var = (ze01) this.b.getValue();
            this.b.l((Object) null);
            if (ze01Var != null) {
                bzn1.q(ze01Var.a, awl1.d(((fyh1) this.a.b).a));
            }
        }
    }

    public final void b(Uri uri, String str, hxh1 hxh1Var) {
        synchronized (this.c) {
            try {
                ze01 ze01Var = (ze01) this.b.getValue();
                if (ze01Var != null) {
                    bzn1.q(ze01Var.a, awl1.d(((fyh1) this.a.b).a));
                }
                UUID uuidRandomUUID = UUID.randomUUID();
                g23 g23Var = this.a;
                uuidRandomUUID.getClass();
                g23Var.h(uuidRandomUUID, uri, str, hxh1Var);
                bpb1 bpb1Var = this.b;
                ze01 ze01Var2 = new ze01(uuidRandomUUID, str, hxh1Var);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, ze01Var2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
