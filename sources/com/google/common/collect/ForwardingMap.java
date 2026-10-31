package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p.cf30;
import p.mno1;
import p.oqg0;
import p.t890;
import p.zno1;
import p.zqo1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ForwardingMap<K, V> extends cf30 implements Map<K, V> {
    @Override // java.util.Map
    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // 
    public abstract Map<K, V> delegate();

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return delegate().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return delegate().keySet();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        return delegate().put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public boolean standardContainsKey(Object obj) {
        return t890.k(new oqg0(entrySet().iterator(), (byte) 0), obj);
    }

    public boolean standardContainsValue(Object obj) {
        return t890.k(new oqg0(entrySet().iterator(), (byte) 1), obj);
    }

    public boolean standardEquals(Object obj) {
        return mno1.l(obj, this);
    }

    public int standardHashCode() {
        return zqo1.q(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V standardRemove(Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (zno1.k(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return mno1.B(this);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return delegate().values();
    }
}
