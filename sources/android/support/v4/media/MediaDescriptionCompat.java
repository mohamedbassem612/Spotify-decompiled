package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p.bmh0;
import p.cmh0;
import p.eyh0;
import p.hug0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new hug0((byte) 18);
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final Bitmap e;
    public final Uri f;
    public final Bundle g;
    public final Uri h;
    public MediaDescription i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.g = bundle;
        this.h = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strG = bmh0.g(mediaDescription);
        CharSequence charSequenceI = bmh0.i(mediaDescription);
        CharSequence charSequenceH = bmh0.h(mediaDescription);
        CharSequence charSequenceC = bmh0.c(mediaDescription);
        Bitmap bitmapE = bmh0.e(mediaDescription);
        Uri uriF = bmh0.f(mediaDescription);
        Bundle bundleD = bmh0.d(mediaDescription);
        if (bundleD != null) {
            eyh0.b(bundleD);
            try {
                bundleD.isEmpty();
            } catch (BadParcelableException unused) {
                bundleD = null;
            }
        }
        Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable(androidx.media3.session.legacy.MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI) : null;
        if (uriA == null) {
            bundle = bundleD;
        } else if (bundleD.containsKey(androidx.media3.session.legacy.MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG) && bundleD.size() == 2) {
            bundle = null;
        } else {
            bundleD.remove(androidx.media3.session.legacy.MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI);
            bundleD.remove(androidx.media3.session.legacy.MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
            bundle = bundleD;
        }
        if (uriA == null) {
            uriA = cmh0.a(mediaDescription);
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
        mediaDescriptionCompat.i = mediaDescription;
        return mediaDescriptionCompat;
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = bmh0.b();
        bmh0.n(builderB, this.a);
        bmh0.p(builderB, this.b);
        bmh0.o(builderB, this.c);
        bmh0.j(builderB, this.d);
        bmh0.l(builderB, this.e);
        bmh0.m(builderB, this.f);
        bmh0.k(builderB, this.g);
        cmh0.b(builderB, this.h);
        MediaDescription mediaDescriptionA = bmh0.a(builderB);
        this.i = mediaDescriptionA;
        return mediaDescriptionA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b().writeToParcel(parcel, i);
    }
}
