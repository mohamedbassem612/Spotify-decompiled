package com.spotify.recentlyplayed.recentlyplayed;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b7x;
import p.chc1;
import p.cy30;
import p.dm5;
import p.gpb;
import p.h661;
import p.ijz0;
import p.kaa0;
import p.nma0;
import p.o661;
import p.o6p1;
import p.p661;
import p.ro01;
import p.rwo1;
import p.so01;
import p.to01;
import p.two1;
import p.u890;
import p.xcg1;
import p.xo01;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u008f\u00012\u00020\u0001:\f\u0090\u0001\u0083\u0001\u0091\u0001\u0089\u0001\u0092\u0001\u0093\u0001Bó\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!B\u0097\u0002\b\u0010\u0012\u0006\u0010\"\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010/J\u0010\u00103\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b2\u0010/J\u0010\u00105\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b4\u0010/J\u0010\u00107\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b6\u0010/J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010/J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010/J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010/J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u0010/J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010/J\u0010\u0010=\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b?\u0010>J\u0010\u0010A\u001a\u00020\u000eHÀ\u0003¢\u0006\u0004\b@\u0010>J\u0010\u0010B\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bB\u0010>J\u0010\u0010C\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bC\u0010>J\u0010\u0010D\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bD\u0010>J\u0010\u0010E\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bE\u0010-J\u0010\u0010F\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bF\u0010-J\u0010\u0010H\u001a\u00020\u0015HÀ\u0003¢\u0006\u0004\bG\u0010-J\u0010\u0010I\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bI\u0010/J\u001e\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aHÀ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010/J\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u0010/J\u0012\u0010Q\u001a\u0004\u0018\u00010\u000eHÀ\u0003¢\u0006\u0004\bO\u0010PJ\u0010\u0010R\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bR\u0010>J¨\u0002\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00022\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bU\u0010/J\u0010\u0010V\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\bV\u0010-J\u001a\u0010Y\u001a\u00020\u000e2\b\u0010X\u001a\u0004\u0018\u00010WHÖ\u0003¢\u0006\u0004\bY\u0010ZJ'\u0010b\u001a\u00020)2\u0006\u0010[\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0001¢\u0006\u0004\b`\u0010aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010c\u001a\u0004\bd\u0010/R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010c\u001a\u0004\be\u0010/R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010c\u001a\u0004\bf\u0010/R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010c\u001a\u0004\bg\u0010/R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010c\u001a\u0004\bh\u0010/R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010c\u001a\u0004\bi\u0010/R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010c\u001a\u0004\bj\u0010/R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010c\u001a\u0004\bk\u0010/R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010c\u001a\u0004\bl\u0010/R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010c\u001a\u0004\bm\u0010/R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010c\u001a\u0004\bn\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010o\u001a\u0004\bp\u0010>R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010o\u001a\u0004\b\u0010\u0010>R\u001a\u0010\u0011\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010o\u001a\u0004\bq\u0010>R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010o\u001a\u0004\b\u0012\u0010>R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010o\u001a\u0004\b\u0013\u0010>R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010o\u001a\u0004\br\u0010>R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010s\u001a\u0004\bt\u0010-R\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010s\u001a\u0004\bu\u0010-R\u001a\u0010\u0018\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010s\u001a\u0004\bv\u0010-R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010c\u001a\u0004\bw\u0010/R.\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010x\u0012\u0004\bz\u0010{\u001a\u0004\by\u0010KR\"\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010c\u0012\u0004\b}\u0010{\u001a\u0004\b|\u0010/R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010c\u0012\u0004\b\u007f\u0010{\u001a\u0004\b~\u0010/R%\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u001e\u0010\u0080\u0001\u0012\u0005\b\u0082\u0001\u0010{\u001a\u0005\b\u0081\u0001\u0010PR\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010o\u001a\u0004\b\u001f\u0010>R'\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u0012\u0005\b\u0088\u0001\u0010{\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R'\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u0012\u0005\b\u008e\u0001\u0010{\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0094\u0001"}, d2 = {"Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedEntity;", "Landroid/os/Parcelable;", "", "link", "collectionLink", "name", "imageUri", "type", "offline", "ownerName", "publisher", "artistName", "subtitle", "mediaType", "", "available", "isCollaborative", "isLoading", "isOwnedBySelf", "isFollowing", "inCollection", "", "numTracks", "tracksInCollectionCount", "syncProgress", "formatListType", "", "formatListAttributes", "madeForName", "madeForUsername", "isOnDemandInFree", "isBook", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLp/p661;)V", "Landroid/os/Parcel;", "destination", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "component4", "component5$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "component5", "component6$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Z", "component13", "component14$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "component14", "component15", "component16", "component17", "component18", "component19", "component20$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "component20", "component21", "component22$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "()Ljava/util/Map;", "component22", "component23", "component24", "component25$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "()Ljava/lang/Boolean;", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedEntity;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "write$Self$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "(Lcom/spotify/recentlyplayed/recentlyplayed/RecentlyPlayedEntity;Lp/z1k;Lp/h661;)V", "write$Self", "Ljava/lang/String;", "getLink", "getCollectionLink", "getName", "getImageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getType$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getOffline$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getOwnerName", "getPublisher", "getArtistName", "getSubtitle", "getMediaType", "Z", "getAvailable", "isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getInCollection", "I", "getNumTracks", "getTracksInCollectionCount", "getSyncProgress$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getFormatListType", "Ljava/util/Map;", "getFormatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "getFormatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed$annotations", "()V", "getMadeForName", "getMadeForName$annotations", "getMadeForUsername", "getMadeForUsername$annotations", "Ljava/lang/Boolean;", "isOnDemandInFree$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed", "isOnDemandInFree$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed$annotations", "Lp/to01;", "derivedData", "Lp/to01;", "getDerivedData", "()Lp/to01;", "getDerivedData$annotations", "Lp/xo01;", "labels", "Lp/xo01;", "getLabels", "()Lp/xo01;", "getLabels$annotations", "CREATOR", "p/yo01", "p/wo01", "p/so01", "p/ro01", "src_main_java_com_spotify_recentlyplayed_recentlyplayed-recentlyplayed"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
@o661
public final /* data */ class RecentlyPlayedEntity implements Parcelable {
    private final String artistName;
    private final boolean available;
    private final String collectionLink;
    private final to01 derivedData;
    private final Map<String, String> formatListAttributes;
    private final String formatListType;
    private final String imageUri;
    private final boolean inCollection;
    private final boolean isBook;
    private final boolean isCollaborative;
    private final boolean isFollowing;
    private final boolean isLoading;
    private final Boolean isOnDemandInFree;
    private final boolean isOwnedBySelf;
    private final xo01 labels;
    private final String link;
    private final String madeForName;
    private final String madeForUsername;
    private final String mediaType;
    private final String name;
    private final int numTracks;
    private final String offline;
    private final String ownerName;
    private final String publisher;
    private final String subtitle;
    private final int syncProgress;
    private final int tracksInCollectionCount;
    private final String type;
    public static final so01 CREATOR = new so01();
    private static final znb0[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, dm5.S(2, ijz0.P0), null, null, null, null};

    public /* synthetic */ RecentlyPlayedEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, int i3, int i4, String str12, Map map, String str13, String str14, Boolean bool, boolean z7, p661 p661Var) {
        if (35651583 != (i & 35651583)) {
            o6p1.t(i, 35651583, ro01.a.getDescriptor());
            throw null;
        }
        this.link = str;
        this.collectionLink = str2;
        this.name = str3;
        this.imageUri = str4;
        this.type = str5;
        this.offline = str6;
        this.ownerName = str7;
        this.publisher = str8;
        this.artistName = str9;
        this.subtitle = str10;
        this.mediaType = str11;
        this.available = z;
        this.isCollaborative = z2;
        this.isLoading = z3;
        this.isOwnedBySelf = z4;
        this.isFollowing = z5;
        this.inCollection = z6;
        this.numTracks = i2;
        this.tracksInCollectionCount = i3;
        this.syncProgress = i4;
        this.formatListType = str12;
        if ((2097152 & i) == 0) {
            this.formatListAttributes = null;
        } else {
            this.formatListAttributes = map;
        }
        if ((4194304 & i) == 0) {
            this.madeForName = null;
        } else {
            this.madeForName = str13;
        }
        if ((8388608 & i) == 0) {
            this.madeForUsername = null;
        } else {
            this.madeForUsername = str14;
        }
        if ((i & 16777216) == 0) {
            this.isOnDemandInFree = null;
        } else {
            this.isOnDemandInFree = bool;
        }
        this.isBook = z7;
        this.derivedData = rwo1.w(this);
        this.labels = new xo01(two1.z(this), two1.y(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentlyPlayedEntity copy$default(RecentlyPlayedEntity recentlyPlayedEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, int i3, String str12, Map map, String str13, String str14, Boolean bool, boolean z7, int i4, Object obj) {
        boolean z8;
        Boolean bool2;
        String str15 = (i4 & 1) != 0 ? recentlyPlayedEntity.link : str;
        String str16 = (i4 & 2) != 0 ? recentlyPlayedEntity.collectionLink : str2;
        String str17 = (i4 & 4) != 0 ? recentlyPlayedEntity.name : str3;
        String str18 = (i4 & 8) != 0 ? recentlyPlayedEntity.imageUri : str4;
        String str19 = (i4 & 16) != 0 ? recentlyPlayedEntity.type : str5;
        String str20 = (i4 & 32) != 0 ? recentlyPlayedEntity.offline : str6;
        String str21 = (i4 & 64) != 0 ? recentlyPlayedEntity.ownerName : str7;
        String str22 = (i4 & 128) != 0 ? recentlyPlayedEntity.publisher : str8;
        String str23 = (i4 & 256) != 0 ? recentlyPlayedEntity.artistName : str9;
        String str24 = (i4 & 512) != 0 ? recentlyPlayedEntity.subtitle : str10;
        String str25 = (i4 & 1024) != 0 ? recentlyPlayedEntity.mediaType : str11;
        boolean z9 = (i4 & 2048) != 0 ? recentlyPlayedEntity.available : z;
        boolean z10 = (i4 & 4096) != 0 ? recentlyPlayedEntity.isCollaborative : z2;
        boolean z11 = (i4 & 8192) != 0 ? recentlyPlayedEntity.isLoading : z3;
        String str26 = str15;
        boolean z12 = (i4 & 16384) != 0 ? recentlyPlayedEntity.isOwnedBySelf : z4;
        boolean z13 = (i4 & 32768) != 0 ? recentlyPlayedEntity.isFollowing : z5;
        boolean z14 = (i4 & 65536) != 0 ? recentlyPlayedEntity.inCollection : z6;
        int i5 = (i4 & 131072) != 0 ? recentlyPlayedEntity.numTracks : i;
        int i6 = (i4 & 262144) != 0 ? recentlyPlayedEntity.tracksInCollectionCount : i2;
        int i7 = (i4 & 524288) != 0 ? recentlyPlayedEntity.syncProgress : i3;
        String str27 = (i4 & 1048576) != 0 ? recentlyPlayedEntity.formatListType : str12;
        Map map2 = (i4 & 2097152) != 0 ? recentlyPlayedEntity.formatListAttributes : map;
        String str28 = (i4 & 4194304) != 0 ? recentlyPlayedEntity.madeForName : str13;
        String str29 = (i4 & 8388608) != 0 ? recentlyPlayedEntity.madeForUsername : str14;
        Boolean bool3 = (i4 & 16777216) != 0 ? recentlyPlayedEntity.isOnDemandInFree : bool;
        if ((i4 & 33554432) != 0) {
            bool2 = bool3;
            z8 = recentlyPlayedEntity.isBook;
        } else {
            z8 = z7;
            bool2 = bool3;
        }
        return recentlyPlayedEntity.copy(str26, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, z9, z10, z11, z12, z13, z14, i5, i6, i7, str27, map2, str28, str29, bool2, z8);
    }

    public static /* synthetic */ void getDerivedData$annotations() {
    }

    public static /* synthetic */ void getFormatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed$annotations() {
    }

    public static /* synthetic */ void getLabels$annotations() {
    }

    public static /* synthetic */ void getMadeForName$annotations() {
    }

    public static /* synthetic */ void getMadeForUsername$annotations() {
    }

    public static /* synthetic */ void isOnDemandInFree$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed$annotations() {
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed(RecentlyPlayedEntity self, z1k output, h661 serialDesc) {
        znb0[] znb0VarArr = $childSerializers;
        output.G(serialDesc, 0, self.link);
        output.G(serialDesc, 1, self.collectionLink);
        output.G(serialDesc, 2, self.name);
        output.G(serialDesc, 3, self.imageUri);
        output.G(serialDesc, 4, self.type);
        output.G(serialDesc, 5, self.offline);
        output.G(serialDesc, 6, self.ownerName);
        output.G(serialDesc, 7, self.publisher);
        output.G(serialDesc, 8, self.artistName);
        output.G(serialDesc, 9, self.subtitle);
        output.G(serialDesc, 10, self.mediaType);
        output.E(serialDesc, 11, self.available);
        output.E(serialDesc, 12, self.isCollaborative);
        output.E(serialDesc, 13, self.isLoading);
        output.E(serialDesc, 14, self.isOwnedBySelf);
        output.E(serialDesc, 15, self.isFollowing);
        output.E(serialDesc, 16, self.inCollection);
        output.e(17, self.numTracks, serialDesc);
        output.e(18, self.tracksInCollectionCount, serialDesc);
        output.e(19, self.syncProgress, serialDesc);
        output.G(serialDesc, 20, self.formatListType);
        if (self.formatListAttributes != null) {
            output.s(serialDesc, 21, (nma0) znb0VarArr[21].getValue(), self.formatListAttributes);
        }
        String str = self.madeForName;
        if (str != null) {
            output.s(serialDesc, 22, chc1.a, str);
        }
        String str2 = self.madeForUsername;
        if (str2 != null) {
            output.s(serialDesc, 23, chc1.a, str2);
        }
        Boolean bool = self.isOnDemandInFree;
        if (bool != null) {
            output.s(serialDesc, 24, gpb.a, bool);
        }
        output.E(serialDesc, 25, self.isBook);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsCollaborative() {
        return this.isCollaborative;
    }

    /* JADX INFO: renamed from: component14$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsOwnedBySelf() {
        return this.isOwnedBySelf;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getInCollection() {
        return this.inCollection;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getNumTracks() {
        return this.numTracks;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getTracksInCollectionCount() {
        return this.tracksInCollectionCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCollectionLink() {
        return this.collectionLink;
    }

    /* JADX INFO: renamed from: component20$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final int getSyncProgress() {
        return this.syncProgress;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getFormatListType() {
        return this.formatListType;
    }

    public final Map<String, String> component22$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() {
        return this.formatListAttributes;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getMadeForName() {
        return this.madeForName;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getMadeForUsername() {
        return this.madeForUsername;
    }

    /* JADX INFO: renamed from: component25$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final Boolean getIsOnDemandInFree() {
        return this.isOnDemandInFree;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getIsBook() {
        return this.isBook;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final String getImageUri() {
        return this.imageUri;
    }

    /* JADX INFO: renamed from: component5$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, reason: from getter */
    public final String getOffline() {
        return this.offline;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPublisher() {
        return this.publisher;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getArtistName() {
        return this.artistName;
    }

    public final RecentlyPlayedEntity copy(String link, String collectionLink, String name, String imageUri, String type, String offline, String ownerName, String publisher, String artistName, String subtitle, String mediaType, boolean available, boolean isCollaborative, boolean isLoading, boolean isOwnedBySelf, boolean isFollowing, boolean inCollection, int numTracks, int tracksInCollectionCount, int syncProgress, String formatListType, Map<String, String> formatListAttributes, String madeForName, String madeForUsername, Boolean isOnDemandInFree, boolean isBook) {
        return new RecentlyPlayedEntity(link, collectionLink, name, imageUri, type, offline, ownerName, publisher, artistName, subtitle, mediaType, available, isCollaborative, isLoading, isOwnedBySelf, isFollowing, inCollection, numTracks, tracksInCollectionCount, syncProgress, formatListType, formatListAttributes, madeForName, madeForUsername, isOnDemandInFree, isBook);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentlyPlayedEntity)) {
            return false;
        }
        RecentlyPlayedEntity recentlyPlayedEntity = (RecentlyPlayedEntity) other;
        return u890.j(this.link, recentlyPlayedEntity.link) && u890.j(this.collectionLink, recentlyPlayedEntity.collectionLink) && u890.j(this.name, recentlyPlayedEntity.name) && u890.j(this.imageUri, recentlyPlayedEntity.imageUri) && u890.j(this.type, recentlyPlayedEntity.type) && u890.j(this.offline, recentlyPlayedEntity.offline) && u890.j(this.ownerName, recentlyPlayedEntity.ownerName) && u890.j(this.publisher, recentlyPlayedEntity.publisher) && u890.j(this.artistName, recentlyPlayedEntity.artistName) && u890.j(this.subtitle, recentlyPlayedEntity.subtitle) && u890.j(this.mediaType, recentlyPlayedEntity.mediaType) && this.available == recentlyPlayedEntity.available && this.isCollaborative == recentlyPlayedEntity.isCollaborative && this.isLoading == recentlyPlayedEntity.isLoading && this.isOwnedBySelf == recentlyPlayedEntity.isOwnedBySelf && this.isFollowing == recentlyPlayedEntity.isFollowing && this.inCollection == recentlyPlayedEntity.inCollection && this.numTracks == recentlyPlayedEntity.numTracks && this.tracksInCollectionCount == recentlyPlayedEntity.tracksInCollectionCount && this.syncProgress == recentlyPlayedEntity.syncProgress && u890.j(this.formatListType, recentlyPlayedEntity.formatListType) && u890.j(this.formatListAttributes, recentlyPlayedEntity.formatListAttributes) && u890.j(this.madeForName, recentlyPlayedEntity.madeForName) && u890.j(this.madeForUsername, recentlyPlayedEntity.madeForUsername) && u890.j(this.isOnDemandInFree, recentlyPlayedEntity.isOnDemandInFree) && this.isBook == recentlyPlayedEntity.isBook;
    }

    public final String getArtistName() {
        return this.artistName;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final String getCollectionLink() {
        return this.collectionLink;
    }

    public final to01 getDerivedData() {
        return this.derivedData;
    }

    public final Map<String, String> getFormatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() {
        return this.formatListAttributes;
    }

    public final String getFormatListType() {
        return this.formatListType;
    }

    public final String getImageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() {
        return this.imageUri;
    }

    public final boolean getInCollection() {
        return this.inCollection;
    }

    public final xo01 getLabels() {
        return this.labels;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getMadeForName() {
        return this.madeForName;
    }

    public final String getMadeForUsername() {
        return this.madeForUsername;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumTracks() {
        return this.numTracks;
    }

    public final String getOffline$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() {
        return this.offline;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getPublisher() {
        return this.publisher;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int getSyncProgress$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() {
        return this.syncProgress;
    }

    public final int getTracksInCollectionCount() {
        return this.tracksInCollectionCount;
    }

    public final String getType$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() {
        return this.type;
    }

    public int hashCode() {
        int iD = cy30.d(kaa0.f(this.syncProgress, kaa0.f(this.tracksInCollectionCount, kaa0.f(this.numTracks, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.link.hashCode() * 31, 31, this.collectionLink), 31, this.name), 31, this.imageUri), 31, this.type), 31, this.offline), 31, this.ownerName), 31, this.publisher), 31, this.artistName), 31, this.subtitle), 31, this.mediaType), 31, this.available), 31, this.isCollaborative), 31, this.isLoading), 31, this.isOwnedBySelf), 31, this.isFollowing), 31, this.inCollection), 31), 31), 31), 31, this.formatListType);
        Map<String, String> map = this.formatListAttributes;
        int iHashCode = (iD + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.madeForName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.madeForUsername;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isOnDemandInFree;
        return Boolean.hashCode(this.isBook) + ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final boolean isBook() {
        return this.isBook;
    }

    public final boolean isCollaborative() {
        return this.isCollaborative;
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public final boolean isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() {
        return this.isLoading;
    }

    public final Boolean isOnDemandInFree$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() {
        return this.isOnDemandInFree;
    }

    public final boolean isOwnedBySelf() {
        return this.isOwnedBySelf;
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel destination, int flags) {
        destination.writeString(getLink());
        destination.writeString(getCollectionLink());
        destination.writeString(getName());
        destination.writeString(getImageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed());
        destination.writeString(getType$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed());
        destination.writeString(getOffline$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed());
        destination.writeString(getOwnerName());
        destination.writeString(getPublisher());
        destination.writeString(getArtistName());
        destination.writeString(getSubtitle());
        destination.writeString(getMediaType());
        destination.writeString(getFormatListType());
        destination.writeInt(getAvailable() ? 1 : 0);
        destination.writeInt(isCollaborative() ? 1 : 0);
        destination.writeInt(isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() ? 1 : 0);
        destination.writeInt(isOwnedBySelf() ? 1 : 0);
        destination.writeInt(isFollowing() ? 1 : 0);
        destination.writeInt(getInCollection() ? 1 : 0);
        if (isOnDemandInFree$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() != null) {
            destination.writeInt(isOnDemandInFree$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed().booleanValue() ? 1 : 0);
        } else {
            destination.writeInt(-1);
        }
        destination.writeInt(getNumTracks());
        destination.writeInt(getTracksInCollectionCount());
        destination.writeInt(getSyncProgress$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed());
        b7x formatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = getFormatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed();
        if (formatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed == null) {
            formatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = b7x.a;
        }
        Iterator itJ = xcg1.j(destination, formatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            entry.getKey().getClass();
            entry.getValue().getClass();
            String str = (String) entry.getKey();
            str.getClass();
            destination.writeString(str);
            String str2 = (String) entry.getValue();
            str2.getClass();
            destination.writeString(str2);
        }
        destination.writeString(getMadeForName());
        destination.writeString(getMadeForUsername());
        destination.writeInt(isBook() ? 1 : 0);
    }

    public RecentlyPlayedEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, int i3, String str12, Map<String, String> map, String str13, String str14, Boolean bool, boolean z7) {
        this.link = str;
        this.collectionLink = str2;
        this.name = str3;
        this.imageUri = str4;
        this.type = str5;
        this.offline = str6;
        this.ownerName = str7;
        this.publisher = str8;
        this.artistName = str9;
        this.subtitle = str10;
        this.mediaType = str11;
        this.available = z;
        this.isCollaborative = z2;
        this.isLoading = z3;
        this.isOwnedBySelf = z4;
        this.isFollowing = z5;
        this.inCollection = z6;
        this.numTracks = i;
        this.tracksInCollectionCount = i2;
        this.syncProgress = i3;
        this.formatListType = str12;
        this.formatListAttributes = map;
        this.madeForName = str13;
        this.madeForUsername = str14;
        this.isOnDemandInFree = bool;
        this.isBook = z7;
        this.derivedData = rwo1.w(this);
        this.labels = new xo01(two1.z(this), two1.y(this));
    }

    public /* synthetic */ RecentlyPlayedEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, int i3, String str12, Map map, String str13, String str14, Boolean bool, boolean z7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, z2, z3, z4, z5, z6, i, i2, i3, str12, (i4 & 2097152) != 0 ? null : map, (i4 & 4194304) != 0 ? null : str13, (i4 & 8388608) != 0 ? null : str14, (i4 & 16777216) != 0 ? null : bool, z7);
    }
}
