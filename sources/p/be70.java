package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class be70 implements y570 {
    public final y570 a;
    public final /* synthetic */ ce70 b;

    public be70(ce70 ce70Var, y570 y570Var) {
        this.b = ce70Var;
        this.a = y570Var;
    }

    public final String a() {
        return this.a.a();
    }

    public final HubsImmutableComponentBundle b() {
        return this.a.b();
    }

    public final HubsImmutableComponentBundle g() {
        return this.a.g();
    }

    public final String group() {
        return this.a.group();
    }

    public final w570 h() {
        return this.a.h();
    }

    public final Map j() {
        return this.a.j();
    }

    public final x570 k() {
        return this.a.k();
    }

    public final ArrayList l() {
        List listS = s();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (u890.j(((y570) obj).group(), "primary_buttons")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final j670 n() {
        return this.a.n();
    }

    public final HubsImmutableComponentBundle r() {
        return this.a.r();
    }

    public final List s() {
        bg11 bg11VarS = this.a.s();
        bg11 bg11Var = Collections.EMPTY_LIST;
        if (bg11VarS == bg11Var) {
            return bg11Var;
        }
        w280 w280Var = b380.b;
        bg11 bg11Var2 = bg11.e;
        return bg11VarS == bg11Var2 ? bg11Var2 : new ae70(this.b, bg11VarS);
    }

    public final me70 t() {
        return this.a.t();
    }

    public final fd70 toBuilder() {
        gd70 gd70Var = gd70.c;
        return cyo1.p(this).a;
    }
}
