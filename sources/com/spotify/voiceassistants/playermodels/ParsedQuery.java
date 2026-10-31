package com.spotify.voiceassistants.playermodels;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.h661;
import p.nma0;
import p.o661;
import p.o6p1;
import p.p661;
import p.u890;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/ParsedQuery;", "", "", "intent", "uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/ParsedQuery;Lp/z1k;Lp/h661;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/voiceassistants/playermodels/ParsedQuery;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIntent", "getUri", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
@o661
public final /* data */ class ParsedQuery {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String intent;
    private final String uri;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/ParsedQuery$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/voiceassistants/playermodels/ParsedQuery;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nma0 serializer() {
            return ParsedQuery$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ParsedQuery(int i, String str, String str2, p661 p661Var) {
        if (2 != (i & 2)) {
            o6p1.t(i, 2, ParsedQuery$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.intent = ParsedQueryKt.INTENT_PLAY;
        } else {
            this.intent = str;
        }
        this.uri = str2;
    }

    public static /* synthetic */ ParsedQuery copy$default(ParsedQuery parsedQuery, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parsedQuery.intent;
        }
        if ((i & 2) != 0) {
            str2 = parsedQuery.uri;
        }
        return parsedQuery.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels(ParsedQuery self, z1k output, h661 serialDesc) {
        if (output.d0() || !u890.j(self.intent, ParsedQueryKt.INTENT_PLAY)) {
            output.G(serialDesc, 0, self.intent);
        }
        output.G(serialDesc, 1, self.uri);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIntent() {
        return this.intent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final ParsedQuery copy(String intent, String uri) {
        return new ParsedQuery(intent, uri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedQuery)) {
            return false;
        }
        ParsedQuery parsedQuery = (ParsedQuery) other;
        return u890.j(this.intent, parsedQuery.intent) && u890.j(this.uri, parsedQuery.uri);
    }

    public final String getIntent() {
        return this.intent;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode() + (this.intent.hashCode() * 31);
    }

    public String toString() {
        return super.toString();
    }

    public ParsedQuery(String str, String str2) {
        this.intent = str;
        this.uri = str2;
    }

    public /* synthetic */ ParsedQuery(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ParsedQueryKt.INTENT_PLAY : str, str2);
    }
}
