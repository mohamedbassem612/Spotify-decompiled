package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sqh0 extends u9 {
    public static final ril e;
    public final List a;
    public final Bundle b;
    public int c;
    public static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<sqh0> CREATOR = new jrn1((byte) 4);

    static {
        ril rilVar = new ril();
        rilVar.a = new HashMap();
        rilVar.b = new HashMap();
        rilVar.c = new HashMap();
        rilVar.d(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        rilVar.d(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        rilVar.d(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        rilVar.d(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        rilVar.d(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        rilVar.d(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        rilVar.d(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        rilVar.d(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        rilVar.d(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        rilVar.d(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        rilVar.d(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        rilVar.d(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        rilVar.d(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        rilVar.d(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        rilVar.d(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        rilVar.d(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        rilVar.d(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        rilVar.d(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        rilVar.d(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        rilVar.d(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        rilVar.d(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        rilVar.d(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        rilVar.d(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        rilVar.d(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        rilVar.d(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        rilVar.d(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        rilVar.d(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        rilVar.d(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        e = rilVar;
    }

    public sqh0(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    public static boolean a0(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !a0((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final void F(JSONObject jSONObject) {
        Bundle bundle = this.b;
        bundle.clear();
        List list = this.a;
        list.clear();
        this.c = 0;
        try {
            this.c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            gbn1.a(list, jSONArrayOptJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.c;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && !"metadataType".equals(next)) {
                    ril rilVar = e;
                    String str = (String) rilVar.b.get(next);
                    if (str == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            bundle.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                Integer num = (Integer) rilVar.c.get(str);
                                int iIntValue = num != null ? num.intValue() : 0;
                                if (iIntValue != 1) {
                                    if (iIntValue != 2) {
                                        if (iIntValue == 3) {
                                            double dOptDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(dOptDouble)) {
                                                bundle.putDouble(str, dOptDouble);
                                            }
                                        } else if (iIntValue != 4) {
                                            if (iIntValue == 5) {
                                                long jOptLong = jSONObject.optLong(next);
                                                Pattern pattern = o4e.a;
                                                bundle.putLong(str, jOptLong * 1000);
                                            }
                                        } else if (obj2 instanceof String) {
                                            String str2 = (String) obj2;
                                            if (gbn1.b(str2) != null) {
                                                bundle.putString(str, str2);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        bundle.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    bundle.putString(str, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqh0)) {
            return false;
        }
        sqh0 sqh0Var = (sqh0) obj;
        return a0(this.b, sqh0Var.b) && this.a.equals(sqh0Var.a);
    }

    public final int hashCode() {
        int iHashCode = 17;
        Bundle bundle = this.b;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.a.hashCode() + (iHashCode * 31);
    }

    public final String j(String str) {
        if (TextUtils.isEmpty(str)) {
            hhg1.n("null and empty keys are not allowed");
            return null;
        }
        Integer num = (Integer) e.c.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 1 || iIntValue == 0) {
            return this.b.getString(str);
        }
        String str2 = d[1];
        hhg1.n(rjx.o(new StringBuilder(str.length() + 21 + String.valueOf(str2).length()), "Value for ", str, " must be a ", str2));
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.J(parcel, 2, this.a);
        j541.u(parcel, 3, this.b);
        int i2 = this.c;
        j541.K(parcel, 4, 4);
        parcel.writeInt(i2);
        j541.M(iL, parcel);
    }

    public sqh0(ArrayList arrayList, Bundle bundle, int i) {
        this.a = arrayList;
        this.b = bundle;
        this.c = i;
    }
}
