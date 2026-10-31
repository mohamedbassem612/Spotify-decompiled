package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zng0 {
    public static final vng0 a;
    public static final vng0 b;

    static {
        vng0 vng0Var = null;
        try {
            vng0Var = (vng0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = vng0Var;
        b = new vng0();
    }
}
