package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.f4i1;
import p.ihc1;
import p.nhc1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/CappingKey;", "", "persistedValue", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getPersistedValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class CappingKey {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String persistedValue;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/CappingKey$Companion;", "", "<init>", "()V", "local", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/CappingKey;", "clientMessageId", "", "local-xlX4SSM", "(Ljava/lang/String;)Ljava/lang/String;", "remote", "messageId", "", "remote-xlX4SSM", "(J)Ljava/lang/String;", "fromPersistedValue", "value", "fromPersistedValue-xZxBVag", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: fromPersistedValue-xZxBVag, reason: not valid java name */
        public final String m208fromPersistedValuexZxBVag(String value) {
            if (nhc1.Y(value, "local:", false) && !ihc1.y0(ihc1.H0(value, "local:"))) {
                return CappingKey.m202constructorimpl(value);
            }
            if (!nhc1.Y(value, "remote:", false) || nhc1.d0(10, ihc1.H0(value, "remote:")) == null) {
                return null;
            }
            return CappingKey.m202constructorimpl(value);
        }

        /* JADX INFO: renamed from: local-xlX4SSM, reason: not valid java name */
        public final String m209localxlX4SSM(String clientMessageId) {
            return CappingKey.m202constructorimpl("local:".concat(clientMessageId));
        }

        /* JADX INFO: renamed from: remote-xlX4SSM, reason: not valid java name */
        public final String m210remotexlX4SSM(long messageId) {
            return CappingKey.m202constructorimpl("remote:" + messageId);
        }

        private Companion() {
        }
    }

    private /* synthetic */ CappingKey(String str) {
        this.persistedValue = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CappingKey m201boximpl(String str) {
        return new CappingKey(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m202constructorimpl(String str) {
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m203equalsimpl(String str, Object obj) {
        return (obj instanceof CappingKey) && u890.j(str, ((CappingKey) obj).m207unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m204equalsimpl0(String str, String str2) {
        return u890.j(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m205hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m206toStringimpl(String str) {
        return f4i1.f("CappingKey(persistedValue=", str, ")");
    }

    public boolean equals(Object obj) {
        return m203equalsimpl(this.persistedValue, obj);
    }

    public final String getPersistedValue() {
        return this.persistedValue;
    }

    public int hashCode() {
        return m205hashCodeimpl(this.persistedValue);
    }

    public String toString() {
        return m206toStringimpl(this.persistedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m207unboximpl() {
        return this.persistedValue;
    }
}
