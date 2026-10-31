package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lf10 implements Parcelable {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final Object g;
    public final String h;
    public final FacebookException i;
    public static final q3c t = new q3c();
    public static final Parcelable.Creator<lf10> CREATOR = new qn00((byte) 20);

    /* JADX WARN: Code duplicated, block: B:7:0x003a  */
    public lf10(int i, int i2, int i3, String str, String str2, String str3, String str4, Object obj, FacebookException facebookException, boolean z) {
        Set set;
        Set set2;
        Set set3;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str3;
        this.f = str4;
        this.g = obj;
        this.h = str2;
        q3c q3cVar = t;
        int i4 = 2;
        if (facebookException != null) {
            this.i = facebookException;
        } else {
            this.i = new FacebookServiceException(this, a());
            uo5 uo5VarA = q3cVar.A();
            Map map = (Map) uo5VarA.c;
            Map map2 = (Map) uo5VarA.d;
            Map map3 = (Map) uo5VarA.b;
            if (z) {
                i4 = 3;
            } else if (map3 == null || !map3.containsKey(Integer.valueOf(i2)) || ((set3 = (Set) map3.get(Integer.valueOf(i2))) != null && !set3.contains(Integer.valueOf(i3)))) {
                if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = (Set) map2.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) {
                    i4 = 1;
                } else if (map != null && map.containsKey(Integer.valueOf(i2)) && ((set = (Set) map.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) {
                    i4 = 3;
                }
            }
        }
        q3cVar.A();
        int i5 = mf10.a[l1d.C(i4)];
    }

    public final String a() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.i;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "{HttpStatus: " + this.a + ", errorCode: " + this.b + ", subErrorCode: " + this.c + ", errorType: " + this.d + ", errorMessage: " + a() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(a());
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public lf10(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public lf10(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, false);
    }
}
