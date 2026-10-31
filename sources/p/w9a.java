package p;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class w9a implements f18 {
    public c18 b;
    public c18 c;
    public c18 d;
    public c18 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public w9a() {
        ByteBuffer byteBuffer = f18.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        c18 c18Var = c18.e;
        this.d = c18Var;
        this.e = c18Var;
        this.b = c18Var;
        this.c = c18Var;
    }

    @Override // p.f18
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = f18.a;
        return byteBuffer;
    }

    public c18 b(c18 c18Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (c18Var.c == 2) {
            return c18Var.a == -1 ? c18.e : c18Var;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c18Var);
    }

    @Override // p.f18
    public boolean d() {
        return this.h && this.g == f18.a;
    }

    @Override // p.f18
    public final c18 e(c18 c18Var) {
        this.d = c18Var;
        this.e = b(c18Var);
        return isActive() ? this.e : c18.e;
    }

    @Override // p.f18
    public final void f(e18 e18Var) {
        this.g = f18.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        c();
    }

    @Override // p.f18
    public final void flush() {
        f(e18.d);
    }

    @Override // p.f18
    public final void h() {
        this.h = true;
        j();
    }

    @Override // p.f18
    public boolean isActive() {
        return this.e != c18.e;
    }

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // p.f18
    public final void reset() {
        ByteBuffer byteBuffer = f18.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        c18 c18Var = c18.e;
        this.d = c18Var;
        this.e = c18Var;
        this.b = c18Var;
        this.c = c18Var;
        k();
    }

    public void c() {
    }

    public void j() {
    }

    public void k() {
    }
}
