package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a4c implements Parcelable {
    public static final Parcelable.Creator CREATOR = new yyb((byte) 2);
    public final long X;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final gyl f;
    public final int g;
    public final ArrayList h;
    public final long i;
    public final int t;

    public a4c(Parcel parcel) {
        this.f = new gyl();
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.g = 1;
        this.t = 1;
        this.i = 0L;
        this.X = System.currentTimeMillis();
        this.X = parcel.readLong();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.i = parcel.readLong();
        this.g = l1d.H(2)[parcel.readInt()];
        ArrayList arrayList2 = (ArrayList) parcel.readSerializable();
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        this.f = parcel.readParcelable(gyl.class.getClassLoader());
        this.t = l1d.H(2)[parcel.readInt()];
    }

    public final JSONObject a() {
        String str = this.e;
        String str2 = this.d;
        ArrayList arrayList = this.h;
        String str3 = this.b;
        String str4 = this.a;
        String str5 = this.c;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectA = this.f.a();
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectA.get(next));
            }
            if (!TextUtils.isEmpty(str5)) {
                f4t f4tVar = f4t.b;
                jSONObject.put("$og_title", str5);
            }
            if (!TextUtils.isEmpty(str4)) {
                f4t f4tVar2 = f4t.b;
                jSONObject.put("$canonical_identifier", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                f4t f4tVar3 = f4t.b;
                jSONObject.put("$canonical_url", str3);
            }
            if (arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                f4t f4tVar4 = f4t.b;
                jSONObject.put("$keywords", jSONArray);
            }
            if (!TextUtils.isEmpty(str2)) {
                f4t f4tVar5 = f4t.b;
                jSONObject.put("$og_description", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                f4t f4tVar6 = f4t.b;
                jSONObject.put("$og_image_url", str);
            }
            long j = this.i;
            if (j > 0) {
                f4t f4tVar7 = f4t.b;
                jSONObject.put("$exp_date", j);
            }
            f4t f4tVar8 = f4t.b;
            jSONObject.put("$publicly_indexable", this.g == 1);
            jSONObject.put("$locally_indexable", this.t == 1);
            jSONObject.put("$creation_timestamp", this.X);
            return jSONObject;
        } catch (JSONException e) {
            i1k0.m(e.getMessage());
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.X);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.i);
        parcel.writeInt(l1d.C(this.g));
        parcel.writeSerializable(this.h);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(l1d.C(this.t));
    }
}
