package com.spotify.home.evopage.mobius;

import kotlin.Metadata;
import p.ice0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/spotify/home/evopage/mobius/Event$ForceReloadChecked;", "Lcom/spotify/home/evopage/mobius/Event;", "", "shouldReload", "Lp/ice0;", "loadingStrategy", "<init>", "(ZLp/ice0;)V", "component1", "()Z", "component2", "()Lp/ice0;", "copy", "(ZLp/ice0;)Lcom/spotify/home/evopage/mobius/Event$ForceReloadChecked;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldReload", "Lp/ice0;", "getLoadingStrategy", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Event$ForceReloadChecked implements Event {
    private final ice0 loadingStrategy;
    private final boolean shouldReload;

    public Event$ForceReloadChecked(boolean z, ice0 ice0Var) {
        this.shouldReload = z;
        this.loadingStrategy = ice0Var;
    }

    public static /* synthetic */ Event$ForceReloadChecked copy$default(Event$ForceReloadChecked event$ForceReloadChecked, boolean z, ice0 ice0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = event$ForceReloadChecked.shouldReload;
        }
        if ((i & 2) != 0) {
            ice0Var = event$ForceReloadChecked.loadingStrategy;
        }
        return event$ForceReloadChecked.copy(z, ice0Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShouldReload() {
        return this.shouldReload;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ice0 getLoadingStrategy() {
        return this.loadingStrategy;
    }

    public final Event$ForceReloadChecked copy(boolean shouldReload, ice0 loadingStrategy) {
        return new Event$ForceReloadChecked(shouldReload, loadingStrategy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event$ForceReloadChecked)) {
            return false;
        }
        Event$ForceReloadChecked event$ForceReloadChecked = (Event$ForceReloadChecked) other;
        return this.shouldReload == event$ForceReloadChecked.shouldReload && this.loadingStrategy == event$ForceReloadChecked.loadingStrategy;
    }

    public final ice0 getLoadingStrategy() {
        return this.loadingStrategy;
    }

    public final boolean getShouldReload() {
        return this.shouldReload;
    }

    public int hashCode() {
        return this.loadingStrategy.hashCode() + (Boolean.hashCode(this.shouldReload) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
