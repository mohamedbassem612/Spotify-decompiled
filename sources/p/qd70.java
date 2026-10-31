package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qd70 extends jyo1 {
    public final String c;
    public final String d;
    public final gd70 e;
    public final b380 f;
    public final b380 g;
    public final String h;
    public final HubsImmutableComponentBundle i;
    public final /* synthetic */ rd70 j;

    public qd70(rd70 rd70Var, String str, String str2, gd70 gd70Var, b380 b380Var, b380 b380Var2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.j = rd70Var;
        this.c = str;
        this.d = str2;
        this.e = gd70Var;
        this.f = b380Var;
        this.g = b380Var2;
        this.h = str3;
        this.i = hubsImmutableComponentBundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd70)) {
            return false;
        }
        qd70 qd70Var = (qd70) obj;
        return u890.j(this.c, qd70Var.c) && u890.j(this.d, qd70Var.d) && u890.j(this.e, qd70Var.e) && this.f.equals(qd70Var.f) && this.g.equals(qd70Var.g) && u890.j(this.h, qd70Var.h) && this.i.equals(qd70Var.i);
    }

    public final rd70 f() {
        return this.j;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final jyo1 j(y570 y570Var) {
        boolean zJ;
        gd70 gd70Var = this.e;
        if (gd70Var == y570Var) {
            zJ = true;
        } else {
            if (gd70Var == null) {
                gd70Var = gd70.c;
            }
            zJ = u890.j(gd70Var, y570Var == null ? gd70.c : y570Var);
        }
        if (zJ) {
            return this;
        }
        pd70 pd70Var = new pd70(this);
        pd70Var.j(y570Var);
        return pd70Var;
    }

    public final jyo1 o(ArrayList arrayList) {
        if (zxo1.A(this.f, arrayList)) {
            return this;
        }
        pd70 pd70Var = new pd70(this);
        pd70Var.f.b(arrayList.isEmpty() ? null : zxo1.q(arrayList));
        return pd70Var;
    }

    public final jyo1 p(y570... y570VarArr) {
        Iterable iterableQ = null;
        if (y570VarArr.length != 0) {
            pd70 pd70Var = new pd70(this);
            List listAsList = Arrays.asList(y570VarArr);
            pd70Var.g.b(listAsList.isEmpty() ? null : zxo1.q(listAsList));
            return pd70Var;
        }
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        if (zxo1.A(this.g, bg11Var)) {
            return this;
        }
        pd70 pd70Var2 = new pd70(this);
        if (bg11Var != null && !bg11Var.isEmpty()) {
            iterableQ = zxo1.q(bg11Var);
        }
        pd70Var2.g.b(iterableQ);
        return pd70Var2;
    }
}
