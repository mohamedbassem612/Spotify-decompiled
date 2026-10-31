package defpackage;

import p.u890;
import p.x0d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a {
    public final String a;
    public final float b;
    public final float c;
    public final float d;

    public a(String str, float f, float f2, float f3) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final String a() {
        return this.a;
    }

    public final float b() {
        return this.c;
    }

    public final float c() {
        return this.d;
    }

    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return u890.j(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && Float.compare(2000.0f, 2000.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(2000.0f) + x0d.f(x0d.f(x0d.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
