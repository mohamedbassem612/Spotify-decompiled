package j$.nio.file;

import java.io.Closeable;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public abstract class h implements Closeable {
    public Iterable a() {
        throw new UnsupportedOperationException("");
    }

    public abstract Path b(String str, String... strArr);

    public abstract f0 c(String str);

    public abstract Iterable d();

    public String e() {
        return "/";
    }

    public j$.nio.file.attribute.b0 f() {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return false;
    }

    public o0 h() {
        throw new UnsupportedOperationException();
    }

    public abstract j$.nio.file.spi.c i();

    public boolean isOpen() {
        return true;
    }

    public Set j() {
        return j$.desugar.sun.nio.fs.g.p(new Object[]{"basic"});
    }
}
