package p;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o5p1 implements p331 {
    public final Status a;
    public final yz5 b;
    public final String c;
    public final String d;
    public final boolean e;

    public o5p1(Status status, yz5 yz5Var, String str, String str2, boolean z) {
        this.a = status;
        this.b = yz5Var;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final yz5 a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final Status getStatus() {
        return this.a;
    }
}
