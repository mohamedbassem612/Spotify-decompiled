package com.spotify.voiceassistants.playermodels;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.cy30;
import p.h661;
import p.o661;
import p.o6p1;
import p.p661;
import p.u890;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Lcom/spotify/voiceassistants/playermodels/CommandPlayRequest;", "", "", "action", "deviceTypes", "", "voiceEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/CommandPlayRequest;Lp/z1k;Lp/h661;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/spotify/voiceassistants/playermodels/CommandPlayRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "getDeviceTypes", "getDeviceTypes$annotations", "()V", "Z", "getVoiceEnabled", "getVoiceEnabled$annotations", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public final /* data */ class CommandPlayRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String action;
    private final String deviceTypes;
    private final boolean voiceEnabled;

    public /* synthetic */ CommandPlayRequest(int i, String str, String str2, boolean z, p661 p661Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, CommandPlayRequest$.serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.action = str;
        this.deviceTypes = str2;
        if ((i & 4) == 0) {
            this.voiceEnabled = true;
        } else {
            this.voiceEnabled = z;
        }
    }

    public static /* synthetic */ CommandPlayRequest copy$default(CommandPlayRequest commandPlayRequest, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commandPlayRequest.action;
        }
        if ((i & 2) != 0) {
            str2 = commandPlayRequest.deviceTypes;
        }
        if ((i & 4) != 0) {
            z = commandPlayRequest.voiceEnabled;
        }
        return commandPlayRequest.copy(str, str2, z);
    }

    public static /* synthetic */ void getDeviceTypes$annotations() {
    }

    public static /* synthetic */ void getVoiceEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels(CommandPlayRequest self, z1k output, h661 serialDesc) {
        output.G(serialDesc, 0, self.action);
        output.G(serialDesc, 1, self.deviceTypes);
        if (!output.d0() && self.voiceEnabled) {
            return;
        }
        output.E(serialDesc, 2, self.voiceEnabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceTypes() {
        return this.deviceTypes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getVoiceEnabled() {
        return this.voiceEnabled;
    }

    public final CommandPlayRequest copy(String action, String deviceTypes, boolean voiceEnabled) {
        return new CommandPlayRequest(action, deviceTypes, voiceEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommandPlayRequest)) {
            return false;
        }
        CommandPlayRequest commandPlayRequest = (CommandPlayRequest) other;
        return u890.j(this.action, commandPlayRequest.action) && u890.j(this.deviceTypes, commandPlayRequest.deviceTypes) && this.voiceEnabled == commandPlayRequest.voiceEnabled;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDeviceTypes() {
        return this.deviceTypes;
    }

    public final boolean getVoiceEnabled() {
        return this.voiceEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.voiceEnabled) + cy30.d(this.action.hashCode() * 31, 31, this.deviceTypes);
    }

    public String toString() {
        return super.toString();
    }

    public CommandPlayRequest(String str, String str2, boolean z) {
        this.action = str;
        this.deviceTypes = str2;
        this.voiceEnabled = z;
    }

    public /* synthetic */ CommandPlayRequest(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z);
    }
}
