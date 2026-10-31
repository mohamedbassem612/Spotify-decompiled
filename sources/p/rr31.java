package p;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rr31 {
    public final v02 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public rr31(v02 v02Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.a = v02Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rr31)) {
            return false;
        }
        rr31 rr31Var = (rr31) obj;
        return rr31Var.a.equals(this.a) && rr31Var.b.equals(this.b) && u890.j(rr31Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        l370 l370Var = this.a.h;
        String str = l370Var.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        String strB = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : u4n1.b(hostAddress);
        if (ihc1.i0(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (l370Var.e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb.append(":");
            sb.append(l370Var.e);
        }
        if (!str.equals(strB)) {
            if (this.b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strB == null) {
                sb.append("<unresolved>");
            } else if (ihc1.i0(strB, ':')) {
                sb.append("[");
                sb.append(strB);
                sb.append("]");
            } else {
                sb.append(strB);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
