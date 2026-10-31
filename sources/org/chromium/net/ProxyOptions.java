package org.chromium.net;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ProxyOptions {
    private final List<Proxy> mProxyList;

    public @interface Experimental {
    }

    public ProxyOptions(List<Proxy> list) {
        Objects.requireNonNull(list);
        if (list.isEmpty()) {
            hhg1.n("ProxyList cannot be empty");
            throw null;
        }
        this.mProxyList = new ArrayList(list);
    }

    public List<Proxy> getProxyList() {
        return Collections.unmodifiableList(this.mProxyList);
    }
}
