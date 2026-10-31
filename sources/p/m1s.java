package p;

import com.google.common.collect.ForwardingMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m1s extends ForwardingMap {
    public final Map a;

    public m1s(Map map) {
        this.a = map;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.standardContainsValue(obj);
    }

    @Override // com.google.common.collect.ForwardingMap
    public final Object delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Set entrySet() {
        return zqo1.p(super.entrySet(), new fv7((byte) 1));
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.standardEquals(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final int hashCode() {
        return super.standardHashCode();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Set keySet() {
        return zqo1.p(super.keySet(), new fv7((byte) 2));
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.common.collect.ForwardingMap
    public final Map delegate() {
        return this.a;
    }
}
