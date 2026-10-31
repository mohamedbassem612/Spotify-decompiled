package com.spotify.home.slotloading;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.ef91;
import p.ice0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"com/spotify/home/slotloading/SlotEffect$LoadSlotContent", "", "Lp/ef91;", "slotType", "Lp/ice0;", "loadingStrategy", "", "sessionId", "<init>", "(Lp/ef91;Lp/ice0;Ljava/lang/String;)V", "component1", "()Lp/ef91;", "component2", "()Lp/ice0;", "component3", "()Ljava/lang/String;", "Lcom/spotify/home/slotloading/SlotEffect$LoadSlotContent;", "copy", "(Lp/ef91;Lp/ice0;Ljava/lang/String;)Lcom/spotify/home/slotloading/SlotEffect$LoadSlotContent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/ef91;", "getSlotType", "Lp/ice0;", "getLoadingStrategy", "Ljava/lang/String;", "getSessionId", "src_main_java_com_spotify_home_slotloading-slotloading"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SlotEffect$LoadSlotContent {
    private final ice0 loadingStrategy;
    private final String sessionId;
    private final ef91 slotType;

    public SlotEffect$LoadSlotContent(ef91 ef91Var, ice0 ice0Var, String str) {
        this.slotType = ef91Var;
        this.loadingStrategy = ice0Var;
        this.sessionId = str;
    }

    public static /* synthetic */ SlotEffect$LoadSlotContent copy$default(SlotEffect$LoadSlotContent slotEffect$LoadSlotContent, ef91 ef91Var, ice0 ice0Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ef91Var = slotEffect$LoadSlotContent.slotType;
        }
        if ((i & 2) != 0) {
            ice0Var = slotEffect$LoadSlotContent.loadingStrategy;
        }
        if ((i & 4) != 0) {
            str = slotEffect$LoadSlotContent.sessionId;
        }
        return slotEffect$LoadSlotContent.copy(ef91Var, ice0Var, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ef91 getSlotType() {
        return this.slotType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ice0 getLoadingStrategy() {
        return this.loadingStrategy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final SlotEffect$LoadSlotContent copy(ef91 slotType, ice0 loadingStrategy, String sessionId) {
        return new SlotEffect$LoadSlotContent(slotType, loadingStrategy, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotEffect$LoadSlotContent)) {
            return false;
        }
        SlotEffect$LoadSlotContent slotEffect$LoadSlotContent = (SlotEffect$LoadSlotContent) other;
        return this.slotType == slotEffect$LoadSlotContent.slotType && this.loadingStrategy == slotEffect$LoadSlotContent.loadingStrategy && u890.j(this.sessionId, slotEffect$LoadSlotContent.sessionId);
    }

    public final ice0 getLoadingStrategy() {
        return this.loadingStrategy;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final ef91 getSlotType() {
        return this.slotType;
    }

    public int hashCode() {
        int iHashCode = (this.loadingStrategy.hashCode() + (this.slotType.hashCode() * 31)) * 31;
        String str = this.sessionId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SlotEffect$LoadSlotContent(ef91 ef91Var, ice0 ice0Var, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ef91Var, ice0Var, (i & 4) != 0 ? null : str);
    }
}
