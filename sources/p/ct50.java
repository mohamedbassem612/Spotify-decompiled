package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ct50 implements iy5 {
    public static final List c;
    public static final Map d;
    public final bpb1 a = gio1.b(c);
    public String b;

    static {
        jy5 jy5Var = new jy5("hardcoded-apple-tv-pairing-success", "Test Apple TV — Pairing succeeds", "test-apple-tv.local", "192.0.2.10", false);
        jy5 jy5VarS = f0o1.s(11, "pairing-error", "Wrong PIN");
        jy5 jy5VarS2 = f0o1.s(12, "too-many-attempts", "Too many attempts");
        jy5 jy5VarS3 = f0o1.s(13, "too-many-devices", "Too many paired devices");
        jy5 jy5VarS4 = f0o1.s(14, "device-in-use", "Device in use");
        jy5 jy5VarS5 = f0o1.s(15, "unavailable", "Pairing unavailable");
        jy5 jy5VarS6 = f0o1.s(16, "not-responding", "Not responding");
        jy5 jy5VarS7 = f0o1.s(17, "connection-lost", "Connection lost");
        jy5 jy5VarS8 = f0o1.s(18, "unexpected-error", "Unexpected error");
        c = p7h.M(new jy5[]{jy5VarS, jy5VarS2, jy5VarS3, jy5VarS4, jy5VarS5, jy5VarS6, jy5VarS7, jy5VarS8, new jy5("hardcoded-apple-tv-paired", "Test Apple TV — Already paired", "test-apple-tv-paired.local", "192.0.2.19", true), jy5Var});
        d = sqg0.J(new mmr0[]{new mmr0(jy5VarS.a, fz5.b), new mmr0(jy5VarS2.a, fz5.e), new mmr0(jy5VarS3.a, fz5.d), new mmr0(jy5VarS4.a, fz5.g), new mmr0(jy5VarS5.a, fz5.f), new mmr0(jy5VarS6.a, fz5.h), new mmr0(jy5VarS7.a, fz5.i), new mmr0(jy5VarS8.a, fz5.X)});
    }

    public final Object a(jy5 jy5Var, lnm lnmVar) {
        this.b = jy5Var.a;
        return pz5.a;
    }

    public final Object f(int i, lnm lnmVar) {
        if (1000 > i || i >= 10000) {
            return new oz5(fz5.a, (String) null, 6);
        }
        String str = this.b;
        fz5 fz5Var = str != null ? (fz5) d.get(str) : null;
        if (fz5Var != null) {
            return new oz5(fz5Var, (String) null, 6);
        }
        bpb1 bpb1Var = this.a;
        Iterable<jy5> iterable = (Iterable) bpb1Var.getValue();
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        for (jy5 jy5Var : iterable) {
            if (u890.j(jy5Var.a, this.b)) {
                jy5Var = new jy5(jy5Var.d, jy5Var.a, jy5Var.b, jy5Var.c, jy5Var.e, jy5Var.g, true);
            }
            arrayList.add(jy5Var);
        }
        bpb1Var.m((Object) null, arrayList);
        return pz5.a;
    }
}
