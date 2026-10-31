package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class uj30 {
    public final ArrayList a;
    public long b = 0;
    public long c = 0;
    public boolean d = false;
    public long e = 0;

    public uj30(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        uj30 uj30Var = (uj30) obj;
        return this.b == uj30Var.b && this.c == uj30Var.c && this.d == uj30Var.d && this.a.equals(uj30Var.a);
    }

    public final int b() {
        return this.a.hashCode() + xcg1.g(cy30.f(Long.hashCode(this.b) * 31, this.c, 31), 31, this.d);
    }

    public boolean equals(Object obj) {
        return (obj instanceof uj30) && a(obj) && this.e == ((uj30) obj).e;
    }

    public int hashCode() {
        return Long.hashCode(this.e) + (b() * 31);
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.b + ", frameDurationUiNanos=" + this.c + ", frameDurationCpuNanos=" + this.e + ", isJank=" + this.d + ", states=" + this.a + ')';
    }
}
