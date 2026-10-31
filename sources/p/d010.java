package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class d010 {
    public static final a010 a = new a010();
    public static final a010 b;

    static {
        a010 a010Var = null;
        try {
            a010Var = (a010) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = a010Var;
    }

    public static a010 a() {
        a010 a010Var = b;
        if (a010Var != null) {
            return a010Var;
        }
        eg.m("Protobuf runtime is not correctly loaded.");
        return null;
    }
}
