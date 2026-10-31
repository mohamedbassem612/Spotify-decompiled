package p;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v02 {
    public final f331 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final lbe e;
    public final fkj0 f;
    public final ProxySelector g;
    public final l370 h;
    public final List i;
    public final List j;

    public v02(String str, int i, f331 f331Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, lbe lbeVar, fkj0 fkj0Var, List list, List list2, ProxySelector proxySelector) {
        this.a = f331Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = lbeVar;
        this.f = fkj0Var;
        this.g = proxySelector;
        k370 k370Var = new k370();
        k370Var.i(sSLSocketFactory != null ? m3i1.b : "http");
        k370Var.e(str);
        k370Var.g(i);
        this.h = k370Var.b();
        this.i = z4n1.j(list);
        this.j = z4n1.j(list2);
    }

    public final boolean a(v02 v02Var) {
        return this.a.equals(v02Var.a) && this.f.equals(v02Var.f) && this.i.equals(v02Var.i) && this.j.equals(v02Var.j) && u890.j(this.g, v02Var.g) && u890.j(this.c, v02Var.c) && u890.j(this.d, v02Var.d) && u890.j(this.e, v02Var.e) && this.h.e == v02Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v02)) {
            return false;
        }
        v02 v02Var = (v02) obj;
        return this.h.equals(v02Var.h) && a(v02Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + f4i1.b(f4i1.b((this.f.hashCode() + ((this.a.hashCode() + cy30.d(527, 31, this.h.i)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        l370 l370Var = this.h;
        sb.append(l370Var.d);
        sb.append(':');
        sb.append(l370Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
