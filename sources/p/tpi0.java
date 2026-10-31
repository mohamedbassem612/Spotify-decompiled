package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tpi0 {
    public final int a;
    public final String b;
    public final String c;
    public final jwm d;
    public final jwm e;
    public final Function0 f;

    public tpi0(int i, String str, String str2, jwm jwmVar, jwm jwmVar2, Function0 function0) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpi0)) {
            return false;
        }
        tpi0 tpi0Var = (tpi0) obj;
        return this.a == tpi0Var.a && u890.j(this.b, tpi0Var.b) && u890.j(this.c, tpi0Var.c) && u890.j(this.d, tpi0Var.d) && this.e.equals(tpi0Var.e) && u890.j(this.f, tpi0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }
}
