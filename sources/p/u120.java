package p;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u120 {
    public final String a;
    public final Map b;

    public u120(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static yfu a(String str) {
        return new yfu(str, (byte) 8);
    }

    public static u120 c(String str) {
        return new u120(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u120)) {
            return false;
        }
        u120 u120Var = (u120) obj;
        return this.a.equals(u120Var.a) && this.b.equals(u120Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
