package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class f010 {
    public static final b010 a = new b010();
    public static final b010 b;

    static {
        b010 b010Var = null;
        try {
            b010Var = (b010) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = b010Var;
    }
}
