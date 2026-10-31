package p;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vzh {
    public final String a;
    public final Set b;
    public final Set c;
    public final byte d;
    public final boolean e;
    public final v0i f;
    public final Set g;

    /* JADX WARN: Multi-variable type inference failed */
    public vzh(String str, Set set, Set set2, int i, int i2, v0i v0iVar, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = v0iVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static hzh a(Class cls) {
        return new hzh(cls, new Class[0]);
    }

    public static hzh b(lzy0 lzy0Var) {
        return new hzh(lzy0Var, new lzy0[0]);
    }

    public static vzh c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lzy0.a(cls));
        for (Class cls2 : clsArr) {
            hm5.m(cls2, "Null interface");
            hashSet.add(lzy0.a(cls2));
        }
        return new vzh(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new czh(obj, (byte) 0), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + ((int) this.d) + ", type=" + (this.e ? 1 : 0) + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
