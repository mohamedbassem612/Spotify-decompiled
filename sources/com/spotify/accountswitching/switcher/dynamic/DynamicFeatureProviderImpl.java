package com.spotify.accountswitching.switcher.dynamic;

import kotlin.Metadata;
import p.jq;
import p.nq;
import p.oq;
import p.or;
import p.sq;
import p.uq;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/spotify/accountswitching/switcher/dynamic/DynamicFeatureProviderImpl;", "Lp/uq;", "Lp/sq;", "accountSwitcherDependencies", "<init>", "(Lp/sq;)V", "Lp/oq;", "accountSwitcherCredentialManager", "()Lp/oq;", "Lp/jq;", "accountSwitcher", "()Lp/jq;", "Lp/nq;", "accountSwitcherComponent", "Lp/nq;", "src_main_java_com_spotify_accountswitching_switcher_dynamic-dynamic"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DynamicFeatureProviderImpl implements uq {
    private final nq accountSwitcherComponent;

    public DynamicFeatureProviderImpl(sq sqVar) {
        this.accountSwitcherComponent = new or(sqVar);
    }

    public jq accountSwitcher() {
        return ((or) this.accountSwitcherComponent).a();
    }

    public oq accountSwitcherCredentialManager() {
        return ((or) this.accountSwitcherComponent).b();
    }
}
