package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import p.cyh0;
import p.h5j1;
import p.lh70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new cyh0((byte) 1);
    public final Object b;
    public lh70 c;
    public final Object a = new Object();
    public h5j1 d = null;

    public MediaSessionCompat$Token(Object obj, lh70 lh70Var, int i) {
        this.b = obj;
        this.c = lh70Var;
    }

    public final lh70 a() {
        lh70 lh70Var;
        synchronized (this.a) {
            lh70Var = this.c;
        }
        return lh70Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).b;
        Object obj3 = this.b;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.b, i);
    }
}
