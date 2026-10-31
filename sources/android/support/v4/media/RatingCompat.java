package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import p.erz0;
import p.nsz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new erz0((byte) 3);
    public final int a;
    public final float b;

    public RatingCompat(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static RatingCompat a(Rating rating) {
        float f;
        RatingCompat ratingCompat = null;
        if (rating != null) {
            int iB = nsz0.b(rating);
            if (nsz0.e(rating)) {
                switch (iB) {
                    case 1:
                        ratingCompat = new RatingCompat(1, nsz0.d(rating) ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, nsz0.f(rating) ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fC = nsz0.c(rating);
                        if (iB == 3) {
                            f = 3.0f;
                        } else if (iB == 4) {
                            f = 4.0f;
                        } else if (iB == 5) {
                            f = 5.0f;
                        }
                        if (fC >= 0.0f && fC <= f) {
                            ratingCompat = new RatingCompat(iB, fC);
                        }
                        break;
                    case 6:
                        float fA = nsz0.a(rating);
                        if (fA >= 0.0f && fA <= 100.0f) {
                            ratingCompat = new RatingCompat(6, fA);
                        }
                        break;
                }
            } else {
                switch (iB) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(iB, -1.0f);
                        break;
                }
            }
            ratingCompat.getClass();
        }
        return ratingCompat;
    }

    public final boolean b() {
        return this.b >= 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final boolean g() {
        return this.a == 2 && this.b == 1.0f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
