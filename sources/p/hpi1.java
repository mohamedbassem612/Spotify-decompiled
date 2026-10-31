package p;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hpi1 implements GenericArrayType {
    public final Type a;

    public hpi1(Type type) {
        this.a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && m5n1.s(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return m5n1.W(this.a) + "[]";
    }
}
