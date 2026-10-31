package p;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface f18 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    boolean d();

    c18 e(c18 c18Var);

    default void f(e18 e18Var) {
        flush();
    }

    default void flush() {
        throw new IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
    }

    void g(ByteBuffer byteBuffer);

    void h();

    boolean isActive();

    void reset();

    default long i(long j) {
        return j;
    }
}
