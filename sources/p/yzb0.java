package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaConstants;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.RatingCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class yzb0 {
    public static final /* synthetic */ int a = 0;

    static {
        t380.w(MediaMetadataCompat.METADATA_KEY_TITLE, MediaMetadataCompat.METADATA_KEY_ARTIST, MediaMetadataCompat.METADATA_KEY_DURATION, MediaMetadataCompat.METADATA_KEY_ALBUM, MediaMetadataCompat.METADATA_KEY_AUTHOR, MediaMetadataCompat.METADATA_KEY_WRITER, new String[]{MediaMetadataCompat.METADATA_KEY_COMPOSER, MediaMetadataCompat.METADATA_KEY_COMPILATION, MediaMetadataCompat.METADATA_KEY_DATE, MediaMetadataCompat.METADATA_KEY_YEAR, MediaMetadataCompat.METADATA_KEY_GENRE, MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_ART, MediaMetadataCompat.METADATA_KEY_ART_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, MediaMetadataCompat.METADATA_KEY_USER_RATING, MediaMetadataCompat.METADATA_KEY_RATING, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_MEDIA_ID, MediaMetadataCompat.METADATA_KEY_MEDIA_URI, MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, "android.media.metadata.ADVERTISEMENT", MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"});
    }

    public static MediaBrowserCompat.MediaItem a(yoh0 yoh0Var, Bitmap bitmap) {
        MediaDescriptionCompat mediaDescriptionCompatE = e(yoh0Var, bitmap);
        tqh0 tqh0Var = yoh0Var.d;
        Boolean bool = tqh0Var.r;
        int i = (bool == null || !bool.booleanValue()) ? 0 : 1;
        Boolean bool2 = tqh0Var.s;
        if (bool2 != null && bool2.booleanValue()) {
            i |= 2;
        }
        return new MediaBrowserCompat.MediaItem(mediaDescriptionCompatE, i);
    }

    public static long b(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                hhg1.n(f4i1.c(i, "Unrecognized FolderType: "));
                return 0L;
        }
    }

    public static int c(int i) {
        if (i == -110) {
            return 8;
        }
        if (i == -109) {
            return 11;
        }
        if (i == -6) {
            return 2;
        }
        if (i == -2) {
            return 1;
        }
        if (i == 1) {
            return 10;
        }
        switch (i) {
            case -107:
                return 9;
            case -106:
                return 7;
            case -105:
                return 6;
            case -104:
                return 5;
            case -103:
                return 4;
            case -102:
                return 3;
            default:
                return 0;
        }
    }

    public static iph0 d(Context context, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(context.getClassLoader());
            int i = bundle.getInt(MediaConstants.BROWSER_ROOT_HINTS_KEY_ROOT_CHILDREN_SUPPORTED_FLAGS, -1);
            if (i >= 0) {
                bundle.remove(MediaConstants.BROWSER_ROOT_HINTS_KEY_ROOT_CHILDREN_SUPPORTED_FLAGS);
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                bundle.putBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", z);
            }
            Bundle bundle2 = Bundle.EMPTY;
            return new iph0(bundle, bundle.getBoolean(MediaBrowserServiceCompat.BrowserRoot.EXTRA_RECENT), bundle.getBoolean(MediaBrowserServiceCompat.BrowserRoot.EXTRA_OFFLINE), bundle.getBoolean(MediaBrowserServiceCompat.BrowserRoot.EXTRA_SUGGESTED));
        } catch (Exception unused) {
            Bundle bundle3 = Bundle.EMPTY;
            return new iph0(bundle, false, false, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static MediaDescriptionCompat e(yoh0 yoh0Var, Bitmap bitmap) {
        int i;
        CharSequence charSequence;
        MediaDescriptionCompat.Builder mediaId = new MediaDescriptionCompat.Builder().setMediaId(yoh0Var.a.equals("") ? null : yoh0Var.a);
        tqh0 tqh0Var = yoh0Var.d;
        if (bitmap != null) {
            mediaId.setIconBitmap(bitmap);
        }
        Bundle bundle = tqh0Var.K;
        CharSequence charSequence2 = tqh0Var.a;
        CharSequence charSequence3 = tqh0Var.g;
        CharSequence charSequence4 = tqh0Var.f;
        b380 b380Var = tqh0Var.L;
        Integer num = tqh0Var.J;
        Integer num2 = tqh0Var.q;
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        boolean z = (num2 == null || num2.intValue() == -1) ? false : true;
        boolean z2 = num != null;
        if (z || z2) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z) {
                num2.getClass();
                i = 0;
                bundle.putLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE, b(num2.intValue()));
            } else {
                i = 0;
            }
            if (z2) {
                num.getClass();
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
            }
        } else {
            i = 0;
        }
        if (!b380Var.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putStringArrayList(MediaConstants.DESCRIPTION_EXTRAS_KEY_CUSTOM_BROWSER_ACTION_ID_LIST, new ArrayList<>((Collection) b380Var));
        }
        CharSequence charSequence5 = tqh0Var.e;
        if (charSequence5 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence2);
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i2 = i;
            int i3 = i2;
            while (true) {
                int i4 = 2;
                if (i2 < 3) {
                    String[] strArr = MediaMetadataCompat.PREFERRED_DESCRIPTION_ORDER;
                    if (i3 < strArr.length) {
                        int i5 = i3 + 1;
                        String str = strArr[i3];
                        str.getClass();
                        switch (str.hashCode()) {
                            case -1853648227:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_ARTIST)) {
                                    i4 = -1;
                                } else {
                                    i4 = i;
                                }
                                break;
                            case -1850878751:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_AUTHOR)) {
                                    i4 = -1;
                                } else {
                                    i4 = 1;
                                }
                                break;
                            case -1224124471:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_WRITER)) {
                                    i4 = -1;
                                }
                                break;
                            case 194702059:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE)) {
                                    i4 = -1;
                                } else {
                                    i4 = 3;
                                }
                                break;
                            case 1058837545:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION)) {
                                    i4 = -1;
                                } else {
                                    i4 = 4;
                                }
                                break;
                            case 1684534006:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_COMPOSER)) {
                                    i4 = -1;
                                } else {
                                    i4 = 5;
                                }
                                break;
                            case 1879671865:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_ALBUM)) {
                                    i4 = -1;
                                } else {
                                    i4 = 6;
                                }
                                break;
                            case 1897146402:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_TITLE)) {
                                    i4 = -1;
                                } else {
                                    i4 = 7;
                                }
                                break;
                            case 1965214221:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST)) {
                                    i4 = -1;
                                } else {
                                    i4 = 8;
                                }
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                        switch (i4) {
                            case 0:
                                charSequence = tqh0Var.b;
                                break;
                            case 1:
                            default:
                                charSequence = null;
                                break;
                            case 2:
                                charSequence = tqh0Var.A;
                                break;
                            case 3:
                                charSequence = charSequence4;
                                break;
                            case 4:
                                charSequence = charSequence3;
                                break;
                            case 5:
                                charSequence = tqh0Var.B;
                                break;
                            case 6:
                                charSequence = tqh0Var.c;
                                break;
                            case 7:
                                charSequence = charSequence2;
                                break;
                            case 8:
                                charSequence = tqh0Var.d;
                                break;
                        }
                        if (!TextUtils.isEmpty(charSequence)) {
                            charSequenceArr[i2] = charSequence;
                            i2++;
                        }
                        i3 = i5;
                    }
                }
            }
            charSequence5 = charSequenceArr[i];
            charSequence4 = charSequenceArr[1];
            charSequence3 = charSequenceArr[2];
        }
        return mediaId.setTitle(charSequence5).setSubtitle(charSequence4).setDescription(charSequence3).setIconUri(tqh0Var.n).setMediaUri(yoh0Var.f.a).setExtras(bundle).build();
    }

    public static MediaMetadataCompat f(tqh0 tqh0Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        MediaMetadataCompat.Builder builderPutString = new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, str);
        CharSequence charSequence = tqh0Var.a;
        Bundle bundle = tqh0Var.K;
        Integer num = tqh0Var.q;
        Uri uri2 = tqh0Var.n;
        if (charSequence != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_TITLE, charSequence);
        }
        CharSequence charSequence2 = tqh0Var.e;
        if (charSequence2 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, charSequence2);
        }
        CharSequence charSequence3 = tqh0Var.f;
        if (charSequence3 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, charSequence3);
        }
        CharSequence charSequence4 = tqh0Var.g;
        if (charSequence4 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, charSequence4);
        }
        CharSequence charSequence5 = tqh0Var.b;
        if (charSequence5 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_ARTIST, charSequence5);
        }
        CharSequence charSequence6 = tqh0Var.c;
        if (charSequence6 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_ALBUM, charSequence6);
        }
        CharSequence charSequence7 = tqh0Var.d;
        if (charSequence7 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, charSequence7);
        }
        Integer num2 = tqh0Var.u;
        if (num2 != null) {
            builderPutString.putLong(MediaMetadataCompat.METADATA_KEY_YEAR, num2.intValue());
        }
        CharSequence charSequence8 = tqh0Var.A;
        if (charSequence8 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_WRITER, charSequence8);
        }
        CharSequence charSequence9 = tqh0Var.B;
        if (charSequence9 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_COMPOSER, charSequence9);
        }
        if (uri != null) {
            builderPutString.putString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, uri.toString());
        }
        if (uri2 != null) {
            builderPutString.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, uri2.toString());
            builderPutString.putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, uri2.toString());
            builderPutString.putString(MediaMetadataCompat.METADATA_KEY_ART_URI, uri2.toString());
        }
        if (bitmap != null) {
            builderPutString.putBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap);
            builderPutString.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        }
        if (num != null && num.intValue() != -1) {
            builderPutString.putLong(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, b(num.intValue()));
        }
        if (j == -9223372036854775807L && (l = tqh0Var.h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        builderPutString.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, j);
        RatingCompat ratingCompatH = h(tqh0Var.i);
        if (ratingCompatH != null) {
            builderPutString.putRating(MediaMetadataCompat.METADATA_KEY_USER_RATING, ratingCompatH);
        }
        RatingCompat ratingCompatH2 = h(tqh0Var.j);
        if (ratingCompatH2 != null) {
            builderPutString.putRating(MediaMetadataCompat.METADATA_KEY_RATING, ratingCompatH2);
        }
        Integer num3 = tqh0Var.J;
        if (num3 != null) {
            builderPutString.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num3.intValue());
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    builderPutString.putText(str2, (CharSequence) obj);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    builderPutString.putLong(str2, ((Number) obj).longValue());
                }
            }
        }
        return builderPutString.build();
    }

    public static esz0 g(RatingCompat ratingCompat) {
        if (ratingCompat == null) {
            return null;
        }
        switch (ratingCompat.getRatingStyle()) {
            case 1:
                return ratingCompat.isRated() ? new z560(ratingCompat.hasHeart()) : new z560();
            case 2:
                return ratingCompat.isRated() ? new rhe1(ratingCompat.isThumbUp()) : new rhe1();
            case 3:
                return ratingCompat.isRated() ? new rhb1(3, ratingCompat.getStarRating()) : new rhb1(3);
            case 4:
                return ratingCompat.isRated() ? new rhb1(4, ratingCompat.getStarRating()) : new rhb1(4);
            case 5:
                return ratingCompat.isRated() ? new rhb1(5, ratingCompat.getStarRating()) : new rhb1(5);
            case 6:
                return ratingCompat.isRated() ? new ljs0(ratingCompat.getPercentRating()) : new ljs0();
            default:
                return null;
        }
    }

    public static RatingCompat h(esz0 esz0Var) {
        if (esz0Var == null) {
            return null;
        }
        int iJ = j(esz0Var);
        if (!esz0Var.b()) {
            return RatingCompat.newUnratedRating(iJ);
        }
        switch (iJ) {
            case 1:
                return RatingCompat.newHeartRating(((z560) esz0Var).c);
            case 2:
                return RatingCompat.newThumbRating(((rhe1) esz0Var).c);
            case 3:
            case 4:
            case 5:
                return RatingCompat.newStarRating(iJ, ((rhb1) esz0Var).c);
            case 6:
                return RatingCompat.newPercentageRating(((ljs0) esz0Var).b);
            default:
                return null;
        }
    }

    public static void i(n8d0 n8d0Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                try {
                    n8d0Var.get(j, TimeUnit.MILLISECONDS);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } catch (InterruptedException unused) {
                    z = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= 3000) {
                        throw new TimeoutException();
                    }
                    j = 3000 - jElapsedRealtime2;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public static int j(esz0 esz0Var) {
        if (esz0Var instanceof z560) {
            return 1;
        }
        if (esz0Var instanceof rhe1) {
            return 2;
        }
        if (!(esz0Var instanceof rhb1)) {
            return esz0Var instanceof ljs0 ? 6 : 0;
        }
        int i = ((rhb1) esz0Var).b;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }
}
