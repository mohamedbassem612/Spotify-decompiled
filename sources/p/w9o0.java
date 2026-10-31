package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class w9o0 {
    public static final s9o0 a;
    public static final s9o0 b;

    static {
        s9o0 s9o0Var = null;
        try {
            s9o0Var = (s9o0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = s9o0Var;
        b = new s9o0();
    }
}
