package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class apn0 {
    public static final ton0 d;
    public static final ton0 e;
    public static final ton0 g;
    public static final ton0 h;
    public static final ton0 j;
    public static final ton0 k;
    public static final ton0 m;
    public static final ton0 n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ton0 f12p;
    public static final ton0 q;
    public final boolean a;
    public static final uon0 b = new uon0((byte) 2, false);
    public static final uon0 c = new uon0((byte) 4, false);
    public static final uon0 f = new uon0((byte) 3, false);
    public static final uon0 i = new uon0((byte) 1, false);
    public static final uon0 l = new uon0((byte) 0, false);
    public static final uon0 o = new uon0((byte) 5, true);

    static {
        boolean z = true;
        d = new ton0((byte) 4, z);
        e = new ton0((byte) 5, z);
        g = new ton0((byte) 6, z);
        h = new ton0((byte) 7, z);
        j = new ton0((byte) 2, z);
        k = new ton0((byte) 3, z);
        m = new ton0((byte) 0, z);
        n = new ton0((byte) 1, z);
        f12p = new ton0((byte) 8, z);
        q = new ton0((byte) 9, z);
    }

    public apn0(boolean z) {
        this.a = z;
    }

    public Object a(Bundle bundle, String str) {
        return (double[]) bundle.get(str);
    }

    public String b() {
        return "double[]";
    }

    public Object c(Object obj, String str) {
        return d(str);
    }

    public Object d(String str) {
        return new double[]{Double.parseDouble(str)};
    }

    public void e(Bundle bundle, String str, Object obj) {
        bundle.putDoubleArray(str, (double[]) obj);
    }

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
