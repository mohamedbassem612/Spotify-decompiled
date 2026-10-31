package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hd70 implements i670 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final /* synthetic */ id70 e;

    public hd70(id70 id70Var, String str, String str2, String str3, String str4) {
        this.e = id70Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final i670 a(String str) {
        if (u890.j(this.d, str)) {
            return this;
        }
        x09 x09VarC = c();
        x09VarC.d = str;
        return x09VarC;
    }

    public final i670 b(String str) {
        if (u890.j(this.b, str)) {
            return this;
        }
        x09 x09VarC = c();
        x09VarC.b = str;
        return x09VarC;
    }

    public final id70 build() {
        return this.e;
    }

    public final x09 c() {
        x09 x09Var = new x09();
        x09Var.a = this.a;
        x09Var.b = this.b;
        x09Var.c = this.c;
        x09Var.d = this.d;
        return x09Var;
    }

    public final i670 d(String str) {
        if (u890.j(this.a, str)) {
            return this;
        }
        x09 x09VarC = c();
        x09VarC.a = str;
        return x09VarC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd70)) {
            return false;
        }
        hd70 hd70Var = (hd70) obj;
        return u890.j(this.a, hd70Var.a) && u890.j(this.b, hd70Var.b) && u890.j(this.c, hd70Var.c) && u890.j(this.d, hd70Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
