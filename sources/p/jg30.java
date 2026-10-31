package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jg30 implements ahn {
    public final /* synthetic */ byte a;
    public Serializable b;

    public jg30() {
        this.a = (byte) 2;
        this.b = new ArrayList();
    }

    public final wk21 a() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                if (str != null) {
                    return new wk21("Fragment navigation stack", "Each of the fragment classes pushed on the navigation stack, latest last.", str);
                }
                return null;
            case 1:
                String str2 = (String) this.b;
                if (str2 != null) {
                    return new wk21("Free Internal Storage", "Tells you if the user might be low on internal storage or not.", f4i1.f("Free internal storage by StatFs: ", str2, "\n"));
                }
                return null;
            default:
                StringBuilder sb = new StringBuilder(2048);
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                }
                return new wk21("Feature flags", "All flags that have ever been read, including their values. First value was read least recently, last value was read most recently.", sb.toString());
        }
    }

    public final void b(ugn ugnVar) {
        switch (this.a) {
            case 0:
                if (ugnVar instanceof bfn) {
                    this.b = ((bfn) ugnVar).a;
                }
                break;
            case 1:
                if (ugnVar instanceof cfn) {
                    this.b = eqr0.v(ugnVar);
                }
                break;
        }
    }

    private final void c(ugn ugnVar) {
    }
}
