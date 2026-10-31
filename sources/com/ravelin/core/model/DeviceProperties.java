package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.chc1;
import p.dar;
import p.er20;
import p.gpb;
import p.grn1;
import p.h661;
import p.hrt;
import p.i3a;
import p.m0v0;
import p.m5n1;
import p.n9v;
import p.nma0;
import p.o661;
import p.p661;
import p.pf40;
import p.u890;
import p.uax;
import p.wr80;
import p.x1k;
import p.z0o1;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:B\u0083\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dBí\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J'\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\u00020'2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0016¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0016¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b3\u00100J\u001a\u00106\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/ravelin/core/model/DeviceProperties;", "Landroid/os/Parcelable;", "", "isEmulator", "isRooted", "isDebuggerAttached", "", "installationSource", "isSupportedOsVersion", "isHookedUp", "isCodeIntegrityBreached", "nonMarketAppsAllowed", "adbEnabled", "isDeveloperOptionsEnabled", "Lcom/ravelin/core/model/BiometricProperties;", "biometricProperties", "multiUserSupport", "defaultInputMethod", "isTouchExplorationEnabled", "isKeyguardSecured", "", "fontScale", "", "screenOffTimeout", "transitionAnimationScale", "windowAnimationScale", "time12Or24", "isAdvancedProtectionModeEnabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ravelin/core/model/BiometricProperties;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ravelin/core/model/BiometricProperties;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/DeviceProperties;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class DeviceProperties implements Parcelable {
    public final Boolean N0;
    public final Boolean O0;
    public final Float P0;
    public final Integer Q0;
    public final Float R0;
    public final Float S0;
    public final String T0;
    public final Boolean U0;
    public final BiometricProperties X;
    public final Boolean Y;
    public final String Z;
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean t;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DeviceProperties> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.DeviceProperties$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    public /* synthetic */ DeviceProperties(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, BiometricProperties biometricProperties, Boolean bool10, String str2, Boolean bool11, Boolean bool12, Float f, Integer num, Float f2, Float f3, String str3, Boolean bool13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? Boolean.FALSE : bool3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? Boolean.FALSE : bool4, (i & 32) != 0 ? Boolean.FALSE : bool5, (i & 64) != 0 ? Boolean.FALSE : bool6, (i & 128) != 0 ? Boolean.FALSE : bool7, (i & 256) != 0 ? Boolean.FALSE : bool8, (i & 512) != 0 ? Boolean.FALSE : bool9, (i & 1024) != 0 ? null : biometricProperties, (i & 2048) != 0 ? Boolean.FALSE : bool10, (i & 4096) != 0 ? null : str2, (i & 8192) != 0 ? Boolean.FALSE : bool11, (i & 16384) != 0 ? Boolean.FALSE : bool12, (i & 32768) != 0 ? null : f, (i & 65536) != 0 ? null : num, (i & 131072) != 0 ? null : f2, (i & 262144) != 0 ? null : f3, (i & 524288) != 0 ? null : str3, (i & 1048576) != 0 ? Boolean.FALSE : bool13);
    }

    public static final /* synthetic */ void lpt2(DeviceProperties self, z1k output, h661 serialDesc) {
        if (output.d0() || !u890.j(self.a, Boolean.FALSE)) {
            output.s(serialDesc, 0, gpb.a, self.a);
        }
        if (output.d0() || !u890.j(self.b, Boolean.FALSE)) {
            output.s(serialDesc, 1, gpb.a, self.b);
        }
        if (output.d0() || !u890.j(self.c, Boolean.FALSE)) {
            output.s(serialDesc, 2, gpb.a, self.c);
        }
        if (output.d0() || self.d != null) {
            output.s(serialDesc, 3, chc1.a, self.d);
        }
        if (output.d0() || !u890.j(self.e, Boolean.FALSE)) {
            output.s(serialDesc, 4, gpb.a, self.e);
        }
        if (output.d0() || !u890.j(self.f, Boolean.FALSE)) {
            output.s(serialDesc, 5, gpb.a, self.f);
        }
        if (output.d0() || !u890.j(self.g, Boolean.FALSE)) {
            output.s(serialDesc, 6, gpb.a, self.g);
        }
        if (output.d0() || !u890.j(self.h, Boolean.FALSE)) {
            output.s(serialDesc, 7, gpb.a, self.h);
        }
        if (output.d0() || !u890.j(self.i, Boolean.FALSE)) {
            output.s(serialDesc, 8, gpb.a, self.i);
        }
        if (output.d0() || !u890.j(self.t, Boolean.FALSE)) {
            output.s(serialDesc, 9, gpb.a, self.t);
        }
        if (output.d0() || self.X != null) {
            output.s(serialDesc, 10, BiometricProperties.cOm9.lpt2, self.X);
        }
        if (output.d0() || !u890.j(self.Y, Boolean.FALSE)) {
            output.s(serialDesc, 11, gpb.a, self.Y);
        }
        if (output.d0() || self.Z != null) {
            output.s(serialDesc, 12, chc1.a, self.Z);
        }
        if (output.d0() || !u890.j(self.N0, Boolean.FALSE)) {
            output.s(serialDesc, 13, gpb.a, self.N0);
        }
        if (output.d0() || !u890.j(self.O0, Boolean.FALSE)) {
            output.s(serialDesc, 14, gpb.a, self.O0);
        }
        if (output.d0() || self.P0 != null) {
            output.s(serialDesc, 15, er20.a, self.P0);
        }
        if (output.d0() || self.Q0 != null) {
            output.s(serialDesc, 16, wr80.a, self.Q0);
        }
        if (output.d0() || self.R0 != null) {
            output.s(serialDesc, 17, er20.a, self.R0);
        }
        if (output.d0() || self.S0 != null) {
            output.s(serialDesc, 18, er20.a, self.S0);
        }
        if (output.d0() || self.T0 != null) {
            output.s(serialDesc, 19, chc1.a, self.T0);
        }
        if (!output.d0() && u890.j(self.U0, Boolean.FALSE)) {
            return;
        }
        output.s(serialDesc, 20, gpb.a, self.U0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceProperties)) {
            return false;
        }
        DeviceProperties deviceProperties = (DeviceProperties) other;
        return u890.j(this.a, deviceProperties.a) && u890.j(this.b, deviceProperties.b) && u890.j(this.c, deviceProperties.c) && u890.j(this.d, deviceProperties.d) && u890.j(this.e, deviceProperties.e) && u890.j(this.f, deviceProperties.f) && u890.j(this.g, deviceProperties.g) && u890.j(this.h, deviceProperties.h) && u890.j(this.i, deviceProperties.i) && u890.j(this.t, deviceProperties.t) && u890.j(this.X, deviceProperties.X) && u890.j(this.Y, deviceProperties.Y) && u890.j(this.Z, deviceProperties.Z) && u890.j(this.N0, deviceProperties.N0) && u890.j(this.O0, deviceProperties.O0) && u890.j(this.P0, deviceProperties.P0) && u890.j(this.Q0, deviceProperties.Q0) && u890.j(this.R0, deviceProperties.R0) && u890.j(this.S0, deviceProperties.S0) && u890.j(this.T0, deviceProperties.T0) && u890.j(this.U0, deviceProperties.U0);
    }

    public int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.e;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.g;
        int iHashCode7 = (iHashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.h;
        int iHashCode8 = (iHashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.i;
        int iHashCode9 = (iHashCode8 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.t;
        int iHashCode10 = (iHashCode9 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        BiometricProperties biometricProperties = this.X;
        int iHashCode11 = (iHashCode10 + (biometricProperties == null ? 0 : biometricProperties.hashCode())) * 31;
        Boolean bool10 = this.Y;
        int iHashCode12 = (iHashCode11 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str2 = this.Z;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool11 = this.N0;
        int iHashCode14 = (iHashCode13 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.O0;
        int iHashCode15 = (iHashCode14 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Float f = this.P0;
        int iHashCode16 = (iHashCode15 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.Q0;
        int iHashCode17 = (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        Float f2 = this.R0;
        int iHashCode18 = (iHashCode17 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.S0;
        int iHashCode19 = (iHashCode18 + (f3 == null ? 0 : f3.hashCode())) * 31;
        String str3 = this.T0;
        int iHashCode20 = (iHashCode19 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool13 = this.U0;
        return iHashCode20 + (bool13 != null ? bool13.hashCode() : 0);
    }

    public String toString() {
        return "DeviceProperties(isEmulator=" + this.a + ", isRooted=" + this.b + ", isDebuggerAttached=" + this.c + ", installationSource=" + this.d + ", isSupportedOsVersion=" + this.e + ", isHookedUp=" + this.f + ", isCodeIntegrityBreached=" + this.g + ", nonMarketAppsAllowed=" + this.h + ", adbEnabled=" + this.i + ", isDeveloperOptionsEnabled=" + this.t + ", biometricProperties=" + this.X + ", multiUserSupport=" + this.Y + ", defaultInputMethod=" + this.Z + ", isTouchExplorationEnabled=" + this.N0 + ", isKeyguardSecured=" + this.O0 + ", fontScale=" + this.P0 + ", screenOffTimeout=" + this.Q0 + ", transitionAnimationScale=" + this.R0 + ", windowAnimationScale=" + this.S0 + ", time12Or24=" + this.T0 + ", isAdvancedProtectionModeEnabled=" + this.U0 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Boolean bool = this.a;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool);
        }
        Boolean bool2 = this.b;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool2);
        }
        Boolean bool3 = this.c;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool3);
        }
        dest.writeString(this.d);
        Boolean bool4 = this.e;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool4);
        }
        Boolean bool5 = this.f;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool5);
        }
        Boolean bool6 = this.g;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool6);
        }
        Boolean bool7 = this.h;
        if (bool7 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool7);
        }
        Boolean bool8 = this.i;
        if (bool8 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool8);
        }
        Boolean bool9 = this.t;
        if (bool9 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool9);
        }
        BiometricProperties biometricProperties = this.X;
        if (biometricProperties == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            biometricProperties.writeToParcel(dest, flags);
        }
        Boolean bool10 = this.Y;
        if (bool10 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool10);
        }
        dest.writeString(this.Z);
        Boolean bool11 = this.N0;
        if (bool11 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool11);
        }
        Boolean bool12 = this.O0;
        if (bool12 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool12);
        }
        Float f = this.P0;
        if (f == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f.floatValue());
        }
        Integer num = this.Q0;
        if (num == null) {
            dest.writeInt(0);
        } else {
            hrt.l(dest, 1, num);
        }
        Float f2 = this.R0;
        if (f2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f2.floatValue());
        }
        Float f3 = this.S0;
        if (f3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f3.floatValue());
        }
        dest.writeString(this.T0);
        Boolean bool13 = this.U0;
        if (bool13 == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool13);
        }
    }

    public DeviceProperties(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, BiometricProperties biometricProperties, Boolean bool10, String str2, Boolean bool11, Boolean bool12, Float f, Integer num, Float f2, Float f3, String str3, Boolean bool13) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = str;
        this.e = bool4;
        this.f = bool5;
        this.g = bool6;
        this.h = bool7;
        this.i = bool8;
        this.t = bool9;
        this.X = biometricProperties;
        this.Y = bool10;
        this.Z = str2;
        this.N0 = bool11;
        this.O0 = bool12;
        this.P0 = f;
        this.Q0 = num;
        this.R0 = f2;
        this.S0 = f3;
        this.T0 = str3;
        this.U0 = bool13;
    }

    public /* synthetic */ DeviceProperties(int i, Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, BiometricProperties biometricProperties, Boolean bool10, String str2, Boolean bool11, Boolean bool12, Float f, Integer num, Float f2, Float f3, String str3, Boolean bool13, p661 p661Var) {
        this.a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.b = Boolean.FALSE;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = Boolean.FALSE;
        } else {
            this.c = bool3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = Boolean.FALSE;
        } else {
            this.e = bool4;
        }
        if ((i & 32) == 0) {
            this.f = Boolean.FALSE;
        } else {
            this.f = bool5;
        }
        if ((i & 64) == 0) {
            this.g = Boolean.FALSE;
        } else {
            this.g = bool6;
        }
        if ((i & 128) == 0) {
            this.h = Boolean.FALSE;
        } else {
            this.h = bool7;
        }
        if ((i & 256) == 0) {
            this.i = Boolean.FALSE;
        } else {
            this.i = bool8;
        }
        if ((i & 512) == 0) {
            this.t = Boolean.FALSE;
        } else {
            this.t = bool9;
        }
        if ((i & 1024) == 0) {
            this.X = null;
        } else {
            this.X = biometricProperties;
        }
        if ((i & 2048) == 0) {
            this.Y = Boolean.FALSE;
        } else {
            this.Y = bool10;
        }
        if ((i & 4096) == 0) {
            this.Z = null;
        } else {
            this.Z = str2;
        }
        this.N0 = (i & 8192) == 0 ? Boolean.FALSE : bool11;
        this.O0 = (i & 16384) == 0 ? Boolean.FALSE : bool12;
        if ((32768 & i) == 0) {
            this.P0 = null;
        } else {
            this.P0 = f;
        }
        if ((65536 & i) == 0) {
            this.Q0 = null;
        } else {
            this.Q0 = num;
        }
        if ((131072 & i) == 0) {
            this.R0 = null;
        } else {
            this.R0 = f2;
        }
        if ((262144 & i) == 0) {
            this.S0 = null;
        } else {
            this.S0 = f3;
        }
        if ((524288 & i) == 0) {
            this.T0 = null;
        } else {
            this.T0 = str3;
        }
        this.U0 = (i & 1048576) == 0 ? Boolean.FALSE : bool13;
    }

    public static final class CoM6 implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final DeviceProperties createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean bool;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            Boolean boolValueOf9;
            Parcel parcel2;
            Object objCreateFromParcel;
            Boolean boolValueOf10;
            Boolean bool2;
            Boolean boolValueOf11;
            Boolean boolValueOf12;
            Integer num;
            Boolean boolValueOf13;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
                bool = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                bool = null;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = bool;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = bool;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = bool;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = bool;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf8 = bool;
            } else {
                boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf9 = bool;
            } else {
                boolValueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                parcel2 = parcel;
                objCreateFromParcel = bool;
            } else {
                parcel2 = parcel;
                objCreateFromParcel = BiometricProperties.CREATOR.createFromParcel(parcel2);
            }
            BiometricProperties biometricProperties = (BiometricProperties) objCreateFromParcel;
            if (parcel2.readInt() == 0) {
                boolValueOf10 = bool;
                bool2 = boolValueOf10;
            } else {
                boolValueOf10 = Boolean.valueOf(parcel2.readInt() != 0);
                bool2 = bool;
            }
            Boolean bool3 = boolValueOf6;
            Boolean bool4 = boolValueOf9;
            String string2 = parcel2.readString();
            if (parcel2.readInt() == 0) {
                boolValueOf11 = bool2;
            } else {
                boolValueOf11 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            if (parcel2.readInt() == 0) {
                boolValueOf12 = bool2;
            } else {
                boolValueOf12 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            Object objValueOf = parcel2.readInt() == 0 ? bool2 : Float.valueOf(parcel2.readFloat());
            Object objValueOf2 = parcel2.readInt() == 0 ? bool2 : Integer.valueOf(parcel2.readInt());
            Object objValueOf3 = parcel2.readInt() == 0 ? bool2 : Float.valueOf(parcel2.readFloat());
            Object objValueOf4 = parcel2.readInt() == 0 ? bool2 : Float.valueOf(parcel2.readFloat());
            Boolean bool5 = boolValueOf3;
            Boolean bool6 = boolValueOf5;
            Boolean bool7 = boolValueOf8;
            Boolean bool8 = boolValueOf10;
            Float f = objValueOf;
            String string3 = parcel2.readString();
            if (parcel2.readInt() == 0) {
                Object obj = objValueOf2;
                boolValueOf13 = bool2;
                num = obj;
            } else {
                num = objValueOf2;
                boolValueOf13 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            return new DeviceProperties(boolValueOf, boolValueOf2, bool5, string, boolValueOf4, bool6, bool3, boolValueOf7, bool7, bool4, biometricProperties, bool8, string2, boolValueOf11, boolValueOf12, f, num, objValueOf3, objValueOf4, string3, boolValueOf13);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final DeviceProperties[] newArray(int i) {
            return new DeviceProperties[i];
        }
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.DeviceProperties", com9, 21);
            m0v0Var.j("isEmulator", true);
            m0v0Var.j("isRooted", true);
            m0v0Var.j("isDebuggerAttached", true);
            m0v0Var.j("installationSource", true);
            m0v0Var.j("isSupportedOsVersion", true);
            m0v0Var.j("isHookedUp", true);
            m0v0Var.j("isCodeIntegrityBreached", true);
            m0v0Var.j("nonMarketAppsAllowed", true);
            m0v0Var.j("adbEnabled", true);
            m0v0Var.j("isDeveloperOptionsEnabled", true);
            m0v0Var.j("biometricProperties", true);
            m0v0Var.j("multiUserSupport", true);
            m0v0Var.j("defaultInputMethod", true);
            m0v0Var.j("IsTouchExplorationEnabled", true);
            m0v0Var.j("isKeyguardSecured", true);
            m0v0Var.j("fontScale", true);
            m0v0Var.j("screenOffTimeout", true);
            m0v0Var.j("transitionAnimationScale", true);
            m0v0Var.j("windowAnimationScale", true);
            m0v0Var.j("time12Or24", true);
            m0v0Var.j("isAdvancedProtectionModeEnabled", true);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            gpb gpbVar = gpb.a;
            nma0 nma0VarZ = m5n1.z(gpbVar);
            nma0 nma0VarZ2 = m5n1.z(gpbVar);
            nma0 nma0VarZ3 = m5n1.z(gpbVar);
            chc1 chc1Var = chc1.a;
            nma0 nma0VarZ4 = m5n1.z(chc1Var);
            nma0 nma0VarZ5 = m5n1.z(gpbVar);
            nma0 nma0VarZ6 = m5n1.z(gpbVar);
            nma0 nma0VarZ7 = m5n1.z(gpbVar);
            nma0 nma0VarZ8 = m5n1.z(gpbVar);
            nma0 nma0VarZ9 = m5n1.z(gpbVar);
            nma0 nma0VarZ10 = m5n1.z(gpbVar);
            nma0 nma0VarZ11 = m5n1.z(BiometricProperties.cOm9.lpt2);
            nma0 nma0VarZ12 = m5n1.z(gpbVar);
            nma0 nma0VarZ13 = m5n1.z(chc1Var);
            nma0 nma0VarZ14 = m5n1.z(gpbVar);
            nma0 nma0VarZ15 = m5n1.z(gpbVar);
            er20 er20Var = er20.a;
            return new nma0[]{nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0VarZ5, nma0VarZ6, nma0VarZ7, nma0VarZ8, nma0VarZ9, nma0VarZ10, nma0VarZ11, nma0VarZ12, nma0VarZ13, nma0VarZ14, nma0VarZ15, m5n1.z(er20Var), m5n1.z(wr80.a), m5n1.z(er20Var), m5n1.z(er20Var), m5n1.z(chc1Var), m5n1.z(gpbVar)};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final DeviceProperties deserialize(dar darVar) {
            int i;
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            x1kVarB.getClass();
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            BiometricProperties biometricProperties = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            String str2 = null;
            Float f = null;
            Integer num = null;
            Float f2 = null;
            Float f3 = null;
            boolean z = true;
            int i2 = 0;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            String str3 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                Boolean bool14 = bool3;
                switch (iP) {
                    case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                        z = false;
                        bool2 = bool2;
                        bool8 = bool8;
                        bool3 = bool14;
                        break;
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        bool11 = bool11;
                        i = 1;
                        bool10 = bool10;
                        bool9 = bool9;
                        bool8 = (Boolean) x1kVarB.B(m0v0Var, 0, gpb.a, bool8);
                        bool = bool;
                        bool2 = bool2;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 1:
                        bool11 = bool11;
                        i = 2;
                        bool10 = bool10;
                        bool9 = (Boolean) x1kVarB.B(m0v0Var, 1, gpb.a, bool9);
                        bool = bool;
                        bool2 = bool2;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 2:
                        bool9 = bool9;
                        str3 = str3;
                        bool11 = bool11;
                        i = 4;
                        bool10 = (Boolean) x1kVarB.B(m0v0Var, 2, gpb.a, bool10);
                        bool = bool;
                        bool2 = bool2;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 3:
                        str3 = (String) x1kVarB.B(m0v0Var, 3, chc1.a, str3);
                        bool9 = bool9;
                        bool = bool;
                        bool11 = bool11;
                        bool2 = bool2;
                        i = 8;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 4:
                        bool9 = bool9;
                        bool12 = bool12;
                        i = 16;
                        bool11 = (Boolean) x1kVarB.B(m0v0Var, 4, gpb.a, bool11);
                        bool = bool;
                        bool2 = bool2;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 5:
                        i = 32;
                        bool12 = (Boolean) x1kVarB.B(m0v0Var, 5, gpb.a, bool12);
                        bool = bool;
                        bool2 = bool2;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 6:
                        i = 64;
                        bool13 = (Boolean) x1kVarB.B(m0v0Var, 6, gpb.a, bool13);
                        bool = bool;
                        bool2 = bool2;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 7:
                        bool14 = (Boolean) x1kVarB.B(m0v0Var, 7, gpb.a, bool14);
                        bool9 = bool9;
                        i = 128;
                        bool = bool;
                        bool2 = bool2;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 8:
                        i = 256;
                        bool = bool;
                        bool2 = (Boolean) x1kVarB.B(m0v0Var, 8, gpb.a, bool2);
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 9:
                        bool = (Boolean) x1kVarB.B(m0v0Var, 9, gpb.a, bool);
                        i = 512;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 10:
                        biometricProperties = (BiometricProperties) x1kVarB.B(m0v0Var, 10, BiometricProperties.cOm9.lpt2, biometricProperties);
                        i = 1024;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        bool4 = (Boolean) x1kVarB.B(m0v0Var, 11, gpb.a, bool4);
                        i = 2048;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case grn1.d /* 12 */:
                        str = (String) x1kVarB.B(m0v0Var, 12, chc1.a, str);
                        i = 4096;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 13:
                        bool6 = (Boolean) x1kVarB.B(m0v0Var, 13, gpb.a, bool6);
                        i = 8192;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 14:
                        bool7 = (Boolean) x1kVarB.B(m0v0Var, 14, gpb.a, bool7);
                        i = 16384;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 15:
                        f = (Float) x1kVarB.B(m0v0Var, 15, er20.a, f);
                        i = 32768;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 16:
                        num = (Integer) x1kVarB.B(m0v0Var, 16, wr80.a, num);
                        i = 65536;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 17:
                        f2 = (Float) x1kVarB.B(m0v0Var, 17, er20.a, f2);
                        i = 131072;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 18:
                        f3 = (Float) x1kVarB.B(m0v0Var, 18, er20.a, f3);
                        i = 262144;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case 19:
                        str2 = (String) x1kVarB.B(m0v0Var, 19, chc1.a, str2);
                        i = 524288;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                        bool5 = (Boolean) x1kVarB.B(m0v0Var, 20, gpb.a, bool5);
                        i = 1048576;
                        i2 |= i;
                        bool9 = bool9;
                        bool2 = bool2;
                        bool3 = bool14;
                        break;
                    default:
                        n9v.a(iP);
                        return null;
                }
            }
            Boolean bool15 = bool2;
            Boolean bool16 = bool3;
            Boolean bool17 = bool8;
            Boolean bool18 = bool9;
            Boolean bool19 = bool10;
            String str4 = str3;
            Boolean bool20 = bool11;
            Boolean bool21 = bool12;
            x1kVarB.a(m0v0Var);
            return new DeviceProperties(i2, bool17, bool18, bool19, str4, bool20, bool21, bool13, bool16, bool15, bool, biometricProperties, bool4, str, bool6, bool7, f, num, f2, f3, str2, bool5, (p661) null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, DeviceProperties deviceProperties) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            DeviceProperties.lpt2(deviceProperties, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
