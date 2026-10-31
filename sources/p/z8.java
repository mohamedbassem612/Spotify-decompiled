package p;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class z8 extends AbstractMap implements Map, sla0 {
    public Set a() {
        return new lps0(this, (byte) 0);
    }

    public Set b() {
        return new ops0(this, (byte) 0);
    }

    public abstract /* bridge */ int c();

    public Collection d() {
        return new zkg0(this, (byte) 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return d();
    }
}
