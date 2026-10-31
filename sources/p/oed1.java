package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class oed1 {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        String m231Var;
        String m231Var2;
        String m231Var3;
        try {
            m231Var = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        String str = m231Var;
        boolean z = false;
        a = str != null && Boolean.parseBoolean(str);
        try {
            m231Var2 = System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation");
        } catch (Throwable th2) {
            m231Var2 = new m231(th2);
        }
        if (m231Var2 instanceof m231) {
            m231Var2 = null;
        }
        String str2 = m231Var2;
        b = str2 != null && Boolean.parseBoolean(str2);
        try {
            m231Var3 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th3) {
            m231Var3 = new m231(th3);
        }
        String str3 = m231Var3 instanceof m231 ? null : m231Var3;
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z = true;
        }
        c = z;
    }

    public static final boolean a() {
        return c;
    }

    public static final boolean b() {
        return b;
    }

    public static final boolean c() {
        return a;
    }
}
