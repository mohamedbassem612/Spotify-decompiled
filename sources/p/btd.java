package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class btd {
    public static final btd f = new btd(z6x.a, 0.0f, 0.0f, 0.0f, 0.0f);
    public final List a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public btd(List list, float f2, float f3, float f4, float f5) {
        this.a = list;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btd)) {
            return false;
        }
        btd btdVar = (btd) obj;
        return u890.j(this.a, btdVar.a) && p3v.c(this.b, btdVar.b) && p3v.c(this.c, btdVar.c) && p3v.c(this.d, btdVar.d) && p3v.c(this.e, btdVar.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + x0d.f(x0d.f(x0d.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
