package p;

import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class nue0 {
    public static final hte0 a = new hte0();

    public static void a() {
        a.getClass();
    }

    public static void b() {
        a.getClass();
    }

    public static void c(String str) {
        a.getClass();
        HashSet hashSet = hte0.a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }

    public static void d(String str) {
        a.getClass();
        HashSet hashSet = hte0.a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }
}
