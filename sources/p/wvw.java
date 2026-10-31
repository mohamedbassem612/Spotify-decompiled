package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wvw extends xbk1 {
    public final ohv0 b;
    public final jut c;
    public final yqg d;
    public final long e;
    public final long f;
    public final bpb1 g;
    public final xe01 h;
    public xab1 i;
    public final xab1 t;

    public wvw(ohv0 ohv0Var, jut jutVar, yqg yqgVar, long j, long j2) {
        this.b = ohv0Var;
        this.c = jutVar;
        this.d = yqgVar;
        this.e = j;
        this.f = j2;
        bpb1 bpb1VarB = gio1.b(new vvw(true, false, svw.a, kvw.a));
        this.g = bpb1VarB;
        this.h = d5p1.h(bpb1VarB);
        if (j <= 0) {
            return;
        }
        long jB = j - yqgVar.b();
        if (jB <= 0) {
            T();
        } else {
            this.t = fn31.T(ack1.a(this), (o8n) null, 0, new kv2(jB, this, (lnm) null, (byte) 7), 3);
        }
    }

    public final void T() {
        xab1 xab1Var = this.t;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        U(ovw.a);
        W(new jhv0("email_otp", "error_endpoint_login_otp-session-expired", 12, (String) null));
    }

    public final void U(uvw uvwVar) {
        while (true) {
            bpb1 bpb1Var = this.g;
            Object value = bpb1Var.getValue();
            uvw uvwVar2 = uvwVar;
            if (bpb1Var.k(value, vvw.a((vvw) value, false, false, uvwVar2, null, 10))) {
                return;
            } else {
                uvwVar = uvwVar2;
            }
        }
    }

    public final void V(nvw nvwVar) {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        while (true) {
            bpb1 bpb1Var = this.g;
            Object value = bpb1Var.getValue();
            nvw nvwVar2 = nvwVar;
            if (bpb1Var.k(value, vvw.a((vvw) value, false, false, null, nvwVar2, 7))) {
                this.i = fn31.T(ack1.a(this), (o8n) null, 0, new fvw(this, null), 3);
                return;
            }
            nvwVar = nvwVar2;
        }
    }

    public final void W(xap1 xap1Var) {
        this.b.a(xap1Var);
    }

    public final void X() {
        W(new nhv0("email_otp", (String) null));
    }
}
