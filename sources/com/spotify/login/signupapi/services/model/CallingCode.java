package com.spotify.login.signupapi.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.h661;
import p.nma0;
import p.o661;
import p.o6p1;
import p.p661;
import p.u890;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ$\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/spotify/login/signupapi/services/model/CallingCode;", "Landroid/os/Parcelable;", "", "countryCode", "callingCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_login_signupapi_signupapi", "(Lcom/spotify/login/signupapi/services/model/CallingCode;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/login/signupapi/services/model/CallingCode;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountryCode", "getCountryCode$annotations", "()V", "getCallingCode", "getCallingCode$annotations", "Companion", "$serializer", "src_main_java_com_spotify_login_signupapi-signupapi"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
@o661
public final /* data */ class CallingCode implements Parcelable {
    private final String callingCode;
    private final String countryCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CallingCode> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/login/signupapi/services/model/CallingCode$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/login/signupapi/services/model/CallingCode;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_login_signupapi-signupapi"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nma0 serializer() {
            return CallingCode$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<CallingCode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallingCode createFromParcel(Parcel parcel) {
            return new CallingCode(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallingCode[] newArray(int i) {
            return new CallingCode[i];
        }
    }

    public /* synthetic */ CallingCode(int i, String str, String str2, p661 p661Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, CallingCode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.countryCode = str;
        this.callingCode = str2;
    }

    public static /* synthetic */ CallingCode copy$default(CallingCode callingCode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callingCode.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = callingCode.callingCode;
        }
        return callingCode.copy(str, str2);
    }

    public static /* synthetic */ void getCallingCode$annotations() {
    }

    public static /* synthetic */ void getCountryCode$annotations() {
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_login_signupapi_signupapi(CallingCode self, z1k output, h661 serialDesc) {
        output.G(serialDesc, 0, self.countryCode);
        output.G(serialDesc, 1, self.callingCode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCallingCode() {
        return this.callingCode;
    }

    public final CallingCode copy(String countryCode, String callingCode) {
        return new CallingCode(countryCode, callingCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallingCode)) {
            return false;
        }
        CallingCode callingCode = (CallingCode) other;
        return u890.j(this.countryCode, callingCode.countryCode) && u890.j(this.callingCode, callingCode.callingCode);
    }

    public final String getCallingCode() {
        return this.callingCode;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public int hashCode() {
        return this.callingCode.hashCode() + (this.countryCode.hashCode() * 31);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.countryCode);
        dest.writeString(this.callingCode);
    }

    public CallingCode(String str, String str2) {
        this.countryCode = str;
        this.callingCode = str2;
    }
}
