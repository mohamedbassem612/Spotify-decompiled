package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class y9o0 {
    public static final u9o0 a;
    public static final u9o0 b;

    static {
        u9o0 u9o0Var = null;
        try {
            u9o0Var = (u9o0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = u9o0Var;
        b = new u9o0();
    }
}
