package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s61 {
    public final long a;
    public final long b;
    public final float c;
    public final float d;
    public final c380 e;

    public s61(long j, long j2, float f, float f2, c380 c380Var) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = f2;
        this.e = c380Var;
    }

    public final c380 a() {
        return this.e;
    }

    public final float b() {
        return this.c;
    }

    public final long c() {
        return this.b;
    }

    public final float d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s61)) {
            return false;
        }
        s61 s61Var = (s61) obj;
        return TextUnit.a(this.a, s61Var.a) && TextUnit.a(this.b, s61Var.b) && Float.compare(this.c, s61Var.c) == 0 && Float.compare(this.d, s61Var.d) == 0 && u890.j(this.e, s61Var.e);
    }

    public final int hashCode() {
        wee1[] wee1VarArr = TextUnit.b;
        return this.e.hashCode() + x0d.f(x0d.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c), 31, this.d);
    }
}
