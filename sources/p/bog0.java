package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class bog0 {
    public static final xng0 a;
    public static final xng0 b;

    static {
        xng0 xng0Var = null;
        try {
            xng0Var = (xng0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = xng0Var;
        b = new xng0();
    }
}
