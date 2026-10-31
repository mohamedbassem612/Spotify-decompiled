package com.spotify.home.evopage.mobius;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.cy30;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/spotify/home/evopage/mobius/Event$FailedToLoadMoreHomeStructure;", "Lcom/spotify/home/evopage/mobius/Event;", "error", "", "filterValue", "", "isConnected", "", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;Z)V", "getError", "()Ljava/lang/Throwable;", "getFilterValue", "()Ljava/lang/String;", "()Z", "breadcrumb", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Event$FailedToLoadMoreHomeStructure implements Event {
    private final Throwable error;
    private final String filterValue;
    private final boolean isConnected;

    public Event$FailedToLoadMoreHomeStructure(Throwable th, String str, boolean z) {
        this.error = th;
        this.filterValue = str;
        this.isConnected = z;
    }

    public static /* synthetic */ Event$FailedToLoadMoreHomeStructure copy$default(Event$FailedToLoadMoreHomeStructure event$FailedToLoadMoreHomeStructure, Throwable th, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            th = event$FailedToLoadMoreHomeStructure.error;
        }
        if ((i & 2) != 0) {
            str = event$FailedToLoadMoreHomeStructure.filterValue;
        }
        if ((i & 4) != 0) {
            z = event$FailedToLoadMoreHomeStructure.isConnected;
        }
        return event$FailedToLoadMoreHomeStructure.copy(th, str, z);
    }

    public String breadcrumb() {
        return "FailedToLoadMoreHomeStructure: " + this.error + " filterValue: " + this.filterValue + " isConnected: " + this.isConnected;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilterValue() {
        return this.filterValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public final Event$FailedToLoadMoreHomeStructure copy(Throwable error, String filterValue, boolean isConnected) {
        return new Event$FailedToLoadMoreHomeStructure(error, filterValue, isConnected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event$FailedToLoadMoreHomeStructure)) {
            return false;
        }
        Event$FailedToLoadMoreHomeStructure event$FailedToLoadMoreHomeStructure = (Event$FailedToLoadMoreHomeStructure) other;
        return u890.j(this.error, event$FailedToLoadMoreHomeStructure.error) && u890.j(this.filterValue, event$FailedToLoadMoreHomeStructure.filterValue) && this.isConnected == event$FailedToLoadMoreHomeStructure.isConnected;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final String getFilterValue() {
        return this.filterValue;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isConnected) + cy30.d(this.error.hashCode() * 31, 31, this.filterValue);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ Event$FailedToLoadMoreHomeStructure(Throwable th, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, str, (i & 4) != 0 ? false : z);
    }
}
