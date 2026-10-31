package androidx.media3.session.legacy;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p.f4i1;
import p.hhg1;
import p.oon1;
import p.y36;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    static final y36 METADATA_KEYS_TYPE;
    public static final String METADATA_KEY_ADVERTISEMENT = "android.media.metadata.ADVERTISEMENT";
    public static final String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
    public static final String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
    public static final String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
    public static final String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
    public static final String METADATA_KEY_ART = "android.media.metadata.ART";
    public static final String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
    public static final String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
    public static final String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
    public static final String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
    public static final String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
    public static final String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
    public static final String METADATA_KEY_DATE = "android.media.metadata.DATE";
    public static final String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
    public static final String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
    public static final String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
    public static final String METADATA_KEY_DOWNLOAD_STATUS = "android.media.metadata.DOWNLOAD_STATUS";
    public static final String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
    public static final String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
    public static final String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
    public static final String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
    public static final String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
    public static final String METADATA_KEY_RATING = "android.media.metadata.RATING";
    public static final String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
    public static final String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
    public static final String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    public static final String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
    public static final String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
    static final int METADATA_TYPE_BITMAP = 2;
    static final int METADATA_TYPE_LONG = 0;
    static final int METADATA_TYPE_RATING = 3;
    static final int METADATA_TYPE_TEXT = 1;
    public static final String[] PREFERRED_DESCRIPTION_ORDER;
    private static final String TAG = "MediaMetadata";
    private final Bundle bundle;
    private byte[] compressedArtworkData;
    private MediaMetadata metadataFwk;

    public static final class Builder {
        private final Bundle bundle = new Bundle();

        public MediaMetadataCompat build() {
            return new MediaMetadataCompat(this.bundle);
        }

        public Builder putBitmap(String str, Bitmap bitmap) {
            Integer num = (Integer) MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num == null || num.intValue() == 2) {
                this.bundle.putParcelable(str, bitmap);
                return this;
            }
            hhg1.n(f4i1.f("The ", str, " key cannot be used to put a Bitmap"));
            return null;
        }

        public Builder putLong(String str, long j) {
            Integer num = (Integer) MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num == null || num.intValue() == 0) {
                this.bundle.putLong(str, j);
                return this;
            }
            hhg1.n(f4i1.f("The ", str, " key cannot be used to put a long"));
            return null;
        }

        public Builder putRating(String str, RatingCompat ratingCompat) {
            Integer num = (Integer) MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num == null || num.intValue() == 3) {
                this.bundle.putParcelable(str, (Parcelable) ratingCompat.getRating());
                return this;
            }
            hhg1.n(f4i1.f("The ", str, " key cannot be used to put a Rating"));
            return null;
        }

        public Builder putString(String str, String str2) {
            Integer num = (Integer) MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num == null || num.intValue() == 1) {
                this.bundle.putCharSequence(str, str2);
                return this;
            }
            hhg1.n(f4i1.f("The ", str, " key cannot be used to put a String"));
            return null;
        }

        public Builder putText(String str, CharSequence charSequence) {
            Integer num = (Integer) MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num == null || num.intValue() == 1) {
                this.bundle.putCharSequence(str, charSequence);
                return this;
            }
            hhg1.n(f4i1.f("The ", str, " key cannot be used to put a CharSequence"));
            return null;
        }
    }

    static {
        y36 y36Var = new y36(0);
        METADATA_KEYS_TYPE = y36Var;
        y36Var.put(METADATA_KEY_TITLE, 1);
        y36Var.put(METADATA_KEY_ARTIST, 1);
        y36Var.put(METADATA_KEY_DURATION, 0);
        y36Var.put(METADATA_KEY_ALBUM, 1);
        y36Var.put(METADATA_KEY_AUTHOR, 1);
        y36Var.put(METADATA_KEY_WRITER, 1);
        y36Var.put(METADATA_KEY_COMPOSER, 1);
        y36Var.put(METADATA_KEY_COMPILATION, 1);
        y36Var.put(METADATA_KEY_DATE, 1);
        y36Var.put(METADATA_KEY_YEAR, 0);
        y36Var.put(METADATA_KEY_GENRE, 1);
        y36Var.put(METADATA_KEY_TRACK_NUMBER, 0);
        y36Var.put(METADATA_KEY_NUM_TRACKS, 0);
        y36Var.put(METADATA_KEY_DISC_NUMBER, 0);
        y36Var.put(METADATA_KEY_ALBUM_ARTIST, 1);
        y36Var.put(METADATA_KEY_ART, 2);
        y36Var.put(METADATA_KEY_ART_URI, 1);
        y36Var.put(METADATA_KEY_ALBUM_ART, 2);
        y36Var.put(METADATA_KEY_ALBUM_ART_URI, 1);
        y36Var.put(METADATA_KEY_USER_RATING, 3);
        y36Var.put(METADATA_KEY_RATING, 3);
        y36Var.put(METADATA_KEY_DISPLAY_TITLE, 1);
        y36Var.put(METADATA_KEY_DISPLAY_SUBTITLE, 1);
        y36Var.put(METADATA_KEY_DISPLAY_DESCRIPTION, 1);
        y36Var.put(METADATA_KEY_DISPLAY_ICON, 2);
        y36Var.put(METADATA_KEY_DISPLAY_ICON_URI, 1);
        y36Var.put(METADATA_KEY_MEDIA_ID, 1);
        y36Var.put(METADATA_KEY_BT_FOLDER_TYPE, 0);
        y36Var.put(METADATA_KEY_MEDIA_URI, 1);
        y36Var.put("android.media.metadata.ADVERTISEMENT", 0);
        y36Var.put(METADATA_KEY_DOWNLOAD_STATUS, 0);
        PREFERRED_DESCRIPTION_ORDER = new String[]{METADATA_KEY_TITLE, METADATA_KEY_ARTIST, METADATA_KEY_ALBUM, METADATA_KEY_ALBUM_ARTIST, METADATA_KEY_WRITER, METADATA_KEY_AUTHOR, METADATA_KEY_COMPOSER, METADATA_KEY_DISPLAY_SUBTITLE, METADATA_KEY_DISPLAY_DESCRIPTION};
        CREATOR = new Parcelable.Creator<MediaMetadataCompat>() { // from class: androidx.media3.session.legacy.MediaMetadataCompat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaMetadataCompat createFromParcel(Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaMetadataCompat[] newArray(int i) {
                return new MediaMetadataCompat[i];
            }
        };
    }

    public MediaMetadataCompat(Parcel parcel) {
        Bundle bundle = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        bundle.getClass();
        this.bundle = bundle;
    }

    public static MediaMetadataCompat fromMediaMetadata(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.metadataFwk = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    private Bitmap getBitmap(String str) {
        try {
            return (Bitmap) this.bundle.getParcelable(str);
        } catch (Exception e) {
            oon1.I("Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    private Bitmap getFirstBitmap(String... strArr) {
        for (String str : strArr) {
            if (containsKey(str)) {
                return getBitmap(str);
            }
        }
        return null;
    }

    private String getFirstString(String... strArr) {
        for (String str : strArr) {
            if (containsKey(str)) {
                return getString(str);
            }
        }
        return null;
    }

    private Bitmap getMostRelevantArtworkBitmap() {
        return getFirstBitmap(METADATA_KEY_DISPLAY_ICON, METADATA_KEY_ALBUM_ART, METADATA_KEY_ART);
    }

    public boolean containsKey(String str) {
        return this.bundle.containsKey(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBundle() {
        return new Bundle(this.bundle);
    }

    public long getLong(String str) {
        return this.bundle.getLong(str, 0L);
    }

    public MediaMetadata getMediaMetadata() {
        MediaMetadata mediaMetadata = this.metadataFwk;
        if (mediaMetadata != null) {
            return mediaMetadata;
        }
        MediaMetadata.Builder builder = new MediaMetadata.Builder();
        try {
            for (String str : this.bundle.keySet()) {
                Integer num = (Integer) METADATA_KEYS_TYPE.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, this.bundle.getLong(str));
                } else if (iIntValue != 1) {
                    Bundle bundle = this.bundle;
                    if (iIntValue == 2) {
                        builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                    } else if (iIntValue != 3) {
                        Object obj = bundle.get(str);
                        if (obj == null || (obj instanceof CharSequence)) {
                            builder.putText(str, (CharSequence) obj);
                        } else if (obj instanceof Long) {
                            builder.putLong(str, ((Long) obj).longValue());
                        }
                    } else {
                        builder.putRating(str, (Rating) bundle.getParcelable(str));
                    }
                } else {
                    builder.putText(str, this.bundle.getCharSequence(str));
                }
            }
        } catch (RuntimeException e) {
            oon1.I("Failed to convert MediaMetadataCompat to MediaMetadata", e);
        }
        MediaMetadata mediaMetadataBuild = builder.build();
        this.metadataFwk = mediaMetadataBuild;
        return mediaMetadataBuild;
    }

    public byte[] getMostRelevantArtworkBitmapData() {
        Bitmap mostRelevantArtworkBitmap = getMostRelevantArtworkBitmap();
        if (mostRelevantArtworkBitmap == null) {
            return null;
        }
        if (this.compressedArtworkData == null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    mostRelevantArtworkBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    this.compressedArtworkData = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                oon1.I("Failed to compress MediaMetadataCompat artwork", e);
            }
        }
        return this.compressedArtworkData;
    }

    public Uri getMostRelevantArtworkUri() {
        String firstString = getFirstString(METADATA_KEY_DISPLAY_ICON_URI, METADATA_KEY_ALBUM_ART_URI, METADATA_KEY_ART_URI);
        if (firstString != null) {
            return Uri.parse(firstString);
        }
        return null;
    }

    public RatingCompat getRating(String str) {
        try {
            return RatingCompat.fromRating(this.bundle.getParcelable(str));
        } catch (Exception e) {
            oon1.I("Failed to retrieve a key as Rating.", e);
            return null;
        }
    }

    public String getString(String str) {
        CharSequence charSequence = this.bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence getText(String str) {
        return this.bundle.getCharSequence(str);
    }

    public void preserveArtworkBitmapData(MediaMetadataCompat mediaMetadataCompat) {
        Bitmap mostRelevantArtworkBitmap;
        Bitmap mostRelevantArtworkBitmap2;
        if (mediaMetadataCompat.compressedArtworkData == null || (mostRelevantArtworkBitmap = getMostRelevantArtworkBitmap()) == null || (mostRelevantArtworkBitmap2 = mediaMetadataCompat.getMostRelevantArtworkBitmap()) == null || !mostRelevantArtworkBitmap.sameAs(mostRelevantArtworkBitmap2)) {
            return;
        }
        this.compressedArtworkData = mediaMetadataCompat.compressedArtworkData;
    }

    public int size() {
        return this.bundle.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.bundle);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.bundle = bundle2;
        MediaSessionCompat.ensureClassLoader(bundle2);
    }
}
