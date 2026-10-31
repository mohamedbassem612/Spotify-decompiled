package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rgj0 {
    public final MessageResponseToken a;
    public final String b;
    public final List c;
    public final myo1 d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public rgj0(MessageResponseToken messageResponseToken, String str, List list, myo1 myo1Var, int i, boolean z, boolean z2) {
        this.a = messageResponseToken;
        this.b = str;
        this.c = list;
        this.d = myo1Var;
        this.e = i;
        this.f = z;
        this.g = z2;
    }

    public static rgj0 a(rgj0 rgj0Var, MessageResponseToken messageResponseToken, String str, List list, myo1 myo1Var, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            messageResponseToken = rgj0Var.a;
        }
        MessageResponseToken messageResponseToken2 = messageResponseToken;
        if ((i2 & 2) != 0) {
            str = rgj0Var.b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            list = rgj0Var.c;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            myo1Var = rgj0Var.d;
        }
        myo1 myo1Var2 = myo1Var;
        if ((i2 & 16) != 0) {
            i = rgj0Var.e;
        }
        int i3 = i;
        boolean z2 = (i2 & 32) != 0 ? rgj0Var.f : false;
        if ((i2 & 64) != 0) {
            z = rgj0Var.g;
        }
        return new rgj0(messageResponseToken2, str2, list2, myo1Var2, i3, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgj0)) {
            return false;
        }
        rgj0 rgj0Var = (rgj0) obj;
        return u890.j(this.a, rgj0Var.a) && u890.j(this.b, rgj0Var.b) && u890.j(this.c, rgj0Var.c) && u890.j(this.d, rgj0Var.d) && this.e == rgj0Var.e && this.f == rgj0Var.f && this.g == rgj0Var.g;
    }

    public final int hashCode() {
        MessageResponseToken messageResponseToken = this.a;
        int iHashCode = (messageResponseToken == null ? 0 : messageResponseToken.hashCode()) * 31;
        String str = this.b;
        return Boolean.hashCode(this.g) + xcg1.g(kaa0.f(this.e, (this.d.hashCode() + f4i1.b((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.c)) * 31, 31), 31, this.f);
    }
}
