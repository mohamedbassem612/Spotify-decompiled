package org.chromium.net;

import java.util.Comparator;
import p.e8o;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e8o e8oVar = (e8o) obj;
        e8o e8oVar2 = (e8o) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(e8oVar.a.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(e8oVar2.a.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(e8oVar.a.getVersion(), e8oVar2.a.getVersion());
    }
}
