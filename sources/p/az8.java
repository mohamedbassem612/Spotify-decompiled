package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class az8 implements Function, zo80 {
    public final /* synthetic */ byte a;
    public String b;
    public String c;

    public /* synthetic */ az8(String str, String str2, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
    }

    public bz8 a() {
        String str;
        String str2 = this.b;
        if (str2 != null && (str = this.c) != null) {
            return new bz8(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" key");
        }
        if (this.c == null) {
            sb.append(" value");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public Object apply(Object obj) {
        List list;
        switch (this.a) {
            case 1:
                jo70 jo70Var = ((uv00) obj).a(jo70.class, this.b).b;
                boolean z = false;
                if (jo70Var != null && (list = jo70Var.d) != null) {
                    List<ho70> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (ho70 ho70Var : list2) {
                            Set set = s4b1.f;
                            s4b1 s4b1VarX = uic.x(ho70Var.b);
                            if (s4b1VarX.c == blc0.ee && u890.j(s4b1VarX.s(), this.c)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                CollectionDecorateResponse collectionDecorateResponse = (CollectionDecorateResponse) obj;
                if (collectionDecorateResponse.s() > 0) {
                    return (CollectionTrack) o7h.q0(collectionDecorateResponse.t());
                }
                String str = this.b;
                String str2 = this.c;
                int iO = collectionDecorateResponse.r().o();
                String strQ = collectionDecorateResponse.r().q();
                StringBuilder sbN = gvg.n("Couldn't load metadata for track ", str, " contextUri: ", str2, " code: ");
                sbN.append(iO);
                sbN.append(" reason: ");
                sbN.append(strQ);
                n57.e(sbN.toString());
                return CollectionTrack.q();
        }
    }

    public void b(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null key");
        }
    }

    public void c(String str) {
        if (str != null) {
            this.c = str;
        } else {
            bhn0.i("Null value");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.oo80 */
    public lo80 toInstant() throws oo80 {
        throw new oo80(this.b + " when parsing an Instant from \"" + hm5.Q(64, this.c) + '\"');
    }

    public az8() {
        this.a = (byte) 0;
    }
}
