package p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eo90 implements Iterator {
    public static final eo90 a;
    public static final /* synthetic */ eo90[] b;

    static {
        eo90 eo90Var = new eo90("INSTANCE", 0);
        a = eo90Var;
        b = new eo90[]{eo90Var};
    }

    public static eo90 valueOf(String str) {
        return (eo90) Enum.valueOf(eo90.class, str);
    }

    public static eo90[] values() {
        return (eo90[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        dm5.z(false, "no calls to next() since the last call to remove()");
    }
}
