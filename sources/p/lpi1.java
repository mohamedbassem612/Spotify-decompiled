package p;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lpi1 implements WildcardType {
    public final Type a;
    public final Type b;

    public lpi1(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            bhn0.q();
            throw null;
        }
        if (typeArr.length != 1) {
            bhn0.q();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            m5n1.e(typeArr[0]);
            this.b = null;
            this.a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        m5n1.e(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            bhn0.q();
            throw null;
        }
        this.b = typeArr2[0];
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && m5n1.s(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : m5n1.f;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (this.a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super " + m5n1.W(type);
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + m5n1.W(type2);
    }
}
