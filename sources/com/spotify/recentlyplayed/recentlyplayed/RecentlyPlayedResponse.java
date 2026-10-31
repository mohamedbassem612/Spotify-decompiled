package com.spotify.recentlyplayed.recentlyplayed;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import java.util.List;
import kotlin.Metadata;
import p.dm5;
import p.h661;
import p.ijz0;
import p.lp01;
import p.mp01;
import p.nma0;
import p.o661;
import p.o6p1;
import p.p661;
import p.u890;
import p.xcg1;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB;\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J4\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u001a\u0010,\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010#R \u00104\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00100\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010!R \u00108\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010.\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010\u0019R \u0010;\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010.\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010\u0019¨\u0006A"}, d2 = {"Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedResponse;", "Landroid/os/Parcelable;", "", "length", "", "loaded", "", "Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedEntity;", "items", "<init>", "(IZLjava/util/List;)V", "seen0", "Lp/p661;", "serializationConstructorMarker", "(IIZLjava/util/List;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "(Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedResponse;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "destination", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Z", "component3", "()Ljava/util/List;", "copy", "(IZLjava/util/List;)Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getLength", "Z", "getLoaded", "Ljava/util/List;", "getItems", "responseIsLoading", "getResponseIsLoading", "getResponseIsLoading$annotations", "()V", "responseUnfilteredLength", "getResponseUnfilteredLength", "getResponseUnfilteredLength$annotations", "responseUnrangedLength", "getResponseUnrangedLength", "getResponseUnrangedLength$annotations", "CREATOR", "p/mp01", "p/lp01", "src_main_java_com_spotify_recentlyplayed_recentlyplayed-recentlyplayed"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
@o661
public final /* data */ class RecentlyPlayedResponse implements Parcelable {
    private final List<RecentlyPlayedEntity> items;
    private final int length;
    private final boolean loaded;
    private final boolean responseIsLoading;
    private final int responseUnfilteredLength;
    private final int responseUnrangedLength;
    public static final mp01 CREATOR = new mp01();
    private static final znb0[] $childSerializers = {null, null, dm5.S(2, ijz0.Q0)};

    public /* synthetic */ RecentlyPlayedResponse(int i, int i2, boolean z, List list, p661 p661Var) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, lp01.a.getDescriptor());
            throw null;
        }
        this.length = i2;
        this.loaded = z;
        this.items = list;
        this.responseIsLoading = !z;
        this.responseUnfilteredLength = i2;
        this.responseUnrangedLength = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentlyPlayedResponse copy$default(RecentlyPlayedResponse recentlyPlayedResponse, int i, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recentlyPlayedResponse.length;
        }
        if ((i2 & 2) != 0) {
            z = recentlyPlayedResponse.loaded;
        }
        if ((i2 & 4) != 0) {
            list = recentlyPlayedResponse.items;
        }
        return recentlyPlayedResponse.copy(i, z, list);
    }

    public static /* synthetic */ void getResponseIsLoading$annotations() {
    }

    public static /* synthetic */ void getResponseUnfilteredLength$annotations() {
    }

    public static /* synthetic */ void getResponseUnrangedLength$annotations() {
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed(RecentlyPlayedResponse self, z1k output, h661 serialDesc) {
        znb0[] znb0VarArr = $childSerializers;
        output.e(0, self.length, serialDesc);
        output.E(serialDesc, 1, self.loaded);
        output.k(serialDesc, 2, (nma0) znb0VarArr[2].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getLoaded() {
        return this.loaded;
    }

    public final List<RecentlyPlayedEntity> component3() {
        return this.items;
    }

    public final RecentlyPlayedResponse copy(int length, boolean loaded, List<RecentlyPlayedEntity> items) {
        return new RecentlyPlayedResponse(length, loaded, items);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentlyPlayedResponse)) {
            return false;
        }
        RecentlyPlayedResponse recentlyPlayedResponse = (RecentlyPlayedResponse) other;
        return this.length == recentlyPlayedResponse.length && this.loaded == recentlyPlayedResponse.loaded && u890.j(this.items, recentlyPlayedResponse.items);
    }

    public final List<RecentlyPlayedEntity> getItems() {
        return this.items;
    }

    public final int getLength() {
        return this.length;
    }

    public final boolean getLoaded() {
        return this.loaded;
    }

    public final boolean getResponseIsLoading() {
        return this.responseIsLoading;
    }

    public final int getResponseUnfilteredLength() {
        return this.responseUnfilteredLength;
    }

    public final int getResponseUnrangedLength() {
        return this.responseUnrangedLength;
    }

    public int hashCode() {
        return this.items.hashCode() + xcg1.g(Integer.hashCode(this.length) * 31, 31, this.loaded);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel destination, int flags) {
        destination.writeInt(getLength());
        destination.writeInt(getLoaded() ? 1 : 0);
        destination.writeTypedList(getItems());
    }

    public RecentlyPlayedResponse(int i, boolean z, List<RecentlyPlayedEntity> list) {
        this.length = i;
        this.loaded = z;
        this.items = list;
        this.responseIsLoading = !z;
        this.responseUnfilteredLength = i;
        this.responseUnrangedLength = i;
    }
}
