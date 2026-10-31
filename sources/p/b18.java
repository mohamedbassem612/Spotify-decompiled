package p;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b18 {
    public final b380 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public c18 d;
    public c18 e;
    public boolean f;

    public b18(b380 b380Var) {
        this.a = b380Var;
        c18 c18Var = c18.e;
        this.d = c18Var;
        this.e = c18Var;
        this.f = false;
    }

    public final c18 a(c18 c18Var) {
        if (c18Var.equals(c18.e)) {
            throw new AudioProcessor$UnhandledAudioFormatException(c18Var);
        }
        int i = 0;
        while (true) {
            b380 b380Var = this.a;
            if (i >= b380Var.size()) {
                this.e = c18Var;
                return c18Var;
            }
            f18 f18Var = (f18) b380Var.get(i);
            c18 c18VarE = f18Var.e(c18Var);
            if (f18Var.isActive()) {
                dm5.y(!c18VarE.equals(c18.e));
                c18Var = c18VarE;
            }
            i++;
        }
    }

    public final void b(e18 e18Var) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = this.e;
        this.f = false;
        int i = 0;
        while (true) {
            b380 b380Var = this.a;
            if (i >= b380Var.size()) {
                break;
            }
            f18 f18Var = (f18) b380Var.get(i);
            f18Var.f(e18Var);
            if (f18Var.isActive()) {
                d18 d18Var = new d18();
                long j = e18Var.a;
                d18Var.a = j;
                d18Var.b = e18Var.b;
                d18Var.c = e18Var.c;
                d18Var.a = f18Var.i(j);
                e18Var = d18Var.i();
                arrayList.add(f18Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = ((f18) arrayList.get(i2)).a();
        }
    }

    public final int c() {
        return this.c.length - 1;
    }

    public final ByteBuffer d() {
        if (!f()) {
            return f18.a;
        }
        ByteBuffer byteBuffer = this.c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(f18.a);
        return this.c[c()];
    }

    public final boolean e() {
        return this.f && ((f18) this.b.get(c())).d() && !this.c[c()].hasRemaining();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b18)) {
            return false;
        }
        b380 b380Var = ((b18) obj).a;
        b380 b380Var2 = this.a;
        if (b380Var2.size() != b380Var.size()) {
            return false;
        }
        for (int i = 0; i < b380Var2.size(); i++) {
            if (b380Var2.get(i) != b380Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return !this.b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= c(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    f18 f18Var = (f18) arrayList.get(i);
                    if (!f18Var.d()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : f18.a;
                        long jRemaining = byteBuffer2.remaining();
                        f18Var.g(byteBuffer2);
                        this.c[i] = f18Var.a();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < c()) {
                        ((f18) arrayList.get(i + 1)).h();
                    }
                }
            }
        }
    }

    public final void h() {
        if (!f() || this.f) {
            return;
        }
        this.f = true;
        ((f18) this.b.get(0)).h();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(ByteBuffer byteBuffer) {
        if (!f() || this.f) {
            return;
        }
        g(byteBuffer);
    }

    public final void j() {
        int i = 0;
        while (true) {
            b380 b380Var = this.a;
            if (i >= b380Var.size()) {
                this.b.clear();
                this.c = new ByteBuffer[0];
                c18 c18Var = c18.e;
                this.d = c18Var;
                this.e = c18Var;
                this.f = false;
                return;
            }
            f18 f18Var = (f18) b380Var.get(i);
            f18Var.f(e18.d);
            f18Var.reset();
            i++;
        }
    }
}
