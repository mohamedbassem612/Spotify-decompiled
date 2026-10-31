package p;

import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;
import spotify.autodownload.esperanto.proto.ShowStateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nql implements Function, BiFunction {
    public final /* synthetic */ byte a;
    public final String b;
    public final boolean c;

    public nql(boolean z, String str) {
        this.a = (byte) 2;
        this.c = z;
        this.b = str;
    }

    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        ShowStateResponse showStateResponse = (ShowStateResponse) obj2;
        String strN = showStateResponse.n();
        if (strN == null || strN.length() == 0) {
            if (showStateResponse.getEnabled()) {
                return new ut8(bool.booleanValue());
            }
            return this.c ? vt8.a : new tt8(bool.booleanValue());
        }
        n57.e("Error fetching state for " + this.b + ", error=" + showStateResponse.n());
        return vt8.b;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                String str = this.c ? "Applink" : "Unclassified";
                String str2 = this.b;
                if (str2 == null) {
                    return str;
                }
                return str + '(' + str2 + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ nql(String str, boolean z, byte b) {
        this.a = b;
        this.b = str;
        this.c = z;
    }

    public Object apply(Object obj) {
        iix0 iix0Var = (iix0) ((Map) obj).get(this.b);
        return new n781(iix0Var != null ? iix0Var.g() : false, !this.c);
    }
}
