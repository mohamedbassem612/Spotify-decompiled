package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gd70 implements y570, Parcelable {
    public final fd70 a;
    public final idd1 b = new idd1(new g050(this, (byte) 28));
    public static final gd70 c = cyo1.m((w570) null, (j670) null, (x570) null, (HubsImmutableComponentBundle) null, (HubsImmutableComponentBundle) null, (HubsImmutableComponentBundle) null, (me70) null, (String) null, (String) null, (Map) null, (List) null);
    public static final Parcelable.Creator<gd70> CREATOR = new ij60((byte) 20);

    public gd70(ad70 ad70Var, id70 id70Var, dd70 dd70Var, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, od70 od70Var, String str, String str2, j380 j380Var, b380 b380Var) {
        this.a = new fd70(this, ad70Var, id70Var, dd70Var, hubsImmutableComponentBundle, hubsImmutableComponentBundle2, hubsImmutableComponentBundle3, od70Var, str, str2, j380Var, b380Var);
    }

    public final String a() {
        return this.a.i;
    }

    public final HubsImmutableComponentBundle b() {
        return this.a.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd70)) {
            return false;
        }
        return this.a.equals(((gd70) obj).a);
    }

    public final HubsImmutableComponentBundle g() {
        return this.a.g;
    }

    public final String group() {
        return this.a.j;
    }

    public final w570 h() {
        return this.a.b;
    }

    public final int hashCode() {
        return ((Number) this.b.getValue()).intValue();
    }

    public final Map j() {
        return this.a.k;
    }

    public final x570 k() {
        return this.a.d;
    }

    public final ArrayList l() {
        b380 b380Var = this.a.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : b380Var) {
            if (u890.j(((gd70) obj).a.j, "primary_buttons")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final j670 n() {
        return this.a.c;
    }

    public final HubsImmutableComponentBundle r() {
        return this.a.f;
    }

    public final List s() {
        return this.a.l;
    }

    public final me70 t() {
        return this.a.h;
    }

    public final fd70 toBuilder() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fd70 fd70Var = this.a;
        HubsImmutableComponentBundle hubsImmutableComponentBundle = fd70Var.g;
        HubsImmutableComponentBundle hubsImmutableComponentBundle2 = fd70Var.f;
        HubsImmutableComponentBundle hubsImmutableComponentBundle3 = fd70Var.e;
        dd70 dd70Var = fd70Var.d;
        id70 id70Var = fd70Var.c;
        ad70 ad70Var = fd70Var.b;
        if (ad70Var == null ? true : u890.j(ad70Var, ad70.d)) {
            ad70Var = null;
        }
        parcel.writeTypedObject(ad70Var, i);
        if (id70Var == null ? true : u890.j(id70Var, id70.c)) {
            id70Var = null;
        }
        parcel.writeTypedObject(id70Var, i);
        if (dd70Var != null ? u890.j(dd70Var, dd70.c) : true) {
            dd70Var = null;
        }
        parcel.writeTypedObject(dd70Var, i);
        if (zxo1.z(hubsImmutableComponentBundle3, (HubsImmutableComponentBundle) null)) {
            hubsImmutableComponentBundle3 = null;
        }
        parcel.writeTypedObject(hubsImmutableComponentBundle3, i);
        if (zxo1.z(hubsImmutableComponentBundle2, (HubsImmutableComponentBundle) null)) {
            hubsImmutableComponentBundle2 = null;
        }
        parcel.writeTypedObject(hubsImmutableComponentBundle2, i);
        if (zxo1.z(hubsImmutableComponentBundle, (HubsImmutableComponentBundle) null)) {
            hubsImmutableComponentBundle = null;
        }
        parcel.writeTypedObject(hubsImmutableComponentBundle, i);
        parcel.writeTypedObject(fd70Var.h, i);
        parcel.writeString(fd70Var.i);
        parcel.writeString(fd70Var.j);
        gho1.t(parcel, fd70Var.k);
        b380 b380Var = fd70Var.l;
        parcel.writeInt(b380Var.size());
        parcel.writeTypedList(b380Var);
    }
}
