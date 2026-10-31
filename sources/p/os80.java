package p;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class os80 implements jbh0 {
    public final /* synthetic */ byte a;
    public final Serializable b;

    public /* synthetic */ os80(Serializable serializable, byte b) {
        this.a = b;
        this.b = serializable;
    }

    @Override // p.jbh0
    public final String description() {
        switch (this.a) {
            case 0:
                return "an intent with the action ".concat((String) this.b);
            default:
                return "List Route Group matcher";
        }
    }

    @Override // p.jbh0
    public final boolean match(Object obj) {
        byte b = this.a;
        Serializable serializable = this.b;
        switch (b) {
            case 0:
                return ((String) serializable).equals(((qs31) obj).a.getAction());
            default:
                Set set = s4b1.f;
                return ((Boolean) ((dw81) serializable).invoke(uic.x(((qs31) ((js31) obj)).a.getDataString()))).booleanValue();
        }
    }
}
