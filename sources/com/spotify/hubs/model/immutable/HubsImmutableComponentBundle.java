package com.spotify.hubs.model.immutable;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import p.ij60;
import p.iu30;
import p.lqc;
import p.u890;
import p.uc70;
import p.wc70;
import p.xc70;
import p.yc70;
import p.zc70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0014¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/spotify/hubs/model/immutable/HubsImmutableComponentBundle;", "Landroid/os/Parcelable;", "<init>", "()V", "p/yxo1", "p/uc70", "p/lqc", "src_main_java_com_spotify_hubs_model-model"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public class HubsImmutableComponentBundle implements Parcelable {
    public static final Parcelable.Creator<HubsImmutableComponentBundle> CREATOR;
    public static final HubsImmutableComponentBundle b;
    public final uc70 a;

    static {
        new lqc((byte) 12);
        b = lqc.u();
        CREATOR = new ij60((byte) 17);
    }

    public HubsImmutableComponentBundle(Bundle bundle) {
        this.a = new uc70(this, bundle);
    }

    public final String B(String str) {
        return (String) l(String.class, str);
    }

    public final String F(String str, String str2) {
        String str3 = (String) l(String.class, str);
        return str3 == null ? str2 : str3;
    }

    public final String[] H(String str) {
        return (String[]) l(String[].class, str);
    }

    public final Boolean a(String str) {
        return (Boolean) l(Boolean.class, str);
    }

    public final boolean b(String str, boolean z) {
        Boolean bool = (Boolean) l(Boolean.class, str);
        return bool != null ? bool.booleanValue() : z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HubsImmutableComponentBundle)) {
            return false;
        }
        Bundle bundleM = this.a.M();
        Bundle bundleM2 = ((HubsImmutableComponentBundle) obj).a.M();
        if (!u890.j(bundleM.keySet(), bundleM2.keySet())) {
            return false;
        }
        for (String str : bundleM.keySet()) {
            Object obj2 = bundleM.get(str);
            if (obj2 == null) {
                if (bundleM2.get(str) != null) {
                    return false;
                }
            } else if (obj2.getClass().isArray()) {
                if (!lqc.p(obj2, bundleM2.get(str))) {
                    return false;
                }
            } else if (!obj2.equals(bundleM2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final HubsImmutableComponentBundle g(String str) {
        return (HubsImmutableComponentBundle) l(HubsImmutableComponentBundle.class, str);
    }

    public final HubsImmutableComponentBundle[] h(String str) {
        return (HubsImmutableComponentBundle[]) l(HubsImmutableComponentBundle[].class, str);
    }

    public final int hashCode() {
        int iQ;
        Iterator it = s().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object objJ = j((String) it.next());
            if (objJ == null) {
                iQ = 0;
            } else {
                iQ = objJ.getClass().isArray() ? lqc.q(objJ) : objJ.hashCode();
            }
            i = (i * 31) + iQ;
        }
        return i;
    }

    public final Object j(String str) {
        return this.a.M().get(str);
    }

    public final Number k(String str, iu30 iu30Var) {
        Number number = (Number) l(Number.class, str);
        if (number != null) {
            return (Number) iu30Var.invoke(number);
        }
        return null;
    }

    public final Object l(Class cls, String str) {
        Object obj = this.a.M().get(str);
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    public final int n(int i, String str) {
        Integer num = (Integer) k(str, wc70.a);
        return num != null ? num.intValue() : i;
    }

    public final Integer r(String str) {
        return (Integer) k(str, xc70.a);
    }

    public final Set s() {
        return this.a.M().keySet();
    }

    public final long t(long j, String str) {
        Long l = (Long) k(str, yc70.a);
        return l != null ? l.longValue() : j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a.M());
    }

    public final Long x(String str) {
        return (Long) k(str, zc70.a);
    }

    public HubsImmutableComponentBundle() {
        this(new Bundle());
    }
}
