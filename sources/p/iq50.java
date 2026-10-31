package p;

import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iq50 extends ProxySelector {
    public static final List c = Collections.singletonList(Proxy.NO_PROXY);
    public final ProxySelector a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public iq50(ProxySelector proxySelector) {
        this.a = proxySelector;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        try {
            ProxySelector proxySelector = this.a;
            if (proxySelector != null) {
                proxySelector.connectFailed(uri, socketAddress, iOException);
            }
        } catch (Exception e) {
            Logger.l(e, "Failed to report proxy connection failure", new Object[0]);
        }
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        List list = c;
        try {
            ProxySelector proxySelector = this.a;
            List<Proxy> listSelect = proxySelector != null ? proxySelector.select(uri) : null;
            if (listSelect == null) {
                listSelect = z6x.a;
            }
            List<Proxy> list2 = listSelect;
            if (list2.isEmpty()) {
                list2 = list;
            }
            return (List) list2;
        } catch (Exception e) {
            if (this.b.compareAndSet(false, true)) {
                n57.t("Proxy selection failed for host " + (uri != null ? uri.getHost() : null), e);
            }
            return list;
        }
    }
}
