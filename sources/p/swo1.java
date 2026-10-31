package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class swo1 {
    public final yuo1 a;
    public final den1 b;
    public final String c;
    public final String d = UUID.randomUUID().toString();
    public final int e;

    public swo1(yuo1 yuo1Var, den1 den1Var, String str, int i) {
        this.a = yuo1Var;
        this.b = den1Var;
        this.c = str;
        this.e = i;
    }

    public final String a() {
        return this.c;
    }

    public final Object b(vu30 vu30Var, a8d1 a8d1Var) {
        return vu30Var.invoke(new zwo1(this.a, this.b, this), a8d1Var);
    }
}
