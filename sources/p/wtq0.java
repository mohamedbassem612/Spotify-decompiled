package p;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class wtq0 {
    public final Object a;

    public wtq0(Object obj) {
        this.a = obj;
    }

    public void a(Surface surface) {
        if (((OutputConfiguration) c()).getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!e()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    public void b() {
        ((vtq0) this.a).c = true;
    }

    public Object c() {
        Object obj = this.a;
        o0c.l(obj instanceof vtq0);
        return ((vtq0) obj).a;
    }

    public String d() {
        return ((vtq0) this.a).b;
    }

    public boolean e() {
        return ((vtq0) this.a).c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wtq0)) {
            return false;
        }
        return this.a.equals(((wtq0) obj).a);
    }

    public void f(long j) {
        ((vtq0) this.a).d = j;
    }

    public void h(String str) {
        ((vtq0) this.a).b = str;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public void g(int i) {
    }

    public void i(long j) {
    }
}
