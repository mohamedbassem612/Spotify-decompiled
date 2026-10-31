package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qpr0 extends fho1 {
    public final /* synthetic */ byte d;
    public final String e;
    public final boolean f;

    public qpr0(String str, boolean z, byte b) {
        this.d = b;
        switch (b) {
            case 1:
                Objects.requireNonNull(str, "name == null");
                this.e = str;
                this.f = z;
                break;
            default:
                Objects.requireNonNull(str, "name == null");
                this.e = str;
                this.f = z;
                break;
        }
    }

    public final void l(un21 un21Var, Object obj) {
        String string;
        String string2;
        byte b = this.d;
        boolean z = this.f;
        String str = this.e;
        switch (b) {
            case 0:
                if (obj != null && (string = obj.toString()) != null) {
                    un21Var.a(str, string, z);
                }
                break;
            default:
                if (obj != null && (string2 = obj.toString()) != null) {
                    un21Var.b(str, string2, z);
                }
                break;
        }
    }
}
